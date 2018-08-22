package com.es.datamigration.model;

import java.io.Serializable;
import java.util.Date;

public class TbArticleDO implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article.id
     *
     * @mbggenerated Wed Aug 22 10:38:26 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article.title
     *
     * @mbggenerated Wed Aug 22 10:38:26 CST 2018
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article.content
     *
     * @mbggenerated Wed Aug 22 10:38:26 CST 2018
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article.state
     *
     * @mbggenerated Wed Aug 22 10:38:26 CST 2018
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article.latitude
     *
     * @mbggenerated Wed Aug 22 10:38:26 CST 2018
     */
    private Double latitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article.longitude
     *
     * @mbggenerated Wed Aug 22 10:38:26 CST 2018
     */
    private Double longitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article.create_time
     *
     * @mbggenerated Wed Aug 22 10:38:26 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_article.update_time
     *
     * @mbggenerated Wed Aug 22 10:38:26 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_article
     *
     * @mbggenerated Wed Aug 22 10:38:26 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article.id
     *
     * @return the value of tb_article.id
     *
     * @mbggenerated Wed Aug 22 10:38:26 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article.id
     *
     * @param id the value for tb_article.id
     *
     * @mbggenerated Wed Aug 22 10:38:26 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article.title
     *
     * @return the value of tb_article.title
     *
     * @mbggenerated Wed Aug 22 10:38:26 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article.title
     *
     * @param title the value for tb_article.title
     *
     * @mbggenerated Wed Aug 22 10:38:26 CST 2018
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article.content
     *
     * @return the value of tb_article.content
     *
     * @mbggenerated Wed Aug 22 10:38:26 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article.content
     *
     * @param content the value for tb_article.content
     *
     * @mbggenerated Wed Aug 22 10:38:26 CST 2018
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article.state
     *
     * @return the value of tb_article.state
     *
     * @mbggenerated Wed Aug 22 10:38:26 CST 2018
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article.state
     *
     * @param state the value for tb_article.state
     *
     * @mbggenerated Wed Aug 22 10:38:26 CST 2018
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article.latitude
     *
     * @return the value of tb_article.latitude
     *
     * @mbggenerated Wed Aug 22 10:38:26 CST 2018
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article.latitude
     *
     * @param latitude the value for tb_article.latitude
     *
     * @mbggenerated Wed Aug 22 10:38:26 CST 2018
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article.longitude
     *
     * @return the value of tb_article.longitude
     *
     * @mbggenerated Wed Aug 22 10:38:26 CST 2018
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article.longitude
     *
     * @param longitude the value for tb_article.longitude
     *
     * @mbggenerated Wed Aug 22 10:38:26 CST 2018
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article.create_time
     *
     * @return the value of tb_article.create_time
     *
     * @mbggenerated Wed Aug 22 10:38:26 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article.create_time
     *
     * @param createTime the value for tb_article.create_time
     *
     * @mbggenerated Wed Aug 22 10:38:26 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_article.update_time
     *
     * @return the value of tb_article.update_time
     *
     * @mbggenerated Wed Aug 22 10:38:26 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_article.update_time
     *
     * @param updateTime the value for tb_article.update_time
     *
     * @mbggenerated Wed Aug 22 10:38:26 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}