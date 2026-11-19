package p000a.p063q;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: a.q.u */
/* loaded from: classes.dex */
public class C0430u extends C0429t {

    /* renamed from: d */
    public static boolean f2467d = true;

    /* renamed from: e */
    public static boolean f2468e = true;

    @Override // p000a.p063q.C0434y
    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public void mo1483g(View view, Matrix matrix) {
        if (f2467d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f2467d = false;
            }
        }
    }

    @Override // p000a.p063q.C0434y
    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public void mo1484h(View view, Matrix matrix) {
        if (f2468e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f2468e = false;
            }
        }
    }
}
