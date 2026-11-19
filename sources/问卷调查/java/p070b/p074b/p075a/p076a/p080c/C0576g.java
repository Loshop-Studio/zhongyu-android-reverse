package p070b.p074b.p075a.p076a.p080c;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
import p000a.p021e.C0136h;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: b.b.a.a.c.g */
/* loaded from: classes.dex */
public class C0576g {

    /* renamed from: a */
    public final C0136h<String, C0577h> f3547a = new C0136h<>();

    /* renamed from: b */
    public final C0136h<String, PropertyValuesHolder[]> f3548b = new C0136h<>();

    /* renamed from: a */
    public static C0576g m2101a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m2102b(context, resourceId);
    }

    /* renamed from: b */
    public static C0576g m2102b(Context context, int i) throws Resources.NotFoundException {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return m2103c(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return m2103c(arrayList);
        } catch (Exception e2) {
            StringBuilder sbM2079g = C0561a.m2079g("Can't load animation resource ID #0x");
            sbM2079g.append(Integer.toHexString(i));
            Log.w("MotionSpec", sbM2079g.toString(), e2);
            return null;
        }
    }

    /* renamed from: c */
    public static C0576g m2103c(List<Animator> list) {
        C0576g c0576g = new C0576g();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animator = list.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0576g.f3548b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = C0570a.f3535b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = C0570a.f3536c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = C0570a.f3537d;
            }
            C0577h c0577h = new C0577h(startDelay, duration, interpolator);
            c0577h.f3552d = objectAnimator.getRepeatCount();
            c0577h.f3553e = objectAnimator.getRepeatMode();
            c0576g.f3547a.put(propertyName, c0577h);
        }
        return c0576g;
    }

    /* renamed from: d */
    public C0577h m2104d(String str) {
        if (this.f3547a.getOrDefault(str, null) != null) {
            return this.f3547a.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0576g) {
            return this.f3547a.equals(((C0576g) obj).f3547a);
        }
        return false;
    }

    public int hashCode() {
        return this.f3547a.hashCode();
    }

    public String toString() {
        return '\n' + C0576g.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f3547a + "}\n";
    }
}
