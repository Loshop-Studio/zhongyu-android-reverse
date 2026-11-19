package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* renamed from: androidx.fragment.app.e */
/* loaded from: classes.dex */
public abstract class AbstractC0456e {
    @Deprecated
    /* renamed from: b */
    public Fragment m2590b(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    /* renamed from: c */
    public abstract View mo2371c(int i4);

    /* renamed from: d */
    public abstract boolean mo2372d();
}
