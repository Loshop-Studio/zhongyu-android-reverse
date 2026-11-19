package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.core.content.C0332a;
import androidx.core.view.C0349l;
import androidx.core.view.C0352o;
import androidx.core.view.C0358u;
import androidx.core.view.InterfaceC0348k;
import androidx.core.widget.C0375i;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements InterfaceC0348k {

    /* renamed from: S */
    private static final String f4166S = SwipeRefreshLayout.class.getSimpleName();

    /* renamed from: T */
    private static final int[] f4167T = {R.attr.enabled};

    /* renamed from: A */
    int f4168A;

    /* renamed from: B */
    C0669b f4169B;

    /* renamed from: C */
    private Animation f4170C;

    /* renamed from: D */
    private Animation f4171D;

    /* renamed from: E */
    private Animation f4172E;

    /* renamed from: F */
    private Animation f4173F;

    /* renamed from: G */
    private Animation f4174G;

    /* renamed from: H */
    boolean f4175H;

    /* renamed from: I */
    private int f4176I;

    /* renamed from: J */
    boolean f4177J;

    /* renamed from: K */
    private InterfaceC0666i f4178K;

    /* renamed from: L */
    private Animation.AnimationListener f4179L;

    /* renamed from: M */
    private final Animation f4180M;

    /* renamed from: N */
    private final Animation f4181N;

    /* renamed from: a */
    private View f4182a;

    /* renamed from: b */
    InterfaceC0667j f4183b;

    /* renamed from: c */
    boolean f4184c;

    /* renamed from: d */
    private int f4185d;

    /* renamed from: e */
    private float f4186e;

    /* renamed from: f */
    private float f4187f;

    /* renamed from: g */
    private final C0352o f4188g;

    /* renamed from: h */
    private final C0349l f4189h;

    /* renamed from: i */
    private final int[] f4190i;

    /* renamed from: j */
    private final int[] f4191j;

    /* renamed from: k */
    private boolean f4192k;

    /* renamed from: l */
    private int f4193l;

    /* renamed from: m */
    int f4194m;

    /* renamed from: n */
    private float f4195n;

    /* renamed from: o */
    private float f4196o;

    /* renamed from: p */
    private boolean f4197p;

    /* renamed from: q */
    private int f4198q;

    /* renamed from: r */
    boolean f4199r;

    /* renamed from: s */
    private boolean f4200s;

    /* renamed from: t */
    private final DecelerateInterpolator f4201t;

    /* renamed from: u */
    C0668a f4202u;

    /* renamed from: v */
    private int f4203v;

    /* renamed from: w */
    protected int f4204w;

    /* renamed from: x */
    float f4205x;

    /* renamed from: y */
    protected int f4206y;

    /* renamed from: z */
    int f4207z;

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a */
    class AnimationAnimationListenerC0658a implements Animation.AnimationListener {
        AnimationAnimationListenerC0658a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            InterfaceC0667j interfaceC0667j;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f4184c) {
                swipeRefreshLayout.m3712k();
                return;
            }
            swipeRefreshLayout.f4169B.setAlpha(255);
            SwipeRefreshLayout.this.f4169B.start();
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            if (swipeRefreshLayout2.f4175H && (interfaceC0667j = swipeRefreshLayout2.f4183b) != null) {
                interfaceC0667j.mo3715a();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
            swipeRefreshLayout3.f4194m = swipeRefreshLayout3.f4202u.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b */
    class C0659b extends Animation {
        C0659b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f4, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f4);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c */
    class C0660c extends Animation {
        C0660c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f4, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f4);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d */
    class C0661d extends Animation {

        /* renamed from: a */
        final /* synthetic */ int f4211a;

        /* renamed from: b */
        final /* synthetic */ int f4212b;

        C0661d(int i4, int i5) {
            this.f4211a = i4;
            this.f4212b = i5;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f4, Transformation transformation) {
            SwipeRefreshLayout.this.f4169B.setAlpha((int) (this.f4211a + ((this.f4212b - r0) * f4)));
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e */
    class AnimationAnimationListenerC0662e implements Animation.AnimationListener {
        AnimationAnimationListenerC0662e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f4199r) {
                return;
            }
            swipeRefreshLayout.m3713q(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f */
    class C0663f extends Animation {
        C0663f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f4, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int iAbs = !swipeRefreshLayout.f4177J ? swipeRefreshLayout.f4207z - Math.abs(swipeRefreshLayout.f4206y) : swipeRefreshLayout.f4207z;
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((swipeRefreshLayout2.f4204w + ((int) ((iAbs - r1) * f4))) - swipeRefreshLayout2.f4202u.getTop());
            SwipeRefreshLayout.this.f4169B.m3726e(1.0f - f4);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$g */
    class C0664g extends Animation {
        C0664g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f4, Transformation transformation) {
            SwipeRefreshLayout.this.m3711i(f4);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h */
    class C0665h extends Animation {
        C0665h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f4, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f5 = swipeRefreshLayout.f4205x;
            swipeRefreshLayout.setAnimationProgress(f5 + ((-f5) * f4));
            SwipeRefreshLayout.this.m3711i(f4);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i */
    public interface InterfaceC0666i {
        /* renamed from: a */
        boolean m3714a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$j */
    public interface InterfaceC0667j {
        /* renamed from: a */
        void mo3715a();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4184c = false;
        this.f4186e = -1.0f;
        this.f4190i = new int[2];
        this.f4191j = new int[2];
        this.f4198q = -1;
        this.f4203v = -1;
        this.f4179L = new AnimationAnimationListenerC0658a();
        this.f4180M = new C0663f();
        this.f4181N = new C0664g();
        this.f4185d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f4193l = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f4201t = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f4176I = (int) (displayMetrics.density * 40.0f);
        m3697d();
        setChildrenDrawingOrderEnabled(true);
        int i4 = (int) (displayMetrics.density * 64.0f);
        this.f4207z = i4;
        this.f4186e = i4;
        this.f4188g = new C0352o(this);
        this.f4189h = new C0349l(this);
        setNestedScrollingEnabled(true);
        int i5 = -this.f4176I;
        this.f4194m = i5;
        this.f4206y = i5;
        m3711i(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4167T);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m3695a(int i4, Animation.AnimationListener animationListener) {
        this.f4204w = i4;
        this.f4180M.reset();
        this.f4180M.setDuration(200L);
        this.f4180M.setInterpolator(this.f4201t);
        if (animationListener != null) {
            this.f4202u.m3717b(animationListener);
        }
        this.f4202u.clearAnimation();
        this.f4202u.startAnimation(this.f4180M);
    }

    /* renamed from: b */
    private void m3696b(int i4, Animation.AnimationListener animationListener) {
        if (this.f4199r) {
            m3708r(i4, animationListener);
            return;
        }
        this.f4204w = i4;
        this.f4181N.reset();
        this.f4181N.setDuration(200L);
        this.f4181N.setInterpolator(this.f4201t);
        if (animationListener != null) {
            this.f4202u.m3717b(animationListener);
        }
        this.f4202u.clearAnimation();
        this.f4202u.startAnimation(this.f4181N);
    }

    /* renamed from: d */
    private void m3697d() {
        this.f4202u = new C0668a(getContext(), -328966);
        C0669b c0669b = new C0669b(getContext());
        this.f4169B = c0669b;
        c0669b.m3731l(1);
        this.f4202u.setImageDrawable(this.f4169B);
        this.f4202u.setVisibility(8);
        addView(this.f4202u);
    }

    /* renamed from: e */
    private void m3698e() {
        if (this.f4182a == null) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (!childAt.equals(this.f4202u)) {
                    this.f4182a = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    private void m3699f(float f4) {
        if (f4 > this.f4186e) {
            m3703l(true, true);
            return;
        }
        this.f4184c = false;
        this.f4169B.m3729j(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA);
        m3696b(this.f4194m, this.f4199r ? null : new AnimationAnimationListenerC0662e());
        this.f4169B.m3725d(false);
    }

    /* renamed from: g */
    private boolean m3700g(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    /* renamed from: h */
    private void m3701h(float f4) {
        this.f4169B.m3725d(true);
        float fMin = Math.min(1.0f, Math.abs(f4 / this.f4186e));
        float fMax = (((float) Math.max(fMin - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f4) - this.f4186e;
        int i4 = this.f4168A;
        if (i4 <= 0) {
            i4 = this.f4177J ? this.f4207z - this.f4206y : this.f4207z;
        }
        float f5 = i4;
        double dMax = Math.max(IGoodView.DEFAULT_TO_ALPHA, Math.min(fAbs, f5 * 2.0f) / f5) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i5 = this.f4206y + ((int) ((f5 * fMin) + (f5 * fPow * 2.0f)));
        if (this.f4202u.getVisibility() != 0) {
            this.f4202u.setVisibility(0);
        }
        if (!this.f4199r) {
            this.f4202u.setScaleX(1.0f);
            this.f4202u.setScaleY(1.0f);
        }
        if (this.f4199r) {
            setAnimationProgress(Math.min(1.0f, f4 / this.f4186e));
        }
        if (f4 < this.f4186e) {
            if (this.f4169B.getAlpha() > 76 && !m3700g(this.f4172E)) {
                m3707p();
            }
        } else if (this.f4169B.getAlpha() < 255 && !m3700g(this.f4173F)) {
            m3706o();
        }
        this.f4169B.m3729j(IGoodView.DEFAULT_TO_ALPHA, Math.min(0.8f, fMax * 0.8f));
        this.f4169B.m3726e(Math.min(1.0f, fMax));
        this.f4169B.m3728g((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i5 - this.f4194m);
    }

    /* renamed from: j */
    private void m3702j(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4198q) {
            this.f4198q = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    /* renamed from: l */
    private void m3703l(boolean z3, boolean z4) {
        if (this.f4184c != z3) {
            this.f4175H = z4;
            m3698e();
            this.f4184c = z3;
            if (z3) {
                m3695a(this.f4194m, this.f4179L);
            } else {
                m3713q(this.f4179L);
            }
        }
    }

    /* renamed from: m */
    private Animation m3704m(int i4, int i5) {
        C0661d c0661d = new C0661d(i4, i5);
        c0661d.setDuration(300L);
        this.f4202u.m3717b(null);
        this.f4202u.clearAnimation();
        this.f4202u.startAnimation(c0661d);
        return c0661d;
    }

    /* renamed from: n */
    private void m3705n(float f4) {
        float f5 = this.f4196o;
        float f6 = f4 - f5;
        int i4 = this.f4185d;
        if (f6 <= i4 || this.f4197p) {
            return;
        }
        this.f4195n = f5 + i4;
        this.f4197p = true;
        this.f4169B.setAlpha(76);
    }

    /* renamed from: o */
    private void m3706o() {
        this.f4173F = m3704m(this.f4169B.getAlpha(), 255);
    }

    /* renamed from: p */
    private void m3707p() {
        this.f4172E = m3704m(this.f4169B.getAlpha(), 76);
    }

    /* renamed from: r */
    private void m3708r(int i4, Animation.AnimationListener animationListener) {
        this.f4204w = i4;
        this.f4205x = this.f4202u.getScaleX();
        C0665h c0665h = new C0665h();
        this.f4174G = c0665h;
        c0665h.setDuration(150L);
        if (animationListener != null) {
            this.f4202u.m3717b(animationListener);
        }
        this.f4202u.clearAnimation();
        this.f4202u.startAnimation(this.f4174G);
    }

    /* renamed from: s */
    private void m3709s(Animation.AnimationListener animationListener) {
        this.f4202u.setVisibility(0);
        this.f4169B.setAlpha(255);
        C0659b c0659b = new C0659b();
        this.f4170C = c0659b;
        c0659b.setDuration(this.f4193l);
        if (animationListener != null) {
            this.f4202u.m3717b(animationListener);
        }
        this.f4202u.clearAnimation();
        this.f4202u.startAnimation(this.f4170C);
    }

    private void setColorViewAlpha(int i4) {
        this.f4202u.getBackground().setAlpha(i4);
        this.f4169B.setAlpha(i4);
    }

    /* renamed from: c */
    public boolean m3710c() {
        InterfaceC0666i interfaceC0666i = this.f4178K;
        if (interfaceC0666i != null) {
            return interfaceC0666i.m3714a(this, this.f4182a);
        }
        View view = this.f4182a;
        return view instanceof ListView ? C0375i.m2182a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f4, float f5, boolean z3) {
        return this.f4189h.m1953a(f4, f5, z3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f4, float f5) {
        return this.f4189h.m1954b(f4, f5);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return this.f4189h.m1955c(i4, i5, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return this.f4189h.m1958f(i4, i5, i6, i7, iArr);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i4, int i5) {
        int i6 = this.f4203v;
        return i6 < 0 ? i5 : i5 == i4 + (-1) ? i6 : i5 >= i6 ? i5 + 1 : i5;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f4188g.m1968a();
    }

    public int getProgressCircleDiameter() {
        return this.f4176I;
    }

    public int getProgressViewEndOffset() {
        return this.f4207z;
    }

    public int getProgressViewStartOffset() {
        return this.f4206y;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f4189h.m1960k();
    }

    /* renamed from: i */
    void m3711i(float f4) {
        setTargetOffsetTopAndBottom((this.f4204w + ((int) ((this.f4206y - r0) * f4))) - this.f4202u.getTop());
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f4189h.m1962m();
    }

    /* renamed from: k */
    void m3712k() {
        this.f4202u.clearAnimation();
        this.f4169B.stop();
        this.f4202u.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f4199r) {
            setAnimationProgress(IGoodView.DEFAULT_TO_ALPHA);
        } else {
            setTargetOffsetTopAndBottom(this.f4206y - this.f4194m);
        }
        this.f4194m = this.f4202u.getTop();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m3712k();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0058  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r4.m3698e()
            int r0 = r5.getActionMasked()
            boolean r1 = r4.f4200s
            r2 = 0
            if (r1 == 0) goto L10
            if (r0 != 0) goto L10
            r4.f4200s = r2
        L10:
            boolean r1 = r4.isEnabled()
            if (r1 == 0) goto L81
            boolean r1 = r4.f4200s
            if (r1 != 0) goto L81
            boolean r1 = r4.m3710c()
            if (r1 != 0) goto L81
            boolean r1 = r4.f4184c
            if (r1 != 0) goto L81
            boolean r1 = r4.f4192k
            if (r1 == 0) goto L29
            goto L81
        L29:
            if (r0 == 0) goto L5d
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L58
            r1 = 2
            if (r0 == r1) goto L3d
            r1 = 3
            if (r0 == r1) goto L58
            r1 = 6
            if (r0 == r1) goto L39
            goto L7e
        L39:
            r4.m3702j(r5)
            goto L7e
        L3d:
            int r0 = r4.f4198q
            if (r0 != r3) goto L49
            java.lang.String r5 = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f4166S
            java.lang.String r0 = "Got ACTION_MOVE event but don't have an active pointer id."
            android.util.Log.e(r5, r0)
            return r2
        L49:
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L50
            return r2
        L50:
            float r5 = r5.getY(r0)
            r4.m3705n(r5)
            goto L7e
        L58:
            r4.f4197p = r2
            r4.f4198q = r3
            goto L7e
        L5d:
            int r0 = r4.f4206y
            androidx.swiperefreshlayout.widget.a r1 = r4.f4202u
            int r1 = r1.getTop()
            int r0 = r0 - r1
            r4.setTargetOffsetTopAndBottom(r0)
            int r0 = r5.getPointerId(r2)
            r4.f4198q = r0
            r4.f4197p = r2
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L78
            return r2
        L78:
            float r5 = r5.getY(r0)
            r4.f4196o = r5
        L7e:
            boolean r5 = r4.f4197p
            return r5
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f4182a == null) {
            m3698e();
        }
        View view = this.f4182a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f4202u.getMeasuredWidth();
        int measuredHeight2 = this.f4202u.getMeasuredHeight();
        int i8 = measuredWidth / 2;
        int i9 = measuredWidth2 / 2;
        int i10 = this.f4194m;
        this.f4202u.layout(i8 - i9, i10, i8 + i9, measuredHeight2 + i10);
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f4182a == null) {
            m3698e();
        }
        View view = this.f4182a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f4202u.measure(View.MeasureSpec.makeMeasureSpec(this.f4176I, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f4176I, 1073741824));
        this.f4203v = -1;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            if (getChildAt(i6) == this.f4202u) {
                this.f4203v = i6;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f4, float f5, boolean z3) {
        return dispatchNestedFling(f4, f5, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f4, float f5) {
        return dispatchNestedPreFling(f4, f5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        if (i5 > 0) {
            float f4 = this.f4187f;
            if (f4 > IGoodView.DEFAULT_TO_ALPHA) {
                float f5 = i5;
                if (f5 > f4) {
                    iArr[1] = i5 - ((int) f4);
                    this.f4187f = IGoodView.DEFAULT_TO_ALPHA;
                } else {
                    this.f4187f = f4 - f5;
                    iArr[1] = i5;
                }
                m3701h(this.f4187f);
            }
        }
        if (this.f4177J && i5 > 0 && this.f4187f == IGoodView.DEFAULT_TO_ALPHA && Math.abs(i5 - iArr[1]) > 0) {
            this.f4202u.setVisibility(8);
        }
        int[] iArr2 = this.f4190i;
        if (dispatchNestedPreScroll(i4 - iArr[0], i5 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        dispatchNestedScroll(i4, i5, i6, i7, this.f4191j);
        if (i7 + this.f4191j[1] >= 0 || m3710c()) {
            return;
        }
        float fAbs = this.f4187f + Math.abs(r11);
        this.f4187f = fAbs;
        m3701h(fAbs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i4) {
        this.f4188g.m1969b(view, view2, i4);
        startNestedScroll(i4 & 2);
        this.f4187f = IGoodView.DEFAULT_TO_ALPHA;
        this.f4192k = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i4) {
        return (!isEnabled() || this.f4200s || this.f4184c || (i4 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f4188g.m1971d(view);
        this.f4192k = false;
        float f4 = this.f4187f;
        if (f4 > IGoodView.DEFAULT_TO_ALPHA) {
            m3699f(f4);
            this.f4187f = IGoodView.DEFAULT_TO_ALPHA;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f4200s && actionMasked == 0) {
            this.f4200s = false;
        }
        if (!isEnabled() || this.f4200s || m3710c() || this.f4184c || this.f4192k) {
            return false;
        }
        if (actionMasked == 0) {
            this.f4198q = motionEvent.getPointerId(0);
            this.f4197p = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f4198q);
                if (iFindPointerIndex < 0) {
                    Log.e(f4166S, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f4197p) {
                    float y3 = (motionEvent.getY(iFindPointerIndex) - this.f4195n) * 0.5f;
                    this.f4197p = false;
                    m3699f(y3);
                }
                this.f4198q = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f4198q);
                if (iFindPointerIndex2 < 0) {
                    Log.e(f4166S, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y4 = motionEvent.getY(iFindPointerIndex2);
                m3705n(y4);
                if (this.f4197p) {
                    float f4 = (y4 - this.f4195n) * 0.5f;
                    if (f4 <= IGoodView.DEFAULT_TO_ALPHA) {
                        return false;
                    }
                    m3701h(f4);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(f4166S, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f4198q = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    m3702j(motionEvent);
                }
            }
        }
        return true;
    }

    /* renamed from: q */
    void m3713q(Animation.AnimationListener animationListener) {
        C0660c c0660c = new C0660c();
        this.f4171D = c0660c;
        c0660c.setDuration(150L);
        this.f4202u.m3717b(animationListener);
        this.f4202u.clearAnimation();
        this.f4202u.startAnimation(this.f4171D);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z3) {
        View view = this.f4182a;
        if (view == null || C0358u.m2014W(view)) {
            super.requestDisallowInterceptTouchEvent(z3);
        }
    }

    void setAnimationProgress(float f4) {
        this.f4202u.setScaleX(f4);
        this.f4202u.setScaleY(f4);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m3698e();
        this.f4169B.m3727f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            iArr2[i4] = C0332a.m1804b(context, iArr[i4]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i4) {
        this.f4186e = i4;
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        if (z3) {
            return;
        }
        m3712k();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        this.f4189h.m1963n(z3);
    }

    public void setOnChildScrollUpCallback(InterfaceC0666i interfaceC0666i) {
        this.f4178K = interfaceC0666i;
    }

    public void setOnRefreshListener(InterfaceC0667j interfaceC0667j) {
        this.f4183b = interfaceC0667j;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i4) {
        setProgressBackgroundColorSchemeResource(i4);
    }

    public void setProgressBackgroundColorSchemeColor(int i4) {
        this.f4202u.setBackgroundColor(i4);
    }

    public void setProgressBackgroundColorSchemeResource(int i4) {
        setProgressBackgroundColorSchemeColor(C0332a.m1804b(getContext(), i4));
    }

    public void setRefreshing(boolean z3) {
        if (!z3 || this.f4184c == z3) {
            m3703l(z3, false);
            return;
        }
        this.f4184c = z3;
        setTargetOffsetTopAndBottom((!this.f4177J ? this.f4207z + this.f4206y : this.f4207z) - this.f4194m);
        this.f4175H = false;
        m3709s(this.f4179L);
    }

    public void setSize(int i4) {
        if (i4 == 0 || i4 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i4 == 0) {
                this.f4176I = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f4176I = (int) (displayMetrics.density * 40.0f);
            }
            this.f4202u.setImageDrawable(null);
            this.f4169B.m3731l(i4);
            this.f4202u.setImageDrawable(this.f4169B);
        }
    }

    public void setSlingshotDistance(int i4) {
        this.f4168A = i4;
    }

    void setTargetOffsetTopAndBottom(int i4) {
        this.f4202u.bringToFront();
        C0358u.m2021b0(this.f4202u, i4);
        this.f4194m = this.f4202u.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i4) {
        return this.f4189h.m1964p(i4);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f4189h.m1966r();
    }
}
