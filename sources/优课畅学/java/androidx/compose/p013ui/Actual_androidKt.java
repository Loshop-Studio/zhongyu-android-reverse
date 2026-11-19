package androidx.compose.p013ui;

import android.os.Handler;
import android.os.Looper;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public final class Actual_androidKt {
    private static final Handler handler = new Handler(Looper.getMainLooper());

    public static final long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public static final Object postDelayed(long j10, final InterfaceC10559a interfaceC10559a) {
        Runnable runnable = new Runnable() { // from class: androidx.compose.ui.a
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC10559a.invoke();
            }
        };
        handler.postDelayed(runnable, j10);
        return runnable;
    }

    public static final void removePost(Object obj) {
        if ((obj instanceof Runnable ? (Runnable) obj : null) == null) {
            return;
        }
        handler.removeCallbacks((Runnable) obj);
    }
}
