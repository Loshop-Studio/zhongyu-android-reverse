package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class AbortFlowException extends CancellationException {

    /* renamed from: a */
    public final transient Object f17988a;

    public AbortFlowException(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f17988a = obj;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
