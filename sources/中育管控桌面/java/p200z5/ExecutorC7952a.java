package p200z5;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: z5.a */
/* loaded from: classes4.dex */
public final class ExecutorC7952a implements Executor {

    /* renamed from: a */
    public final Handler f10673a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f10673a.post(runnable);
    }
}
