package p194z;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z.d */
/* loaded from: classes3.dex */
public final class C7922d implements InterfaceC7927i {

    /* renamed from: a */
    public final View f10640a;

    /* renamed from: b */
    public final boolean f10641b;

    public C7922d(View view, boolean z6) {
        this.f10640a = view;
        this.f10641b = z6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7922d)) {
            return false;
        }
        C7922d c7922d = (C7922d) obj;
        return Intrinsics.areEqual(this.f10640a, c7922d.f10640a) && this.f10641b == c7922d.f10641b;
    }

    @Override // p194z.InterfaceC7927i
    /* renamed from: g */
    public boolean mo9718g() {
        return this.f10641b;
    }

    @Override // p194z.InterfaceC7927i
    public View getView() {
        return this.f10640a;
    }

    public int hashCode() {
        return (this.f10640a.hashCode() * 31) + Boolean.hashCode(this.f10641b);
    }

    public String toString() {
        return "RealViewSizeResolver(view=" + this.f10640a + ", subtractPadding=" + this.f10641b + ')';
    }
}
