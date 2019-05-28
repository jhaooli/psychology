package com.recommender;


import com.model.ArticleSimilarity;
import com.pojo.Article;
import com.service.ArticleService;
import com.service.Impl.ArticleServiceImpl;
import org.apache.mahout.cf.taste.common.Refreshable;
import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.common.FastIDSet;
import org.apache.mahout.cf.taste.impl.recommender.CachingRecommender;
import org.apache.mahout.cf.taste.impl.recommender.GenericItemBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.GenericItemSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.IDRescorer;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.recommender.Rescorer;
import org.apache.mahout.cf.taste.similarity.ItemSimilarity;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class ItemBasedRecommender implements Recommender {

		  private final Recommender recommender;


		  private ArticleService articleService = new ArticleServiceImpl();



		  public ItemBasedRecommender() throws IOException, TasteException {
			  this(new ArticleDataModel());
		  }


		  public ItemBasedRecommender(DataModel dataModel) throws TasteException {
			  Collection<GenericItemSimilarity.ItemItemSimilarity> correlations = articleService.listAllArticleSimilarity();
			  ItemSimilarity itemSimilarity = new GenericItemSimilarity(correlations);
			  recommender = new CachingRecommender(new EmbededItemBasedRecommender(new GenericItemBasedRecommender(dataModel, itemSimilarity)));
		  }


		  @Override
		  public List<RecommendedItem> recommend(long userID, int howMany) throws TasteException {
			  return recommender.recommend(userID, howMany);
		  }

	@Override
	public List<RecommendedItem> recommend(long l, int i, IDRescorer idRescorer) throws TasteException {
		return null;
	}


	public List<RecommendedItem> recommend(long userID, int howMany, Rescorer<Long> rescorer)
		          throws TasteException {
		    return recommender.recommend(userID, howMany, (IDRescorer) rescorer);
		  }

		  @Override
		  public float estimatePreference(long userID, long itemID) throws TasteException {
		    return recommender.estimatePreference(userID, itemID);
		  }

		  @Override
		  public void setPreference(long userID, long itemID, float value) throws TasteException {
		    recommender.setPreference(userID, itemID, value);
		  }

	      @Override
		  public void removePreference(long userID, long itemID) throws TasteException {
		    recommender.removePreference(userID, itemID);
		  }

	      @Override
		  public DataModel getDataModel() {
		    return recommender.getDataModel();
		  }

	      @Override
		  public void refresh(Collection<Refreshable> alreadyRefreshed) {
		    recommender.refresh(alreadyRefreshed);
		  }

	      @Override
		  public String toString() {
		    return "ArticleRecommender[recommender:" + recommender + ']';
		  }


		  private static final class EmbededItemBasedRecommender implements Recommender {

			    private final GenericItemBasedRecommender recommender;

			    private EmbededItemBasedRecommender(GenericItemBasedRecommender recommender) {
			      this.recommender = recommender;
			    }

			    @Override
				public float estimatePreference(long userID, long itemID)
						throws TasteException {
					return recommender.estimatePreference(userID, itemID);
				}

				@Override
				public DataModel getDataModel() {
					return recommender.getDataModel();
				}

				@Override
				public List<RecommendedItem> recommend(long userID, int howMany)
						throws TasteException {
					return this.recommends(userID, howMany, null);
				}

			  @Override
			  public List<RecommendedItem> recommend(long l, int i, IDRescorer idRescorer) throws TasteException {
				  return null;
			  }


			  public List<RecommendedItem> recommends(long userID,
                                                       int howMany, Rescorer<Long> rescorer)
						throws TasteException {
					FastIDSet itemIDs = recommender.getDataModel().getItemIDsFromUser(userID);
					return recommender.mostSimilarItems(itemIDs.toArray(), howMany, null);
				}

				public void removePreference(long userID, long itemID)
						throws TasteException {
					recommender.removePreference(userID, itemID);
					
				}

				public void setPreference(long userID, long itemID, float value)
						throws TasteException {
					recommender.setPreference(userID, itemID, value);
					
				}

				public void refresh(Collection<Refreshable> alreadyRefreshed) {
					recommender.refresh(alreadyRefreshed);
				}
			  }	  
}
