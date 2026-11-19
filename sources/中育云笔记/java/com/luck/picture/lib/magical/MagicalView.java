package com.luck.picture.lib.magical;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.ChangeImageTransform;
import android.transition.ChangeTransform;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.luck.picture.lib.config.PictureSelectionConfig;
import p008a7.AbstractC0072e;
import p260n6.InterfaceC10322a;
import p345t6.C11247b;
import p345t6.InterfaceC11248c;

/* loaded from: classes5.dex */
public class MagicalView extends FrameLayout {

    /* renamed from: c */
    public float f12438c;

    /* renamed from: d */
    public final long f12439d;

    /* renamed from: e */
    public int f12440e;

    /* renamed from: f */
    public int f12441f;

    /* renamed from: g */
    public int f12442g;

    /* renamed from: h */
    public int f12443h;

    /* renamed from: i */
    public int f12444i;

    /* renamed from: j */
    public int f12445j;

    /* renamed from: k */
    public final int f12446k;

    /* renamed from: l */
    public int f12447l;

    /* renamed from: m */
    public int f12448m;

    /* renamed from: n */
    public int f12449n;

    /* renamed from: o */
    public int f12450o;

    /* renamed from: p */
    public int f12451p;

    /* renamed from: q */
    public int f12452q;

    /* renamed from: r */
    public boolean f12453r;

    /* renamed from: s */
    public final FrameLayout f12454s;

    /* renamed from: t */
    public final View f12455t;

    /* renamed from: u */
    public final C11247b f12456u;

    /* renamed from: v */
    public final boolean f12457v;

    /* renamed from: w */
    public int f12458w;

    /* renamed from: x */
    public int f12459x;

    /* renamed from: y */
    public InterfaceC11248c f12460y;

    /* renamed from: com.luck.picture.lib.magical.MagicalView$a */
    public class C7487a implements ValueAnimator.AnimatorUpdateListener {
        public C7487a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            MagicalView.this.m9452H(fFloatValue, r0.f12441f, MagicalView.this.f12447l, MagicalView.this.f12440e, MagicalView.this.f12450o, MagicalView.this.f12443h, MagicalView.this.f12448m, MagicalView.this.f12442g, MagicalView.this.f12449n);
        }
    }

    /* renamed from: com.luck.picture.lib.magical.MagicalView$b */
    public class C7488b extends AnimatorListenerAdapter {
        public C7488b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            MagicalView.this.m9449E();
        }
    }

    /* renamed from: com.luck.picture.lib.magical.MagicalView$c */
    public class RunnableC7489c implements Runnable {
        public RunnableC7489c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TransitionManager.beginDelayedTransition((ViewGroup) MagicalView.this.f12454s.getParent(), new TransitionSet().setDuration(250L).addTransition(new ChangeBounds()).addTransition(new ChangeTransform()).addTransition(new ChangeImageTransform()));
            MagicalView.this.m9459w(true);
            MagicalView.this.f12454s.setTranslationX(0.0f);
            MagicalView.this.f12454s.setTranslationY(0.0f);
            MagicalView.this.f12456u.m25092d(MagicalView.this.f12443h);
            MagicalView.this.f12456u.m25089a(MagicalView.this.f12442g);
            MagicalView.this.f12456u.m25091c(MagicalView.this.f12441f);
            MagicalView.this.f12456u.m25090b(MagicalView.this.f12440e);
            MagicalView.this.m9461y(true);
        }
    }

    /* renamed from: com.luck.picture.lib.magical.MagicalView$d */
    public class C7490d extends AnimatorListenerAdapter {
        public C7490d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (MagicalView.this.f12460y != null) {
                MagicalView.this.f12460y.mo9100e();
            }
        }
    }

    /* renamed from: com.luck.picture.lib.magical.MagicalView$e */
    public class C7491e implements ValueAnimator.AnimatorUpdateListener {
        public C7491e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            MagicalView.this.f12453r = true;
            MagicalView.this.f12438c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            MagicalView.this.f12455t.setAlpha(MagicalView.this.f12438c);
            if (MagicalView.this.f12460y != null) {
                MagicalView.this.f12460y.mo9096a(MagicalView.this.f12438c);
            }
        }
    }

    /* renamed from: com.luck.picture.lib.magical.MagicalView$f */
    public class C7492f extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f12466a;

        public C7492f(boolean z10) {
            this.f12466a = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            MagicalView.this.f12453r = false;
            if (!this.f12466a || MagicalView.this.f12460y == null) {
                return;
            }
            MagicalView.this.f12460y.mo9100e();
        }
    }

    public MagicalView(Context context) {
        this(context, null);
    }

    private void getScreenSize() {
        this.f12444i = AbstractC0072e.m165e(getContext());
        if (this.f12457v) {
            this.f12445j = AbstractC0072e.m164d(getContext());
        } else {
            this.f12445j = AbstractC0072e.m167g(getContext());
        }
    }

    /* renamed from: A */
    public void m9445A(int i10, int i11, boolean z10) {
        int i12;
        int i13;
        if (this.f12457v || (i12 = this.f12444i) > (i13 = this.f12445j)) {
            return;
        }
        if (((int) (i12 / (i10 / i11))) > i13) {
            this.f12445j = this.f12446k;
            if (z10) {
                this.f12456u.m25092d(i12);
                this.f12456u.m25089a(this.f12445j);
            }
        }
    }

    /* renamed from: B */
    public void m9446B() {
        getScreenSize();
        m9454J(true);
    }

    /* renamed from: C */
    public void m9447C(int i10, int i11, boolean z10) {
        getScreenSize();
        m9455K(i10, i11, z10);
    }

    /* renamed from: D */
    public final void m9448D() {
        this.f12454s.getLocationOnScreen(new int[2]);
        this.f12450o = 0;
        int i10 = this.f12444i;
        int i11 = this.f12445j;
        float f10 = i10 / i11;
        int i12 = this.f12451p;
        int i13 = this.f12452q;
        if (f10 < i12 / i13) {
            this.f12448m = i10;
            int i14 = (int) (i10 * (i13 / i12));
            this.f12449n = i14;
            this.f12447l = (i11 - i14) / 2;
        } else {
            this.f12449n = i11;
            int i15 = (int) (i11 * (i12 / i13));
            this.f12448m = i15;
            this.f12447l = 0;
            this.f12450o = (i10 - i15) / 2;
        }
        this.f12456u.m25092d(this.f12443h);
        this.f12456u.m25089a(this.f12442g);
        this.f12456u.m25090b(this.f12440e);
        this.f12456u.m25091c(this.f12441f);
    }

    /* renamed from: E */
    public final void m9449E() {
        this.f12453r = false;
        m9462z();
        InterfaceC11248c interfaceC11248c = this.f12460y;
        if (interfaceC11248c != null) {
            interfaceC11248c.mo9099d(this, false);
        }
    }

    /* renamed from: F */
    public void m9450F(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f12451p = i14;
        this.f12452q = i15;
        this.f12440e = i10;
        this.f12441f = i11;
        this.f12443h = i12;
        this.f12442g = i13;
    }

    /* renamed from: G */
    public final void m9451G(float f10, float f11, float f12, float f13) {
        m9453I(true, 0.0f, 0.0f, f10, 0.0f, f11, 0.0f, f12, 0.0f, f13);
    }

    /* renamed from: H */
    public final void m9452H(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        m9453I(false, f10, f11, f12, f13, f14, f15, f16, f17, f18);
    }

    /* renamed from: I */
    public final void m9453I(boolean z10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        if (z10) {
            this.f12456u.m25092d(f16);
            this.f12456u.m25089a(f18);
            this.f12456u.m25090b((int) f14);
            this.f12456u.m25091c((int) f12);
            return;
        }
        float f19 = (f14 - f13) * f10;
        float f20 = (f16 - f15) * f10;
        float f21 = (f18 - f17) * f10;
        this.f12456u.m25092d(f15 + f20);
        this.f12456u.m25089a(f17 + f21);
        this.f12456u.m25090b((int) (f13 + f19));
        this.f12456u.m25091c((int) (f11 + (f10 * (f12 - f11))));
    }

    /* renamed from: J */
    public void m9454J(boolean z10) {
        float f10;
        if (z10) {
            f10 = 1.0f;
            this.f12438c = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f12438c = f10;
        this.f12455t.setAlpha(f10);
        setVisibility(0);
        m9448D();
        m9460x(z10);
    }

    /* renamed from: K */
    public void m9455K(int i10, int i11, boolean z10) {
        this.f12451p = i10;
        this.f12452q = i11;
        this.f12440e = 0;
        this.f12441f = 0;
        this.f12443h = 0;
        this.f12442g = 0;
        setVisibility(0);
        m9448D();
        m9451G(this.f12447l, this.f12450o, this.f12448m, this.f12449n);
        if (z10) {
            this.f12438c = 1.0f;
            this.f12455t.setAlpha(1.0f);
        } else {
            this.f12438c = 0.0f;
            this.f12455t.setAlpha(0.0f);
            this.f12454s.setAlpha(0.0f);
            this.f12454s.animate().alpha(1.0f).setDuration(250L).start();
            this.f12455t.animate().alpha(1.0f).setDuration(250L).start();
        }
        m9449E();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.widget.FrameLayout r0 = r5.f12454s
            r1 = 0
            android.view.View r0 = r0.getChildAt(r1)
            boolean r1 = r0 instanceof androidx.viewpager2.widget.ViewPager2
            if (r1 == 0) goto Le
            androidx.viewpager2.widget.ViewPager2 r0 = (androidx.viewpager2.widget.ViewPager2) r0
            goto Lf
        Le:
            r0 = 0
        Lf:
            int r1 = r6.getAction()
            r2 = 1
            if (r1 == 0) goto L53
            if (r1 == r2) goto L4d
            r3 = 2
            if (r1 == r3) goto L1f
            r3 = 3
            if (r1 == r3) goto L4d
            goto L66
        L1f:
            float r1 = r6.getX()
            int r1 = (int) r1
            float r3 = r6.getY()
            int r3 = (int) r3
            int r4 = r5.f12458w
            int r1 = r1 - r4
            int r1 = java.lang.Math.abs(r1)
            int r4 = r5.f12459x
            int r4 = r3 - r4
            int r4 = java.lang.Math.abs(r4)
            if (r1 <= r4) goto L40
            if (r0 == 0) goto L66
            r0.setUserInputEnabled(r2)
            goto L66
        L40:
            if (r0 == 0) goto L66
            int r1 = r5.f12459x
            int r1 = r1 - r3
            boolean r1 = r5.canScrollVertically(r1)
            r0.setUserInputEnabled(r1)
            goto L66
        L4d:
            if (r0 == 0) goto L66
            r0.setUserInputEnabled(r2)
            goto L66
        L53:
            float r1 = r6.getX()
            int r1 = (int) r1
            r5.f12458w = r1
            float r1 = r6.getY()
            int r1 = (int) r1
            r5.f12459x = r1
            if (r0 == 0) goto L66
            r0.setUserInputEnabled(r2)
        L66:
            boolean r6 = super.dispatchTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.magical.MagicalView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBackgroundAlpha(float f10) {
        this.f12438c = f10;
        this.f12455t.setAlpha(f10);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f12455t.setBackgroundColor(i10);
    }

    public void setMagicalContent(View view) {
        this.f12454s.addView(view);
    }

    public void setOnMojitoViewCallback(InterfaceC11248c interfaceC11248c) {
        this.f12460y = interfaceC11248c;
    }

    /* renamed from: t */
    public void m9456t() {
        if (this.f12453r) {
            return;
        }
        if (this.f12443h == 0 || this.f12442g == 0) {
            m9458v();
            return;
        }
        InterfaceC11248c interfaceC11248c = this.f12460y;
        if (interfaceC11248c != null) {
            interfaceC11248c.mo9097b();
        }
        m9459w(false);
        m9457u();
    }

    /* renamed from: u */
    public final void m9457u() {
        this.f12454s.post(new RunnableC7489c());
    }

    /* renamed from: v */
    public final void m9458v() {
        this.f12454s.animate().alpha(0.0f).setDuration(250L).setListener(new C7490d()).start();
        this.f12455t.animate().alpha(0.0f).setDuration(250L).start();
    }

    /* renamed from: w */
    public final void m9459w(boolean z10) {
        if (z10) {
            this.f12460y.mo9098c(true);
        }
    }

    /* renamed from: x */
    public final void m9460x(boolean z10) {
        if (z10) {
            this.f12438c = 1.0f;
            this.f12455t.setAlpha(1.0f);
            m9451G(this.f12447l, this.f12450o, this.f12448m, this.f12449n);
            m9449E();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C7487a());
        valueAnimatorOfFloat.addListener(new C7488b());
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        valueAnimatorOfFloat.setDuration(250L).start();
        m9461y(false);
    }

    /* renamed from: y */
    public final void m9461y(boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f12438c, z10 ? 0.0f : 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C7491e());
        valueAnimatorOfFloat.addListener(new C7492f(z10));
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.start();
    }

    /* renamed from: z */
    public final void m9462z() {
        int i10 = this.f12445j;
        this.f12449n = i10;
        this.f12448m = this.f12444i;
        this.f12447l = 0;
        this.f12456u.m25089a(i10);
        this.f12456u.m25092d(this.f12444i);
        this.f12456u.m25091c(0);
        this.f12456u.m25090b(0);
    }

    public MagicalView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MagicalView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12438c = 0.0f;
        this.f12439d = 250L;
        this.f12453r = false;
        this.f12457v = PictureSelectionConfig.m9328c().f12320L;
        this.f12446k = AbstractC0072e.m164d(getContext());
        getScreenSize();
        View view = new View(context);
        this.f12455t = view;
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setAlpha(this.f12438c);
        addView(view);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f12454s = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.f12456u = new C11247b(frameLayout);
    }
}
