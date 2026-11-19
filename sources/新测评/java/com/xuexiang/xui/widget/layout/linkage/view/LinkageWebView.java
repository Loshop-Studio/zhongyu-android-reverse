package com.xuexiang.xui.widget.layout.linkage.view;

import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.Scroller;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import p165m3.InterfaceC8545a;
import p165m3.InterfaceC8546b;
import p165m3.InterfaceC8547c;

/* loaded from: classes4.dex */
public class LinkageWebView extends WebView implements InterfaceC8546b, NestedScrollingChild {

    /* renamed from: a */
    public NestedScrollingChildHelper f6517a;

    /* renamed from: b */
    public final float f6518b;

    /* renamed from: c */
    public Scroller f6519c;

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.view.LinkageWebView$a */
    public class C6557a implements InterfaceC8547c {
        public C6557a() {
        }

        @Override // p165m3.InterfaceC8547c
        /* renamed from: a */
        public boolean mo5837a(int i10) {
            return LinkageWebView.this.m5847e(i10);
        }

        @Override // p165m3.InterfaceC8547c
        /* renamed from: b */
        public int mo5838b() {
            return LinkageWebView.this.computeVerticalScrollOffset();
        }

        @Override // p165m3.InterfaceC8547c
        /* renamed from: c */
        public void mo5839c() {
            LinkageWebView.this.m5849g();
        }

        @Override // p165m3.InterfaceC8547c
        /* renamed from: d */
        public int mo5840d() {
            return LinkageWebView.this.computeVerticalScrollRange();
        }

        @Override // p165m3.InterfaceC8547c
        /* renamed from: e */
        public void mo5841e(View view, int i10) {
            LinkageWebView.this.flingScroll(0, i10);
        }

        @Override // p165m3.InterfaceC8547c
        /* renamed from: f */
        public boolean mo5842f() {
            return true;
        }

        @Override // p165m3.InterfaceC8547c
        /* renamed from: g */
        public void mo5843g() {
            LinkageWebView.this.scrollTo(0, 0);
        }
    }

    @Override // p165m3.InterfaceC8546b
    /* renamed from: a */
    public InterfaceC8547c mo5836a() {
        return new C6557a();
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
        if (this.f6519c.computeScrollOffset()) {
            scrollTo(0, this.f6519c.getCurrY());
            invalidate();
        }
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f10, float f11, boolean z9) {
        return this.f6517a.dispatchNestedFling(f10, f11, z9);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f6517a.dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f6517a.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f6517a.dispatchNestedScroll(i10, i11, i12, i13, iArr);
    }

    /* renamed from: e */
    public final boolean m5847e(int i10) {
        return i10 < 0 ? getScrollY() > 0 : !m5848f();
    }

    /* renamed from: f */
    public final boolean m5848f() {
        return getScrollY() >= getScrollRange();
    }

    @Override // android.webkit.WebView
    public void flingScroll(int i10, int i11) {
        this.f6519c.fling(0, getScrollY(), 0, i11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        invalidate();
    }

    /* renamed from: g */
    public void m5849g() {
        super.scrollTo(0, getWebViewContentHeight() - getHeight());
    }

    public int getScrollRange() {
        return getWebViewContentHeight() - getHeight();
    }

    public int getWebViewContentHeight() {
        return (int) (getContentHeight() * this.f6518b);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.f6517a.hasNestedScrollingParent();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.f6517a.isNestedScrollingEnabled();
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        if (canScrollVertically(1)) {
            m5848f();
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
    public void setNestedScrollingEnabled(boolean z9) {
        this.f6517a.setNestedScrollingEnabled(z9);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i10) {
        return this.f6517a.startNestedScroll(i10);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.f6517a.stopNestedScroll();
    }

    @Override // p165m3.InterfaceC8546b
    public void setChildLinkageEvent(InterfaceC8545a interfaceC8545a) {
    }
}
