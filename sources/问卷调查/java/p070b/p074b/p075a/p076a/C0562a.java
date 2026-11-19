package p070b.p074b.p075a.p076a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewParent;
import java.util.List;
import java.util.WeakHashMap;
import p000a.p005b.p007d.p008a.C0034a;
import p000a.p005b.p014h.C0110u0;
import p000a.p031h.p035d.C0202a;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p070b.p074b.p075a.p076a.p089l.InterfaceC0604c;
import p070b.p074b.p075a.p076a.p093o.C0636a;
import p070b.p074b.p075a.p076a.p101w.C0672d;
import p070b.p074b.p075a.p076a.p101w.C0673e;
import p070b.p074b.p075a.p076a.p101w.C0675g;
import p070b.p074b.p075a.p076a.p101w.C0677i;

/* renamed from: b.b.a.a.a */
/* loaded from: classes.dex */
public final class C0562a {
    /* renamed from: a */
    public static void m2080a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static Animator m2081b(InterfaceC0604c interfaceC0604c, float f2, float f3, float f4) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(interfaceC0604c, (Property<InterfaceC0604c, V>) InterfaceC0604c.c.f3697a, (TypeEvaluator) InterfaceC0604c.b.f3695b, (Object[]) new InterfaceC0604c.e[]{new InterfaceC0604c.e(f2, f3, f4)});
        InterfaceC0604c.e revealInfo = interfaceC0604c.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) interfaceC0604c, (int) f2, (int) f3, revealInfo.f3701c, f4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }

    /* renamed from: c */
    public static C0672d m2082c(int i) {
        return i != 0 ? i != 1 ? new C0677i() : new C0673e() : new C0677i();
    }

    /* renamed from: d */
    public static float m2083d(float f2, float f3, float f4, float f5) {
        return (float) Math.hypot(f4 - f2, f5 - f3);
    }

    /* renamed from: e */
    public static int m2084e(Context context, int i, int i2) {
        TypedValue typedValueM2094o = m2094o(context, i);
        return typedValueM2094o != null ? typedValueM2094o.data : i2;
    }

    /* renamed from: f */
    public static int m2085f(View view, int i) {
        return m2096q(view.getContext(), i, view.getClass().getCanonicalName());
    }

    /* renamed from: g */
    public static ColorStateList m2086g(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            ThreadLocal<TypedValue> threadLocal = C0034a.f211a;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i);
    }

    /* renamed from: h */
    public static ColorStateList m2087h(Context context, C0110u0 c0110u0, int i) {
        int resourceId;
        if (c0110u0.f810b.hasValue(i) && (resourceId = c0110u0.f810b.getResourceId(i, 0)) != 0) {
            ThreadLocal<TypedValue> threadLocal = C0034a.f211a;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return c0110u0.m417c(i);
    }

    /* renamed from: i */
    public static Drawable m2088i(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableM129a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableM129a = C0034a.m129a(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableM129a;
    }

    /* renamed from: j */
    public static boolean m2089j(View view) {
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        return view.getLayoutDirection() == 1;
    }

    /* renamed from: k */
    public static int m2090k(int i, int i2, float f2) {
        return C0202a.m755a(C0202a.m757c(i2, Math.round(Color.alpha(i2) * f2)), i);
    }

    /* renamed from: l */
    public static float m2091l(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    /* renamed from: m */
    public static PorterDuff.Mode m2092m(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: n */
    public static void m2093n(AnimatorSet animatorSet, List<Animator> list) {
        int size = list.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = list.get(i);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        list.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(list);
    }

    /* renamed from: o */
    public static TypedValue m2094o(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: p */
    public static boolean m2095p(Context context, int i, boolean z) {
        TypedValue typedValueM2094o = m2094o(context, i);
        return (typedValueM2094o == null || typedValueM2094o.type != 18) ? z : typedValueM2094o.data != 0;
    }

    /* renamed from: q */
    public static int m2096q(Context context, int i, String str) {
        TypedValue typedValueM2094o = m2094o(context, i);
        if (typedValueM2094o != null) {
            return typedValueM2094o.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* renamed from: r */
    public static void m2097r(View view, float f2) {
        Drawable background = view.getBackground();
        if (background instanceof C0675g) {
            C0675g c0675g = (C0675g) background;
            C0675g.b bVar = c0675g.f3998b;
            if (bVar.f4035o != f2) {
                bVar.f4035o = f2;
                c0675g.m2303w();
            }
        }
    }

    /* renamed from: s */
    public static void m2098s(View view, C0675g c0675g) {
        C0636a c0636a = c0675g.f3998b.f4022b;
        if (c0636a != null && c0636a.f3822a) {
            float elevation = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                elevation += ((View) parent).getElevation();
            }
            C0675g.b bVar = c0675g.f3998b;
            if (bVar.f4034n != elevation) {
                bVar.f4034n = elevation;
                c0675g.m2303w();
            }
        }
    }

    /* renamed from: t */
    public static PorterDuffColorFilter m2099t(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
