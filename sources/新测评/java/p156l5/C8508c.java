package p156l5;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: l5.c */
/* loaded from: classes4.dex */
public final class C8508c {

    /* renamed from: a */
    public final boolean f14108a;

    /* renamed from: b */
    public final boolean f14109b;

    public C8508c(boolean z9, boolean z10) {
        this.f14108a = z9;
        this.f14109b = z10;
    }

    /* renamed from: b */
    public static /* synthetic */ C8508c m13983b(C8508c c8508c, boolean z9, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = c8508c.f14108a;
        }
        if ((i10 & 2) != 0) {
            z10 = c8508c.f14109b;
        }
        return c8508c.m13984a(z9, z10);
    }

    /* renamed from: a */
    public final C8508c m13984a(boolean z9, boolean z10) {
        return new C8508c(z9, z10);
    }

    /* renamed from: c */
    public final boolean m13985c() {
        return this.f14108a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8508c)) {
            return false;
        }
        C8508c c8508c = (C8508c) obj;
        return this.f14108a == c8508c.f14108a && this.f14109b == c8508c.f14109b;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f14108a) * 31) + Boolean.hashCode(this.f14109b);
    }

    public String toString() {
        return "LoadingUiState(isShowProgress=" + this.f14108a + ", isShowRefresh=" + this.f14109b + ")";
    }

    public /* synthetic */ C8508c(boolean z9, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z9, (i10 & 2) != 0 ? false : z10);
    }
}
