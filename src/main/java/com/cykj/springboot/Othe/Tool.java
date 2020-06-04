package com.cykj.springboot.Othe;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Tool {
    public Tool() {
    }

    public int getRandom(int start, int end) {//区域随机数
        return new Random().nextInt(end - start) + start;
    }

    public String getRandCode(int count, String str) {//在str获取count位的随机码
        String verCode = "";
        if (str == null)
            str = "0mcSDFGxz2aZnRu5yb1vYf3gitO8PAE7reU9HXCoJKLBNVw6qQWsdIThjk4lpM";
        for (int i = 0; i < count; i++)
            verCode += str.charAt(getRandom(0, str.length()));
        return verCode;
    }

    public String getDate(String regex) {//日期格式
        SimpleDateFormat df = new SimpleDateFormat(regex);
        //设置日期格式yyyy-MM-dd HH:mm:ss精确到秒
        return df.format(new Date());
    }
}
