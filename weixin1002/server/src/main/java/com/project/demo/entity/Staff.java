package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 员工：(Staff)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "Staff")
public class Staff implements Serializable {

    // Staff编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "staff_id")
    private Integer staff_id;

    // 员工编号
    @Basic
    private String employee_id;
    // 员工姓名
    @Basic
    private String employee_name;
    // 性别
    @Basic
    private String gender;
    // 职位
    @Basic
    private String position;
    // 联系电话
    @Basic
    private String contact_number;












    // 用户编号
    @Id
    @Column(name = "user_id")
    private Integer userId;


    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
