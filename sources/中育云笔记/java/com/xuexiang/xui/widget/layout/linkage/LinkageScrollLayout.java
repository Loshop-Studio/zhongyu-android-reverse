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
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p034b8.AbstractC5175c;
import p421y8.C11921e;
import p421y8.InterfaceC11917a;
import p421y8.InterfaceC11918b;
import p421y8.InterfaceC11919c;

/* loaded from: classes5.dex */
public class LinkageScrollLayout extends ViewGroup implements NestedScrollingParent {

    /* renamed from: c */
    public NestedScrollingParentHelper f16379c;

    /* renamed from: d */
    public HashMap f16380d;

    /* renamed from: e */
    public int f16381e;

    /* renamed from: f */
    public Scroller f16382f;

    /* renamed from: g */
    public Scroller f16383g;

    /* renamed from: h */
    public Scroller f16384h;

    /* renamed from: i */
    public VelocityTracker f16385i;

    /* renamed from: j */
    public C11921e f16386j;

    /* renamed from: k */
    public int f16387k;

    /* renamed from: l */
    public int f16388l;

    /* renamed from: m */
    public int f16389m;

    /* renamed from: n */
    public boolean f16390n;

    /* renamed from: o */
    public int f16391o;

    /* renamed from: p */
    public InterfaceC11917a f16392p;

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout$a */
    public class C8167a implements InterfaceC11917a {
        public C8167a() {
        }

        @Override // p421y8.InterfaceC11917a
        /* renamed from: a */
        public void mo12942a(View view) {
            LinkageScrollLayout.this.awakenScrollBars();
        }

        @Override // p421y8.InterfaceC11917a
        /* renamed from: b */
        public void mo12943b(View view) {
            C8168b c8168bM12931m;
            AbstractC5175c.m2708b("ELinkageScrollLayout", "#onContentScrollToBottom#");
            if (LinkageScrollLayout.this.f16389m != 17) {
                AbstractC5175c.m2708b("ELinkageScrollLayout", "onContentScrollToBottom, Invalid Fling Orientation");
                return;
            }
            if (!LinkageScrollLayout.this.m12934r(view) && LinkageScrollLayout.this.m12929k(view).mo12948f() && (c8168bM12931m = LinkageScrollLayout.this.m12931m(view)) != null && LinkageScrollLayout.this.getScrollY() == c8168bM12931m.f16394a && LinkageScrollLayout.this.f16382f.computeScrollOffset()) {
                float currVelocity = LinkageScrollLayout.this.f16382f.getCurrVelocity();
                if (currVelocity <= 0.0f) {
                    currVelocity = -currVelocity;
                }
                AbstractC5175c.m2708b("ELinkageScrollLayout", "onContentScrollToBottom, currVelocity: " + currVelocity);
                LinkageScrollLayout.this.f16382f.abortAnimation();
                LinkageScrollLayout.this.m12936t(currVelocity);
            }
        }

        @Override // p421y8.InterfaceC11917a
        /* renamed from: c */
        public void mo12944c(View view) {
            C8168b c8168bM12931m;
            AbstractC5175c.m2708b("ELinkageScrollLayout", "#onContentScrollToTop#");
            if (LinkageScrollLayout.this.f16389m != 18) {
                AbstractC5175c.m2708b("ELinkageScrollLayout", "onContentScrollToTop, Invalid Fling Orientation");
                return;
            }
            if (!LinkageScrollLayout.this.m12933q(view) && LinkageScrollLayout.this.m12929k(view).mo12948f() && (c8168bM12931m = LinkageScrollLayout.this.m12931m(view)) != null && LinkageScrollLayout.this.getScrollY() == c8168bM12931m.f16394a && LinkageScrollLayout.this.f16382f.computeScrollOffset()) {
                float currVelocity = LinkageScrollLayout.this.f16382f.getCurrVelocity();
                if (currVelocity >= 0.0f) {
                    currVelocity = -currVelocity;
                }
                AbstractC5175c.m2708b("ELinkageScrollLayout", "onContentScrollToTop, currVelocity: " + currVelocity);
                LinkageScrollLayout.this.f16382f.abortAnimation();
                LinkageScrollLayout.this.m12936t(currVelocity);
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout$b */
    public static class C8168b {

        /* renamed from: a */
        public int f16394a;

        /* renamed from: b */
        public int f16395b;

        public C8168b(int i10, int i11) {
            this.f16394a = i10;
            this.f16395b = i11;
        }
    }

    public LinkageScrollLayout(Context context) {
        this(context, null);
    }

    private int getNextEdge() {
        int scrollY = getScrollY();
        int i10 = this.f16389m;
        if (i10 == 17) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                InterfaceC11919c interfaceC11919cM12929k = m12929k(childAt);
                C8168b c8168b = (C8168b) this.f16380d.get(childAt);
                int i12 = c8168b != null ? c8168b.f16394a : 0;
                if (i12 > scrollY && m12935s(childAt) && interfaceC11919cM12929k.mo12950a(1)) {
                    return i12;
                }
            }
        } else {
            if (i10 != 18) {
                throw new RuntimeException("#getNextEdge# unknown Fling Orientation");
            }
            for (int childCount2 = getChildCount() - 1; childCount2 >= 0; childCount2--) {
                View childAt2 = getChildAt(childCount2);
                InterfaceC11919c interfaceC11919cM12929k2 = m12929k(childAt2);
                C8168b c8168b2 = (C8168b) this.f16380d.get(childAt2);
                int i13 = c8168b2 != null ? c8168b2.f16394a : 0;
                if (i13 < scrollY && m12935s(childAt2) && interfaceC11919cM12929k2.mo12950a(-1)) {
                    return i13;
                }
            }
        }
        if (this.f16389m == 17) {
            return this.f16381e;
        }
        return 0;
    }

    /* renamed from: o */
    private void m12924o() {
        VelocityTracker velocityTracker = this.f16385i;
        if (velocityTracker == null) {
            this.f16385i = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: p */
    private void m12925p() {
        if (this.f16385i == null) {
            this.f16385i = VelocityTracker.obtain();
        }
    }

    /* renamed from: u */
    private void m12926u() {
        VelocityTracker velocityTracker = this.f16385i;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f16385i = null;
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f16383g.computeScrollOffset()) {
            m12940y(0, this.f16383g.getCurrY(), true);
            invalidate();
        }
        if (this.f16384h.computeScrollOffset()) {
            m12940y(0, this.f16384h.getCurrY(), false);
            invalidate();
            if (this.f16384h.isFinished()) {
                AbstractC5175c.m2708b("ELinkageScrollLayout", "#computeScroll#, LocScroll finished");
                m12927i();
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
        int iMo12946b = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            iMo12946b += ((InterfaceC11918b) getChildAt(i10)).mo12945a().mo12946b();
        }
        return iMo12946b + getScrollY();
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int iMo12947d = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            iMo12947d += ((InterfaceC11918b) getChildAt(i10)).mo12945a().mo12947d();
        }
        return iMo12947d;
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
            y8.e r2 = r4.f16386j
            r2.m26470f(r0, r1)
            r4.m12925p()
            android.view.VelocityTracker r0 = r4.f16385i
            r0.addMovement(r5)
            goto L3e
        L28:
            y8.e r2 = r4.f16386j
            r2.m26471g(r0, r1)
            goto L3e
        L2e:
            y8.e r2 = r4.f16386j
            r2.m26469e(r0, r1)
            r4.m12937v()
            r4.m12924o()
            android.view.VelocityTracker r0 = r4.f16385i
            r0.addMovement(r5)
        L3e:
            boolean r5 = r4.m12928j(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f16379c.getNestedScrollAxes();
    }

    /* renamed from: i */
    public final void m12927i() {
        View view;
        int scrollY = getScrollY();
        Iterator it = this.f16380d.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                view = null;
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            C8168b c8168b = (C8168b) entry.getValue();
            if (scrollY >= c8168b.f16394a && scrollY < c8168b.f16395b) {
                view = (View) entry.getKey();
                break;
            }
        }
        if (view == null) {
            return;
        }
        int iIndexOfChild = indexOfChild(view);
        AbstractC5175c.m2708b("ELinkageScrollLayout", "#checkTargetsScroll# index: " + iIndexOfChild);
        for (int i10 = 0; i10 < iIndexOfChild; i10++) {
            m12938w(getChildAt(i10));
        }
        while (true) {
            iIndexOfChild++;
            if (iIndexOfChild >= getChildCount()) {
                return;
            } else {
                m12939x(getChildAt(iIndexOfChild));
            }
        }
    }

    /* renamed from: j */
    public final boolean m12928j(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final InterfaceC11919c m12929k(View view) {
        return ((InterfaceC11918b) view).mo12945a();
    }

    /* renamed from: l */
    public final View m12930l(int i10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            C8168b c8168b = (C8168b) this.f16380d.get(childAt);
            if (c8168b != null && c8168b.f16394a == i10) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: m */
    public final C8168b m12931m(View view) {
        return (C8168b) this.f16380d.get(view);
    }

    /* renamed from: n */
    public final View m12932n(float f10, float f11) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            childAt.setVerticalScrollBarEnabled(false);
            childAt.setHorizontalScrollBarEnabled(false);
            if (!(childAt instanceof InterfaceC11918b)) {
                throw new RuntimeException("Child in LinkageScrollLayout must implement ILinkageScroll");
            }
            ((InterfaceC11918b) childAt).setChildLinkageEvent(this.f16392p);
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
            android.view.View r5 = r4.m12932n(r0, r5)
            y8.e r0 = r4.f16386j
            boolean r0 = r0.m26466b()
            if (r0 == 0) goto L4b
            if (r5 == 0) goto L4b
            y8.c r5 = r4.m12929k(r5)
            boolean r5 = r5.mo12948f()
            if (r5 != 0) goto L4b
            r4.f16390n = r2
            android.view.ViewParent r5 = r4.getParent()
            if (r5 == 0) goto L4b
            r5.requestDisallowInterceptTouchEvent(r2)
            goto L4b
        L43:
            r4.f16390n = r1
            goto L4b
        L46:
            r4.f16390n = r1
            r4.m12927i()
        L4b:
            boolean r5 = r4.f16390n
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = 0;
        this.f16381e = 0;
        int childCount = getChildCount();
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            int measuredHeight = childAt.getMeasuredHeight() + i11;
            childAt.layout(i10, i11, i12, measuredHeight);
            this.f16381e += childAt.getHeight();
            this.f16380d.put(childAt, new C8168b(childAt.getTop(), childAt.getBottom()));
            i14++;
            i11 = measuredHeight;
        }
        this.f16381e -= getMeasuredHeight();
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
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        AbstractC5175c.m2708b("ELinkageScrollLayout", "#onNestedPreFling# velocityY: " + f11);
        int scrollY = getScrollY();
        C8168b c8168bM12931m = m12931m(view);
        this.f16389m = f11 > 0.0f ? 17 : 18;
        if (scrollY == c8168bM12931m.f16394a) {
            m12941z(f11);
            return false;
        }
        m12936t(f11);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        AbstractC5175c.m2708b("ELinkageScrollLayout", "#onNestedPreScroll# dy: " + i11);
        boolean z10 = i11 > 0;
        int scrollY = getScrollY();
        C8168b c8168bM12931m = m12931m(view);
        InterfaceC11919c interfaceC11919cMo12945a = ((InterfaceC11918b) view).mo12945a();
        int i12 = c8168bM12931m.f16394a;
        if (scrollY == i12) {
            if ((!z10 && !interfaceC11919cMo12945a.mo12950a(-1)) || (z10 && !interfaceC11919cMo12945a.mo12950a(1))) {
                scrollBy(0, i11);
                iArr[1] = i11;
                return;
            } else {
                AbstractC5175c.m2708b("ELinkageScrollLayout", "#onNestedPreScroll#, handle scroll by " + view);
                return;
            }
        }
        if (scrollY > i12) {
            if (z10) {
                scrollBy(0, i11);
                iArr[1] = i11;
            }
            if (z10) {
                return;
            }
            int i13 = scrollY + i11;
            int i14 = c8168bM12931m.f16394a;
            if (i13 <= i14) {
                i11 = i14 - scrollY;
            }
            scrollBy(0, i11);
            iArr[1] = i11;
            return;
        }
        if (!z10) {
            scrollBy(0, i11);
            iArr[1] = i11;
        }
        if (z10) {
            int i15 = scrollY + i11;
            int i16 = c8168bM12931m.f16394a;
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
        AbstractC5175c.m2708b("ELinkageScrollLayout", "#onNestedScrollAccepted# axes: " + i10);
        this.f16379c.onNestedScrollAccepted(view, view2, i10);
        m12937v();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        AbstractC5175c.m2708b("ELinkageScrollLayout", "#onStartNestedScroll# nestedScrollAxes: " + i10);
        return (i10 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        AbstractC5175c.m2708b("ELinkageScrollLayout", "#onStopNestedScroll# child: " + view);
        this.f16379c.onStopNestedScroll(view);
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
            int r0 = r4.f16391o
            if (r0 != 0) goto L1d
            float r5 = r5.getY()
            int r5 = (int) r5
            r4.f16391o = r5
            return r1
        L1d:
            float r5 = r5.getY()
            int r5 = (int) r5
            int r0 = r4.f16391o
            int r0 = r5 - r0
            r4.f16391o = r5
            int r5 = -r0
            r4.scrollBy(r2, r5)
            goto L68
        L2d:
            r4.f16391o = r2
            android.view.VelocityTracker r5 = r4.f16385i
            if (r5 == 0) goto L68
            int r0 = r4.f16387k
            float r0 = (float) r0
            r2 = 1000(0x3e8, float:1.401E-42)
            r5.computeCurrentVelocity(r2, r0)
            android.view.VelocityTracker r5 = r4.f16385i
            float r5 = r5.getYVelocity()
            int r5 = (int) r5
            r4.m12926u()
            int r0 = -r5
            float r0 = (float) r0
            r4.m12936t(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "#dispatchTouchEvent# ACTION_UP, yVelocity: "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "ELinkageScrollLayout"
            p034b8.AbstractC5175c.m2708b(r0, r5)
            goto L68
        L61:
            float r5 = r5.getY()
            int r5 = (int) r5
            r4.f16391o = r5
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: q */
    public final boolean m12933q(View view) {
        return view == getChildAt(0);
    }

    /* renamed from: r */
    public final boolean m12934r(View view) {
        return view == getChildAt(getChildCount() - 1);
    }

    /* renamed from: s */
    public final boolean m12935s(View view) {
        return m12929k(view).mo12948f() && view.getHeight() >= getHeight();
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        awakenScrollBars();
        int scrollY = getScrollY();
        if (i11 >= 0) {
            int i12 = scrollY + i11;
            int i13 = this.f16381e;
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

    /* renamed from: t */
    public final void m12936t(float f10) {
        if (Math.abs(f10) > this.f16388l) {
            this.f16389m = f10 > 0.0f ? 17 : 18;
            this.f16383g.fling(0, getScrollY(), 1, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            invalidate();
        }
    }

    /* renamed from: v */
    public final void m12937v() {
        this.f16389m = 0;
        this.f16382f.abortAnimation();
        this.f16383g.abortAnimation();
        this.f16384h.abortAnimation();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w */
    public final void m12938w(View view) {
        InterfaceC11919c interfaceC11919cMo12945a = ((InterfaceC11918b) view).mo12945a();
        if (interfaceC11919cMo12945a.mo12948f() && interfaceC11919cMo12945a.mo12950a(1)) {
            interfaceC11919cMo12945a.mo12951c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    public final void m12939x(View view) {
        InterfaceC11919c interfaceC11919cMo12945a = ((InterfaceC11918b) view).mo12945a();
        if (interfaceC11919cMo12945a.mo12948f() && interfaceC11919cMo12945a.mo12950a(-1)) {
            interfaceC11919cMo12945a.mo12953g();
        }
    }

    /* renamed from: y */
    public void m12940y(int i10, int i11, boolean z10) {
        awakenScrollBars();
        if (!z10) {
            scrollTo(i10, Math.min(Math.max(i11, 0), this.f16381e));
            return;
        }
        int iMin = Math.min(Math.max(i11, 0), this.f16381e);
        int nextEdge = getNextEdge();
        if (this.f16389m == 17) {
            iMin = Math.min(iMin, nextEdge);
        }
        if (this.f16389m == 18) {
            iMin = Math.max(iMin, nextEdge);
        }
        scrollTo(i10, iMin);
        if (getScrollY() == nextEdge) {
            int currVelocity = (int) this.f16383g.getCurrVelocity();
            int i12 = this.f16389m;
            if (i12 == 17 && currVelocity <= 0) {
                currVelocity = -currVelocity;
            }
            if (i12 == 18 && currVelocity >= 0) {
                currVelocity = -currVelocity;
            }
            AbstractC5175c.m2708b("ELinkageScrollLayout", "#scrollTo# To Edge: " + nextEdge + ", velocity: " + currVelocity);
            this.f16383g.abortAnimation();
            View viewM12930l = m12930l(nextEdge);
            m12929k(viewM12930l).mo12952e(viewM12930l, currVelocity);
            m12941z((float) currVelocity);
        }
    }

    /* renamed from: z */
    public final void m12941z(float f10) {
        this.f16382f.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        invalidate();
    }

    public LinkageScrollLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public LinkageScrollLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16380d = new HashMap();
        this.f16389m = 0;
        this.f16392p = new C8167a();
        this.f16379c = new NestedScrollingParentHelper(this);
        this.f16383g = new Scroller(getContext());
        this.f16384h = new Scroller(getContext());
        this.f16382f = new Scroller(getContext());
        this.f16386j = new C11921e();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f16387k = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f16388l = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f16386j.m26474j(viewConfiguration.getScaledTouchSlop());
        setWillNotDraw(false);
        setVerticalScrollBarEnabled(true);
    }
}
