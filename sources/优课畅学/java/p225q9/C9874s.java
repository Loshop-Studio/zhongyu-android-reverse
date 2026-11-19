package p225q9;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: q9.s */
/* loaded from: classes5.dex */
public final class C9874s {

    /* renamed from: c */
    public static final a f19756c = new a(null);

    /* renamed from: a */
    public int f19757a;

    /* renamed from: b */
    public final int[] f19758b = new int[10];

    /* renamed from: q9.s$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: a */
    public final int m18436a(int i10) {
        return this.f19758b[i10];
    }

    /* renamed from: b */
    public final int m18437b() {
        if ((this.f19757a & 2) != 0) {
            return this.f19758b[1];
        }
        return -1;
    }

    /* renamed from: c */
    public final int m18438c() {
        if ((this.f19757a & 16) != 0) {
            return this.f19758b[4];
        }
        return 65535;
    }

    /* renamed from: d */
    public final int m18439d() {
        if ((this.f19757a & 8) != 0) {
            return this.f19758b[3];
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: e */
    public final int m18440e(int i10) {
        return (this.f19757a & 32) != 0 ? this.f19758b[5] : i10;
    }

    /* renamed from: f */
    public final boolean m18441f(int i10) {
        return ((1 << i10) & this.f19757a) != 0;
    }

    /* renamed from: g */
    public final void m18442g(C9874s other) {
        AbstractC9133u.m16133g(other, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (other.m18441f(i10)) {
                m18443h(i10, other.m18436a(i10));
            }
        }
    }

    /* renamed from: h */
    public final C9874s m18443h(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f19758b;
            if (i10 < iArr.length) {
                this.f19757a = (1 << i10) | this.f19757a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    /* renamed from: i */
    public final int m18444i() {
        return Integer.bitCount(this.f19757a);
    }
}
