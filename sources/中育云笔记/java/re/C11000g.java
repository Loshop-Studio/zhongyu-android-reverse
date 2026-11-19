package re;

import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: re.g */
/* loaded from: classes6.dex */
public final class C11000g {

    /* renamed from: c */
    public static final a f26563c = new a(null);

    /* renamed from: a */
    public int f26564a;

    /* renamed from: b */
    public final int[] f26565b = new int[10];

    /* renamed from: re.g$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: a */
    public final int m24306a(int i10) {
        return this.f26565b[i10];
    }

    /* renamed from: b */
    public final int m24307b() {
        if ((this.f26564a & 2) != 0) {
            return this.f26565b[1];
        }
        return -1;
    }

    /* renamed from: c */
    public final int m24308c() {
        if ((this.f26564a & 128) != 0) {
            return this.f26565b[7];
        }
        return 65535;
    }

    /* renamed from: d */
    public final int m24309d() {
        if ((this.f26564a & 16) != 0) {
            return this.f26565b[4];
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: e */
    public final int m24310e(int i10) {
        return (this.f26564a & 32) != 0 ? this.f26565b[5] : i10;
    }

    /* renamed from: f */
    public final boolean m24311f(int i10) {
        return ((1 << i10) & this.f26564a) != 0;
    }

    /* renamed from: g */
    public final void m24312g(C11000g other) {
        AbstractC9979u.m20294g(other, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (other.m24311f(i10)) {
                m24313h(i10, other.m24306a(i10));
            }
        }
    }

    /* renamed from: h */
    public final C11000g m24313h(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f26565b;
            if (i10 < iArr.length) {
                this.f26564a = (1 << i10) | this.f26564a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    /* renamed from: i */
    public final int m24314i() {
        return Integer.bitCount(this.f26564a);
    }
}
