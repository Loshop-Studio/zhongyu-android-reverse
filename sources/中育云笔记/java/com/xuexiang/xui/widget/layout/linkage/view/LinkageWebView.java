package com.xuexiang.xui.widget.layout.linkage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.Scroller;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import p421y8.C11921e;
import p421y8.InterfaceC11917a;
import p421y8.InterfaceC11918b;
import p421y8.InterfaceC11919c;

/* loaded from: classes5.dex */
public class LinkageWebView extends WebView implements InterfaceC11918b, NestedScrollingChild {

    /* renamed from: c */
    public NestedScrollingChildHelper f16403c;

    /* renamed from: d */
    public C11921e f16404d;

    /* renamed from: e */
    public final float f16405e;

    /* renamed from: f */
    public VelocityTracker f16406f;

    /* renamed from: g */
    public int f16407g;

    /* renamed from: h */
    public int f16408h;

    /* renamed from: i */
    public Scroller f16409i;

    /* renamed from: j */
    public InterfaceC11917a f16410j;

    /* renamed from: k */
    public final int[] f16411k;

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.view.LinkageWebView$a */
    public class C8174a implements InterfaceC11919c {
        public C8174a() {
        }

        @Override // p421y8.InterfaceC11919c
        /* renamed from: a */
        public boolean mo12950a(int i10) {
            return LinkageWebView.this.m12957e(i10);
        }

        @Override // p421y8.InterfaceC11919c
        /* renamed from: b */
        public int mo12946b() {
            return LinkageWebView.this.computeVerticalScrollOffset();
        }

        @Override // p421y8.InterfaceC11919c
        /* renamed from: c */
        public void mo12951c() {
            LinkageWebView.this.m12963k();
        }

        @Override // p421y8.InterfaceC11919c
        /* renamed from: d */
        public int mo12947d() {
            return LinkageWebView.this.computeVerticalScrollRange();
        }

        @Override // p421y8.InterfaceC11919c
        /* renamed from: e */
        public void mo12952e(View view, int i10) {
            LinkageWebView.this.flingScroll(0, i10);
        }

        @Override // p421y8.InterfaceC11919c
        /* renamed from: f */
        public boolean mo12948f() {
            return true;
        }

        @Override // p421y8.InterfaceC11919c
        /* renamed from: g */
        public void mo12953g() {
            LinkageWebView.this.scrollTo(0, 0);
        }
    }

    public LinkageWebView(Context context) {
        this(context, null);
    }

    @Override // p421y8.InterfaceC11918b
    /* renamed from: a */
    public InterfaceC11919c mo12945a() {
        return new C8174a();
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
        if (this.f16409i.computeScrollOffset()) {
            scrollTo(0, this.f16409i.getCurrY());
            invalidate();
        }
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f16403c.dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f16403c.dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f16403c.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f16403c.dispatchNestedScroll(i10, i11, i12, i13, iArr);
    }

    /* renamed from: e */
    public final boolean m12957e(int i10) {
        return i10 < 0 ? getScrollY() > 0 : !m12961i();
    }

    /* renamed from: f */
    public final void m12958f(int i10) {
        int scrollY = getScrollY();
        boolean z10 = (scrollY > 0 || i10 > 0) && (scrollY < getScrollRange() || i10 < 0);
        float f10 = i10;
        if (dispatchNestedPreFling(0.0f, f10)) {
            return;
        }
        dispatchNestedFling(0.0f, f10, z10);
        flingScroll(0, i10);
    }

    @Override // android.webkit.WebView
    public void flingScroll(int i10, int i11) {
        this.f16409i.fling(0, getScrollY(), 0, i11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        invalidate();
    }

    /* renamed from: g */
    public final void m12959g() {
        VelocityTracker velocityTracker = this.f16406f;
        if (velocityTracker == null) {
            this.f16406f = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public int getScrollRange() {
        return getWebViewContentHeight() - getHeight();
    }

    public int getWebViewContentHeight() {
        return (int) (getContentHeight() * this.f16405e);
    }

    /* renamed from: h */
    public final void m12960h() {
        if (this.f16406f == null) {
            this.f16406f = VelocityTracker.obtain();
        }
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.f16403c.hasNestedScrollingParent();
    }

    /* renamed from: i */
    public final boolean m12961i() {
        return getScrollY() >= getScrollRange();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.f16403c.isNestedScrollingEnabled();
    }

    /* renamed from: j */
    public final void m12962j() {
        VelocityTracker velocityTracker = this.f16406f;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f16406f = null;
        }
    }

    /* renamed from: k */
    public void m12963k() {
        super.scrollTo(0, getWebViewContentHeight() - getHeight());
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        InterfaceC11917a interfaceC11917a;
        InterfaceC11917a interfaceC11917a2;
        super.onScrollChanged(i10, i11, i12, i13);
        if ((!canScrollVertically(1) || m12961i()) && (interfaceC11917a = this.f16410j) != null) {
            interfaceC11917a.mo12943b(this);
        }
        if (!canScrollVertically(-1) && (interfaceC11917a2 = this.f16410j) != null) {
            interfaceC11917a2.mo12944c(this);
        }
        InterfaceC11917a interfaceC11917a3 = this.f16410j;
        if (interfaceC11917a3 != null) {
            interfaceC11917a3.mo12942a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            float r0 = r7.getRawX()
            float r1 = r7.getRawY()
            int r2 = r7.getAction()
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L74
            if (r2 == r4) goto L47
            r5 = 3
            if (r2 == r3) goto L19
            if (r2 == r5) goto L47
            goto L96
        L19:
            y8.e r2 = r6.f16404d
            r2.m26470f(r0, r1)
            r6.m12960h()
            android.view.VelocityTracker r0 = r6.f16406f
            r0.addMovement(r7)
            y8.e r0 = r6.f16404d
            boolean r0 = r0.m26466b()
            if (r0 == 0) goto L96
            y8.e r0 = r6.f16404d
            float r0 = r0.m26465a()
            float r0 = -r0
            int r0 = (int) r0
            int[] r1 = r6.f16411k
            r2 = 0
            r3 = 0
            boolean r1 = r6.dispatchNestedPreScroll(r3, r0, r1, r2)
            if (r1 != 0) goto L43
            r6.scrollBy(r3, r0)
        L43:
            r7.setAction(r5)
            goto L96
        L47:
            y8.e r2 = r6.f16404d
            r2.m26471g(r0, r1)
            android.view.VelocityTracker r0 = r6.f16406f
            r0.addMovement(r7)
            android.view.VelocityTracker r0 = r6.f16406f
            if (r0 == 0) goto L96
            int r1 = r6.f16407g
            float r1 = (float) r1
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r2, r1)
            android.view.VelocityTracker r0 = r6.f16406f
            float r0 = r0.getYVelocity()
            int r0 = (int) r0
            r6.m12962j()
            int r1 = java.lang.Math.abs(r0)
            int r2 = r6.f16408h
            if (r1 <= r2) goto L96
            int r0 = -r0
            r6.m12958f(r0)
            goto L96
        L74:
            y8.e r2 = r6.f16404d
            r2.m26469e(r0, r1)
            r6.startNestedScroll(r3)
            android.view.ViewParent r0 = r6.getParent()
            if (r0 == 0) goto L89
            android.view.ViewParent r0 = r6.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
        L89:
            r6.m12959g()
            android.view.VelocityTracker r0 = r6.f16406f
            r0.addMovement(r7)
            android.widget.Scroller r0 = r6.f16409i
            r0.abortAnimation()
        L96:
            super.onTouchEvent(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.layout.linkage.view.LinkageWebView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        super.scrollTo(i10, Math.min(Math.max(i11, 0), getScrollRange()));
    }

    @Override // p421y8.InterfaceC11918b
    public void setChildLinkageEvent(InterfaceC11917a interfaceC11917a) {
        this.f16410j = interfaceC11917a;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z10) {
        this.f16403c.setNestedScrollingEnabled(z10);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i10) {
        return this.f16403c.startNestedScroll(i10);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.f16403c.stopNestedScroll();
    }

    public LinkageWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public LinkageWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16411k = new int[2];
        this.f16409i = new Scroller(getContext());
        this.f16403c = new NestedScrollingChildHelper(this);
        this.f16404d = new C11921e();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f16404d.m26474j(viewConfiguration.getScaledTouchSlop());
        this.f16405e = context.getResources().getDisplayMetrics().density;
        this.f16407g = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f16408h = viewConfiguration.getScaledMinimumFlingVelocity();
        setNestedScrollingEnabled(true);
    }
}
