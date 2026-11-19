package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: androidx.transition.k0 */
/* loaded from: classes.dex */
class C0735k0 extends C0733j0 {
    C0735k0() {
    }

    @Override // androidx.transition.C0727g0, androidx.transition.C0737l0
    /* renamed from: b */
    public float mo3878b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // androidx.transition.C0729h0, androidx.transition.C0737l0
    /* renamed from: d */
    public void mo3886d(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // androidx.transition.C0731i0, androidx.transition.C0737l0
    /* renamed from: e */
    public void mo3896e(View view, int i4, int i5, int i6, int i7) {
        view.setLeftTopRightBottom(i4, i5, i6, i7);
    }

    @Override // androidx.transition.C0727g0, androidx.transition.C0737l0
    /* renamed from: f */
    public void mo3880f(View view, float f4) {
        view.setTransitionAlpha(f4);
    }

    @Override // androidx.transition.C0733j0, androidx.transition.C0737l0
    /* renamed from: g */
    public void mo3899g(View view, int i4) {
        view.setTransitionVisibility(i4);
    }

    @Override // androidx.transition.C0729h0, androidx.transition.C0737l0
    /* renamed from: h */
    public void mo3887h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.C0729h0, androidx.transition.C0737l0
    /* renamed from: i */
    public void mo3888i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
