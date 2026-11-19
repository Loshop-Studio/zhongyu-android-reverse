package p122df;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: df.a */
/* loaded from: classes6.dex */
public final class ExecutorC9026a implements Executor {

    /* renamed from: c */
    public final Handler f21021c = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f21021c.post(runnable);
    }
}
