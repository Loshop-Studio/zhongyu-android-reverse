package io.reactivex.internal.util;

/* renamed from: io.reactivex.internal.util.a */
/* loaded from: classes.dex */
public abstract class AbstractC5729a {

    /* renamed from: a */
    public static final Throwable f9062a = new Throwable() { // from class: io.reactivex.internal.util.ExceptionHelper$Termination
        private static final long serialVersionUID = -4649703670690200604L;

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }
    };

    /* renamed from: a */
    public static RuntimeException m5089a(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }
}
