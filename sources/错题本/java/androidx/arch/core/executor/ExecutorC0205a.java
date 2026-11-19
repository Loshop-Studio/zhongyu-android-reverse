package androidx.arch.core.executor;

import java.util.concurrent.Executor;

/* renamed from: androidx.arch.core.executor.a */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC0205a implements Executor {

    /* renamed from: a */
    public final /* synthetic */ int f192a;

    public /* synthetic */ ExecutorC0205a(int i) {
        this.f192a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f192a) {
            case 0:
                ArchTaskExecutor.lambda$static$0(runnable);
                break;
            case 1:
                ArchTaskExecutor.lambda$static$1(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
