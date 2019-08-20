package com.imooc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import javax.persistence.*;

@ApiModel(value = "用户实体", description = "user")
public class Users {
    /**
     * id
     */
    @Id
    @ApiModelProperty(hidden = true)  //前端不需要显示的，可以隐藏掉
    private String id;

    /**
     * 用户登录名
     */
    @ApiModelProperty(value="用户名", name = "username", example = "imooc_lj", required = true)
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty(value="密码", name = "password", example = "123456", required = true)
    private String password;

    /**
     * 头像
     */
    @ApiModelProperty(hidden = true)
    @Column(name = "face_image")
    private String faceImage;

    /**
     * 昵称
     */
    @ApiModelProperty(hidden = true)
    private String nickname;

    /**
     * 粉丝数
     */
    @ApiModelProperty(hidden = true)
    @Column(name = "fans_count")
    private Integer fansCount;

    /**
     * 关注数量
     */
    @ApiModelProperty(hidden = true)
    @Column(name = "follow_count")
    private Integer followCount;

    /**
     * 获赞数
     */
    @ApiModelProperty(hidden = true)
    @Column(name = "receive_like_count")
    private Integer receiveLikeCount;

    /**
     * 状态，1-正常，0-失效
     */
    @ApiModelProperty(hidden = true)
    private Boolean statue;

    /**
     * 创建时间
     */
    @ApiModelProperty(hidden = true)
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 获取id
     *
     * @return id - id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取用户登录名
     *
     * @return username - 用户登录名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户登录名
     *
     * @param username 用户登录名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取头像
     *
     * @return face_image - 头像
     */
    public String getFaceImage() {
        return faceImage;
    }

    /**
     * 设置头像
     *
     * @param faceImage 头像
     */
    public void setFaceImage(String faceImage) {
        this.faceImage = faceImage;
    }

    /**
     * 获取昵称
     *
     * @return nickname - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取粉丝数
     *
     * @return fans_count - 粉丝数
     */
    public Integer getFansCount() {
        return fansCount;
    }

    /**
     * 设置粉丝数
     *
     * @param fansCount 粉丝数
     */
    public void setFansCount(Integer fansCount) {
        this.fansCount = fansCount;
    }

    /**
     * 获取关注数量
     *
     * @return follow_count - 关注数量
     */
    public Integer getFollowCount() {
        return followCount;
    }

    /**
     * 设置关注数量
     *
     * @param followCount 关注数量
     */
    public void setFollowCount(Integer followCount) {
        this.followCount = followCount;
    }

    /**
     * 获取获赞数
     *
     * @return receive_like_count - 获赞数
     */
    public Integer getReceiveLikeCount() {
        return receiveLikeCount;
    }

    /**
     * 设置获赞数
     *
     * @param receiveLikeCount 获赞数
     */
    public void setReceiveLikeCount(Integer receiveLikeCount) {
        this.receiveLikeCount = receiveLikeCount;
    }

    /**
     * 获取状态，1-正常，0-失效
     *
     * @return statue - 状态，1-正常，0-失效
     */
    public Boolean getStatue() {
        return statue;
    }

    /**
     * 设置状态，1-正常，0-失效
     *
     * @param statue 状态，1-正常，0-失效
     */
    public void setStatue(Boolean statue) {
        this.statue = statue;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}