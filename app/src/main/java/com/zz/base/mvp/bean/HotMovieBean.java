package com.zz.base.mvp.bean;

import java.util.List;

/**
 * Created by Zz on 2019/3/27.
 */

public class HotMovieBean {
    @Override
    public String toString() {
        return "HotMovieBean{" +
                "count=" + count +
                ", start=" + start +
                ", total=" + total +
                ", title='" + title + '\'' +
                ", subjects=" + subjects +
                '}';
    }

    /**
     * count : 20
     * start : 0
     * total : 30
     * subjects : [{"rating":{"max":10,"average":6.9,"stars":"35","min":0},"genres":["剧情"],"title":"老师·好","casts":[{"alt":"https://movie.douban.com/celebrity/1274307/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1504169127.76.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1504169127.76.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1504169127.76.webp"},"name":"于谦","id":"1274307"},{"alt":"https://movie.douban.com/celebrity/1351587/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1442330240.0.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1442330240.0.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1442330240.0.webp"},"name":"汤梦佳","id":"1351587"},{"alt":"https://movie.douban.com/celebrity/1403828/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1542251128.4.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1542251128.4.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1542251128.4.webp"},"name":"王广源","id":"1403828"}],"collect_count":19336,"original_title":"老师·好","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1383594/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1550730545.46.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1550730545.46.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1550730545.46.webp"},"name":"张栾","id":"1383594"}],"year":"2019","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2551352209.webp","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2551352209.webp","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2551352209.webp"},"alt":"https://movie.douban.com/subject/27663742/","id":"27663742"},{"rating":{"max":10,"average":7.7,"stars":"40","min":0},"genres":["科幻","悬疑","惊悚"],"title":"海市蜃楼","casts":[{"alt":"https://movie.douban.com/celebrity/1014538/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p46101.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p46101.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p46101.webp"},"name":"阿德里亚娜·乌加特","id":"1014538"},{"alt":"https://movie.douban.com/celebrity/1344260/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1490764328.09.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1490764328.09.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1490764328.09.webp"},"name":"奇诺·达林","id":"1344260"},{"alt":"https://movie.douban.com/celebrity/1392255/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/pnqeO8jPqetocel_avatar_uploaded1525297233.62.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/pnqeO8jPqetocel_avatar_uploaded1525297233.62.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/pnqeO8jPqetocel_avatar_uploaded1525297233.62.webp"},"name":"阿尔瓦罗·莫奇","id":"1392255"}],"collect_count":11771,"original_title":"Durante la tormenta","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1323799/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1490063334.69.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1490063334.69.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1490063334.69.webp"},"name":"奥里奥尔·保罗","id":"1323799"}],"year":"2018","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2551172384.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2551172384.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2551172384.webp"},"alt":"https://movie.douban.com/subject/30164448/","id":"30164448"},{"rating":{"max":10,"average":4.8,"stars":"25","min":0},"genres":["爱情"],"title":"比悲伤更悲伤的故事","casts":[{"alt":"https://movie.douban.com/celebrity/1274316/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p31663.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p31663.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p31663.webp"},"name":"陈意涵","id":"1274316"},{"alt":"https://movie.douban.com/celebrity/1326546/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1511061580.88.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1511061580.88.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1511061580.88.webp"},"name":"刘以豪","id":"1326546"},{"alt":"https://movie.douban.com/celebrity/1315045/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p31369.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p31369.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p31369.webp"},"name":"张书豪","id":"1315045"}],"collect_count":64354,"original_title":"比悲傷更悲傷的故事","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1312860/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p44818.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p44818.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p44818.webp"},"name":"林孝谦","id":"1312860"}],"year":"2018","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2549523952.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2549523952.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2549523952.webp"},"alt":"https://movie.douban.com/subject/27624661/","id":"27624661"},{"rating":{"max":10,"average":8.7,"stars":"45","min":0},"genres":["剧情","传记","音乐"],"title":"波西米亚狂想曲","casts":[{"alt":"https://movie.douban.com/celebrity/1044903/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1860.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1860.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1860.webp"},"name":"拉米·马雷克","id":"1044903"},{"alt":"https://movie.douban.com/celebrity/1344763/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1548177691.13.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1548177691.13.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1548177691.13.webp"},"name":"本·哈迪","id":"1344763"},{"alt":"https://movie.douban.com/celebrity/1049517/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13772.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13772.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13772.webp"},"name":"约瑟夫·梅泽罗","id":"1049517"}],"collect_count":206167,"original_title":"Bohemian Rhapsody","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1049586/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1403264395.93.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1403264395.93.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1403264395.93.webp"},"name":"布莱恩·辛格","id":"1049586"}],"year":"2018","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2549558913.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2549558913.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2549558913.webp"},"alt":"https://movie.douban.com/subject/5300054/","id":"5300054"},{"rating":{"max":10,"average":7,"stars":"35","min":0},"genres":["动作","科幻","冒险"],"title":"惊奇队长","casts":[{"alt":"https://movie.douban.com/celebrity/1027194/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1392029372.12.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1392029372.12.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1392029372.12.webp"},"name":"布丽·拉尔森","id":"1027194"},{"alt":"https://movie.douban.com/celebrity/1010510/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4952.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4952.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4952.webp"},"name":"裘德·洛","id":"1010510"},{"alt":"https://movie.douban.com/celebrity/1054408/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1365913316.45.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1365913316.45.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1365913316.45.webp"},"name":"塞缪尔·杰克逊","id":"1054408"}],"collect_count":278070,"original_title":"Captain Marvel","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1306067/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1550139338.75.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1550139338.75.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1550139338.75.webp"},"name":"安娜·波顿","id":"1306067"},{"alt":"https://movie.douban.com/celebrity/1050201/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1550139655.99.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1550139655.99.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1550139655.99.webp"},"name":"瑞安·弗雷克","id":"1050201"}],"year":"2019","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2548870813.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2548870813.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2548870813.webp"},"alt":"https://movie.douban.com/subject/26213252/","id":"26213252"},{"rating":{"max":10,"average":8,"stars":"40","min":0},"genres":["剧情","家庭"],"title":"地久天长","casts":[{"alt":"https://movie.douban.com/celebrity/1275934/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p12560.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p12560.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p12560.webp"},"name":"王景春","id":"1275934"},{"alt":"https://movie.douban.com/celebrity/1276041/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1469426474.73.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1469426474.73.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1469426474.73.webp"},"name":"咏梅","id":"1276041"},{"alt":"https://movie.douban.com/celebrity/1318634/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43726.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43726.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43726.webp"},"name":"齐溪","id":"1318634"}],"collect_count":67668,"original_title":"地久天长","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1018708/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1553157534.76.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1553157534.76.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1553157534.76.webp"},"name":"王小帅","id":"1018708"}],"year":"2019","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2550208359.webp","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2550208359.webp","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2550208359.webp"},"alt":"https://movie.douban.com/subject/26715636/","id":"26715636"},{"rating":{"max":10,"average":8.9,"stars":"45","min":0},"genres":["剧情","喜剧","传记"],"title":"绿皮书","casts":[{"alt":"https://movie.douban.com/celebrity/1054520/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p29922.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p29922.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p29922.webp"},"name":"维果·莫腾森","id":"1054520"},{"alt":"https://movie.douban.com/celebrity/1004702/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1488440651.5.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1488440651.5.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1488440651.5.webp"},"name":"马赫沙拉·阿里","id":"1004702"},{"alt":"https://movie.douban.com/celebrity/1010545/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1405786644.35.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1405786644.35.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1405786644.35.webp"},"name":"琳达·卡德里尼","id":"1010545"}],"collect_count":546402,"original_title":"Green Book","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1036662/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p29610.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p29610.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p29610.webp"},"name":"彼得·法雷里","id":"1036662"}],"year":"2018","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2549177902.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2549177902.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2549177902.webp"},"alt":"https://movie.douban.com/subject/27060077/","id":"27060077"},{"rating":{"max":10,"average":5.6,"stars":"30","min":0},"genres":["喜剧","惊悚"],"title":"狂暴凶狮","casts":[{"alt":"https://movie.douban.com/celebrity/1242726/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1539943142.4.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1539943142.4.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1539943142.4.webp"},"name":"索菲·范·德温","id":"1242726"},{"alt":"https://movie.douban.com/celebrity/1264266/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43801.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43801.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43801.webp"},"name":"艾比·侯斯","id":"1264266"},{"alt":"https://movie.douban.com/celebrity/1382415/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1507792229.58.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1507792229.58.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1507792229.58.webp"},"name":"布里特·拉格尔","id":"1382415"}],"collect_count":3785,"original_title":"Prooi","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1002933/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1360948259.53.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1360948259.53.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1360948259.53.webp"},"name":"迪克·麦斯","id":"1002933"}],"year":"2016","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2548549246.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2548549246.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2548549246.webp"},"alt":"https://movie.douban.com/subject/27150225/","id":"27150225"},{"rating":{"max":10,"average":6.9,"stars":"35","min":0},"genres":["喜剧","动画","冒险"],"title":"乐高大电影2","casts":[{"alt":"https://movie.douban.com/celebrity/1017967/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1408711300.32.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1408711300.32.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1408711300.32.webp"},"name":"克里斯·帕拉特","id":"1017967"},{"alt":"https://movie.douban.com/celebrity/1004571/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p22028.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p22028.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p22028.webp"},"name":"伊丽莎白·班克斯","id":"1004571"},{"alt":"https://movie.douban.com/celebrity/1044709/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p7197.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p7197.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p7197.webp"},"name":"威尔·阿奈特","id":"1044709"}],"collect_count":4844,"original_title":"The Lego Movie 2: The Second Part","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1292230/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1500863285.35.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1500863285.35.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1500863285.35.webp"},"name":"迈克·米切尔","id":"1292230"}],"year":"2019","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2549353234.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2549353234.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2549353234.webp"},"alt":"https://movie.douban.com/subject/25833233/","id":"25833233"},{"rating":{"max":10,"average":8,"stars":"40","min":0},"genres":["科幻","灾难"],"title":"流浪地球","casts":[{"alt":"https://movie.douban.com/celebrity/1359081/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1533348792.03.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1533348792.03.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1533348792.03.webp"},"name":"屈楚萧","id":"1359081"},{"alt":"https://movie.douban.com/celebrity/1000525/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549645325.74.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549645325.74.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549645325.74.webp"},"name":"吴京","id":"1000525"},{"alt":"https://movie.douban.com/celebrity/1275178/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1540619056.43.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1540619056.43.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1540619056.43.webp"},"name":"李光洁","id":"1275178"}],"collect_count":1603270,"original_title":"流浪地球","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1276086/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1536678787.83.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1536678787.83.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1536678787.83.webp"},"name":"郭帆","id":"1276086"}],"year":"2019","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2545472803.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2545472803.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2545472803.webp"},"alt":"https://movie.douban.com/subject/26266893/","id":"26266893"},{"rating":{"max":10,"average":7.5,"stars":"40","min":0},"genres":["动画","奇幻","冒险"],"title":"驯龙高手3","casts":[{"alt":"https://movie.douban.com/celebrity/1002664/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p893.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p893.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p893.webp"},"name":"杰伊·巴鲁切尔","id":"1002664"},{"alt":"https://movie.douban.com/celebrity/1000055/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p28644.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p28644.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p28644.webp"},"name":"亚美莉卡·费雷拉","id":"1000055"},{"alt":"https://movie.douban.com/celebrity/1055073/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1425119644.17.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1425119644.17.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1425119644.17.webp"},"name":"F·默里·亚伯拉罕","id":"1055073"}],"collect_count":116242,"original_title":"How To Train Your Dragon: The Hidden World","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1018302/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p18169.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p18169.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p18169.webp"},"name":"迪恩·德布洛斯","id":"1018302"}],"year":"2019","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2546335362.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2546335362.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2546335362.webp"},"alt":"https://movie.douban.com/subject/19899707/","id":"19899707"},{"rating":{"max":10,"average":8,"stars":"40","min":0},"genres":["剧情","动画","奇幻"],"title":"夏目友人帐","casts":[{"alt":"https://movie.douban.com/celebrity/1274377/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23870.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23870.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23870.webp"},"name":"神谷浩史","id":"1274377"},{"alt":"https://movie.douban.com/celebrity/1003523/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p5198.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p5198.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p5198.webp"},"name":"井上和彦","id":"1003523"},{"alt":"https://movie.douban.com/celebrity/1042089/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1131.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1131.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1131.webp"},"name":"高良健吾","id":"1042089"}],"collect_count":66183,"original_title":"劇場版 夏目友人帳 ～うつせみに結ぶ～","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1275191/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p21498.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p21498.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p21498.webp"},"name":"大森贵弘","id":"1275191"},{"alt":"https://movie.douban.com/celebrity/1411453/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"伊藤秀树","id":"1411453"}],"year":"2018","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2546745948.webp","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2546745948.webp","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2546745948.webp"},"alt":"https://movie.douban.com/subject/27166442/","id":"27166442"},{"rating":{"max":10,"average":7.6,"stars":"40","min":0},"genres":["动作","科幻","冒险"],"title":"阿丽塔：战斗天使","casts":[{"alt":"https://movie.douban.com/celebrity/1342762/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1501911452.02.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1501911452.02.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1501911452.02.webp"},"name":"罗莎·萨拉查","id":"1342762"},{"alt":"https://movie.douban.com/celebrity/1054405/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p26974.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p26974.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p26974.webp"},"name":"克里斯托弗·沃尔兹","id":"1054405"},{"alt":"https://movie.douban.com/celebrity/1399007/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549880660.24.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549880660.24.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1549880660.24.webp"},"name":"基恩·约翰逊","id":"1399007"}],"collect_count":364486,"original_title":"Alita: Battle Angel","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1019016/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1378050540.89.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1378050540.89.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1378050540.89.webp"},"name":"罗伯特·罗德里格兹","id":"1019016"}],"year":"2019","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2544987866.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2544987866.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2544987866.webp"},"alt":"https://movie.douban.com/subject/1652592/","id":"1652592"},{"rating":{"max":10,"average":7.9,"stars":"40","min":0},"genres":["剧情"],"title":"过春天","casts":[{"alt":"https://movie.douban.com/celebrity/1378152/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1546503414.47.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1546503414.47.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1546503414.47.webp"},"name":"黄尧","id":"1378152"},{"alt":"https://movie.douban.com/celebrity/1350411/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1552867660.75.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1552867660.75.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1552867660.75.webp"},"name":"孙阳","id":"1350411"},{"alt":"https://movie.douban.com/celebrity/1358039/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1463972007.68.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1463972007.68.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1463972007.68.webp"},"name":"汤加文","id":"1358039"}],"collect_count":50993,"original_title":"过春天","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1399194/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1534488440.19.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1534488440.19.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1534488440.19.webp"},"name":"白雪","id":"1399194"}],"year":"2018","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2549537782.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2549537782.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2549537782.webp"},"alt":"https://movie.douban.com/subject/27191431/","id":"27191431"},{"rating":{"max":10,"average":7.2,"stars":"40","min":0},"genres":["动作","动画"],"title":"我的英雄学院：两位英雄","casts":[{"alt":"https://movie.douban.com/celebrity/1334753/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1490072678.98.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1490072678.98.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1490072678.98.webp"},"name":"山下大辉","id":"1334753"},{"alt":"https://movie.douban.com/celebrity/1176990/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23513.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23513.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23513.webp"},"name":"三宅健太","id":"1176990"},{"alt":"https://movie.douban.com/celebrity/1045964/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p47147.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p47147.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p47147.webp"},"name":"志田未来","id":"1045964"}],"collect_count":18637,"original_title":"僕のヒーローアカデミア THE MOVIE ～2人の英雄～","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1360038/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1498830911.08.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1498830911.08.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1498830911.08.webp"},"name":"长崎健司","id":"1360038"}],"year":"2018","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2548783889.webp","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2548783889.webp","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2548783889.webp"},"alt":"https://movie.douban.com/subject/27602116/","id":"27602116"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["剧情","爱情"],"title":"A测试","casts":[{"alt":"https://movie.douban.com/celebrity/1276052/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1526720785.15.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1526720785.15.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1526720785.15.webp"},"name":"于小彤","id":"1276052"},{"alt":"https://movie.douban.com/celebrity/1317294/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1465788087.82.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1465788087.82.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1465788087.82.webp"},"name":"薛之谦","id":"1317294"},{"alt":"https://movie.douban.com/celebrity/1339697/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1431166034.43.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1431166034.43.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1431166034.43.webp"},"name":"南笙","id":"1339697"}],"collect_count":80,"original_title":"A测试","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1310229/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1352397101.03.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1352397101.03.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1352397101.03.webp"},"name":"马俪文","id":"1310229"}],"year":"2017","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2358401428.webp","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2358401428.webp","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2358401428.webp"},"alt":"https://movie.douban.com/subject/26425083/","id":"26425083"},{"rating":{"max":10,"average":7.4,"stars":"40","min":0},"genres":["剧情","传记"],"title":"杨善洲","casts":[{"alt":"https://movie.douban.com/celebrity/1274233/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1365831724.28.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1365831724.28.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1365831724.28.webp"},"name":"李雪健","id":"1274233"},{"alt":"https://movie.douban.com/celebrity/1001714/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1544112394.19.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1544112394.19.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1544112394.19.webp"},"name":"奚美娟","id":"1001714"},{"alt":"https://movie.douban.com/celebrity/1015199/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1368429021.58.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1368429021.58.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1368429021.58.webp"},"name":"陶虹","id":"1015199"}],"collect_count":2731,"original_title":"杨善洲","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1318477/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1352183247.45.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1352183247.45.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1352183247.45.webp"},"name":"董玲","id":"1318477"}],"year":"2011","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p1104325311.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p1104325311.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p1104325311.webp"},"alt":"https://movie.douban.com/subject/6519575/","id":"6519575"},{"rating":{"max":10,"average":0,"stars":"00","min":0},"genres":["惊悚","恐怖"],"title":"夜伴歌声","casts":[{"alt":"https://movie.douban.com/celebrity/1349852/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1527750676.4.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1527750676.4.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1527750676.4.webp"},"name":"梅俪儿","id":"1349852"},{"alt":"https://movie.douban.com/celebrity/1407481/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1545534346.28.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1545534346.28.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1545534346.28.webp"},"name":"李泽宇","id":"1407481"},{"alt":"https://movie.douban.com/celebrity/1411266/","avatars":{"small":"https://img1.doubanio.com/f/movie/ca527386eb8c4e325611e22dfcb04cc116d6b423/pics/movie/celebrity-default-small.png","large":"https://img3.doubanio.com/f/movie/63acc16ca6309ef191f0378faf793d1096a3e606/pics/movie/celebrity-default-large.png","medium":"https://img1.doubanio.com/f/movie/8dd0c794499fe925ae2ae89ee30cd225750457b4/pics/movie/celebrity-default-medium.png"},"name":"曹鹤夕","id":"1411266"}],"collect_count":252,"original_title":"夜伴歌声","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1360707/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1490348628.29.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1490348628.29.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1490348628.29.webp"},"name":"陆诗雷","id":"1360707"}],"year":"2019","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2548652745.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2548652745.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2548652745.webp"},"alt":"https://movie.douban.com/subject/30464313/","id":"30464313"},{"rating":{"max":10,"average":6.8,"stars":"35","min":0},"genres":["传记"],"title":"第一书记","casts":[{"alt":"https://movie.douban.com/celebrity/1274256/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p11567.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p11567.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p11567.webp"},"name":"杨立新","id":"1274256"},{"alt":"https://movie.douban.com/celebrity/1017207/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43516.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43516.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p43516.webp"},"name":"徐帆","id":"1017207"},{"alt":"https://movie.douban.com/celebrity/1332076/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1492350978.71.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1492350978.71.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1492350978.71.webp"},"name":"王丽媛","id":"1332076"}],"collect_count":1805,"original_title":"第一书记","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1318334/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p42742.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p42742.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p42742.webp"},"name":"陈国星","id":"1318334"}],"year":"2010","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p556504647.webp","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p556504647.webp","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p556504647.webp"},"alt":"https://movie.douban.com/subject/4896295/","id":"4896295"},{"rating":{"max":10,"average":7.1,"stars":"35","min":0},"genres":["剧情","喜剧","运动"],"title":"篮球冠军","casts":[{"alt":"https://movie.douban.com/celebrity/1014537/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p16056.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p16056.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p16056.webp"},"name":"哈维尔·古铁雷斯","id":"1014537"},{"alt":"https://movie.douban.com/celebrity/1116419/","avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1540366571.78.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1540366571.78.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1540366571.78.webp"},"name":"雅典娜·玛塔","id":"1116419"},{"alt":"https://movie.douban.com/celebrity/1381436/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1505871564.75.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1505871564.75.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1505871564.75.webp"},"name":"胡安·马加略","id":"1381436"}],"collect_count":1645,"original_title":"Campeones","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1283649/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p56454.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p56454.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p56454.webp"},"name":"哈维尔·费舍尔","id":"1283649"}],"year":"2018","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2550534680.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2550534680.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2550534680.webp"},"alt":"https://movie.douban.com/subject/30205168/","id":"30205168"}]
     * title : 正在上映的电影-北京
     */

    private int count;
    private int start;
    private int total;
    private String title;
    private List<SubjectsBean> subjects;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SubjectsBean> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectsBean> subjects) {
        this.subjects = subjects;
    }

    public static class SubjectsBean {
        /**
         * rating : {"max":10,"average":6.9,"stars":"35","min":0}
         * genres : ["剧情"]
         * title : 老师·好
         * casts : [{"alt":"https://movie.douban.com/celebrity/1274307/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1504169127.76.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1504169127.76.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1504169127.76.webp"},"name":"于谦","id":"1274307"},{"alt":"https://movie.douban.com/celebrity/1351587/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1442330240.0.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1442330240.0.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1442330240.0.webp"},"name":"汤梦佳","id":"1351587"},{"alt":"https://movie.douban.com/celebrity/1403828/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1542251128.4.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1542251128.4.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1542251128.4.webp"},"name":"王广源","id":"1403828"}]
         * collect_count : 19336
         * original_title : 老师·好
         * subtype : movie
         * directors : [{"alt":"https://movie.douban.com/celebrity/1383594/","avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1550730545.46.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1550730545.46.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1550730545.46.webp"},"name":"张栾","id":"1383594"}]
         * year : 2019
         * images : {"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2551352209.webp","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2551352209.webp","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2551352209.webp"}
         * alt : https://movie.douban.com/subject/27663742/
         * id : 27663742
         */

        private RatingBean rating;
        private String title;
        private int collect_count;
        private String original_title;
        private String subtype;
        private String year;
        private ImagesBean images;
        private String alt;
        private String id;
        private List<String> genres;
        private List<CastsBean> casts;
        private List<DirectorsBean> directors;

        public RatingBean getRating() {
            return rating;
        }

        public void setRating(RatingBean rating) {
            this.rating = rating;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getCollect_count() {
            return collect_count;
        }

        public void setCollect_count(int collect_count) {
            this.collect_count = collect_count;
        }

        public String getOriginal_title() {
            return original_title;
        }

        public void setOriginal_title(String original_title) {
            this.original_title = original_title;
        }

        public String getSubtype() {
            return subtype;
        }

        public void setSubtype(String subtype) {
            this.subtype = subtype;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public ImagesBean getImages() {
            return images;
        }

        public void setImages(ImagesBean images) {
            this.images = images;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<String> getGenres() {
            return genres;
        }

        public void setGenres(List<String> genres) {
            this.genres = genres;
        }

        public List<CastsBean> getCasts() {
            return casts;
        }

        public void setCasts(List<CastsBean> casts) {
            this.casts = casts;
        }

        public List<DirectorsBean> getDirectors() {
            return directors;
        }

        public void setDirectors(List<DirectorsBean> directors) {
            this.directors = directors;
        }

        public static class RatingBean {
            /**
             * max : 10
             * average : 6.9
             * stars : 35
             * min : 0
             */

            private int max;
            private double average;
            private String stars;
            private int min;

            public int getMax() {
                return max;
            }

            public void setMax(int max) {
                this.max = max;
            }

            public double getAverage() {
                return average;
            }

            public void setAverage(double average) {
                this.average = average;
            }

            public String getStars() {
                return stars;
            }

            public void setStars(String stars) {
                this.stars = stars;
            }

            public int getMin() {
                return min;
            }

            public void setMin(int min) {
                this.min = min;
            }
        }

        public static class ImagesBean {
            /**
             * small : https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2551352209.webp
             * large : https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2551352209.webp
             * medium : https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2551352209.webp
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }

        public static class CastsBean {
            /**
             * alt : https://movie.douban.com/celebrity/1274307/
             * avatars : {"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1504169127.76.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1504169127.76.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1504169127.76.webp"}
             * name : 于谦
             * id : 1274307
             */

            private String alt;
            private AvatarsBean avatars;
            private String name;
            private String id;

            public String getAlt() {
                return alt;
            }

            public void setAlt(String alt) {
                this.alt = alt;
            }

            public AvatarsBean getAvatars() {
                return avatars;
            }

            public void setAvatars(AvatarsBean avatars) {
                this.avatars = avatars;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public static class AvatarsBean {
                /**
                 * small : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1504169127.76.webp
                 * large : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1504169127.76.webp
                 * medium : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1504169127.76.webp
                 */

                private String small;
                private String large;
                private String medium;

                public String getSmall() {
                    return small;
                }

                public void setSmall(String small) {
                    this.small = small;
                }

                public String getLarge() {
                    return large;
                }

                public void setLarge(String large) {
                    this.large = large;
                }

                public String getMedium() {
                    return medium;
                }

                public void setMedium(String medium) {
                    this.medium = medium;
                }
            }
        }

        public static class DirectorsBean {
            /**
             * alt : https://movie.douban.com/celebrity/1383594/
             * avatars : {"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1550730545.46.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1550730545.46.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1550730545.46.webp"}
             * name : 张栾
             * id : 1383594
             */

            private String alt;
            private AvatarsBeanX avatars;
            private String name;
            private String id;

            public String getAlt() {
                return alt;
            }

            public void setAlt(String alt) {
                this.alt = alt;
            }

            public AvatarsBeanX getAvatars() {
                return avatars;
            }

            public void setAvatars(AvatarsBeanX avatars) {
                this.avatars = avatars;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public static class AvatarsBeanX {
                /**
                 * small : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1550730545.46.webp
                 * large : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1550730545.46.webp
                 * medium : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1550730545.46.webp
                 */

                private String small;
                private String large;
                private String medium;

                public String getSmall() {
                    return small;
                }

                public void setSmall(String small) {
                    this.small = small;
                }

                public String getLarge() {
                    return large;
                }

                public void setLarge(String large) {
                    this.large = large;
                }

                public String getMedium() {
                    return medium;
                }

                public void setMedium(String medium) {
                    this.medium = medium;
                }
            }
        }
    }
}
