package com.example.johnsnow.maoyandianying.film.bean;

import java.util.List;

/**
 * Created by JohnSnow on 2016/12/2.
 */
public class ComeSoonBean {

    /**
     */

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * hot : []
         * movieIds : [1197540,338349,343413,247913,248174,342003,1196825,342234,1196196,247448,337708,1197595,1197551,1132388,343745,246267,246261,345919,1196913,1188417,344812,1132973,1198167,1132299,368079,368031,454015,246388,1193541,1183961,345155,345970,248916,1187526,1188324,344762,246276,343742,1190357,346196,367991,344751,345106,343253,1197558,342584,346662,666793,248935,248904,248933,345668,346106,1196168,1189089,343822,247185,342950,341370,345658,1197753,346464,346477,344032,336923,344742,340946,344199,248812,1132373,342150,346224,346731,1170252,672091,1157354,345672,1197843,345519,1197342,337246,341375,1196180,245938,249008,346321,1132343,1188246,345244,346154,672157,1188244,345011,615739,346411,346409,246896,246012,248585,79086,78610,344236,247373,341347,343669,345193,247083,342362,249161,248907,248872,249165,343012,246019,342176,344929,367811,247086,344502,342193,344264,248666,341201,341135,342364,341379,248161,334590,246835,249232,247084,346410,342867,248648,345000,341148,341165,345145,248576,341189,344080,343985,343042,344914,248771,344183,342178,338486,248162,345992,338328,345621,344950,246626,336844,346102,248943,341137,342607,78537,338400,257563,247487,342325,343176,249308,341788,257771,341753,248165,343936,343791,249002,344744,249287,246169,248927,367767,344127,341092,410641,338493,337058,342192,345080,345123,343130,246499,341540,1042603,342569,337047,341987,344897,345042,248121,672137,1136560,345877,246300,247326,344440,344189,248936,346751,344330,346189,345179,341504,343134,338499,337720,246427,368142,1048288,640395,345242,346781,344692,345131,338484,338436,246503,345293,345772,672358,343344,367815,344707,368047,248813,345997,345449,341605,246360,38977,1132350,1156900,1197507,338463,78461,341739,248075,346096,248940,341760,1188652]
         * stid : 110189035512576 mk proscore sc
         */

        private String stid;
        private List<ComingBean> coming;
        private List<?> hot;
        private List<Integer> movieIds;

        public String getStid() {
            return stid;
        }

        public void setStid(String stid) {
            this.stid = stid;
        }

        public List<ComingBean> getComing() {
            return coming;
        }

        public void setComing(List<ComingBean> coming) {
            this.coming = coming;
        }

        public List<?> getHot() {
            return hot;
        }

        public void setHot(List<?> hot) {
            this.hot = hot;
        }

        public List<Integer> getMovieIds() {
            return movieIds;
        }

        public void setMovieIds(List<Integer> movieIds) {
            this.movieIds = movieIds;
        }

        public static class ComingBean {
            /**
             * boxInfo : 喵，即将上映
             * cat : 剧情
             * civilPubSt : 0
             * comingTitle : 12月6日 周二
             * desc : 主演:李天烨,婉儿,程爽
             * dir : 郭奎永,刘智
             * dur : 86
             * effectShowNum : 0
             * globalReleased : false
             * headLineShow : false
             * headLinesVO : []
             * id : 1197540
             * img : http://p1.meituan.net/w.h/movie/7b4cfde9fbae220cd5f1cff734c20e92430358.jpg
             * late : false
             * localPubSt : 0
             * mk : 0
             * nm : 试睡员48小时
             * pn : 7
             * preShow : false
             * proScore : 0
             * proScoreNum : 0
             * pubDate : 1480953600000
             * pubDesc : 2016-12-06大陆上映
             * pubShowNum : 0
             * recentShowDate : 0
             * recentShowNum : 0
             * rt : 2016-12-06
             * sc : 0
             * scm : 五星试睡员，卷入艳照门
             * showNum : 0
             * showst : 1
             * snum : 22
             * star : 李天烨,婉儿,程爽
             * ver : 2D
             * videoId : 82186
             * videoName : 终极版预告片
             * videourl : http://maoyan.meituan.net/movie/videos/854x480dc481e2e0f814a2491a2b3fc96276434.mp4
             * vnum : 1
             * weight : 1
             * wish : 453
             * wishst : 0
             * fra : 美国
             * frt : 2016-11-04
             * showInfo : 2016-12-08 下周四上映
             */

            private String boxInfo;
            private String cat;
            private int civilPubSt;
            private String comingTitle;
            private String desc;
            private String dir;
            private int dur;
            private int effectShowNum;
            private boolean globalReleased;
            private boolean headLineShow;
            private int id;
            private String img;
            private boolean late;
            private int localPubSt;
            private double mk;
            private String nm;
            private int pn;
            private boolean preShow;
            private double proScore;
            private int proScoreNum;
            private long pubDate;
            private String pubDesc;
            private int pubShowNum;
            private int recentShowDate;
            private int recentShowNum;
            private String rt;
            private double sc;
            private String scm;
            private int showNum;
            private int showst;
            private int snum;
            private String star;
            private String ver;
            private int videoId;
            private String videoName;
            private String videourl;
            private int vnum;
            private int weight;
            private int wish;
            private int wishst;
            private String fra;
            private String frt;
            private String showInfo;
            private List<?> headLinesVO;

            public String getBoxInfo() {
                return boxInfo;
            }

            public void setBoxInfo(String boxInfo) {
                this.boxInfo = boxInfo;
            }

            public String getCat() {
                return cat;
            }

            public void setCat(String cat) {
                this.cat = cat;
            }

            public int getCivilPubSt() {
                return civilPubSt;
            }

            public void setCivilPubSt(int civilPubSt) {
                this.civilPubSt = civilPubSt;
            }

            public String getComingTitle() {
                return comingTitle;
            }

            public void setComingTitle(String comingTitle) {
                this.comingTitle = comingTitle;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getDir() {
                return dir;
            }

            public void setDir(String dir) {
                this.dir = dir;
            }

            public int getDur() {
                return dur;
            }

            public void setDur(int dur) {
                this.dur = dur;
            }

            public int getEffectShowNum() {
                return effectShowNum;
            }

            public void setEffectShowNum(int effectShowNum) {
                this.effectShowNum = effectShowNum;
            }

            public boolean isGlobalReleased() {
                return globalReleased;
            }

            public void setGlobalReleased(boolean globalReleased) {
                this.globalReleased = globalReleased;
            }

            public boolean isHeadLineShow() {
                return headLineShow;
            }

            public void setHeadLineShow(boolean headLineShow) {
                this.headLineShow = headLineShow;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public boolean isLate() {
                return late;
            }

            public void setLate(boolean late) {
                this.late = late;
            }

            public int getLocalPubSt() {
                return localPubSt;
            }

            public void setLocalPubSt(int localPubSt) {
                this.localPubSt = localPubSt;
            }

            public double getMk() {
                return mk;
            }

            public void setMk(int mk) {
                this.mk = mk;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPn() {
                return pn;
            }

            public void setPn(int pn) {
                this.pn = pn;
            }

            public boolean isPreShow() {
                return preShow;
            }

            public void setPreShow(boolean preShow) {
                this.preShow = preShow;
            }

            public double getProScore() {
                return proScore;
            }

            public void setProScore(int proScore) {
                this.proScore = proScore;
            }

            public int getProScoreNum() {
                return proScoreNum;
            }

            public void setProScoreNum(int proScoreNum) {
                this.proScoreNum = proScoreNum;
            }

            public long getPubDate() {
                return pubDate;
            }

            public void setPubDate(long pubDate) {
                this.pubDate = pubDate;
            }

            public String getPubDesc() {
                return pubDesc;
            }

            public void setPubDesc(String pubDesc) {
                this.pubDesc = pubDesc;
            }

            public int getPubShowNum() {
                return pubShowNum;
            }

            public void setPubShowNum(int pubShowNum) {
                this.pubShowNum = pubShowNum;
            }

            public int getRecentShowDate() {
                return recentShowDate;
            }

            public void setRecentShowDate(int recentShowDate) {
                this.recentShowDate = recentShowDate;
            }

            public int getRecentShowNum() {
                return recentShowNum;
            }

            public void setRecentShowNum(int recentShowNum) {
                this.recentShowNum = recentShowNum;
            }

            public String getRt() {
                return rt;
            }

            public void setRt(String rt) {
                this.rt = rt;
            }

            public double getSc() {
                return sc;
            }

            public void setSc(int sc) {
                this.sc = sc;
            }

            public String getScm() {
                return scm;
            }

            public void setScm(String scm) {
                this.scm = scm;
            }

            public int getShowNum() {
                return showNum;
            }

            public void setShowNum(int showNum) {
                this.showNum = showNum;
            }

            public int getShowst() {
                return showst;
            }

            public void setShowst(int showst) {
                this.showst = showst;
            }

            public int getSnum() {
                return snum;
            }

            public void setSnum(int snum) {
                this.snum = snum;
            }

            public String getStar() {
                return star;
            }

            public void setStar(String star) {
                this.star = star;
            }

            public String getVer() {
                return ver;
            }

            public void setVer(String ver) {
                this.ver = ver;
            }

            public int getVideoId() {
                return videoId;
            }

            public void setVideoId(int videoId) {
                this.videoId = videoId;
            }

            public String getVideoName() {
                return videoName;
            }

            public void setVideoName(String videoName) {
                this.videoName = videoName;
            }

            public String getVideourl() {
                return videourl;
            }

            public void setVideourl(String videourl) {
                this.videourl = videourl;
            }

            public int getVnum() {
                return vnum;
            }

            public void setVnum(int vnum) {
                this.vnum = vnum;
            }

            public int getWeight() {
                return weight;
            }

            public void setWeight(int weight) {
                this.weight = weight;
            }

            public int getWish() {
                return wish;
            }

            public void setWish(int wish) {
                this.wish = wish;
            }

            public int getWishst() {
                return wishst;
            }

            public void setWishst(int wishst) {
                this.wishst = wishst;
            }

            public String getFra() {
                return fra;
            }

            public void setFra(String fra) {
                this.fra = fra;
            }

            public String getFrt() {
                return frt;
            }

            public void setFrt(String frt) {
                this.frt = frt;
            }

            public String getShowInfo() {
                return showInfo;
            }

            public void setShowInfo(String showInfo) {
                this.showInfo = showInfo;
            }

            public List<?> getHeadLinesVO() {
                return headLinesVO;
            }

            public void setHeadLinesVO(List<?> headLinesVO) {
                this.headLinesVO = headLinesVO;
            }
        }
    }
}
