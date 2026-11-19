package androidx.core.view;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: androidx.core.view.t */
/* loaded from: classes.dex */
public final class C0357t {

    /* renamed from: a */
    private Object f2748a;

    private C0357t(Object obj) {
        this.f2748a = obj;
    }

    /* renamed from: b */
    public static C0357t m1976b(Context context, int i4) {
        return Build.VERSION.SDK_INT >= 24 ? new C0357t(PointerIcon.getSystemIcon(context, i4)) : new C0357t(null);
    }

    /* renamed from: a */
    public Object m1977a() {
        return this.f2748a;
    }
}
