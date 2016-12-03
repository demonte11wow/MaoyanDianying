package com.example.johnsnow.maoyandianying.city.bean;

import java.util.List;

/**
 * Created by JohnSnow on 2016/12/3.
 */
public class CityBean {

    private List<DataBean> data;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * label : 北京Beijing010
         * name : 北京
         * pinyin : Beijing
         * zip : 010
         */

        private String label;
        private String name;
        private String pinyin;
        private String zip;

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPinyin() {
            return pinyin;
        }

        public void setPinyin(String pinyin) {
            this.pinyin = pinyin;
        }

        public String getZip() {
            return zip;
        }

        public void setZip(String zip) {
            this.zip = zip;
        }
    }
}
