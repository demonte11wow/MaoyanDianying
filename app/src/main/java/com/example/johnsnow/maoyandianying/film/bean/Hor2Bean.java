package com.example.johnsnow.maoyandianying.film.bean;

import java.util.List;

/**
 * Created by JohnSnow on 2016/12/2.
 */
public class Hor2Bean {

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
         * paging : {"hasMore":true,"limit":30,"offset":0,"total":73}
         * stid : 110189035512576
         */

        private PagingBean paging;
        private String stid;
        private List<ComingBean> coming;
        private List<?> hot;

        public PagingBean getPaging() {
            return paging;
        }

        public void setPaging(PagingBean paging) {
            this.paging = paging;
        }

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

        public static class PagingBean {
            /**
             * hasMore : true
             * limit : 30
             * offset : 0
             * total : 73
             */

            private boolean hasMore;
            private int limit;
            private int offset;
            private int total;

            public boolean isHasMore() {
                return hasMore;
            }

            public void setHasMore(boolean hasMore) {
                this.hasMore = hasMore;
            }

            public int getLimit() {
                return limit;
            }

            public void setLimit(int limit) {
                this.limit = limit;
            }

            public int getOffset() {
                return offset;
            }

            public void setOffset(int offset) {
                this.offset = offset;
            }

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }
        }

        public static class ComingBean {
            /**
             * cat : 剧情,冒险,奇幻
             * civilPubSt : 0
             * comingTitle : 12月16日 周五
             * desc : 主演:马特·达蒙,景甜,佩德罗·帕斯卡
             * dir : 张艺谋
             * dur : 104
             * effectShowNum : 0
             * fra : 美国,瑞典,荷兰,德国,英国
             * frt : 2017-02-17,2016-09-30,2016-11-24,2016-12-22,2017-01-06
             * globalReleased : false
             * headLineShow : false
             * headLines : []
             * headLinesVO : []
             * id : 246267
             * img : http://p0.meituan.net/w.h/movie/e4a3447ebe8c44eea59ab7f68790c7e2179321.jpeg
             * late : false
             * localPubSt : 0
             * mk : 0
             * newsHeadlines : []
             * nm : 长城
             * pn : 106
             * preShow : false
             * proScore : 0
             * proScoreNum : 0
             * pubDate : 1481817600000
             * pubShowNum : 0
             * recentShowDate : 0
             * recentShowNum : 0
             * rt : 2016-12-16
             * sc : 0
             * scm : 五军战饕餮，中国魂不灭
             * showInfo : 2016-12-16上映
             * showNum : 0
             * showst : 4
             * snum : 4558
             * star : 马特·达蒙,景甜,佩德罗·帕斯卡
             * ver : 2D/3D
             * videoId : 82231
             * videoName : 《长城》郑恺特辑
             * videourl : http://maoyan.meituan.net/movie/videos/854x4803390fd950b594f26bd3a0c88080e11ed.mp4
             * vnum : 16
             * weight : 1
             * wish : 183364
             * wishst : 0
             * time : 2017-01
             */

            private String cat;
            private int civilPubSt;
            private String comingTitle;
            private String desc;
            private String dir;
            private int dur;
            private int effectShowNum;
            private String fra;
            private String frt;
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
            private int pubShowNum;
            private int recentShowDate;
            private int recentShowNum;
            private String rt;
            private double sc;
            private String scm;
            private String showInfo;
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
            private String time;
            private List<?> headLines;
            private List<?> headLinesVO;
            private List<?> newsHeadlines;

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

            public void setMk(double mk) {
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

            public void setSc(double sc) {
                this.sc = sc;
            }

            public String getScm() {
                return scm;
            }

            public void setScm(String scm) {
                this.scm = scm;
            }

            public String getShowInfo() {
                return showInfo;
            }

            public void setShowInfo(String showInfo) {
                this.showInfo = showInfo;
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

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public List<?> getHeadLines() {
                return headLines;
            }

            public void setHeadLines(List<?> headLines) {
                this.headLines = headLines;
            }

            public List<?> getHeadLinesVO() {
                return headLinesVO;
            }

            public void setHeadLinesVO(List<?> headLinesVO) {
                this.headLinesVO = headLinesVO;
            }

            public List<?> getNewsHeadlines() {
                return newsHeadlines;
            }

            public void setNewsHeadlines(List<?> newsHeadlines) {
                this.newsHeadlines = newsHeadlines;
            }
        }
    }
}
