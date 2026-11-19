package p070b.p074b.p075a.p076a.p095q;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import p070b.p074b.p075a.p076a.p100v.InterfaceC0668b;

/* renamed from: b.b.a.a.q.g */
/* loaded from: classes.dex */
public class C0644g extends C0641d {
    public C0644g(FloatingActionButton floatingActionButton, InterfaceC0668b interfaceC0668b) {
        super(floatingActionButton, interfaceC0668b);
    }

    @Override // p070b.p074b.p075a.p076a.p095q.C0641d
    /* renamed from: c */
    public float mo2220c() {
        return this.f3860s.getElevation();
    }

    @Override // p070b.p074b.p075a.p076a.p095q.C0641d
    /* renamed from: d */
    public void mo2221d(Rect rect) {
        if (FloatingActionButton.this.f4948k) {
            super.mo2221d(rect);
        } else {
            int sizeDimension = m2235r() ? 0 : (0 - this.f3860s.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // p070b.p074b.p075a.p076a.p095q.C0641d
    /* renamed from: g */
    public void mo2224g() {
    }

    @Override // p070b.p074b.p075a.p076a.p095q.C0641d
    /* renamed from: h */
    public void mo2225h() {
        m2237t();
        throw null;
    }

    @Override // p070b.p074b.p075a.p076a.p095q.C0641d
    /* renamed from: i */
    public void mo2226i(int[] iArr) {
    }

    @Override // p070b.p074b.p075a.p076a.p095q.C0641d
    /* renamed from: j */
    public void mo2227j(float f2, float f3, float f4) {
        int i = Build.VERSION.SDK_INT;
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(C0641d.f3835A, m2241u(f2, f4));
        stateListAnimator.addState(C0641d.f3836B, m2241u(f2, f3));
        stateListAnimator.addState(C0641d.f3837C, m2241u(f2, f3));
        stateListAnimator.addState(C0641d.f3838D, m2241u(f2, f3));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f3860s, "elevation", f2).setDuration(0L));
        if (i <= 24) {
            FloatingActionButton floatingActionButton = this.f3860s;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f3860s, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(C0641d.f3841z);
        stateListAnimator.addState(C0641d.f3839E, animatorSet);
        stateListAnimator.addState(C0641d.f3840F, m2241u(0.0f, 0.0f));
        this.f3860s.setStateListAnimator(stateListAnimator);
        if (mo2233p()) {
            m2237t();
            throw null;
        }
    }

    @Override // p070b.p074b.p075a.p076a.p095q.C0641d
    /* renamed from: m */
    public boolean mo2230m() {
        return false;
    }

    @Override // p070b.p074b.p075a.p076a.p095q.C0641d
    /* renamed from: o */
    public void mo2232o(ColorStateList colorStateList) {
    }

    @Override // p070b.p074b.p075a.p076a.p095q.C0641d
    /* renamed from: p */
    public boolean mo2233p() {
        return FloatingActionButton.this.f4948k || !m2235r();
    }

    @Override // p070b.p074b.p075a.p076a.p095q.C0641d
    /* renamed from: s */
    public void mo2236s() {
    }

    /* renamed from: u */
    public final Animator m2241u(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f3860s, "elevation", f2).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f3860s, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f3).setDuration(100L));
        animatorSet.setInterpolator(C0641d.f3841z);
        return animatorSet;
    }
}
