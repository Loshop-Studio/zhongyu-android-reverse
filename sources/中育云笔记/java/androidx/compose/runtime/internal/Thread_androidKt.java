package androidx.compose.runtime.internal;

import android.os.Looper;

/* loaded from: classes2.dex */
public final class Thread_androidKt {
    private static final long MainThreadId;

    static {
        long id2;
        try {
            id2 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id2 = -1;
        }
        MainThreadId = id2;
    }

    public static final long getMainThreadId() {
        return MainThreadId;
    }
}
