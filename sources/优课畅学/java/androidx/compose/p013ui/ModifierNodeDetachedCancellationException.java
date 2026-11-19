package androidx.compose.p013ui;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ModifierNodeDetachedCancellationException extends CancellationException {
    public static final int $stable = 0;

    public ModifierNodeDetachedCancellationException() {
        super("The Modifier.Node was detached");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(Modifier_jvmKt.EmptyStackTraceElements);
        return this;
    }
}
