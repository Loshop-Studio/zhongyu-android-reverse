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
import p048d1.InterfaceC3701b;
import p048d1.InterfaceC3702c;
import p082k0.AbstractC3857c;

/* loaded from: classes2.dex */
public class LinkageScrollLayout extends ViewGroup implements NestedScrollingParent {

    /* renamed from: a */
    public NestedScrollingParentHelper f3704a;

    /* renamed from: b */
    public HashMap f3705b;

    /* renamed from: c */
    public int f3706c;

    /* renamed from: d */
    public Scroller f3707d;

    /* renamed from: e */
    public Scroller f3708e;

    /* renamed from: f */
    public Scroller f3709f;

    /* renamed from: g */
    public VelocityTracker f3710g;

    /* renamed from: h */
    public int f3711h;

    /* renamed from: i */
    public int f3712i;

    /* renamed from: j */
    public int f3713j;

    /* renamed from: k */
    public boolean f3714k;

    /* renamed from: l */
    public int f3715l;

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout$a */
    public static class C3593a {

        /* renamed from: a */
        public int f3716a;

        /* renamed from: b */
        public int f3717b;

        public C3593a(int i4, int i5) {
            this.f3716a = i4;
            this.f3717b = i5;
        }
    }

    private int getNextEdge() {
        int scrollY = getScrollY();
        int i4 = this.f3713j;
        if (i4 == 17) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                InterfaceC3702c interfaceC3702cM4465c = m4465c(childAt);
                C3593a c3593a = (C3593a) this.f3705b.get(childAt);
                int i6 = c3593a != null ? c3593a.f3716a : 0;
                if (i6 > scrollY && m4469g(childAt) && interfaceC3702cM4465c.mo4478a(1)) {
                    return i6;
                }
            }
        } else {
            if (i4 != 18) {
                throw new RuntimeException("#getNextEdge# unknown Fling Orientation");
            }
            for (int childCount2 = getChildCount() - 1; childCount2 >= 0; childCount2--) {
                View childAt2 = getChildAt(childCount2);
                InterfaceC3702c interfaceC3702cM4465c2 = m4465c(childAt2);
                C3593a c3593a2 = (C3593a) this.f3705b.get(childAt2);
                int i7 = c3593a2 != null ? c3593a2.f3716a : 0;
                if (i7 < scrollY && m4469g(childAt2) && interfaceC3702cM4465c2.mo4478a(-1)) {
                    return i7;
                }
            }
        }
        if (this.f3713j == 17) {
            return this.f3706c;
        }
        return 0;
    }

    /* renamed from: a */
    public final void m4463a() {
        View view;
        int scrollY = getScrollY();
        Iterator it = this.f3705b.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                view = null;
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            C3593a c3593a = (C3593a) entry.getValue();
            if (scrollY >= c3593a.f3716a && scrollY < c3593a.f3717b) {
                view = (View) entry.getKey();
                break;
            }
        }
        if (view == null) {
            return;
        }
        int iIndexOfChild = indexOfChild(view);
        AbstractC3857c.m5160b("ELinkageScrollLayout", "#checkTargetsScroll# index: " + iIndexOfChild);
        for (int i4 = 0; i4 < iIndexOfChild; i4++) {
            m4473k(getChildAt(i4));
        }
        while (true) {
            iIndexOfChild++;
            if (iIndexOfChild >= getChildCount()) {
                return;
            } else {
                m4474l(getChildAt(iIndexOfChild));
            }
        }
    }

    /* renamed from: b */
    public final boolean m4464b(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final InterfaceC3702c m4465c(View view) {
        return ((InterfaceC3701b) view).mo4477a();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f3708e.computeScrollOffset()) {
            m4475m(0, this.f3708e.getCurrY(), true);
            invalidate();
        }
        if (this.f3709f.computeScrollOffset()) {
            m4475m(0, this.f3709f.getCurrY(), false);
            invalidate();
            if (this.f3709f.isFinished()) {
                AbstractC3857c.m5160b("ELinkageScrollLayout", "#computeScroll#, LocScroll finished");
                m4463a();
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
        int iMo4480c = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            iMo4480c += ((InterfaceC3701b) getChildAt(i4)).mo4477a().mo4480c();
        }
        return iMo4480c + getScrollY();
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int iMo4484g = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            iMo4484g += ((InterfaceC3701b) getChildAt(i4)).mo4477a().mo4484g();
        }
        return iMo4484g;
    }

    /* renamed from: d */
    public final View m4466d(int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C3593a c3593a = (C3593a) this.f3705b.get(childAt);
            if (c3593a != null && c3593a.f3716a == i4) {
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
        return m4464b(motionEvent);
    }

    /* renamed from: e */
    public final C3593a m4467e(View view) {
        return (C3593a) this.f3705b.get(view);
    }

    /* renamed from: f */
    public final View m4468f(float f4, float f5) {
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

    /* renamed from: g */
    public final boolean m4469g(View view) {
        return m4465c(view).mo4481d() && view.getHeight() >= getHeight();
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f3704a.getNestedScrollAxes();
    }

    /* renamed from: h */
    public final void m4470h(float f4) {
        if (Math.abs(f4) > this.f3712i) {
            this.f3713j = f4 > 0.0f ? 17 : 18;
            this.f3708e.fling(0, getScrollY(), 1, (int) f4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            invalidate();
        }
    }

    /* renamed from: i */
    public final void m4471i() {
        VelocityTracker velocityTracker = this.f3710g;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3710g = null;
        }
    }

    /* renamed from: j */
    public final void m4472j() {
        this.f3713j = 0;
        this.f3707d.abortAnimation();
        this.f3708e.abortAnimation();
        this.f3709f.abortAnimation();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final void m4473k(View view) {
        InterfaceC3702c interfaceC3702cMo4477a = ((InterfaceC3701b) view).mo4477a();
        if (interfaceC3702cMo4477a.mo4481d() && interfaceC3702cMo4477a.mo4478a(1)) {
            interfaceC3702cMo4477a.mo4482e();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    public final void m4474l(View view) {
        InterfaceC3702c interfaceC3702cMo4477a = ((InterfaceC3701b) view).mo4477a();
        if (interfaceC3702cMo4477a.mo4481d() && interfaceC3702cMo4477a.mo4478a(-1)) {
            interfaceC3702cMo4477a.mo4483f();
        }
    }

    /* renamed from: m */
    public void m4475m(int i4, int i5, boolean z3) {
        awakenScrollBars();
        if (!z3) {
            scrollTo(i4, Math.min(Math.max(i5, 0), this.f3706c));
            return;
        }
        int iMin = Math.min(Math.max(i5, 0), this.f3706c);
        int nextEdge = getNextEdge();
        if (this.f3713j == 17) {
            iMin = Math.min(iMin, nextEdge);
        }
        if (this.f3713j == 18) {
            iMin = Math.max(iMin, nextEdge);
        }
        scrollTo(i4, iMin);
        if (getScrollY() == nextEdge) {
            int currVelocity = (int) this.f3708e.getCurrVelocity();
            int i6 = this.f3713j;
            if (i6 == 17 && currVelocity <= 0) {
                currVelocity = -currVelocity;
            }
            if (i6 == 18 && currVelocity >= 0) {
                currVelocity = -currVelocity;
            }
            AbstractC3857c.m5160b("ELinkageScrollLayout", "#scrollTo# To Edge: " + nextEdge + ", velocity: " + currVelocity);
            this.f3708e.abortAnimation();
            View viewM4466d = m4466d(nextEdge);
            m4465c(viewM4466d).mo4479b(viewM4466d, currVelocity);
            m4476n((float) currVelocity);
        }
    }

    /* renamed from: n */
    public final void m4476n(float f4) {
        this.f3707d.fling(0, 0, 0, (int) f4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            childAt.setVerticalScrollBarEnabled(false);
            childAt.setHorizontalScrollBarEnabled(false);
            if (!(childAt instanceof InterfaceC3701b)) {
                throw new RuntimeException("Child in LinkageScrollLayout must implement ILinkageScroll");
            }
            ((InterfaceC3701b) childAt).setChildLinkageEvent(null);
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
            r3.m4468f(r0, r4)
            r4 = 0
            throw r4
        L24:
            r3.f3714k = r1
            goto L2c
        L27:
            r3.f3714k = r1
            r3.m4463a()
        L2c:
            boolean r4 = r3.f3714k
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int i8 = 0;
        this.f3706c = 0;
        int childCount = getChildCount();
        while (i8 < childCount) {
            View childAt = getChildAt(i8);
            int measuredHeight = childAt.getMeasuredHeight() + i5;
            childAt.layout(i4, i5, i6, measuredHeight);
            this.f3706c += childAt.getHeight();
            this.f3705b.put(childAt, new C3593a(childAt.getTop(), childAt.getBottom()));
            i8++;
            i5 = measuredHeight;
        }
        this.f3706c -= getMeasuredHeight();
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            measureChild(getChildAt(i6), i4, i5);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f4, float f5, boolean z3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f4, float f5) {
        AbstractC3857c.m5160b("ELinkageScrollLayout", "#onNestedPreFling# velocityY: " + f5);
        int scrollY = getScrollY();
        C3593a c3593aM4467e = m4467e(view);
        this.f3713j = f5 > 0.0f ? 17 : 18;
        if (scrollY == c3593aM4467e.f3716a) {
            m4476n(f5);
            return false;
        }
        m4470h(f5);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        AbstractC3857c.m5160b("ELinkageScrollLayout", "#onNestedPreScroll# dy: " + i5);
        boolean z3 = i5 > 0;
        boolean z4 = !z3;
        int scrollY = getScrollY();
        C3593a c3593aM4467e = m4467e(view);
        InterfaceC3702c interfaceC3702cMo4477a = ((InterfaceC3701b) view).mo4477a();
        int i6 = c3593aM4467e.f3716a;
        if (scrollY == i6) {
            if ((z4 && !interfaceC3702cMo4477a.mo4478a(-1)) || (z3 && !interfaceC3702cMo4477a.mo4478a(1))) {
                scrollBy(0, i5);
                iArr[1] = i5;
                return;
            } else {
                AbstractC3857c.m5160b("ELinkageScrollLayout", "#onNestedPreScroll#, handle scroll by " + view);
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
                int i8 = c3593aM4467e.f3716a;
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
            int i10 = c3593aM4467e.f3716a;
            if (i9 >= i10) {
                i5 = i10 - scrollY;
            }
            scrollBy(0, i5);
            iArr[1] = i5;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        if (i5 == 0 || i7 == 0) {
            return;
        }
        scrollBy(0, i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i4) {
        AbstractC3857c.m5160b("ELinkageScrollLayout", "#onNestedScrollAccepted# axes: " + i4);
        this.f3704a.onNestedScrollAccepted(view, view2, i4);
        m4472j();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i4) {
        AbstractC3857c.m5160b("ELinkageScrollLayout", "#onStartNestedScroll# nestedScrollAxes: " + i4);
        return (i4 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        AbstractC3857c.m5160b("ELinkageScrollLayout", "#onStopNestedScroll# child: " + view);
        this.f3704a.onStopNestedScroll(view);
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
            int r0 = r4.f3715l
            if (r0 != 0) goto L1d
            float r5 = r5.getY()
            int r5 = (int) r5
            r4.f3715l = r5
            return r1
        L1d:
            float r5 = r5.getY()
            int r5 = (int) r5
            int r0 = r4.f3715l
            int r0 = r5 - r0
            r4.f3715l = r5
            int r5 = -r0
            r4.scrollBy(r2, r5)
            goto L68
        L2d:
            r4.f3715l = r2
            android.view.VelocityTracker r5 = r4.f3710g
            if (r5 == 0) goto L68
            int r0 = r4.f3711h
            float r0 = (float) r0
            r2 = 1000(0x3e8, float:1.401E-42)
            r5.computeCurrentVelocity(r2, r0)
            android.view.VelocityTracker r5 = r4.f3710g
            float r5 = r5.getYVelocity()
            int r5 = (int) r5
            r4.m4471i()
            int r0 = -r5
            float r0 = (float) r0
            r4.m4470h(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "#dispatchTouchEvent# ACTION_UP, yVelocity: "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "ELinkageScrollLayout"
            p082k0.AbstractC3857c.m5160b(r0, r5)
            goto L68
        L61:
            float r5 = r5.getY()
            int r5 = (int) r5
            r4.f3715l = r5
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
            int i7 = this.f3706c;
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
}
