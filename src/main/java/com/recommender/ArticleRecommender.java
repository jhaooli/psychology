package com.recommender;

import org.apache.mahout.cf.taste.common.Refreshable;
import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.recommender.CachingRecommender;
import org.apache.mahout.cf.taste.impl.recommender.slopeone.SlopeOneRecommender;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.IDRescorer;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.recommender.Rescorer;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

/**
 * A simple {@link Recommender} implemented for the GroupLens demo.
 */
@Component
public final class ArticleRecommender implements Recommender {

  private final Recommender recommender;


  public ArticleRecommender() throws IOException, TasteException {
	  this(new ArticleDataModel());
  }


  public ArticleRecommender(DataModel dataModel) throws TasteException {
	  
    recommender = new CachingRecommender(new SlopeOneRecommender(dataModel));
  }

  @Override
  public List<RecommendedItem> recommend(long userID, int howMany) throws TasteException {
    return recommender.recommend(userID, howMany);
  }

  @Override
  public List<RecommendedItem> recommend(long l, int i, IDRescorer idRescorer) throws TasteException {
    return recommender.recommend(l, i, idRescorer);
  }


  /*
  public List<RecommendedItem> recommend(long userID, int howMany, Rescorer<Long> rescorer)
          throws TasteException {
    return recommender.recommend(userID, howMany, rescorer);
  }
*/
  
  public float estimatePreference(long userID, long itemID) throws TasteException {
    return recommender.estimatePreference(userID, itemID);
  }

  
  public void setPreference(long userID, long itemID, float value) throws TasteException {
    recommender.setPreference(userID, itemID, value);
  }

  
  public void removePreference(long userID, long itemID) throws TasteException {
    recommender.removePreference(userID, itemID);
  }

  
  public DataModel getDataModel() {
    return recommender.getDataModel();
  }

  
  public void refresh(Collection<Refreshable> alreadyRefreshed) {
    recommender.refresh(alreadyRefreshed);
  }

  
  public String toString() {
    return "ArticleRecommender[recommender:" + recommender + ']';
  }

}
