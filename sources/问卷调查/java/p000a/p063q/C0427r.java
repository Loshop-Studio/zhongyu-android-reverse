package p000a.p063q;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: a.q.r */
/* loaded from: classes.dex */
public class C0427r {

    /* renamed from: a */
    public static boolean f2463a = true;

    /* renamed from: a */
    public static void m1476a(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (f2463a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f2463a = false;
            }
        }
    }
}
