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
import p033c4.InterfaceC5226b;
import p033c4.InterfaceC5227c;
import p104f3.AbstractC7919c;

/* loaded from: classes4.dex */
public class LinkageScrollLayout extends ViewGroup implements NestedScrollingParent {

    /* renamed from: a */
    public NestedScrollingParentHelper f7758a;

    /* renamed from: b */
    public HashMap f7759b;

    /* renamed from: c */
    public int f7760c;

    /* renamed from: d */
    public Scroller f7761d;

    /* renamed from: e */
    public Scroller f7762e;

    /* renamed from: f */
    public Scroller f7763f;

    /* renamed from: g */
    public VelocityTracker f7764g;

    /* renamed from: h */
    public int f7765h;

    /* renamed from: i */
    public int f7766i;

    /* renamed from: j */
    public int f7767j;

    /* renamed from: k */
    public boolean f7768k;

    /* renamed from: l */
    public int f7769l;

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout$a */
    public static class C6873a {

        /* renamed from: a */
        public int f7770a;

        /* renamed from: b */
        public int f7771b;

        public C6873a(int i9, int i10) {
            this.f7770a = i9;
            this.f7771b = i10;
        }
    }

    private int getNextEdge() {
        int scrollY = getScrollY();
        int i9 = this.f7767j;
        if (i9 == 17) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                InterfaceC5227c interfaceC5227cM6931c = m6931c(childAt);
                C6873a c6873a = (C6873a) this.f7759b.get(childAt);
                int i11 = c6873a != null ? c6873a.f7770a : 0;
                if (i11 > scrollY && m6935g(childAt) && interfaceC5227cM6931c.mo2338a(1)) {
                    return i11;
                }
            }
        } else {
            if (i9 != 18) {
                throw new RuntimeException("#getNextEdge# unknown Fling Orientation");
            }
            for (int childCount2 = getChildCount() - 1; childCount2 >= 0; childCount2--) {
                View childAt2 = getChildAt(childCount2);
                InterfaceC5227c interfaceC5227cM6931c2 = m6931c(childAt2);
                C6873a c6873a2 = (C6873a) this.f7759b.get(childAt2);
                int i12 = c6873a2 != null ? c6873a2.f7770a : 0;
                if (i12 < scrollY && m6935g(childAt2) && interfaceC5227cM6931c2.mo2338a(-1)) {
                    return i12;
                }
            }
        }
        if (this.f7767j == 17) {
            return this.f7760c;
        }
        return 0;
    }

    /* renamed from: i */
    private void m6928i() {
        VelocityTracker velocityTracker = this.f7764g;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f7764g = null;
        }
    }

    /* renamed from: a */
    public final void m6929a() {
        View view;
        int scrollY = getScrollY();
        Iterator it = this.f7759b.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                view = null;
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            C6873a c6873a = (C6873a) entry.getValue();
            if (scrollY >= c6873a.f7770a && scrollY < c6873a.f7771b) {
                view = (View) entry.getKey();
                break;
            }
        }
        if (view == null) {
            return;
        }
        int iIndexOfChild = indexOfChild(view);
        AbstractC7919c.m12469b("ELinkageScrollLayout", "#checkTargetsScroll# index: " + iIndexOfChild);
        for (int i9 = 0; i9 < iIndexOfChild; i9++) {
            m6938k(getChildAt(i9));
        }
        while (true) {
            iIndexOfChild++;
            if (iIndexOfChild >= getChildCount()) {
                return;
            } else {
                m6939l(getChildAt(iIndexOfChild));
            }
        }
    }

    /* renamed from: b */
    public final boolean m6930b(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final InterfaceC5227c m6931c(View view) {
        return ((InterfaceC5226b) view).mo2337a();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f7762e.computeScrollOffset()) {
            m6940m(0, this.f7762e.getCurrY(), true);
            invalidate();
        }
        if (this.f7763f.computeScrollOffset()) {
            m6940m(0, this.f7763f.getCurrY(), false);
            invalidate();
            if (this.f7763f.isFinished()) {
                AbstractC7919c.m12469b("ELinkageScrollLayout", "#computeScroll#, LocScroll finished");
                m6929a();
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
        int iMo2339b = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            iMo2339b += ((InterfaceC5226b) getChildAt(i9)).mo2337a().mo2339b();
        }
        return iMo2339b + getScrollY();
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int iMo2341d = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            iMo2341d += ((InterfaceC5226b) getChildAt(i9)).mo2337a().mo2341d();
        }
        return iMo2341d;
    }

    /* renamed from: d */
    public final View m6932d(int i9) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            C6873a c6873a = (C6873a) this.f7759b.get(childAt);
            if (c6873a != null && c6873a.f7770a == i9) {
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
        return m6930b(motionEvent);
    }

    /* renamed from: e */
    public final C6873a m6933e(View view) {
        return (C6873a) this.f7759b.get(view);
    }

    /* renamed from: f */
    public final View m6934f(float f10, float f11) {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            int[] iArr = new int[2];
            childAt.getLocationOnScreen(iArr);
            if (new RectF(iArr[0], iArr[1], childAt.getWidth() + r5, childAt.getHeight() + r4).contains(f10, f11)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final boolean m6935g(View view) {
        return m6931c(view).mo2343f() && view.getHeight() >= getHeight();
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f7758a.getNestedScrollAxes();
    }

    /* renamed from: h */
    public final void m6936h(float f10) {
        if (Math.abs(f10) > this.f7766i) {
            this.f7767j = f10 > 0.0f ? 17 : 18;
            this.f7762e.fling(0, getScrollY(), 1, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            invalidate();
        }
    }

    /* renamed from: j */
    public final void m6937j() {
        this.f7767j = 0;
        this.f7761d.abortAnimation();
        this.f7762e.abortAnimation();
        this.f7763f.abortAnimation();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final void m6938k(View view) {
        InterfaceC5227c interfaceC5227cMo2337a = ((InterfaceC5226b) view).mo2337a();
        if (interfaceC5227cMo2337a.mo2343f() && interfaceC5227cMo2337a.mo2338a(1)) {
            interfaceC5227cMo2337a.mo2340c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    public final void m6939l(View view) {
        InterfaceC5227c interfaceC5227cMo2337a = ((InterfaceC5226b) view).mo2337a();
        if (interfaceC5227cMo2337a.mo2343f() && interfaceC5227cMo2337a.mo2338a(-1)) {
            interfaceC5227cMo2337a.mo2344g();
        }
    }

    /* renamed from: m */
    public void m6940m(int i9, int i10, boolean z9) {
        awakenScrollBars();
        if (!z9) {
            scrollTo(i9, Math.min(Math.max(i10, 0), this.f7760c));
            return;
        }
        int iMin = Math.min(Math.max(i10, 0), this.f7760c);
        int nextEdge = getNextEdge();
        if (this.f7767j == 17) {
            iMin = Math.min(iMin, nextEdge);
        }
        if (this.f7767j == 18) {
            iMin = Math.max(iMin, nextEdge);
        }
        scrollTo(i9, iMin);
        if (getScrollY() == nextEdge) {
            int currVelocity = (int) this.f7762e.getCurrVelocity();
            int i11 = this.f7767j;
            if (i11 == 17 && currVelocity <= 0) {
                currVelocity = -currVelocity;
            }
            if (i11 == 18 && currVelocity >= 0) {
                currVelocity = -currVelocity;
            }
            AbstractC7919c.m12469b("ELinkageScrollLayout", "#scrollTo# To Edge: " + nextEdge + ", velocity: " + currVelocity);
            this.f7762e.abortAnimation();
            View viewM6932d = m6932d(nextEdge);
            m6931c(viewM6932d).mo2342e(viewM6932d, currVelocity);
            m6941n((float) currVelocity);
        }
    }

    /* renamed from: n */
    public final void m6941n(float f10) {
        this.f7761d.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            childAt.setVerticalScrollBarEnabled(false);
            childAt.setHorizontalScrollBarEnabled(false);
            if (!(childAt instanceof InterfaceC5226b)) {
                throw new RuntimeException("Child in LinkageScrollLayout must implement ILinkageScroll");
            }
            ((InterfaceC5226b) childAt).setChildLinkageEvent(null);
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
            r3.m6934f(r0, r4)
            r4 = 0
            throw r4
        L24:
            r3.f7768k = r1
            goto L2c
        L27:
            r3.f7768k = r1
            r3.m6929a()
        L2c:
            boolean r4 = r3.f7768k
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        int i13 = 0;
        this.f7760c = 0;
        int childCount = getChildCount();
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            int measuredHeight = childAt.getMeasuredHeight() + i10;
            childAt.layout(i9, i10, i11, measuredHeight);
            this.f7760c += childAt.getHeight();
            this.f7759b.put(childAt, new C6873a(childAt.getTop(), childAt.getBottom()));
            i13++;
            i10 = measuredHeight;
        }
        this.f7760c -= getMeasuredHeight();
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            measureChild(getChildAt(i11), i9, i10);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        AbstractC7919c.m12469b("ELinkageScrollLayout", "#onNestedPreFling# velocityY: " + f11);
        int scrollY = getScrollY();
        C6873a c6873aM6933e = m6933e(view);
        this.f7767j = f11 > 0.0f ? 17 : 18;
        if (scrollY == c6873aM6933e.f7770a) {
            m6941n(f11);
            return false;
        }
        m6936h(f11);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i9, int i10, int[] iArr) {
        AbstractC7919c.m12469b("ELinkageScrollLayout", "#onNestedPreScroll# dy: " + i10);
        boolean z9 = i10 > 0;
        int scrollY = getScrollY();
        C6873a c6873aM6933e = m6933e(view);
        InterfaceC5227c interfaceC5227cMo2337a = ((InterfaceC5226b) view).mo2337a();
        int i11 = c6873aM6933e.f7770a;
        if (scrollY == i11) {
            if ((!z9 && !interfaceC5227cMo2337a.mo2338a(-1)) || (z9 && !interfaceC5227cMo2337a.mo2338a(1))) {
                scrollBy(0, i10);
                iArr[1] = i10;
                return;
            } else {
                AbstractC7919c.m12469b("ELinkageScrollLayout", "#onNestedPreScroll#, handle scroll by " + view);
                return;
            }
        }
        if (scrollY > i11) {
            if (z9) {
                scrollBy(0, i10);
                iArr[1] = i10;
            }
            if (z9) {
                return;
            }
            int i12 = scrollY + i10;
            int i13 = c6873aM6933e.f7770a;
            if (i12 <= i13) {
                i10 = i13 - scrollY;
            }
            scrollBy(0, i10);
            iArr[1] = i10;
            return;
        }
        if (!z9) {
            scrollBy(0, i10);
            iArr[1] = i10;
        }
        if (z9) {
            int i14 = scrollY + i10;
            int i15 = c6873aM6933e.f7770a;
            if (i14 >= i15) {
                i10 = i15 - scrollY;
            }
            scrollBy(0, i10);
            iArr[1] = i10;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i9, int i10, int i11, int i12) {
        if (i10 == 0 || i12 == 0) {
            return;
        }
        scrollBy(0, i12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i9) {
        AbstractC7919c.m12469b("ELinkageScrollLayout", "#onNestedScrollAccepted# axes: " + i9);
        this.f7758a.onNestedScrollAccepted(view, view2, i9);
        m6937j();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i9) {
        AbstractC7919c.m12469b("ELinkageScrollLayout", "#onStartNestedScroll# nestedScrollAxes: " + i9);
        return (i9 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        AbstractC7919c.m12469b("ELinkageScrollLayout", "#onStopNestedScroll# child: " + view);
        this.f7758a.onStopNestedScroll(view);
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
            int r0 = r4.f7769l
            if (r0 != 0) goto L1d
            float r5 = r5.getY()
            int r5 = (int) r5
            r4.f7769l = r5
            return r1
        L1d:
            float r5 = r5.getY()
            int r5 = (int) r5
            int r0 = r4.f7769l
            int r0 = r5 - r0
            r4.f7769l = r5
            int r5 = -r0
            r4.scrollBy(r2, r5)
            goto L68
        L2d:
            r4.f7769l = r2
            android.view.VelocityTracker r5 = r4.f7764g
            if (r5 == 0) goto L68
            int r0 = r4.f7765h
            float r0 = (float) r0
            r2 = 1000(0x3e8, float:1.401E-42)
            r5.computeCurrentVelocity(r2, r0)
            android.view.VelocityTracker r5 = r4.f7764g
            float r5 = r5.getYVelocity()
            int r5 = (int) r5
            r4.m6928i()
            int r0 = -r5
            float r0 = (float) r0
            r4.m6936h(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "#dispatchTouchEvent# ACTION_UP, yVelocity: "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "ELinkageScrollLayout"
            p104f3.AbstractC7919c.m12469b(r0, r5)
            goto L68
        L61:
            float r5 = r5.getY()
            int r5 = (int) r5
            r4.f7769l = r5
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void scrollBy(int i9, int i10) {
        awakenScrollBars();
        int scrollY = getScrollY();
        if (i10 >= 0) {
            int i11 = scrollY + i10;
            int i12 = this.f7760c;
            if (i11 > i12) {
                i10 = i12 - scrollY;
            }
        } else if (scrollY + i10 < 0) {
            i10 = -scrollY;
        }
        if (i10 != 0) {
            super.scrollBy(i9, i10);
        }
    }
}
