package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.f */
/* loaded from: classes.dex */
class C0592f {

    /* renamed from: b */
    int f3865b;

    /* renamed from: c */
    int f3866c;

    /* renamed from: d */
    int f3867d;

    /* renamed from: e */
    int f3868e;

    /* renamed from: h */
    boolean f3871h;

    /* renamed from: i */
    boolean f3872i;

    /* renamed from: a */
    boolean f3864a = true;

    /* renamed from: f */
    int f3869f = 0;

    /* renamed from: g */
    int f3870g = 0;

    C0592f() {
    }

    /* renamed from: a */
    boolean m3375a(RecyclerView.C0580y c0580y) {
        int i4 = this.f3866c;
        return i4 >= 0 && i4 < c0580y.m3161b();
    }

    /* renamed from: b */
    View m3376b(RecyclerView.C0576u c0576u) {
        View viewM3143o = c0576u.m3143o(this.f3866c);
        this.f3866c += this.f3867d;
        return viewM3143o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f3865b + ", mCurrentPosition=" + this.f3866c + ", mItemDirection=" + this.f3867d + ", mLayoutDirection=" + this.f3868e + ", mStartLine=" + this.f3869f + ", mEndLine=" + this.f3870g + '}';
    }
}
