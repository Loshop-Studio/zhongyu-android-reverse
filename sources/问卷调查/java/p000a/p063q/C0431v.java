package p000a.p063q;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: a.q.v */
/* loaded from: classes.dex */
public class C0431v extends C0430u {

    /* renamed from: f */
    public static boolean f2469f = true;

    @Override // p000a.p063q.C0434y
    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public void mo1485d(View view, int i, int i2, int i3, int i4) {
        if (f2469f) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f2469f = false;
            }
        }
    }
}
