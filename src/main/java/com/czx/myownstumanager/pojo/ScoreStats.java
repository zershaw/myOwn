package com.czx.myownstumanager.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 成绩统计
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScoreStats {
    private Double max_score;
    private Double avg_score;
    private Double min_score;
    private String courseName;//课程名称
}
