package com.czx.myownstumanager.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname Attendance
 * @Description 考勤实体类
 * @Date 2019/7/1 11:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Attendance {
    private Integer id;
    private Integer courseId; // 课程id
    private Integer studentId; // 学生id
    private String type; // 时段
    private String date;

}
