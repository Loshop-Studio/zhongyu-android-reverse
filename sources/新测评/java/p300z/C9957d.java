package p300z;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z.d */
/* loaded from: classes3.dex */
public final class C9957d implements InterfaceC9962i {

    /* renamed from: a */
    public final View f17797a;

    /* renamed from: b */
    public final boolean f17798b;

    public C9957d(View view, boolean z9) {
        this.f17797a = view;
        this.f17798b = z9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9957d)) {
            return false;
        }
        C9957d c9957d = (C9957d) obj;
        return Intrinsics.areEqual(this.f17797a, c9957d.f17797a) && this.f17798b == c9957d.f17798b;
    }

    @Override // p300z.InterfaceC9962i
    /* renamed from: g */
    public boolean mo16770g() {
        return this.f17798b;
    }

    @Override // p300z.InterfaceC9962i
    public View getView() {
        return this.f17797a;
    }

    public int hashCode() {
        return (this.f17797a.hashCode() * 31) + Boolean.hashCode(this.f17798b);
    }

    public String toString() {
        return "RealViewSizeResolver(view=" + this.f17797a + ", subtractPadding=" + this.f17798b + ')';
    }
}
