package kotlinx.coroutines.internal;

import kotlin.coroutines.InterfaceC9945d;

/* loaded from: classes6.dex */
public final class DiagnosticCoroutineContextException extends RuntimeException {

    /* renamed from: c */
    public final transient InterfaceC9945d f23979c;

    public DiagnosticCoroutineContextException(InterfaceC9945d interfaceC9945d) {
        this.f23979c = interfaceC9945d;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return String.valueOf(this.f23979c);
    }
}
