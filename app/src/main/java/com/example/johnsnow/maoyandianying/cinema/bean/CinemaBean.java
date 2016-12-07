package com.example.johnsnow.maoyandianying.cinema.bean;

import java.util.List;

/**
 * Created by JohnSnow on 2016/12/6.
 */
public class CinemaBean{

    /**
     * control : {"expires":43200}
     * status : 0
     * data : {"朝阳区":[{"brdId":23854,"dealPrice":0,"referencePrice":70,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"17.5影城(比如世界店)","ct":"","sellPrice":30,"addr":"朝阳区京顺路111号比如世界购物中心1层（近太阳宫北街）","preferential":0,"sellmin":0,"sell":true,"brd":"17.5影城","dis":"望京","imax":0,"poiId":75603,"lat":39.9684,"lng":116.46204,"id":48},{"brdId":23854,"dealPrice":0,"referencePrice":60,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"17.5影城(管庄店)","ct":"","sellPrice":30,"addr":"朝阳区朝阳路京通苑30号楼L307PLus365购物中心三层","preferential":0,"sellmin":0,"sell":true,"brd":"17.5影城","dis":"管庄","imax":0,"poiId":1677952,"lat":39.912422,"lng":116.596085,"id":2243},{"brdId":2020418,"dealPrice":0,"referencePrice":40,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"CGV星星影城(奥体店)","ct":"","sellPrice":57,"addr":"朝阳区湖景东路11号新奥购物中心B1-B2楼","preferential":0,"sellmin":0,"sell":true,"brd":"CGV影城","dis":"亚运村","imax":0,"poiId":360511,"lat":39.999462,"lng":116.39392,"id":65},{"brdId":2020418,"dealPrice":0,"referencePrice":40,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"CGV星星影城(颐堤港店)","ct":"","sellPrice":48,"addr":"朝阳区酒仙桥路18号颐堤港4层","preferential":0,"sellmin":0,"sell":true,"brd":"CGV影城","dis":"酒仙桥","imax":0,"poiId":1466992,"lat":39.96964,"lng":116.4909,"id":8},{"brdId":24003,"dealPrice":0,"referencePrice":80,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"K酷国际影城","ct":"","sellPrice":23,"addr":"朝阳区北苑路42号卜峰莲花超市4楼（K酷时尚广场）","preferential":0,"sellmin":0,"sell":true,"brd":"K酷国际影城","dis":"亚运村","imax":0,"poiId":796845,"lat":40.033382,"lng":116.41916,"id":21},{"brdId":24071,"dealPrice":0,"referencePrice":70,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"UME国际影城(双井店)","ct":"","sellPrice":39.5,"addr":"朝阳区东三环中路65号富力广场6楼（双井桥北）","preferential":0,"sellmin":0,"sell":true,"brd":"UME国际影城","dis":"双井","imax":0,"poiId":291070,"lat":39.89768,"lng":116.45983,"id":135},{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"奥兰环球影城","ct":"","sellPrice":23,"addr":"朝阳区来广营西路5号院诚盈中心商业街","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"","imax":0,"poiId":106343887,"lat":40.021084,"lng":116.46593,"id":16421},{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"艾米·1895电影街","ct":"","sellPrice":41,"addr":"朝阳区工体北路13号世茂工三3楼，艾米·1895电影街（三里屯商圈）","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"","imax":0,"poiId":42853106,"lat":39.93605,"lng":116.44939,"id":13640},{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"北京东融国际影城(西直河店)","ct":"","sellPrice":22.9,"addr":"朝阳区西直河商业广场华联购物广场1楼","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"","imax":0,"poiId":91811925,"lat":39.844444,"lng":116.52732,"id":15415},{"brdId":254168,"dealPrice":0,"referencePrice":80,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"北京剧院","ct":"","sellPrice":23,"addr":"朝阳区安慧里三区10号","preferential":0,"sellmin":0,"sell":true,"brd":"北京剧院","dis":"亚运村","imax":0,"poiId":82597,"lat":39.990856,"lng":116.40813,"id":248},{"brdId":24472,"dealPrice":0,"referencePrice":25,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"保利国际影城(北苑华贸店)","ct":"","sellPrice":39,"addr":"朝阳区清河营南街7号院华贸天地B1楼","preferential":0,"sellmin":0,"sell":true,"brd":"保利国际影城","dis":"北苑","imax":0,"poiId":361205,"lat":40.047962,"lng":116.43101,"id":2603},{"brdId":24472,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"保利国际影城(东坝店)","ct":"","sellPrice":29,"addr":"朝阳区东坝中路38号金隅嘉品MALL5层","preferential":0,"sellmin":0,"sell":true,"brd":"保利国际影城","dis":"","imax":0,"poiId":73452594,"lat":39.951107,"lng":116.54848,"id":14430},{"brdId":24472,"dealPrice":0,"referencePrice":70,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"保利国际影城(望京店)","ct":"","sellPrice":38,"addr":"朝阳区望京阜通西大街新荟城购物中心五层","preferential":0,"sellmin":0,"sell":true,"brd":"保利国际影城","dis":"望京","imax":0,"poiId":1107541,"lat":39.998497,"lng":116.481926,"id":39},{"brdId":24472,"dealPrice":0,"referencePrice":80,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"保利国际影城(中国科技馆店)","ct":"","sellPrice":29,"addr":"朝阳区北辰东路5号（鸟巢正北一公里）","preferential":0,"sellmin":0,"sell":true,"brd":"保利国际影城","dis":"亚运村","imax":0,"poiId":61574,"lat":40.005745,"lng":116.39992,"id":40},{"brdId":24377,"dealPrice":0,"referencePrice":90,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"百丽宫影城(国贸店)","ct":"","sellPrice":48,"addr":"朝阳区建国门外大街1号国贸商城区域三地下一层3B120","preferential":0,"sellmin":0,"sell":true,"brd":"百老汇影城","dis":"国贸","imax":0,"poiId":3281398,"lat":39.91279,"lng":116.45982,"id":23},{"brdId":24595,"dealPrice":0,"referencePrice":35,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"博纳国际影城(悠唐店)","ct":"","sellPrice":44,"addr":"朝阳区三丰北里2号楼悠唐生活广场B1楼（近钱柜）","preferential":0,"sellmin":0,"sell":true,"brd":"博纳国际影城","dis":"朝外大街","imax":1,"poiId":63,"lat":39.921932,"lng":116.4385,"id":116},{"brdId":24804,"dealPrice":0,"referencePrice":40,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"传奇时代影城(蓝色港湾店)","ct":"","sellPrice":39.5,"addr":"朝阳区朝阳公园路6号蓝色港湾国际商区SA-42（朝阳公园西北角）","preferential":0,"sellmin":0,"sell":true,"brd":"传奇时代影城","dis":"亮马桥","imax":0,"poiId":297916,"lat":39.948925,"lng":116.47621,"id":132},{"brdId":24745,"dealPrice":0,"referencePrice":80,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"橙天嘉禾影城(凤凰城店)","ct":"","sellPrice":33.5,"addr":"朝阳区曙光西里甲5号院24号楼凤凰汇三层","preferential":0,"sellmin":0,"sell":true,"brd":"橙天嘉禾影城","dis":"三元桥","imax":0,"poiId":1465641,"lat":39.963345,"lng":116.457664,"id":2081},{"brdId":635050,"dealPrice":36,"referencePrice":60,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"朝阳区","nm":"朝阳剧场","ct":"","sellPrice":38,"addr":"朝阳区东三环北路36号呼家楼北（近朝阳北路）","preferential":0,"sellmin":0,"sell":true,"brd":"朝阳剧场","dis":"亮马桥","imax":0,"poiId":82595,"lat":39.922314,"lng":116.462105,"id":249},{"brdId":384262,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"大地数字影院(望京新天地店)","ct":"","sellPrice":38,"addr":"朝阳区望京阜安西街11号楼合生麒麟新天地2层","preferential":0,"sellmin":0,"sell":true,"brd":"大地影院","dis":"","imax":0,"poiId":4036242,"lat":39.99817,"lng":116.47787,"id":7881},{"brdId":133085,"dealPrice":0,"referencePrice":43,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"东都影城","ct":"","sellPrice":44,"addr":"朝阳区东四环中路195号华腾新天地五层","preferential":0,"sellmin":0,"sell":true,"brd":"东都影城","dis":"大望路","imax":0,"poiId":30903,"lat":39.885048,"lng":116.48847,"id":262},{"brdId":384262,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"大地影院(垡头永辉店)","ct":"","sellPrice":38,"addr":"朝阳区南杨庄路与武基街交叉口西南方向50米路南（垡头永辉超市，翠城馨园401号楼地下一层）","preferential":0,"sellmin":0,"sell":true,"brd":"大地影院","dis":"","imax":0,"poiId":41877507,"lat":39.856857,"lng":116.50524,"id":10954},{"brdId":384262,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"大地影院(十里河铭泽影院 )","ct":"","sellPrice":38,"addr":"朝阳区西大望南路与弘燕南一路交叉口铭泽生活广场5层","preferential":0,"sellmin":0,"sell":true,"brd":"大地影院","dis":"","imax":0,"poiId":40086376,"lat":39.864407,"lng":116.47688,"id":10951},{"brdId":0,"dealPrice":39.6,"referencePrice":80,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"朝阳区","nm":"海航文化天宝国际影城","ct":"","sellPrice":23,"addr":"朝阳区祁家豁子8号健翔大厦家乐福超市B1层","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"亚运村","imax":0,"poiId":1098864,"lat":39.98034,"lng":116.38147,"id":31},{"brdId":28975,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"红星太平洋电影城(爱琴海购物中心店)","ct":"","sellPrice":43,"addr":"朝阳区七圣中街12号院爱琴海购物中心6层","preferential":0,"sellmin":0,"sell":true,"brd":"太平洋电影城","dis":"","imax":0,"poiId":5948789,"lat":39.97224,"lng":116.436386,"id":7619},{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"华谊兄弟电影汇","ct":"","sellPrice":198,"addr":"朝阳区新源南路甲2号华谊兄弟办公楼首层","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"","imax":0,"poiId":112208438,"lat":39.948593,"lng":116.45831,"id":16467},{"brdId":26413,"dealPrice":30,"referencePrice":70,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"朝阳区","nm":"嘉华国际影城(活力东方店)","ct":"","sellPrice":29,"addr":"朝阳区姚家园路甲1号活力东方奥特莱斯购物中心4楼","preferential":0,"sellmin":0,"sell":true,"brd":"嘉华国际影城","dis":"","imax":0,"poiId":2578227,"lat":39.940395,"lng":116.52246,"id":5987},{"brdId":1082447,"dealPrice":0,"referencePrice":30,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"金鸡百花影城","ct":"","sellPrice":38,"addr":"朝阳区北三环东路22号","preferential":0,"sellmin":0,"sell":true,"brd":"金鸡百花影城","dis":"左家庄","imax":0,"poiId":89000,"lat":39.96894,"lng":116.42397,"id":256},{"brdId":252281,"dealPrice":0,"referencePrice":30,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"劲松电影院","ct":"","sellPrice":33,"addr":"朝阳区劲松中街404号","preferential":0,"sellmin":0,"sell":true,"brd":"劲松电影院","dis":"劲松","imax":0,"poiId":82588,"lat":39.88321,"lng":116.45597,"id":236},{"brdId":1079568,"dealPrice":0,"referencePrice":80,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"金逸影城(朝阳大悦城IMAX店)","ct":"","sellPrice":54,"addr":"朝阳区朝阳北路101号朝阳大悦城商场8层","preferential":0,"sellmin":0,"sell":true,"brd":"金逸影城","dis":"十里堡","imax":1,"poiId":1548100,"lat":39.924355,"lng":116.51871,"id":88},{"brdId":1079568,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"金逸影城(双桥店)","ct":"","sellPrice":39,"addr":"朝阳区双桥路3号东星时尚广场5层","preferential":0,"sellmin":0,"sell":true,"brd":"金逸影城","dis":"管庄","imax":0,"poiId":1439570,"lat":39.90879,"lng":116.57644,"id":1692},{"brdId":292030,"dealPrice":0,"referencePrice":50,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"卢米埃影城(芳草地店)","ct":"","sellPrice":58.5,"addr":"朝阳区东大桥路9号侨福芳草地购物中心LG2-26（尚都SOHO对面）","preferential":0,"sellmin":0,"sell":true,"brd":"卢米埃影城","dis":"","imax":0,"poiId":332108,"lat":39.91955,"lng":116.44965,"id":5736},{"brdId":292030,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"卢米埃影城(长楹天街IMAX店)","ct":"","sellPrice":38.5,"addr":"朝阳区朝阳北路长楹天街购物中心东区5F-09","preferential":0,"sellmin":0,"sell":true,"brd":"卢米埃影城","dis":"","imax":1,"poiId":52539636,"lat":39.92509,"lng":116.60262,"id":13204},{"brdId":27424,"dealPrice":25,"referencePrice":70,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"朝阳区","nm":"鲁信影城(立水桥店)","ct":"","sellPrice":25,"addr":"朝阳区立清路明天第一城7号院，蓝黛时空汇内","preferential":0,"sellmin":0,"sell":true,"brd":"鲁信影城","dis":"北苑家园","imax":0,"poiId":1541423,"lat":40.04711,"lng":116.4083,"id":1732},{"brdId":27617,"dealPrice":0,"referencePrice":80,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"美嘉欢乐影城(三里屯店)","ct":"","sellPrice":69,"addr":"朝阳区三里屯太古里地下一层（三里屯酒吧街南口西侧）","preferential":0,"sellmin":0,"sell":true,"brd":"美嘉欢乐影城","dis":"三里屯","imax":0,"poiId":30915,"lat":39.93429,"lng":116.454384,"id":136},{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"米瑞酷电影院","ct":"","sellPrice":33,"addr":"朝阳区神路街39号10幢","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"","imax":0,"poiId":108119917,"lat":39.919456,"lng":116.44396,"id":16179},{"brdId":102642,"dealPrice":0,"referencePrice":80,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"万达国际影城(CBD店)","ct":"","sellPrice":48,"addr":"朝阳区建国路93号万达广场B座3层","preferential":0,"sellmin":0,"sell":true,"brd":"万达影城","dis":"大望路","imax":1,"poiId":30863,"lat":39.909027,"lng":116.4709,"id":264},{"brdId":29462,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"沃美影城(常营店)","ct":"","sellPrice":39,"addr":"朝阳区朝阳北路17号（地铁6号线常营站B出口）北京华联购物中心四层","preferential":0,"sellmin":0,"sell":true,"brd":"沃美影城","dis":"","imax":0,"poiId":5529977,"lat":39.926247,"lng":116.59568,"id":8065},{"brdId":0,"dealPrice":34.5,"referencePrice":60,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"朝阳区","nm":"星环影城(立水桥店)","ct":"","sellPrice":38,"addr":"朝阳区立汤路201号东亚奥北南区北门一楼（华泰汽车斜对面，立水桥地铁A口北行150米）","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"","imax":0,"poiId":3260787,"lat":40.05452,"lng":116.41205,"id":9914},{"brdId":30032,"dealPrice":0,"referencePrice":35,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"星美国际影城(世界城店)","ct":"","sellPrice":49,"addr":"朝阳区金汇路8号世界城E座B1楼（世贸天阶商业街北侧）","preferential":0,"sellmin":0,"sell":true,"brd":"星美国际影城","dis":"朝外大街","imax":0,"poiId":316112,"lat":39.917755,"lng":116.45232,"id":98},{"brdId":30032,"dealPrice":0,"referencePrice":40,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"星美国际影城(望京店)","ct":"","sellPrice":36,"addr":"朝阳区望京街9号望京国际商业中心A座4楼","preferential":0,"sellmin":0,"sell":true,"brd":"星美国际影城","dis":"望京","imax":0,"poiId":1558123,"lat":39.990322,"lng":116.48359,"id":175},{"brdId":275830,"dealPrice":35,"referencePrice":80,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"朝阳区","nm":"新影联·华谊兄弟影院(望京店)","ct":"","sellPrice":39,"addr":"朝阳区广顺北大街16号望京华彩商业中心B1a","preferential":0,"sellmin":0,"sell":true,"brd":"华谊兄弟影院","dis":"望京","imax":0,"poiId":82583,"lat":40.01051,"lng":116.46821,"id":72},{"brdId":30206,"dealPrice":28,"referencePrice":70,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"朝阳区","nm":"阳光影城(安立路店)","ct":"","sellPrice":33,"addr":"朝阳区安立路68号飘亮广场B1层","preferential":0,"sellmin":0,"sell":true,"brd":"阳光影城","dis":"亚运村","imax":0,"poiId":90846,"lat":39.997986,"lng":116.409164,"id":174},{"brdId":30227,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"耀莱成龙国际影城(慈云寺店)","ct":"","sellPrice":38,"addr":"朝阳区慈云寺北里209号未来汇二层（未来汇广场）","preferential":0,"sellmin":0,"sell":true,"brd":"耀莱成龙国际影城","dis":"","imax":0,"poiId":4230363,"lat":39.916008,"lng":116.49176,"id":9730},{"brdId":0,"dealPrice":31,"referencePrice":0,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"朝阳区","nm":"中国木偶艺术剧院","ct":"","sellPrice":23,"addr":"朝阳区安华西里甲1号","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"安贞","imax":0,"poiId":82596,"lat":39.96802,"lng":116.40147,"id":252},{"brdId":31014,"dealPrice":21,"referencePrice":35,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"朝阳区","nm":"紫光影城(蓝岛店)","ct":"","sellPrice":33,"addr":"朝阳区朝外大街8号（蓝岛大厦西区5-6层）","preferential":0,"sellmin":0,"sell":true,"brd":"紫光影城","dis":"朝外大街","imax":0,"poiId":3274641,"lat":39.922623,"lng":116.44817,"id":259},{"brdId":651783,"dealPrice":61,"referencePrice":100,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"朝阳区","nm":"枫花园汽车影院","ct":"","sellPrice":0,"addr":"朝阳区亮马桥路21号（朝阳公园北门对面）","preferential":0,"sellmin":0,"sell":false,"brd":"枫花园汽车影院","dis":"亮马桥","imax":0,"poiId":271415,"lat":39.95855,"lng":116.48107,"id":254},{"brdId":0,"dealPrice":31,"referencePrice":0,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"朝阳区","nm":"曙光影院","ct":"","sellPrice":0,"addr":"朝阳区垡头西里44号垡头文化中心B1","preferential":0,"sellmin":0,"sell":false,"brd":"其它","dis":"垡头西里","imax":0,"poiId":3305306,"lat":39.861492,"lng":116.51347,"id":4548},{"brdId":0,"dealPrice":0,"referencePrice":40,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"朝阳区","nm":"中国电影博物馆","ct":"","sellPrice":0,"addr":"朝阳区南影路9号","preferential":0,"sellmin":0,"sell":false,"brd":"其它","dis":"草场地","imax":1,"poiId":1436410,"lat":39.9962,"lng":116.521,"id":181}],"海淀区":[{"brdId":23854,"dealPrice":0,"referencePrice":60,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"海淀区","nm":"17.5影城(今典花园店)","ct":"","sellPrice":44,"addr":"海淀区文慧园路9号今典花园9号楼空间蒙太奇大厦1层","preferential":0,"sellmin":0,"sell":true,"brd":"17.5影城","dis":"北太平庄","imax":0,"poiId":273950,"lat":39.95334,"lng":116.36104,"id":154},{"brdId":23854,"dealPrice":0,"referencePrice":70,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"海淀区","nm":"17.5影城(今日家园店)","ct":"","sellPrice":44,"addr":"海淀区西翠路5号今日家园8号楼苏宁电器地下一层（太平路沃尔玛超市旁）","preferential":0,"sellmin":0,"sell":true,"brd":"17.5影城","dis":"五棵松","imax":0,"poiId":3260713,"lat":39.900616,"lng":116.28245,"id":102},{"brdId":23854,"dealPrice":0,"referencePrice":45,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"海淀区","nm":"17.5影城(四道口店)","ct":"","sellPrice":39,"addr":"海淀区大钟寺四道口2号京果商厦B座三层北侧","preferential":0,"sellmin":0,"sell":true,"brd":"17.5影城","dis":"北下关","imax":0,"poiId":48958,"lat":39.959427,"lng":116.34575,"id":25},{"brdId":2020418,"dealPrice":0,"referencePrice":40,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"海淀区","nm":"CGV星聚汇影城(清河店)","ct":"","sellPrice":57,"addr":"海淀区清河中街68号华润五彩城购物中心东区7层","preferential":0,"sellmin":0,"sell":true,"brd":"CGV影城","dis":"","imax":0,"poiId":2374984,"lat":40.030476,"lng":116.334724,"id":5111},{"brdId":24071,"dealPrice":0,"referencePrice":70,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"海淀区","nm":"UME国际影城(华星店)","ct":"","sellPrice":39.5,"addr":"海淀区双榆树科学院南路44号（双安商场对面）","preferential":0,"sellmin":0,"sell":true,"brd":"UME国际影城","dis":"中关村","imax":1,"poiId":1436373,"lat":39.967793,"lng":116.326096,"id":155},{"brdId":24595,"dealPrice":0,"referencePrice":80,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"海淀区","nm":"博纳国际影城(万寿路店)","ct":"","sellPrice":34,"addr":"海淀区复兴路51号凯德晶品购物中心4层","preferential":0,"sellmin":0,"sell":true,"brd":"博纳国际影城","dis":"万寿路","imax":0,"poiId":1460949,"lat":39.908405,"lng":116.29659,"id":1624},{"brdId":24745,"dealPrice":0,"referencePrice":80,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"海淀区","nm":"橙天嘉禾影城(吉彩店)","ct":"","sellPrice":24.5,"addr":"海淀区玉海园五里22号配套商业楼（原吉彩体育馆）","preferential":0,"sellmin":0,"sell":true,"brd":"橙天嘉禾影城","dis":"","imax":0,"poiId":2393106,"lat":39.922768,"lng":116.25956,"id":5313},{"brdId":24745,"dealPrice":0,"referencePrice":80,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"海淀区","nm":"橙天嘉禾影城(上地店)","ct":"","sellPrice":33.5,"addr":"海淀区上地南口华联商厦4F","preferential":0,"sellmin":0,"sell":true,"brd":"橙天嘉禾影城","dis":"上地","imax":0,"poiId":14447,"lat":40.02865,"lng":116.31154,"id":130},{"brdId":24745,"dealPrice":0,"referencePrice":80,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"海淀区","nm":"橙天嘉禾影城(万柳店)","ct":"","sellPrice":33.5,"addr":"海淀区巴沟路2号华联万柳购物中心5层","preferential":0,"sellmin":0,"sell":true,"brd":"橙天嘉禾影城","dis":"苏州桥","imax":0,"poiId":3303603,"lat":39.97296,"lng":116.29486,"id":86},{"brdId":384262,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"海淀区","nm":"大地影院(西三旗物美店)","ct":"","sellPrice":33,"addr":"海淀区悦秀路99号二层","preferential":0,"sellmin":0,"sell":true,"brd":"大地影院","dis":"","imax":0,"poiId":4845675,"lat":40.04733,"lng":116.33703,"id":7433},{"brdId":0,"dealPrice":0,"referencePrice":80,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"海淀区","nm":"国安剧院","ct":"","sellPrice":33,"addr":"海淀区花园东路甲16号","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"北太平庄","imax":0,"poiId":294883,"lat":39.981472,"lng":116.37021,"id":251},{"brdId":0,"dealPrice":26,"referencePrice":60,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"海淀区","nm":"国图影院","ct":"","sellPrice":28,"addr":"海淀区中关村南大街33号国家图书馆内","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"魏公村","imax":0,"poiId":271442,"lat":39.94304,"lng":116.32312,"id":238},{"brdId":0,"dealPrice":28,"referencePrice":30,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"海淀区","nm":"海淀工人文化宫","ct":"","sellPrice":33,"addr":"海淀区万柳华府北街2号（万柳华联商城南门对面）","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"苏州桥","imax":0,"poiId":38025,"lat":39.971443,"lng":116.295105,"id":141},{"brdId":0,"dealPrice":31,"referencePrice":80,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"海淀区","nm":"海淀剧院","ct":"","sellPrice":38,"addr":"海淀区中关村大街28号","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"中关村","imax":0,"poiId":17899,"lat":39.97669,"lng":116.31822,"id":257},{"brdId":26413,"dealPrice":0,"referencePrice":70,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"海淀区","nm":"嘉华国际影城(学清路店)","ct":"","sellPrice":39,"addr":"海淀区学清路甲8号圣熙8号购物中心5层西侧（学清路）","preferential":0,"sellmin":0,"sell":true,"brd":"嘉华国际影城","dis":"五道口","imax":0,"poiId":84440,"lat":40.008587,"lng":116.35387,"id":70},{"brdId":1079568,"dealPrice":0,"referencePrice":60,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"海淀区","nm":"金逸影城(新都店)","ct":"","sellPrice":24,"addr":"海淀区西三旗建材城中路6号新都购物广场1层","preferential":0,"sellmin":0,"sell":true,"brd":"金逸影城","dis":"清河","imax":0,"poiId":1549060,"lat":40.060005,"lng":116.36541,"id":58},{"brdId":1079568,"dealPrice":0,"referencePrice":80,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"海淀区","nm":"金逸影城(中关村店)","ct":"","sellPrice":59,"addr":"海淀区中关村大街19号新中关购物中心B1层","preferential":0,"sellmin":0,"sell":true,"brd":"金逸影城","dis":"中关村","imax":0,"poiId":276722,"lat":39.978382,"lng":116.31445,"id":152},{"brdId":27617,"dealPrice":43.9,"referencePrice":80,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"海淀区","nm":"美嘉欢乐影城(中关村店)","ct":"","sellPrice":64,"addr":"海淀区中关村大街15号中关村广场购物中心津乐汇3楼（地铁中关村站D口出西侧）","preferential":0,"sellmin":0,"sell":true,"brd":"美嘉欢乐影城","dis":"三里屯","imax":0,"poiId":279439,"lat":39.983105,"lng":116.31355,"id":197},{"brdId":28741,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"海淀区","nm":"世茂国际影城(羊坊店路店)","ct":"","sellPrice":23,"addr":"海淀区羊坊店路18号光耀东方4层","preferential":0,"sellmin":0,"sell":true,"brd":"世茂国际影城","dis":"","imax":0,"poiId":3251410,"lat":39.900352,"lng":116.322586,"id":6483},{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"海淀区","nm":"天幕新彩云国际影城","ct":"","sellPrice":33,"addr":"海淀区北三环中路中视云投大厦","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"","imax":0,"poiId":4480546,"lat":39.969345,"lng":116.3678,"id":13003},{"brdId":0,"dealPrice":31,"referencePrice":35,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"海淀区","nm":"五道口工人俱乐部电影院","ct":"","sellPrice":33,"addr":"海淀区成府路23号（近五道口城铁站）","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"五道口","imax":0,"poiId":82591,"lat":39.99351,"lng":116.33939,"id":258},{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"海淀区","nm":"万画影城","ct":"","sellPrice":23,"addr":"海淀区西四环北路金四季购物中心中段三层B003","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"","imax":0,"poiId":41066531,"lat":39.94469,"lng":116.27137,"id":13054},{"brdId":29894,"dealPrice":0,"referencePrice":70,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"海淀区","nm":"新华国际影城(宝盛店)","ct":"","sellPrice":35,"addr":"海淀区宝盛北里西区28号兴美生活广场5层","preferential":0,"sellmin":0,"sell":true,"brd":"新华国际影城","dis":"","imax":0,"poiId":2408760,"lat":40.037056,"lng":116.370605,"id":5359},{"brdId":29894,"dealPrice":0,"referencePrice":80,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"海淀区","nm":"新华国际影城(大钟寺店)","ct":"","sellPrice":28,"addr":"海淀区北三环18号院大钟寺中坤广场C座3层（地铁13号线大钟寺站出站即到）","preferential":0,"sellmin":0,"sell":true,"brd":"新华国际影城","dis":"大钟寺","imax":0,"poiId":1524564,"lat":39.96573,"lng":116.34114,"id":1589},{"brdId":30032,"dealPrice":0,"referencePrice":35,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"海淀区","nm":"星美国际影城(金源店)","ct":"","sellPrice":52,"addr":"海淀区远大路1号金源时代购物中心5楼东首（近蓝靛厂北路）","preferential":0,"sellmin":0,"sell":true,"brd":"星美国际影城","dis":"远大路","imax":0,"poiId":271447,"lat":39.95867,"lng":116.2889,"id":271},{"brdId":30227,"dealPrice":0,"referencePrice":70,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"海淀区","nm":"耀莱成龙国际影城(五棵松店)","ct":"","sellPrice":38,"addr":"海淀区复兴路69号卓展购物中心5层（五棵松体育馆北门正对面）","preferential":0,"sellmin":0,"sell":true,"brd":"耀莱成龙国际影城","dis":"五棵松","imax":0,"poiId":335220,"lat":39.913418,"lng":116.2794,"id":87},{"brdId":30227,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"海淀区","nm":"耀莱成龙国际影城(温泉镇店)","ct":"","sellPrice":23,"addr":"海淀区温泉镇北部文化中心D座","preferential":0,"sellmin":0,"sell":true,"brd":"耀莱成龙国际影城","dis":"","imax":0,"poiId":116256540,"lat":40.042526,"lng":116.18892,"id":16285},{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"海淀区","nm":"中间影院","ct":"","sellPrice":23,"addr":"海淀区杏石口路中间艺术园区内","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"","imax":0,"poiId":4572438,"lat":39.954147,"lng":116.23201,"id":9459},{"brdId":23745,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"海淀区","nm":"中影电影院(小西天店)","ct":"","sellPrice":39,"addr":"海淀区新街口外大街25号（小西天牌楼北侧）","preferential":0,"sellmin":0,"sell":true,"brd":"中影国际影城","dis":"","imax":0,"poiId":82594,"lat":39.95296,"lng":116.37117,"id":9916},{"brdId":271399,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"海淀区","nm":"华影国际影城(花园路店)","ct":"","sellPrice":0,"addr":"海淀区花园路甲13号庚坊国际发展中心B1层","preferential":0,"sellmin":0,"sell":false,"brd":"华影国际影城","dis":"","imax":0,"poiId":4744457,"lat":39.972046,"lng":116.36422,"id":7985},{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"海淀区","nm":"中国电影资料馆","ct":"","sellPrice":33,"addr":"海淀区文慧园路3号","preferential":0,"sellmin":0,"sell":false,"brd":"其它","dis":"新街口","imax":0,"poiId":1541424,"lat":39.953133,"lng":116.36986,"id":2010}],"大兴区":[{"brdId":2020418,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"大兴区","nm":"CGV星聚汇影城(亦庄店)","ct":"","sellPrice":23,"addr":"大兴区经济技术开发区荣京东街大族广场9号楼三层","preferential":0,"sellmin":0,"sell":true,"brd":"CGV影城","dis":"","imax":0,"poiId":105355906,"lat":39.790707,"lng":116.51294,"id":16152},{"brdId":2880988,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"大兴区","nm":"SFC上影影城(大兴龙湖店)","ct":"","sellPrice":34,"addr":"大兴区永兴路7号院1号楼3F-Z2","preferential":0,"sellmin":0,"sell":true,"brd":"SFC上影影城","dis":"","imax":1,"poiId":96251713,"lat":39.687492,"lng":116.3205,"id":15915},{"brdId":24472,"dealPrice":0,"referencePrice":70,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"大兴区","nm":"保利国际影城(绿地缤纷城店)","ct":"","sellPrice":34,"addr":"大兴区金星西路3号绿地缤纷城购物中心4层","preferential":0,"sellmin":0,"sell":true,"brd":"保利国际影城","dis":"绿地缤纷城","imax":0,"poiId":1481117,"lat":39.764687,"lng":116.33482,"id":2392},{"brdId":24930,"dealPrice":0,"referencePrice":80,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"大兴区","nm":"大料国际影城(创意生活广场店)","ct":"","sellPrice":28,"addr":"大兴区亦庄经济开发区文化园东路6号创意生活广场三层","preferential":0,"sellmin":0,"sell":true,"brd":"大料国际影城","dis":"亦庄","imax":0,"poiId":82601,"lat":39.810535,"lng":116.50513,"id":34},{"brdId":381835,"dealPrice":0,"referencePrice":21,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"大兴区","nm":"大兴影剧院","ct":"","sellPrice":23,"addr":"大兴区黄村西大街15号","preferential":0,"sellmin":0,"sell":true,"brd":"大兴剧院","dis":"黄村","imax":0,"poiId":324698,"lat":39.7323,"lng":116.338005,"id":179},{"brdId":352923,"dealPrice":0,"referencePrice":70,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"大兴区","nm":"嘉美国际影城(旧宫店)","ct":"","sellPrice":23,"addr":"大兴区旧宫小红门路39号","preferential":0,"sellmin":0,"sell":true,"brd":"嘉美国际影城","dis":"","imax":0,"poiId":6685358,"lat":39.814774,"lng":116.454636,"id":2598},{"brdId":1079568,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"大兴区","nm":"金逸影城(荟聚IMAX店)","ct":"","sellPrice":44,"addr":"大兴区欣宁街荟聚购物中心3层（地铁4号线西红门站A西出口站）","preferential":0,"sellmin":0,"sell":true,"brd":"金逸影城","dis":"","imax":1,"poiId":40697227,"lat":39.78879,"lng":116.32654,"id":10987},{"brdId":292030,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"大兴区","nm":"卢米埃影城(万科店)","ct":"","sellPrice":28.5,"addr":"大兴区忠凉路万科广场5层","preferential":0,"sellmin":0,"sell":true,"brd":"卢米埃影城","dis":"","imax":0,"poiId":93511270,"lat":39.80576,"lng":116.460175,"id":15773},{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"大兴区","nm":"唐阁影城(亦庄店)","ct":"","sellPrice":29,"addr":"大兴区经济技术开发区荣华中路8号院华联力宝购物中心四层","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"","imax":0,"poiId":5165994,"lat":39.806152,"lng":116.50166,"id":11132},{"brdId":29894,"dealPrice":36,"referencePrice":40,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"大兴区","nm":"新华国际影城(大兴店)","ct":"","sellPrice":23,"addr":"大兴区黄村东大街火神庙国际商业中心E座5层","preferential":0,"sellmin":0,"sell":true,"brd":"新华国际影城","dis":"黄村","imax":0,"poiId":86394,"lat":39.72971,"lng":116.34167,"id":11},{"brdId":30032,"dealPrice":0,"referencePrice":70,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"大兴区","nm":"星美国际影城(西红门店)","ct":"","sellPrice":24,"addr":"大兴区西红门镇京良路10号乐家购物中心B区3层","preferential":0,"sellmin":0,"sell":true,"brd":"星美国际影城","dis":"","imax":0,"poiId":2490890,"lat":39.799633,"lng":116.33217,"id":6057},{"brdId":30227,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"大兴区","nm":"耀莱成龙国际影城(西红门店)","ct":"","sellPrice":38,"addr":"大兴区欣旺北大街8号鸿坤广场6层（地铁4号线西红门站Ｂ口向东４００米路北）","preferential":0,"sellmin":0,"sell":true,"brd":"耀莱成龙国际影城","dis":"","imax":0,"poiId":41278576,"lat":39.791393,"lng":116.340256,"id":11082},{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"大兴区","nm":"中传国际影城(亦庄店)","ct":"","sellPrice":23,"addr":"大兴区经济技术开发区科创五街38号C座3层F3-C3006","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"","imax":0,"poiId":93839693,"lat":39.803543,"lng":116.53282,"id":15294},{"brdId":0,"dealPrice":29.6,"referencePrice":0,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"大兴区","nm":"最影城","ct":"","sellPrice":27.9,"addr":"大兴区兴华大街百联清城购物中心3层北侧","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"","imax":0,"poiId":95968537,"lat":39.73894,"lng":116.33174,"id":15018},{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"大兴区","nm":"玫瑰之约汽车影院(半壁店)","ct":"","sellPrice":0,"addr":"大兴区东大路多维创新园内","preferential":0,"sellmin":0,"sell":false,"brd":"其它","dis":"","imax":0,"poiId":51400779,"lat":39.629345,"lng":116.38453,"id":14054}],"东城区":[{"brdId":24071,"dealPrice":0,"referencePrice":70,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"东城区","nm":"UME国际影城(安贞店)","ct":"","sellPrice":39.5,"addr":"东城区北三环安贞桥环球贸易中心E座","preferential":0,"sellmin":0,"sell":true,"brd":"UME国际影城","dis":"安贞","imax":0,"poiId":94496,"lat":39.966072,"lng":116.41096,"id":99},{"brdId":24377,"dealPrice":0,"referencePrice":80,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"东城区","nm":"百丽宫影城(金宝汇店)","ct":"","sellPrice":43,"addr":"东城区金宝街88号金宝汇7层","preferential":0,"sellmin":0,"sell":true,"brd":"百老汇影城","dis":"王府井","imax":0,"poiId":1076058,"lat":39.9152,"lng":116.42129,"id":122},{"brdId":24377,"dealPrice":0,"referencePrice":80,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"东城区","nm":"百老汇电影中心(万国城店)","ct":"","sellPrice":43,"addr":"东城区香河园路1号当代MOMA北区T4座","preferential":0,"sellmin":0,"sell":true,"brd":"百老汇影城","dis":"东直门","imax":0,"poiId":1076062,"lat":39.950455,"lng":116.43878,"id":94},{"brdId":24377,"dealPrice":0,"referencePrice":70,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"东城区","nm":"百老汇影城(apm购物中心店)","ct":"","sellPrice":43,"addr":"东城区王府井大街138号北京apm6层","preferential":0,"sellmin":0,"sell":true,"brd":"百老汇影城","dis":"王府井","imax":0,"poiId":271444,"lat":39.914005,"lng":116.41193,"id":267},{"brdId":24377,"dealPrice":0,"referencePrice":40,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"东城区","nm":"百老汇影城(东方广场店)","ct":"","sellPrice":43,"addr":"东城区东长安街1号东方广场地下1层","preferential":0,"sellmin":0,"sell":true,"brd":"百老汇影城","dis":"王府井","imax":0,"poiId":271409,"lat":39.909454,"lng":116.411934,"id":269},{"brdId":24377,"dealPrice":0,"referencePrice":80,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"东城区","nm":"百老汇影城(国瑞购物中心店)","ct":"","sellPrice":43,"addr":"东城区崇文门外大街18号国瑞城购物中心首层/-2层","preferential":0,"sellmin":0,"sell":true,"brd":"百老汇影城","dis":"崇文门","imax":0,"poiId":1048975,"lat":39.897575,"lng":116.420135,"id":119},{"brdId":125212,"dealPrice":0,"referencePrice":30,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"东城区","nm":"东宫影剧院","ct":"","sellPrice":31,"addr":"东城区隆福寺街47号东四工人文化宫","preferential":0,"sellmin":0,"sell":true,"brd":"东宫影剧院","dis":"东四","imax":0,"poiId":60166,"lat":39.9253,"lng":116.41552,"id":242},{"brdId":25181,"dealPrice":29,"referencePrice":80,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"东城区","nm":"东环影城","ct":"","sellPrice":38,"addr":"东城区东中街9号东环广场B座B1楼","preferential":0,"sellmin":0,"sell":true,"brd":"东环影城","dis":"东直门","imax":0,"poiId":43786,"lat":39.936527,"lng":116.43607,"id":265},{"brdId":26045,"dealPrice":31,"referencePrice":70,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"东城区","nm":"横店电影城(王府井店)","ct":"","sellPrice":24,"addr":"东城区王府井大街251-253号8层","preferential":0,"sellmin":0,"sell":true,"brd":"横店电影城","dis":"王府井","imax":0,"poiId":1549949,"lat":39.913864,"lng":116.41057,"id":79},{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"东城区","nm":"青春光线电影院","ct":"","sellPrice":33,"addr":"东城区东滨河路乙一号雍和航星园内","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"","imax":0,"poiId":99389254,"lat":39.95059,"lng":116.42174,"id":15280},{"brdId":28916,"dealPrice":39,"referencePrice":80,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"东城区","nm":"搜秀影城","ct":"","sellPrice":38,"addr":"东城区崇外大街40号搜秀城9层","preferential":0,"sellmin":0,"sell":true,"brd":"搜秀影城","dis":"崇文门","imax":0,"poiId":82579,"lat":39.896397,"lng":116.419266,"id":270},{"brdId":30227,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"东城区","nm":"耀莱成龙国际影城(王府井店)","ct":"","sellPrice":38,"addr":"东城区王府井大街301号新燕莎购物中心地下一层西侧（地铁一号线王府井站出C2口向北步行200米路西）","preferential":0,"sellmin":0,"sell":true,"brd":"耀莱成龙国际影城","dis":"","imax":0,"poiId":6074394,"lat":39.90959,"lng":116.41121,"id":10781},{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"东城区","nm":"北京站电影院","ct":"","sellPrice":0,"addr":"东城区毛家湾胡同甲13号站西侧3层","preferential":0,"sellmin":0,"sell":false,"brd":"其它","dis":"","imax":0,"poiId":52795616,"lat":39.903954,"lng":116.4272,"id":14472},{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"东城区","nm":"东城图书馆影剧院","ct":"","sellPrice":0,"addr":"东城区交道口东大街85号区图书馆1楼","preferential":0,"sellmin":0,"sell":false,"brd":"其它","dis":"东四","imax":0,"poiId":271413,"lat":39.941,"lng":116.413,"id":4541}],"丰台区":[{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"丰台区","nm":"DMG国际影城(悦秀店)","ct":"","sellPrice":24,"addr":"丰台区开阳路8号悦秀城6层","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"","imax":0,"poiId":94444126,"lat":39.868313,"lng":116.375984,"id":15859},{"brdId":24472,"dealPrice":0,"referencePrice":40,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"丰台区","nm":"保利国际影城(凯德MALL·大峡谷店)","ct":"","sellPrice":39,"addr":"丰台区南三环西路16号凯德大峡谷购物中心5楼","preferential":0,"sellmin":0,"sell":true,"brd":"保利国际影城","dis":"草桥","imax":0,"poiId":339944,"lat":39.854645,"lng":116.36706,"id":42},{"brdId":24472,"dealPrice":27,"referencePrice":70,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"丰台区","nm":"保利国际影城(万源店)","ct":"","sellPrice":24,"addr":"丰台区东高地万源西里航天万源广场5层","preferential":0,"sellmin":0,"sell":true,"brd":"保利国际影城","dis":"东高地","imax":0,"poiId":299479,"lat":39.80296,"lng":116.423454,"id":129},{"brdId":24595,"dealPrice":0,"referencePrice":80,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"丰台区","nm":"博纳国际影城(方庄店)","ct":"","sellPrice":39,"addr":"丰台区蒲黄榆路28号","preferential":0,"sellmin":0,"sell":true,"brd":"博纳国际影城","dis":"方庄","imax":0,"poiId":82556,"lat":39.863983,"lng":116.42227,"id":43},{"brdId":384262,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"丰台区","nm":"大地影院(欣雅汇店)","ct":"","sellPrice":23,"addr":"丰台区果园8号楼临三环（木樨园桥-西南角欣雅汇生活广场6层）","preferential":0,"sellmin":0,"sell":true,"brd":"大地影院","dis":"","imax":0,"poiId":78978010,"lat":39.855907,"lng":116.397896,"id":15070},{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"丰台区","nm":"东融国际影城(草桥店)","ct":"","sellPrice":22.9,"addr":"丰台区草桥东路1号上品折扣3层","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"","imax":0,"poiId":113165716,"lat":39.850945,"lng":116.35827,"id":16458},{"brdId":275830,"dealPrice":0,"referencePrice":80,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"丰台区","nm":"华谊兄弟影院(洋桥店)","ct":"","sellPrice":26,"addr":"丰台区马家堡东路101号院10号银泰百货6层","preferential":0,"sellmin":0,"sell":true,"brd":"华谊兄弟影院","dis":"","imax":1,"poiId":1547150,"lat":39.84446,"lng":116.38594,"id":2548},{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"丰台区","nm":"青少年剧场","ct":"","sellPrice":33,"addr":"丰台区西四环南路86号","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"","imax":0,"poiId":271414,"lat":39.851784,"lng":116.28421,"id":4542},{"brdId":30053,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"丰台区","nm":"幸福蓝海国际影城(北京公益桥店)","ct":"","sellPrice":24,"addr":"丰台区角门路19号院2号楼华冠天地4层（原大万广场）","preferential":0,"sellmin":0,"sell":true,"brd":"幸福蓝海国际影城","dis":"","imax":0,"poiId":5161700,"lat":39.836674,"lng":116.37848,"id":8578},{"brdId":30032,"dealPrice":0,"referencePrice":35,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"丰台区","nm":"星美国际影城(分钟寺店)","ct":"","sellPrice":44,"addr":"丰台区南三环东路成寿寺路2号新业广场2楼","preferential":0,"sellmin":0,"sell":true,"brd":"星美国际影城","dis":"方庄","imax":0,"poiId":1436294,"lat":39.857136,"lng":116.44611,"id":9},{"brdId":677942,"dealPrice":0,"referencePrice":60,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"丰台区","nm":"正华影院","ct":"","sellPrice":33,"addr":"丰台区宋家庄顺八条4号政馨园三区5号楼底商正华商城地下一层","preferential":0,"sellmin":0,"sell":true,"brd":"正华影城","dis":"方庄","imax":0,"poiId":82600,"lat":39.845528,"lng":116.43179,"id":63},{"brdId":23745,"dealPrice":0,"referencePrice":30,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"丰台区","nm":"中影国际影城(丰台千禧街店)","ct":"","sellPrice":34.9,"addr":"丰台区靛场路千禧商业街4号楼","preferential":0,"sellmin":0,"sell":true,"brd":"中影国际影城","dis":"","imax":0,"poiId":6458108,"lat":39.889786,"lng":116.287766,"id":7634},{"brdId":23745,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"丰台区","nm":"中影国际影城(丰台永旺店)","ct":"","sellPrice":36.9,"addr":"丰台区丰葆路永旺梦乐城4层","preferential":0,"sellmin":0,"sell":true,"brd":"中影国际影城","dis":"","imax":0,"poiId":77423086,"lat":39.817265,"lng":116.292496,"id":14384},{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"丰台区","nm":"北京中鼎兆通信息科技电影放映中心影院","ct":"","sellPrice":0,"addr":"丰台区市辖区丰台区西四环南路38号-1","preferential":0,"sellmin":0,"sell":false,"brd":"其它","dis":"","imax":0,"poiId":95577364,"lat":39.856148,"lng":116.28398,"id":15271}],"西城区":[{"brdId":0,"dealPrice":0,"referencePrice":50,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"西城区","nm":"北京青年宫","ct":"","sellPrice":38,"addr":"西城区西直门南小街68号","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"西直门","imax":0,"poiId":271434,"lat":39.93531,"lng":116.35955,"id":260},{"brdId":392770,"dealPrice":0,"referencePrice":60,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"西城区","nm":"大观楼电影院","ct":"","sellPrice":34,"addr":"西城区前门大街大栅栏街36号","preferential":0,"sellmin":0,"sell":true,"brd":"大观楼影城","dis":"大栅栏","imax":0,"poiId":89010,"lat":39.895596,"lng":116.39515,"id":263},{"brdId":368740,"dealPrice":0,"referencePrice":50,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"西城区","nm":"地质礼堂","ct":"","sellPrice":43,"addr":"西城区西四羊肉胡同30号（中国地质博物馆南侧）","preferential":0,"sellmin":0,"sell":true,"brd":"地质礼堂","dis":"西四","imax":0,"poiId":89006,"lat":39.922535,"lng":116.371346,"id":261},{"brdId":0,"dealPrice":0,"referencePrice":40,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"西城区","nm":"广安门电影院","ct":"","sellPrice":34,"addr":"西城区白广路8号","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"广内大街","imax":0,"poiId":82592,"lat":39.88407,"lng":116.35917,"id":247},{"brdId":0,"dealPrice":0,"referencePrice":40,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"西城区","nm":"国宾菁英电影院","ct":"","sellPrice":33,"addr":"西城区月坛南街24号（近万方商场）","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"月坛","imax":0,"poiId":274294,"lat":39.913624,"lng":116.34325,"id":255},{"brdId":0,"dealPrice":0,"referencePrice":60,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"西城区","nm":"工人俱乐部电影院","ct":"","sellPrice":33,"addr":"西城区虎坊路口南7号","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"虎坊桥","imax":0,"poiId":1436438,"lat":39.888065,"lng":116.38378,"id":237},{"brdId":1162239,"dealPrice":0,"referencePrice":80,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"西城区","nm":"首都电影院(金融街店)","ct":"","sellPrice":44,"addr":"西城区金融大街18号地下一层","preferential":0,"sellmin":0,"sell":true,"brd":"首都电影院","dis":"复兴门","imax":0,"poiId":1541415,"lat":39.9151,"lng":116.36,"id":1625},{"brdId":1162239,"dealPrice":0,"referencePrice":60,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"西城区","nm":"首都电影院(西单店)","ct":"","sellPrice":44,"addr":"西城区西单北大街131号大悦城10楼（近西单苹果店）","preferential":0,"sellmin":0,"sell":true,"brd":"首都电影院","dis":"西单","imax":0,"poiId":283722,"lat":39.91066,"lng":116.373665,"id":149},{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"西城区","nm":"首都电影院(中华店)","ct":"","sellPrice":39,"addr":"西城区天桥南大街3号楼一层、二层","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"","imax":0,"poiId":93439511,"lat":39.884457,"lng":116.39819,"id":15270},{"brdId":30227,"dealPrice":0,"referencePrice":70,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"西城区","nm":"耀莱成龙国际影城(马连道店)","ct":"","sellPrice":38,"addr":"西城区马连道路25号新年华生活购物广场5层","preferential":0,"sellmin":0,"sell":true,"brd":"耀莱成龙国际影城","dis":"","imax":0,"poiId":2393654,"lat":39.877544,"lng":116.32643,"id":5278},{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"西城区","nm":"剧空间剧场","ct":"","sellPrice":0,"addr":"西城区新街口北大街74号（近北京科学教育电影制片厂院内）","preferential":0,"sellmin":0,"sell":false,"brd":"其它","dis":"","imax":0,"poiId":73944402,"lat":39.94392,"lng":116.37328,"id":14387},{"brdId":2876716,"dealPrice":0,"referencePrice":70,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"西城区","nm":"西单4D数字影院","ct":"","sellPrice":0,"addr":"西城区西单北大街180号西单文化广场","preferential":0,"sellmin":0,"sell":false,"brd":"西单4d数字影院","dis":"西单","imax":0,"poiId":271397,"lat":39.90875,"lng":116.37512,"id":137},{"brdId":593182,"dealPrice":0,"referencePrice":50,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"西城区","nm":"新街口电影院","ct":"","sellPrice":0,"addr":"西城区西直门内大街69号","preferential":0,"sellmin":0,"sell":false,"brd":"新街口电影院","dis":"西直门","imax":0,"poiId":82590,"lat":39.94168,"lng":116.37024,"id":243}],"通州区":[{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"通州区","nm":"北京东融国际影城(月亮河店)","ct":"","sellPrice":22.9,"addr":"通州区永顺镇芙蓉园513号楼","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"","imax":0,"poiId":99968119,"lat":39.919525,"lng":116.677376,"id":15421},{"brdId":24595,"dealPrice":0,"referencePrice":80,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"通州区","nm":"博纳国际影城(通州北苑店)","ct":"","sellPrice":39,"addr":"通州区杨庄北里52号华联天时名苑购物中心4楼（近通州北苑地铁站）","preferential":0,"sellmin":0,"sell":true,"brd":"博纳国际影城","dis":"新华联","imax":0,"poiId":363447,"lat":39.903496,"lng":116.6367,"id":2},{"brdId":24595,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"通州区","nm":"博纳国际影城(通州土桥店)","ct":"","sellPrice":24,"addr":"通州区八通线土桥地铁站向东900米华远好天地购物中心3层","preferential":0,"sellmin":0,"sell":true,"brd":"博纳国际影城","dis":"","imax":0,"poiId":51455681,"lat":39.86987,"lng":116.697586,"id":14381},{"brdId":825664,"dealPrice":25,"referencePrice":0,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"通州区","nm":"百尚影城","ct":"","sellPrice":28,"addr":"通州区马驹桥镇百尚生活广场3楼","preferential":0,"sellmin":0,"sell":true,"brd":"百尚影城","dis":"","imax":0,"poiId":2371476,"lat":39.752598,"lng":116.54536,"id":6227},{"brdId":384262,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"通州区","nm":"大地影城(米拉店)","ct":"","sellPrice":33,"addr":"通州区马驹桥新海东路1号（豪润生活广场7层）","preferential":0,"sellmin":0,"sell":true,"brd":"大地影院","dis":"","imax":0,"poiId":6151046,"lat":39.760098,"lng":116.545555,"id":8301},{"brdId":0,"dealPrice":30,"referencePrice":0,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"通州区","nm":"米瑞酷影城(乔庄店)","ct":"","sellPrice":23,"addr":"通州区运河西大街乔庄卜蜂莲花超市一层","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"","imax":0,"poiId":4800806,"lat":39.891575,"lng":116.68774,"id":8654},{"brdId":1041607,"dealPrice":0,"referencePrice":60,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"通州区","nm":"通州区电影院","ct":"","sellPrice":23,"addr":"通州区西海子西塔胡同1号","preferential":0,"sellmin":0,"sell":true,"brd":"通州区电影院","dis":"德外大街","imax":0,"poiId":82560,"lat":39.912743,"lng":116.66441,"id":178},{"brdId":102642,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"通州区","nm":"万达国际影城(通州万达店)","ct":"","sellPrice":48,"addr":"通州区新华西街58号万达广场1号楼5层（厨艺宾馆对面）","preferential":0,"sellmin":0,"sell":true,"brd":"万达影城","dis":"","imax":1,"poiId":41521114,"lat":39.905937,"lng":116.64272,"id":10837},{"brdId":30227,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"通州区","nm":"耀莱成龙国际影城(临河里店)","ct":"","sellPrice":23,"addr":"通州区临河里33号楼华业玫瑰商业中心D2号楼三层","preferential":0,"sellmin":0,"sell":true,"brd":"耀莱成龙国际影城","dis":"","imax":0,"poiId":92950934,"lat":39.88119,"lng":116.68255,"id":14634},{"brdId":157630,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"通州区","nm":"银兴乐天影城(通州店)","ct":"","sellPrice":38,"addr":"通州区翠景北里21号京通罗斯福广场5F","preferential":0,"sellmin":0,"sell":true,"brd":"乐天影城","dis":"","imax":0,"poiId":6139543,"lat":39.88967,"lng":116.659225,"id":10964},{"brdId":0,"dealPrice":0,"referencePrice":10,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"通州区","nm":"牛仔汽车电影院","ct":"","sellPrice":0,"addr":"通州区台湖镇创业园路8号（近京沈高速台湖入口）","preferential":0,"sellmin":0,"sell":false,"brd":"其它","dis":"梨园","imax":0,"poiId":358821,"lat":39.84602,"lng":116.62319,"id":36}],"昌平区":[{"brdId":24472,"dealPrice":40,"referencePrice":100,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"昌平区","nm":"保利国际影城(龙旗广场店)","ct":"","sellPrice":39,"addr":"昌平区黄平路19号院3号楼龙旗广场购物中心3层（地铁8号线育新站路北600米，近永辉超市）","preferential":0,"sellmin":0,"sell":true,"brd":"保利国际影城","dis":"回龙观","imax":0,"poiId":3320660,"lat":40.066605,"lng":116.34672,"id":5502},{"brdId":0,"dealPrice":0,"referencePrice":80,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"昌平区","nm":"昌平保利影剧院(佳莲时代广场店)","ct":"","sellPrice":33,"addr":"昌平区鼓楼南大街6号佳莲时代广场4楼（近鼓楼西街）","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"昌平镇","imax":0,"poiId":361208,"lat":40.223534,"lng":116.23402,"id":50},{"brdId":384262,"dealPrice":0,"referencePrice":40,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"昌平区","nm":"大地影院(昌平菓岭店)","ct":"","sellPrice":38,"addr":"昌平区昌崔路203号果岭假日广场四楼","preferential":0,"sellmin":0,"sell":true,"brd":"大地影院","dis":"昌平镇","imax":0,"poiId":1432377,"lat":40.222176,"lng":116.264755,"id":66},{"brdId":1162239,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"昌平区","nm":"首都电影院(悦荟万科广场店)","ct":"","sellPrice":38,"addr":"昌平区南环路10号院1号楼悦荟万科广场8层","preferential":0,"sellmin":0,"sell":true,"brd":"首都电影院","dis":"","imax":0,"poiId":373237,"lat":40.2124,"lng":116.24026,"id":8186},{"brdId":102642,"dealPrice":0,"referencePrice":80,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"昌平区","nm":"万达国际影城(龙德广场店)","ct":"","sellPrice":48,"addr":"昌平区立汤路186号龙德广场5层","preferential":0,"sellmin":0,"sell":true,"brd":"万达影城","dis":"天通苑","imax":1,"poiId":30864,"lat":40.060596,"lng":116.41618,"id":151},{"brdId":29462,"dealPrice":40,"referencePrice":0,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"昌平区","nm":"沃美影城(回龙观店)","ct":"","sellPrice":39,"addr":"昌平区回龙观同成街华联购物中心四楼（城铁回龙观站出口对面）","preferential":0,"sellmin":0,"sell":true,"brd":"沃美影城","dis":"","imax":0,"poiId":4058821,"lat":40.071976,"lng":116.33717,"id":9647},{"brdId":30032,"dealPrice":0,"referencePrice":40,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"昌平区","nm":"星美国际影城(回龙观店)","ct":"","sellPrice":39,"addr":"昌平区回龙观西大街111号华联商场3楼","preferential":0,"sellmin":0,"sell":true,"brd":"星美国际影城","dis":"回龙观","imax":0,"poiId":286187,"lat":40.07596,"lng":116.31944,"id":140},{"brdId":23745,"dealPrice":0,"referencePrice":23,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"昌平区","nm":"中影国际影城(昌平永旺店)","ct":"","sellPrice":39.9,"addr":"昌平区北清路1号永旺国际商城3楼","preferential":0,"sellmin":0,"sell":true,"brd":"中影国际影城","dis":"回龙观","imax":0,"poiId":82598,"lat":40.09749,"lng":116.28857,"id":107}],"房山区":[{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"房山区","nm":"DMG影城(良乡店)","ct":"","sellPrice":23,"addr":"房山区拱辰南大街瑞城广场7F","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"","imax":0,"poiId":5677585,"lat":39.72994,"lng":116.14175,"id":16058},{"brdId":2880988,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"房山区","nm":"SFC上影影城(房山绿地店)","ct":"","sellPrice":34,"addr":"房山区黄辛庄路口绿地缤纷城3层","preferential":0,"sellmin":0,"sell":true,"brd":"SFC上影影城","dis":"","imax":0,"poiId":52294367,"lat":39.756683,"lng":116.160515,"id":13618},{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"房山区","nm":"环球国际影城","ct":"","sellPrice":23,"addr":"房山区兴房大街38号华冠欢乐城四楼","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"","imax":0,"poiId":5252975,"lat":39.69285,"lng":115.98708,"id":9370},{"brdId":949172,"dealPrice":0,"referencePrice":30,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"房山区","nm":"良乡影剧院","ct":"","sellPrice":23,"addr":"房山区良乡拱辰大街31号","preferential":0,"sellmin":0,"sell":true,"brd":"良乡影剧院","dis":"房山","imax":0,"poiId":1436368,"lat":39.73799,"lng":116.141685,"id":145},{"brdId":30053,"dealPrice":33,"referencePrice":0,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"房山区","nm":"幸福蓝海国际影城(北京房山店)","ct":"","sellPrice":35,"addr":"房山区广阳新路9号院1号楼中粮万科半岛购物广场3层","preferential":0,"sellmin":0,"sell":true,"brd":"幸福蓝海国际影城","dis":"","imax":0,"poiId":40470614,"lat":39.753548,"lng":116.21099,"id":13028},{"brdId":29894,"dealPrice":0,"referencePrice":60,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"房山区","nm":"新华国际影城(房山店)","ct":"","sellPrice":34.5,"addr":"房山区良乡北关西路14号华冠购物中心五层","preferential":0,"sellmin":0,"sell":true,"brd":"新华国际影城","dis":"房山","imax":0,"poiId":299222,"lat":39.73469,"lng":116.13953,"id":131},{"brdId":777439,"dealPrice":35,"referencePrice":35,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"房山区","nm":"燕山影剧院","ct":"","sellPrice":33,"addr":"房山区燕山岗南路3号","preferential":0,"sellmin":0,"sell":true,"brd":"燕山影剧院","dis":"房山","imax":0,"poiId":271449,"lat":39.72787,"lng":115.96215,"id":60},{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"房山区","nm":"北京燕山文化活动中心影院","ct":"","sellPrice":0,"addr":"房山区迎风街道岗南路9号","preferential":0,"sellmin":0,"sell":false,"brd":"其它","dis":"","imax":0,"poiId":99082156,"lat":39.72558,"lng":115.96181,"id":15272}],"顺义区":[{"brdId":2020418,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"顺义区","nm":"CGV星聚汇影城(顺义店)","ct":"","sellPrice":38,"addr":"顺义区新顺南大街8号华联购物中心4层CGV星聚汇国际影城","preferential":0,"sellmin":0,"sell":true,"brd":"CGV影城","dis":"","imax":0,"poiId":6448554,"lat":40.12897,"lng":116.65173,"id":8111},{"brdId":24595,"dealPrice":0,"referencePrice":70,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"顺义区","nm":"博纳国际影城(顺义店)","ct":"","sellPrice":24,"addr":"顺义区新顺南大街18号新世界百货七层","preferential":0,"sellmin":0,"sell":true,"brd":"博纳国际影城","dis":"顺义","imax":0,"poiId":1437402,"lat":40.126575,"lng":116.65212,"id":69},{"brdId":24745,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"顺义区","nm":"橙天嘉禾影城(祥云小镇店)","ct":"","sellPrice":33.5,"addr":"顺义区安泰大街9号院7号楼二层（祥云小镇内）","preferential":0,"sellmin":0,"sell":true,"brd":"橙天嘉禾影城","dis":"","imax":0,"poiId":40420215,"lat":40.09027,"lng":116.53684,"id":11102},{"brdId":384262,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"顺义区","nm":"大地影院(顺义隆华店)","ct":"","sellPrice":28,"addr":"顺义区新顺南大街11号隆华购物中心6F","preferential":0,"sellmin":0,"sell":true,"brd":"大地影院","dis":"","imax":0,"poiId":41599879,"lat":40.125973,"lng":116.650536,"id":12394},{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"顺义区","nm":"华彩恐龙主题影城","ct":"","sellPrice":19.9,"addr":"顺义区后沙峪九重汇8层","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"","imax":0,"poiId":116704263,"lat":40.105373,"lng":116.54243,"id":16496},{"brdId":1148935,"dealPrice":25,"referencePrice":30,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"顺义区","nm":"顺义影剧院","ct":"","sellPrice":28,"addr":"顺义区新顺北大街3号","preferential":0,"sellmin":0,"sell":true,"brd":"顺义影剧院","dis":"顺义","imax":0,"poiId":89018,"lat":40.1338,"lng":116.650375,"id":180}],"门头沟区":[{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"门头沟区","nm":"门头沟影剧院","ct":"","sellPrice":33,"addr":"门头沟区新桥大街12号","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"门头沟","imax":0,"poiId":3260641,"lat":39.9425,"lng":116.10049,"id":182},{"brdId":30053,"dealPrice":35.9,"referencePrice":0,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"门头沟区","nm":"幸福蓝海影城(门头沟店)","ct":"","sellPrice":23,"addr":"门头沟区永定镇冯村华润购物中心2层","preferential":0,"sellmin":0,"sell":true,"brd":"幸福蓝海国际影城","dis":"","imax":0,"poiId":42297501,"lat":39.91212,"lng":116.11124,"id":10570},{"brdId":0,"dealPrice":35.9,"referencePrice":0,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"门头沟区","nm":"熙旺国际影城","ct":"","sellPrice":23,"addr":"门头沟区双峪路35号熙旺生活广场B座6层","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"","imax":0,"poiId":40550440,"lat":39.93551,"lng":116.11315,"id":10979}],"石景山区":[{"brdId":24472,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"石景山区","nm":"保利国际影城(苹果园店)","ct":"","sellPrice":38,"addr":"石景山区阜石路300号喜隆多三层","preferential":0,"sellmin":0,"sell":true,"brd":"保利国际影城","dis":"","imax":0,"poiId":6596632,"lat":39.92295,"lng":116.17175,"id":10294},{"brdId":302869,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"石景山区","nm":"古城电影院","ct":"","sellPrice":33,"addr":"石景山区古城南路15号","preferential":0,"sellmin":0,"sell":true,"brd":"古城电影院","dis":"古城","imax":0,"poiId":82589,"lat":39.9112,"lng":116.19126,"id":246},{"brdId":102642,"dealPrice":0,"referencePrice":80,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"石景山区","nm":"万达国际影城(石景山店)","ct":"","sellPrice":48,"addr":"石景山区石景山路乙18号万达广场娱乐楼4楼","preferential":0,"sellmin":0,"sell":true,"brd":"万达影城","dis":"鲁谷","imax":1,"poiId":298683,"lat":39.905945,"lng":116.22568,"id":133}],"怀柔区":[{"brdId":0,"dealPrice":0,"referencePrice":35,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"怀柔区","nm":"传奇瑞丽影城","ct":"","sellPrice":43,"addr":"怀柔区青春路15号四层","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"怀柔","imax":0,"poiId":3260663,"lat":40.317955,"lng":116.62985,"id":55},{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"怀柔区","nm":"米珈尼汽车影院","ct":"","sellPrice":53,"addr":"怀柔区雁栖湖路1号","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"","imax":0,"poiId":94728699,"lat":40.392265,"lng":116.67963,"id":15748},{"brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"怀柔区","nm":"怀柔区电影院","ct":"","sellPrice":0,"addr":"怀柔区富乐大街8号","preferential":0,"sellmin":0,"sell":false,"brd":"其它","dis":"怀柔","imax":0,"poiId":1541434,"lat":40.34083,"lng":116.64014,"id":2378}],"平谷区":[{"brdId":0,"dealPrice":27.5,"referencePrice":0,"showCount":0,"deal":1,"distance":0,"follow":0,"area":"平谷区","nm":"华联国际影城(平谷店)","ct":"","sellPrice":33,"addr":"平谷区迎宾路1号院22号楼五层F5-13","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"","imax":0,"poiId":97314976,"lat":40.14356,"lng":117.093155,"id":15082},{"brdId":505125,"dealPrice":0,"referencePrice":0,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"平谷区","nm":"平谷区影剧院","ct":"","sellPrice":33,"addr":"平谷区府前街3号","preferential":0,"sellmin":0,"sell":true,"brd":"平谷区影剧院","dis":"平谷","imax":0,"poiId":1156598,"lat":40.14054,"lng":117.1224,"id":2379}],"密云县":[{"brdId":0,"dealPrice":0,"referencePrice":60,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"密云县","nm":"密云大剧院","ct":"","sellPrice":33,"addr":"密云县鼓楼西大街1号","preferential":0,"sellmin":0,"sell":true,"brd":"其它","dis":"密云县","imax":0,"poiId":1436412,"lat":40.377117,"lng":116.84507,"id":183}],"延庆县":[{"brdId":384262,"dealPrice":0,"referencePrice":40,"showCount":0,"deal":0,"distance":0,"follow":0,"area":"延庆县","nm":"大地影院(延庆金锣湾店)","ct":"","sellPrice":43,"addr":"延庆县妫水北街39号1幢H座首楼金锣湾商业中心沃尔玛旁","preferential":0,"sellmin":0,"sell":true,"brd":"大地影院","dis":"延庆","imax":0,"poiId":1366944,"lat":40.461918,"lng":115.97629,"id":13}]}
     */

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
         * expires : 43200
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
        private List<朝阳区Bean> 朝阳区;
        private List<海淀区Bean> 海淀区;
        private List<大兴区Bean> 大兴区;
        private List<东城区Bean> 东城区;
        private List<丰台区Bean> 丰台区;
        private List<西城区Bean> 西城区;
        private List<通州区Bean> 通州区;
        private List<昌平区Bean> 昌平区;
        private List<房山区Bean> 房山区;
        private List<顺义区Bean> 顺义区;
        private List<门头沟区Bean> 门头沟区;
        private List<石景山区Bean> 石景山区;
        private List<怀柔区Bean> 怀柔区;
        private List<平谷区Bean> 平谷区;
        private List<密云县Bean> 密云县;
        private List<延庆县Bean> 延庆县;

        public List<朝阳区Bean> get朝阳区() {
            return 朝阳区;
        }

        public void set朝阳区(List<朝阳区Bean> 朝阳区) {
            this.朝阳区 = 朝阳区;
        }

        public List<海淀区Bean> get海淀区() {
            return 海淀区;
        }

        public void set海淀区(List<海淀区Bean> 海淀区) {
            this.海淀区 = 海淀区;
        }

        public List<大兴区Bean> get大兴区() {
            return 大兴区;
        }

        public void set大兴区(List<大兴区Bean> 大兴区) {
            this.大兴区 = 大兴区;
        }

        public List<东城区Bean> get东城区() {
            return 东城区;
        }

        public void set东城区(List<东城区Bean> 东城区) {
            this.东城区 = 东城区;
        }

        public List<丰台区Bean> get丰台区() {
            return 丰台区;
        }

        public void set丰台区(List<丰台区Bean> 丰台区) {
            this.丰台区 = 丰台区;
        }

        public List<西城区Bean> get西城区() {
            return 西城区;
        }

        public void set西城区(List<西城区Bean> 西城区) {
            this.西城区 = 西城区;
        }

        public List<通州区Bean> get通州区() {
            return 通州区;
        }

        public void set通州区(List<通州区Bean> 通州区) {
            this.通州区 = 通州区;
        }

        public List<昌平区Bean> get昌平区() {
            return 昌平区;
        }

        public void set昌平区(List<昌平区Bean> 昌平区) {
            this.昌平区 = 昌平区;
        }

        public List<房山区Bean> get房山区() {
            return 房山区;
        }

        public void set房山区(List<房山区Bean> 房山区) {
            this.房山区 = 房山区;
        }

        public List<顺义区Bean> get顺义区() {
            return 顺义区;
        }

        public void set顺义区(List<顺义区Bean> 顺义区) {
            this.顺义区 = 顺义区;
        }

        public List<门头沟区Bean> get门头沟区() {
            return 门头沟区;
        }

        public void set门头沟区(List<门头沟区Bean> 门头沟区) {
            this.门头沟区 = 门头沟区;
        }

        public List<石景山区Bean> get石景山区() {
            return 石景山区;
        }

        public void set石景山区(List<石景山区Bean> 石景山区) {
            this.石景山区 = 石景山区;
        }

        public List<怀柔区Bean> get怀柔区() {
            return 怀柔区;
        }

        public void set怀柔区(List<怀柔区Bean> 怀柔区) {
            this.怀柔区 = 怀柔区;
        }

        public List<平谷区Bean> get平谷区() {
            return 平谷区;
        }

        public void set平谷区(List<平谷区Bean> 平谷区) {
            this.平谷区 = 平谷区;
        }

        public List<密云县Bean> get密云县() {
            return 密云县;
        }

        public void set密云县(List<密云县Bean> 密云县) {
            this.密云县 = 密云县;
        }

        public List<延庆县Bean> get延庆县() {
            return 延庆县;
        }

        public void set延庆县(List<延庆县Bean> 延庆县) {
            this.延庆县 = 延庆县;
        }

        public static class 朝阳区Bean {
            /**
             * brdId : 23854
             * dealPrice : 0.0
             * referencePrice : 70.0
             * showCount : 0
             * deal : 0
             * distance : 0
             * follow : 0
             * area : 朝阳区
             * nm : 17.5影城(比如世界店)
             * ct :
             * sellPrice : 30.0
             * addr : 朝阳区京顺路111号比如世界购物中心1层（近太阳宫北街）
             * preferential : 0
             * sellmin : 0
             * sell : true
             * brd : 17.5影城
             * dis : 望京
             * imax : 0
             * poiId : 75603
             * lat : 39.9684
             * lng : 116.46204
             * id : 48
             */

            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int deal;
            private int distance;
            private int follow;
            private String area;
            private String nm;
            private String ct;
            private double sellPrice;
            private String addr;
            private int preferential;
            private int sellmin;
            private boolean sell;
            private String brd;
            private String dis;
            private int imax;
            private int poiId;
            private double lat;
            private double lng;
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class 海淀区Bean {
            /**
             * brdId : 23854
             * dealPrice : 0.0
             * referencePrice : 60.0
             * showCount : 0
             * deal : 0
             * distance : 0
             * follow : 0
             * area : 海淀区
             * nm : 17.5影城(今典花园店)
             * ct :
             * sellPrice : 44.0
             * addr : 海淀区文慧园路9号今典花园9号楼空间蒙太奇大厦1层
             * preferential : 0
             * sellmin : 0
             * sell : true
             * brd : 17.5影城
             * dis : 北太平庄
             * imax : 0
             * poiId : 273950
             * lat : 39.95334
             * lng : 116.36104
             * id : 154
             */

            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int deal;
            private int distance;
            private int follow;
            private String area;
            private String nm;
            private String ct;
            private double sellPrice;
            private String addr;
            private int preferential;
            private int sellmin;
            private boolean sell;
            private String brd;
            private String dis;
            private int imax;
            private int poiId;
            private double lat;
            private double lng;
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class 大兴区Bean {
            /**
             * brdId : 2020418
             * dealPrice : 0.0
             * referencePrice : 0.0
             * showCount : 0
             * deal : 0
             * distance : 0
             * follow : 0
             * area : 大兴区
             * nm : CGV星聚汇影城(亦庄店)
             * ct :
             * sellPrice : 23.0
             * addr : 大兴区经济技术开发区荣京东街大族广场9号楼三层
             * preferential : 0
             * sellmin : 0
             * sell : true
             * brd : CGV影城
             * dis :
             * imax : 0
             * poiId : 105355906
             * lat : 39.790707
             * lng : 116.51294
             * id : 16152
             */

            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int deal;
            private int distance;
            private int follow;
            private String area;
            private String nm;
            private String ct;
            private double sellPrice;
            private String addr;
            private int preferential;
            private int sellmin;
            private boolean sell;
            private String brd;
            private String dis;
            private int imax;
            private int poiId;
            private double lat;
            private double lng;
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class 东城区Bean {
            /**
             * brdId : 24071
             * dealPrice : 0.0
             * referencePrice : 70.0
             * showCount : 0
             * deal : 0
             * distance : 0
             * follow : 0
             * area : 东城区
             * nm : UME国际影城(安贞店)
             * ct :
             * sellPrice : 39.5
             * addr : 东城区北三环安贞桥环球贸易中心E座
             * preferential : 0
             * sellmin : 0
             * sell : true
             * brd : UME国际影城
             * dis : 安贞
             * imax : 0
             * poiId : 94496
             * lat : 39.966072
             * lng : 116.41096
             * id : 99
             */

            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int deal;
            private int distance;
            private int follow;
            private String area;
            private String nm;
            private String ct;
            private double sellPrice;
            private String addr;
            private int preferential;
            private int sellmin;
            private boolean sell;
            private String brd;
            private String dis;
            private int imax;
            private int poiId;
            private double lat;
            private double lng;
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class 丰台区Bean {
            /**
             * brdId : 0
             * dealPrice : 0.0
             * referencePrice : 0.0
             * showCount : 0
             * deal : 0
             * distance : 0
             * follow : 0
             * area : 丰台区
             * nm : DMG国际影城(悦秀店)
             * ct :
             * sellPrice : 24.0
             * addr : 丰台区开阳路8号悦秀城6层
             * preferential : 0
             * sellmin : 0
             * sell : true
             * brd : 其它
             * dis :
             * imax : 0
             * poiId : 94444126
             * lat : 39.868313
             * lng : 116.375984
             * id : 15859
             */

            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int deal;
            private int distance;
            private int follow;
            private String area;
            private String nm;
            private String ct;
            private double sellPrice;
            private String addr;
            private int preferential;
            private int sellmin;
            private boolean sell;
            private String brd;
            private String dis;
            private int imax;
            private int poiId;
            private double lat;
            private double lng;
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class 西城区Bean {
            /**
             * brdId : 0
             * dealPrice : 0.0
             * referencePrice : 50.0
             * showCount : 0
             * deal : 0
             * distance : 0
             * follow : 0
             * area : 西城区
             * nm : 北京青年宫
             * ct :
             * sellPrice : 38.0
             * addr : 西城区西直门南小街68号
             * preferential : 0
             * sellmin : 0
             * sell : true
             * brd : 其它
             * dis : 西直门
             * imax : 0
             * poiId : 271434
             * lat : 39.93531
             * lng : 116.35955
             * id : 260
             */

            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int deal;
            private int distance;
            private int follow;
            private String area;
            private String nm;
            private String ct;
            private double sellPrice;
            private String addr;
            private int preferential;
            private int sellmin;
            private boolean sell;
            private String brd;
            private String dis;
            private int imax;
            private int poiId;
            private double lat;
            private double lng;
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class 通州区Bean {
            /**
             * brdId : 0
             * dealPrice : 0.0
             * referencePrice : 0.0
             * showCount : 0
             * deal : 0
             * distance : 0
             * follow : 0
             * area : 通州区
             * nm : 北京东融国际影城(月亮河店)
             * ct :
             * sellPrice : 22.9
             * addr : 通州区永顺镇芙蓉园513号楼
             * preferential : 0
             * sellmin : 0
             * sell : true
             * brd : 其它
             * dis :
             * imax : 0
             * poiId : 99968119
             * lat : 39.919525
             * lng : 116.677376
             * id : 15421
             */

            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int deal;
            private int distance;
            private int follow;
            private String area;
            private String nm;
            private String ct;
            private double sellPrice;
            private String addr;
            private int preferential;
            private int sellmin;
            private boolean sell;
            private String brd;
            private String dis;
            private int imax;
            private int poiId;
            private double lat;
            private double lng;
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class 昌平区Bean {
            /**
             * brdId : 24472
             * dealPrice : 40.0
             * referencePrice : 100.0
             * showCount : 0
             * deal : 1
             * distance : 0
             * follow : 0
             * area : 昌平区
             * nm : 保利国际影城(龙旗广场店)
             * ct :
             * sellPrice : 39.0
             * addr : 昌平区黄平路19号院3号楼龙旗广场购物中心3层（地铁8号线育新站路北600米，近永辉超市）
             * preferential : 0
             * sellmin : 0
             * sell : true
             * brd : 保利国际影城
             * dis : 回龙观
             * imax : 0
             * poiId : 3320660
             * lat : 40.066605
             * lng : 116.34672
             * id : 5502
             */

            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int deal;
            private int distance;
            private int follow;
            private String area;
            private String nm;
            private String ct;
            private double sellPrice;
            private String addr;
            private int preferential;
            private int sellmin;
            private boolean sell;
            private String brd;
            private String dis;
            private int imax;
            private int poiId;
            private double lat;
            private double lng;
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class 房山区Bean {
            /**
             * brdId : 0
             * dealPrice : 0.0
             * referencePrice : 0.0
             * showCount : 0
             * deal : 0
             * distance : 0
             * follow : 0
             * area : 房山区
             * nm : DMG影城(良乡店)
             * ct :
             * sellPrice : 23.0
             * addr : 房山区拱辰南大街瑞城广场7F
             * preferential : 0
             * sellmin : 0
             * sell : true
             * brd : 其它
             * dis :
             * imax : 0
             * poiId : 5677585
             * lat : 39.72994
             * lng : 116.14175
             * id : 16058
             */

            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int deal;
            private int distance;
            private int follow;
            private String area;
            private String nm;
            private String ct;
            private double sellPrice;
            private String addr;
            private int preferential;
            private int sellmin;
            private boolean sell;
            private String brd;
            private String dis;
            private int imax;
            private int poiId;
            private double lat;
            private double lng;
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class 顺义区Bean {
            /**
             * brdId : 2020418
             * dealPrice : 0.0
             * referencePrice : 0.0
             * showCount : 0
             * deal : 0
             * distance : 0
             * follow : 0
             * area : 顺义区
             * nm : CGV星聚汇影城(顺义店)
             * ct :
             * sellPrice : 38.0
             * addr : 顺义区新顺南大街8号华联购物中心4层CGV星聚汇国际影城
             * preferential : 0
             * sellmin : 0
             * sell : true
             * brd : CGV影城
             * dis :
             * imax : 0
             * poiId : 6448554
             * lat : 40.12897
             * lng : 116.65173
             * id : 8111
             */

            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int deal;
            private int distance;
            private int follow;
            private String area;
            private String nm;
            private String ct;
            private double sellPrice;
            private String addr;
            private int preferential;
            private int sellmin;
            private boolean sell;
            private String brd;
            private String dis;
            private int imax;
            private int poiId;
            private double lat;
            private double lng;
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class 门头沟区Bean {
            /**
             * brdId : 0
             * dealPrice : 0.0
             * referencePrice : 0.0
             * showCount : 0
             * deal : 0
             * distance : 0
             * follow : 0
             * area : 门头沟区
             * nm : 门头沟影剧院
             * ct :
             * sellPrice : 33.0
             * addr : 门头沟区新桥大街12号
             * preferential : 0
             * sellmin : 0
             * sell : true
             * brd : 其它
             * dis : 门头沟
             * imax : 0
             * poiId : 3260641
             * lat : 39.9425
             * lng : 116.10049
             * id : 182
             */

            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int deal;
            private int distance;
            private int follow;
            private String area;
            private String nm;
            private String ct;
            private double sellPrice;
            private String addr;
            private int preferential;
            private int sellmin;
            private boolean sell;
            private String brd;
            private String dis;
            private int imax;
            private int poiId;
            private double lat;
            private double lng;
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class 石景山区Bean {
            /**
             * brdId : 24472
             * dealPrice : 0.0
             * referencePrice : 0.0
             * showCount : 0
             * deal : 0
             * distance : 0
             * follow : 0
             * area : 石景山区
             * nm : 保利国际影城(苹果园店)
             * ct :
             * sellPrice : 38.0
             * addr : 石景山区阜石路300号喜隆多三层
             * preferential : 0
             * sellmin : 0
             * sell : true
             * brd : 保利国际影城
             * dis :
             * imax : 0
             * poiId : 6596632
             * lat : 39.92295
             * lng : 116.17175
             * id : 10294
             */

            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int deal;
            private int distance;
            private int follow;
            private String area;
            private String nm;
            private String ct;
            private double sellPrice;
            private String addr;
            private int preferential;
            private int sellmin;
            private boolean sell;
            private String brd;
            private String dis;
            private int imax;
            private int poiId;
            private double lat;
            private double lng;
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class 怀柔区Bean {
            /**
             * brdId : 0
             * dealPrice : 0.0
             * referencePrice : 35.0
             * showCount : 0
             * deal : 0
             * distance : 0
             * follow : 0
             * area : 怀柔区
             * nm : 传奇瑞丽影城
             * ct :
             * sellPrice : 43.0
             * addr : 怀柔区青春路15号四层
             * preferential : 0
             * sellmin : 0
             * sell : true
             * brd : 其它
             * dis : 怀柔
             * imax : 0
             * poiId : 3260663
             * lat : 40.317955
             * lng : 116.62985
             * id : 55
             */

            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int deal;
            private int distance;
            private int follow;
            private String area;
            private String nm;
            private String ct;
            private double sellPrice;
            private String addr;
            private int preferential;
            private int sellmin;
            private boolean sell;
            private String brd;
            private String dis;
            private int imax;
            private int poiId;
            private double lat;
            private double lng;
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class 平谷区Bean {
            /**
             * brdId : 0
             * dealPrice : 27.5
             * referencePrice : 0.0
             * showCount : 0
             * deal : 1
             * distance : 0
             * follow : 0
             * area : 平谷区
             * nm : 华联国际影城(平谷店)
             * ct :
             * sellPrice : 33.0
             * addr : 平谷区迎宾路1号院22号楼五层F5-13
             * preferential : 0
             * sellmin : 0
             * sell : true
             * brd : 其它
             * dis :
             * imax : 0
             * poiId : 97314976
             * lat : 40.14356
             * lng : 117.093155
             * id : 15082
             */

            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int deal;
            private int distance;
            private int follow;
            private String area;
            private String nm;
            private String ct;
            private double sellPrice;
            private String addr;
            private int preferential;
            private int sellmin;
            private boolean sell;
            private String brd;
            private String dis;
            private int imax;
            private int poiId;
            private double lat;
            private double lng;
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class 密云县Bean {
            /**
             * brdId : 0
             * dealPrice : 0.0
             * referencePrice : 60.0
             * showCount : 0
             * deal : 0
             * distance : 0
             * follow : 0
             * area : 密云县
             * nm : 密云大剧院
             * ct :
             * sellPrice : 33.0
             * addr : 密云县鼓楼西大街1号
             * preferential : 0
             * sellmin : 0
             * sell : true
             * brd : 其它
             * dis : 密云县
             * imax : 0
             * poiId : 1436412
             * lat : 40.377117
             * lng : 116.84507
             * id : 183
             */

            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int deal;
            private int distance;
            private int follow;
            private String area;
            private String nm;
            private String ct;
            private double sellPrice;
            private String addr;
            private int preferential;
            private int sellmin;
            private boolean sell;
            private String brd;
            private String dis;
            private int imax;
            private int poiId;
            private double lat;
            private double lng;
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }

        public static class 延庆县Bean {
            /**
             * brdId : 384262
             * dealPrice : 0.0
             * referencePrice : 40.0
             * showCount : 0
             * deal : 0
             * distance : 0
             * follow : 0
             * area : 延庆县
             * nm : 大地影院(延庆金锣湾店)
             * ct :
             * sellPrice : 43.0
             * addr : 延庆县妫水北街39号1幢H座首楼金锣湾商业中心沃尔玛旁
             * preferential : 0
             * sellmin : 0
             * sell : true
             * brd : 大地影院
             * dis : 延庆
             * imax : 0
             * poiId : 1366944
             * lat : 40.461918
             * lng : 115.97629
             * id : 13
             */

            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int deal;
            private int distance;
            private int follow;
            private String area;
            private String nm;
            private String ct;
            private double sellPrice;
            private String addr;
            private int preferential;
            private int sellmin;
            private boolean sell;
            private String brd;
            private String dis;
            private int imax;
            private int poiId;
            private double lat;
            private double lng;
            private int id;

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
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
