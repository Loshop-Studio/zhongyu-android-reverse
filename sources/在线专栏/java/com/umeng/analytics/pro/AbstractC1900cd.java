package com.umeng.analytics.pro;

/* renamed from: com.umeng.analytics.pro.cd */
/* loaded from: classes.dex */
public abstract class AbstractC1900cd {
    /* renamed from: a */
    public abstract int mo7039a(byte[] bArr, int i4, int i5) throws C1901ce;

    /* renamed from: a */
    public void mo7045a(int i4) {
    }

    /* renamed from: a */
    public abstract boolean mo7040a();

    /* renamed from: b */
    public abstract void mo7041b() throws C1901ce;

    /* renamed from: b */
    public void m7052b(byte[] bArr) throws C1901ce {
        mo7042b(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public abstract void mo7042b(byte[] bArr, int i4, int i5) throws C1901ce;

    /* renamed from: c */
    public abstract void mo7043c();

    /* renamed from: d */
    public int m7053d(byte[] bArr, int i4, int i5) throws C1901ce {
        int i6 = 0;
        while (i6 < i5) {
            int iMo7039a = mo7039a(bArr, i4 + i6, i5 - i6);
            if (iMo7039a <= 0) {
                throw new C1901ce("Cannot read. Remote side has closed. Tried to read " + i5 + " bytes, but only got " + i6 + " bytes. (This is often indicative of an internal error on the server side. Please check your server logs.)");
            }
            i6 += iMo7039a;
        }
        return i6;
    }

    /* renamed from: d */
    public void mo7044d() throws C1901ce {
    }

    /* renamed from: f */
    public byte[] mo7049f() {
        return null;
    }

    /* renamed from: g */
    public int mo7050g() {
        return 0;
    }

    /* renamed from: h */
    public int mo7051h() {
        return -1;
    }

    /* renamed from: i */
    public boolean m7054i() {
        return mo7040a();
    }
}
