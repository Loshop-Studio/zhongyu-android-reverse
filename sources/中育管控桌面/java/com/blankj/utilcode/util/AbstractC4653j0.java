package com.blankj.utilcode.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.blankj.utilcode.util.j0 */
/* loaded from: classes3.dex */
public abstract class AbstractC4653j0 {

    /* renamed from: a */
    public static final ThreadLocal f2083a = new a();

    /* renamed from: b */
    public static final String[] f2084b = {"猴", "鸡", "狗", "猪", "鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊"};

    /* renamed from: c */
    public static final int[] f2085c = {20, 19, 21, 21, 21, 22, 23, 23, 23, 24, 23, 22};

    /* renamed from: d */
    public static final String[] f2086d = {"水瓶座", "双鱼座", "白羊座", "金牛座", "双子座", "巨蟹座", "狮子座", "处女座", "天秤座", "天蝎座", "射手座", "摩羯座"};

    /* renamed from: com.blankj.utilcode.util.j0$a */
    public class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map initialValue() {
            return new HashMap();
        }
    }

    /* renamed from: a */
    public static String m2202a(Date date, String str) {
        return m2204c(str).format(date);
    }

    /* renamed from: b */
    public static SimpleDateFormat m2203b() {
        return m2204c("yyyy-MM-dd HH:mm:ss");
    }

    /* renamed from: c */
    public static SimpleDateFormat m2204c(String str) {
        Map map = (Map) f2083a.get();
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) map.get(str);
        if (simpleDateFormat != null) {
            return simpleDateFormat;
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str);
        map.put(str, simpleDateFormat2);
        return simpleDateFormat2;
    }

    /* renamed from: d */
    public static String m2205d(long j6, DateFormat dateFormat) {
        return dateFormat.format(new Date(j6));
    }

    /* renamed from: e */
    public static Date m2206e(String str) {
        return m2207f(str, m2203b());
    }

    /* renamed from: f */
    public static Date m2207f(String str, DateFormat dateFormat) {
        try {
            return dateFormat.parse(str);
        } catch (ParseException e6) {
            e6.printStackTrace();
            return null;
        }
    }
}
