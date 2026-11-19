package p128h6;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: h6.c */
/* loaded from: classes5.dex */
public final class C8104c {

    /* renamed from: a */
    public final boolean f13830a;

    /* renamed from: b */
    public final boolean f13831b;

    public C8104c(boolean z9, boolean z10) {
        this.f13830a = z9;
        this.f13831b = z10;
    }

    /* renamed from: b */
    public static /* synthetic */ C8104c m12950b(C8104c c8104c, boolean z9, boolean z10, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z9 = c8104c.f13830a;
        }
        if ((i9 & 2) != 0) {
            z10 = c8104c.f13831b;
        }
        return c8104c.m12951a(z9, z10);
    }

    /* renamed from: a */
    public final C8104c m12951a(boolean z9, boolean z10) {
        return new C8104c(z9, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8104c)) {
            return false;
        }
        C8104c c8104c = (C8104c) obj;
        return this.f13830a == c8104c.f13830a && this.f13831b == c8104c.f13831b;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f13830a) * 31) + Boolean.hashCode(this.f13831b);
    }

    public String toString() {
        return "LoadingUiState(isShowProgress=" + this.f13830a + ", isShowRefresh=" + this.f13831b + ")";
    }

    public /* synthetic */ C8104c(boolean z9, boolean z10, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? false : z9, (i9 & 2) != 0 ? false : z10);
    }
}
