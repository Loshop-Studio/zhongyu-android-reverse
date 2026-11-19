package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import p309qc.C10786q;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
final class ContinuationRunnable extends AtomicBoolean implements Runnable {
    private final InterfaceC11588c<C10786q> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationRunnable(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        super(false);
        this.continuation = interfaceC11588c;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            InterfaceC11588c<C10786q> interfaceC11588c = this.continuation;
            Result.C9921a c9921a = Result.f23263d;
            interfaceC11588c.resumeWith(Result.m20054c(C10786q.f26013a));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
