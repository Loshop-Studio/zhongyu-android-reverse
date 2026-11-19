package ca;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: ca.a */
/* loaded from: classes5.dex */
public final class ExecutorC5276a implements Executor {

    /* renamed from: a */
    public final Handler f2412a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f2412a.post(runnable);
    }
}
