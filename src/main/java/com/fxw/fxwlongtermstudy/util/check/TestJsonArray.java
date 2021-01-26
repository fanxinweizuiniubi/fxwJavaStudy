package com.fxw.fxwlongtermstudy.util.check;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fxw.fxwlongtermstudy.model.JkjAwardConfig;

import java.util.List;

public class TestJsonArray {

    public static void main(String[] args) {
        String json = "[\n" +
                "    {\n" +
                "        \"day\": \"3\",\n" +
                "        \"top\": \"第三天顶部\",\n" +
                "        \"bottom\": \"第三天底部\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"day\": \"4\",\n" +
                "        \"top\": \"第四天顶部\",\n" +
                "        \"bottom\": \"第四天底部\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"day\": \"5\",\n" +
                "        \"top\": \"第五天顶部\",\n" +
                "        \"bottom\": \"第五天底部\"\n" +
                "    }\n" +
                "]";
        JSONArray jsonArray = JSONObject.parseArray(json);
        List<JkjAwardConfig> jkjAwardConfigList = jsonArray.toJavaList(JkjAwardConfig.class);
    }

}
