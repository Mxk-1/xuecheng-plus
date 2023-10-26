package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.AddCourseDto;
import com.xuecheng.content.model.dto.CourseBaseInfoDto;
import com.xuecheng.content.model.dto.EditCourseDto;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;

/**
 * 课程基本信息管理业务接口
 *
 * @author maxinkai
 * @date 2023/10/25 21:16
 **/
public interface CourseBaseInfoService {
    // 课程分类递归查询
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);

    // 新增课程信息
    CourseBaseInfoDto createCourseBase(Long companyId, AddCourseDto addCourseDto);

    /**
     * @param courseId
     * @return com.xuecheng.content.model.dto.CourseBaseInfoDto
     * @description 根据courseId查询课程信息
     * @author irving
     * @date 2023/10/26 17:05
     */
    public CourseBaseInfoDto getCourseBaseInfo(long courseId);

    /**
     * @param companyId
     * @param dto
     * @return com.xuecheng.content.model.dto.CourseBaseInfoDto
     * @description 修改课程基本信息
     * @author irvin
     * @date 2023/10/26 17:16
     */
    public CourseBaseInfoDto updateCourseBase(Long companyId, EditCourseDto dto);

}
