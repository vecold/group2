package com.geminno.framework.pojo;

import java.util.ArrayList;

/**
 * Created by Jingsheng Liang on 2016/9/14.
 */
public class ListActivityBean {
    public int status;
    public ArrayList<Friend> friendlist;

    @Override
    public String toString() {
        return "ListActivityBean{" +
                "status=" + status +
                ", friendlist=" + friendlist +
                '}';
    }

    public static class Friend{
        public Integer friendId;
        public String photoImg;
        public String name;
        public String title;
        public String content;
        public Integer dianzan;

        @Override
        public String toString() {
            return "Friend{" +
                    "friendId=" + friendId +
                    ", photoImg='" + photoImg + '\'' +
                    ", name='" + name + '\'' +
                    ", title='" + title + '\'' +
                    ", content='" + content + '\'' +
                    ", dianzan=" + dianzan +
                    '}';
        }
    }
}
