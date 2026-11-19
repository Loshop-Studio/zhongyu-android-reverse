package p000a.p063q;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: a.q.x */
/* loaded from: classes.dex */
public class C0433x extends C0432w {
    @Override // p000a.p063q.C0429t, p000a.p063q.C0434y
    /* renamed from: b */
    public float mo1480b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p000a.p063q.C0431v, p000a.p063q.C0434y
    /* renamed from: d */
    public void mo1485d(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p000a.p063q.C0429t, p000a.p063q.C0434y
    /* renamed from: e */
    public void mo1482e(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // p000a.p063q.C0432w, p000a.p063q.C0434y
    /* renamed from: f */
    public void mo1486f(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p000a.p063q.C0430u, p000a.p063q.C0434y
    /* renamed from: g */
    public void mo1483g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p000a.p063q.C0430u, p000a.p063q.C0434y
    /* renamed from: h */
    public void mo1484h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
