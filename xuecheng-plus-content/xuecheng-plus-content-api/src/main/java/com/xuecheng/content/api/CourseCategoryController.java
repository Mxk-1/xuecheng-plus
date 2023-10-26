package com.xuecheng.content.api;

import com.xuecheng.content.model.dto.CourseCategoryTreeDto;
import com.xuecheng.content.service.impl.CourseCategoryServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author maxinkai
 * @date 2023/10/26 14:45
 **/
@Slf4j
@RestController
public class CourseCategoryController {

    @Resource
    CourseCategoryServiceImpl courseCategoryService;

    @GetMapping("/course-category/tree-nodes")
    public List<CourseCategoryTreeDto> queryTreeNodes() {
        List<CourseCategoryTreeDto> list = courseCategoryService.queryTreeNodes("1");
        return list;
    }
}
