package com.xuexiang.xui.widget.layout.linkage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.Scroller;
import androidx.core.view.C0349l;
import androidx.core.view.InterfaceC0348k;
import com.xuexiang.xui.widget.layout.linkage.ChildLinkageEvent;
import com.xuexiang.xui.widget.layout.linkage.ILinkageScroll;
import com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler;
import com.xuexiang.xui.widget.layout.linkage.PosIndicator;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class LinkageWebView extends WebView implements ILinkageScroll, InterfaceC0348k {
    private final float DENSITY;
    private C0349l mChildHelper;
    private ChildLinkageEvent mLinkageEvent;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private PosIndicator mPosIndicator;
    private final int[] mScrollConsumed;
    private Scroller mScroller;
    private VelocityTracker mVelocityTracker;

    public LinkageWebView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canScrollVertical(int i4) {
        return i4 < 0 ? getScrollY() > 0 : !isScrollToBottom();
    }

    private void flingWithNestedDispatch(int i4) {
        int scrollY = getScrollY();
        boolean z3 = (scrollY > 0 || i4 > 0) && (scrollY < getScrollRange() || i4 < 0);
        float f4 = i4;
        if (dispatchNestedPreFling(IGoodView.DEFAULT_TO_ALPHA, f4)) {
            return;
        }
        dispatchNestedFling(IGoodView.DEFAULT_TO_ALPHA, f4, z3);
        flingScroll(0, i4);
    }

    private void initOrResetVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void initVelocityTrackerIfNotExists() {
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
    }

    private boolean isScrollToBottom() {
        return getScrollY() >= getScrollRange();
    }

    private void recycleVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
        if (this.mScroller.computeScrollOffset()) {
            scrollTo(0, this.mScroller.getCurrY());
            invalidate();
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f4, float f5, boolean z3) {
        return this.mChildHelper.m1953a(f4, f5, z3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f4, float f5) {
        return this.mChildHelper.m1954b(f4, f5);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return this.mChildHelper.m1955c(i4, i5, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return this.mChildHelper.m1958f(i4, i5, i6, i7, iArr);
    }

    @Override // android.webkit.WebView
    public void flingScroll(int i4, int i5) {
        this.mScroller.fling(0, getScrollY(), 0, i5, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        invalidate();
    }

    public int getScrollRange() {
        return getWebViewContentHeight() - getHeight();
    }

    public int getWebViewContentHeight() {
        return (int) (getContentHeight() * this.DENSITY);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.mChildHelper.m1960k();
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.mChildHelper.m1962m();
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i4, int i5, int i6, int i7) {
        ChildLinkageEvent childLinkageEvent;
        ChildLinkageEvent childLinkageEvent2;
        super.onScrollChanged(i4, i5, i6, i7);
        if ((!canScrollVertically(1) || isScrollToBottom()) && (childLinkageEvent = this.mLinkageEvent) != null) {
            childLinkageEvent.onContentScrollToBottom(this);
        }
        if (!canScrollVertically(-1) && (childLinkageEvent2 = this.mLinkageEvent) != null) {
            childLinkageEvent2.onContentScrollToTop(this);
        }
        ChildLinkageEvent childLinkageEvent3 = this.mLinkageEvent;
        if (childLinkageEvent3 != null) {
            childLinkageEvent3.onContentScroll(this);
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
            com.xuexiang.xui.widget.layout.linkage.PosIndicator r2 = r6.mPosIndicator
            r2.onMove(r0, r1)
            r6.initVelocityTrackerIfNotExists()
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r7)
            com.xuexiang.xui.widget.layout.linkage.PosIndicator r0 = r6.mPosIndicator
            boolean r0 = r0.isDragging()
            if (r0 == 0) goto L96
            com.xuexiang.xui.widget.layout.linkage.PosIndicator r0 = r6.mPosIndicator
            float r0 = r0.getOffsetY()
            float r0 = -r0
            int r0 = (int) r0
            int[] r1 = r6.mScrollConsumed
            r2 = 0
            r3 = 0
            boolean r1 = r6.dispatchNestedPreScroll(r3, r0, r1, r2)
            if (r1 != 0) goto L43
            r6.scrollBy(r3, r0)
        L43:
            r7.setAction(r5)
            goto L96
        L47:
            com.xuexiang.xui.widget.layout.linkage.PosIndicator r2 = r6.mPosIndicator
            r2.onRelease(r0, r1)
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r7)
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            if (r0 == 0) goto L96
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.mMaximumVelocity
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            float r0 = r0.getYVelocity()
            int r0 = (int) r0
            r6.recycleVelocityTracker()
            int r1 = java.lang.Math.abs(r0)
            int r2 = r6.mMinimumVelocity
            if (r1 <= r2) goto L96
            int r0 = -r0
            r6.flingWithNestedDispatch(r0)
            goto L96
        L74:
            com.xuexiang.xui.widget.layout.linkage.PosIndicator r2 = r6.mPosIndicator
            r2.onDown(r0, r1)
            r6.startNestedScroll(r3)
            android.view.ViewParent r0 = r6.getParent()
            if (r0 == 0) goto L89
            android.view.ViewParent r0 = r6.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
        L89:
            r6.initOrResetVelocityTracker()
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r7)
            android.widget.Scroller r0 = r6.mScroller
            r0.abortAnimation()
        L96:
            super.onTouchEvent(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.layout.linkage.view.LinkageWebView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // com.xuexiang.xui.widget.layout.linkage.ILinkageScroll
    public LinkageScrollHandler provideScrollHandler() {
        return new LinkageScrollHandler() { // from class: com.xuexiang.xui.widget.layout.linkage.view.LinkageWebView.1
            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public boolean canScrollVertically(int i4) {
                return LinkageWebView.this.canScrollVertical(i4);
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public void flingContent(View view, int i4) {
                LinkageWebView.this.flingScroll(0, i4);
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public int getVerticalScrollExtent() {
                return LinkageWebView.this.computeVerticalScrollExtent();
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public int getVerticalScrollOffset() {
                return LinkageWebView.this.computeVerticalScrollOffset();
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public int getVerticalScrollRange() {
                return LinkageWebView.this.computeVerticalScrollRange();
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public boolean isScrollable() {
                return true;
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public void scrollContentToBottom() {
                LinkageWebView.this.scrollToBottom();
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public void scrollContentToTop() {
                LinkageWebView.this.scrollTo(0, 0);
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler
            public void stopContentScroll(View view) {
                LinkageWebView.this.flingScroll(0, 0);
            }
        };
    }

    @Override // android.view.View
    public void scrollTo(int i4, int i5) {
        super.scrollTo(i4, Math.min(Math.max(i5, 0), getScrollRange()));
    }

    public void scrollToBottom() {
        super.scrollTo(0, getWebViewContentHeight() - getHeight());
    }

    @Override // com.xuexiang.xui.widget.layout.linkage.ILinkageScroll
    public void setChildLinkageEvent(ChildLinkageEvent childLinkageEvent) {
        this.mLinkageEvent = childLinkageEvent;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        this.mChildHelper.m1963n(z3);
    }

    public void smoothScrollToBottom() {
        this.mScroller.startScroll(0, getScrollY(), 0, getScrollRange() - getScrollY(), 200);
        invalidate();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i4) {
        return this.mChildHelper.m1964p(i4);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.mChildHelper.m1966r();
    }

    public LinkageWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public LinkageWebView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mScrollConsumed = new int[2];
        this.mScroller = new Scroller(getContext());
        this.mChildHelper = new C0349l(this);
        this.mPosIndicator = new PosIndicator();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mPosIndicator.setTouchSlop(viewConfiguration.getScaledTouchSlop());
        this.DENSITY = context.getResources().getDisplayMetrics().density;
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mMinimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        setNestedScrollingEnabled(true);
    }
}
