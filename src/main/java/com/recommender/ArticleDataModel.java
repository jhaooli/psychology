package com.recommender;


import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.model.jdbc.MySQLJDBCDataModel;
/**
 * @Author jhao
 * @Date 2019/5/27 0:11
 * @Description
 * @Modified by:
 */
public class ArticleDataModel extends MySQLJDBCDataModel{

    public final static String PERFERENCETABLE = "article_preference";
    public final static String USERID_COLUMN = "userID";
    public final static String ITEMID_COLUMN = "articleID";
    public final static String PERFERENCE_COLUMN = "score";


    public ArticleDataModel() throws TasteException {
    }

    public ArticleDataModel(String dataSourceName) throws TasteException {
        super(lookupDataSource(dataSourceName), PERFERENCETABLE, USERID_COLUMN, ITEMID_COLUMN, PERFERENCE_COLUMN);
    }
}
