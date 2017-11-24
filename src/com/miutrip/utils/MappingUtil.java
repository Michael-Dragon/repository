package com.miutrip.utils;

public class MappingUtil {
    /**
     * 追加Mybaits查询命名空间
     * @param name
     * @return
     */
    public static String appendMapping(String name) {
        return "com.miutrip.mappings.paymentRecord." + name;
    }
}
