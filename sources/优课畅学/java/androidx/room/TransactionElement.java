package androidx.room;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.InterfaceC9099c;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class TransactionElement implements InterfaceC9100d.b {
    public static final Key Key = new Key(null);
    private final AtomicInteger referenceCount;
    private final InterfaceC9099c transactionDispatcher;

    public static final class Key implements InterfaceC9100d.c {
        public /* synthetic */ Key(AbstractC9126n abstractC9126n) {
            this();
        }

        private Key() {
        }
    }

    public TransactionElement(InterfaceC9099c transactionDispatcher) {
        AbstractC9133u.m16133g(transactionDispatcher, "transactionDispatcher");
        this.transactionDispatcher = transactionDispatcher;
        this.referenceCount = new AtomicInteger(0);
    }

    public final void acquire() {
        this.referenceCount.incrementAndGet();
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    public <R> R fold(R r10, InterfaceC10574p interfaceC10574p) {
        return (R) InterfaceC9100d.b.a.m16071a(this, r10, interfaceC10574p);
    }

    @Override // kotlin.coroutines.InterfaceC9100d.b, kotlin.coroutines.InterfaceC9100d
    public <E extends InterfaceC9100d.b> E get(InterfaceC9100d.c cVar) {
        return (E) InterfaceC9100d.b.a.m16072b(this, cVar);
    }

    @Override // kotlin.coroutines.InterfaceC9100d.b
    public InterfaceC9100d.c getKey() {
        return Key;
    }

    public final InterfaceC9099c getTransactionDispatcher$room_runtime_release() {
        return this.transactionDispatcher;
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d minusKey(InterfaceC9100d.c cVar) {
        return InterfaceC9100d.b.a.m16073c(this, cVar);
    }

    @Override // kotlin.coroutines.InterfaceC9100d
    public InterfaceC9100d plus(InterfaceC9100d interfaceC9100d) {
        return InterfaceC9100d.b.a.m16074d(this, interfaceC9100d);
    }

    public final void release() {
        if (this.referenceCount.decrementAndGet() < 0) {
            throw new IllegalStateException("Transaction was never started or was already released.");
        }
    }
}
