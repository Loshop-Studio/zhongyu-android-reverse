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
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.InterfaceC0131m;
import androidx.core.view.C0340c0;
import androidx.core.view.C0352o;
import androidx.core.view.C0358u;
import androidx.core.view.InterfaceC0350m;
import androidx.core.view.InterfaceC0351n;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import p015c.C1038a;
import p015c.C1043f;
import p152t.C3386e;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0229o, InterfaceC0350m, InterfaceC0351n {

    /* renamed from: F */
    static final int[] f721F = {C1038a.f5738b, R.attr.windowContentOverlay};

    /* renamed from: A */
    ViewPropertyAnimator f722A;

    /* renamed from: B */
    final AnimatorListenerAdapter f723B;

    /* renamed from: C */
    private final Runnable f724C;

    /* renamed from: D */
    private final Runnable f725D;

    /* renamed from: E */
    private final C0352o f726E;

    /* renamed from: a */
    private int f727a;

    /* renamed from: b */
    private int f728b;

    /* renamed from: c */
    private ContentFrameLayout f729c;

    /* renamed from: d */
    ActionBarContainer f730d;

    /* renamed from: e */
    private InterfaceC0230p f731e;

    /* renamed from: f */
    private Drawable f732f;

    /* renamed from: g */
    private boolean f733g;

    /* renamed from: h */
    private boolean f734h;

    /* renamed from: i */
    private boolean f735i;

    /* renamed from: j */
    private boolean f736j;

    /* renamed from: k */
    boolean f737k;

    /* renamed from: l */
    private int f738l;

    /* renamed from: m */
    private int f739m;

    /* renamed from: n */
    private final Rect f740n;

    /* renamed from: o */
    private final Rect f741o;

    /* renamed from: p */
    private final Rect f742p;

    /* renamed from: q */
    private final Rect f743q;

    /* renamed from: r */
    private final Rect f744r;

    /* renamed from: s */
    private final Rect f745s;

    /* renamed from: t */
    private final Rect f746t;

    /* renamed from: u */
    private C0340c0 f747u;

    /* renamed from: v */
    private C0340c0 f748v;

    /* renamed from: w */
    private C0340c0 f749w;

    /* renamed from: x */
    private C0340c0 f750x;

    /* renamed from: y */
    private InterfaceC0142d f751y;

    /* renamed from: z */
    private OverScroller f752z;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    class C0139a extends AnimatorListenerAdapter {
        C0139a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f722A = null;
            actionBarOverlayLayout.f737k = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f722A = null;
            actionBarOverlayLayout.f737k = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    class RunnableC0140b implements Runnable {
        RunnableC0140b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m562o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f722A = actionBarOverlayLayout.f730d.animate().translationY(IGoodView.DEFAULT_TO_ALPHA).setListener(ActionBarOverlayLayout.this.f723B);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    class RunnableC0141c implements Runnable {
        RunnableC0141c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m562o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f722A = actionBarOverlayLayout.f730d.animate().translationY(-ActionBarOverlayLayout.this.f730d.getHeight()).setListener(ActionBarOverlayLayout.this.f723B);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface InterfaceC0142d {
        /* renamed from: a */
        void mo316a();

        /* renamed from: b */
        void mo317b();

        /* renamed from: c */
        void mo318c(int i4);

        /* renamed from: d */
        void mo319d();

        /* renamed from: e */
        void mo320e(boolean z3);

        /* renamed from: f */
        void mo321f();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f728b = 0;
        this.f740n = new Rect();
        this.f741o = new Rect();
        this.f742p = new Rect();
        this.f743q = new Rect();
        this.f744r = new Rect();
        this.f745s = new Rect();
        this.f746t = new Rect();
        C0340c0 c0340c0 = C0340c0.f2699b;
        this.f747u = c0340c0;
        this.f748v = c0340c0;
        this.f749w = c0340c0;
        this.f750x = c0340c0;
        this.f723B = new C0139a();
        this.f724C = new RunnableC0140b();
        this.f725D = new RunnableC0141c();
        m546p(context);
        this.f726E = new C0352o(this);
    }

    /* renamed from: j */
    private void m543j() {
        m562o();
        this.f725D.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m544k(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.m544k(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    private InterfaceC0230p m545n(View view) {
        if (view instanceof InterfaceC0230p) {
            return (InterfaceC0230p) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: p */
    private void m546p(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f721F);
        this.f727a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f732f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f733g = context.getApplicationInfo().targetSdkVersion < 19;
        this.f752z = new OverScroller(context);
    }

    /* renamed from: r */
    private void m547r() {
        m562o();
        postDelayed(this.f725D, 600L);
    }

    /* renamed from: s */
    private void m548s() {
        m562o();
        postDelayed(this.f724C, 600L);
    }

    /* renamed from: u */
    private void m549u() {
        m562o();
        this.f724C.run();
    }

    /* renamed from: v */
    private boolean m550v(float f4) {
        this.f752z.fling(0, 0, 0, (int) f4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f752z.getFinalY() > this.f730d.getHeight();
    }

    @Override // androidx.appcompat.widget.InterfaceC0229o
    /* renamed from: a */
    public void mo551a(Menu menu, InterfaceC0131m.a aVar) {
        m564t();
        this.f731e.mo856a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.InterfaceC0229o
    /* renamed from: b */
    public boolean mo552b() {
        m564t();
        return this.f731e.mo857b();
    }

    @Override // androidx.appcompat.widget.InterfaceC0229o
    /* renamed from: c */
    public void mo553c() {
        m564t();
        this.f731e.mo858c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.appcompat.widget.InterfaceC0229o
    /* renamed from: d */
    public boolean mo554d() {
        m564t();
        return this.f731e.mo859d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f732f == null || this.f733g) {
            return;
        }
        int bottom = this.f730d.getVisibility() == 0 ? (int) (this.f730d.getBottom() + this.f730d.getTranslationY() + 0.5f) : 0;
        this.f732f.setBounds(0, bottom, getWidth(), this.f732f.getIntrinsicHeight() + bottom);
        this.f732f.draw(canvas);
    }

    @Override // androidx.appcompat.widget.InterfaceC0229o
    /* renamed from: e */
    public boolean mo555e() {
        m564t();
        return this.f731e.mo860e();
    }

    @Override // androidx.appcompat.widget.InterfaceC0229o
    /* renamed from: f */
    public boolean mo556f() {
        m564t();
        return this.f731e.mo861f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.InterfaceC0229o
    /* renamed from: g */
    public boolean mo557g() {
        m564t();
        return this.f731e.mo862g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f730d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f726E.m1968a();
    }

    public CharSequence getTitle() {
        m564t();
        return this.f731e.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC0229o
    /* renamed from: h */
    public void mo558h(int i4) {
        m564t();
        if (i4 == 2) {
            this.f731e.mo875t();
        } else if (i4 == 5) {
            this.f731e.mo876u();
        } else {
            if (i4 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0229o
    /* renamed from: i */
    public void mo559i() {
        m564t();
        this.f731e.mo863h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: o */
    void m562o() {
        removeCallbacks(this.f724C);
        removeCallbacks(this.f725D);
        ViewPropertyAnimator viewPropertyAnimator = this.f722A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m564t();
        C0340c0 c0340c0M1862x = C0340c0.m1862x(windowInsets, this);
        boolean zM544k = m544k(this.f730d, new Rect(c0340c0M1862x.m1872j(), c0340c0M1862x.m1874l(), c0340c0M1862x.m1873k(), c0340c0M1862x.m1871i()), true, true, false, true);
        C0358u.m2028f(this, c0340c0M1862x, this.f740n);
        Rect rect = this.f740n;
        C0340c0 c0340c0M1876n = c0340c0M1862x.m1876n(rect.left, rect.top, rect.right, rect.bottom);
        this.f747u = c0340c0M1876n;
        boolean z3 = true;
        if (!this.f748v.equals(c0340c0M1876n)) {
            this.f748v = this.f747u;
            zM544k = true;
        }
        if (this.f741o.equals(this.f740n)) {
            z3 = zM544k;
        } else {
            this.f741o.set(this.f740n);
        }
        if (z3) {
            requestLayout();
        }
        return c0340c0M1862x.m1863a().m1865c().m1864b().m1883v();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m546p(getContext());
        C0358u.m2045n0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m562o();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i10 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                childAt.layout(i9, i10, measuredWidth + i9, measuredHeight + i10);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int measuredHeight;
        m564t();
        measureChildWithMargins(this.f730d, i4, 0, i5, 0);
        LayoutParams layoutParams = (LayoutParams) this.f730d.getLayoutParams();
        int iMax = Math.max(0, this.f730d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
        int iMax2 = Math.max(0, this.f730d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f730d.getMeasuredState());
        boolean z3 = (C0358u.m2006O(this) & 256) != 0;
        if (z3) {
            measuredHeight = this.f727a;
            if (this.f735i && this.f730d.getTabContainer() != null) {
                measuredHeight += this.f727a;
            }
        } else {
            measuredHeight = this.f730d.getVisibility() != 8 ? this.f730d.getMeasuredHeight() : 0;
        }
        this.f742p.set(this.f740n);
        C0340c0 c0340c0 = this.f747u;
        this.f749w = c0340c0;
        if (this.f734h || z3) {
            this.f749w = new C0340c0.b(this.f749w).m1887c(C3386e.m10305b(c0340c0.m1872j(), this.f749w.m1874l() + measuredHeight, this.f749w.m1873k(), this.f749w.m1871i() + 0)).m1885a();
        } else {
            Rect rect = this.f742p;
            rect.top += measuredHeight;
            rect.bottom += 0;
            this.f749w = c0340c0.m1876n(0, measuredHeight, 0, 0);
        }
        m544k(this.f729c, this.f742p, true, true, true, true);
        if (!this.f750x.equals(this.f749w)) {
            C0340c0 c0340c02 = this.f749w;
            this.f750x = c0340c02;
            C0358u.m2030g(this.f729c, c0340c02);
        }
        measureChildWithMargins(this.f729c, i4, 0, i5, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f729c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f729c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f729c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f729c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i4, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i5, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f4, float f5, boolean z3) {
        if (!this.f736j || !z3) {
            return false;
        }
        if (m550v(f5)) {
            m543j();
        } else {
            m549u();
        }
        this.f737k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f4, float f5) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
    }

    @Override // androidx.core.view.InterfaceC0350m
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr, int i6) {
        if (i6 == 0) {
            onNestedPreScroll(view, i4, i5, iArr);
        }
    }

    @Override // androidx.core.view.InterfaceC0351n
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        onNestedScroll(view, i4, i5, i6, i7, i8);
    }

    @Override // androidx.core.view.InterfaceC0350m
    public void onNestedScrollAccepted(View view, View view2, int i4, int i5) {
        if (i5 == 0) {
            onNestedScrollAccepted(view, view2, i4);
        }
    }

    @Override // androidx.core.view.InterfaceC0350m
    public boolean onStartNestedScroll(View view, View view2, int i4, int i5) {
        return i5 == 0 && onStartNestedScroll(view, view2, i4);
    }

    @Override // androidx.core.view.InterfaceC0350m
    public void onStopNestedScroll(View view, int i4) {
        if (i4 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i4) {
        super.onWindowSystemUiVisibilityChanged(i4);
        m564t();
        int i5 = this.f739m ^ i4;
        this.f739m = i4;
        boolean z3 = (i4 & 4) == 0;
        boolean z4 = (i4 & 256) != 0;
        InterfaceC0142d interfaceC0142d = this.f751y;
        if (interfaceC0142d != null) {
            interfaceC0142d.mo320e(!z4);
            if (z3 || !z4) {
                this.f751y.mo316a();
            } else {
                this.f751y.mo321f();
            }
        }
        if ((i5 & 256) == 0 || this.f751y == null) {
            return;
        }
        C0358u.m2045n0(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        this.f728b = i4;
        InterfaceC0142d interfaceC0142d = this.f751y;
        if (interfaceC0142d != null) {
            interfaceC0142d.mo318c(i4);
        }
    }

    /* renamed from: q */
    public boolean m563q() {
        return this.f734h;
    }

    public void setActionBarHideOffset(int i4) {
        m562o();
        this.f730d.setTranslationY(-Math.max(0, Math.min(i4, this.f730d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0142d interfaceC0142d) {
        this.f751y = interfaceC0142d;
        if (getWindowToken() != null) {
            this.f751y.mo318c(this.f728b);
            int i4 = this.f739m;
            if (i4 != 0) {
                onWindowSystemUiVisibilityChanged(i4);
                C0358u.m2045n0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z3) {
        this.f735i = z3;
    }

    public void setHideOnContentScrollEnabled(boolean z3) {
        if (z3 != this.f736j) {
            this.f736j = z3;
            if (z3) {
                return;
            }
            m562o();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i4) {
        m564t();
        this.f731e.setIcon(i4);
    }

    public void setLogo(int i4) {
        m564t();
        this.f731e.mo872q(i4);
    }

    public void setOverlayMode(boolean z3) {
        this.f734h = z3;
        this.f733g = z3 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z3) {
    }

    public void setUiOptions(int i4) {
    }

    @Override // androidx.appcompat.widget.InterfaceC0229o
    public void setWindowCallback(Window.Callback callback) {
        m564t();
        this.f731e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.InterfaceC0229o
    public void setWindowTitle(CharSequence charSequence) {
        m564t();
        this.f731e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    void m564t() {
        if (this.f729c == null) {
            this.f729c = (ContentFrameLayout) findViewById(C1043f.f5855b);
            this.f730d = (ActionBarContainer) findViewById(C1043f.f5856c);
            this.f731e = m545n(findViewById(C1043f.f5854a));
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // androidx.core.view.InterfaceC0350m
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            onNestedScroll(view, i4, i5, i6, i7);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i4) {
        this.f726E.m1969b(view, view2, i4);
        this.f738l = getActionBarHideOffset();
        m562o();
        InterfaceC0142d interfaceC0142d = this.f751y;
        if (interfaceC0142d != null) {
            interfaceC0142d.mo317b();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i4) {
        if ((i4 & 2) == 0 || this.f730d.getVisibility() != 0) {
            return false;
        }
        return this.f736j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f736j && !this.f737k) {
            if (this.f738l <= this.f730d.getHeight()) {
                m548s();
            } else {
                m547r();
            }
        }
        InterfaceC0142d interfaceC0142d = this.f751y;
        if (interfaceC0142d != null) {
            interfaceC0142d.mo319d();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        int i8 = this.f738l + i5;
        this.f738l = i8;
        setActionBarHideOffset(i8);
    }

    public void setIcon(Drawable drawable) {
        m564t();
        this.f731e.setIcon(drawable);
    }
}
