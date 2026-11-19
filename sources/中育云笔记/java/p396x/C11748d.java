package p396x;

import android.view.View;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: x.d */
/* loaded from: classes3.dex */
public final class C11748d implements InterfaceC11753i {

    /* renamed from: c */
    public final View f27920c;

    /* renamed from: d */
    public final boolean f27921d;

    public C11748d(View view, boolean z10) {
        this.f27920c = view;
        this.f27921d = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11748d)) {
            return false;
        }
        C11748d c11748d = (C11748d) obj;
        return AbstractC9979u.m20289b(this.f27920c, c11748d.f27920c) && this.f27921d == c11748d.f27921d;
    }

    @Override // p396x.InterfaceC11753i
    /* renamed from: f */
    public boolean mo25998f() {
        return this.f27921d;
    }

    @Override // p396x.InterfaceC11753i
    public View getView() {
        return this.f27920c;
    }

    public int hashCode() {
        return (this.f27920c.hashCode() * 31) + Boolean.hashCode(this.f27921d);
    }

    public String toString() {
        return "RealViewSizeResolver(view=" + this.f27920c + ", subtractPadding=" + this.f27921d + ')';
    }
}
