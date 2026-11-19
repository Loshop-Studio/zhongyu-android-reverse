package com.xuexiang.xui.widget.layout.linkage.view;

import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.Scroller;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import p113n2.InterfaceC7456a;
import p113n2.InterfaceC7457b;
import p113n2.InterfaceC7458c;

/* loaded from: classes3.dex */
public class LinkageWebView extends WebView implements InterfaceC7457b, NestedScrollingChild {

    /* renamed from: a */
    public NestedScrollingChildHelper f5242a;

    /* renamed from: b */
    public final float f5243b;

    /* renamed from: c */
    public Scroller f5244c;

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.view.LinkageWebView$a */
    public class C5936a implements InterfaceC7458c {
        public C5936a() {
        }

        @Override // p113n2.InterfaceC7458c
        /* renamed from: a */
        public boolean mo4856a(int i6) {
            return LinkageWebView.this.m4866e(i6);
        }

        @Override // p113n2.InterfaceC7458c
        /* renamed from: b */
        public int mo4857b() {
            return LinkageWebView.this.computeVerticalScrollOffset();
        }

        @Override // p113n2.InterfaceC7458c
        /* renamed from: c */
        public void mo4858c() {
            LinkageWebView.this.m4868g();
        }

        @Override // p113n2.InterfaceC7458c
        /* renamed from: d */
        public int mo4859d() {
            return LinkageWebView.this.computeVerticalScrollRange();
        }

        @Override // p113n2.InterfaceC7458c
        /* renamed from: e */
        public void mo4860e(View view, int i6) {
            LinkageWebView.this.flingScroll(0, i6);
        }

        @Override // p113n2.InterfaceC7458c
        /* renamed from: f */
        public boolean mo4861f() {
            return true;
        }

        @Override // p113n2.InterfaceC7458c
        /* renamed from: g */
        public void mo4862g() {
            LinkageWebView.this.scrollTo(0, 0);
        }
    }

    @Override // p113n2.InterfaceC7457b
    /* renamed from: a */
    public InterfaceC7458c mo4855a() {
        return new C5936a();
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
        if (this.f5244c.computeScrollOffset()) {
            scrollTo(0, this.f5244c.getCurrY());
            invalidate();
        }
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f6, float f7, boolean z6) {
        return this.f5242a.dispatchNestedFling(f6, f7, z6);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f6, float f7) {
        return this.f5242a.dispatchNestedPreFling(f6, f7);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i6, int i7, int[] iArr, int[] iArr2) {
        return this.f5242a.dispatchNestedPreScroll(i6, i7, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i6, int i7, int i8, int i9, int[] iArr) {
        return this.f5242a.dispatchNestedScroll(i6, i7, i8, i9, iArr);
    }

    /* renamed from: e */
    public final boolean m4866e(int i6) {
        return i6 < 0 ? getScrollY() > 0 : !m4867f();
    }

    /* renamed from: f */
    public final boolean m4867f() {
        return getScrollY() >= getScrollRange();
    }

    @Override // android.webkit.WebView
    public void flingScroll(int i6, int i7) {
        this.f5244c.fling(0, getScrollY(), 0, i7, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        invalidate();
    }

    /* renamed from: g */
    public void m4868g() {
        super.scrollTo(0, getWebViewContentHeight() - getHeight());
    }

    public int getScrollRange() {
        return getWebViewContentHeight() - getHeight();
    }

    public int getWebViewContentHeight() {
        return (int) (getContentHeight() * this.f5243b);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.f5242a.hasNestedScrollingParent();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.f5242a.isNestedScrollingEnabled();
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i6, int i7, int i8, int i9) {
        super.onScrollChanged(i6, i7, i8, i9);
        if (canScrollVertically(1)) {
            m4867f();
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
    public void scrollTo(int i6, int i7) {
        super.scrollTo(i6, Math.min(Math.max(i7, 0), getScrollRange()));
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z6) {
        this.f5242a.setNestedScrollingEnabled(z6);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i6) {
        return this.f5242a.startNestedScroll(i6);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.f5242a.stopNestedScroll();
    }

    @Override // p113n2.InterfaceC7457b
    public void setChildLinkageEvent(InterfaceC7456a interfaceC7456a) {
    }
}
