package com.example.charles.retrofitapp.retrofit_practice;

import java.util.List;

/**
 * Created by charles on 9/19/17.
 */

public class MusicBean {

    /**
     * code : 0
     * msg : 查询成功
     * obj : [{"id":"f39c8ce35219a0b501523eeea5c206f0","name":"忧郁 伤感"},{"id":"f39c8ce35219a0b501523eeee53c06f1","name":"兴奋 激动"},{"id":"f39c8ce35219a0b501523eef279506f2","name":"浪漫 甜蜜"},{"id":"f39c8ce35219a0b501523eef835106f4","name":"开阔 释怀"},{"id":"f39c8ce35219a0b501523eefc4df06f5","name":"流行"},{"id":"f39c8ce35219a0b501523eeff2a506f6","name":"民谣"},{"id":"f39c8ce35219a0b501523ef0567006f7","name":"爵士"},{"id":"f39c8ce35219a0b501523ef0ac3206f9","name":"古典"},{"id":"f39c8ce35219a0b501523ef0df6706fa","name":"说唱"},{"id":"f39c8ce35219a0b501523ef1039906fb","name":"电子"},{"id":"f39c8ce35219a0b501523ef1428606fc","name":"摇滚"},{"id":"f39c8ce35219a0b501523ef1891506fd","name":"世界"},{"id":"f39c8ce35219a0b501523ef1bb6006fe","name":"民乐"},{"id":"f39c8ce35219a0b501523ef231c90701","name":"清晨"},{"id":"f39c8ce35219a0b501523ef25bd60702","name":"深夜"},{"id":"f39c8ce35219a0b501523ef28e120703","name":"睡前"},{"id":"f39c8ce35219a0b501523ef34ee20706","name":"冥想"},{"id":"f39c8ce35219a0b501523f2f5aa1075a","name":"沙发"},{"id":"f39c8ce35219a0b501523f34a7820775","name":"聚会"},{"id":"f39c8ce35219a0b501523f359b580776","name":"经典老歌"},{"id":"f39c8ce35219a0b501523f35d8fe0777","name":"影视金曲"},{"id":"f39c8ce35219a0b501523f3638350778","name":"节日欢庆"},{"id":"f39c8ce35219a0b501523f3669760779","name":"军歌嘹亮"},{"id":"f39c8ce35219a0b501523f36c87f077b","name":"TV热门"},{"id":"f39c8ce35219a0b501523f37079b077c","name":"广场舞曲"},{"id":"f39c8ce35219a0b501523f3838c9077d","name":"婴幼亲子"},{"id":"f39c8ce35219a0b501523f3aa75a0786","name":"动漫音乐"},{"id":"f39c8ce35219a0b501523f3ae1940787","name":"热门彩铃"},{"id":"f39c8ce35577bb45015580347ac90116","name":"华语"},{"id":"f39c8ce35577bb45015580392a900130","name":"轻音乐"},{"id":"f39c8ce35577bb450155803ae7550133","name":"欧美"},{"id":"f39c8ce35577bb450155803e71590135","name":"日韩"},{"id":"f39c8ce35577bb45015580433fe50136","name":"清新"}]
     */

    private int code;
    private String msg;
    private List<Music> obj;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<Music> getObj() {
        return obj;
    }

    public void setObj(List<Music> obj) {
        this.obj = obj;
    }

    public static class Music {
        /**
         * id : f39c8ce35219a0b501523eeea5c206f0
         * name : 忧郁 伤感
         */

        private String id;
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Music{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "MusicBean{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", obj=" + obj +
                '}';
    }
}
