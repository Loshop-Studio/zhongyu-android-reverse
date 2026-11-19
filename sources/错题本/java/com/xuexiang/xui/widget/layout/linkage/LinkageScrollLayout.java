package com.xuexiang.xui.widget.layout.linkage;

import android.content.Context;
import android.util.AttributeSet;
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
import java.util.Objects;
import p019b3.C3108d;
import p019b3.C3109e;
import p019b3.InterfaceC3106b;
import p019b3.InterfaceC3107c;
import p129o2.C6268a;

/* loaded from: classes3.dex */
public class LinkageScrollLayout extends ViewGroup implements NestedScrollingParent {

    /* renamed from: a */
    public final NestedScrollingParentHelper f4527a;

    /* renamed from: b */
    public final HashMap f4528b;

    /* renamed from: c */
    public int f4529c;

    /* renamed from: d */
    public final Scroller f4530d;

    /* renamed from: e */
    public final Scroller f4531e;

    /* renamed from: f */
    public final Scroller f4532f;

    /* renamed from: g */
    public VelocityTracker f4533g;

    /* renamed from: h */
    public final C3109e f4534h;

    /* renamed from: i */
    public final int f4535i;

    /* renamed from: j */
    public final int f4536j;

    /* renamed from: k */
    public int f4537k;

    /* renamed from: l */
    public boolean f4538l;

    /* renamed from: m */
    public int f4539m;

    /* renamed from: n */
    public final C6268a f4540n;

    public LinkageScrollLayout(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int getNextEdge() {
        int scrollY = getScrollY();
        int i = this.f4537k;
        HashMap map = this.f4528b;
        if (i == 17) {
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                InterfaceC3106b interfaceC3106b = (InterfaceC3106b) childAt;
                InterfaceC3107c interfaceC3107cMo2061a = interfaceC3106b.mo2061a();
                C3108d c3108d = (C3108d) map.get(childAt);
                int i9 = c3108d != null ? c3108d.f1543a : 0;
                if (i9 > scrollY && interfaceC3106b.mo2061a().mo2067t() && childAt.getHeight() >= getHeight() && interfaceC3107cMo2061a.mo2062e(1)) {
                    return i9;
                }
            }
        } else {
            if (i != 18) {
                throw new RuntimeException("#getNextEdge# unknown Fling Orientation");
            }
            for (int childCount2 = getChildCount() - 1; childCount2 >= 0; childCount2--) {
                View childAt2 = getChildAt(childCount2);
                InterfaceC3106b interfaceC3106b2 = (InterfaceC3106b) childAt2;
                InterfaceC3107c interfaceC3107cMo2061a2 = interfaceC3106b2.mo2061a();
                C3108d c3108d2 = (C3108d) map.get(childAt2);
                int i10 = c3108d2 != null ? c3108d2.f1543a : 0;
                if (i10 < scrollY && interfaceC3106b2.mo2061a().mo2067t() && childAt2.getHeight() >= getHeight() && interfaceC3107cMo2061a2.mo2062e(-1)) {
                    return i10;
                }
            }
        }
        if (this.f4537k == 17) {
            return this.f4529c;
        }
        return 0;
    }

    /* renamed from: b */
    public final void m3520b() {
        View view;
        int scrollY = getScrollY();
        Iterator it = this.f4528b.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                view = null;
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            C3108d c3108d = (C3108d) entry.getValue();
            if (scrollY >= c3108d.f1543a && scrollY < c3108d.f1544b) {
                view = (View) entry.getKey();
                break;
            }
        }
        if (view == null) {
            return;
        }
        int iIndexOfChild = indexOfChild(view);
        for (int i = 0; i < iIndexOfChild; i++) {
            InterfaceC3107c interfaceC3107cMo2061a = ((InterfaceC3106b) getChildAt(i)).mo2061a();
            if (interfaceC3107cMo2061a.mo2067t() && interfaceC3107cMo2061a.mo2062e(1)) {
                interfaceC3107cMo2061a.mo2064i();
            }
        }
        for (int i8 = iIndexOfChild + 1; i8 < getChildCount(); i8++) {
            InterfaceC3107c interfaceC3107cMo2061a2 = ((InterfaceC3106b) getChildAt(i8)).mo2061a();
            if (interfaceC3107cMo2061a2.mo2067t() && interfaceC3107cMo2061a2.mo2062e(-1)) {
                interfaceC3107cMo2061a2.mo2068v();
            }
        }
    }

    /* renamed from: c */
    public final void m3521c(float f) {
        if (Math.abs(f) > this.f4536j) {
            this.f4537k = f > 0.0f ? 17 : 18;
            this.f4531e.fling(0, getScrollY(), 1, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            invalidate();
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        Scroller scroller = this.f4531e;
        if (scroller.computeScrollOffset()) {
            m3522d(scroller.getCurrY(), true);
            invalidate();
        }
        Scroller scroller2 = this.f4532f;
        if (scroller2.computeScrollOffset()) {
            m3522d(scroller2.getCurrY(), false);
            invalidate();
            if (scroller2.isFinished()) {
                m3520b();
            }
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        int childCount = getChildCount();
        int iMo2063h = 0;
        for (int i = 0; i < childCount; i++) {
            iMo2063h += ((InterfaceC3106b) getChildAt(i)).mo2061a().mo2063h();
        }
        return getScrollY() + iMo2063h;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int iMo2066k = 0;
        for (int i = 0; i < childCount; i++) {
            iMo2066k += ((InterfaceC3106b) getChildAt(i)).mo2061a().mo2066k();
        }
        return iMo2066k;
    }

    /* renamed from: d */
    public final void m3522d(int i, boolean z8) {
        Object childAt;
        awakenScrollBars();
        int i8 = 0;
        if (!z8) {
            scrollTo(0, Math.min(Math.max(i, 0), this.f4529c));
            return;
        }
        int iMin = Math.min(Math.max(i, 0), this.f4529c);
        int nextEdge = getNextEdge();
        if (this.f4537k == 17) {
            iMin = Math.min(iMin, nextEdge);
        }
        if (this.f4537k == 18) {
            iMin = Math.max(iMin, nextEdge);
        }
        scrollTo(0, iMin);
        if (getScrollY() == nextEdge) {
            Scroller scroller = this.f4531e;
            int currVelocity = (int) scroller.getCurrVelocity();
            int i9 = this.f4537k;
            if (i9 == 17 && currVelocity <= 0) {
                currVelocity = -currVelocity;
            }
            if (i9 == 18 && currVelocity >= 0) {
                currVelocity = -currVelocity;
            }
            scroller.abortAnimation();
            int childCount = getChildCount();
            while (true) {
                if (i8 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = getChildAt(i8);
                C3108d c3108d = (C3108d) this.f4528b.get(childAt);
                if (c3108d != null && c3108d.f1543a == nextEdge) {
                    break;
                } else {
                    i8++;
                }
            }
            ((InterfaceC3106b) childAt).mo2061a().mo2065j(currVelocity);
            this.f4530d.fling(0, 0, 0, currVelocity, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            float r0 = r7.getX()
            float r1 = r7.getY()
            int r2 = r7.getAction()
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 0
            b3.e r4 = r6.f4534h
            if (r2 == 0) goto L38
            r5 = 1
            if (r2 == r5) goto L30
            r5 = 2
            if (r2 == r5) goto L1d
            r5 = 3
            if (r2 == r5) goto L30
            goto L66
        L1d:
            r4.m2069a(r0, r1)
            android.view.VelocityTracker r0 = r6.f4533g
            if (r0 != 0) goto L2a
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f4533g = r0
        L2a:
            android.view.VelocityTracker r0 = r6.f4533g
            r0.addMovement(r7)
            goto L66
        L30:
            r4.f1550f = r3
            android.graphics.PointF r2 = r4.f1547c
            r2.set(r0, r1)
            goto L66
        L38:
            android.graphics.PointF r2 = r4.f1545a
            r2.set(r0, r1)
            android.graphics.PointF r2 = r4.f1546b
            r2.set(r0, r1)
            r6.f4537k = r3
            android.widget.Scroller r0 = r6.f4530d
            r0.abortAnimation()
            android.widget.Scroller r0 = r6.f4531e
            r0.abortAnimation()
            android.widget.Scroller r0 = r6.f4532f
            r0.abortAnimation()
            android.view.VelocityTracker r0 = r6.f4533g
            if (r0 != 0) goto L5e
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f4533g = r0
            goto L61
        L5e:
            r0.clear()
        L61:
            android.view.VelocityTracker r0 = r6.f4533g
            r0.addMovement(r7)
        L66:
            boolean r7 = super.dispatchTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f4527a.getNestedScrollAxes();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            childAt.setVerticalScrollBarEnabled(false);
            childAt.setHorizontalScrollBarEnabled(false);
            if (!(childAt instanceof InterfaceC3106b)) {
                throw new RuntimeException("Child in LinkageScrollLayout must implement ILinkageScroll");
            }
            ((InterfaceC3106b) childAt).setChildLinkageEvent(this.f4540n);
            childAt.setOverScrollMode(2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.view.View] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            if (r0 == 0) goto L74
            r2 = 1
            if (r0 == r2) goto L71
            r3 = 2
            if (r0 == r3) goto L13
            r13 = 3
            if (r0 == r13) goto L71
            goto L79
        L13:
            float r0 = r13.getRawX()
            int r0 = (int) r0
            float r0 = (float) r0
            float r13 = r13.getRawY()
            int r13 = (int) r13
            float r13 = (float) r13
            int r4 = r12.getChildCount()
            r5 = r1
        L24:
            if (r5 >= r4) goto L50
            android.view.View r6 = r12.getChildAt(r5)
            int[] r7 = new int[r3]
            r6.getLocationOnScreen(r7)
            r8 = r7[r1]
            r7 = r7[r2]
            int r9 = r6.getWidth()
            int r9 = r9 + r8
            int r10 = r6.getHeight()
            int r10 = r10 + r7
            android.graphics.RectF r11 = new android.graphics.RectF
            float r8 = (float) r8
            float r7 = (float) r7
            float r9 = (float) r9
            float r10 = (float) r10
            r11.<init>(r8, r7, r9, r10)
            boolean r7 = r11.contains(r0, r13)
            if (r7 == 0) goto L4d
            goto L51
        L4d:
            int r5 = r5 + 1
            goto L24
        L50:
            r6 = 0
        L51:
            b3.e r13 = r12.f4534h
            boolean r13 = r13.f1550f
            if (r13 == 0) goto L79
            if (r6 == 0) goto L79
            b3.b r6 = (p019b3.InterfaceC3106b) r6
            b3.c r13 = r6.mo2061a()
            boolean r13 = r13.mo2067t()
            if (r13 != 0) goto L79
            r12.f4538l = r2
            android.view.ViewParent r13 = r12.getParent()
            if (r13 == 0) goto L79
            r13.requestDisallowInterceptTouchEvent(r2)
            goto L79
        L71:
            r12.f4538l = r1
            goto L79
        L74:
            r12.f4538l = r1
            r12.m3520b()
        L79:
            boolean r13 = r12.f4538l
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i8, int i9, int i10) {
        int i11 = 0;
        this.f4529c = 0;
        int childCount = getChildCount();
        while (i11 < childCount) {
            View childAt = getChildAt(i11);
            int measuredHeight = childAt.getMeasuredHeight() + i8;
            childAt.layout(i, i8, i9, measuredHeight);
            this.f4529c = childAt.getHeight() + this.f4529c;
            int top2 = childAt.getTop();
            int bottom = childAt.getBottom();
            C3108d c3108d = new C3108d();
            c3108d.f1543a = top2;
            c3108d.f1544b = bottom;
            this.f4528b.put(childAt, c3108d);
            i11++;
            i8 = measuredHeight;
        }
        this.f4529c -= getMeasuredHeight();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        super.onMeasure(i, i8);
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            measureChild(getChildAt(i9), i, i8);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedFling(View view, float f, float f7, boolean z8) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedPreFling(View view, float f, float f7) {
        int scrollY = getScrollY();
        C3108d c3108d = (C3108d) this.f4528b.get(view);
        this.f4537k = f7 > 0.0f ? 17 : 18;
        if (scrollY != c3108d.f1543a) {
            m3521c(f7);
            return true;
        }
        this.f4530d.fling(0, 0, 0, (int) f7, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        invalidate();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedPreScroll(View view, int i, int i8, int[] iArr) {
        boolean z8 = i8 > 0;
        int scrollY = getScrollY();
        C3108d c3108d = (C3108d) this.f4528b.get(view);
        InterfaceC3107c interfaceC3107cMo2061a = ((InterfaceC3106b) view).mo2061a();
        int i9 = c3108d.f1543a;
        if (scrollY == i9) {
            if ((z8 || interfaceC3107cMo2061a.mo2062e(-1)) && (!z8 || interfaceC3107cMo2061a.mo2062e(1))) {
                Objects.toString(view);
                return;
            } else {
                scrollBy(0, i8);
                iArr[1] = i8;
                return;
            }
        }
        if (scrollY > i9) {
            if (z8) {
                scrollBy(0, i8);
                iArr[1] = i8;
            }
            if (z8) {
                return;
            }
            if (scrollY + i8 <= i9) {
                i8 = i9 - scrollY;
            }
            scrollBy(0, i8);
            iArr[1] = i8;
            return;
        }
        if (!z8) {
            scrollBy(0, i8);
            iArr[1] = i8;
        }
        if (z8) {
            if (scrollY + i8 >= i9) {
                i8 = i9 - scrollY;
            }
            scrollBy(0, i8);
            iArr[1] = i8;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedScroll(View view, int i, int i8, int i9, int i10) {
        if (i8 == 0 || i10 == 0) {
            return;
        }
        scrollBy(0, i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f4527a.onNestedScrollAccepted(view, view2, i);
        this.f4537k = 0;
        this.f4530d.abortAnimation();
        this.f4531e.abortAnimation();
        this.f4532f.abortAnimation();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onStopNestedScroll(View view) {
        Objects.toString(view);
        this.f4527a.onStopNestedScroll(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getAction()
            r1 = 1
            if (r0 == 0) goto L52
            r2 = 0
            if (r0 == r1) goto L2d
            r3 = 2
            if (r0 == r3) goto L11
            r5 = 3
            if (r0 == r5) goto L2d
            goto L59
        L11:
            int r0 = r4.f4539m
            if (r0 != 0) goto L1d
            float r5 = r5.getY()
            int r5 = (int) r5
            r4.f4539m = r5
            return r1
        L1d:
            float r5 = r5.getY()
            int r5 = (int) r5
            int r0 = r4.f4539m
            int r0 = r5 - r0
            r4.f4539m = r5
            int r5 = -r0
            r4.scrollBy(r2, r5)
            goto L59
        L2d:
            r4.f4539m = r2
            android.view.VelocityTracker r5 = r4.f4533g
            if (r5 == 0) goto L59
            int r0 = r4.f4535i
            float r0 = (float) r0
            r2 = 1000(0x3e8, float:1.401E-42)
            r5.computeCurrentVelocity(r2, r0)
            android.view.VelocityTracker r5 = r4.f4533g
            float r5 = r5.getYVelocity()
            int r5 = (int) r5
            android.view.VelocityTracker r0 = r4.f4533g
            if (r0 == 0) goto L4c
            r0.recycle()
            r0 = 0
            r4.f4533g = r0
        L4c:
            int r5 = -r5
            float r5 = (float) r5
            r4.m3521c(r5)
            goto L59
        L52:
            float r5 = r5.getY()
            int r5 = (int) r5
            r4.f4539m = r5
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i8) {
        awakenScrollBars();
        int scrollY = getScrollY();
        if (i8 >= 0) {
            int i9 = scrollY + i8;
            int i10 = this.f4529c;
            if (i9 > i10) {
                i8 = i10 - scrollY;
            }
        } else if (scrollY + i8 < 0) {
            i8 = -scrollY;
        }
        if (i8 != 0) {
            super.scrollBy(i, i8);
        }
    }

    public LinkageScrollLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public LinkageScrollLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4528b = new HashMap();
        this.f4537k = 0;
        this.f4540n = new C6268a(this, 2);
        this.f4527a = new NestedScrollingParentHelper(this);
        this.f4531e = new Scroller(getContext());
        this.f4532f = new Scroller(getContext());
        this.f4530d = new Scroller(getContext());
        C3109e c3109e = new C3109e();
        this.f4534h = c3109e;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4535i = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f4536j = viewConfiguration.getScaledMinimumFlingVelocity();
        c3109e.f1549e = viewConfiguration.getScaledTouchSlop();
        setWillNotDraw(false);
        setVerticalScrollBarEnabled(true);
    }
}
