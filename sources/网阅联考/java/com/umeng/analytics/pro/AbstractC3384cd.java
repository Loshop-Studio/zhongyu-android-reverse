package com.umeng.analytics.pro;

/* renamed from: com.umeng.analytics.pro.cd */
/* loaded from: classes2.dex */
public abstract class AbstractC3384cd {
    /* renamed from: a */
    public abstract int mo3116a(byte[] bArr, int i4, int i5) throws C3385ce;

    /* renamed from: a */
    public void mo3122a(int i4) {
    }

    /* renamed from: a */
    public abstract boolean mo3117a();

    /* renamed from: b */
    public abstract void mo3118b() throws C3385ce;

    /* renamed from: b */
    public void m3129b(byte[] bArr) throws C3385ce {
        mo3119b(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public abstract void mo3119b(byte[] bArr, int i4, int i5) throws C3385ce;

    /* renamed from: c */
    public abstract void mo3120c();

    /* renamed from: d */
    public void mo3121d() throws C3385ce {
    }

    /* renamed from: f */
    public byte[] mo3126f() {
        return null;
    }

    /* renamed from: g */
    public int mo3127g() {
        return 0;
    }

    /* renamed from: h */
    public int mo3128h() {
        return -1;
    }

    /* renamed from: i */
    public boolean m3131i() {
        return mo3117a();
    }

    /* renamed from: d */
    public int m3130d(byte[] bArr, int i4, int i5) throws C3385ce {
        int i6 = 0;
        while (i6 < i5) {
            int iMo3116a = mo3116a(bArr, i4 + i6, i5 - i6);
            if (iMo3116a <= 0) {
                throw new C3385ce("Cannot read. Remote side has closed. Tried to read " + i5 + " bytes, but only got " + i6 + " bytes. (This is often indicative of an internal error on the server side. Please check your server logs.)");
            }
            i6 += iMo3116a;
        }
        return i6;
    }
}
