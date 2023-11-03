package com.xuecheng.content.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author maxinkai
 * @description freemarker测试
 * @date 2023/11/03 16:21
 **/

@RestController
public class FreemarkerController {
    @GetMapping("/testfreemarker")
    public ModelAndView test() {
        ModelAndView modelAndView = new ModelAndView();
        // 设置模型数据
        modelAndView.addObject("name", "小明");
        // 设置模板名称
        modelAndView.setViewName("test");
        return modelAndView;
    }
}
