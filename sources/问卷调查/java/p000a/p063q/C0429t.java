package p000a.p063q;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: a.q.t */
/* loaded from: classes.dex */
public class C0429t extends C0434y {

    /* renamed from: c */
    public static boolean f2466c = true;

    @Override // p000a.p063q.C0434y
    /* renamed from: a */
    public void mo1479a(View view) {
    }

    @Override // p000a.p063q.C0434y
    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public float mo1480b(View view) {
        if (f2466c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f2466c = false;
            }
        }
        return view.getAlpha();
    }

    @Override // p000a.p063q.C0434y
    /* renamed from: c */
    public void mo1481c(View view) {
    }

    @Override // p000a.p063q.C0434y
    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo1482e(View view, float f2) {
        if (f2466c) {
            try {
                view.setTransitionAlpha(f2);
                return;
            } catch (NoSuchMethodError unused) {
                f2466c = false;
            }
        }
        view.setAlpha(f2);
    }
}
