package com.umeng.analytics.pro;

/* renamed from: com.umeng.analytics.pro.cc */
/* loaded from: classes.dex */
public final class C1899cc extends AbstractC1900cd {

    /* renamed from: a */
    private byte[] f8628a;

    /* renamed from: b */
    private int f8629b;

    /* renamed from: c */
    private int f8630c;

    public C1899cc() {
    }

    /* renamed from: a */
    public void m7046a(byte[] bArr) {
        m7047c(bArr, 0, bArr.length);
    }

    @Override // com.umeng.analytics.pro.AbstractC1900cd
    /* renamed from: a */
    public boolean mo7040a() {
        return true;
    }

    @Override // com.umeng.analytics.pro.AbstractC1900cd
    /* renamed from: b */
    public void mo7041b() throws C1901ce {
    }

    @Override // com.umeng.analytics.pro.AbstractC1900cd
    /* renamed from: b */
    public void mo7042b(byte[] bArr, int i4, int i5) throws C1901ce {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    @Override // com.umeng.analytics.pro.AbstractC1900cd
    /* renamed from: c */
    public void mo7043c() {
    }

    /* renamed from: c */
    public void m7047c(byte[] bArr, int i4, int i5) {
        this.f8628a = bArr;
        this.f8629b = i4;
        this.f8630c = i4 + i5;
    }

    /* renamed from: e */
    public void m7048e() {
        this.f8628a = null;
    }

    @Override // com.umeng.analytics.pro.AbstractC1900cd
    /* renamed from: f */
    public byte[] mo7049f() {
        return this.f8628a;
    }

    @Override // com.umeng.analytics.pro.AbstractC1900cd
    /* renamed from: g */
    public int mo7050g() {
        return this.f8629b;
    }

    @Override // com.umeng.analytics.pro.AbstractC1900cd
    /* renamed from: h */
    public int mo7051h() {
        return this.f8630c - this.f8629b;
    }

    public C1899cc(byte[] bArr) {
        m7046a(bArr);
    }

    @Override // com.umeng.analytics.pro.AbstractC1900cd
    /* renamed from: a */
    public int mo7039a(byte[] bArr, int i4, int i5) throws C1901ce {
        int iMo7051h = mo7051h();
        if (i5 > iMo7051h) {
            i5 = iMo7051h;
        }
        if (i5 > 0) {
            System.arraycopy(this.f8628a, this.f8629b, bArr, i4, i5);
            mo7045a(i5);
        }
        return i5;
    }

    public C1899cc(byte[] bArr, int i4, int i5) {
        m7047c(bArr, i4, i5);
    }

    @Override // com.umeng.analytics.pro.AbstractC1900cd
    /* renamed from: a */
    public void mo7045a(int i4) {
        this.f8629b += i4;
    }
}
