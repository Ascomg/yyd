package com.yuyuedao.yydwechat.mapper.generator;

import com.yuyuedao.yydwechat.entity.WPKey;
import com.yuyuedao.yydwechat.entity.WPKeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WPKeyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table w_p_key
     *
     * @mbg.generated
     */
    long countByExample(WPKeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table w_p_key
     *
     * @mbg.generated
     */
    int deleteByExample(WPKeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table w_p_key
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table w_p_key
     *
     * @mbg.generated
     */
    int insert(WPKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table w_p_key
     *
     * @mbg.generated
     */
    int insertSelective(WPKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table w_p_key
     *
     * @mbg.generated
     */
    List<WPKey> selectByExample(WPKeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table w_p_key
     *
     * @mbg.generated
     */
    WPKey selectByPrimaryKey(Integer sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table w_p_key
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") WPKey record, @Param("example") WPKeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table w_p_key
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") WPKey record, @Param("example") WPKeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table w_p_key
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(WPKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table w_p_key
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(WPKey record);
}