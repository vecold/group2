package com.geminno.framework.pojo;

import java.io.Serializable;

/**
 * Created by Jingsheng Liang on 2016/9/13.
 */
public class Friend implements Serializable {

    public Integer friendId;
    public String photoImg;
    public String name;
    public String title;
    public String content;
    public Integer dianzan;

    // alt+insert

    public Friend(){}
    public Friend(Integer friendId, String name, String title, String content) {
        this.friendId = friendId;
        this.name = name;
        this.title = title;
        this.content = content;
    }


}
