package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: androidx.transition.h0 */
/* loaded from: classes.dex */
class C0729h0 extends C0727g0 {

    /* renamed from: d */
    private static boolean f4428d = true;

    /* renamed from: e */
    private static boolean f4429e = true;

    /* renamed from: f */
    private static boolean f4430f = true;

    C0729h0() {
    }

    @Override // androidx.transition.C0737l0
    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public void mo3886d(View view, Matrix matrix) {
        if (f4428d) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f4428d = false;
            }
        }
    }

    @Override // androidx.transition.C0737l0
    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public void mo3887h(View view, Matrix matrix) {
        if (f4429e) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f4429e = false;
            }
        }
    }

    @Override // androidx.transition.C0737l0
    @SuppressLint({"NewApi"})
    /* renamed from: i */
    public void mo3888i(View view, Matrix matrix) {
        if (f4430f) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f4430f = false;
            }
        }
    }
}
