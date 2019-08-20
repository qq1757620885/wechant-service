package com.imooc.pojo;

import java.util.Date;
import javax.persistence.*;

public class Videos {
    @Id
    private String id;

    @Column(name = "user_id")
    private String userId;

    /**
     * 背景音乐id
     */
    @Column(name = "andio_id")
    private String andioId;

    @Column(name = "video_desc")
    private String videoDesc;

    @Column(name = "video_path")
    private String videoPath;

    @Column(name = "video_seconds")
    private Integer videoSeconds;

    @Column(name = "video_width")
    private Integer videoWidth;

    @Column(name = "video_height")
    private Integer videoHeight;

    @Column(name = "cover_path")
    private String coverPath;

    @Column(name = "like_count")
    private Long likeCount;

    /**
     * 0-删除，1-正常，2-禁播
     */
    private Integer state;

    @Column(name = "create_time")
    private Date createTime;

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
     * @return user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取背景音乐id
     *
     * @return andio_id - 背景音乐id
     */
    public String getAndioId() {
        return andioId;
    }

    /**
     * 设置背景音乐id
     *
     * @param andioId 背景音乐id
     */
    public void setAndioId(String andioId) {
        this.andioId = andioId;
    }

    /**
     * @return video_desc
     */
    public String getVideoDesc() {
        return videoDesc;
    }

    /**
     * @param videoDesc
     */
    public void setVideoDesc(String videoDesc) {
        this.videoDesc = videoDesc;
    }

    /**
     * @return video_path
     */
    public String getVideoPath() {
        return videoPath;
    }

    /**
     * @param videoPath
     */
    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }

    /**
     * @return video_seconds
     */
    public Integer getVideoSeconds() {
        return videoSeconds;
    }

    /**
     * @param videoSeconds
     */
    public void setVideoSeconds(Integer videoSeconds) {
        this.videoSeconds = videoSeconds;
    }

    /**
     * @return video_width
     */
    public Integer getVideoWidth() {
        return videoWidth;
    }

    /**
     * @param videoWidth
     */
    public void setVideoWidth(Integer videoWidth) {
        this.videoWidth = videoWidth;
    }

    /**
     * @return video_height
     */
    public Integer getVideoHeight() {
        return videoHeight;
    }

    /**
     * @param videoHeight
     */
    public void setVideoHeight(Integer videoHeight) {
        this.videoHeight = videoHeight;
    }

    /**
     * @return cover_path
     */
    public String getCoverPath() {
        return coverPath;
    }

    /**
     * @param coverPath
     */
    public void setCoverPath(String coverPath) {
        this.coverPath = coverPath;
    }

    /**
     * @return like_count
     */
    public Long getLikeCount() {
        return likeCount;
    }

    /**
     * @param likeCount
     */
    public void setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * 获取0-删除，1-正常，2-禁播
     *
     * @return state - 0-删除，1-正常，2-禁播
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置0-删除，1-正常，2-禁播
     *
     * @param state 0-删除，1-正常，2-禁播
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}