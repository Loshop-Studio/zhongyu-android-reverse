package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* renamed from: androidx.transition.j0 */
/* loaded from: classes.dex */
class C0733j0 extends C0731i0 {

    /* renamed from: h */
    private static boolean f4439h = true;

    C0733j0() {
    }

    @Override // androidx.transition.C0737l0
    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public void mo3899g(View view, int i4) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo3899g(view, i4);
        } else if (f4439h) {
            try {
                view.setTransitionVisibility(i4);
            } catch (NoSuchMethodError unused) {
                f4439h = false;
            }
        }
    }
}
