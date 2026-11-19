package com.umeng.analytics.pro;

/* renamed from: com.umeng.analytics.pro.bn */
/* loaded from: classes.dex */
public final class C1883bn {

    /* renamed from: a */
    public final String f8506a;

    /* renamed from: b */
    public final byte f8507b;

    /* renamed from: c */
    public final int f8508c;

    public C1883bn() {
        this("", (byte) 0, 0);
    }

    /* renamed from: a */
    public boolean m7027a(C1883bn c1883bn) {
        return this.f8506a.equals(c1883bn.f8506a) && this.f8507b == c1883bn.f8507b && this.f8508c == c1883bn.f8508c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1883bn) {
            return m7027a((C1883bn) obj);
        }
        return false;
    }

    public String toString() {
        return "<TMessage name:'" + this.f8506a + "' type: " + ((int) this.f8507b) + " seqid:" + this.f8508c + ">";
    }

    public C1883bn(String str, byte b4, int i4) {
        this.f8506a = str;
        this.f8507b = b4;
        this.f8508c = i4;
    }
}
