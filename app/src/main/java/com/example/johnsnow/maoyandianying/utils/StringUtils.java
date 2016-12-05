package com.example.johnsnow.maoyandianying.utils;

/**
 * author zaaach on 2016/1/26.
 */
public class StringUtils {
    /**
     * 提取出城市或者县
     *
     * @param city
     * @param district
     * @return
     */
    public static String extractLocation(final String city, final String district) {

      if (city.contains("市")) {
            return city.substring(0, city.length() - 1);
        }
        return city;
    }
}
