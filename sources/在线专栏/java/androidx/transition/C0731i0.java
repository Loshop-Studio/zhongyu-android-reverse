package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: androidx.transition.i0 */
/* loaded from: classes.dex */
class C0731i0 extends C0729h0 {

    /* renamed from: g */
    private static boolean f4438g = true;

    C0731i0() {
    }

    @Override // androidx.transition.C0737l0
    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo3896e(View view, int i4, int i5, int i6, int i7) {
        if (f4438g) {
            try {
                view.setLeftTopRightBottom(i4, i5, i6, i7);
            } catch (NoSuchMethodError unused) {
                f4438g = false;
            }
        }
    }
}
