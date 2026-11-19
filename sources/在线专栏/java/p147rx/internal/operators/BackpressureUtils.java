package p147rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import p147rx.Subscriber;
import p147rx.functions.Func1;
import p147rx.internal.util.UtilityFunctions;

/* loaded from: classes2.dex */
public final class BackpressureUtils {
    static final long COMPLETED_MASK = Long.MIN_VALUE;
    static final long REQUESTED_MASK = Long.MAX_VALUE;

    private BackpressureUtils() {
        throw new IllegalStateException("No instances!");
    }

    public static long addCap(long j4, long j5) {
        long j6 = j4 + j5;
        return j6 < 0 ? REQUESTED_MASK : j6;
    }

    public static long getAndAddRequest(AtomicLong atomicLong, long j4) {
        long j5;
        do {
            j5 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j5, addCap(j5, j4)));
        return j5;
    }

    public static long multiplyCap(long j4, long j5) {
        long j6 = j4 * j5;
        return (((j4 | j5) >>> 31) == 0 || j5 == 0 || j6 / j5 == j4) ? j6 : REQUESTED_MASK;
    }

    public static <T> void postCompleteDone(AtomicLong atomicLong, Queue<T> queue, Subscriber<? super T> subscriber) {
        postCompleteDone(atomicLong, queue, subscriber, UtilityFunctions.identity());
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:
    
        r0 = r10.addAndGet(-(r6 & p147rx.internal.operators.BackpressureUtils.REQUESTED_MASK));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T, R> void postCompleteDrain(java.util.concurrent.atomic.AtomicLong r10, java.util.Queue<T> r11, p147rx.Subscriber<? super R> r12, p147rx.functions.Func1<? super T, ? extends R> r13) {
        /*
            long r0 = r10.get()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L26
        Ld:
            boolean r10 = r12.isUnsubscribed()
            if (r10 == 0) goto L14
            return
        L14:
            java.lang.Object r10 = r11.poll()
            if (r10 != 0) goto L1e
            r12.onCompleted()
            return
        L1e:
            java.lang.Object r10 = r13.call(r10)
            r12.onNext(r10)
            goto Ld
        L26:
            r4 = -9223372036854775808
        L28:
            r6 = r4
        L29:
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 == 0) goto L49
            boolean r8 = r12.isUnsubscribed()
            if (r8 == 0) goto L34
            return
        L34:
            java.lang.Object r8 = r11.poll()
            if (r8 != 0) goto L3e
            r12.onCompleted()
            return
        L3e:
            java.lang.Object r8 = r13.call(r8)
            r12.onNext(r8)
            r8 = 1
            long r6 = r6 + r8
            goto L29
        L49:
            if (r8 != 0) goto L5c
            boolean r0 = r12.isUnsubscribed()
            if (r0 == 0) goto L52
            return
        L52:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L5c
            r12.onCompleted()
            return
        L5c:
            long r0 = r10.get()
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 != 0) goto L29
            long r0 = r6 & r2
            long r0 = -r0
            long r0 = r10.addAndGet(r0)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L28
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p147rx.internal.operators.BackpressureUtils.postCompleteDrain(java.util.concurrent.atomic.AtomicLong, java.util.Queue, rx.Subscriber, rx.functions.Func1):void");
    }

    public static <T> boolean postCompleteRequest(AtomicLong atomicLong, long j4, Queue<T> queue, Subscriber<? super T> subscriber) {
        return postCompleteRequest(atomicLong, j4, queue, subscriber, UtilityFunctions.identity());
    }

    public static long produced(AtomicLong atomicLong, long j4) {
        long j5;
        long j6;
        do {
            j5 = atomicLong.get();
            if (j5 == REQUESTED_MASK) {
                return REQUESTED_MASK;
            }
            j6 = j5 - j4;
            if (j6 < 0) {
                throw new IllegalStateException("More produced than requested: " + j6);
            }
        } while (!atomicLong.compareAndSet(j5, j6));
        return j6;
    }

    public static boolean validate(long j4) {
        if (j4 >= 0) {
            return j4 != 0;
        }
        throw new IllegalArgumentException("n >= 0 required but it was " + j4);
    }

    public static <T, R> void postCompleteDone(AtomicLong atomicLong, Queue<T> queue, Subscriber<? super R> subscriber, Func1<? super T, ? extends R> func1) {
        long j4;
        do {
            j4 = atomicLong.get();
            if ((j4 & COMPLETED_MASK) != 0) {
                return;
            }
        } while (!atomicLong.compareAndSet(j4, COMPLETED_MASK | j4));
        if (j4 != 0) {
            postCompleteDrain(atomicLong, queue, subscriber, func1);
        }
    }

    public static <T, R> boolean postCompleteRequest(AtomicLong atomicLong, long j4, Queue<T> queue, Subscriber<? super R> subscriber, Func1<? super T, ? extends R> func1) {
        long j5;
        long j6;
        if (j4 < 0) {
            throw new IllegalArgumentException("n >= 0 required but it was " + j4);
        }
        if (j4 == 0) {
            return (atomicLong.get() & COMPLETED_MASK) == 0;
        }
        do {
            j5 = atomicLong.get();
            j6 = j5 & COMPLETED_MASK;
        } while (!atomicLong.compareAndSet(j5, addCap(REQUESTED_MASK & j5, j4) | j6));
        if (j5 != COMPLETED_MASK) {
            return j6 == 0;
        }
        postCompleteDrain(atomicLong, queue, subscriber, func1);
        return false;
    }
}
