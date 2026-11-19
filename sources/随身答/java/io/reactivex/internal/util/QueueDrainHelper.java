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
import p010a9.InterfaceC0050c;
import p010a9.InterfaceC0051d;

/* loaded from: classes5.dex */
public final class QueueDrainHelper {
    static final long COMPLETED_MASK = Long.MIN_VALUE;
    static final long REQUESTED_MASK = Long.MAX_VALUE;

    private QueueDrainHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> boolean checkTerminated(boolean z9, boolean z10, InterfaceC0050c interfaceC0050c, boolean z11, SimpleQueue<?> simpleQueue, QueueDrain<T, U> queueDrain) {
        if (queueDrain.cancelled()) {
            simpleQueue.clear();
            return true;
        }
        if (!z9) {
            return false;
        }
        if (z11) {
            if (!z10) {
                return false;
            }
            Throwable thError = queueDrain.error();
            if (thError != null) {
                interfaceC0050c.onError(thError);
            } else {
                interfaceC0050c.onComplete();
            }
            return true;
        }
        Throwable thError2 = queueDrain.error();
        if (thError2 != null) {
            simpleQueue.clear();
            interfaceC0050c.onError(thError2);
            return true;
        }
        if (!z10) {
            return false;
        }
        interfaceC0050c.onComplete();
        return true;
    }

    public static <T> SimpleQueue<T> createQueue(int i9) {
        return i9 < 0 ? new SpscLinkedArrayQueue(-i9) : new SpscArrayQueue(i9);
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

    public static <T, U> void drainMaxLoop(SimplePlainQueue<T> simplePlainQueue, InterfaceC0050c interfaceC0050c, boolean z9, Disposable disposable, QueueDrain<T, U> queueDrain) {
        int iLeave = 1;
        while (true) {
            boolean zDone = queueDrain.done();
            T tPoll = simplePlainQueue.poll();
            boolean z10 = tPoll == null;
            SimplePlainQueue<T> simplePlainQueue2 = simplePlainQueue;
            InterfaceC0050c interfaceC0050c2 = interfaceC0050c;
            boolean z11 = z9;
            QueueDrain<T, U> queueDrain2 = queueDrain;
            if (checkTerminated(zDone, z10, interfaceC0050c2, z11, simplePlainQueue2, queueDrain2)) {
                if (disposable != null) {
                    disposable.dispose();
                    return;
                }
                return;
            }
            if (z10) {
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
                    interfaceC0050c2.onError(new MissingBackpressureException("Could not emit value due to lack of requests."));
                    return;
                }
                if (queueDrain2.accept(interfaceC0050c2, tPoll) && jRequested != Long.MAX_VALUE) {
                    queueDrain2.produced(1L);
                }
            }
            interfaceC0050c = interfaceC0050c2;
            z9 = z11;
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

    public static <T> void postComplete(InterfaceC0050c interfaceC0050c, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j9;
        long j10;
        if (queue.isEmpty()) {
            interfaceC0050c.onComplete();
            return;
        }
        if (postCompleteDrain(atomicLong.get(), interfaceC0050c, queue, atomicLong, booleanSupplier)) {
            return;
        }
        do {
            j9 = atomicLong.get();
            if ((j9 & Long.MIN_VALUE) != 0) {
                return;
            } else {
                j10 = j9 | Long.MIN_VALUE;
            }
        } while (!atomicLong.compareAndSet(j9, j10));
        if (j9 != 0) {
            postCompleteDrain(j10, interfaceC0050c, queue, atomicLong, booleanSupplier);
        }
    }

    public static <T> boolean postCompleteDrain(long j9, InterfaceC0050c interfaceC0050c, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j10 = j9 & Long.MIN_VALUE;
        while (true) {
            if (j10 != j9) {
                if (isCancelled(booleanSupplier)) {
                    return true;
                }
                T tPoll = queue.poll();
                if (tPoll == null) {
                    interfaceC0050c.onComplete();
                    return true;
                }
                interfaceC0050c.onNext(tPoll);
                j10++;
            } else {
                if (isCancelled(booleanSupplier)) {
                    return true;
                }
                if (queue.isEmpty()) {
                    interfaceC0050c.onComplete();
                    return true;
                }
                j9 = atomicLong.get();
                if (j9 == j10) {
                    long jAddAndGet = atomicLong.addAndGet(-(j10 & Long.MAX_VALUE));
                    if ((Long.MAX_VALUE & jAddAndGet) == 0) {
                        return false;
                    }
                    j10 = jAddAndGet & Long.MIN_VALUE;
                    j9 = jAddAndGet;
                } else {
                    continue;
                }
            }
        }
    }

    public static <T> boolean postCompleteRequest(long j9, InterfaceC0050c interfaceC0050c, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j10;
        do {
            j10 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j10, BackpressureHelper.addCap(Long.MAX_VALUE & j10, j9) | (j10 & Long.MIN_VALUE)));
        if (j10 != Long.MIN_VALUE) {
            return false;
        }
        postCompleteDrain(j9 | Long.MIN_VALUE, interfaceC0050c, queue, atomicLong, booleanSupplier);
        return true;
    }

    public static void request(InterfaceC0051d interfaceC0051d, int i9) {
        interfaceC0051d.request(i9 < 0 ? Long.MAX_VALUE : i9);
    }

    public static <T, U> boolean checkTerminated(boolean z9, boolean z10, Observer<?> observer, boolean z11, SimpleQueue<?> simpleQueue, Disposable disposable, ObservableQueueDrain<T, U> observableQueueDrain) {
        if (observableQueueDrain.cancelled()) {
            simpleQueue.clear();
            disposable.dispose();
            return true;
        }
        if (!z9) {
            return false;
        }
        if (z11) {
            if (!z10) {
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
        if (!z10) {
            return false;
        }
        if (disposable != null) {
            disposable.dispose();
        }
        observer.onComplete();
        return true;
    }
}
