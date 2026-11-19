package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class ChangeScroll extends Transition {

    /* renamed from: a */
    private static final String[] f4308a = {"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll() {
    }

    private void captureValues(C0752x c0752x) {
        c0752x.f4482a.put("android:changeScroll:x", Integer.valueOf(c0752x.f4483b.getScrollX()));
        c0752x.f4482a.put("android:changeScroll:y", Integer.valueOf(c0752x.f4483b.getScrollY()));
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
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2 = null;
        if (c0752x == null || c0752x2 == null) {
            return null;
        }
        View view = c0752x2.f4483b;
        int iIntValue = ((Integer) c0752x.f4482a.get("android:changeScroll:x")).intValue();
        int iIntValue2 = ((Integer) c0752x2.f4482a.get("android:changeScroll:x")).intValue();
        int iIntValue3 = ((Integer) c0752x.f4482a.get("android:changeScroll:y")).intValue();
        int iIntValue4 = ((Integer) c0752x2.f4482a.get("android:changeScroll:y")).intValue();
        if (iIntValue != iIntValue2) {
            view.setScrollX(iIntValue);
            objectAnimatorOfInt = ObjectAnimator.ofInt(view, "scrollX", iIntValue, iIntValue2);
        } else {
            objectAnimatorOfInt = null;
        }
        if (iIntValue3 != iIntValue4) {
            view.setScrollY(iIntValue3);
            objectAnimatorOfInt2 = ObjectAnimator.ofInt(view, "scrollY", iIntValue3, iIntValue4);
        }
        return C0751w.m3925c(objectAnimatorOfInt, objectAnimatorOfInt2);
    }

    @Override // androidx.transition.Transition
    public String[] getTransitionProperties() {
        return f4308a;
    }

    public ChangeScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
