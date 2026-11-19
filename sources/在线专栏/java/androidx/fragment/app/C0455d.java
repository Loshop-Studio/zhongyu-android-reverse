package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0356s;
import androidx.fragment.app.C0471t;
import p099i0.C2662a;
import p099i0.C2663b;
import p172y.C3483b;

/* renamed from: androidx.fragment.app.d */
/* loaded from: classes.dex */
class C0455d {

    /* renamed from: androidx.fragment.app.d$a */
    class a implements C3483b.a {

        /* renamed from: a */
        final /* synthetic */ Fragment f3167a;

        a(Fragment fragment) {
            this.f3167a = fragment;
        }

        @Override // p172y.C3483b.a
        /* renamed from: a */
        public void mo2572a() {
            if (this.f3167a.getAnimatingAway() != null) {
                View animatingAway = this.f3167a.getAnimatingAway();
                this.f3167a.setAnimatingAway(null);
                animatingAway.clearAnimation();
            }
            this.f3167a.setAnimator(null);
        }
    }

    /* renamed from: androidx.fragment.app.d$b */
    class b implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3168a;

        /* renamed from: b */
        final /* synthetic */ Fragment f3169b;

        /* renamed from: c */
        final /* synthetic */ C0471t.g f3170c;

        /* renamed from: d */
        final /* synthetic */ C3483b f3171d;

        /* renamed from: androidx.fragment.app.d$b$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f3169b.getAnimatingAway() != null) {
                    b.this.f3169b.setAnimatingAway(null);
                    b bVar = b.this;
                    bVar.f3170c.mo2518b(bVar.f3169b, bVar.f3171d);
                }
            }
        }

        b(ViewGroup viewGroup, Fragment fragment, C0471t.g gVar, C3483b c3483b) {
            this.f3168a = viewGroup;
            this.f3169b = fragment;
            this.f3170c = gVar;
            this.f3171d = c3483b;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f3168a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.d$c */
    class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3173a;

        /* renamed from: b */
        final /* synthetic */ View f3174b;

        /* renamed from: c */
        final /* synthetic */ Fragment f3175c;

        /* renamed from: d */
        final /* synthetic */ C0471t.g f3176d;

        /* renamed from: e */
        final /* synthetic */ C3483b f3177e;

        c(ViewGroup viewGroup, View view, Fragment fragment, C0471t.g gVar, C3483b c3483b) {
            this.f3173a = viewGroup;
            this.f3174b = view;
            this.f3175c = fragment;
            this.f3176d = gVar;
            this.f3177e = c3483b;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3173a.endViewTransition(this.f3174b);
            Animator animator2 = this.f3175c.getAnimator();
            this.f3175c.setAnimator(null);
            if (animator2 == null || this.f3173a.indexOfChild(this.f3174b) >= 0) {
                return;
            }
            this.f3176d.mo2518b(this.f3175c, this.f3177e);
        }
    }

    /* renamed from: a */
    static void m2586a(Fragment fragment, d dVar, C0471t.g gVar) {
        View view = fragment.mView;
        ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        C3483b c3483b = new C3483b();
        c3483b.m10557c(new a(fragment));
        gVar.mo2517a(fragment, c3483b);
        if (dVar.f3178a != null) {
            e eVar = new e(dVar.f3178a, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            eVar.setAnimationListener(new b(viewGroup, fragment, gVar, c3483b));
            fragment.mView.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.f3179b;
        fragment.setAnimator(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, c3483b));
        animator.setTarget(fragment.mView);
        animator.start();
    }

    /* renamed from: b */
    private static int m2587b(Fragment fragment, boolean z3, boolean z4) {
        return z4 ? z3 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z3 ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    /* renamed from: c */
    static d m2588c(Context context, Fragment fragment, boolean z3, boolean z4) {
        int nextTransition = fragment.getNextTransition();
        int iM2587b = m2587b(fragment, z3, z4);
        boolean z5 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i4 = C2663b.f10587c;
            if (viewGroup.getTag(i4) != null) {
                fragment.mContainer.setTag(i4, null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z3, iM2587b);
        if (animationOnCreateAnimation != null) {
            return new d(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z3, iM2587b);
        if (animatorOnCreateAnimator != null) {
            return new d(animatorOnCreateAnimator);
        }
        if (iM2587b == 0 && nextTransition != 0) {
            iM2587b = m2589d(nextTransition, z3);
        }
        if (iM2587b != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iM2587b));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iM2587b);
                    if (animationLoadAnimation != null) {
                        return new d(animationLoadAnimation);
                    }
                    z5 = true;
                } catch (Resources.NotFoundException e4) {
                    throw e4;
                } catch (RuntimeException unused) {
                }
            }
            if (!z5) {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iM2587b);
                    if (animatorLoadAnimator != null) {
                        return new d(animatorLoadAnimator);
                    }
                } catch (RuntimeException e5) {
                    if (zEquals) {
                        throw e5;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iM2587b);
                    if (animationLoadAnimation2 != null) {
                        return new d(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    private static int m2589d(int i4, boolean z3) {
        if (i4 == 4097) {
            return z3 ? C2662a.f10583e : C2662a.f10584f;
        }
        if (i4 == 4099) {
            return z3 ? C2662a.f10581c : C2662a.f10582d;
        }
        if (i4 != 8194) {
            return -1;
        }
        return z3 ? C2662a.f10579a : C2662a.f10580b;
    }

    /* renamed from: androidx.fragment.app.d$d */
    static class d {

        /* renamed from: a */
        public final Animation f3178a;

        /* renamed from: b */
        public final Animator f3179b;

        d(Animation animation) {
            this.f3178a = animation;
            this.f3179b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        d(Animator animator) {
            this.f3178a = null;
            this.f3179b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$e */
    static class e extends AnimationSet implements Runnable {

        /* renamed from: a */
        private final ViewGroup f3180a;

        /* renamed from: b */
        private final View f3181b;

        /* renamed from: c */
        private boolean f3182c;

        /* renamed from: d */
        private boolean f3183d;

        /* renamed from: e */
        private boolean f3184e;

        e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f3184e = true;
            this.f3180a = viewGroup;
            this.f3181b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j4, Transformation transformation) {
            this.f3184e = true;
            if (this.f3182c) {
                return !this.f3183d;
            }
            if (!super.getTransformation(j4, transformation)) {
                this.f3182c = true;
                ViewTreeObserverOnPreDrawListenerC0356s.m1974a(this.f3180a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3182c || !this.f3184e) {
                this.f3180a.endViewTransition(this.f3181b);
                this.f3183d = true;
            } else {
                this.f3184e = false;
                this.f3180a.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j4, Transformation transformation, float f4) {
            this.f3184e = true;
            if (this.f3182c) {
                return !this.f3183d;
            }
            if (!super.getTransformation(j4, transformation, f4)) {
                this.f3182c = true;
                ViewTreeObserverOnPreDrawListenerC0356s.m1974a(this.f3180a, this);
            }
            return true;
        }
    }
}
