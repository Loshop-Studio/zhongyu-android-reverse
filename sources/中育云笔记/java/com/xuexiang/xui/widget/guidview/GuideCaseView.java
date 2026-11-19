package com.xuexiang.xui.widget.guidview;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.Spanned;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.xuexiang.xui.R$anim;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import p420y7.AbstractC11916b;

/* loaded from: classes5.dex */
public class GuideCaseView extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: A */
    public boolean f15971A;

    /* renamed from: B */
    public boolean f15972B;

    /* renamed from: C */
    public int f15973C;

    /* renamed from: D */
    public int f15974D;

    /* renamed from: E */
    public FocusShape f15975E;

    /* renamed from: F */
    public int f15976F;

    /* renamed from: G */
    public int f15977G;

    /* renamed from: H */
    public int f15978H;

    /* renamed from: I */
    public int f15979I;

    /* renamed from: J */
    public int f15980J;

    /* renamed from: K */
    public ViewGroup f15981K;

    /* renamed from: L */
    public SharedPreferences f15982L;

    /* renamed from: M */
    public C8125a f15983M;

    /* renamed from: N */
    public int f15984N;

    /* renamed from: O */
    public int f15985O;

    /* renamed from: P */
    public int f15986P;

    /* renamed from: Q */
    public int f15987Q;

    /* renamed from: R */
    public int f15988R;

    /* renamed from: S */
    public boolean f15989S;

    /* renamed from: c */
    public Activity f15990c;

    /* renamed from: d */
    public String f15991d;

    /* renamed from: e */
    public Spanned f15992e;

    /* renamed from: f */
    public String f15993f;

    /* renamed from: g */
    public double f15994g;

    /* renamed from: h */
    public View f15995h;

    /* renamed from: i */
    public int f15996i;

    /* renamed from: j */
    public int f15997j;

    /* renamed from: k */
    public int f15998k;

    /* renamed from: l */
    public int f15999l;

    /* renamed from: m */
    public int f16000m;

    /* renamed from: n */
    public int f16001n;

    /* renamed from: o */
    public int f16002o;

    /* renamed from: p */
    public int f16003p;

    /* renamed from: q */
    public int f16004q;

    /* renamed from: r */
    public int f16005r;

    /* renamed from: s */
    public int f16006s;

    /* renamed from: t */
    public int f16007t;

    /* renamed from: u */
    public int f16008u;

    /* renamed from: v */
    public int f16009v;

    /* renamed from: w */
    public int f16010w;

    /* renamed from: x */
    public InterfaceC8127c f16011x;

    /* renamed from: y */
    public Animation f16012y;

    /* renamed from: z */
    public Animation f16013z;

    /* renamed from: com.xuexiang.xui.widget.guidview.GuideCaseView$a */
    public class ViewOnClickListenerC8119a implements View.OnClickListener {
        public ViewOnClickListenerC8119a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            GuideCaseView.this.m12664B();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.guidview.GuideCaseView$b */
    public class AnimationAnimationListenerC8120b implements Animation.AnimationListener {
        public AnimationAnimationListenerC8120b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            GuideCaseView.this.m12668F();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.xuexiang.xui.widget.guidview.GuideCaseView$c */
    public class C8121c implements InterfaceC8127c {
        public C8121c() {
        }

        @Override // com.xuexiang.xui.widget.guidview.InterfaceC8127c
        /* renamed from: a */
        public void mo12673a(View view) {
            TextView textView = (TextView) view.findViewById(R$id.gcv_title);
            textView.setTextAppearance(GuideCaseView.this.f15999l);
            if (GuideCaseView.this.f16000m != -1) {
                textView.setTextSize(GuideCaseView.this.f16001n, GuideCaseView.this.f16000m);
            }
            textView.setGravity(GuideCaseView.this.f15998k);
            textView.setTypeface(AbstractC11916b.m26459c());
            if (GuideCaseView.this.f15992e != null) {
                textView.setText(GuideCaseView.this.f15992e);
            } else {
                textView.setText(GuideCaseView.this.f15991d);
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.guidview.GuideCaseView$d */
    public class C8122d implements InterfaceC8127c {
        public C8122d() {
        }

        @Override // com.xuexiang.xui.widget.guidview.InterfaceC8127c
        /* renamed from: a */
        public void mo12673a(View view) {
            ImageView imageView = (ImageView) view.findViewById(R$id.gcv_img);
            imageView.setImageResource(GuideCaseView.this.f16002o);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.gravity = GuideCaseView.this.f16005r;
            if (GuideCaseView.this.f16003p != 0) {
                layoutParams.width = GuideCaseView.this.f16003p;
            }
            if (GuideCaseView.this.f16004q != 0) {
                layoutParams.height = GuideCaseView.this.f16004q;
            }
            if (GuideCaseView.this.f16007t > 0) {
                layoutParams.topMargin = GuideCaseView.this.f16007t;
            } else {
                layoutParams.bottomMargin = -GuideCaseView.this.f16007t;
            }
            if (GuideCaseView.this.f16006s > 0) {
                layoutParams.leftMargin = GuideCaseView.this.f16006s;
            } else {
                layoutParams.rightMargin = -GuideCaseView.this.f16006s;
            }
            imageView.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.guidview.GuideCaseView$e */
    public class ViewTreeObserverOnPreDrawListenerC8123e implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserverOnPreDrawListenerC8123e() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            int width;
            GuideCaseView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            int iHypot = (int) Math.hypot(GuideCaseView.this.getWidth(), GuideCaseView.this.getHeight());
            if (GuideCaseView.this.f15995h != null) {
                width = GuideCaseView.this.f15995h.getWidth() / 2;
            } else {
                if (GuideCaseView.this.f15986P > 0 || GuideCaseView.this.f15987Q > 0 || GuideCaseView.this.f15988R > 0) {
                    GuideCaseView guideCaseView = GuideCaseView.this;
                    guideCaseView.f15979I = guideCaseView.f15984N;
                    GuideCaseView guideCaseView2 = GuideCaseView.this;
                    guideCaseView2.f15980J = guideCaseView2.f15985O;
                }
                width = 0;
            }
            GuideCaseView guideCaseView3 = GuideCaseView.this;
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(guideCaseView3, guideCaseView3.f15979I, GuideCaseView.this.f15980J, width, iHypot);
            animatorCreateCircularReveal.setDuration(GuideCaseView.this.f15976F);
            animatorCreateCircularReveal.setInterpolator(AnimationUtils.loadInterpolator(GuideCaseView.this.f15990c, R.interpolator.accelerate_cubic));
            animatorCreateCircularReveal.start();
            return false;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.guidview.GuideCaseView$f */
    public class C8124f extends AnimatorListenerAdapter {
        public C8124f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            GuideCaseView.this.m12668F();
        }
    }

    /* renamed from: A */
    public final void m12663A() throws Resources.NotFoundException {
        int i10;
        int i11;
        this.f15983M = new C8125a(this.f15990c, this.f15975E, this.f15995h, this.f15994g, this.f15972B, this.f15973C, this.f15974D);
        ViewGroup viewGroup = (ViewGroup) ((ViewGroup) this.f15990c.findViewById(R.id.content)).getParent().getParent();
        this.f15981K = viewGroup;
        GuideCaseView guideCaseView = (GuideCaseView) viewGroup.findViewWithTag("ShowCaseViewTag");
        setClickable(true);
        if (guideCaseView == null) {
            setTag("ShowCaseViewTag");
            if (this.f15971A) {
                setOnClickListener(new ViewOnClickListenerC8119a());
            }
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f15981K.addView(this);
            GuideImageView guideImageView = new GuideImageView(this.f15990c);
            guideImageView.m12679f(this.f15977G, this.f15978H);
            if (this.f15983M.m12688g()) {
                this.f15979I = this.f15983M.m12683b();
                this.f15980J = this.f15983M.m12684c();
            }
            guideImageView.m12680g(this.f15996i, this.f15983M);
            int i12 = this.f15987Q;
            if (i12 > 0 && (i11 = this.f15988R) > 0) {
                this.f15983M.m12694m(this.f15984N, this.f15985O, i12, i11);
            }
            int i13 = this.f15986P;
            if (i13 > 0) {
                this.f15983M.m12693l(this.f15984N, this.f15985O, i13);
            }
            guideImageView.m12677d(this.f15989S);
            guideImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            int i14 = this.f15997j;
            if (i14 != 0 && (i10 = this.f16009v) > 0) {
                guideImageView.m12678e(i14, i10);
            }
            int i15 = this.f16010w;
            if (i15 > 0) {
                guideImageView.m12681h(i15);
            }
            addView(guideImageView);
            int i16 = this.f16008u;
            if (i16 != 0) {
                m12665C(i16, this.f16011x);
            } else if (this.f16002o == 0) {
                m12667E();
            } else {
                m12666D();
            }
            m12669G();
            m12670H();
        }
    }

    /* renamed from: B */
    public void m12664B() throws Resources.NotFoundException {
        Animation animation = this.f16013z;
        if (animation != null) {
            startAnimation(animation);
            return;
        }
        if (AbstractC8128d.m12696b()) {
            m12672z();
            return;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.f15990c, R$anim.gcv_fade_out);
        animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC8120b());
        animationLoadAnimation.setFillAfter(true);
        startAnimation(animationLoadAnimation);
    }

    /* renamed from: C */
    public final void m12665C(int i10, InterfaceC8127c interfaceC8127c) {
        View viewInflate = this.f15990c.getLayoutInflater().inflate(i10, (ViewGroup) this, false);
        addView(viewInflate);
        if (interfaceC8127c != null) {
            interfaceC8127c.mo12673a(viewInflate);
        }
    }

    /* renamed from: D */
    public final void m12666D() {
        m12665C(R$layout.gcv_layout_image, new C8122d());
    }

    /* renamed from: E */
    public final void m12667E() {
        m12665C(R$layout.gcv_layout_title, new C8121c());
    }

    /* renamed from: F */
    public void m12668F() {
        this.f15981K.removeView(this);
    }

    /* renamed from: G */
    public final void m12669G() throws Resources.NotFoundException {
        Animation animation = this.f16012y;
        if (animation != null) {
            startAnimation(animation);
        } else {
            if (AbstractC8128d.m12696b()) {
                m12671y();
                return;
            }
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.f15990c, R$anim.gcv_fade_in);
            animationLoadAnimation.setFillAfter(true);
            startAnimation(animationLoadAnimation);
        }
    }

    /* renamed from: H */
    public final void m12670H() {
        SharedPreferences.Editor editorEdit = this.f15982L.edit();
        editorEdit.putBoolean(this.f15993f, true);
        editorEdit.apply();
    }

    public InterfaceC8126b getDismissListener() {
        return null;
    }

    public int getFocusCenterX() {
        return this.f15983M.m12683b();
    }

    public int getFocusCenterY() {
        return this.f15983M.m12684c();
    }

    public int getFocusHeight() {
        return this.f15983M.m12685d();
    }

    public float getFocusRadius() {
        if (FocusShape.CIRCLE.equals(this.f15975E)) {
            return this.f15983M.m12682a(0, 1.0d);
        }
        return 0.0f;
    }

    public int getFocusWidth() {
        return this.f15983M.m12687f();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() throws Resources.NotFoundException {
        this.f15995h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        m12663A();
    }

    public void setDismissListener(InterfaceC8126b interfaceC8126b) {
    }

    /* renamed from: y */
    public final void m12671y() {
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC8123e());
    }

    /* renamed from: z */
    public final void m12672z() {
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(this, this.f15979I, this.f15980J, (int) Math.hypot(getWidth(), getHeight()), 0.0f);
        animatorCreateCircularReveal.setDuration(this.f15976F);
        animatorCreateCircularReveal.setInterpolator(AnimationUtils.loadInterpolator(this.f15990c, R.interpolator.decelerate_cubic));
        animatorCreateCircularReveal.addListener(new C8124f());
        animatorCreateCircularReveal.start();
    }
}
