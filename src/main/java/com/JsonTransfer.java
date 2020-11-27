package com;

import com.alibaba.fastjson.JSONObject;

/**
 * @author wangxin
 * @data 2020/11/27 10:19
 */
public class JsonTransfer {
    public static void main(String[] args) {
        String a="{'code':100,'data':{'grdbl':100.0,'bxl':646,'fwl':0,'mytsl':0}}";
        JSONObject jsonObject = JSONObject.parseObject(a);
        Integer code = (Integer) jsonObject.get("code");
        System.out.println(code);
        System.out.println("----------------");
        Object  data1 =  jsonObject.get("data");
        System.out.println(data1);
        System.out.println("----------------------");

        JSONObject jsonObject1 = jsonObject.getJSONObject("data");
        Object grdbl = jsonObject1.get("grdbl");
        System.out.println(grdbl);
    }
}
