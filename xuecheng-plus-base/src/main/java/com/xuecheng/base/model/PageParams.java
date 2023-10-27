package com.xuecheng.base.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author maxinkai
 * @date 2023/10/25 18:40
 **/
@Data
@ToString
// 空参构造器
@NoArgsConstructor
// 全参构造器
@AllArgsConstructor
public class PageParams {

    // 当前页码
    private Long pageNo = 1L;

    // 每页记录数
    private Long pageSize = 10L;
}
