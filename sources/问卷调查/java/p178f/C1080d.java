package p178f;

import p160d.p161e.C0999e;
import p160d.p162f.p164b.C1011d;

/* renamed from: f.d */
/* loaded from: classes.dex */
public final class C1080d {

    /* renamed from: a */
    public final byte[] f5653a;

    /* renamed from: b */
    public int f5654b;

    /* renamed from: c */
    public int f5655c;

    /* renamed from: d */
    public boolean f5656d;

    /* renamed from: e */
    public boolean f5657e;

    /* renamed from: f */
    public C1080d f5658f;

    /* renamed from: g */
    public C1080d f5659g;

    public C1080d() {
        this.f5653a = new byte[8192];
        this.f5657e = true;
        this.f5656d = false;
    }

    public C1080d(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        C1011d.m2809e(bArr, "data");
        this.f5653a = bArr;
        this.f5654b = i;
        this.f5655c = i2;
        this.f5656d = z;
        this.f5657e = z2;
    }

    /* renamed from: a */
    public final C1080d m2873a() {
        C1080d c1080d = this.f5658f;
        if (c1080d == this) {
            c1080d = null;
        }
        C1080d c1080d2 = this.f5659g;
        C1011d.m2807c(c1080d2);
        c1080d2.f5658f = this.f5658f;
        C1080d c1080d3 = this.f5658f;
        C1011d.m2807c(c1080d3);
        c1080d3.f5659g = this.f5659g;
        this.f5658f = null;
        this.f5659g = null;
        return c1080d;
    }

    /* renamed from: b */
    public final C1080d m2874b(C1080d c1080d) {
        C1011d.m2809e(c1080d, "segment");
        c1080d.f5659g = this;
        c1080d.f5658f = this.f5658f;
        C1080d c1080d2 = this.f5658f;
        C1011d.m2807c(c1080d2);
        c1080d2.f5659g = c1080d;
        this.f5658f = c1080d;
        return c1080d;
    }

    /* renamed from: c */
    public final C1080d m2875c() {
        this.f5656d = true;
        return new C1080d(this.f5653a, this.f5654b, this.f5655c, true, false);
    }

    /* renamed from: d */
    public final void m2876d(C1080d c1080d, int i) {
        C1011d.m2809e(c1080d, "sink");
        if (!c1080d.f5657e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i2 = c1080d.f5655c;
        if (i2 + i > 8192) {
            if (c1080d.f5656d) {
                throw new IllegalArgumentException();
            }
            int i3 = c1080d.f5654b;
            if ((i2 + i) - i3 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = c1080d.f5653a;
            C0999e.m2795b(bArr, bArr, 0, i3, i2, 2);
            c1080d.f5655c -= c1080d.f5654b;
            c1080d.f5654b = 0;
        }
        byte[] bArr2 = this.f5653a;
        byte[] bArr3 = c1080d.f5653a;
        int i4 = c1080d.f5655c;
        int i5 = this.f5654b;
        C0999e.m2794a(bArr2, bArr3, i4, i5, i5 + i);
        c1080d.f5655c += i;
        this.f5654b += i;
    }
}
