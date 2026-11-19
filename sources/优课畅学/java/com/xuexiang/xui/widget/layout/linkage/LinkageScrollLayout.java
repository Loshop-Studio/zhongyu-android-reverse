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
import p163l2.InterfaceC9244b;
import p163l2.InterfaceC9245c;
import p184n1.AbstractC9363c;

/* loaded from: classes4.dex */
public class LinkageScrollLayout extends ViewGroup implements NestedScrollingParent {

    /* renamed from: a */
    public NestedScrollingParentHelper f7917a;

    /* renamed from: b */
    public HashMap f7918b;

    /* renamed from: c */
    public int f7919c;

    /* renamed from: d */
    public Scroller f7920d;

    /* renamed from: e */
    public Scroller f7921e;

    /* renamed from: f */
    public Scroller f7922f;

    /* renamed from: g */
    public VelocityTracker f7923g;

    /* renamed from: h */
    public int f7924h;

    /* renamed from: i */
    public int f7925i;

    /* renamed from: j */
    public int f7926j;

    /* renamed from: k */
    public boolean f7927k;

    /* renamed from: l */
    public int f7928l;

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout$a */
    public static class C6959a {

        /* renamed from: a */
        public int f7929a;

        /* renamed from: b */
        public int f7930b;

        public C6959a(int i10, int i11) {
            this.f7929a = i10;
            this.f7930b = i11;
        }
    }

    private int getNextEdge() {
        int scrollY = getScrollY();
        int i10 = this.f7926j;
        if (i10 == 17) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                InterfaceC9245c interfaceC9245cM7019c = m7019c(childAt);
                C6959a c6959a = (C6959a) this.f7918b.get(childAt);
                int i12 = c6959a != null ? c6959a.f7929a : 0;
                if (i12 > scrollY && m7023g(childAt) && interfaceC9245cM7019c.mo7031a(1)) {
                    return i12;
                }
            }
        } else {
            if (i10 != 18) {
                throw new RuntimeException("#getNextEdge# unknown Fling Orientation");
            }
            for (int childCount2 = getChildCount() - 1; childCount2 >= 0; childCount2--) {
                View childAt2 = getChildAt(childCount2);
                InterfaceC9245c interfaceC9245cM7019c2 = m7019c(childAt2);
                C6959a c6959a2 = (C6959a) this.f7918b.get(childAt2);
                int i13 = c6959a2 != null ? c6959a2.f7929a : 0;
                if (i13 < scrollY && m7023g(childAt2) && interfaceC9245cM7019c2.mo7031a(-1)) {
                    return i13;
                }
            }
        }
        if (this.f7926j == 17) {
            return this.f7919c;
        }
        return 0;
    }

    /* renamed from: i */
    private void m7016i() {
        VelocityTracker velocityTracker = this.f7923g;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f7923g = null;
        }
    }

    /* renamed from: a */
    public final void m7017a() {
        View view;
        int scrollY = getScrollY();
        Iterator it = this.f7918b.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                view = null;
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            C6959a c6959a = (C6959a) entry.getValue();
            if (scrollY >= c6959a.f7929a && scrollY < c6959a.f7930b) {
                view = (View) entry.getKey();
                break;
            }
        }
        if (view == null) {
            return;
        }
        int iIndexOfChild = indexOfChild(view);
        AbstractC9363c.m17248b("ELinkageScrollLayout", "#checkTargetsScroll# index: " + iIndexOfChild);
        for (int i10 = 0; i10 < iIndexOfChild; i10++) {
            m7026k(getChildAt(i10));
        }
        while (true) {
            iIndexOfChild++;
            if (iIndexOfChild >= getChildCount()) {
                return;
            } else {
                m7027l(getChildAt(iIndexOfChild));
            }
        }
    }

    /* renamed from: b */
    public final boolean m7018b(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final InterfaceC9245c m7019c(View view) {
        return ((InterfaceC9244b) view).mo7030a();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f7921e.computeScrollOffset()) {
            m7028m(0, this.f7921e.getCurrY(), true);
            invalidate();
        }
        if (this.f7922f.computeScrollOffset()) {
            m7028m(0, this.f7922f.getCurrY(), false);
            invalidate();
            if (this.f7922f.isFinished()) {
                AbstractC9363c.m17248b("ELinkageScrollLayout", "#computeScroll#, LocScroll finished");
                m7017a();
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
        int iMo7032b = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            iMo7032b += ((InterfaceC9244b) getChildAt(i10)).mo7030a().mo7032b();
        }
        return iMo7032b + getScrollY();
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int iMo7034d = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            iMo7034d += ((InterfaceC9244b) getChildAt(i10)).mo7030a().mo7034d();
        }
        return iMo7034d;
    }

    /* renamed from: d */
    public final View m7020d(int i10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            C6959a c6959a = (C6959a) this.f7918b.get(childAt);
            if (c6959a != null && c6959a.f7929a == i10) {
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
        return m7018b(motionEvent);
    }

    /* renamed from: e */
    public final C6959a m7021e(View view) {
        return (C6959a) this.f7918b.get(view);
    }

    /* renamed from: f */
    public final View m7022f(float f10, float f11) {
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
    public final boolean m7023g(View view) {
        return m7019c(view).mo7036f() && view.getHeight() >= getHeight();
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f7917a.getNestedScrollAxes();
    }

    /* renamed from: h */
    public final void m7024h(float f10) {
        if (Math.abs(f10) > this.f7925i) {
            this.f7926j = f10 > 0.0f ? 17 : 18;
            this.f7921e.fling(0, getScrollY(), 1, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            invalidate();
        }
    }

    /* renamed from: j */
    public final void m7025j() {
        this.f7926j = 0;
        this.f7920d.abortAnimation();
        this.f7921e.abortAnimation();
        this.f7922f.abortAnimation();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final void m7026k(View view) {
        InterfaceC9245c interfaceC9245cMo7030a = ((InterfaceC9244b) view).mo7030a();
        if (interfaceC9245cMo7030a.mo7036f() && interfaceC9245cMo7030a.mo7031a(1)) {
            interfaceC9245cMo7030a.mo7033c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    public final void m7027l(View view) {
        InterfaceC9245c interfaceC9245cMo7030a = ((InterfaceC9244b) view).mo7030a();
        if (interfaceC9245cMo7030a.mo7036f() && interfaceC9245cMo7030a.mo7031a(-1)) {
            interfaceC9245cMo7030a.mo7037g();
        }
    }

    /* renamed from: m */
    public void m7028m(int i10, int i11, boolean z10) {
        awakenScrollBars();
        if (!z10) {
            scrollTo(i10, Math.min(Math.max(i11, 0), this.f7919c));
            return;
        }
        int iMin = Math.min(Math.max(i11, 0), this.f7919c);
        int nextEdge = getNextEdge();
        if (this.f7926j == 17) {
            iMin = Math.min(iMin, nextEdge);
        }
        if (this.f7926j == 18) {
            iMin = Math.max(iMin, nextEdge);
        }
        scrollTo(i10, iMin);
        if (getScrollY() == nextEdge) {
            int currVelocity = (int) this.f7921e.getCurrVelocity();
            int i12 = this.f7926j;
            if (i12 == 17 && currVelocity <= 0) {
                currVelocity = -currVelocity;
            }
            if (i12 == 18 && currVelocity >= 0) {
                currVelocity = -currVelocity;
            }
            AbstractC9363c.m17248b("ELinkageScrollLayout", "#scrollTo# To Edge: " + nextEdge + ", velocity: " + currVelocity);
            this.f7921e.abortAnimation();
            View viewM7020d = m7020d(nextEdge);
            m7019c(viewM7020d).mo7035e(viewM7020d, currVelocity);
            m7029n((float) currVelocity);
        }
    }

    /* renamed from: n */
    public final void m7029n(float f10) {
        this.f7920d.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
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
            if (!(childAt instanceof InterfaceC9244b)) {
                throw new RuntimeException("Child in LinkageScrollLayout must implement ILinkageScroll");
            }
            ((InterfaceC9244b) childAt).setChildLinkageEvent(null);
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
            r3.m7022f(r0, r4)
            r4 = 0
            throw r4
        L24:
            r3.f7927k = r1
            goto L2c
        L27:
            r3.f7927k = r1
            r3.m7017a()
        L2c:
            boolean r4 = r3.f7927k
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = 0;
        this.f7919c = 0;
        int childCount = getChildCount();
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            int measuredHeight = childAt.getMeasuredHeight() + i11;
            childAt.layout(i10, i11, i12, measuredHeight);
            this.f7919c += childAt.getHeight();
            this.f7918b.put(childAt, new C6959a(childAt.getTop(), childAt.getBottom()));
            i14++;
            i11 = measuredHeight;
        }
        this.f7919c -= getMeasuredHeight();
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
        AbstractC9363c.m17248b("ELinkageScrollLayout", "#onNestedPreFling# velocityY: " + f11);
        int scrollY = getScrollY();
        C6959a c6959aM7021e = m7021e(view);
        this.f7926j = f11 > 0.0f ? 17 : 18;
        if (scrollY == c6959aM7021e.f7929a) {
            m7029n(f11);
            return false;
        }
        m7024h(f11);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        AbstractC9363c.m17248b("ELinkageScrollLayout", "#onNestedPreScroll# dy: " + i11);
        boolean z10 = i11 > 0;
        int scrollY = getScrollY();
        C6959a c6959aM7021e = m7021e(view);
        InterfaceC9245c interfaceC9245cMo7030a = ((InterfaceC9244b) view).mo7030a();
        int i12 = c6959aM7021e.f7929a;
        if (scrollY == i12) {
            if ((!z10 && !interfaceC9245cMo7030a.mo7031a(-1)) || (z10 && !interfaceC9245cMo7030a.mo7031a(1))) {
                scrollBy(0, i11);
                iArr[1] = i11;
                return;
            } else {
                AbstractC9363c.m17248b("ELinkageScrollLayout", "#onNestedPreScroll#, handle scroll by " + view);
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
            int i14 = c6959aM7021e.f7929a;
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
            int i16 = c6959aM7021e.f7929a;
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
        AbstractC9363c.m17248b("ELinkageScrollLayout", "#onNestedScrollAccepted# axes: " + i10);
        this.f7917a.onNestedScrollAccepted(view, view2, i10);
        m7025j();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        AbstractC9363c.m17248b("ELinkageScrollLayout", "#onStartNestedScroll# nestedScrollAxes: " + i10);
        return (i10 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        AbstractC9363c.m17248b("ELinkageScrollLayout", "#onStopNestedScroll# child: " + view);
        this.f7917a.onStopNestedScroll(view);
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
            int r0 = r4.f7928l
            if (r0 != 0) goto L1d
            float r5 = r5.getY()
            int r5 = (int) r5
            r4.f7928l = r5
            return r1
        L1d:
            float r5 = r5.getY()
            int r5 = (int) r5
            int r0 = r4.f7928l
            int r0 = r5 - r0
            r4.f7928l = r5
            int r5 = -r0
            r4.scrollBy(r2, r5)
            goto L68
        L2d:
            r4.f7928l = r2
            android.view.VelocityTracker r5 = r4.f7923g
            if (r5 == 0) goto L68
            int r0 = r4.f7924h
            float r0 = (float) r0
            r2 = 1000(0x3e8, float:1.401E-42)
            r5.computeCurrentVelocity(r2, r0)
            android.view.VelocityTracker r5 = r4.f7923g
            float r5 = r5.getYVelocity()
            int r5 = (int) r5
            r4.m7016i()
            int r0 = -r5
            float r0 = (float) r0
            r4.m7024h(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "#dispatchTouchEvent# ACTION_UP, yVelocity: "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "ELinkageScrollLayout"
            p184n1.AbstractC9363c.m17248b(r0, r5)
            goto L68
        L61:
            float r5 = r5.getY()
            int r5 = (int) r5
            r4.f7928l = r5
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
            int i13 = this.f7919c;
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
