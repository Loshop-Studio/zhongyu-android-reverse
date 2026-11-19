package p318r5;

/* renamed from: r5.x */
/* loaded from: classes5.dex */
public class C10903x {

    /* renamed from: a */
    public byte[] f26318a;

    /* renamed from: b */
    public int f26319b = 0;

    public C10903x(int i10) {
        this.f26318a = null;
        this.f26318a = new byte[i10];
    }

    /* renamed from: a */
    public void m23696a(byte[] bArr, int i10) {
        if (i10 <= 0) {
            return;
        }
        byte[] bArr2 = this.f26318a;
        int length = bArr2.length;
        int i11 = this.f26319b;
        if (length - i11 >= i10) {
            System.arraycopy(bArr, 0, bArr2, i11, i10);
        } else {
            byte[] bArr3 = new byte[(bArr2.length + i10) << 1];
            System.arraycopy(bArr2, 0, bArr3, 0, i11);
            System.arraycopy(bArr, 0, bArr3, this.f26319b, i10);
            this.f26318a = bArr3;
        }
        this.f26319b += i10;
    }

    /* renamed from: b */
    public byte[] m23697b() {
        int i10 = this.f26319b;
        if (i10 <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f26318a, 0, bArr, 0, i10);
        return bArr;
    }

    /* renamed from: c */
    public int m23698c() {
        return this.f26319b;
    }
}
