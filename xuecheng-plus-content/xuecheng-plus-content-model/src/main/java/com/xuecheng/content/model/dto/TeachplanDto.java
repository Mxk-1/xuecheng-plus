package com.xuecheng.content.model.dto;

import com.xuecheng.content.model.po.Teachplan;
import com.xuecheng.content.model.po.TeachplanMedia;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @author maxinkai
 * @description
 * @date 2023/10/26 17:33
 **/
@Data
@ToString
public class TeachplanDto extends Teachplan {
    // 课程计划关联的媒资信息
    TeachplanMedia teachplanMedia;

    // 子结点
    List<TeachplanDto> teachPlanTreeNodes;

}
