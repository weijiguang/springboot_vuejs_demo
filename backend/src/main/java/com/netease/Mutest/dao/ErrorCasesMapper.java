package com.netease.Mutest.dao;

import com.netease.Mutest.model.ErrorCases;

public interface ErrorCasesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_cases
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_cases
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    int insert(ErrorCases record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_cases
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    int insertSelective(ErrorCases record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_cases
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    ErrorCases selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_cases
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    int updateByPrimaryKeySelective(ErrorCases record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_cases
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    int updateByPrimaryKey(ErrorCases record);
}