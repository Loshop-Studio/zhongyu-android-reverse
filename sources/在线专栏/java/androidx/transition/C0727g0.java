package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: androidx.transition.g0 */
/* loaded from: classes.dex */
class C0727g0 extends C0737l0 {

    /* renamed from: c */
    private static boolean f4420c = true;

    C0727g0() {
    }

    @Override // androidx.transition.C0737l0
    /* renamed from: a */
    public void mo3877a(View view) {
    }

    @Override // androidx.transition.C0737l0
    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public float mo3878b(View view) {
        if (f4420c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f4420c = false;
            }
        }
        return view.getAlpha();
    }

    @Override // androidx.transition.C0737l0
    /* renamed from: c */
    public void mo3879c(View view) {
    }

    @Override // androidx.transition.C0737l0
    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo3880f(View view, float f4) {
        if (f4420c) {
            try {
                view.setTransitionAlpha(f4);
                return;
            } catch (NoSuchMethodError unused) {
                f4420c = false;
            }
        }
        view.setAlpha(f4);
    }
}
