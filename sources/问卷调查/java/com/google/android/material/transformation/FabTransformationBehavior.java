package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p070b.p071a.p072a.p073a.C0561a;
import p070b.p074b.p075a.p076a.C0562a;
import p070b.p074b.p075a.p076a.p079b0.C0565a;
import p070b.p074b.p075a.p076a.p079b0.C0566b;
import p070b.p074b.p075a.p076a.p079b0.C0567c;
import p070b.p074b.p075a.p076a.p079b0.C0568d;
import p070b.p074b.p075a.p076a.p079b0.C0569e;
import p070b.p074b.p075a.p076a.p080c.C0570a;
import p070b.p074b.p075a.p076a.p080c.C0571b;
import p070b.p074b.p075a.p076a.p080c.C0572c;
import p070b.p074b.p075a.p076a.p080c.C0573d;
import p070b.p074b.p075a.p076a.p080c.C0576g;
import p070b.p074b.p075a.p076a.p080c.C0577h;
import p070b.p074b.p075a.p076a.p080c.C0578i;
import p070b.p074b.p075a.p076a.p089l.C0602a;
import p070b.p074b.p075a.p076a.p089l.InterfaceC0604c;

@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final Rect f5077c;

    /* renamed from: d */
    public final RectF f5078d;

    /* renamed from: e */
    public final RectF f5079e;

    /* renamed from: f */
    public final int[] f5080f;

    /* renamed from: g */
    public float f5081g;

    /* renamed from: h */
    public float f5082h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    public class C0951a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f5083a;

        /* renamed from: b */
        public final /* synthetic */ View f5084b;

        /* renamed from: c */
        public final /* synthetic */ View f5085c;

        public C0951a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.f5083a = z;
            this.f5084b = view;
            this.f5085c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f5083a) {
                return;
            }
            this.f5084b.setVisibility(4);
            this.f5085c.setAlpha(1.0f);
            this.f5085c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f5083a) {
                this.f5084b.setVisibility(0);
                this.f5085c.setAlpha(0.0f);
                this.f5085c.setVisibility(4);
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    public static class C0952b {

        /* renamed from: a */
        public C0576g f5086a;

        /* renamed from: b */
        public C0578i f5087b;
    }

    public FabTransformationBehavior() {
        this.f5077c = new Rect();
        this.f5078d = new RectF();
        this.f5079e = new RectF();
        this.f5080f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5077c = new Rect();
        this.f5078d = new RectF();
        this.f5079e = new RectF();
        this.f5080f = new int[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: D */
    public AnimatorSet mo2717D(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList;
        C0952b c0952b;
        InterfaceC0604c interfaceC0604c;
        Animator animatorM2081b;
        ArrayList arrayList2;
        ObjectAnimator objectAnimatorOfInt;
        C0952b c0952bMo2727N = mo2727N(view2.getContext(), z);
        if (z) {
            this.f5081g = view.getTranslationX();
            this.f5082h = view.getTranslationY();
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        m2725L(view, view2, z, z2, c0952bMo2727N, arrayList3);
        RectF rectF = this.f5078d;
        m2726M(view, view2, z, z2, c0952bMo2727N, arrayList3, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float fM2719F = m2719F(view, view2, c0952bMo2727N.f5087b);
        float fM2720G = m2720G(view, view2, c0952bMo2727N.f5087b);
        Pair<C0577h, C0577h> pairM2718E = m2718E(fM2719F, fM2720G, z, c0952bMo2727N);
        C0577h c0577h = (C0577h) pairM2718E.first;
        C0577h c0577h2 = (C0577h) pairM2718E.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            fM2719F = this.f5081g;
        }
        fArr[0] = fM2719F;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            fM2720G = this.f5082h;
        }
        fArr2[0] = fM2720G;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        c0577h.m2105a(objectAnimatorOfFloat);
        c0577h2.m2105a(objectAnimatorOfFloat2);
        arrayList3.add(objectAnimatorOfFloat);
        arrayList3.add(objectAnimatorOfFloat2);
        boolean z3 = view2 instanceof InterfaceC0604c;
        if (z3 && (view instanceof ImageView)) {
            InterfaceC0604c interfaceC0604c2 = (InterfaceC0604c) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, C0573d.f3541b, 0);
                } else {
                    objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, C0573d.f3541b, 255);
                }
                objectAnimatorOfInt.addUpdateListener(new C0565a(this, view2));
                c0952bMo2727N.f5086a.m2104d("iconFade").m2105a(objectAnimatorOfInt);
                arrayList3.add(objectAnimatorOfInt);
                arrayList4.add(new C0566b(this, interfaceC0604c2, drawable));
            }
        }
        if (z3) {
            InterfaceC0604c interfaceC0604c3 = (InterfaceC0604c) view2;
            C0578i c0578i = c0952bMo2727N.f5087b;
            RectF rectF2 = this.f5078d;
            RectF rectF3 = this.f5079e;
            m2722I(view, rectF2);
            rectF2.offset(this.f5081g, this.f5082h);
            m2722I(view2, rectF3);
            rectF3.offset(-m2719F(view, view2, c0578i), 0.0f);
            float fCenterX = rectF2.centerX() - rectF3.left;
            C0578i c0578i2 = c0952bMo2727N.f5087b;
            RectF rectF4 = this.f5078d;
            RectF rectF5 = this.f5079e;
            m2722I(view, rectF4);
            rectF4.offset(this.f5081g, this.f5082h);
            m2722I(view2, rectF5);
            rectF5.offset(0.0f, -m2720G(view, view2, c0578i2));
            float fCenterY = rectF4.centerY() - rectF5.top;
            ((FloatingActionButton) view).m2669g(this.f5077c);
            float fWidth2 = this.f5077c.width() / 2.0f;
            C0577h c0577hM2104d = c0952bMo2727N.f5086a.m2104d("expansion");
            if (z) {
                if (!z2) {
                    interfaceC0604c3.setRevealInfo(new InterfaceC0604c.e(fCenterX, fCenterY, fWidth2));
                }
                if (z2) {
                    fWidth2 = interfaceC0604c3.getRevealInfo().f3701c;
                }
                float fM2083d = C0562a.m2083d(fCenterX, fCenterY, 0.0f, 0.0f);
                float fM2083d2 = C0562a.m2083d(fCenterX, fCenterY, fWidth, 0.0f);
                float fM2083d3 = C0562a.m2083d(fCenterX, fCenterY, fWidth, fHeight);
                float fM2083d4 = C0562a.m2083d(fCenterX, fCenterY, 0.0f, fHeight);
                if (fM2083d <= fM2083d2 || fM2083d <= fM2083d3 || fM2083d <= fM2083d4) {
                    fM2083d = (fM2083d2 <= fM2083d3 || fM2083d2 <= fM2083d4) ? fM2083d3 > fM2083d4 ? fM2083d3 : fM2083d4 : fM2083d2;
                }
                animatorM2081b = C0562a.m2081b(interfaceC0604c3, fCenterX, fCenterY, fM2083d);
                animatorM2081b.addListener(new C0567c(this, interfaceC0604c3));
                long j = c0577hM2104d.f3549a;
                int i = (int) fCenterX;
                int i2 = (int) fCenterY;
                if (j > 0) {
                    Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i, i2, fWidth2, fWidth2);
                    animatorCreateCircularReveal.setStartDelay(0L);
                    animatorCreateCircularReveal.setDuration(j);
                    arrayList3.add(animatorCreateCircularReveal);
                }
                interfaceC0604c = interfaceC0604c3;
                arrayList = arrayList4;
                c0952b = c0952bMo2727N;
            } else {
                float f2 = interfaceC0604c3.getRevealInfo().f3701c;
                Animator animatorM2081b2 = C0562a.m2081b(interfaceC0604c3, fCenterX, fCenterY, fWidth2);
                long j2 = c0577hM2104d.f3549a;
                int i3 = (int) fCenterX;
                int i4 = (int) fCenterY;
                if (j2 > 0) {
                    Animator animatorCreateCircularReveal2 = ViewAnimationUtils.createCircularReveal(view2, i3, i4, f2, f2);
                    animatorCreateCircularReveal2.setStartDelay(0L);
                    animatorCreateCircularReveal2.setDuration(j2);
                    arrayList3.add(animatorCreateCircularReveal2);
                }
                long j3 = c0577hM2104d.f3549a;
                long j4 = c0577hM2104d.f3550b;
                C0576g c0576g = c0952bMo2727N.f5086a;
                int i5 = c0576g.f3547a.f950d;
                arrayList = arrayList4;
                c0952b = c0952bMo2727N;
                int i6 = 0;
                long jMax = 0;
                while (i6 < i5) {
                    int i7 = i5;
                    C0577h c0577hM517k = c0576g.f3547a.m517k(i6);
                    jMax = Math.max(jMax, c0577hM517k.f3549a + c0577hM517k.f3550b);
                    i6++;
                    i5 = i7;
                    interfaceC0604c3 = interfaceC0604c3;
                    i3 = i3;
                    c0576g = c0576g;
                }
                interfaceC0604c = interfaceC0604c3;
                int i8 = i3;
                long j5 = j3 + j4;
                if (j5 < jMax) {
                    Animator animatorCreateCircularReveal3 = ViewAnimationUtils.createCircularReveal(view2, i8, i4, fWidth2, fWidth2);
                    animatorCreateCircularReveal3.setStartDelay(j5);
                    animatorCreateCircularReveal3.setDuration(jMax - j5);
                    arrayList3.add(animatorCreateCircularReveal3);
                }
                animatorM2081b = animatorM2081b2;
            }
            c0577hM2104d.m2105a(animatorM2081b);
            arrayList3.add(animatorM2081b);
            arrayList2 = arrayList;
            arrayList2.add(new C0602a(interfaceC0604c));
        } else {
            c0952b = c0952bMo2727N;
            arrayList2 = arrayList4;
        }
        m2724K(view, view2, z, z2, c0952b, arrayList3);
        m2723J(view2, z, z2, c0952b, arrayList3);
        AnimatorSet animatorSet = new AnimatorSet();
        C0562a.m2093n(animatorSet, arrayList3);
        animatorSet.addListener(new C0951a(this, z, view2, view));
        int size = arrayList2.size();
        for (int i9 = 0; i9 < size; i9++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i9));
        }
        return animatorSet;
    }

    /* renamed from: E */
    public final Pair<C0577h, C0577h> m2718E(float f2, float f3, boolean z, C0952b c0952b) {
        C0577h c0577hM2104d;
        C0576g c0576g;
        String str;
        if (f2 == 0.0f || f3 == 0.0f) {
            c0577hM2104d = c0952b.f5086a.m2104d("translationXLinear");
            c0576g = c0952b.f5086a;
            str = "translationYLinear";
        } else if ((!z || f3 >= 0.0f) && (z || f3 <= 0.0f)) {
            c0577hM2104d = c0952b.f5086a.m2104d("translationXCurveDownwards");
            c0576g = c0952b.f5086a;
            str = "translationYCurveDownwards";
        } else {
            c0577hM2104d = c0952b.f5086a.m2104d("translationXCurveUpwards");
            c0576g = c0952b.f5086a;
            str = "translationYCurveUpwards";
        }
        return new Pair<>(c0577hM2104d, c0576g.m2104d(str));
    }

    /* renamed from: F */
    public final float m2719F(View view, View view2, C0578i c0578i) {
        RectF rectF = this.f5078d;
        RectF rectF2 = this.f5079e;
        m2722I(view, rectF);
        rectF.offset(this.f5081g, this.f5082h);
        m2722I(view2, rectF2);
        Objects.requireNonNull(c0578i);
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    /* renamed from: G */
    public final float m2720G(View view, View view2, C0578i c0578i) {
        RectF rectF = this.f5078d;
        RectF rectF2 = this.f5079e;
        m2722I(view, rectF);
        rectF.offset(this.f5081g, this.f5082h);
        m2722I(view2, rectF2);
        Objects.requireNonNull(c0578i);
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    /* renamed from: H */
    public final float m2721H(C0952b c0952b, C0577h c0577h, float f2, float f3) {
        long j = c0577h.f3549a;
        long j2 = c0577h.f3550b;
        C0577h c0577hM2104d = c0952b.f5086a.m2104d("expansion");
        float interpolation = c0577h.m2106b().getInterpolation((((c0577hM2104d.f3549a + c0577hM2104d.f3550b) + 17) - j) / j2);
        TimeInterpolator timeInterpolator = C0570a.f3534a;
        return C0561a.m2073a(f3, f2, interpolation, f2);
    }

    /* renamed from: I */
    public final void m2722I(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f5080f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* renamed from: J */
    public final void m2723J(View view, boolean z, boolean z2, C0952b c0952b, List list) {
        ViewGroup viewGroupM2728O;
        ObjectAnimator objectAnimatorOfFloat;
        if (view instanceof ViewGroup) {
            boolean z3 = view instanceof InterfaceC0604c;
            View viewFindViewById = view.findViewById(C1088R.id.mtrl_child_content_container);
            if (viewFindViewById != null) {
                viewGroupM2728O = m2728O(viewFindViewById);
            } else {
                if ((view instanceof C0569e) || (view instanceof C0568d)) {
                    view = ((ViewGroup) view).getChildAt(0);
                }
                viewGroupM2728O = m2728O(view);
            }
            if (viewGroupM2728O == null) {
                return;
            }
            if (z) {
                if (!z2) {
                    C0572c.f3540a.set(viewGroupM2728O, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupM2728O, C0572c.f3540a, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupM2728O, C0572c.f3540a, 0.0f);
            }
            c0952b.f5086a.m2104d("contentFade").m2105a(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: K */
    public final void m2724K(View view, View view2, boolean z, boolean z2, C0952b c0952b, List list) {
        ObjectAnimator objectAnimatorOfInt;
        if (view2 instanceof InterfaceC0604c) {
            InterfaceC0604c interfaceC0604c = (InterfaceC0604c) view2;
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            ColorStateList backgroundTintList = view.getBackgroundTintList();
            int colorForState = backgroundTintList != null ? backgroundTintList.getColorForState(view.getDrawableState(), backgroundTintList.getDefaultColor()) : 0;
            int i = 16777215 & colorForState;
            if (z) {
                if (!z2) {
                    interfaceC0604c.setCircularRevealScrimColor(colorForState);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(interfaceC0604c, InterfaceC0604c.d.f3698a, i);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(interfaceC0604c, InterfaceC0604c.d.f3698a, colorForState);
            }
            objectAnimatorOfInt.setEvaluator(C0571b.f3539a);
            c0952b.f5086a.m2104d("color").m2105a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
        }
    }

    @TargetApi(21)
    /* renamed from: L */
    public final void m2725L(View view, View view2, boolean z, boolean z2, C0952b c0952b, List list) {
        ObjectAnimator objectAnimatorOfFloat;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        float elevation = view2.getElevation() - view.getElevation();
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-elevation);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        c0952b.f5086a.m2104d("elevation").m2105a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    /* renamed from: M */
    public final void m2726M(View view, View view2, boolean z, boolean z2, C0952b c0952b, List list, RectF rectF) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fM2719F = m2719F(view, view2, c0952b.f5087b);
        float fM2720G = m2720G(view, view2, c0952b.f5087b);
        Pair<C0577h, C0577h> pairM2718E = m2718E(fM2719F, fM2720G, z, c0952b);
        C0577h c0577h = (C0577h) pairM2718E.first;
        C0577h c0577h2 = (C0577h) pairM2718E.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-fM2719F);
                view2.setTranslationY(-fM2720G);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float fM2721H = m2721H(c0952b, c0577h, -fM2719F, 0.0f);
            float fM2721H2 = m2721H(c0952b, c0577h2, -fM2720G, 0.0f);
            Rect rect = this.f5077c;
            view2.getWindowVisibleDisplayFrame(rect);
            RectF rectF2 = this.f5078d;
            rectF2.set(rect);
            RectF rectF3 = this.f5079e;
            m2722I(view2, rectF3);
            rectF3.offset(fM2721H, fM2721H2);
            rectF3.intersect(rectF2);
            rectF.set(rectF3);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fM2719F);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fM2720G);
        }
        c0577h.m2105a(objectAnimatorOfFloat);
        c0577h2.m2105a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    /* renamed from: N */
    public abstract C0952b mo2727N(Context context, boolean z);

    /* renamed from: O */
    public final ViewGroup m2728O(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: d */
    public boolean mo1667d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: f */
    public void mo1669f(CoordinatorLayout.C0506f c0506f) {
        if (c0506f.f3121h == 0) {
            c0506f.f3121h = 80;
        }
    }
}
