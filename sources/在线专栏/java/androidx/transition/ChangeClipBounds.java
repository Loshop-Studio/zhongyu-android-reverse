package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0358u;

/* loaded from: classes.dex */
public class ChangeClipBounds extends Transition {

    /* renamed from: a */
    private static final String[] f4301a = {"android:clipBounds:clip"};

    /* renamed from: androidx.transition.ChangeClipBounds$a */
    class C0681a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f4302a;

        C0681a(View view) {
            this.f4302a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0358u.m2063w0(this.f4302a, null);
        }
    }

    public ChangeClipBounds() {
    }

    private void captureValues(C0752x c0752x) {
        View view = c0752x.f4483b;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect rectM2054s = C0358u.m2054s(view);
        c0752x.f4482a.put("android:clipBounds:clip", rectM2054s);
        if (rectM2054s == null) {
            c0752x.f4482a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(C0752x c0752x) {
        captureValues(c0752x);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(C0752x c0752x) {
        captureValues(c0752x);
    }

    @Override // androidx.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, C0752x c0752x, C0752x c0752x2) {
        ObjectAnimator objectAnimatorOfObject = null;
        if (c0752x != null && c0752x2 != null && c0752x.f4482a.containsKey("android:clipBounds:clip") && c0752x2.f4482a.containsKey("android:clipBounds:clip")) {
            Rect rect = (Rect) c0752x.f4482a.get("android:clipBounds:clip");
            Rect rect2 = (Rect) c0752x2.f4482a.get("android:clipBounds:clip");
            boolean z3 = rect2 == null;
            if (rect == null && rect2 == null) {
                return null;
            }
            if (rect == null) {
                rect = (Rect) c0752x.f4482a.get("android:clipBounds:bounds");
            } else if (rect2 == null) {
                rect2 = (Rect) c0752x2.f4482a.get("android:clipBounds:bounds");
            }
            if (rect.equals(rect2)) {
                return null;
            }
            C0358u.m2063w0(c0752x2.f4483b, rect);
            objectAnimatorOfObject = ObjectAnimator.ofObject(c0752x2.f4483b, (Property<View, V>) C0725f0.f4417c, (TypeEvaluator) new C0744p(new Rect()), (Object[]) new Rect[]{rect, rect2});
            if (z3) {
                objectAnimatorOfObject.addListener(new C0681a(c0752x2.f4483b));
            }
        }
        return objectAnimatorOfObject;
    }

    @Override // androidx.transition.Transition
    public String[] getTransitionProperties() {
        return f4301a;
    }

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
