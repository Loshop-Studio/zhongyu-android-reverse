package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class FlingCancellationException extends CancellationException {
    public static final int $stable = 0;

    public FlingCancellationException() {
        super("The fling animation was cancelled");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(Scrollable_jvmKt.EmptyStackTraceElements);
        return this;
    }
}
