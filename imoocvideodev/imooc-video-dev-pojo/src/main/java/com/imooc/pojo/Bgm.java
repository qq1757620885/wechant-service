package com.imooc.pojo;

import javax.persistence.*;

public class Bgm {
    @Id
    private String id;

    private String author;

    /**
     * 歌名
     */
    private String name;

    private String path;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取歌名
     *
     * @return name - 歌名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置歌名
     *
     * @param name 歌名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }
}