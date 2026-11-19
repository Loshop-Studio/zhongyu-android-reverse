package p288w6;

import io.reactivex.internal.util.ExceptionHelper;

/* renamed from: w6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10359a {
    /* renamed from: a */
    public static RuntimeException m19296a(Throwable th) {
        throw ExceptionHelper.m15580c(th);
    }

    /* renamed from: b */
    public static void m19297b(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
