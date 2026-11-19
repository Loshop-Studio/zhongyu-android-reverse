package p256t8;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t8.g */
/* loaded from: classes5.dex */
public final class C9642g {

    /* renamed from: c */
    public static final a f16981c = new a(null);

    /* renamed from: a */
    public int f16982a;

    /* renamed from: b */
    public final int[] f16983b = new int[10];

    /* renamed from: t8.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: a */
    public final int m15971a(int i9) {
        return this.f16983b[i9];
    }

    /* renamed from: b */
    public final int m15972b() {
        if ((this.f16982a & 2) != 0) {
            return this.f16983b[1];
        }
        return -1;
    }

    /* renamed from: c */
    public final int m15973c() {
        if ((this.f16982a & 128) != 0) {
            return this.f16983b[7];
        }
        return 65535;
    }

    /* renamed from: d */
    public final int m15974d() {
        if ((this.f16982a & 16) != 0) {
            return this.f16983b[4];
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: e */
    public final int m15975e(int i9) {
        return (this.f16982a & 32) != 0 ? this.f16983b[5] : i9;
    }

    /* renamed from: f */
    public final boolean m15976f(int i9) {
        return ((1 << i9) & this.f16982a) != 0;
    }

    /* renamed from: g */
    public final void m15977g(C9642g other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i9 = 0; i9 < 10; i9++) {
            if (other.m15976f(i9)) {
                m15978h(i9, other.m15971a(i9));
            }
        }
    }

    /* renamed from: h */
    public final C9642g m15978h(int i9, int i10) {
        if (i9 >= 0) {
            int[] iArr = this.f16983b;
            if (i9 < iArr.length) {
                this.f16982a = (1 << i9) | this.f16982a;
                iArr[i9] = i10;
            }
        }
        return this;
    }

    /* renamed from: i */
    public final int m15979i() {
        return Integer.bitCount(this.f16982a);
    }
}
