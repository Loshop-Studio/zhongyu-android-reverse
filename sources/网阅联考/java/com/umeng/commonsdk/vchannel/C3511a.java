package com.umeng.commonsdk.vchannel;

/* renamed from: com.umeng.commonsdk.vchannel.a */
/* loaded from: classes2.dex */
public class C3511a {

    /* renamed from: a */
    public static String f3031a = "https://pslog.umeng.com";

    /* renamed from: b */
    public static String f3032b = "https://pslog.umeng.com/";

    /* renamed from: c */
    public static String f3033c = "explog";

    /* renamed from: d */
    public static final String f3034d = "analytics";

    /* renamed from: e */
    public static final String f3035e = "ekv";

    /* renamed from: f */
    public static final String f3036f = "id";

    /* renamed from: g */
    public static final String f3037g = "ts";

    /* renamed from: h */
    public static final String f3038h = "ds";

    /* renamed from: i */
    public static final String f3039i = "pn";

    /* renamed from: j */
    public static String f3040j = "";

    static {
        String str = "SUB" + System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(String.format("%0" + (32 - str.length()) + "d", 0));
        f3040j = sb.toString();
    }
}
