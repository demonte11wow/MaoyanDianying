package com.example.johnsnow.maoyandianying.film.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by JohnSnow on 2016/12/1.
 */
public class HotBean{


    private ControlBean control;
    private int status;
    private DataBean data;

    public ControlBean getControl() {
        return control;
    }

    public void setControl(ControlBean control) {
        this.control = control;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class ControlBean {
        /**
         * expires : 1800
         */

        private int expires;

        public int getExpires() {
            return expires;
        }

        public void setExpires(int expires) {
            this.expires = expires;
        }
    }

    public static class DataBean {


        private boolean hasNext;
        private List<MoviesBean> movies;

        public boolean isHasNext() {
            return hasNext;
        }

        public void setHasNext(boolean hasNext) {
            this.hasNext = hasNext;
        }

        public List<MoviesBean> getMovies() {
            return movies;
        }

        public void setMovies(List<MoviesBean> movies) {
            this.movies = movies;
        }

        public static class MoviesBean {
            /**
             * showInfo : 今天162家影院放映2030场
             * sn : 0
             * cnms : 0
             * late : false
             * imax : true
             * snum : 107991
             * nm : 神奇动物在哪里
             * dur : 133
             * img : http://p0.meituan.net/165.220/movie/f2820b28cff46c530a1aee47a2c00011274783.jpg
             * sc : 9.0
             * ver : 3D/IMAX 3D/中国巨幕
             * rt : 2016-11-25上映
             * pn : 236
             * wish : 130686
             * 3d : true
             * preSale : 0
             * vd :
             * dir : 大卫·叶茨
             * star : 埃迪·雷德梅恩,凯瑟琳·沃特斯顿,艾莉森·萨多尔
             * cat : 冒险,奇幻,家庭
             * src :
             * showDate :
             * scm : 神奇动物城，法师显超能
             * time :
             * id : 248918
             */

            private String showInfo;
            private int sn;
            private int cnms;
            private boolean late;
            private boolean imax;
            private int snum;
            private String nm;
            private int dur;
            private String img;
            private double sc;
            private String ver;
            private String rt;
            private int pn;
            private int wish;
            @SerializedName("3d")
            private boolean value3d;
            private int preSale;
            private String vd;
            private String dir;
            private String star;
            private String cat;
            private String src;
            private String showDate;
            private String scm;
            private String time;
            private int id;

            public String getShowInfo() {
                return showInfo;
            }

            public void setShowInfo(String showInfo) {
                this.showInfo = showInfo;
            }

            public int getSn() {
                return sn;
            }

            public void setSn(int sn) {
                this.sn = sn;
            }

            public int getCnms() {
                return cnms;
            }

            public void setCnms(int cnms) {
                this.cnms = cnms;
            }

            public boolean isLate() {
                return late;
            }

            public void setLate(boolean late) {
                this.late = late;
            }

            public boolean isImax() {
                return imax;
            }

            public void setImax(boolean imax) {
                this.imax = imax;
            }

            public int getSnum() {
                return snum;
            }

            public void setSnum(int snum) {
                this.snum = snum;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getDur() {
                return dur;
            }

            public void setDur(int dur) {
                this.dur = dur;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public double getSc() {
                return sc;
            }

            public void setSc(double sc) {
                this.sc = sc;
            }

            public String getVer() {
                return ver;
            }

            public void setVer(String ver) {
                this.ver = ver;
            }

            public String getRt() {
                return rt;
            }

            public void setRt(String rt) {
                this.rt = rt;
            }

            public int getPn() {
                return pn;
            }

            public void setPn(int pn) {
                this.pn = pn;
            }

            public int getWish() {
                return wish;
            }

            public void setWish(int wish) {
                this.wish = wish;
            }

            public boolean isValue3d() {
                return value3d;
            }

            public void setValue3d(boolean value3d) {
                this.value3d = value3d;
            }

            public int getPreSale() {
                return preSale;
            }

            public void setPreSale(int preSale) {
                this.preSale = preSale;
            }

            public String getVd() {
                return vd;
            }

            public void setVd(String vd) {
                this.vd = vd;
            }

            public String getDir() {
                return dir;
            }

            public void setDir(String dir) {
                this.dir = dir;
            }

            public String getStar() {
                return star;
            }

            public void setStar(String star) {
                this.star = star;
            }

            public String getCat() {
                return cat;
            }

            public void setCat(String cat) {
                this.cat = cat;
            }

            public String getSrc() {
                return src;
            }

            public void setSrc(String src) {
                this.src = src;
            }

            public String getShowDate() {
                return showDate;
            }

            public void setShowDate(String showDate) {
                this.showDate = showDate;
            }

            public String getScm() {
                return scm;
            }

            public void setScm(String scm) {
                this.scm = scm;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }
    }
}
