package com.imooc.pojo.vo;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class UsersVo {
    @Id
    @ApiModelProperty(hidden = true)  //前端不需要显示的，可以隐藏掉
    private String id;

    private String userToken;

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
    private Integer fansCount;

    /**
     * 关注数量
     */
    @ApiModelProperty(hidden = true)
    private Integer followCount;

    /**
     * 获赞数
     */
    @ApiModelProperty(hidden = true)
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
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFaceImage() {
        return faceImage;
    }

    public void setFaceImage(String faceImage) {
        this.faceImage = faceImage;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getFansCount() {
        return fansCount;
    }

    public void setFansCount(Integer fansCount) {
        this.fansCount = fansCount;
    }

    public Integer getFollowCount() {
        return followCount;
    }

    public void setFollowCount(Integer followCount) {
        this.followCount = followCount;
    }

    public Integer getReceiveLikeCount() {
        return receiveLikeCount;
    }

    public void setReceiveLikeCount(Integer receiveLikeCount) {
        this.receiveLikeCount = receiveLikeCount;
    }

    public Boolean getStatue() {
        return statue;
    }

    public void setStatue(Boolean statue) {
        this.statue = statue;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
