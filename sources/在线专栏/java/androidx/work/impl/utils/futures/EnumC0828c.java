package androidx.work.impl.utils.futures;

import java.util.concurrent.Executor;

/* renamed from: androidx.work.impl.utils.futures.c */
/* loaded from: classes.dex */
enum EnumC0828c implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
