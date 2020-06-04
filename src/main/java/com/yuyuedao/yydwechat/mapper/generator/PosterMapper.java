package com.yuyuedao.yydwechat.mapper.generator;

import com.yuyuedao.yydwechat.entity.Poster;
import com.yuyuedao.yydwechat.entity.PosterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PosterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poster
     *
     * @mbg.generated
     */
    long countByExample(PosterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poster
     *
     * @mbg.generated
     */
    int deleteByExample(PosterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poster
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poster
     *
     * @mbg.generated
     */
    int insert(Poster record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poster
     *
     * @mbg.generated
     */
    int insertSelective(Poster record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poster
     *
     * @mbg.generated
     */
    List<Poster> selectByExample(PosterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poster
     *
     * @mbg.generated
     */
    Poster selectByPrimaryKey(Integer sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poster
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Poster record, @Param("example") PosterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poster
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Poster record, @Param("example") PosterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poster
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Poster record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poster
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Poster record);
}