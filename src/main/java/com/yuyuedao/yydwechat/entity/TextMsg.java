package com.yuyuedao.yydwechat.entity;

import java.util.Date;

public class TextMsg {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column textMsg.sid
     *
     * @mbg.generated
     */
    private Integer sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column textMsg.textMsg
     *
     * @mbg.generated
     */
    private String textmsg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column textMsg.createTime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column textMsg.openid
     *
     * @mbg.generated
     */
    private String openid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column textMsg.question
     *
     * @mbg.generated
     */
    private Integer question;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column textMsg.questionsort
     *
     * @mbg.generated
     */
    private Integer questionsort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column textMsg.activity
     *
     * @mbg.generated
     */
    private Integer activity;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column textMsg.sid
     *
     * @return the value of textMsg.sid
     *
     * @mbg.generated
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column textMsg.sid
     *
     * @param sid the value for textMsg.sid
     *
     * @mbg.generated
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column textMsg.textMsg
     *
     * @return the value of textMsg.textMsg
     *
     * @mbg.generated
     */
    public String getTextmsg() {
        return textmsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column textMsg.textMsg
     *
     * @param textmsg the value for textMsg.textMsg
     *
     * @mbg.generated
     */
    public void setTextmsg(String textmsg) {
        this.textmsg = textmsg == null ? null : textmsg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column textMsg.createTime
     *
     * @return the value of textMsg.createTime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column textMsg.createTime
     *
     * @param createtime the value for textMsg.createTime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column textMsg.openid
     *
     * @return the value of textMsg.openid
     *
     * @mbg.generated
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column textMsg.openid
     *
     * @param openid the value for textMsg.openid
     *
     * @mbg.generated
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column textMsg.question
     *
     * @return the value of textMsg.question
     *
     * @mbg.generated
     */
    public Integer getQuestion() {
        return question;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column textMsg.question
     *
     * @param question the value for textMsg.question
     *
     * @mbg.generated
     */
    public void setQuestion(Integer question) {
        this.question = question;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column textMsg.questionsort
     *
     * @return the value of textMsg.questionsort
     *
     * @mbg.generated
     */
    public Integer getQuestionsort() {
        return questionsort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column textMsg.questionsort
     *
     * @param questionsort the value for textMsg.questionsort
     *
     * @mbg.generated
     */
    public void setQuestionsort(Integer questionsort) {
        this.questionsort = questionsort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column textMsg.activity
     *
     * @return the value of textMsg.activity
     *
     * @mbg.generated
     */
    public Integer getActivity() {
        return activity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column textMsg.activity
     *
     * @param activity the value for textMsg.activity
     *
     * @mbg.generated
     */
    public void setActivity(Integer activity) {
        this.activity = activity;
    }
}