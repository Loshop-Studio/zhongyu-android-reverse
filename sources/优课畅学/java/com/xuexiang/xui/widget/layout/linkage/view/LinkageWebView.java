package com.xuexiang.xui.widget.layout.linkage.view;

import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.Scroller;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import p163l2.InterfaceC9243a;
import p163l2.InterfaceC9244b;
import p163l2.InterfaceC9245c;

/* loaded from: classes4.dex */
public class LinkageWebView extends WebView implements InterfaceC9244b, NestedScrollingChild {

    /* renamed from: a */
    public NestedScrollingChildHelper f7934a;

    /* renamed from: b */
    public final float f7935b;

    /* renamed from: c */
    public Scroller f7936c;

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.view.LinkageWebView$a */
    public class C6963a implements InterfaceC9245c {
        public C6963a() {
        }

        @Override // p163l2.InterfaceC9245c
        /* renamed from: a */
        public boolean mo7031a(int i10) {
            return LinkageWebView.this.m7041e(i10);
        }

        @Override // p163l2.InterfaceC9245c
        /* renamed from: b */
        public int mo7032b() {
            return LinkageWebView.this.computeVerticalScrollOffset();
        }

        @Override // p163l2.InterfaceC9245c
        /* renamed from: c */
        public void mo7033c() {
            LinkageWebView.this.m7043g();
        }

        @Override // p163l2.InterfaceC9245c
        /* renamed from: d */
        public int mo7034d() {
            return LinkageWebView.this.computeVerticalScrollRange();
        }

        @Override // p163l2.InterfaceC9245c
        /* renamed from: e */
        public void mo7035e(View view, int i10) {
            LinkageWebView.this.flingScroll(0, i10);
        }

        @Override // p163l2.InterfaceC9245c
        /* renamed from: f */
        public boolean mo7036f() {
            return true;
        }

        @Override // p163l2.InterfaceC9245c
        /* renamed from: g */
        public void mo7037g() {
            LinkageWebView.this.scrollTo(0, 0);
        }
    }

    @Override // p163l2.InterfaceC9244b
    /* renamed from: a */
    public InterfaceC9245c mo7030a() {
        return new C6963a();
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
        if (this.f7936c.computeScrollOffset()) {
            scrollTo(0, this.f7936c.getCurrY());
            invalidate();
        }
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f7934a.dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f7934a.dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f7934a.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f7934a.dispatchNestedScroll(i10, i11, i12, i13, iArr);
    }

    /* renamed from: e */
    public final boolean m7041e(int i10) {
        return i10 < 0 ? getScrollY() > 0 : !m7042f();
    }

    /* renamed from: f */
    public final boolean m7042f() {
        return getScrollY() >= getScrollRange();
    }

    @Override // android.webkit.WebView
    public void flingScroll(int i10, int i11) {
        this.f7936c.fling(0, getScrollY(), 0, i11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        invalidate();
    }

    /* renamed from: g */
    public void m7043g() {
        super.scrollTo(0, getWebViewContentHeight() - getHeight());
    }

    public int getScrollRange() {
        return getWebViewContentHeight() - getHeight();
    }

    public int getWebViewContentHeight() {
        return (int) (getContentHeight() * this.f7935b);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.f7934a.hasNestedScrollingParent();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.f7934a.isNestedScrollingEnabled();
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        if (canScrollVertically(1)) {
            m7042f();
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
    public void scrollTo(int i10, int i11) {
        super.scrollTo(i10, Math.min(Math.max(i11, 0), getScrollRange()));
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z10) {
        this.f7934a.setNestedScrollingEnabled(z10);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i10) {
        return this.f7934a.startNestedScroll(i10);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.f7934a.stopNestedScroll();
    }

    @Override // p163l2.InterfaceC9244b
    public void setChildLinkageEvent(InterfaceC9243a interfaceC9243a) {
    }
}
