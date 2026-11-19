package com.xuexiang.xui.widget.layout.linkage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.Scroller;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout;
import p019b3.C3109e;
import p019b3.InterfaceC3105a;
import p019b3.InterfaceC3106b;
import p019b3.InterfaceC3107c;
import p129o2.C6268a;

/* loaded from: classes3.dex */
public class LinkageWebView extends WebView implements InterfaceC3106b, NestedScrollingChild {

    /* renamed from: j */
    public static final /* synthetic */ int f4543j = 0;

    /* renamed from: a */
    public final NestedScrollingChildHelper f4544a;

    /* renamed from: b */
    public final C3109e f4545b;

    /* renamed from: c */
    public final float f4546c;

    /* renamed from: d */
    public VelocityTracker f4547d;

    /* renamed from: e */
    public final int f4548e;

    /* renamed from: f */
    public final int f4549f;

    /* renamed from: g */
    public final Scroller f4550g;

    /* renamed from: h */
    public InterfaceC3105a f4551h;

    /* renamed from: i */
    public final int[] f4552i;

    public LinkageWebView(Context context) {
        this(context, null);
    }

    @Override // p019b3.InterfaceC3106b
    /* renamed from: a */
    public final InterfaceC3107c mo2061a() {
        return new C6268a(this, 4);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void computeScroll() {
        Scroller scroller = this.f4550g;
        if (scroller.computeScrollOffset()) {
            scrollTo(0, scroller.getCurrY());
            invalidate();
        }
    }

    /* renamed from: d */
    public final void m3525d() {
        super.scrollTo(0, getWebViewContentHeight() - getHeight());
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean dispatchNestedFling(float f, float f7, boolean z8) {
        return this.f4544a.dispatchNestedFling(f, f7, z8);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean dispatchNestedPreFling(float f, float f7) {
        return this.f4544a.dispatchNestedPreFling(f, f7);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean dispatchNestedPreScroll(int i, int i8, int[] iArr, int[] iArr2) {
        return this.f4544a.dispatchNestedPreScroll(i, i8, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean dispatchNestedScroll(int i, int i8, int i9, int i10, int[] iArr) {
        return this.f4544a.dispatchNestedScroll(i, i8, i9, i10, iArr);
    }

    @Override // android.webkit.WebView
    public final void flingScroll(int i, int i8) {
        this.f4550g.fling(0, getScrollY(), 0, i8, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        invalidate();
    }

    public int getScrollRange() {
        return getWebViewContentHeight() - getHeight();
    }

    public int getWebViewContentHeight() {
        return (int) (getContentHeight() * this.f4546c);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean hasNestedScrollingParent() {
        return this.f4544a.hasNestedScrollingParent();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean isNestedScrollingEnabled() {
        return this.f4544a.isNestedScrollingEnabled();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i, int i8, int i9, int i10) {
        InterfaceC3105a interfaceC3105a;
        InterfaceC3105a interfaceC3105a2;
        super.onScrollChanged(i, i8, i9, i10);
        if ((!canScrollVertically(1) || getScrollY() >= getScrollRange()) && (interfaceC3105a = this.f4551h) != null) {
            ((C6268a) interfaceC3105a).m5870z(this);
        }
        if (!canScrollVertically(-1) && (interfaceC3105a2 = this.f4551h) != null) {
            ((C6268a) interfaceC3105a2).m5866A(this);
        }
        InterfaceC3105a interfaceC3105a3 = this.f4551h;
        if (interfaceC3105a3 != null) {
            ((LinkageScrollLayout) ((C6268a) interfaceC3105a3).f10022b).awakenScrollBars();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            float r0 = r11.getRawX()
            float r1 = r11.getRawY()
            int r2 = r11.getAction()
            r3 = 2
            b3.e r4 = r10.f4545b
            r5 = 1
            if (r2 == 0) goto L9d
            androidx.core.view.NestedScrollingChildHelper r6 = r10.f4544a
            r7 = 0
            r8 = 0
            if (r2 == r5) goto L49
            r9 = 3
            if (r2 == r3) goto L1f
            if (r2 == r9) goto L49
            goto Lcf
        L1f:
            r4.m2069a(r0, r1)
            android.view.VelocityTracker r0 = r10.f4547d
            if (r0 != 0) goto L2c
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r10.f4547d = r0
        L2c:
            android.view.VelocityTracker r0 = r10.f4547d
            r0.addMovement(r11)
            boolean r0 = r4.f1550f
            if (r0 == 0) goto Lcf
            float r0 = r4.f1548d
            float r0 = -r0
            int r0 = (int) r0
            int[] r1 = r10.f4552i
            boolean r1 = r6.dispatchNestedPreScroll(r8, r0, r1, r7)
            if (r1 != 0) goto L44
            r10.scrollBy(r8, r0)
        L44:
            r11.setAction(r9)
            goto Lcf
        L49:
            r4.f1550f = r8
            android.graphics.PointF r2 = r4.f1547c
            r2.set(r0, r1)
            android.view.VelocityTracker r0 = r10.f4547d
            r0.addMovement(r11)
            android.view.VelocityTracker r0 = r10.f4547d
            if (r0 == 0) goto Lcf
            int r1 = r10.f4548e
            float r1 = (float) r1
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r2, r1)
            android.view.VelocityTracker r0 = r10.f4547d
            float r0 = r0.getYVelocity()
            int r0 = (int) r0
            android.view.VelocityTracker r1 = r10.f4547d
            if (r1 == 0) goto L71
            r1.recycle()
            r10.f4547d = r7
        L71:
            int r1 = java.lang.Math.abs(r0)
            int r2 = r10.f4549f
            if (r1 <= r2) goto Lcf
            int r0 = -r0
            int r1 = r10.getScrollY()
            if (r1 > 0) goto L82
            if (r0 <= 0) goto L8b
        L82:
            int r2 = r10.getScrollRange()
            if (r1 < r2) goto L8d
            if (r0 >= 0) goto L8b
            goto L8d
        L8b:
            r1 = r8
            goto L8e
        L8d:
            r1 = r5
        L8e:
            float r2 = (float) r0
            r3 = 0
            boolean r4 = r6.dispatchNestedPreFling(r3, r2)
            if (r4 != 0) goto Lcf
            r10.dispatchNestedFling(r3, r2, r1)
            r10.flingScroll(r8, r0)
            goto Lcf
        L9d:
            android.graphics.PointF r2 = r4.f1545a
            r2.set(r0, r1)
            android.graphics.PointF r2 = r4.f1546b
            r2.set(r0, r1)
            r10.startNestedScroll(r3)
            android.view.ViewParent r0 = r10.getParent()
            if (r0 == 0) goto Lb7
            android.view.ViewParent r0 = r10.getParent()
            r0.requestDisallowInterceptTouchEvent(r5)
        Lb7:
            android.view.VelocityTracker r0 = r10.f4547d
            if (r0 != 0) goto Lc2
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r10.f4547d = r0
            goto Lc5
        Lc2:
            r0.clear()
        Lc5:
            android.view.VelocityTracker r0 = r10.f4547d
            r0.addMovement(r11)
            android.widget.Scroller r0 = r10.f4550g
            r0.abortAnimation()
        Lcf:
            super.onTouchEvent(r11)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.layout.linkage.view.LinkageWebView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i8) {
        super.scrollTo(i, Math.min(Math.max(i8, 0), getScrollRange()));
    }

    @Override // p019b3.InterfaceC3106b
    public void setChildLinkageEvent(InterfaceC3105a interfaceC3105a) {
        this.f4551h = interfaceC3105a;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z8) {
        this.f4544a.setNestedScrollingEnabled(z8);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean startNestedScroll(int i) {
        return this.f4544a.startNestedScroll(i);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final void stopNestedScroll() {
        this.f4544a.stopNestedScroll();
    }

    public LinkageWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public LinkageWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4552i = new int[2];
        this.f4550g = new Scroller(getContext());
        this.f4544a = new NestedScrollingChildHelper(this);
        C3109e c3109e = new C3109e();
        this.f4545b = c3109e;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        c3109e.f1549e = viewConfiguration.getScaledTouchSlop();
        this.f4546c = context.getResources().getDisplayMetrics().density;
        this.f4548e = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f4549f = viewConfiguration.getScaledMinimumFlingVelocity();
        setNestedScrollingEnabled(true);
    }
}
