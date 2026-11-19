package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class MutationInterruptedException extends CancellationException {
    public static final int $stable = 0;

    public MutationInterruptedException() {
        super("Mutation interrupted");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
