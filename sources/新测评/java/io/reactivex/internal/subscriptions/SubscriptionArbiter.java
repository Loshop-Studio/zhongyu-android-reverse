package io.reactivex.internal.subscriptions;

import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p215q9.InterfaceC8990d;

/* loaded from: classes5.dex */
public class SubscriptionArbiter extends AtomicInteger implements InterfaceC8990d {
    private static final long serialVersionUID = -2189523197179400958L;
    InterfaceC8990d actual;
    final boolean cancelOnReplace;
    volatile boolean cancelled;
    long requested;
    protected boolean unbounded;
    final AtomicReference<InterfaceC8990d> missedSubscription = new AtomicReference<>();
    final AtomicLong missedRequested = new AtomicLong();
    final AtomicLong missedProduced = new AtomicLong();

    public SubscriptionArbiter(boolean z9) {
        this.cancelOnReplace = z9;
    }

    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        drain();
    }

    public final void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        drainLoop();
    }

    public final void drainLoop() {
        int iAddAndGet = 1;
        long jAddCap = 0;
        InterfaceC8990d interfaceC8990d = null;
        do {
            InterfaceC8990d andSet = this.missedSubscription.get();
            if (andSet != null) {
                andSet = this.missedSubscription.getAndSet(null);
            }
            long andSet2 = this.missedRequested.get();
            if (andSet2 != 0) {
                andSet2 = this.missedRequested.getAndSet(0L);
            }
            long andSet3 = this.missedProduced.get();
            if (andSet3 != 0) {
                andSet3 = this.missedProduced.getAndSet(0L);
            }
            InterfaceC8990d interfaceC8990d2 = this.actual;
            if (this.cancelled) {
                if (interfaceC8990d2 != null) {
                    interfaceC8990d2.cancel();
                    this.actual = null;
                }
                if (andSet != null) {
                    andSet.cancel();
                }
            } else {
                long jAddCap2 = this.requested;
                if (jAddCap2 != Long.MAX_VALUE) {
                    jAddCap2 = BackpressureHelper.addCap(jAddCap2, andSet2);
                    if (jAddCap2 != Long.MAX_VALUE) {
                        jAddCap2 -= andSet3;
                        if (jAddCap2 < 0) {
                            SubscriptionHelper.reportMoreProduced(jAddCap2);
                            jAddCap2 = 0;
                        }
                    }
                    this.requested = jAddCap2;
                }
                if (andSet != null) {
                    if (interfaceC8990d2 != null && this.cancelOnReplace) {
                        interfaceC8990d2.cancel();
                    }
                    this.actual = andSet;
                    if (jAddCap2 != 0) {
                        jAddCap = BackpressureHelper.addCap(jAddCap, jAddCap2);
                        interfaceC8990d = andSet;
                    }
                } else if (interfaceC8990d2 != null && andSet2 != 0) {
                    jAddCap = BackpressureHelper.addCap(jAddCap, andSet2);
                    interfaceC8990d = interfaceC8990d2;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jAddCap != 0) {
            interfaceC8990d.request(jAddCap);
        }
    }

    public final boolean isCancelled() {
        return this.cancelled;
    }

    public final boolean isUnbounded() {
        return this.unbounded;
    }

    public final void produced(long j10) {
        if (this.unbounded) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.add(this.missedProduced, j10);
            drain();
            return;
        }
        long j11 = this.requested;
        if (j11 != Long.MAX_VALUE) {
            long j12 = j11 - j10;
            if (j12 < 0) {
                SubscriptionHelper.reportMoreProduced(j12);
                j12 = 0;
            }
            this.requested = j12;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        drainLoop();
    }

    @Override // p215q9.InterfaceC8990d
    public final void request(long j10) {
        if (!SubscriptionHelper.validate(j10) || this.unbounded) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.add(this.missedRequested, j10);
            drain();
            return;
        }
        long j11 = this.requested;
        if (j11 != Long.MAX_VALUE) {
            long jAddCap = BackpressureHelper.addCap(j11, j10);
            this.requested = jAddCap;
            if (jAddCap == Long.MAX_VALUE) {
                this.unbounded = true;
            }
        }
        InterfaceC8990d interfaceC8990d = this.actual;
        if (decrementAndGet() != 0) {
            drainLoop();
        }
        if (interfaceC8990d != null) {
            interfaceC8990d.request(j10);
        }
    }

    public final void setSubscription(InterfaceC8990d interfaceC8990d) {
        if (this.cancelled) {
            interfaceC8990d.cancel();
            return;
        }
        ObjectHelper.requireNonNull(interfaceC8990d, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            InterfaceC8990d andSet = this.missedSubscription.getAndSet(interfaceC8990d);
            if (andSet != null && this.cancelOnReplace) {
                andSet.cancel();
            }
            drain();
            return;
        }
        InterfaceC8990d interfaceC8990d2 = this.actual;
        if (interfaceC8990d2 != null && this.cancelOnReplace) {
            interfaceC8990d2.cancel();
        }
        this.actual = interfaceC8990d;
        long j10 = this.requested;
        if (decrementAndGet() != 0) {
            drainLoop();
        }
        if (j10 != 0) {
            interfaceC8990d.request(j10);
        }
    }
}
