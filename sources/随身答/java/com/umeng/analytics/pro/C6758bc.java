package com.umeng.analytics.pro;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.umeng.analytics.pro.bc */
/* loaded from: classes4.dex */
public class C6758bc implements Serializable {

    /* renamed from: d */
    public static Map f6613d = new HashMap();

    /* renamed from: a */
    public final String f6614a;

    /* renamed from: b */
    public final byte f6615b;

    /* renamed from: c */
    public final C6759bd f6616c;

    public C6758bc(String str, byte b10, C6759bd c6759bd) {
        this.f6614a = str;
        this.f6615b = b10;
        this.f6616c = c6759bd;
    }

    /* renamed from: a */
    public static void m6069a(Class cls, Map map) {
        f6613d.put(cls, map);
    }
}
