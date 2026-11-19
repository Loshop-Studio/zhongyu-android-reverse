package p114g2;

/* renamed from: g2.b0 */
/* loaded from: classes4.dex */
public final class C8006b0 extends AbstractC8008c0 {

    /* renamed from: a */
    public byte[] f13483a;

    /* renamed from: b */
    public int f13484b;

    /* renamed from: c */
    public int f13485c;

    @Override // p114g2.AbstractC8008c0
    /* renamed from: a */
    public int mo12559a(byte[] bArr, int i9, int i10) {
        int iMo12565h = mo12565h();
        if (i10 > iMo12565h) {
            i10 = iMo12565h;
        }
        if (i10 > 0) {
            System.arraycopy(this.f13483a, this.f13484b, bArr, i9, i10);
            mo12562b(i10);
        }
        return i10;
    }

    @Override // p114g2.AbstractC8008c0
    /* renamed from: b */
    public void mo12562b(int i9) {
        this.f13484b += i9;
    }

    @Override // p114g2.AbstractC8008c0
    /* renamed from: d */
    public void mo12560d(byte[] bArr, int i9, int i10) {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    @Override // p114g2.AbstractC8008c0
    /* renamed from: f */
    public byte[] mo12563f() {
        return this.f13483a;
    }

    @Override // p114g2.AbstractC8008c0
    /* renamed from: g */
    public int mo12564g() {
        return this.f13484b;
    }

    @Override // p114g2.AbstractC8008c0
    /* renamed from: h */
    public int mo12565h() {
        return this.f13485c - this.f13484b;
    }

    /* renamed from: i */
    public void m12566i(byte[] bArr) {
        m12567j(bArr, 0, bArr.length);
    }

    /* renamed from: j */
    public void m12567j(byte[] bArr, int i9, int i10) {
        this.f13483a = bArr;
        this.f13484b = i9;
        this.f13485c = i9 + i10;
    }

    /* renamed from: k */
    public void m12568k() {
        this.f13483a = null;
    }
}
