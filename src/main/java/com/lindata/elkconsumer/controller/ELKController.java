package com.lindata.elkconsumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lindata
 * @date 20200922
 */
@RestController
public class ELKController {
    @RequestMapping(value = "list", produces = "application/json")
    public Map<String, String> listStocks() {
        Map<String, String> result = new HashMap<>();
        result.put("300059", "东方财富");
        result.put("002594", "比亚迪");
        result.put("600030", "中信证券");
        result.put("600036", "招商银行");
        result.put("300026", "红日药业");
        return result;
    }
}
