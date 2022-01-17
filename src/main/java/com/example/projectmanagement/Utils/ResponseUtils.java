package com.example.projectmanagement.Utils;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.runners.parameterized.ParametersRunnerFactory;

import java.util.HashMap;

/**
 * @author ：WHOAMI
 * @date ：Created in 2022/1/17 14:09
 * @description：
 * @modified By：
 * @version: $
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseUtils {

    private Object object;

    public static String success(Object object){
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("code",200);
        objectObjectHashMap.put("data",object);
        objectObjectHashMap.put("message","获取成功");

        return JSON.toJSONString(objectObjectHashMap);
    }
}
