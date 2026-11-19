package com.xuexiang.xui.widget.layout.linkage;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Scroller;
import androidx.core.view.C0352o;
import com.xuexiang.xui.logs.UILog;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class LinkageScrollLayout extends ViewGroup {
    public static final int FLING_ORIENTATION_DOWN = 18;
    public static final int FLING_ORIENTATION_NONE = 0;
    public static final int FLING_ORIENTATION_UP = 17;
    public static final int LOC_SCROLL_DURATION = 280;
    public static final String TAG = "ELinkageScrollLayout";
    private ChildLinkageEvent mChildLinkageEvent;
    private HashMap<View, ViewEdge> mEdgeList;
    private int mFlingOrientation;
    private boolean mIsIntercept;
    private int mLastY;
    private Scroller mLocScroller;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private C0352o mParentHelper;
    private PosIndicator mPosIndicator;
    private int mScrollRange;
    private Scroller mScroller;
    private Scroller mVelocityScroller;
    private VelocityTracker mVelocityTracker;

    private static class ViewEdge {
        public int bottomEdge;
        public int topEdge;

        public ViewEdge(int i4, int i5) {
            this.topEdge = i4;
            this.bottomEdge = i5;
        }
    }

    public LinkageScrollLayout(Context context) {
        this(context, null);
    }

    private void checkTargetsScroll() {
        View key;
        int scrollY = getScrollY();
        Iterator<Map.Entry<View, ViewEdge>> it = this.mEdgeList.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                key = null;
                break;
            }
            Map.Entry<View, ViewEdge> next = it.next();
            ViewEdge value = next.getValue();
            if (scrollY >= value.topEdge && scrollY < value.bottomEdge) {
                key = next.getKey();
                break;
            }
        }
        if (key == null) {
            return;
        }
        int iIndexOfChild = indexOfChild(key);
        UILog.dTag(TAG, "#checkTargetsScroll# index: " + iIndexOfChild);
        for (int i4 = 0; i4 < iIndexOfChild; i4++) {
            scrollTargetContentToBottom(getChildAt(i4));
        }
        while (true) {
            iIndexOfChild++;
            if (iIndexOfChild >= getChildCount()) {
                return;
            } else {
                scrollTargetContentToTop(getChildAt(iIndexOfChild));
            }
        }
    }

    private boolean dispatchTouchEventSupper(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public LinkageScrollHandler getLinkageScrollHandler(View view) {
        return ((ILinkageScroll) view).provideScrollHandler();
    }

    private int getNextEdge() {
        int scrollY = getScrollY();
        int i4 = this.mFlingOrientation;
        if (i4 == 17) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                LinkageScrollHandler linkageScrollHandler = getLinkageScrollHandler(childAt);
                ViewEdge viewEdge = this.mEdgeList.get(childAt);
                int i6 = viewEdge != null ? viewEdge.topEdge : 0;
                if (i6 > scrollY && isTargetScrollable(childAt) && linkageScrollHandler.canScrollVertically(1)) {
                    return i6;
                }
            }
        } else {
            if (i4 != 18) {
                throw new RuntimeException("#getNextEdge# unknown Fling Orientation");
            }
            for (int childCount2 = getChildCount() - 1; childCount2 >= 0; childCount2--) {
                View childAt2 = getChildAt(childCount2);
                LinkageScrollHandler linkageScrollHandler2 = getLinkageScrollHandler(childAt2);
                ViewEdge viewEdge2 = this.mEdgeList.get(childAt2);
                int i7 = viewEdge2 != null ? viewEdge2.topEdge : 0;
                if (i7 < scrollY && isTargetScrollable(childAt2) && linkageScrollHandler2.canScrollVertically(-1)) {
                    return i7;
                }
            }
        }
        if (this.mFlingOrientation == 17) {
            return this.mScrollRange;
        }
        return 0;
    }

    private View getTargetByEdge(int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            ViewEdge viewEdge = this.mEdgeList.get(childAt);
            if (viewEdge != null && viewEdge.topEdge == i4) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewEdge getTargetEdge(View view) {
        return this.mEdgeList.get(view);
    }

    private View getTouchTarget(float f4, float f5) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int[] iArr = new int[2];
            childAt.getLocationOnScreen(iArr);
            if (new RectF(iArr[0], iArr[1], childAt.getWidth() + r5, childAt.getHeight() + r4).contains(f4, f5)) {
                return childAt;
            }
        }
        return null;
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

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isFirstTarget(View view) {
        return view == getChildAt(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isLastTarget(View view) {
        return view == getChildAt(getChildCount() - 1);
    }

    private boolean isTargetScrollable(View view) {
        return getLinkageScrollHandler(view).isScrollable() && view.getHeight() >= getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void parentFling(float f4) {
        if (Math.abs(f4) > this.mMinimumVelocity) {
            this.mFlingOrientation = f4 > IGoodView.DEFAULT_TO_ALPHA ? 17 : 18;
            this.mScroller.fling(0, getScrollY(), 1, (int) f4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            invalidate();
        }
    }

    private void recycleVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private void resetScroll() {
        this.mFlingOrientation = 0;
        this.mVelocityScroller.abortAnimation();
        this.mScroller.abortAnimation();
        this.mLocScroller.abortAnimation();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void scrollTargetContentToBottom(View view) {
        LinkageScrollHandler linkageScrollHandlerProvideScrollHandler = ((ILinkageScroll) view).provideScrollHandler();
        if (linkageScrollHandlerProvideScrollHandler.isScrollable() && linkageScrollHandlerProvideScrollHandler.canScrollVertically(1)) {
            linkageScrollHandlerProvideScrollHandler.scrollContentToBottom();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void scrollTargetContentToTop(View view) {
        LinkageScrollHandler linkageScrollHandlerProvideScrollHandler = ((ILinkageScroll) view).provideScrollHandler();
        if (linkageScrollHandlerProvideScrollHandler.isScrollable() && linkageScrollHandlerProvideScrollHandler.canScrollVertically(-1)) {
            linkageScrollHandlerProvideScrollHandler.scrollContentToTop();
        }
    }

    private void scrollToIndex(int i4) {
        ViewEdge viewEdge = this.mEdgeList.get(getChildAt(Math.min(Math.max(i4, 0), getChildCount() - 1)));
        if (viewEdge != null) {
            scrollTo(0, viewEdge.topEdge, false);
        }
    }

    private void smoothScrollToIndex(int i4) {
        ViewEdge viewEdge = this.mEdgeList.get(getChildAt(Math.min(Math.max(i4, 0), getChildCount() - 1)));
        if (viewEdge != null) {
            this.mLocScroller.startScroll(0, getScrollY(), 0, viewEdge.topEdge - getScrollY(), LOC_SCROLL_DURATION);
            invalidate();
        }
    }

    private void trackVelocity(float f4) {
        this.mVelocityScroller.fling(0, 0, 0, (int) f4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        invalidate();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.mScroller.computeScrollOffset()) {
            scrollTo(0, this.mScroller.getCurrY(), true);
            invalidate();
        }
        if (this.mLocScroller.computeScrollOffset()) {
            scrollTo(0, this.mLocScroller.getCurrY(), false);
            invalidate();
            if (this.mLocScroller.isFinished()) {
                UILog.dTag(TAG, "#computeScroll#, LocScroll finished");
                checkTargetsScroll();
            }
        }
    }

    @Override // android.view.View
    protected int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    protected int computeVerticalScrollOffset() {
        int childCount = getChildCount();
        int verticalScrollOffset = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            verticalScrollOffset += ((ILinkageScroll) getChildAt(i4)).provideScrollHandler().getVerticalScrollOffset();
        }
        return verticalScrollOffset + getScrollY();
    }

    @Override // android.view.View
    protected int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int verticalScrollRange = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            verticalScrollRange += ((ILinkageScroll) getChildAt(i4)).provideScrollHandler().getVerticalScrollRange();
        }
        return verticalScrollRange;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            float r0 = r5.getX()
            float r1 = r5.getY()
            int r2 = r5.getAction()
            r2 = r2 & 255(0xff, float:3.57E-43)
            if (r2 == 0) goto L2e
            r3 = 1
            if (r2 == r3) goto L28
            r3 = 2
            if (r2 == r3) goto L1a
            r3 = 3
            if (r2 == r3) goto L28
            goto L3e
        L1a:
            com.xuexiang.xui.widget.layout.linkage.PosIndicator r2 = r4.mPosIndicator
            r2.onMove(r0, r1)
            r4.initVelocityTrackerIfNotExists()
            android.view.VelocityTracker r0 = r4.mVelocityTracker
            r0.addMovement(r5)
            goto L3e
        L28:
            com.xuexiang.xui.widget.layout.linkage.PosIndicator r2 = r4.mPosIndicator
            r2.onRelease(r0, r1)
            goto L3e
        L2e:
            com.xuexiang.xui.widget.layout.linkage.PosIndicator r2 = r4.mPosIndicator
            r2.onDown(r0, r1)
            r4.resetScroll()
            r4.initOrResetVelocityTracker()
            android.view.VelocityTracker r0 = r4.mVelocityTracker
            r0.addMovement(r5)
        L3e:
            boolean r5 = r4.dispatchTouchEventSupper(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.mParentHelper.m1968a();
    }

    public void gotoChild(int i4) {
        smoothScrollToIndex(i4);
        for (int i5 = 0; i5 < i4; i5++) {
            scrollTargetContentToBottom(getChildAt(i5));
        }
        while (i4 < getChildCount()) {
            scrollTargetContentToTop(getChildAt(i4));
            i4++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            childAt.setVerticalScrollBarEnabled(false);
            childAt.setHorizontalScrollBarEnabled(false);
            if (!(childAt instanceof ILinkageScroll)) {
                throw new RuntimeException("Child in LinkageScrollLayout must implement ILinkageScroll");
            }
            ((ILinkageScroll) childAt).setChildLinkageEvent(this.mChildLinkageEvent);
            childAt.setOverScrollMode(2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            if (r0 == 0) goto L46
            r2 = 1
            if (r0 == r2) goto L43
            r3 = 2
            if (r0 == r3) goto L13
            r5 = 3
            if (r0 == r5) goto L43
            goto L4b
        L13:
            float r0 = r5.getRawX()
            int r0 = (int) r0
            float r0 = (float) r0
            float r5 = r5.getRawY()
            int r5 = (int) r5
            float r5 = (float) r5
            android.view.View r5 = r4.getTouchTarget(r0, r5)
            com.xuexiang.xui.widget.layout.linkage.PosIndicator r0 = r4.mPosIndicator
            boolean r0 = r0.isDragging()
            if (r0 == 0) goto L4b
            if (r5 == 0) goto L4b
            com.xuexiang.xui.widget.layout.linkage.LinkageScrollHandler r5 = r4.getLinkageScrollHandler(r5)
            boolean r5 = r5.isScrollable()
            if (r5 != 0) goto L4b
            r4.mIsIntercept = r2
            android.view.ViewParent r5 = r4.getParent()
            if (r5 == 0) goto L4b
            r5.requestDisallowInterceptTouchEvent(r2)
            goto L4b
        L43:
            r4.mIsIntercept = r1
            goto L4b
        L46:
            r4.mIsIntercept = r1
            r4.checkTargetsScroll()
        L4b:
            boolean r5 = r4.mIsIntercept
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int i8 = 0;
        this.mScrollRange = 0;
        int childCount = getChildCount();
        while (i8 < childCount) {
            View childAt = getChildAt(i8);
            int measuredHeight = childAt.getMeasuredHeight() + i5;
            childAt.layout(i4, i5, i6, measuredHeight);
            this.mScrollRange += childAt.getHeight();
            this.mEdgeList.put(childAt, new ViewEdge(childAt.getTop(), childAt.getBottom()));
            i8++;
            i5 = measuredHeight;
        }
        this.mScrollRange -= getMeasuredHeight();
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            measureChild(getChildAt(i6), i4, i5);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f4, float f5, boolean z3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f4, float f5) {
        UILog.dTag(TAG, "#onNestedPreFling# velocityY: " + f5);
        int scrollY = getScrollY();
        ViewEdge targetEdge = getTargetEdge(view);
        this.mFlingOrientation = f5 > IGoodView.DEFAULT_TO_ALPHA ? 17 : 18;
        if (scrollY == targetEdge.topEdge) {
            trackVelocity(f5);
            return false;
        }
        parentFling(f5);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        UILog.dTag(TAG, "#onNestedPreScroll# dy: " + i5);
        boolean z3 = i5 > 0;
        boolean z4 = !z3;
        int scrollY = getScrollY();
        ViewEdge targetEdge = getTargetEdge(view);
        LinkageScrollHandler linkageScrollHandlerProvideScrollHandler = ((ILinkageScroll) view).provideScrollHandler();
        int i6 = targetEdge.topEdge;
        if (scrollY == i6) {
            if ((z4 && !linkageScrollHandlerProvideScrollHandler.canScrollVertically(-1)) || (z3 && !linkageScrollHandlerProvideScrollHandler.canScrollVertically(1))) {
                scrollBy(0, i5);
                iArr[1] = i5;
                return;
            } else {
                UILog.dTag(TAG, "#onNestedPreScroll#, handle scroll by " + view);
                return;
            }
        }
        if (scrollY > i6) {
            if (z3) {
                scrollBy(0, i5);
                iArr[1] = i5;
            }
            if (z4) {
                int i7 = scrollY + i5;
                int i8 = targetEdge.topEdge;
                if (i7 <= i8) {
                    i5 = i8 - scrollY;
                }
                scrollBy(0, i5);
                iArr[1] = i5;
                return;
            }
            return;
        }
        if (z4) {
            scrollBy(0, i5);
            iArr[1] = i5;
        }
        if (z3) {
            int i9 = scrollY + i5;
            int i10 = targetEdge.topEdge;
            if (i9 >= i10) {
                i5 = i10 - scrollY;
            }
            scrollBy(0, i5);
            iArr[1] = i5;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        if (i5 == 0 || i7 == 0) {
            return;
        }
        scrollBy(0, i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i4) {
        UILog.dTag(TAG, "#onNestedScrollAccepted# axes: " + i4);
        this.mParentHelper.m1969b(view, view2, i4);
        resetScroll();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i4) {
        UILog.dTag(TAG, "#onStartNestedScroll# nestedScrollAxes: " + i4);
        return (i4 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        UILog.dTag(TAG, "#onStopNestedScroll# child: " + view);
        this.mParentHelper.m1971d(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getAction()
            r1 = 1
            if (r0 == 0) goto L61
            r2 = 0
            if (r0 == r1) goto L2d
            r3 = 2
            if (r0 == r3) goto L11
            r5 = 3
            if (r0 == r5) goto L2d
            goto L68
        L11:
            int r0 = r4.mLastY
            if (r0 != 0) goto L1d
            float r5 = r5.getY()
            int r5 = (int) r5
            r4.mLastY = r5
            return r1
        L1d:
            float r5 = r5.getY()
            int r5 = (int) r5
            int r0 = r4.mLastY
            int r0 = r5 - r0
            r4.mLastY = r5
            int r5 = -r0
            r4.scrollBy(r2, r5)
            goto L68
        L2d:
            r4.mLastY = r2
            android.view.VelocityTracker r5 = r4.mVelocityTracker
            if (r5 == 0) goto L68
            r0 = 1000(0x3e8, float:1.401E-42)
            int r2 = r4.mMaximumVelocity
            float r2 = (float) r2
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r4.mVelocityTracker
            float r5 = r5.getYVelocity()
            int r5 = (int) r5
            r4.recycleVelocityTracker()
            int r0 = -r5
            float r0 = (float) r0
            r4.parentFling(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "#dispatchTouchEvent# ACTION_UP, yVelocity: "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "ELinkageScrollLayout"
            com.xuexiang.xui.logs.UILog.dTag(r0, r5)
            goto L68
        L61:
            float r5 = r5.getY()
            int r5 = (int) r5
            r4.mLastY = r5
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void scrollBy(int i4, int i5) {
        awakenScrollBars();
        int scrollY = getScrollY();
        if (i5 >= 0) {
            int i6 = scrollY + i5;
            int i7 = this.mScrollRange;
            if (i6 > i7) {
                i5 = i7 - scrollY;
            }
        } else if (scrollY + i5 < 0) {
            i5 = -scrollY;
        }
        if (i5 != 0) {
            super.scrollBy(i4, i5);
        }
    }

    public void scrollTo(int i4, int i5, boolean z3) {
        awakenScrollBars();
        if (!z3) {
            scrollTo(i4, Math.min(Math.max(i5, 0), this.mScrollRange));
            return;
        }
        int iMin = Math.min(Math.max(i5, 0), this.mScrollRange);
        int nextEdge = getNextEdge();
        if (this.mFlingOrientation == 17) {
            iMin = Math.min(iMin, nextEdge);
        }
        if (this.mFlingOrientation == 18) {
            iMin = Math.max(iMin, nextEdge);
        }
        scrollTo(i4, iMin);
        if (getScrollY() == nextEdge) {
            int currVelocity = (int) this.mScroller.getCurrVelocity();
            int i6 = this.mFlingOrientation;
            if (i6 == 17 && currVelocity <= 0) {
                currVelocity = -currVelocity;
            }
            if (i6 == 18 && currVelocity >= 0) {
                currVelocity = -currVelocity;
            }
            UILog.dTag(TAG, "#scrollTo# To Edge: " + nextEdge + ", velocity: " + currVelocity);
            this.mScroller.abortAnimation();
            View targetByEdge = getTargetByEdge(nextEdge);
            getLinkageScrollHandler(targetByEdge).flingContent(targetByEdge, currVelocity);
            trackVelocity((float) currVelocity);
        }
    }

    public LinkageScrollLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public LinkageScrollLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mEdgeList = new HashMap<>();
        this.mFlingOrientation = 0;
        this.mChildLinkageEvent = new ChildLinkageEvent() { // from class: com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout.1
            @Override // com.xuexiang.xui.widget.layout.linkage.ChildLinkageEvent
            public void onContentScroll(View view) {
                LinkageScrollLayout.this.awakenScrollBars();
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.ChildLinkageEvent
            public void onContentScrollToBottom(View view) {
                ViewEdge targetEdge;
                UILog.dTag(LinkageScrollLayout.TAG, "#onContentScrollToBottom#");
                if (LinkageScrollLayout.this.mFlingOrientation != 17) {
                    UILog.dTag(LinkageScrollLayout.TAG, "onContentScrollToBottom, Invalid Fling Orientation");
                    return;
                }
                if (!LinkageScrollLayout.this.isLastTarget(view) && LinkageScrollLayout.this.getLinkageScrollHandler(view).isScrollable() && (targetEdge = LinkageScrollLayout.this.getTargetEdge(view)) != null && LinkageScrollLayout.this.getScrollY() == targetEdge.topEdge && LinkageScrollLayout.this.mVelocityScroller.computeScrollOffset()) {
                    float currVelocity = LinkageScrollLayout.this.mVelocityScroller.getCurrVelocity();
                    if (currVelocity <= IGoodView.DEFAULT_TO_ALPHA) {
                        currVelocity = -currVelocity;
                    }
                    UILog.dTag(LinkageScrollLayout.TAG, "onContentScrollToBottom, currVelocity: " + currVelocity);
                    LinkageScrollLayout.this.mVelocityScroller.abortAnimation();
                    LinkageScrollLayout.this.parentFling(currVelocity);
                }
            }

            @Override // com.xuexiang.xui.widget.layout.linkage.ChildLinkageEvent
            public void onContentScrollToTop(View view) {
                ViewEdge targetEdge;
                UILog.dTag(LinkageScrollLayout.TAG, "#onContentScrollToTop#");
                if (LinkageScrollLayout.this.mFlingOrientation != 18) {
                    UILog.dTag(LinkageScrollLayout.TAG, "onContentScrollToTop, Invalid Fling Orientation");
                    return;
                }
                if (!LinkageScrollLayout.this.isFirstTarget(view) && LinkageScrollLayout.this.getLinkageScrollHandler(view).isScrollable() && (targetEdge = LinkageScrollLayout.this.getTargetEdge(view)) != null && LinkageScrollLayout.this.getScrollY() == targetEdge.topEdge && LinkageScrollLayout.this.mVelocityScroller.computeScrollOffset()) {
                    float currVelocity = LinkageScrollLayout.this.mVelocityScroller.getCurrVelocity();
                    if (currVelocity >= IGoodView.DEFAULT_TO_ALPHA) {
                        currVelocity = -currVelocity;
                    }
                    UILog.dTag(LinkageScrollLayout.TAG, "onContentScrollToTop, currVelocity: " + currVelocity);
                    LinkageScrollLayout.this.mVelocityScroller.abortAnimation();
                    LinkageScrollLayout.this.parentFling(currVelocity);
                }
            }
        };
        this.mParentHelper = new C0352o(this);
        this.mScroller = new Scroller(getContext());
        this.mLocScroller = new Scroller(getContext());
        this.mVelocityScroller = new Scroller(getContext());
        this.mPosIndicator = new PosIndicator();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mMinimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mPosIndicator.setTouchSlop(viewConfiguration.getScaledTouchSlop());
        setWillNotDraw(false);
        setVerticalScrollBarEnabled(true);
    }
}
