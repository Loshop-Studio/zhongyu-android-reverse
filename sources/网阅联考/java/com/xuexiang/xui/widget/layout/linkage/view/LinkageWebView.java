package com.xuexiang.xui.widget.layout.linkage.view;

import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.Scroller;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import p048d1.InterfaceC3700a;
import p048d1.InterfaceC3701b;
import p048d1.InterfaceC3702c;

/* loaded from: classes2.dex */
public class LinkageWebView extends WebView implements InterfaceC3701b, NestedScrollingChild {

    /* renamed from: a */
    public NestedScrollingChildHelper f3721a;

    /* renamed from: b */
    public final float f3722b;

    /* renamed from: c */
    public Scroller f3723c;

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.view.LinkageWebView$a */
    public class C3597a implements InterfaceC3702c {
        public C3597a() {
        }

        @Override // p048d1.InterfaceC3702c
        /* renamed from: a */
        public boolean mo4478a(int i4) {
            return LinkageWebView.this.m4488e(i4);
        }

        @Override // p048d1.InterfaceC3702c
        /* renamed from: b */
        public void mo4479b(View view, int i4) {
            LinkageWebView.this.flingScroll(0, i4);
        }

        @Override // p048d1.InterfaceC3702c
        /* renamed from: c */
        public int mo4480c() {
            return LinkageWebView.this.computeVerticalScrollOffset();
        }

        @Override // p048d1.InterfaceC3702c
        /* renamed from: d */
        public boolean mo4481d() {
            return true;
        }

        @Override // p048d1.InterfaceC3702c
        /* renamed from: e */
        public void mo4482e() {
            LinkageWebView.this.m4490g();
        }

        @Override // p048d1.InterfaceC3702c
        /* renamed from: f */
        public void mo4483f() {
            LinkageWebView.this.scrollTo(0, 0);
        }

        @Override // p048d1.InterfaceC3702c
        /* renamed from: g */
        public int mo4484g() {
            return LinkageWebView.this.computeVerticalScrollRange();
        }
    }

    @Override // p048d1.InterfaceC3701b
    /* renamed from: a */
    public InterfaceC3702c mo4477a() {
        return new C3597a();
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
        if (this.f3723c.computeScrollOffset()) {
            scrollTo(0, this.f3723c.getCurrY());
            invalidate();
        }
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f4, float f5, boolean z3) {
        return this.f3721a.dispatchNestedFling(f4, f5, z3);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f4, float f5) {
        return this.f3721a.dispatchNestedPreFling(f4, f5);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return this.f3721a.dispatchNestedPreScroll(i4, i5, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return this.f3721a.dispatchNestedScroll(i4, i5, i6, i7, iArr);
    }

    /* renamed from: e */
    public final boolean m4488e(int i4) {
        return i4 < 0 ? getScrollY() > 0 : !m4489f();
    }

    /* renamed from: f */
    public final boolean m4489f() {
        return getScrollY() >= getScrollRange();
    }

    @Override // android.webkit.WebView
    public void flingScroll(int i4, int i5) {
        this.f3723c.fling(0, getScrollY(), 0, i5, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        invalidate();
    }

    /* renamed from: g */
    public void m4490g() {
        super.scrollTo(0, getWebViewContentHeight() - getHeight());
    }

    public int getScrollRange() {
        return getWebViewContentHeight() - getHeight();
    }

    public int getWebViewContentHeight() {
        return (int) (getContentHeight() * this.f3722b);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.f3721a.hasNestedScrollingParent();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.f3721a.isNestedScrollingEnabled();
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
        if (canScrollVertically(1)) {
            m4489f();
        }
        canScrollVertically(-1);
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getRawX();
        motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action == 0 || action == 1 || action == 2 || action == 3) {
            throw null;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public void scrollTo(int i4, int i5) {
        super.scrollTo(i4, Math.min(Math.max(i5, 0), getScrollRange()));
    }

    @Override // p048d1.InterfaceC3701b
    public void setChildLinkageEvent(InterfaceC3700a interfaceC3700a) {
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z3) {
        this.f3721a.setNestedScrollingEnabled(z3);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i4) {
        return this.f3721a.startNestedScroll(i4);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.f3721a.stopNestedScroll();
    }
}
