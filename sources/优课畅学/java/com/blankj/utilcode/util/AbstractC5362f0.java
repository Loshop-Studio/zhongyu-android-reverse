package com.blankj.utilcode.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.blankj.utilcode.util.f0 */
/* loaded from: classes3.dex */
public abstract class AbstractC5362f0 {

    /* renamed from: a */
    public static final ThreadLocal f2700a = new a();

    /* renamed from: b */
    public static final String[] f2701b = {"猴", "鸡", "狗", "猪", "鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊"};

    /* renamed from: c */
    public static final int[] f2702c = {20, 19, 21, 21, 21, 22, 23, 23, 23, 24, 23, 22};

    /* renamed from: d */
    public static final String[] f2703d = {"水瓶座", "双鱼座", "白羊座", "金牛座", "双子座", "巨蟹座", "狮子座", "处女座", "天秤座", "天蝎座", "射手座", "摩羯座"};

    /* renamed from: com.blankj.utilcode.util.f0$a */
    public class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map initialValue() {
            return new HashMap();
        }
    }

    /* renamed from: a */
    public static String m2459a(Date date) {
        return m2460b(date, m2461c());
    }

    /* renamed from: b */
    public static String m2460b(Date date, DateFormat dateFormat) {
        return dateFormat.format(date);
    }

    /* renamed from: c */
    public static SimpleDateFormat m2461c() {
        return m2462d("yyyy-MM-dd HH:mm:ss");
    }

    /* renamed from: d */
    public static SimpleDateFormat m2462d(String str) {
        Map map = (Map) f2700a.get();
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) map.get(str);
        if (simpleDateFormat != null) {
            return simpleDateFormat;
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str);
        map.put(str, simpleDateFormat2);
        return simpleDateFormat2;
    }

    /* renamed from: e */
    public static String m2463e(long j10, DateFormat dateFormat) {
        return dateFormat.format(new Date(j10));
    }
}
