package com.yuyuedao.yydwechat.entity;

import java.util.Date;

public class DrawParticipant {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column draw_participant.sid
     *
     * @mbg.generated
     */
    private Integer sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column draw_participant.openid
     *
     * @mbg.generated
     */
    private String openid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column draw_participant.draw_activity_id
     *
     * @mbg.generated
     */
    private Integer drawActivityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column draw_participant.createtime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column draw_participant.sid
     *
     * @return the value of draw_participant.sid
     *
     * @mbg.generated
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column draw_participant.sid
     *
     * @param sid the value for draw_participant.sid
     *
     * @mbg.generated
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column draw_participant.openid
     *
     * @return the value of draw_participant.openid
     *
     * @mbg.generated
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column draw_participant.openid
     *
     * @param openid the value for draw_participant.openid
     *
     * @mbg.generated
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column draw_participant.draw_activity_id
     *
     * @return the value of draw_participant.draw_activity_id
     *
     * @mbg.generated
     */
    public Integer getDrawActivityId() {
        return drawActivityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column draw_participant.draw_activity_id
     *
     * @param drawActivityId the value for draw_participant.draw_activity_id
     *
     * @mbg.generated
     */
    public void setDrawActivityId(Integer drawActivityId) {
        this.drawActivityId = drawActivityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column draw_participant.createtime
     *
     * @return the value of draw_participant.createtime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column draw_participant.createtime
     *
     * @param createtime the value for draw_participant.createtime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}