package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.p005b.p006c.C0033s;
import p000a.p005b.p012g.C0046g;
import p000a.p005b.p012g.p013i.InterfaceC0060m;
import p000a.p005b.p014h.InterfaceC0068a0;
import p000a.p005b.p014h.InterfaceC0119z;
import p000a.p031h.p035d.C0203b;
import p000a.p031h.p043j.C0261j;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p031h.p043j.C0277z;
import p000a.p031h.p043j.InterfaceC0259h;
import p000a.p031h.p043j.InterfaceC0260i;
import p070b.p071a.p072a.p073a.C0561a;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0119z, InterfaceC0259h, InterfaceC0260i {

    /* renamed from: G */
    public static final int[] f2792G = {C1088R.attr.actionBarSize, R.attr.windowContentOverlay};

    /* renamed from: A */
    public OverScroller f2793A;

    /* renamed from: B */
    public ViewPropertyAnimator f2794B;

    /* renamed from: C */
    public final AnimatorListenerAdapter f2795C;

    /* renamed from: D */
    public final Runnable f2796D;

    /* renamed from: E */
    public final Runnable f2797E;

    /* renamed from: F */
    public final C0261j f2798F;

    /* renamed from: b */
    public int f2799b;

    /* renamed from: c */
    public int f2800c;

    /* renamed from: d */
    public ContentFrameLayout f2801d;

    /* renamed from: e */
    public ActionBarContainer f2802e;

    /* renamed from: f */
    public InterfaceC0068a0 f2803f;

    /* renamed from: g */
    public Drawable f2804g;

    /* renamed from: h */
    public boolean f2805h;

    /* renamed from: i */
    public boolean f2806i;

    /* renamed from: j */
    public boolean f2807j;

    /* renamed from: k */
    public boolean f2808k;

    /* renamed from: l */
    public boolean f2809l;

    /* renamed from: m */
    public int f2810m;

    /* renamed from: n */
    public int f2811n;

    /* renamed from: o */
    public final Rect f2812o;

    /* renamed from: p */
    public final Rect f2813p;

    /* renamed from: q */
    public final Rect f2814q;

    /* renamed from: r */
    public final Rect f2815r;

    /* renamed from: s */
    public final Rect f2816s;

    /* renamed from: t */
    public final Rect f2817t;

    /* renamed from: u */
    public final Rect f2818u;

    /* renamed from: v */
    public C0277z f2819v;

    /* renamed from: w */
    public C0277z f2820w;

    /* renamed from: x */
    public C0277z f2821x;

    /* renamed from: y */
    public C0277z f2822y;

    /* renamed from: z */
    public InterfaceC0466d f2823z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    public class C0463a extends AnimatorListenerAdapter {
        public C0463a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f2794B = null;
            actionBarOverlayLayout.f2809l = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f2794B = null;
            actionBarOverlayLayout.f2809l = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    public class RunnableC0464b implements Runnable {
        public RunnableC0464b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m1575q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f2794B = actionBarOverlayLayout.f2802e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f2795C);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    public class RunnableC0465c implements Runnable {
        public RunnableC0465c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m1575q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f2794B = actionBarOverlayLayout.f2802e.animate().translationY(-ActionBarOverlayLayout.this.f2802e.getHeight()).setListener(ActionBarOverlayLayout.this.f2795C);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface InterfaceC0466d {
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0467e extends ViewGroup.MarginLayoutParams {
        public C0467e(int i, int i2) {
            super(i, i2);
        }

        public C0467e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0467e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2800c = 0;
        this.f2812o = new Rect();
        this.f2813p = new Rect();
        this.f2814q = new Rect();
        this.f2815r = new Rect();
        this.f2816s = new Rect();
        this.f2817t = new Rect();
        this.f2818u = new Rect();
        C0277z c0277z = C0277z.f1638b;
        this.f2819v = c0277z;
        this.f2820w = c0277z;
        this.f2821x = c0277z;
        this.f2822y = c0277z;
        this.f2795C = new C0463a();
        this.f2796D = new RunnableC0464b();
        this.f2797E = new RunnableC0465c();
        m1576r(context);
        this.f2798F = new C0261j();
    }

    @Override // p000a.p005b.p014h.InterfaceC0119z
    /* renamed from: a */
    public boolean mo451a() {
        m1577s();
        return this.f2803f.mo258a();
    }

    @Override // p000a.p005b.p014h.InterfaceC0119z
    /* renamed from: b */
    public void mo452b(Menu menu, InterfaceC0060m.a aVar) {
        m1577s();
        this.f2803f.mo259b(menu, aVar);
    }

    @Override // p000a.p005b.p014h.InterfaceC0119z
    /* renamed from: c */
    public boolean mo453c() {
        m1577s();
        return this.f2803f.mo260c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0467e;
    }

    @Override // p000a.p005b.p014h.InterfaceC0119z
    /* renamed from: d */
    public void mo454d() {
        m1577s();
        this.f2803f.mo261d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f2804g == null || this.f2805h) {
            return;
        }
        if (this.f2802e.getVisibility() == 0) {
            translationY = (int) (this.f2802e.getTranslationY() + this.f2802e.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.f2804g.setBounds(0, translationY, getWidth(), this.f2804g.getIntrinsicHeight() + translationY);
        this.f2804g.draw(canvas);
    }

    @Override // p000a.p005b.p014h.InterfaceC0119z
    /* renamed from: e */
    public boolean mo455e() {
        m1577s();
        return this.f2803f.mo262e();
    }

    @Override // p000a.p005b.p014h.InterfaceC0119z
    /* renamed from: f */
    public boolean mo456f() {
        m1577s();
        return this.f2803f.mo263f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // p000a.p005b.p014h.InterfaceC0119z
    /* renamed from: g */
    public boolean mo457g() {
        m1577s();
        return this.f2803f.mo264g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0467e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0467e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0467e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f2802e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f2798F.m858a();
    }

    public CharSequence getTitle() {
        m1577s();
        return this.f2803f.getTitle();
    }

    @Override // p000a.p005b.p014h.InterfaceC0119z
    /* renamed from: h */
    public void mo458h(int i) {
        m1577s();
        if (i == 2) {
            this.f2803f.mo269l();
        } else if (i == 5) {
            this.f2803f.mo275r();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // p000a.p031h.p043j.InterfaceC0259h
    /* renamed from: i */
    public void mo852i(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // p000a.p005b.p014h.InterfaceC0119z
    /* renamed from: j */
    public void mo459j() {
        m1577s();
        this.f2803f.mo265h();
    }

    @Override // p000a.p031h.p043j.InterfaceC0260i
    /* renamed from: k */
    public void mo857k(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // p000a.p031h.p043j.InterfaceC0259h
    /* renamed from: l */
    public void mo853l(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // p000a.p031h.p043j.InterfaceC0259h
    /* renamed from: m */
    public void mo854m(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p000a.p031h.p043j.InterfaceC0259h
    /* renamed from: n */
    public void mo855n(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // p000a.p031h.p043j.InterfaceC0259h
    /* renamed from: o */
    public boolean mo856o(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m1577s();
        C0277z c0277zM895j = C0277z.m895j(windowInsets, this);
        boolean zM1574p = m1574p(this.f2802e, new Rect(c0277zM895j.m897b(), c0277zM895j.m899d(), c0277zM895j.m898c(), c0277zM895j.m896a()), true, true, false, true);
        Rect rect = this.f2812o;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        WindowInsets windowInsetsM902h = c0277zM895j.m902h();
        if (windowInsetsM902h != null) {
            C0277z.m895j(computeSystemWindowInsets(windowInsetsM902h, rect), this);
        } else {
            rect.setEmpty();
        }
        Rect rect2 = this.f2812o;
        C0277z c0277zMo908i = c0277zM895j.f1639a.mo908i(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.f2819v = c0277zMo908i;
        boolean z = true;
        if (!this.f2820w.equals(c0277zMo908i)) {
            this.f2820w = this.f2819v;
            zM1574p = true;
        }
        if (this.f2813p.equals(this.f2812o)) {
            z = zM1574p;
        } else {
            this.f2813p.set(this.f2812o);
        }
        if (z) {
            requestLayout();
        }
        return c0277zM895j.f1639a.mo917a().f1639a.mo913c().f1639a.mo912b().m902h();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1576r(getContext());
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1575q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0467e c0467e = (C0467e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0467e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0467e).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        C0277z c0277zMo903a;
        m1577s();
        measureChildWithMargins(this.f2802e, i, 0, i2, 0);
        C0467e c0467e = (C0467e) this.f2802e.getLayoutParams();
        int iMax = Math.max(0, this.f2802e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0467e).leftMargin + ((ViewGroup.MarginLayoutParams) c0467e).rightMargin);
        int iMax2 = Math.max(0, this.f2802e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0467e).topMargin + ((ViewGroup.MarginLayoutParams) c0467e).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f2802e.getMeasuredState());
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.f2799b;
            if (this.f2807j && this.f2802e.getTabContainer() != null) {
                measuredHeight += this.f2799b;
            }
        } else {
            measuredHeight = this.f2802e.getVisibility() != 8 ? this.f2802e.getMeasuredHeight() : 0;
        }
        this.f2814q.set(this.f2812o);
        C0277z c0277z = this.f2819v;
        this.f2821x = c0277z;
        if (this.f2806i || z) {
            C0203b c0203bM758a = C0203b.m758a(c0277z.m897b(), this.f2821x.m899d() + measuredHeight, this.f2821x.m898c(), this.f2821x.m896a() + 0);
            C0277z c0277z2 = this.f2821x;
            int i3 = Build.VERSION.SDK_INT;
            C0277z.d cVar = i3 >= 30 ? new C0277z.c(c0277z2) : i3 >= 29 ? new C0277z.b(c0277z2) : new C0277z.a(c0277z2);
            cVar.mo905c(c0203bM758a);
            c0277zMo903a = cVar.mo903a();
        } else {
            Rect rect = this.f2814q;
            rect.top += measuredHeight;
            rect.bottom += 0;
            c0277zMo903a = c0277z.f1639a.mo908i(0, measuredHeight, 0, 0);
        }
        this.f2821x = c0277zMo903a;
        m1574p(this.f2801d, this.f2814q, true, true, true, true);
        if (!this.f2822y.equals(this.f2821x)) {
            C0277z c0277z3 = this.f2821x;
            this.f2822y = c0277z3;
            C0266o.m863b(this.f2801d, c0277z3);
        }
        measureChildWithMargins(this.f2801d, i, 0, i2, 0);
        C0467e c0467e2 = (C0467e) this.f2801d.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f2801d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0467e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0467e2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f2801d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0467e2).topMargin + ((ViewGroup.MarginLayoutParams) c0467e2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f2801d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (!this.f2808k || !z) {
            return false;
        }
        this.f2793A.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f2793A.getFinalY() > this.f2802e.getHeight()) {
            m1575q();
            this.f2797E.run();
        } else {
            m1575q();
            this.f2796D.run();
        }
        this.f2809l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f2810m + i2;
        this.f2810m = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        C0033s c0033s;
        C0046g c0046g;
        this.f2798F.f1611a = i;
        this.f2810m = getActionBarHideOffset();
        m1575q();
        InterfaceC0466d interfaceC0466d = this.f2823z;
        if (interfaceC0466d == null || (c0046g = (c0033s = (C0033s) interfaceC0466d).f197t) == null) {
            return;
        }
        c0046g.m161a();
        c0033s.f197t = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f2802e.getVisibility() != 0) {
            return false;
        }
        return this.f2808k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f2808k && !this.f2809l) {
            if (this.f2810m <= this.f2802e.getHeight()) {
                m1575q();
                postDelayed(this.f2796D, 600L);
            } else {
                m1575q();
                postDelayed(this.f2797E, 600L);
            }
        }
        InterfaceC0466d interfaceC0466d = this.f2823z;
        if (interfaceC0466d != null) {
            Objects.requireNonNull((C0033s) interfaceC0466d);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m1577s();
        int i2 = this.f2811n ^ i;
        this.f2811n = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC0466d interfaceC0466d = this.f2823z;
        if (interfaceC0466d != null) {
            ((C0033s) interfaceC0466d).f193p = !z2;
            if (z || !z2) {
                C0033s c0033s = (C0033s) interfaceC0466d;
                if (c0033s.f194q) {
                    c0033s.f194q = false;
                    c0033s.m114g(true);
                }
            } else {
                C0033s c0033s2 = (C0033s) interfaceC0466d;
                if (!c0033s2.f194q) {
                    c0033s2.f194q = true;
                    c0033s2.m114g(true);
                }
            }
        }
        if ((i2 & 256) == 0 || this.f2823z == null) {
            return;
        }
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f2800c = i;
        InterfaceC0466d interfaceC0466d = this.f2823z;
        if (interfaceC0466d != null) {
            ((C0033s) interfaceC0466d).f192o = i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1574p(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0467e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.m1574p(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* renamed from: q */
    public void m1575q() {
        removeCallbacks(this.f2796D);
        removeCallbacks(this.f2797E);
        ViewPropertyAnimator viewPropertyAnimator = this.f2794B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: r */
    public final void m1576r(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f2792G);
        this.f2799b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f2804g = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f2805h = context.getApplicationInfo().targetSdkVersion < 19;
        this.f2793A = new OverScroller(context);
    }

    /* renamed from: s */
    public void m1577s() {
        InterfaceC0068a0 wrapper;
        if (this.f2801d == null) {
            this.f2801d = (ContentFrameLayout) findViewById(C1088R.id.action_bar_activity_content);
            this.f2802e = (ActionBarContainer) findViewById(C1088R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(C1088R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC0068a0) {
                wrapper = (InterfaceC0068a0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    StringBuilder sbM2079g = C0561a.m2079g("Can't make a decor toolbar out of ");
                    sbM2079g.append(callbackFindViewById.getClass().getSimpleName());
                    throw new IllegalStateException(sbM2079g.toString());
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f2803f = wrapper;
        }
    }

    public void setActionBarHideOffset(int i) {
        m1575q();
        this.f2802e.setTranslationY(-Math.max(0, Math.min(i, this.f2802e.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0466d interfaceC0466d) {
        this.f2823z = interfaceC0466d;
        if (getWindowToken() != null) {
            ((C0033s) this.f2823z).f192o = this.f2800c;
            int i = this.f2811n;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f2807j = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f2808k) {
            this.f2808k = z;
            if (z) {
                return;
            }
            m1575q();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m1577s();
        this.f2803f.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        m1577s();
        this.f2803f.setIcon(drawable);
    }

    public void setLogo(int i) {
        m1577s();
        this.f2803f.mo271n(i);
    }

    public void setOverlayMode(boolean z) {
        this.f2806i = z;
        this.f2805h = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // p000a.p005b.p014h.InterfaceC0119z
    public void setWindowCallback(Window.Callback callback) {
        m1577s();
        this.f2803f.setWindowCallback(callback);
    }

    @Override // p000a.p005b.p014h.InterfaceC0119z
    public void setWindowTitle(CharSequence charSequence) {
        m1577s();
        this.f2803f.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
