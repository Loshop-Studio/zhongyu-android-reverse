package com.umeng.analytics.pro;

/* renamed from: com.umeng.analytics.pro.bk */
/* loaded from: classes.dex */
public class C1880bk {

    /* renamed from: a */
    public final String f8498a;

    /* renamed from: b */
    public final byte f8499b;

    /* renamed from: c */
    public final short f8500c;

    public C1880bk() {
        this("", (byte) 0, (short) 0);
    }

    /* renamed from: a */
    public boolean m7026a(C1880bk c1880bk) {
        return this.f8499b == c1880bk.f8499b && this.f8500c == c1880bk.f8500c;
    }

    public String toString() {
        return "<TField name:'" + this.f8498a + "' type:" + ((int) this.f8499b) + " field-id:" + ((int) this.f8500c) + ">";
    }

    public C1880bk(String str, byte b4, short s3) {
        this.f8498a = str;
        this.f8499b = b4;
        this.f8500c = s3;
    }
}
