package p000a.p063q;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* renamed from: a.q.w */
/* loaded from: classes.dex */
public class C0432w extends C0431v {

    /* renamed from: g */
    public static boolean f2470g = true;

    @Override // p000a.p063q.C0434y
    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo1486f(View view, int i) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo1486f(view, i);
        } else if (f2470g) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f2470g = false;
            }
        }
    }
}
