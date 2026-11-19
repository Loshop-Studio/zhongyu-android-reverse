package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* renamed from: androidx.recyclerview.widget.h */
/* loaded from: classes.dex */
public class C0594h extends AbstractC0601o {

    /* renamed from: d */
    private AbstractC0596j f3873d;

    /* renamed from: e */
    private AbstractC0596j f3874e;

    /* renamed from: i */
    private float m3377i(RecyclerView.AbstractC0570o abstractC0570o, AbstractC0596j abstractC0596j) {
        int childCount = abstractC0570o.getChildCount();
        if (childCount == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = abstractC0570o.getChildAt(i6);
            int position = abstractC0570o.getPosition(childAt);
            if (position != -1) {
                if (position < i4) {
                    view = childAt;
                    i4 = position;
                }
                if (position > i5) {
                    view2 = childAt;
                    i5 = position;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int iMax = Math.max(abstractC0596j.mo3395d(view), abstractC0596j.mo3395d(view2)) - Math.min(abstractC0596j.mo3398g(view), abstractC0596j.mo3398g(view2));
        if (iMax == 0) {
            return 1.0f;
        }
        return (iMax * 1.0f) / ((i5 - i4) + 1);
    }

    /* renamed from: j */
    private int m3378j(RecyclerView.AbstractC0570o abstractC0570o, View view, AbstractC0596j abstractC0596j) {
        return (abstractC0596j.mo3398g(view) + (abstractC0596j.mo3396e(view) / 2)) - (abstractC0596j.mo3404m() + (abstractC0596j.mo3405n() / 2));
    }

    /* renamed from: k */
    private int m3379k(RecyclerView.AbstractC0570o abstractC0570o, AbstractC0596j abstractC0596j, int i4, int i5) {
        int[] iArrM3441b = m3441b(i4, i5);
        float fM3377i = m3377i(abstractC0570o, abstractC0596j);
        if (fM3377i <= IGoodView.DEFAULT_TO_ALPHA) {
            return 0;
        }
        return Math.round((Math.abs(iArrM3441b[0]) > Math.abs(iArrM3441b[1]) ? iArrM3441b[0] : iArrM3441b[1]) / fM3377i);
    }

    /* renamed from: l */
    private View m3380l(RecyclerView.AbstractC0570o abstractC0570o, AbstractC0596j abstractC0596j) {
        int childCount = abstractC0570o.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iMo3404m = abstractC0596j.mo3404m() + (abstractC0596j.mo3405n() / 2);
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = abstractC0570o.getChildAt(i5);
            int iAbs = Math.abs((abstractC0596j.mo3398g(childAt) + (abstractC0596j.mo3396e(childAt) / 2)) - iMo3404m);
            if (iAbs < i4) {
                view = childAt;
                i4 = iAbs;
            }
        }
        return view;
    }

    /* renamed from: m */
    private AbstractC0596j m3381m(RecyclerView.AbstractC0570o abstractC0570o) {
        AbstractC0596j abstractC0596j = this.f3874e;
        if (abstractC0596j == null || abstractC0596j.f3876a != abstractC0570o) {
            this.f3874e = AbstractC0596j.m3392a(abstractC0570o);
        }
        return this.f3874e;
    }

    /* renamed from: n */
    private AbstractC0596j m3382n(RecyclerView.AbstractC0570o abstractC0570o) {
        AbstractC0596j abstractC0596j = this.f3873d;
        if (abstractC0596j == null || abstractC0596j.f3876a != abstractC0570o) {
            this.f3873d = AbstractC0596j.m3394c(abstractC0570o);
        }
        return this.f3873d;
    }

    @Override // androidx.recyclerview.widget.AbstractC0601o
    /* renamed from: a */
    public int[] mo3383a(RecyclerView.AbstractC0570o abstractC0570o, View view) {
        int[] iArr = new int[2];
        if (abstractC0570o.canScrollHorizontally()) {
            iArr[0] = m3378j(abstractC0570o, view, m3381m(abstractC0570o));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0570o.canScrollVertically()) {
            iArr[1] = m3378j(abstractC0570o, view, m3382n(abstractC0570o));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC0601o
    /* renamed from: e */
    public View mo3384e(RecyclerView.AbstractC0570o abstractC0570o) {
        if (abstractC0570o.canScrollVertically()) {
            return m3380l(abstractC0570o, m3382n(abstractC0570o));
        }
        if (abstractC0570o.canScrollHorizontally()) {
            return m3380l(abstractC0570o, m3381m(abstractC0570o));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.AbstractC0601o
    /* renamed from: f */
    public int mo3385f(RecyclerView.AbstractC0570o abstractC0570o, int i4, int i5) {
        int itemCount;
        View viewMo3384e;
        int position;
        int i6;
        PointF pointFComputeScrollVectorForPosition;
        int iM3379k;
        int iM3379k2;
        if (!(abstractC0570o instanceof RecyclerView.AbstractC0579x.b) || (itemCount = abstractC0570o.getItemCount()) == 0 || (viewMo3384e = mo3384e(abstractC0570o)) == null || (position = abstractC0570o.getPosition(viewMo3384e)) == -1 || (pointFComputeScrollVectorForPosition = ((RecyclerView.AbstractC0579x.b) abstractC0570o).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return -1;
        }
        if (abstractC0570o.canScrollHorizontally()) {
            iM3379k = m3379k(abstractC0570o, m3381m(abstractC0570o), i4, 0);
            if (pointFComputeScrollVectorForPosition.x < IGoodView.DEFAULT_TO_ALPHA) {
                iM3379k = -iM3379k;
            }
        } else {
            iM3379k = 0;
        }
        if (abstractC0570o.canScrollVertically()) {
            iM3379k2 = m3379k(abstractC0570o, m3382n(abstractC0570o), 0, i5);
            if (pointFComputeScrollVectorForPosition.y < IGoodView.DEFAULT_TO_ALPHA) {
                iM3379k2 = -iM3379k2;
            }
        } else {
            iM3379k2 = 0;
        }
        if (abstractC0570o.canScrollVertically()) {
            iM3379k = iM3379k2;
        }
        if (iM3379k == 0) {
            return -1;
        }
        int i7 = position + iM3379k;
        int i8 = i7 >= 0 ? i7 : 0;
        return i8 >= itemCount ? i6 : i8;
    }
}
