package io.reactivex.internal.subscriptions;

import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public class SubscriptionArbiter extends AtomicInteger implements InterfaceC7918d {
    private static final long serialVersionUID = -2189523197179400958L;
    InterfaceC7918d actual;
    final boolean cancelOnReplace;
    volatile boolean cancelled;
    long requested;
    protected boolean unbounded;
    final AtomicReference<InterfaceC7918d> missedSubscription = new AtomicReference<>();
    final AtomicLong missedRequested = new AtomicLong();
    final AtomicLong missedProduced = new AtomicLong();

    public SubscriptionArbiter(boolean z6) {
        this.cancelOnReplace = z6;
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
        InterfaceC7918d interfaceC7918d = null;
        do {
            InterfaceC7918d andSet = this.missedSubscription.get();
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
            InterfaceC7918d interfaceC7918d2 = this.actual;
            if (this.cancelled) {
                if (interfaceC7918d2 != null) {
                    interfaceC7918d2.cancel();
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
                    if (interfaceC7918d2 != null && this.cancelOnReplace) {
                        interfaceC7918d2.cancel();
                    }
                    this.actual = andSet;
                    if (jAddCap2 != 0) {
                        jAddCap = BackpressureHelper.addCap(jAddCap, jAddCap2);
                        interfaceC7918d = andSet;
                    }
                } else if (interfaceC7918d2 != null && andSet2 != 0) {
                    jAddCap = BackpressureHelper.addCap(jAddCap, andSet2);
                    interfaceC7918d = interfaceC7918d2;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jAddCap != 0) {
            interfaceC7918d.request(jAddCap);
        }
    }

    public final boolean isCancelled() {
        return this.cancelled;
    }

    public final boolean isUnbounded() {
        return this.unbounded;
    }

    public final void produced(long j6) {
        if (this.unbounded) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.add(this.missedProduced, j6);
            drain();
            return;
        }
        long j7 = this.requested;
        if (j7 != Long.MAX_VALUE) {
            long j8 = j7 - j6;
            if (j8 < 0) {
                SubscriptionHelper.reportMoreProduced(j8);
                j8 = 0;
            }
            this.requested = j8;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        drainLoop();
    }

    @Override // p193y5.InterfaceC7918d
    public final void request(long j6) {
        if (!SubscriptionHelper.validate(j6) || this.unbounded) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            BackpressureHelper.add(this.missedRequested, j6);
            drain();
            return;
        }
        long j7 = this.requested;
        if (j7 != Long.MAX_VALUE) {
            long jAddCap = BackpressureHelper.addCap(j7, j6);
            this.requested = jAddCap;
            if (jAddCap == Long.MAX_VALUE) {
                this.unbounded = true;
            }
        }
        InterfaceC7918d interfaceC7918d = this.actual;
        if (decrementAndGet() != 0) {
            drainLoop();
        }
        if (interfaceC7918d != null) {
            interfaceC7918d.request(j6);
        }
    }

    public final void setSubscription(InterfaceC7918d interfaceC7918d) {
        if (this.cancelled) {
            interfaceC7918d.cancel();
            return;
        }
        ObjectHelper.requireNonNull(interfaceC7918d, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            InterfaceC7918d andSet = this.missedSubscription.getAndSet(interfaceC7918d);
            if (andSet != null && this.cancelOnReplace) {
                andSet.cancel();
            }
            drain();
            return;
        }
        InterfaceC7918d interfaceC7918d2 = this.actual;
        if (interfaceC7918d2 != null && this.cancelOnReplace) {
            interfaceC7918d2.cancel();
        }
        this.actual = interfaceC7918d;
        long j6 = this.requested;
        if (decrementAndGet() != 0) {
            drainLoop();
        }
        if (j6 != 0) {
            interfaceC7918d.request(j6);
        }
    }
}
