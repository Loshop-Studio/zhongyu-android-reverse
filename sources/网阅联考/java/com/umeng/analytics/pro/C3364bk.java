package com.umeng.analytics.pro;

/* renamed from: com.umeng.analytics.pro.bk */
/* loaded from: classes2.dex */
public class C3364bk {

    /* renamed from: a */
    public final String f1906a;

    /* renamed from: b */
    public final byte f1907b;

    /* renamed from: c */
    public final short f1908c;

    public C3364bk() {
        this("", (byte) 0, (short) 0);
    }

    /* renamed from: a */
    public boolean m3103a(C3364bk c3364bk) {
        return this.f1907b == c3364bk.f1907b && this.f1908c == c3364bk.f1908c;
    }

    public String toString() {
        return "<TField name:'" + this.f1906a + "' type:" + ((int) this.f1907b) + " field-id:" + ((int) this.f1908c) + ">";
    }

    public C3364bk(String str, byte b4, short s3) {
        this.f1906a = str;
        this.f1907b = b4;
        this.f1908c = s3;
    }
}
