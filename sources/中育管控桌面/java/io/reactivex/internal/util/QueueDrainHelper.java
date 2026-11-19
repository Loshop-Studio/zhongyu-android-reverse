package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import p193y5.InterfaceC7917c;
import p193y5.InterfaceC7918d;

/* loaded from: classes4.dex */
public final class QueueDrainHelper {
    static final long COMPLETED_MASK = Long.MIN_VALUE;
    static final long REQUESTED_MASK = Long.MAX_VALUE;

    private QueueDrainHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> boolean checkTerminated(boolean z6, boolean z7, InterfaceC7917c interfaceC7917c, boolean z8, SimpleQueue<?> simpleQueue, QueueDrain<T, U> queueDrain) {
        if (queueDrain.cancelled()) {
            simpleQueue.clear();
            return true;
        }
        if (!z6) {
            return false;
        }
        if (z8) {
            if (!z7) {
                return false;
            }
            Throwable thError = queueDrain.error();
            if (thError != null) {
                interfaceC7917c.onError(thError);
            } else {
                interfaceC7917c.onComplete();
            }
            return true;
        }
        Throwable thError2 = queueDrain.error();
        if (thError2 != null) {
            simpleQueue.clear();
            interfaceC7917c.onError(thError2);
            return true;
        }
        if (!z7) {
            return false;
        }
        interfaceC7917c.onComplete();
        return true;
    }

    public static <T> SimpleQueue<T> createQueue(int i6) {
        return i6 < 0 ? new SpscLinkedArrayQueue(-i6) : new SpscArrayQueue(i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        r1 = r8.leave(-r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r1 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T, U> void drainLoop(io.reactivex.internal.fuseable.SimplePlainQueue<T> r9, io.reactivex.Observer<? super U> r10, boolean r11, io.reactivex.disposables.Disposable r12, io.reactivex.internal.util.ObservableQueueDrain<T, U> r13) {
        /*
            r0 = 1
            r1 = r0
        L2:
            boolean r2 = r13.done()
            boolean r3 = r9.isEmpty()
            r6 = r9
            r4 = r10
            r5 = r11
            r7 = r12
            r8 = r13
            boolean r9 = checkTerminated(r2, r3, r4, r5, r6, r7, r8)
            if (r9 == 0) goto L16
            goto L35
        L16:
            boolean r2 = r8.done()
            java.lang.Object r9 = r6.poll()
            if (r9 != 0) goto L22
            r3 = r0
            goto L24
        L22:
            r10 = 0
            r3 = r10
        L24:
            boolean r10 = checkTerminated(r2, r3, r4, r5, r6, r7, r8)
            r11 = r3
            if (r10 == 0) goto L2c
            goto L35
        L2c:
            if (r11 == 0) goto L3c
            int r9 = -r1
            int r1 = r8.leave(r9)
            if (r1 != 0) goto L36
        L35:
            return
        L36:
            r10 = r4
            r11 = r5
            r9 = r6
            r12 = r7
            r13 = r8
            goto L2
        L3c:
            r8.accept(r4, r9)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.util.QueueDrainHelper.drainLoop(io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.Observer, boolean, io.reactivex.disposables.Disposable, io.reactivex.internal.util.ObservableQueueDrain):void");
    }

    public static <T, U> void drainMaxLoop(SimplePlainQueue<T> simplePlainQueue, InterfaceC7917c interfaceC7917c, boolean z6, Disposable disposable, QueueDrain<T, U> queueDrain) {
        int iLeave = 1;
        while (true) {
            boolean zDone = queueDrain.done();
            T tPoll = simplePlainQueue.poll();
            boolean z7 = tPoll == null;
            SimplePlainQueue<T> simplePlainQueue2 = simplePlainQueue;
            InterfaceC7917c interfaceC7917c2 = interfaceC7917c;
            boolean z8 = z6;
            QueueDrain<T, U> queueDrain2 = queueDrain;
            if (checkTerminated(zDone, z7, interfaceC7917c2, z8, simplePlainQueue2, queueDrain2)) {
                if (disposable != null) {
                    disposable.dispose();
                    return;
                }
                return;
            }
            if (z7) {
                iLeave = queueDrain2.leave(-iLeave);
                if (iLeave == 0) {
                    return;
                }
            } else {
                long jRequested = queueDrain2.requested();
                if (jRequested == 0) {
                    simplePlainQueue2.clear();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    interfaceC7917c2.onError(new MissingBackpressureException("Could not emit value due to lack of requests."));
                    return;
                }
                if (queueDrain2.accept(interfaceC7917c2, tPoll) && jRequested != Long.MAX_VALUE) {
                    queueDrain2.produced(1L);
                }
            }
            interfaceC7917c = interfaceC7917c2;
            z6 = z8;
            simplePlainQueue = simplePlainQueue2;
            queueDrain = queueDrain2;
        }
    }

    public static boolean isCancelled(BooleanSupplier booleanSupplier) {
        try {
            return booleanSupplier.getAsBoolean();
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            return true;
        }
    }

    public static <T> void postComplete(InterfaceC7917c interfaceC7917c, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j6;
        long j7;
        if (queue.isEmpty()) {
            interfaceC7917c.onComplete();
            return;
        }
        if (postCompleteDrain(atomicLong.get(), interfaceC7917c, queue, atomicLong, booleanSupplier)) {
            return;
        }
        do {
            j6 = atomicLong.get();
            if ((j6 & Long.MIN_VALUE) != 0) {
                return;
            } else {
                j7 = j6 | Long.MIN_VALUE;
            }
        } while (!atomicLong.compareAndSet(j6, j7));
        if (j6 != 0) {
            postCompleteDrain(j7, interfaceC7917c, queue, atomicLong, booleanSupplier);
        }
    }

    public static <T> boolean postCompleteDrain(long j6, InterfaceC7917c interfaceC7917c, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j7 = j6 & Long.MIN_VALUE;
        while (true) {
            if (j7 != j6) {
                if (isCancelled(booleanSupplier)) {
                    return true;
                }
                T tPoll = queue.poll();
                if (tPoll == null) {
                    interfaceC7917c.onComplete();
                    return true;
                }
                interfaceC7917c.onNext(tPoll);
                j7++;
            } else {
                if (isCancelled(booleanSupplier)) {
                    return true;
                }
                if (queue.isEmpty()) {
                    interfaceC7917c.onComplete();
                    return true;
                }
                j6 = atomicLong.get();
                if (j6 == j7) {
                    long jAddAndGet = atomicLong.addAndGet(-(j7 & Long.MAX_VALUE));
                    if ((Long.MAX_VALUE & jAddAndGet) == 0) {
                        return false;
                    }
                    j7 = jAddAndGet & Long.MIN_VALUE;
                    j6 = jAddAndGet;
                } else {
                    continue;
                }
            }
        }
    }

    public static <T> boolean postCompleteRequest(long j6, InterfaceC7917c interfaceC7917c, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j7;
        do {
            j7 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j7, BackpressureHelper.addCap(Long.MAX_VALUE & j7, j6) | (j7 & Long.MIN_VALUE)));
        if (j7 != Long.MIN_VALUE) {
            return false;
        }
        postCompleteDrain(j6 | Long.MIN_VALUE, interfaceC7917c, queue, atomicLong, booleanSupplier);
        return true;
    }

    public static void request(InterfaceC7918d interfaceC7918d, int i6) {
        interfaceC7918d.request(i6 < 0 ? Long.MAX_VALUE : i6);
    }

    public static <T, U> boolean checkTerminated(boolean z6, boolean z7, Observer<?> observer, boolean z8, SimpleQueue<?> simpleQueue, Disposable disposable, ObservableQueueDrain<T, U> observableQueueDrain) {
        if (observableQueueDrain.cancelled()) {
            simpleQueue.clear();
            disposable.dispose();
            return true;
        }
        if (!z6) {
            return false;
        }
        if (z8) {
            if (!z7) {
                return false;
            }
            if (disposable != null) {
                disposable.dispose();
            }
            Throwable thError = observableQueueDrain.error();
            if (thError != null) {
                observer.onError(thError);
            } else {
                observer.onComplete();
            }
            return true;
        }
        Throwable thError2 = observableQueueDrain.error();
        if (thError2 != null) {
            simpleQueue.clear();
            if (disposable != null) {
                disposable.dispose();
            }
            observer.onError(thError2);
            return true;
        }
        if (!z7) {
            return false;
        }
        if (disposable != null) {
            disposable.dispose();
        }
        observer.onComplete();
        return true;
    }
}
