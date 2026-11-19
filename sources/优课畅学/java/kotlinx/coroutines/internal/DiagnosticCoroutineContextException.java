package kotlinx.coroutines.internal;

import kotlin.coroutines.InterfaceC9100d;

/* loaded from: classes5.dex */
public final class DiagnosticCoroutineContextException extends RuntimeException {

    /* renamed from: a */
    public final transient InterfaceC9100d f18068a;

    public DiagnosticCoroutineContextException(InterfaceC9100d interfaceC9100d) {
        this.f18068a = interfaceC9100d;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f18068a.toString();
    }
}
