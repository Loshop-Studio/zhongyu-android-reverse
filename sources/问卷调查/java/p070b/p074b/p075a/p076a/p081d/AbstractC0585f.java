package p070b.p074b.p075a.p076a.p081d;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;
import p000a.p031h.p032b.C0190e;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p031h.p043j.C0277z;

/* renamed from: b.b.a.a.d.f */
/* loaded from: classes.dex */
public abstract class AbstractC0585f extends C0586g<View> {

    /* renamed from: c */
    public final Rect f3575c;

    /* renamed from: d */
    public final Rect f3576d;

    /* renamed from: e */
    public int f3577e;

    /* renamed from: f */
    public int f3578f;

    public AbstractC0585f() {
        this.f3575c = new Rect();
        this.f3576d = new Rect();
        this.f3577e = 0;
    }

    public AbstractC0585f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3575c = new Rect();
        this.f3576d = new Rect();
        this.f3577e = 0;
    }

    @Override // p070b.p074b.p075a.p076a.p081d.C0586g
    /* renamed from: C */
    public void mo2113C(CoordinatorLayout coordinatorLayout, View view, int i) {
        int bottom;
        AppBarLayout appBarLayoutM2609F = ((AppBarLayout.ScrollingViewBehavior) this).m2609F(coordinatorLayout.m1647d(view));
        if (appBarLayoutM2609F != null) {
            CoordinatorLayout.C0506f c0506f = (CoordinatorLayout.C0506f) view.getLayoutParams();
            Rect rect = this.f3575c;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0506f).leftMargin, appBarLayoutM2609F.getBottom() + ((ViewGroup.MarginLayoutParams) c0506f).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0506f).rightMargin, ((appBarLayoutM2609F.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0506f).bottomMargin);
            C0277z lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rect.left = lastWindowInsets.m897b() + rect.left;
                    rect.right -= lastWindowInsets.m898c();
                }
            }
            Rect rect2 = this.f3576d;
            int i2 = c0506f.f3116c;
            if (i2 == 0) {
                i2 = 8388659;
            }
            Gravity.apply(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int iM2114E = m2114E(appBarLayoutM2609F);
            view.layout(rect2.left, rect2.top - iM2114E, rect2.right, rect2.bottom - iM2114E);
            bottom = rect2.top - appBarLayoutM2609F.getBottom();
        } else {
            coordinatorLayout.m1655r(view, i);
            bottom = 0;
        }
        this.f3577e = bottom;
    }

    /* renamed from: E */
    public final int m2114E(View view) {
        int i;
        if (this.f3578f == 0) {
            return 0;
        }
        float f2 = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            CoordinatorLayout.AbstractC0503c abstractC0503c = ((CoordinatorLayout.C0506f) appBarLayout.getLayoutParams()).f3114a;
            int iMo2109E = abstractC0503c instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) abstractC0503c).mo2109E() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + iMo2109E > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                f2 = 1.0f + (iMo2109E / i);
            }
        }
        int i2 = this.f3578f;
        return C0190e.m713h((int) (f2 * i2), 0, i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: l */
    public boolean mo1675l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        C0277z lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if (i5 != -1 && i5 != -2) {
            return false;
        }
        AppBarLayout appBarLayoutM2609F = ((AppBarLayout.ScrollingViewBehavior) this).m2609F(coordinatorLayout.m1647d(view));
        if (appBarLayoutM2609F == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            if (appBarLayoutM2609F.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.m896a() + lastWindowInsets.m899d();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.m1656s(view, i, i2, View.MeasureSpec.makeMeasureSpec((size + appBarLayoutM2609F.getTotalScrollRange()) - appBarLayoutM2609F.getMeasuredHeight(), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }
}
