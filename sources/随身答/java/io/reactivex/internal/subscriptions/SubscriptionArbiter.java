package io.reactivex.internal.subscriptions;

import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public class SubscriptionArbiter extends AtomicInteger implements InterfaceC0051d {
    private static final long serialVersionUID = -2189523197179400958L;
    InterfaceC0051d actual;
    final boolean cancelOnReplace;
    volatile boolean cancelled;
    long requested;
    protected boolean unbounded;
    final AtomicReference<InterfaceC0051d> missedSubscription = new AtomicReference<>();
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
        InterfaceC0051d interfaceC0051d = null;
        do {
            InterfaceC0051d andSet = this.missedSubscription.get();
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
            InterfaceC0051d interfaceC0051d2 = this.actual;
            if (this.cancelled) {
                if (interfaceC0051d2 != null) {
                    interfaceC0051d2.cancel();
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
                    if (interfaceC0051d2 != null && this.cancelOnReplace) {
                        interfaceC0051d2.cancel();
                    }
                    this.actual = andSet;
                    if (jAddCap2 != 0) {
                        jAddCap = BackpressureHelper.addCap(jAddCap, jAddCap2);
                        interfaceC0051d = andSet;
                    }
                } else if (interfaceC0051d2 != null && andSet2 != 0) {
                    jAddCap = BackpressureHelper.addCap(jAddCap, andSet2);
                    interfaceC0051d = interfaceC0051d2;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jAddCap != 0) {
            interfaceC0051d.request(jAddCap);
        }
    }

    public final boolean isCancelled() {
        return this.cancelled;
    }

    public final boolean isUnbounded() {
        return this.unbounded;
    }

    public final void produced(long j9) {
        if (this.unbounded) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.add(this.missedProduced, j9);
            drain();
            return;
        }
        long j10 = this.requested;
        if (j10 != Long.MAX_VALUE) {
            long j11 = j10 - j9;
            if (j11 < 0) {
                SubscriptionHelper.reportMoreProduced(j11);
                j11 = 0;
            }
            this.requested = j11;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        drainLoop();
    }

    @Override // p010a9.InterfaceC0051d
    public final void request(long j9) {
        if (!SubscriptionHelper.validate(j9) || this.unbounded) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.add(this.missedRequested, j9);
            drain();
            return;
        }
        long j10 = this.requested;
        if (j10 != Long.MAX_VALUE) {
            long jAddCap = BackpressureHelper.addCap(j10, j9);
            this.requested = jAddCap;
            if (jAddCap == Long.MAX_VALUE) {
                this.unbounded = true;
            }
        }
        InterfaceC0051d interfaceC0051d = this.actual;
        if (decrementAndGet() != 0) {
            drainLoop();
        }
        if (interfaceC0051d != null) {
            interfaceC0051d.request(j9);
        }
    }

    public final void setSubscription(InterfaceC0051d interfaceC0051d) {
        if (this.cancelled) {
            interfaceC0051d.cancel();
            return;
        }
        ObjectHelper.requireNonNull(interfaceC0051d, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            InterfaceC0051d andSet = this.missedSubscription.getAndSet(interfaceC0051d);
            if (andSet != null && this.cancelOnReplace) {
                andSet.cancel();
            }
            drain();
            return;
        }
        InterfaceC0051d interfaceC0051d2 = this.actual;
        if (interfaceC0051d2 != null && this.cancelOnReplace) {
            interfaceC0051d2.cancel();
        }
        this.actual = interfaceC0051d;
        long j9 = this.requested;
        if (decrementAndGet() != 0) {
            drainLoop();
        }
        if (j9 != 0) {
            interfaceC0051d.request(j9);
        }
    }
}
