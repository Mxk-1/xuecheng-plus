package com.xuecheng.base.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * 分页查询结构模型类
 *
 * @author maxinkai
 * @date 2023/10/25 18:45
 **/
@Data
@ToString
@AllArgsConstructor
public class PageResult<T> implements Serializable {
    // 数据列表
    private List<T> items;

    // 总记录数
    private Long counts;

    // 当前页码
    private long page;

    // 每页记录数
    private long pageSize;
}
