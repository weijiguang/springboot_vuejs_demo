package com.netease.Mutest.model;

import java.util.Date;

public class Entity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entity.id
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entity.create_time
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entity.modify_time
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entity.entity_value
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    private String entityValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entity.entity_name
     *
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    private String entityName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entity.id
     *
     * @return the value of entity.id
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entity.id
     *
     * @param id the value for entity.id
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entity.create_time
     *
     * @return the value of entity.create_time
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entity.create_time
     *
     * @param createTime the value for entity.create_time
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entity.modify_time
     *
     * @return the value of entity.modify_time
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entity.modify_time
     *
     * @param modifyTime the value for entity.modify_time
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entity.entity_value
     *
     * @return the value of entity.entity_value
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    public String getEntityValue() {
        return entityValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entity.entity_value
     *
     * @param entityValue the value for entity.entity_value
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    public void setEntityValue(String entityValue) {
        this.entityValue = entityValue == null ? null : entityValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entity.entity_name
     *
     * @return the value of entity.entity_name
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entity.entity_name
     *
     * @param entityName the value for entity.entity_name
     * @mbggenerated Fri Jun 02 09:05:42 CST 2017
     */
    public void setEntityName(String entityName) {
        this.entityName = entityName == null ? null : entityName.trim();
    }
}