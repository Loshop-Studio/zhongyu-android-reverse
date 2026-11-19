package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes5.dex */
public final class JobCancellationException extends CancellationException {

    /* renamed from: a */
    public final transient InterfaceC9212n f17563a;

    public JobCancellationException(String str, Throwable th, InterfaceC9212n interfaceC9212n) {
        super(str);
        this.f17563a = interfaceC9212n;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JobCancellationException)) {
            return false;
        }
        JobCancellationException jobCancellationException = (JobCancellationException) obj;
        return AbstractC9133u.m16128b(jobCancellationException.getMessage(), getMessage()) && AbstractC9133u.m16128b(jobCancellationException.f17563a, this.f17563a) && AbstractC9133u.m16128b(jobCancellationException.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        AbstractC9133u.m16130d(message);
        int iHashCode = ((message.hashCode() * 31) + this.f17563a.hashCode()) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f17563a;
    }
}
