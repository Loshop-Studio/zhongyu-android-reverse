package io.reactivex.internal.util;

import androidx.camera.view.AbstractC0949q;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public abstract class ExceptionHelper {

    /* renamed from: a */
    public static final Throwable f17131a = new Termination();

    public static final class Termination extends Throwable {
        public Termination() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: a */
    public static boolean m15578a(AtomicReference atomicReference, Throwable th) {
        Throwable th2;
        do {
            th2 = (Throwable) atomicReference.get();
            if (th2 == f17131a) {
                return false;
            }
        } while (!AbstractC0949q.m807a(atomicReference, th2, th2 == null ? th : new CompositeException(th2, th)));
        return true;
    }

    /* renamed from: b */
    public static Throwable m15579b(AtomicReference atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        Throwable th2 = f17131a;
        return th != th2 ? (Throwable) atomicReference.getAndSet(th2) : th;
    }

    /* renamed from: c */
    public static RuntimeException m15580c(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }
}
