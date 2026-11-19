package p125i9;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i9.g */
/* loaded from: classes5.dex */
public final class C7722g {

    /* renamed from: c */
    public static final a f13151c = new a(null);

    /* renamed from: a */
    public int f13152a;

    /* renamed from: b */
    public final int[] f13153b = new int[10];

    /* renamed from: i9.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: a */
    public final int m12952a(int i10) {
        return this.f13153b[i10];
    }

    /* renamed from: b */
    public final int m12953b() {
        if ((this.f13152a & 2) != 0) {
            return this.f13153b[1];
        }
        return -1;
    }

    /* renamed from: c */
    public final int m12954c() {
        if ((this.f13152a & 128) != 0) {
            return this.f13153b[7];
        }
        return 65535;
    }

    /* renamed from: d */
    public final int m12955d() {
        if ((this.f13152a & 16) != 0) {
            return this.f13153b[4];
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: e */
    public final int m12956e(int i10) {
        return (this.f13152a & 32) != 0 ? this.f13153b[5] : i10;
    }

    /* renamed from: f */
    public final boolean m12957f(int i10) {
        return ((1 << i10) & this.f13152a) != 0;
    }

    /* renamed from: g */
    public final void m12958g(C7722g other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (other.m12957f(i10)) {
                m12959h(i10, other.m12952a(i10));
            }
        }
    }

    /* renamed from: h */
    public final C7722g m12959h(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f13153b;
            if (i10 < iArr.length) {
                this.f13152a = (1 << i10) | this.f13152a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    /* renamed from: i */
    public final int m12960i() {
        return Integer.bitCount(this.f13152a);
    }
}
