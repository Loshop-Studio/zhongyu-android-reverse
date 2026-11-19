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
import p113n2.InterfaceC7457b;
import p113n2.InterfaceC7458c;
import p133q1.AbstractC7620c;

/* loaded from: classes3.dex */
public class LinkageScrollLayout extends ViewGroup implements NestedScrollingParent {

    /* renamed from: a */
    public NestedScrollingParentHelper f5225a;

    /* renamed from: b */
    public HashMap f5226b;

    /* renamed from: c */
    public int f5227c;

    /* renamed from: d */
    public Scroller f5228d;

    /* renamed from: e */
    public Scroller f5229e;

    /* renamed from: f */
    public Scroller f5230f;

    /* renamed from: g */
    public VelocityTracker f5231g;

    /* renamed from: h */
    public int f5232h;

    /* renamed from: i */
    public int f5233i;

    /* renamed from: j */
    public int f5234j;

    /* renamed from: k */
    public boolean f5235k;

    /* renamed from: l */
    public int f5236l;

    /* renamed from: com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout$a */
    public static class C5932a {

        /* renamed from: a */
        public int f5237a;

        /* renamed from: b */
        public int f5238b;

        public C5932a(int i6, int i7) {
            this.f5237a = i6;
            this.f5238b = i7;
        }
    }

    private int getNextEdge() {
        int scrollY = getScrollY();
        int i6 = this.f5234j;
        if (i6 == 17) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                InterfaceC7458c interfaceC7458cM4844c = m4844c(childAt);
                C5932a c5932a = (C5932a) this.f5226b.get(childAt);
                int i8 = c5932a != null ? c5932a.f5237a : 0;
                if (i8 > scrollY && m4848g(childAt) && interfaceC7458cM4844c.mo4856a(1)) {
                    return i8;
                }
            }
        } else {
            if (i6 != 18) {
                throw new RuntimeException("#getNextEdge# unknown Fling Orientation");
            }
            for (int childCount2 = getChildCount() - 1; childCount2 >= 0; childCount2--) {
                View childAt2 = getChildAt(childCount2);
                InterfaceC7458c interfaceC7458cM4844c2 = m4844c(childAt2);
                C5932a c5932a2 = (C5932a) this.f5226b.get(childAt2);
                int i9 = c5932a2 != null ? c5932a2.f5237a : 0;
                if (i9 < scrollY && m4848g(childAt2) && interfaceC7458cM4844c2.mo4856a(-1)) {
                    return i9;
                }
            }
        }
        if (this.f5234j == 17) {
            return this.f5227c;
        }
        return 0;
    }

    /* renamed from: i */
    private void m4841i() {
        VelocityTracker velocityTracker = this.f5231g;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5231g = null;
        }
    }

    /* renamed from: a */
    public final void m4842a() {
        View view;
        int scrollY = getScrollY();
        Iterator it = this.f5226b.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                view = null;
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            C5932a c5932a = (C5932a) entry.getValue();
            if (scrollY >= c5932a.f5237a && scrollY < c5932a.f5238b) {
                view = (View) entry.getKey();
                break;
            }
        }
        if (view == null) {
            return;
        }
        int iIndexOfChild = indexOfChild(view);
        AbstractC7620c.m9060b("ELinkageScrollLayout", "#checkTargetsScroll# index: " + iIndexOfChild);
        for (int i6 = 0; i6 < iIndexOfChild; i6++) {
            m4851k(getChildAt(i6));
        }
        while (true) {
            iIndexOfChild++;
            if (iIndexOfChild >= getChildCount()) {
                return;
            } else {
                m4852l(getChildAt(iIndexOfChild));
            }
        }
    }

    /* renamed from: b */
    public final boolean m4843b(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final InterfaceC7458c m4844c(View view) {
        return ((InterfaceC7457b) view).mo4855a();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f5229e.computeScrollOffset()) {
            m4853m(0, this.f5229e.getCurrY(), true);
            invalidate();
        }
        if (this.f5230f.computeScrollOffset()) {
            m4853m(0, this.f5230f.getCurrY(), false);
            invalidate();
            if (this.f5230f.isFinished()) {
                AbstractC7620c.m9060b("ELinkageScrollLayout", "#computeScroll#, LocScroll finished");
                m4842a();
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
        int iMo4857b = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            iMo4857b += ((InterfaceC7457b) getChildAt(i6)).mo4855a().mo4857b();
        }
        return iMo4857b + getScrollY();
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int iMo4859d = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            iMo4859d += ((InterfaceC7457b) getChildAt(i6)).mo4855a().mo4859d();
        }
        return iMo4859d;
    }

    /* renamed from: d */
    public final View m4845d(int i6) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            C5932a c5932a = (C5932a) this.f5226b.get(childAt);
            if (c5932a != null && c5932a.f5237a == i6) {
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
        return m4843b(motionEvent);
    }

    /* renamed from: e */
    public final C5932a m4846e(View view) {
        return (C5932a) this.f5226b.get(view);
    }

    /* renamed from: f */
    public final View m4847f(float f6, float f7) {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int[] iArr = new int[2];
            childAt.getLocationOnScreen(iArr);
            if (new RectF(iArr[0], iArr[1], childAt.getWidth() + r5, childAt.getHeight() + r4).contains(f6, f7)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final boolean m4848g(View view) {
        return m4844c(view).mo4861f() && view.getHeight() >= getHeight();
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f5225a.getNestedScrollAxes();
    }

    /* renamed from: h */
    public final void m4849h(float f6) {
        if (Math.abs(f6) > this.f5233i) {
            this.f5234j = f6 > 0.0f ? 17 : 18;
            this.f5229e.fling(0, getScrollY(), 1, (int) f6, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            invalidate();
        }
    }

    /* renamed from: j */
    public final void m4850j() {
        this.f5234j = 0;
        this.f5228d.abortAnimation();
        this.f5229e.abortAnimation();
        this.f5230f.abortAnimation();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final void m4851k(View view) {
        InterfaceC7458c interfaceC7458cMo4855a = ((InterfaceC7457b) view).mo4855a();
        if (interfaceC7458cMo4855a.mo4861f() && interfaceC7458cMo4855a.mo4856a(1)) {
            interfaceC7458cMo4855a.mo4858c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    public final void m4852l(View view) {
        InterfaceC7458c interfaceC7458cMo4855a = ((InterfaceC7457b) view).mo4855a();
        if (interfaceC7458cMo4855a.mo4861f() && interfaceC7458cMo4855a.mo4856a(-1)) {
            interfaceC7458cMo4855a.mo4862g();
        }
    }

    /* renamed from: m */
    public void m4853m(int i6, int i7, boolean z6) {
        awakenScrollBars();
        if (!z6) {
            scrollTo(i6, Math.min(Math.max(i7, 0), this.f5227c));
            return;
        }
        int iMin = Math.min(Math.max(i7, 0), this.f5227c);
        int nextEdge = getNextEdge();
        if (this.f5234j == 17) {
            iMin = Math.min(iMin, nextEdge);
        }
        if (this.f5234j == 18) {
            iMin = Math.max(iMin, nextEdge);
        }
        scrollTo(i6, iMin);
        if (getScrollY() == nextEdge) {
            int currVelocity = (int) this.f5229e.getCurrVelocity();
            int i8 = this.f5234j;
            if (i8 == 17 && currVelocity <= 0) {
                currVelocity = -currVelocity;
            }
            if (i8 == 18 && currVelocity >= 0) {
                currVelocity = -currVelocity;
            }
            AbstractC7620c.m9060b("ELinkageScrollLayout", "#scrollTo# To Edge: " + nextEdge + ", velocity: " + currVelocity);
            this.f5229e.abortAnimation();
            View viewM4845d = m4845d(nextEdge);
            m4844c(viewM4845d).mo4860e(viewM4845d, currVelocity);
            m4854n((float) currVelocity);
        }
    }

    /* renamed from: n */
    public final void m4854n(float f6) {
        this.f5228d.fling(0, 0, 0, (int) f6, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            childAt.setVerticalScrollBarEnabled(false);
            childAt.setHorizontalScrollBarEnabled(false);
            if (!(childAt instanceof InterfaceC7457b)) {
                throw new RuntimeException("Child in LinkageScrollLayout must implement ILinkageScroll");
            }
            ((InterfaceC7457b) childAt).setChildLinkageEvent(null);
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
            r3.m4847f(r0, r4)
            r4 = 0
            throw r4
        L24:
            r3.f5235k = r1
            goto L2c
        L27:
            r3.f5235k = r1
            r3.m4842a()
        L2c:
            boolean r4 = r3.f5235k
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        int i10 = 0;
        this.f5227c = 0;
        int childCount = getChildCount();
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            int measuredHeight = childAt.getMeasuredHeight() + i7;
            childAt.layout(i6, i7, i8, measuredHeight);
            this.f5227c += childAt.getHeight();
            this.f5226b.put(childAt, new C5932a(childAt.getTop(), childAt.getBottom()));
            i10++;
            i7 = measuredHeight;
        }
        this.f5227c -= getMeasuredHeight();
    }

    @Override // android.view.View
    public void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            measureChild(getChildAt(i8), i6, i7);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f6, float f7, boolean z6) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f6, float f7) {
        AbstractC7620c.m9060b("ELinkageScrollLayout", "#onNestedPreFling# velocityY: " + f7);
        int scrollY = getScrollY();
        C5932a c5932aM4846e = m4846e(view);
        this.f5234j = f7 > 0.0f ? 17 : 18;
        if (scrollY == c5932aM4846e.f5237a) {
            m4854n(f7);
            return false;
        }
        m4849h(f7);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i6, int i7, int[] iArr) {
        AbstractC7620c.m9060b("ELinkageScrollLayout", "#onNestedPreScroll# dy: " + i7);
        boolean z6 = i7 > 0;
        int scrollY = getScrollY();
        C5932a c5932aM4846e = m4846e(view);
        InterfaceC7458c interfaceC7458cMo4855a = ((InterfaceC7457b) view).mo4855a();
        int i8 = c5932aM4846e.f5237a;
        if (scrollY == i8) {
            if ((!z6 && !interfaceC7458cMo4855a.mo4856a(-1)) || (z6 && !interfaceC7458cMo4855a.mo4856a(1))) {
                scrollBy(0, i7);
                iArr[1] = i7;
                return;
            } else {
                AbstractC7620c.m9060b("ELinkageScrollLayout", "#onNestedPreScroll#, handle scroll by " + view);
                return;
            }
        }
        if (scrollY > i8) {
            if (z6) {
                scrollBy(0, i7);
                iArr[1] = i7;
            }
            if (z6) {
                return;
            }
            int i9 = scrollY + i7;
            int i10 = c5932aM4846e.f5237a;
            if (i9 <= i10) {
                i7 = i10 - scrollY;
            }
            scrollBy(0, i7);
            iArr[1] = i7;
            return;
        }
        if (!z6) {
            scrollBy(0, i7);
            iArr[1] = i7;
        }
        if (z6) {
            int i11 = scrollY + i7;
            int i12 = c5932aM4846e.f5237a;
            if (i11 >= i12) {
                i7 = i12 - scrollY;
            }
            scrollBy(0, i7);
            iArr[1] = i7;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i6, int i7, int i8, int i9) {
        if (i7 == 0 || i9 == 0) {
            return;
        }
        scrollBy(0, i9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i6) {
        AbstractC7620c.m9060b("ELinkageScrollLayout", "#onNestedScrollAccepted# axes: " + i6);
        this.f5225a.onNestedScrollAccepted(view, view2, i6);
        m4850j();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i6) {
        AbstractC7620c.m9060b("ELinkageScrollLayout", "#onStartNestedScroll# nestedScrollAxes: " + i6);
        return (i6 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        AbstractC7620c.m9060b("ELinkageScrollLayout", "#onStopNestedScroll# child: " + view);
        this.f5225a.onStopNestedScroll(view);
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
            int r0 = r4.f5236l
            if (r0 != 0) goto L1d
            float r5 = r5.getY()
            int r5 = (int) r5
            r4.f5236l = r5
            return r1
        L1d:
            float r5 = r5.getY()
            int r5 = (int) r5
            int r0 = r4.f5236l
            int r0 = r5 - r0
            r4.f5236l = r5
            int r5 = -r0
            r4.scrollBy(r2, r5)
            goto L68
        L2d:
            r4.f5236l = r2
            android.view.VelocityTracker r5 = r4.f5231g
            if (r5 == 0) goto L68
            int r0 = r4.f5232h
            float r0 = (float) r0
            r2 = 1000(0x3e8, float:1.401E-42)
            r5.computeCurrentVelocity(r2, r0)
            android.view.VelocityTracker r5 = r4.f5231g
            float r5 = r5.getYVelocity()
            int r5 = (int) r5
            r4.m4841i()
            int r0 = -r5
            float r0 = (float) r0
            r4.m4849h(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "#dispatchTouchEvent# ACTION_UP, yVelocity: "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "ELinkageScrollLayout"
            p133q1.AbstractC7620c.m9060b(r0, r5)
            goto L68
        L61:
            float r5 = r5.getY()
            int r5 = (int) r5
            r4.f5236l = r5
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void scrollBy(int i6, int i7) {
        awakenScrollBars();
        int scrollY = getScrollY();
        if (i7 >= 0) {
            int i8 = scrollY + i7;
            int i9 = this.f5227c;
            if (i8 > i9) {
                i7 = i9 - scrollY;
            }
        } else if (scrollY + i7 < 0) {
            i7 = -scrollY;
        }
        if (i7 != 0) {
            super.scrollBy(i6, i7);
        }
    }
}
