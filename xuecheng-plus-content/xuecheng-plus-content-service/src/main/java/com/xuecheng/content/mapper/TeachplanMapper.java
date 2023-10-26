package com.xuecheng.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xuecheng.content.model.dto.TeachplanDto;
import com.xuecheng.content.model.po.Teachplan;

import java.util.List;

/**
 * <p>
 * 课程计划 Mapper 接口
 * </p>
 *
 * @author itcast
 */
public interface TeachplanMapper extends BaseMapper<Teachplan> {

    /**
     * @param courseId
     * @return java.util.List<com.xuecheng.content.model.dto.TeachplanDto>
     * @description 查询课程计划树
     * @author irvin
     * @date 2023/10/26 17:44
     */
    public List<TeachplanDto> selectTreeNodes(Long courseId);
}
