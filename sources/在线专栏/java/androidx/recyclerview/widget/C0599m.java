package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.m */
/* loaded from: classes.dex */
class C0599m {
    /* renamed from: a */
    static int m3421a(RecyclerView.C0580y c0580y, AbstractC0596j abstractC0596j, View view, View view2, RecyclerView.AbstractC0570o abstractC0570o, boolean z3) {
        if (abstractC0570o.getChildCount() == 0 || c0580y.m3161b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return Math.abs(abstractC0570o.getPosition(view) - abstractC0570o.getPosition(view2)) + 1;
        }
        return Math.min(abstractC0596j.mo3405n(), abstractC0596j.mo3395d(view2) - abstractC0596j.mo3398g(view));
    }

    /* renamed from: b */
    static int m3422b(RecyclerView.C0580y c0580y, AbstractC0596j abstractC0596j, View view, View view2, RecyclerView.AbstractC0570o abstractC0570o, boolean z3, boolean z4) {
        if (abstractC0570o.getChildCount() == 0 || c0580y.m3161b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z4 ? Math.max(0, (c0580y.m3161b() - Math.max(abstractC0570o.getPosition(view), abstractC0570o.getPosition(view2))) - 1) : Math.max(0, Math.min(abstractC0570o.getPosition(view), abstractC0570o.getPosition(view2)));
        if (z3) {
            return Math.round((iMax * (Math.abs(abstractC0596j.mo3395d(view2) - abstractC0596j.mo3398g(view)) / (Math.abs(abstractC0570o.getPosition(view) - abstractC0570o.getPosition(view2)) + 1))) + (abstractC0596j.mo3404m() - abstractC0596j.mo3398g(view)));
        }
        return iMax;
    }

    /* renamed from: c */
    static int m3423c(RecyclerView.C0580y c0580y, AbstractC0596j abstractC0596j, View view, View view2, RecyclerView.AbstractC0570o abstractC0570o, boolean z3) {
        if (abstractC0570o.getChildCount() == 0 || c0580y.m3161b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return c0580y.m3161b();
        }
        return (int) (((abstractC0596j.mo3395d(view2) - abstractC0596j.mo3398g(view)) / (Math.abs(abstractC0570o.getPosition(view) - abstractC0570o.getPosition(view2)) + 1)) * c0580y.m3161b());
    }
}
