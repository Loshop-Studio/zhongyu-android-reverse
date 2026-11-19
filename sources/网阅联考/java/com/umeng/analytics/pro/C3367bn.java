package com.umeng.analytics.pro;

/* renamed from: com.umeng.analytics.pro.bn */
/* loaded from: classes2.dex */
public final class C3367bn {

    /* renamed from: a */
    public final String f1914a;

    /* renamed from: b */
    public final byte f1915b;

    /* renamed from: c */
    public final int f1916c;

    public C3367bn() {
        this("", (byte) 0, 0);
    }

    /* renamed from: a */
    public boolean m3104a(C3367bn c3367bn) {
        return this.f1914a.equals(c3367bn.f1914a) && this.f1915b == c3367bn.f1915b && this.f1916c == c3367bn.f1916c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3367bn) {
            return m3104a((C3367bn) obj);
        }
        return false;
    }

    public String toString() {
        return "<TMessage name:'" + this.f1914a + "' type: " + ((int) this.f1915b) + " seqid:" + this.f1916c + ">";
    }

    public C3367bn(String str, byte b4, int i4) {
        this.f1914a = str;
        this.f1915b = b4;
        this.f1916c = i4;
    }
}
