package com.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author jhao
 * @Date 2019/5/26 23:28
 * @Description
 * @Modified by:
 */
public class Article {

    private int id;
    private String author;
    private System title;
    private String types;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date publishTime;

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public System getTitle() {
        return title;
    }

    public void setTitle(System title) {
        this.title = title;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }
}
