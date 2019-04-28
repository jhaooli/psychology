package com.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author jhao
 * @Date 2019/4/27 10:56
 * @Description 文章类
 * @Modified by:
 */
public class News {

    private int id;
    private String title;
    private String author;
    private String types;
    private String content;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date publish_time;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublish_time() {
        return publish_time;
    }

    public void setPublish_time(Date publish_time) {
        this.publish_time = publish_time;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", types='" + types + '\'' +
                ", content='" + content + '\'' +
                ", publish_time=" + publish_time +
                '}';
    }
}
