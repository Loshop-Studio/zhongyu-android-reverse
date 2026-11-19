package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.core.view.o */
/* loaded from: classes.dex */
public class C0352o {

    /* renamed from: a */
    private int f2743a;

    /* renamed from: b */
    private int f2744b;

    public C0352o(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int m1968a() {
        return this.f2743a | this.f2744b;
    }

    /* renamed from: b */
    public void m1969b(View view, View view2, int i4) {
        m1970c(view, view2, i4, 0);
    }

    /* renamed from: c */
    public void m1970c(View view, View view2, int i4, int i5) {
        if (i5 == 1) {
            this.f2744b = i4;
        } else {
            this.f2743a = i4;
        }
    }

    /* renamed from: d */
    public void m1971d(View view) {
        m1972e(view, 0);
    }

    /* renamed from: e */
    public void m1972e(View view, int i4) {
        if (i4 == 1) {
            this.f2744b = 0;
        } else {
            this.f2743a = 0;
        }
    }
}
