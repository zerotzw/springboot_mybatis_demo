package com.example.mybatis.demo.dao;

import com.example.mybatis.demo.entity.ThirdUserAccount;
import org.springframework.stereotype.Repository;


@Repository
public interface ThirdUserAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table third_user_account
     *
     * @mbg.generated
     */
    int insert(ThirdUserAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table third_user_account
     *
     * @mbg.generated
     */
    int insertSelective(ThirdUserAccount record);
}