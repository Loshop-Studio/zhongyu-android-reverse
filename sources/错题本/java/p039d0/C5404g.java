package p039d0;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import p129o2.C6268a;

/* renamed from: d0.g */
/* loaded from: classes2.dex */
public final class C5404g {

    /* renamed from: e */
    public static final int f8356e;

    /* renamed from: a */
    public final Context f8357a;

    /* renamed from: b */
    public final ActivityManager f8358b;

    /* renamed from: c */
    public final C6268a f8359c;

    /* renamed from: d */
    public final float f8360d;

    static {
        f8356e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public C5404g(Context context) {
        this.f8360d = f8356e;
        this.f8357a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f8358b = activityManager;
        this.f8359c = new C6268a(context.getResources().getDisplayMetrics(), 13);
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.f8360d = 0.0f;
    }
}
