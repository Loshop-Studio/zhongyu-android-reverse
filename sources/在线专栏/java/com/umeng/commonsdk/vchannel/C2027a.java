package com.umeng.commonsdk.vchannel;

/* renamed from: com.umeng.commonsdk.vchannel.a */
/* loaded from: classes.dex */
public class C2027a {

    /* renamed from: a */
    public static String f9623a = "https://pslog.umeng.com";

    /* renamed from: b */
    public static String f9624b = "https://pslog.umeng.com/";

    /* renamed from: c */
    public static String f9625c = "explog";

    /* renamed from: d */
    public static final String f9626d = "analytics";

    /* renamed from: e */
    public static final String f9627e = "ekv";

    /* renamed from: f */
    public static final String f9628f = "id";

    /* renamed from: g */
    public static final String f9629g = "ts";

    /* renamed from: h */
    public static final String f9630h = "ds";

    /* renamed from: i */
    public static final String f9631i = "pn";

    /* renamed from: j */
    public static String f9632j = "";

    static {
        String str = "SUB" + System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(String.format("%0" + (32 - str.length()) + "d", 0));
        f9632j = sb.toString();
    }
}
