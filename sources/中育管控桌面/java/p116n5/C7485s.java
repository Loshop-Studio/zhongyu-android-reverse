package p116n5;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n5.s */
/* loaded from: classes4.dex */
public final class C7485s {

    /* renamed from: c */
    public static final a f9662c = new a(null);

    /* renamed from: a */
    public int f9663a;

    /* renamed from: b */
    public final int[] f9664b = new int[10];

    /* renamed from: n5.s$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: a */
    public final int m8603a(int i6) {
        return this.f9664b[i6];
    }

    /* renamed from: b */
    public final int m8604b() {
        if ((this.f9663a & 2) != 0) {
            return this.f9664b[1];
        }
        return -1;
    }

    /* renamed from: c */
    public final int m8605c() {
        if ((this.f9663a & 16) != 0) {
            return this.f9664b[4];
        }
        return 65535;
    }

    /* renamed from: d */
    public final int m8606d() {
        if ((this.f9663a & 8) != 0) {
            return this.f9664b[3];
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: e */
    public final int m8607e(int i6) {
        return (this.f9663a & 32) != 0 ? this.f9664b[5] : i6;
    }

    /* renamed from: f */
    public final boolean m8608f(int i6) {
        return ((1 << i6) & this.f9663a) != 0;
    }

    /* renamed from: g */
    public final void m8609g(C7485s other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i6 = 0; i6 < 10; i6++) {
            if (other.m8608f(i6)) {
                m8610h(i6, other.m8603a(i6));
            }
        }
    }

    /* renamed from: h */
    public final C7485s m8610h(int i6, int i7) {
        if (i6 >= 0) {
            int[] iArr = this.f9664b;
            if (i6 < iArr.length) {
                this.f9663a = (1 << i6) | this.f9663a;
                iArr[i6] = i7;
            }
        }
        return this;
    }

    /* renamed from: i */
    public final int m8611i() {
        return Integer.bitCount(this.f9663a);
    }
}
