package com.xuexiang.xui.widget.layout.linkage;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Scroller;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p165m3.InterfaceC8546b;
import p165m3.InterfaceC8547c;
import p197p2.AbstractC8819c;

/* loaded from: classes4.dex */
public class LinkageScrollLayout extends ViewGroup implements NestedScrollingParent {

    /* renamed from: a */
    public NestedScrollingParentHelper f6500a;

    /* renamed from: b */
    public HashMap f6501b;

    /* renamed from: c */
    public int f6502c;

    /* renamed from: d */
    public Scroller f6503d;

    /* renamed from: e */
    public Scroller f6504e;

    /* renamed from: f */
    public Scroller f6505f;

    /* renamed from: g */
    public VelocityTracker f6506g;

    /* renamed from: h */
    public int f6507h;

    /* renamed from: i */
    public int f6508i;

    /* renamed from: j */
    public int f6509j;

    /* renamed from: k */
    public boolean f6510k;

    /* renamed from: l */
    public int f6511l;

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout$a */
    public static class C6553a {

        /* renamed from: a */
        public int f6512a;

        /* renamed from: b */
        public int f6513b;

        public C6553a(int i10, int i11) {
            this.f6512a = i10;
            this.f6513b = i11;
        }
    }

    private int getNextEdge() {
        int scrollY = getScrollY();
        int i10 = this.f6509j;
        if (i10 == 17) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                InterfaceC8547c interfaceC8547cM5825c = m5825c(childAt);
                C6553a c6553a = (C6553a) this.f6501b.get(childAt);
                int i12 = c6553a != null ? c6553a.f6512a : 0;
                if (i12 > scrollY && m5829g(childAt) && interfaceC8547cM5825c.mo5837a(1)) {
                    return i12;
                }
            }
        } else {
            if (i10 != 18) {
                throw new RuntimeException("#getNextEdge# unknown Fling Orientation");
            }
            for (int childCount2 = getChildCount() - 1; childCount2 >= 0; childCount2--) {
                View childAt2 = getChildAt(childCount2);
                InterfaceC8547c interfaceC8547cM5825c2 = m5825c(childAt2);
                C6553a c6553a2 = (C6553a) this.f6501b.get(childAt2);
                int i13 = c6553a2 != null ? c6553a2.f6512a : 0;
                if (i13 < scrollY && m5829g(childAt2) && interfaceC8547cM5825c2.mo5837a(-1)) {
                    return i13;
                }
            }
        }
        if (this.f6509j == 17) {
            return this.f6502c;
        }
        return 0;
    }

    /* renamed from: i */
    private void m5822i() {
        VelocityTracker velocityTracker = this.f6506g;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f6506g = null;
        }
    }

    /* renamed from: a */
    public final void m5823a() {
        View view;
        int scrollY = getScrollY();
        Iterator it = this.f6501b.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                view = null;
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            C6553a c6553a = (C6553a) entry.getValue();
            if (scrollY >= c6553a.f6512a && scrollY < c6553a.f6513b) {
                view = (View) entry.getKey();
                break;
            }
        }
        if (view == null) {
            return;
        }
        int iIndexOfChild = indexOfChild(view);
        AbstractC8819c.m14778b("ELinkageScrollLayout", "#checkTargetsScroll# index: " + iIndexOfChild);
        for (int i10 = 0; i10 < iIndexOfChild; i10++) {
            m5832k(getChildAt(i10));
        }
        while (true) {
            iIndexOfChild++;
            if (iIndexOfChild >= getChildCount()) {
                return;
            } else {
                m5833l(getChildAt(iIndexOfChild));
            }
        }
    }

    /* renamed from: b */
    public final boolean m5824b(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final InterfaceC8547c m5825c(View view) {
        return ((InterfaceC8546b) view).mo5836a();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f6504e.computeScrollOffset()) {
            m5834m(0, this.f6504e.getCurrY(), true);
            invalidate();
        }
        if (this.f6505f.computeScrollOffset()) {
            m5834m(0, this.f6505f.getCurrY(), false);
            invalidate();
            if (this.f6505f.isFinished()) {
                AbstractC8819c.m14778b("ELinkageScrollLayout", "#computeScroll#, LocScroll finished");
                m5823a();
            }
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        int childCount = getChildCount();
        int iMo5838b = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            iMo5838b += ((InterfaceC8546b) getChildAt(i10)).mo5836a().mo5838b();
        }
        return iMo5838b + getScrollY();
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int iMo5840d = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            iMo5840d += ((InterfaceC8546b) getChildAt(i10)).mo5836a().mo5840d();
        }
        return iMo5840d;
    }

    /* renamed from: d */
    public final View m5826d(int i10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            C6553a c6553a = (C6553a) this.f6501b.get(childAt);
            if (c6553a != null && c6553a.f6512a == i10) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getX();
        motionEvent.getY();
        int action = motionEvent.getAction() & 255;
        if (action == 0 || action == 1 || action == 2 || action == 3) {
            throw null;
        }
        return m5824b(motionEvent);
    }

    /* renamed from: e */
    public final C6553a m5827e(View view) {
        return (C6553a) this.f6501b.get(view);
    }

    /* renamed from: f */
    public final View m5828f(float f10, float f11) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int[] iArr = new int[2];
            childAt.getLocationOnScreen(iArr);
            if (new RectF(iArr[0], iArr[1], childAt.getWidth() + r5, childAt.getHeight() + r4).contains(f10, f11)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final boolean m5829g(View view) {
        return m5825c(view).mo5842f() && view.getHeight() >= getHeight();
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f6500a.getNestedScrollAxes();
    }

    /* renamed from: h */
    public final void m5830h(float f10) {
        if (Math.abs(f10) > this.f6508i) {
            this.f6509j = f10 > 0.0f ? 17 : 18;
            this.f6504e.fling(0, getScrollY(), 1, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            invalidate();
        }
    }

    /* renamed from: j */
    public final void m5831j() {
        this.f6509j = 0;
        this.f6503d.abortAnimation();
        this.f6504e.abortAnimation();
        this.f6505f.abortAnimation();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final void m5832k(View view) {
        InterfaceC8547c interfaceC8547cMo5836a = ((InterfaceC8546b) view).mo5836a();
        if (interfaceC8547cMo5836a.mo5842f() && interfaceC8547cMo5836a.mo5837a(1)) {
            interfaceC8547cMo5836a.mo5839c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    public final void m5833l(View view) {
        InterfaceC8547c interfaceC8547cMo5836a = ((InterfaceC8546b) view).mo5836a();
        if (interfaceC8547cMo5836a.mo5842f() && interfaceC8547cMo5836a.mo5837a(-1)) {
            interfaceC8547cMo5836a.mo5843g();
        }
    }

    /* renamed from: m */
    public void m5834m(int i10, int i11, boolean z9) {
        awakenScrollBars();
        if (!z9) {
            scrollTo(i10, Math.min(Math.max(i11, 0), this.f6502c));
            return;
        }
        int iMin = Math.min(Math.max(i11, 0), this.f6502c);
        int nextEdge = getNextEdge();
        if (this.f6509j == 17) {
            iMin = Math.min(iMin, nextEdge);
        }
        if (this.f6509j == 18) {
            iMin = Math.max(iMin, nextEdge);
        }
        scrollTo(i10, iMin);
        if (getScrollY() == nextEdge) {
            int currVelocity = (int) this.f6504e.getCurrVelocity();
            int i12 = this.f6509j;
            if (i12 == 17 && currVelocity <= 0) {
                currVelocity = -currVelocity;
            }
            if (i12 == 18 && currVelocity >= 0) {
                currVelocity = -currVelocity;
            }
            AbstractC8819c.m14778b("ELinkageScrollLayout", "#scrollTo# To Edge: " + nextEdge + ", velocity: " + currVelocity);
            this.f6504e.abortAnimation();
            View viewM5826d = m5826d(nextEdge);
            m5825c(viewM5826d).mo5841e(viewM5826d, currVelocity);
            m5835n((float) currVelocity);
        }
    }

    /* renamed from: n */
    public final void m5835n(float f10) {
        this.f6503d.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            childAt.setVerticalScrollBarEnabled(false);
            childAt.setHorizontalScrollBarEnabled(false);
            if (!(childAt instanceof InterfaceC8546b)) {
                throw new RuntimeException("Child in LinkageScrollLayout must implement ILinkageScroll");
            }
            ((InterfaceC8546b) childAt).setChildLinkageEvent(null);
            childAt.setOverScrollMode(2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            int r0 = r4.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            if (r0 == 0) goto L27
            r2 = 1
            if (r0 == r2) goto L24
            r2 = 2
            if (r0 == r2) goto L13
            r4 = 3
            if (r0 == r4) goto L24
            goto L2c
        L13:
            float r0 = r4.getRawX()
            int r0 = (int) r0
            float r0 = (float) r0
            float r4 = r4.getRawY()
            int r4 = (int) r4
            float r4 = (float) r4
            r3.m5828f(r0, r4)
            r4 = 0
            throw r4
        L24:
            r3.f6510k = r1
            goto L2c
        L27:
            r3.f6510k = r1
            r3.m5823a()
        L2c:
            boolean r4 = r3.f6510k
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int i14 = 0;
        this.f6502c = 0;
        int childCount = getChildCount();
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            int measuredHeight = childAt.getMeasuredHeight() + i11;
            childAt.layout(i10, i11, i12, measuredHeight);
            this.f6502c += childAt.getHeight();
            this.f6501b.put(childAt, new C6553a(childAt.getTop(), childAt.getBottom()));
            i14++;
            i11 = measuredHeight;
        }
        this.f6502c -= getMeasuredHeight();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            measureChild(getChildAt(i12), i10, i11);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        AbstractC8819c.m14778b("ELinkageScrollLayout", "#onNestedPreFling# velocityY: " + f11);
        int scrollY = getScrollY();
        C6553a c6553aM5827e = m5827e(view);
        this.f6509j = f11 > 0.0f ? 17 : 18;
        if (scrollY == c6553aM5827e.f6512a) {
            m5835n(f11);
            return false;
        }
        m5830h(f11);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        AbstractC8819c.m14778b("ELinkageScrollLayout", "#onNestedPreScroll# dy: " + i11);
        boolean z9 = i11 > 0;
        int scrollY = getScrollY();
        C6553a c6553aM5827e = m5827e(view);
        InterfaceC8547c interfaceC8547cMo5836a = ((InterfaceC8546b) view).mo5836a();
        int i12 = c6553aM5827e.f6512a;
        if (scrollY == i12) {
            if ((!z9 && !interfaceC8547cMo5836a.mo5837a(-1)) || (z9 && !interfaceC8547cMo5836a.mo5837a(1))) {
                scrollBy(0, i11);
                iArr[1] = i11;
                return;
            } else {
                AbstractC8819c.m14778b("ELinkageScrollLayout", "#onNestedPreScroll#, handle scroll by " + view);
                return;
            }
        }
        if (scrollY > i12) {
            if (z9) {
                scrollBy(0, i11);
                iArr[1] = i11;
            }
            if (z9) {
                return;
            }
            int i13 = scrollY + i11;
            int i14 = c6553aM5827e.f6512a;
            if (i13 <= i14) {
                i11 = i14 - scrollY;
            }
            scrollBy(0, i11);
            iArr[1] = i11;
            return;
        }
        if (!z9) {
            scrollBy(0, i11);
            iArr[1] = i11;
        }
        if (z9) {
            int i15 = scrollY + i11;
            int i16 = c6553aM5827e.f6512a;
            if (i15 >= i16) {
                i11 = i16 - scrollY;
            }
            scrollBy(0, i11);
            iArr[1] = i11;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        if (i11 == 0 || i13 == 0) {
            return;
        }
        scrollBy(0, i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        AbstractC8819c.m14778b("ELinkageScrollLayout", "#onNestedScrollAccepted# axes: " + i10);
        this.f6500a.onNestedScrollAccepted(view, view2, i10);
        m5831j();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        AbstractC8819c.m14778b("ELinkageScrollLayout", "#onStartNestedScroll# nestedScrollAxes: " + i10);
        return (i10 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        AbstractC8819c.m14778b("ELinkageScrollLayout", "#onStopNestedScroll# child: " + view);
        this.f6500a.onStopNestedScroll(view);
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
            int r0 = r4.f6511l
            if (r0 != 0) goto L1d
            float r5 = r5.getY()
            int r5 = (int) r5
            r4.f6511l = r5
            return r1
        L1d:
            float r5 = r5.getY()
            int r5 = (int) r5
            int r0 = r4.f6511l
            int r0 = r5 - r0
            r4.f6511l = r5
            int r5 = -r0
            r4.scrollBy(r2, r5)
            goto L68
        L2d:
            r4.f6511l = r2
            android.view.VelocityTracker r5 = r4.f6506g
            if (r5 == 0) goto L68
            int r0 = r4.f6507h
            float r0 = (float) r0
            r2 = 1000(0x3e8, float:1.401E-42)
            r5.computeCurrentVelocity(r2, r0)
            android.view.VelocityTracker r5 = r4.f6506g
            float r5 = r5.getYVelocity()
            int r5 = (int) r5
            r4.m5822i()
            int r0 = -r5
            float r0 = (float) r0
            r4.m5830h(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "#dispatchTouchEvent# ACTION_UP, yVelocity: "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "ELinkageScrollLayout"
            p197p2.AbstractC8819c.m14778b(r0, r5)
            goto L68
        L61:
            float r5 = r5.getY()
            int r5 = (int) r5
            r4.f6511l = r5
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        awakenScrollBars();
        int scrollY = getScrollY();
        if (i11 >= 0) {
            int i12 = scrollY + i11;
            int i13 = this.f6502c;
            if (i12 > i13) {
                i11 = i13 - scrollY;
            }
        } else if (scrollY + i11 < 0) {
            i11 = -scrollY;
        }
        if (i11 != 0) {
            super.scrollBy(i10, i11);
        }
    }
}
