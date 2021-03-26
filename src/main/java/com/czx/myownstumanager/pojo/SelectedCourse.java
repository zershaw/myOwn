package com.czx.myownstumanager.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 选课信息实体类
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SelectedCourse {
    private Integer id;
    private Integer studentId;
    private Integer courseId;
}
