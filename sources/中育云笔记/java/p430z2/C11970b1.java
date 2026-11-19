package p430z2;

import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: z2.b1 */
/* loaded from: classes3.dex */
public final class C11970b1 {

    /* renamed from: a */
    public final boolean f28345a;

    /* renamed from: b */
    public final boolean f28346b;

    /* renamed from: c */
    public final String f28347c;

    /* renamed from: d */
    public final String f28348d;

    public C11970b1(boolean z10, boolean z11, String str, String str2) {
        this.f28345a = z10;
        this.f28346b = z11;
        this.f28347c = str;
        this.f28348d = str2;
    }

    /* renamed from: b */
    public static /* synthetic */ C11970b1 m26594b(C11970b1 c11970b1, boolean z10, boolean z11, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = c11970b1.f28345a;
        }
        if ((i10 & 2) != 0) {
            z11 = c11970b1.f28346b;
        }
        if ((i10 & 4) != 0) {
            str = c11970b1.f28347c;
        }
        if ((i10 & 8) != 0) {
            str2 = c11970b1.f28348d;
        }
        return c11970b1.m26595a(z10, z11, str, str2);
    }

    /* renamed from: a */
    public final C11970b1 m26595a(boolean z10, boolean z11, String str, String str2) {
        return new C11970b1(z10, z11, str, str2);
    }

    /* renamed from: c */
    public final String m26596c() {
        return this.f28347c;
    }

    /* renamed from: d */
    public final boolean m26597d() {
        return this.f28345a;
    }

    /* renamed from: e */
    public final boolean m26598e() {
        return this.f28346b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11970b1)) {
            return false;
        }
        C11970b1 c11970b1 = (C11970b1) obj;
        return this.f28345a == c11970b1.f28345a && this.f28346b == c11970b1.f28346b && AbstractC9979u.m20289b(this.f28347c, c11970b1.f28347c) && AbstractC9979u.m20289b(this.f28348d, c11970b1.f28348d);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.f28345a) * 31) + Boolean.hashCode(this.f28346b)) * 31;
        String str = this.f28347c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f28348d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "UiState(isLoading=" + this.f28345a + ", isRefreshing=" + this.f28346b + ", errorMessage=" + this.f28347c + ", successMessage=" + this.f28348d + ")";
    }

    public /* synthetic */ C11970b1(boolean z10, boolean z11, String str, String str2, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2);
    }
}
