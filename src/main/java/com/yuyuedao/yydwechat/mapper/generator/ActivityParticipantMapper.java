package com.yuyuedao.yydwechat.mapper.generator;

import com.yuyuedao.yydwechat.entity.ActivityParticipant;
import com.yuyuedao.yydwechat.entity.ActivityParticipantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityParticipantMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_participant
     *
     * @mbg.generated
     */
    long countByExample(ActivityParticipantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_participant
     *
     * @mbg.generated
     */
    int deleteByExample(ActivityParticipantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_participant
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_participant
     *
     * @mbg.generated
     */
    int insert(ActivityParticipant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_participant
     *
     * @mbg.generated
     */
    int insertSelective(ActivityParticipant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_participant
     *
     * @mbg.generated
     */
    List<ActivityParticipant> selectByExample(ActivityParticipantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_participant
     *
     * @mbg.generated
     */
    ActivityParticipant selectByPrimaryKey(Integer sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_participant
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ActivityParticipant record, @Param("example") ActivityParticipantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_participant
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ActivityParticipant record, @Param("example") ActivityParticipantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_participant
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ActivityParticipant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_participant
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ActivityParticipant record);
}