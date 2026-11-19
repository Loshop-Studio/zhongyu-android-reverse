package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0358u;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import p148s.C3369g;

/* loaded from: classes.dex */
public class Fade extends Visibility {

    /* renamed from: androidx.transition.Fade$a */
    class C0691a extends C0748t {

        /* renamed from: a */
        final /* synthetic */ View f4342a;

        C0691a(View view) {
            this.f4342a = view;
        }

        @Override // androidx.transition.Transition.InterfaceC0708g
        public void onTransitionEnd(Transition transition) {
            C0725f0.m3862h(this.f4342a, 1.0f);
            C0725f0.m3855a(this.f4342a);
            transition.removeListener(this);
        }
    }

    /* renamed from: androidx.transition.Fade$b */
    private static class C0692b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f4344a;

        /* renamed from: b */
        private boolean f4345b = false;

        C0692b(View view) {
            this.f4344a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0725f0.m3862h(this.f4344a, 1.0f);
            if (this.f4345b) {
                this.f4344a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (C0358u.m2009R(this.f4344a) && this.f4344a.getLayerType() == 0) {
                this.f4345b = true;
                this.f4344a.setLayerType(2, null);
            }
        }
    }

    public Fade(int i4) {
        setMode(i4);
    }

    /* renamed from: a */
    private Animator m3809a(View view, float f4, float f5) {
        if (f4 == f5) {
            return null;
        }
        C0725f0.m3862h(view, f4);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, C0725f0.f4416b, f5);
        objectAnimatorOfFloat.addListener(new C0692b(view));
        addListener(new C0691a(view));
        return objectAnimatorOfFloat;
    }

    /* renamed from: b */
    private static float m3810b(C0752x c0752x, float f4) {
        Float f5;
        return (c0752x == null || (f5 = (Float) c0752x.f4482a.get("android:fade:transitionAlpha")) == null) ? f4 : f5.floatValue();
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(C0752x c0752x) {
        super.captureStartValues(c0752x);
        c0752x.f4482a.put("android:fade:transitionAlpha", Float.valueOf(C0725f0.m3857c(c0752x.f4483b)));
    }

    @Override // androidx.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, C0752x c0752x, C0752x c0752x2) {
        float f4 = IGoodView.DEFAULT_TO_ALPHA;
        float fM3810b = m3810b(c0752x, IGoodView.DEFAULT_TO_ALPHA);
        if (fM3810b != 1.0f) {
            f4 = fM3810b;
        }
        return m3809a(view, f4, 1.0f);
    }

    @Override // androidx.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, C0752x c0752x, C0752x c0752x2) {
        C0725f0.m3859e(view);
        return m3809a(view, m3810b(c0752x, 1.0f), IGoodView.DEFAULT_TO_ALPHA);
    }

    public Fade() {
    }

    @SuppressLint({"RestrictedApi"})
    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0747s.f4463f);
        setMode(C3369g.m10251g(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, getMode()));
        typedArrayObtainStyledAttributes.recycle();
    }
}
