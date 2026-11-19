package p149z2;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z2.k */
/* loaded from: classes2.dex */
public final class C4718k {

    /* renamed from: c */
    public static final a f6277c = new a(null);

    /* renamed from: a */
    public int f6278a;

    /* renamed from: b */
    public final int[] f6279b = new int[10];

    /* renamed from: z2.k$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final int m6915a(int i4) {
        return this.f6279b[i4];
    }

    /* renamed from: b */
    public final int m6916b() {
        if ((this.f6278a & 2) != 0) {
            return this.f6279b[1];
        }
        return -1;
    }

    /* renamed from: c */
    public final int m6917c() {
        if ((this.f6278a & 128) != 0) {
            return this.f6279b[7];
        }
        return 65535;
    }

    /* renamed from: d */
    public final int m6918d() {
        if ((this.f6278a & 16) != 0) {
            return this.f6279b[4];
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: e */
    public final int m6919e(int i4) {
        return (this.f6278a & 32) != 0 ? this.f6279b[5] : i4;
    }

    /* renamed from: f */
    public final boolean m6920f(int i4) {
        return ((1 << i4) & this.f6278a) != 0;
    }

    /* renamed from: g */
    public final void m6921g(C4718k other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i4 = 0; i4 < 10; i4++) {
            if (other.m6920f(i4)) {
                m6922h(i4, other.m6915a(i4));
            }
        }
    }

    /* renamed from: h */
    public final C4718k m6922h(int i4, int i5) {
        if (i4 >= 0) {
            int[] iArr = this.f6279b;
            if (i4 < iArr.length) {
                this.f6278a = (1 << i4) | this.f6278a;
                iArr[i4] = i5;
            }
        }
        return this;
    }

    /* renamed from: i */
    public final int m6923i() {
        return Integer.bitCount(this.f6278a);
    }
}
