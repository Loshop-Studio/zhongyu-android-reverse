package androidx.compose.runtime.internal;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC9126n;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public PlatformOptimizedCancellationException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public PlatformOptimizedCancellationException(String str) {
        super(str);
    }

    public /* synthetic */ PlatformOptimizedCancellationException(String str, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? null : str);
    }
}
