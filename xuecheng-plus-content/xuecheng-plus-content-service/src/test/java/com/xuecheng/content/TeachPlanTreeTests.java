package com.xuecheng.content;

import com.xuecheng.content.model.dto.TeachplanDto;
import com.xuecheng.content.service.impl.TeachplanServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author maxinkai
 * @description 课程计划树测试
 * @date 2023/10/26 17:45
 **/
@SpringBootTest
public class TeachPlanTreeTests {

    @Resource
    TeachplanServiceImpl teachplanService;

    @Test
    void testTeachPlanTree() {
        List<TeachplanDto> tree = teachplanService.findTeachplanTree(1L);
        System.out.println(tree);
    }
}

