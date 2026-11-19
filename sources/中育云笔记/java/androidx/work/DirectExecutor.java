package androidx.work;

import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC9979u;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public enum DirectExecutor implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        AbstractC9979u.m20294g(command, "command");
        command.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
