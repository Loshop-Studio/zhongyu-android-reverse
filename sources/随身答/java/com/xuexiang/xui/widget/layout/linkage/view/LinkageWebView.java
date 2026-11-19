package com.xuexiang.xui.widget.layout.linkage.view;

import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.Scroller;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import p033c4.InterfaceC5225a;
import p033c4.InterfaceC5226b;
import p033c4.InterfaceC5227c;

/* loaded from: classes4.dex */
public class LinkageWebView extends WebView implements InterfaceC5226b, NestedScrollingChild {

    /* renamed from: a */
    public NestedScrollingChildHelper f7775a;

    /* renamed from: b */
    public final float f7776b;

    /* renamed from: c */
    public Scroller f7777c;

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.view.LinkageWebView$a */
    public class C6877a implements InterfaceC5227c {
        public C6877a() {
        }

        @Override // p033c4.InterfaceC5227c
        /* renamed from: a */
        public boolean mo2338a(int i9) {
            return LinkageWebView.this.m6945e(i9);
        }

        @Override // p033c4.InterfaceC5227c
        /* renamed from: b */
        public int mo2339b() {
            return LinkageWebView.this.computeVerticalScrollOffset();
        }

        @Override // p033c4.InterfaceC5227c
        /* renamed from: c */
        public void mo2340c() {
            LinkageWebView.this.m6947g();
        }

        @Override // p033c4.InterfaceC5227c
        /* renamed from: d */
        public int mo2341d() {
            return LinkageWebView.this.computeVerticalScrollRange();
        }

        @Override // p033c4.InterfaceC5227c
        /* renamed from: e */
        public void mo2342e(View view, int i9) {
            LinkageWebView.this.flingScroll(0, i9);
        }

        @Override // p033c4.InterfaceC5227c
        /* renamed from: f */
        public boolean mo2343f() {
            return true;
        }

        @Override // p033c4.InterfaceC5227c
        /* renamed from: g */
        public void mo2344g() {
            LinkageWebView.this.scrollTo(0, 0);
        }
    }

    @Override // p033c4.InterfaceC5226b
    /* renamed from: a */
    public InterfaceC5227c mo2337a() {
        return new C6877a();
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
        if (this.f7777c.computeScrollOffset()) {
            scrollTo(0, this.f7777c.getCurrY());
            invalidate();
        }
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f10, float f11, boolean z9) {
        return this.f7775a.dispatchNestedFling(f10, f11, z9);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f7775a.dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i9, int i10, int[] iArr, int[] iArr2) {
        return this.f7775a.dispatchNestedPreScroll(i9, i10, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i9, int i10, int i11, int i12, int[] iArr) {
        return this.f7775a.dispatchNestedScroll(i9, i10, i11, i12, iArr);
    }

    /* renamed from: e */
    public final boolean m6945e(int i9) {
        return i9 < 0 ? getScrollY() > 0 : !m6946f();
    }

    /* renamed from: f */
    public final boolean m6946f() {
        return getScrollY() >= getScrollRange();
    }

    @Override // android.webkit.WebView
    public void flingScroll(int i9, int i10) {
        this.f7777c.fling(0, getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        invalidate();
    }

    /* renamed from: g */
    public void m6947g() {
        super.scrollTo(0, getWebViewContentHeight() - getHeight());
    }

    public int getScrollRange() {
        return getWebViewContentHeight() - getHeight();
    }

    public int getWebViewContentHeight() {
        return (int) (getContentHeight() * this.f7776b);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.f7775a.hasNestedScrollingParent();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.f7775a.isNestedScrollingEnabled();
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i9, int i10, int i11, int i12) {
        super.onScrollChanged(i9, i10, i11, i12);
        if (canScrollVertically(1)) {
            m6946f();
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
    public void scrollTo(int i9, int i10) {
        super.scrollTo(i9, Math.min(Math.max(i10, 0), getScrollRange()));
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z9) {
        this.f7775a.setNestedScrollingEnabled(z9);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i9) {
        return this.f7775a.startNestedScroll(i9);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.f7775a.stopNestedScroll();
    }

    @Override // p033c4.InterfaceC5226b
    public void setChildLinkageEvent(InterfaceC5225a interfaceC5225a) {
    }
}
