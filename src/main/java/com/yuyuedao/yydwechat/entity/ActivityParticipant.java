package com.yuyuedao.yydwechat.entity;

import java.util.Date;

public class ActivityParticipant {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_participant.sid
     *
     * @mbg.generated
     */
    private Integer sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_participant.openid
     *
     * @mbg.generated
     */
    private String openid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_participant.invate_openid
     *
     * @mbg.generated
     */
    private String invateOpenid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_participant.activityId
     *
     * @mbg.generated
     */
    private Integer activityid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_participant.stype
     *
     * @mbg.generated
     */
    private String stype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_participant.createTime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_participant.sid
     *
     * @return the value of activity_participant.sid
     *
     * @mbg.generated
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_participant.sid
     *
     * @param sid the value for activity_participant.sid
     *
     * @mbg.generated
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_participant.openid
     *
     * @return the value of activity_participant.openid
     *
     * @mbg.generated
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_participant.openid
     *
     * @param openid the value for activity_participant.openid
     *
     * @mbg.generated
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_participant.invate_openid
     *
     * @return the value of activity_participant.invate_openid
     *
     * @mbg.generated
     */
    public String getInvateOpenid() {
        return invateOpenid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_participant.invate_openid
     *
     * @param invateOpenid the value for activity_participant.invate_openid
     *
     * @mbg.generated
     */
    public void setInvateOpenid(String invateOpenid) {
        this.invateOpenid = invateOpenid == null ? null : invateOpenid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_participant.activityId
     *
     * @return the value of activity_participant.activityId
     *
     * @mbg.generated
     */
    public Integer getActivityid() {
        return activityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_participant.activityId
     *
     * @param activityid the value for activity_participant.activityId
     *
     * @mbg.generated
     */
    public void setActivityid(Integer activityid) {
        this.activityid = activityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_participant.stype
     *
     * @return the value of activity_participant.stype
     *
     * @mbg.generated
     */
    public String getStype() {
        return stype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_participant.stype
     *
     * @param stype the value for activity_participant.stype
     *
     * @mbg.generated
     */
    public void setStype(String stype) {
        this.stype = stype == null ? null : stype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_participant.createTime
     *
     * @return the value of activity_participant.createTime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_participant.createTime
     *
     * @param createtime the value for activity_participant.createTime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}