package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

/* loaded from: classes2.dex */
final class ContinuationRunnable extends AtomicBoolean implements Runnable {
    private final InterfaceC9324c<C8736p> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationRunnable(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        super(false);
        this.continuation = interfaceC9324c;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            InterfaceC9324c<C8736p> interfaceC9324c = this.continuation;
            Result.C9076a c9076a = Result.f17350b;
            interfaceC9324c.resumeWith(Result.m15909b(C8736p.f16368a));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
