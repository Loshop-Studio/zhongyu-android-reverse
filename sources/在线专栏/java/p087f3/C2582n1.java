package p087f3;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: f3.n1 */
/* loaded from: classes.dex */
public final class C2582n1 extends CancellationException {

    /* renamed from: a */
    @NotNull
    public final InterfaceC2578m1 f10273a;

    public C2582n1(@NotNull String str, @Nullable Throwable th, @NotNull InterfaceC2578m1 interfaceC2578m1) {
        super(str);
        this.f10273a = interfaceC2578m1;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (obj != this) {
            if (obj instanceof C2582n1) {
                C2582n1 c2582n1 = (C2582n1) obj;
                if (!C2769l.m9237a(c2582n1.getMessage(), getMessage()) || !C2769l.m9237a(c2582n1.f10273a, this.f10273a) || !C2769l.m9237a(c2582n1.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        C2769l.m9239c(message);
        int iHashCode = ((message.hashCode() * 31) + this.f10273a.hashCode()) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause == null ? 0 : cause.hashCode());
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return super.toString() + "; job=" + this.f10273a;
    }
}
