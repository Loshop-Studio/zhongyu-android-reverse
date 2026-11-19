package p070h3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: h3.w */
/* loaded from: classes4.dex */
public final class C6480w {

    /* renamed from: a */
    public final boolean f8272a;

    /* renamed from: b */
    public final boolean f8273b;

    public C6480w(boolean z6, boolean z7) {
        this.f8272a = z6;
        this.f8273b = z7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6480w)) {
            return false;
        }
        C6480w c6480w = (C6480w) obj;
        return this.f8272a == c6480w.f8272a && this.f8273b == c6480w.f8273b;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f8272a) * 31) + Boolean.hashCode(this.f8273b);
    }

    public String toString() {
        return "DetailUiState(isDeleteDialogShow=" + this.f8272a + ", isRecoverDialogShow=" + this.f8273b + ")";
    }

    public /* synthetic */ C6480w(boolean z6, boolean z7, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? false : z6, (i6 & 2) != 0 ? false : z7);
    }
}
