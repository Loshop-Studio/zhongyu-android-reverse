package androidx.room;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.InterfaceC9944c;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;

/* loaded from: classes3.dex */
public final class TransactionElement implements InterfaceC9945d.b {
    public static final Key Key = new Key(null);
    private final AtomicInteger referenceCount;
    private final InterfaceC9944c transactionDispatcher;

    public static final class Key implements InterfaceC9945d.c {
        public /* synthetic */ Key(AbstractC9972n abstractC9972n) {
            this();
        }

        private Key() {
        }
    }

    public TransactionElement(InterfaceC9944c transactionDispatcher) {
        AbstractC9979u.m20294g(transactionDispatcher, "transactionDispatcher");
        this.transactionDispatcher = transactionDispatcher;
        this.referenceCount = new AtomicInteger(0);
    }

    public final void acquire() {
        this.referenceCount.incrementAndGet();
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    public <R> R fold(R r10, InterfaceC9544p interfaceC9544p) {
        return (R) InterfaceC9945d.b.a.m20216a(this, r10, interfaceC9544p);
    }

    @Override // kotlin.coroutines.InterfaceC9945d.b, kotlin.coroutines.InterfaceC9945d
    public <E extends InterfaceC9945d.b> E get(InterfaceC9945d.c cVar) {
        return (E) InterfaceC9945d.b.a.m20217b(this, cVar);
    }

    @Override // kotlin.coroutines.InterfaceC9945d.b
    public InterfaceC9945d.c getKey() {
        return Key;
    }

    public final InterfaceC9944c getTransactionDispatcher$room_runtime_release() {
        return this.transactionDispatcher;
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d minusKey(InterfaceC9945d.c cVar) {
        return InterfaceC9945d.b.a.m20218c(this, cVar);
    }

    @Override // kotlin.coroutines.InterfaceC9945d
    public InterfaceC9945d plus(InterfaceC9945d interfaceC9945d) {
        return InterfaceC9945d.b.a.m20219d(this, interfaceC9945d);
    }

    public final void release() {
        if (this.referenceCount.decrementAndGet() < 0) {
            throw new IllegalStateException("Transaction was never started or was already released.");
        }
    }
}
