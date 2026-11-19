package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* renamed from: androidx.recyclerview.widget.k */
/* loaded from: classes.dex */
public class C0597k extends AbstractC0601o {

    /* renamed from: d */
    private AbstractC0596j f3879d;

    /* renamed from: e */
    private AbstractC0596j f3880e;

    /* renamed from: androidx.recyclerview.widget.k$a */
    class a extends C0593g {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0593g
        protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C0593g
        protected int calculateTimeForScrolling(int i4) {
            return Math.min(100, super.calculateTimeForScrolling(i4));
        }

        @Override // androidx.recyclerview.widget.C0593g, androidx.recyclerview.widget.RecyclerView.AbstractC0579x
        protected void onTargetFound(View view, RecyclerView.C0580y c0580y, RecyclerView.AbstractC0579x.a aVar) {
            C0597k c0597k = C0597k.this;
            int[] iArrMo3383a = c0597k.mo3383a(c0597k.f3885a.getLayoutManager(), view);
            int i4 = iArrMo3383a[0];
            int i5 = iArrMo3383a[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i4), Math.abs(i5)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.m3159d(i4, i5, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    /* renamed from: i */
    private int m3411i(RecyclerView.AbstractC0570o abstractC0570o, View view, AbstractC0596j abstractC0596j) {
        return (abstractC0596j.mo3398g(view) + (abstractC0596j.mo3396e(view) / 2)) - (abstractC0596j.mo3404m() + (abstractC0596j.mo3405n() / 2));
    }

    /* renamed from: j */
    private View m3412j(RecyclerView.AbstractC0570o abstractC0570o, AbstractC0596j abstractC0596j) {
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

    /* renamed from: k */
    private AbstractC0596j m3413k(RecyclerView.AbstractC0570o abstractC0570o) {
        AbstractC0596j abstractC0596j = this.f3880e;
        if (abstractC0596j == null || abstractC0596j.f3876a != abstractC0570o) {
            this.f3880e = AbstractC0596j.m3392a(abstractC0570o);
        }
        return this.f3880e;
    }

    /* renamed from: l */
    private AbstractC0596j m3414l(RecyclerView.AbstractC0570o abstractC0570o) {
        if (abstractC0570o.canScrollVertically()) {
            return m3415m(abstractC0570o);
        }
        if (abstractC0570o.canScrollHorizontally()) {
            return m3413k(abstractC0570o);
        }
        return null;
    }

    /* renamed from: m */
    private AbstractC0596j m3415m(RecyclerView.AbstractC0570o abstractC0570o) {
        AbstractC0596j abstractC0596j = this.f3879d;
        if (abstractC0596j == null || abstractC0596j.f3876a != abstractC0570o) {
            this.f3879d = AbstractC0596j.m3394c(abstractC0570o);
        }
        return this.f3879d;
    }

    /* renamed from: n */
    private boolean m3416n(RecyclerView.AbstractC0570o abstractC0570o, int i4, int i5) {
        return abstractC0570o.canScrollHorizontally() ? i4 > 0 : i5 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    private boolean m3417o(RecyclerView.AbstractC0570o abstractC0570o) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = abstractC0570o.getItemCount();
        if (!(abstractC0570o instanceof RecyclerView.AbstractC0579x.b) || (pointFComputeScrollVectorForPosition = ((RecyclerView.AbstractC0579x.b) abstractC0570o).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return pointFComputeScrollVectorForPosition.x < IGoodView.DEFAULT_TO_ALPHA || pointFComputeScrollVectorForPosition.y < IGoodView.DEFAULT_TO_ALPHA;
    }

    @Override // androidx.recyclerview.widget.AbstractC0601o
    /* renamed from: a */
    public int[] mo3383a(RecyclerView.AbstractC0570o abstractC0570o, View view) {
        int[] iArr = new int[2];
        if (abstractC0570o.canScrollHorizontally()) {
            iArr[0] = m3411i(abstractC0570o, view, m3413k(abstractC0570o));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0570o.canScrollVertically()) {
            iArr[1] = m3411i(abstractC0570o, view, m3415m(abstractC0570o));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC0601o
    /* renamed from: d */
    protected C0593g mo3418d(RecyclerView.AbstractC0570o abstractC0570o) {
        if (abstractC0570o instanceof RecyclerView.AbstractC0579x.b) {
            return new a(this.f3885a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC0601o
    /* renamed from: e */
    public View mo3384e(RecyclerView.AbstractC0570o abstractC0570o) {
        if (abstractC0570o.canScrollVertically()) {
            return m3412j(abstractC0570o, m3415m(abstractC0570o));
        }
        if (abstractC0570o.canScrollHorizontally()) {
            return m3412j(abstractC0570o, m3413k(abstractC0570o));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC0601o
    /* renamed from: f */
    public int mo3385f(RecyclerView.AbstractC0570o abstractC0570o, int i4, int i5) {
        AbstractC0596j abstractC0596jM3414l;
        int itemCount = abstractC0570o.getItemCount();
        if (itemCount == 0 || (abstractC0596jM3414l = m3414l(abstractC0570o)) == null) {
            return -1;
        }
        int i6 = Integer.MIN_VALUE;
        int i7 = Integer.MAX_VALUE;
        int childCount = abstractC0570o.getChildCount();
        View view = null;
        View view2 = null;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = abstractC0570o.getChildAt(i8);
            if (childAt != null) {
                int iM3411i = m3411i(abstractC0570o, childAt, abstractC0596jM3414l);
                if (iM3411i <= 0 && iM3411i > i6) {
                    view2 = childAt;
                    i6 = iM3411i;
                }
                if (iM3411i >= 0 && iM3411i < i7) {
                    view = childAt;
                    i7 = iM3411i;
                }
            }
        }
        boolean zM3416n = m3416n(abstractC0570o, i4, i5);
        if (zM3416n && view != null) {
            return abstractC0570o.getPosition(view);
        }
        if (!zM3416n && view2 != null) {
            return abstractC0570o.getPosition(view2);
        }
        if (zM3416n) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = abstractC0570o.getPosition(view) + (m3417o(abstractC0570o) == zM3416n ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }
}
