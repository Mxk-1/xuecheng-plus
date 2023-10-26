package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.TeachplanDto;

import java.util.List;

/**
 * @author maxinkai
 * @description
 * @date 2023/10/26 17:41
 **/
public interface TeachplanService {
    /**
     * @param courseId
     * @return java.util.List<com.xuecheng.content.model.dto.TeachplanDto>
     * @description 查询课程计划树
     * @author irvin
     * @date 2023/10/26 17:41
     */
    public List<TeachplanDto> findTeachplanTree(long courseId);
}
