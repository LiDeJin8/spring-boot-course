package top.ldj.boot.config.controller;

import top.ldj.boot.config.enums.ExpressStatus;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/express")
public class ExpressController {
    /*
    * 获取快递状态
    *
    * @
    * */
    @GetMapping("/{status}")
    public String checkExpressStatus(@PathVariable ExpressStatus status){
        return "快递状态:" + status.getLabel();
    }

    /*
    *
    *
    * */

    @GetMapping("/express/status")
    public List<Map<String , String>> getAllStatus(){
        List<Map<String , String>> list = new ArrayList<>();
        for (ExpressStatus status : ExpressStatus.values()) {
            Map<String , String> item = new HashMap<>();
            item.put("value" , status.name());
            item.put("label" , status.getLabel());
            list.add(item);
        }
        return list;
    }

    /*
    *
    *
    *
    * */
    @PostMapping("/express/update")
        public String updateExpress(@RequestParam String orderNo, @RequestParam ExpressStatus status){
            return "快递单号 " +  orderNo + " 状态已跟新为 " +  status.getLabel();
        }

}
