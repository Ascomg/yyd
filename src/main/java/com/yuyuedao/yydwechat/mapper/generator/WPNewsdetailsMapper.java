package com.yuyuedao.yydwechat.mapper.generator;

import com.yuyuedao.yydwechat.entity.WPNewsdetails;
import com.yuyuedao.yydwechat.entity.WPNewsdetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WPNewsdetailsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table w_p_newsDetails
     *
     * @mbg.generated
     */
    long countByExample(WPNewsdetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table w_p_newsDetails
     *
     * @mbg.generated
     */
    int deleteByExample(WPNewsdetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table w_p_newsDetails
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table w_p_newsDetails
     *
     * @mbg.generated
     */
    int insert(WPNewsdetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table w_p_newsDetails
     *
     * @mbg.generated
     */
    int insertSelective(WPNewsdetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table w_p_newsDetails
     *
     * @mbg.generated
     */
    List<WPNewsdetails> selectByExample(WPNewsdetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table w_p_newsDetails
     *
     * @mbg.generated
     */
    WPNewsdetails selectByPrimaryKey(Integer sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table w_p_newsDetails
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") WPNewsdetails record, @Param("example") WPNewsdetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table w_p_newsDetails
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") WPNewsdetails record, @Param("example") WPNewsdetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table w_p_newsDetails
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(WPNewsdetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table w_p_newsDetails
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(WPNewsdetails record);
}