package com.example.minidemo.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * @author bob
 * Date     19-4-25
 * Description 基础信息类
 */
@Entity
public class BaseInfo {
    @Id
    private Long id;
    private String name;
    private String type;
    private String author;

    public BaseInfo(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Generated(hash = 626858930)
    public BaseInfo(Long id, String name, String type, String author) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.author = author;
    }

    @Generated(hash = 614508582)
    public BaseInfo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
