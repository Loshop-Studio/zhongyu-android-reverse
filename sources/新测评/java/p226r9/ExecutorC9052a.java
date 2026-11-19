package p226r9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: r9.a */
/* loaded from: classes5.dex */
public final class ExecutorC9052a implements Executor {

    /* renamed from: a */
    public final Handler f15518a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f15518a.post(runnable);
    }
}
