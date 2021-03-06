package org.Right.Api.Entity.Mapper;

import org.Right.Api.Entity.RightMenu;
import org.Right.Api.Entity.RightMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RightMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table right_menu
     *
     * @mbggenerated
     */
    int countByExample(RightMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table right_menu
     *
     * @mbggenerated
     */
    int deleteByExample(RightMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table right_menu
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table right_menu
     *
     * @mbggenerated
     */
    int insert(RightMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table right_menu
     *
     * @mbggenerated
     */
    int insertSelective(RightMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table right_menu
     *
     * @mbggenerated
     */
    List<RightMenu> selectByExample(RightMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table right_menu
     *
     * @mbggenerated
     */
    RightMenu selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table right_menu
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") RightMenu record, @Param("example") RightMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table right_menu
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") RightMenu record, @Param("example") RightMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table right_menu
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(RightMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table right_menu
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(RightMenu record);
}