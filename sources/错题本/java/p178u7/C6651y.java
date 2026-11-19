package p178u7;

/* renamed from: u7.y */
/* loaded from: classes4.dex */
public final class C6651y {

    /* renamed from: a */
    public final int f11218a;

    /* renamed from: b */
    public final int f11219b;

    /* renamed from: c */
    public final Object f11220c;

    public C6651y(byte[] bArr, int i, int i8) {
        this.f11220c = bArr;
        this.f11218a = i;
        this.f11219b = i8;
    }

    public C6651y() {
        this.f11220c = new C6651y[256];
        this.f11218a = 0;
        this.f11219b = 0;
    }

    public C6651y(int i, int i8) {
        this.f11220c = null;
        this.f11218a = i;
        int i9 = i8 & 7;
        this.f11219b = i9 == 0 ? 8 : i9;
    }
}
