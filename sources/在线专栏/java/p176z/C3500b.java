package p176z;

import android.os.Handler;
import android.os.Looper;

/* renamed from: z.b */
/* loaded from: classes.dex */
class C3500b {
    /* renamed from: a */
    static Handler m10642a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
