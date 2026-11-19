package p307z;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z.d */
/* loaded from: classes3.dex */
public final class C9974d implements InterfaceC9979i {

    /* renamed from: a */
    public final View f17941a;

    /* renamed from: b */
    public final boolean f17942b;

    public C9974d(View view, boolean z9) {
        this.f17941a = view;
        this.f17942b = z9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9974d)) {
            return false;
        }
        C9974d c9974d = (C9974d) obj;
        return Intrinsics.areEqual(this.f17941a, c9974d.f17941a) && this.f17942b == c9974d.f17942b;
    }

    @Override // p307z.InterfaceC9979i
    /* renamed from: g */
    public boolean mo17257g() {
        return this.f17942b;
    }

    @Override // p307z.InterfaceC9979i
    public View getView() {
        return this.f17941a;
    }

    public int hashCode() {
        return (this.f17941a.hashCode() * 31) + Boolean.hashCode(this.f17942b);
    }

    public String toString() {
        return "RealViewSizeResolver(view=" + this.f17941a + ", subtractPadding=" + this.f17942b + ')';
    }
}
