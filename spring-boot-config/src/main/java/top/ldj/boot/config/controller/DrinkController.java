package top.ldj.boot.config.controller;

import org.springframework.web.bind.annotation.*;
import top.ldj.boot.config.common.ApiResponse;
import top.ldj.boot.config.enums.DrinkType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: lenovo
 * @Date: 2025/9/12
 * @Version: 1.0
 */
@RestController
@RequestMapping("/drink")
public class DrinkController {
    /*
     *
     *
     * */

    @GetMapping("/{type}")
    public ApiResponse<Map<String, Object>> chooseDrink(@PathVariable String type) {
        try {
            //将传入的type统一转为大写字符
            DrinkType drink = DrinkType.valueOf(type.toUpperCase());
            //构造返回结果
            Map<String, Object> result = new HashMap<>();
            result.put("name", drink.getLabel());
            result.put("price", drink.getPrice());
            //返回结果
            return ApiResponse.success("选择成功", result);
        } catch (IllegalArgumentException e) {
            return ApiResponse.error("饮料类型无效");
        }
    }
    /*
    *
    *
    * */
    @GetMapping("/menu")
    public ApiResponse<List<Map<String, Object>>>getMenu() {
        List<Map<String, Object>> menu = new ArrayList<>();
        for (DrinkType drink : DrinkType.values()) {
            Map<String, Object> item = new HashMap<>();
            item.put("name", drink.getLabel());
            item.put("price", drink.getPrice());
            menu.add(item);
        }
        return ApiResponse.success("获取成功", menu);
    }
    /*
    *
    *
    * */
    @GetMapping("/order")
    public ApiResponse<Map<String, Object>> orderDrink(@RequestParam String type,
                                                       @RequestParam int num) {
        try {
            DrinkType drink = DrinkType.valueOf(type.toUpperCase());
            double total = drink.getPrice() * num;
            Map<String, Object> result = new HashMap<>();
            result.put("name", drink.getLabel());
            result.put("num", num);
            result.put("totalPrice", total);
            return ApiResponse.success("下单成功", result);
        } catch (IllegalArgumentException e) {
            return ApiResponse.error("饮料类型无效");
        }
    }
}