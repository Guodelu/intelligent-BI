package com.yupi.springbootinit.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 张家铭
 * @version 1.0
 */
@SpringBootTest
class ChartMapperTest {

    @Resource
    private ChartMapper chartMapper;
    @Test
    void queryChartData() {
        String chartId = "1659210482555121666";
        String format = String.format("select * from chart_%s", chartId);
        List<Map<String, Object>> maps = chartMapper.queryChartData(format);
        System.out.println(maps);
    }
}