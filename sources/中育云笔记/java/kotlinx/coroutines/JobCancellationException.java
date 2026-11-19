package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public final class JobCancellationException extends CancellationException {

    /* renamed from: c */
    public final transient InterfaceC10045g f23489c;

    public JobCancellationException(String str, Throwable th, InterfaceC10045g interfaceC10045g) {
        super(str);
        this.f23489c = interfaceC10045g;
        if (th != null) {
            initCause(th);
        }
    }

    /* renamed from: a */
    public final InterfaceC10045g m20383a() {
        InterfaceC10045g interfaceC10045g = this.f23489c;
        return interfaceC10045g == null ? C10046h.f23978c : interfaceC10045g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JobCancellationException)) {
            return false;
        }
        JobCancellationException jobCancellationException = (JobCancellationException) obj;
        return AbstractC9979u.m20289b(jobCancellationException.getMessage(), getMessage()) && AbstractC9979u.m20289b(jobCancellationException.m20383a(), m20383a()) && AbstractC9979u.m20289b(jobCancellationException.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        AbstractC9979u.m20291d(message);
        int iHashCode = message.hashCode() * 31;
        InterfaceC10045g interfaceC10045gM20383a = m20383a();
        int iHashCode2 = (iHashCode + (interfaceC10045gM20383a != null ? interfaceC10045gM20383a.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + m20383a();
    }
}
