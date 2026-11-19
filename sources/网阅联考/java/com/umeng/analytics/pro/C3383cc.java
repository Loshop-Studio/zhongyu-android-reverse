package com.umeng.analytics.pro;

/* renamed from: com.umeng.analytics.pro.cc */
/* loaded from: classes2.dex */
public final class C3383cc extends AbstractC3384cd {

    /* renamed from: a */
    private byte[] f2036a;

    /* renamed from: b */
    private int f2037b;

    /* renamed from: c */
    private int f2038c;

    public C3383cc() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3384cd
    /* renamed from: a */
    public boolean mo3117a() {
        return true;
    }

    @Override // com.umeng.analytics.pro.AbstractC3384cd
    /* renamed from: b */
    public void mo3118b() throws C3385ce {
    }

    @Override // com.umeng.analytics.pro.AbstractC3384cd
    /* renamed from: c */
    public void mo3120c() {
    }

    /* renamed from: e */
    public void m3125e() {
        this.f2036a = null;
    }

    @Override // com.umeng.analytics.pro.AbstractC3384cd
    /* renamed from: f */
    public byte[] mo3126f() {
        return this.f2036a;
    }

    @Override // com.umeng.analytics.pro.AbstractC3384cd
    /* renamed from: g */
    public int mo3127g() {
        return this.f2037b;
    }

    @Override // com.umeng.analytics.pro.AbstractC3384cd
    /* renamed from: h */
    public int mo3128h() {
        return this.f2038c - this.f2037b;
    }

    public C3383cc(byte[] bArr) {
        m3123a(bArr);
    }

    /* renamed from: a */
    public void m3123a(byte[] bArr) {
        m3124c(bArr, 0, bArr.length);
    }

    @Override // com.umeng.analytics.pro.AbstractC3384cd
    /* renamed from: b */
    public void mo3119b(byte[] bArr, int i4, int i5) throws C3385ce {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    /* renamed from: c */
    public void m3124c(byte[] bArr, int i4, int i5) {
        this.f2036a = bArr;
        this.f2037b = i4;
        this.f2038c = i4 + i5;
    }

    @Override // com.umeng.analytics.pro.AbstractC3384cd
    /* renamed from: a */
    public int mo3116a(byte[] bArr, int i4, int i5) throws C3385ce {
        int iMo3128h = mo3128h();
        if (i5 > iMo3128h) {
            i5 = iMo3128h;
        }
        if (i5 > 0) {
            System.arraycopy(this.f2036a, this.f2037b, bArr, i4, i5);
            mo3122a(i5);
        }
        return i5;
    }

    public C3383cc(byte[] bArr, int i4, int i5) {
        m3124c(bArr, i4, i5);
    }

    @Override // com.umeng.analytics.pro.AbstractC3384cd
    /* renamed from: a */
    public void mo3122a(int i4) {
        this.f2037b += i4;
    }
}
