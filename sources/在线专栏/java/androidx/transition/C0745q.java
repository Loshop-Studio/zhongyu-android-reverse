package androidx.transition;

import android.view.ViewGroup;

/* renamed from: androidx.transition.q */
/* loaded from: classes.dex */
public class C0745q {

    /* renamed from: a */
    private ViewGroup f4454a;

    /* renamed from: b */
    private Runnable f4455b;

    /* renamed from: b */
    public static C0745q m3912b(ViewGroup viewGroup) {
        return (C0745q) viewGroup.getTag(C0742o.f4450e);
    }

    /* renamed from: c */
    static void m3913c(ViewGroup viewGroup, C0745q c0745q) {
        viewGroup.setTag(C0742o.f4450e, c0745q);
    }

    /* renamed from: a */
    public void m3914a() {
        Runnable runnable;
        if (m3912b(this.f4454a) != this || (runnable = this.f4455b) == null) {
            return;
        }
        runnable.run();
    }
}
