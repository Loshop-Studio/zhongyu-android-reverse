package kotlinx.coroutines.sync;

import androidx.autofill.HintConstants;
import androidx.concurrent.futures.AbstractC3164a;
import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.selects.SelectInstance;
import p289x8.AbstractC9881a;

@Metadata(m13557d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001a\u001a\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u001eH\u0005Jb\u0010\u001a\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u001f2\u0006\u0010\u001d\u001a\u0002H\u001f2!\u0010 \u001a\u001d\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00190!2!\u0010$\u001a\u001d\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00160!H\u0083\b¢\u0006\u0002\u0010%J\u001e\u0010&\u001a\u00020\u00162\n\u0010'\u001a\u0006\u0012\u0002\b\u00030(2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u0004J\b\u0010*\u001a\u00020\u0003H\u0002J\u0006\u0010+\u001a\u00020\u0016J\b\u0010,\u001a\u00020\u0016H\u0002J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020\u0019H\u0002J\f\u00100\u001a\u00020\u0019*\u00020\u0001H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004R\t\u0010\n\u001a\u00020\u000bX\u0082\u0004R\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004R\t\u0010\r\u001a\u00020\u000bX\u0082\u0004R\t\u0010\u000e\u001a\u00020\u000fX\u0082\u0004R\u0011\u0010\u0010\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R&\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, m13558d2 = {"Lkotlinx/coroutines/sync/SemaphoreAndMutexImpl;", "", "permits", "", "acquiredPermits", "<init>", "(II)V", "head", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/sync/SemaphoreSegment;", "deqIdx", "Lkotlinx/atomicfu/AtomicLong;", "tail", "enqIdx", "_availablePermits", "Lkotlinx/atomicfu/AtomicInt;", "availablePermits", "getAvailablePermits", "()I", "onCancellationRelease", "Lkotlin/Function3;", "", "", "Lkotlin/coroutines/CoroutineContext;", "tryAcquire", "", "acquire", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acquireSlowPath", "waiter", "Lkotlinx/coroutines/CancellableContinuation;", ExifInterface.LONGITUDE_WEST, "suspend", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "onAcquired", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "onAcquireRegFunction", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "ignoredParam", "decPermits", "release", "coerceAvailablePermitsAtMaximum", "addAcquireToQueue", "Lkotlinx/coroutines/Waiter;", "tryResumeNextFromQueue", "tryResumeAcquire", "kotlinx-coroutines-core"}, m13559k = 1, m13560mv = {2, 1, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreAndMutexImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 5 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,396:1\n200#1,10:410\n200#1,10:420\n1#2:397\n444#3,12:398\n68#4,3:430\n42#4,8:433\n68#4,3:444\n42#4,8:447\n374#5:441\n374#5:442\n366#5:443\n377#5:455\n366#5:456\n374#5:457\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreAndMutexImpl\n*L\n192#1:410,10\n216#1:420,10\n182#1:398,12\n284#1:430,3\n284#1:433,8\n317#1:444,3\n317#1:447,8\n288#1:441\n294#1:442\n308#1:443\n323#1:455\n329#1:456\n332#1:457\n*E\n"})
/* loaded from: classes5.dex */
public class SemaphoreAndMutexImpl {
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private final Function3<Throwable, Unit, CoroutineContext, Unit> onCancellationRelease;
    private final int permits;
    private volatile /* synthetic */ Object tail$volatile;
    private static final /* synthetic */ AtomicReferenceFieldUpdater head$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, Object.class, "head$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater deqIdx$volatile$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "deqIdx$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater tail$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, Object.class, "tail$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater enqIdx$volatile$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "enqIdx$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater _availablePermits$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "_availablePermits$volatile");

    public SemaphoreAndMutexImpl(int i10, int i11) {
        this.permits = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        }
        if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        SemaphoreSegment semaphoreSegment = new SemaphoreSegment(0L, null, 2);
        this.head$volatile = semaphoreSegment;
        this.tail$volatile = semaphoreSegment;
        this._availablePermits$volatile = i10 - i11;
        this.onCancellationRelease = new Function3() { // from class: kotlinx.coroutines.sync.e
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SemaphoreAndMutexImpl.onCancellationRelease$lambda$2(this.f13954a, (Throwable) obj, (Unit) obj2, (CoroutineContext) obj3);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object acquireSlowPath(Continuation<? super Unit> continuation) {
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(continuation));
        try {
            if (!addAcquireToQueue(orCreateCancellableContinuation)) {
                acquire((CancellableContinuation<? super Unit>) orCreateCancellableContinuation);
            }
            Object result = orCreateCancellableContinuation.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean addAcquireToQueue(Waiter waiter) {
        Object objFindSegmentInternal;
        SemaphoreSegment semaphoreSegment = (SemaphoreSegment) tail$volatile$FU.get(this);
        long andIncrement = enqIdx$volatile$FU.getAndIncrement(this);
        SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1.INSTANCE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = tail$volatile$FU;
        long j10 = andIncrement / SemaphoreKt.SEGMENT_SIZE;
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(semaphoreSegment, j10, semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1);
            if (!SegmentOrClosed.m25839isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM25837getSegmentimpl = SegmentOrClosed.m25837getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= segmentM25837getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!segmentM25837getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (AbstractC3164a.m1545a(atomicReferenceFieldUpdater, this, segment, segmentM25837getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (segmentM25837getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        segmentM25837getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) SegmentOrClosed.m25837getSegmentimpl(objFindSegmentInternal);
        int i10 = (int) (andIncrement % SemaphoreKt.SEGMENT_SIZE);
        if (AbstractC9881a.m16590a(semaphoreSegment2.getAcquirers(), i10, null, waiter)) {
            waiter.invokeOnCancellation(semaphoreSegment2, i10);
            return true;
        }
        if (!AbstractC9881a.m16590a(semaphoreSegment2.getAcquirers(), i10, SemaphoreKt.PERMIT, SemaphoreKt.TAKEN)) {
            return false;
        }
        if (waiter instanceof CancellableContinuation) {
            Intrinsics.checkNotNull(waiter, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((CancellableContinuation) waiter).resume((CancellableContinuation) Unit.INSTANCE, (Function3<? super Throwable, ? super CancellableContinuation, ? super CoroutineContext, Unit>) this.onCancellationRelease);
        } else {
            if (!(waiter instanceof SelectInstance)) {
                throw new IllegalStateException(("unexpected: " + waiter).toString());
            }
            ((SelectInstance) waiter).selectInRegistrationPhase(Unit.INSTANCE);
        }
        return true;
    }

    private final void coerceAvailablePermitsAtMaximum() {
        int i10;
        do {
            i10 = _availablePermits$volatile$FU.get(this);
            if (i10 <= this.permits) {
                return;
            }
        } while (!_availablePermits$volatile$FU.compareAndSet(this, i10, this.permits));
    }

    private final int decPermits() {
        int andDecrement;
        do {
            andDecrement = _availablePermits$volatile$FU.getAndDecrement(this);
        } while (andDecrement > this.permits);
        return andDecrement;
    }

    private final /* synthetic */ long getDeqIdx$volatile() {
        return this.deqIdx$volatile;
    }

    private final /* synthetic */ long getEnqIdx$volatile() {
        return this.enqIdx$volatile;
    }

    private final /* synthetic */ Object getHead$volatile() {
        return this.head$volatile;
    }

    private final /* synthetic */ Object getTail$volatile() {
        return this.tail$volatile;
    }

    private final /* synthetic */ int get_availablePermits$volatile() {
        return this._availablePermits$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCancellationRelease$lambda$2(SemaphoreAndMutexImpl semaphoreAndMutexImpl, Throwable th, Unit unit, CoroutineContext coroutineContext) {
        semaphoreAndMutexImpl.release();
        return Unit.INSTANCE;
    }

    private final /* synthetic */ void setDeqIdx$volatile(long j10) {
        this.deqIdx$volatile = j10;
    }

    private final /* synthetic */ void setEnqIdx$volatile(long j10) {
        this.enqIdx$volatile = j10;
    }

    private final /* synthetic */ void setHead$volatile(Object obj) {
        this.head$volatile = obj;
    }

    private final /* synthetic */ void setTail$volatile(Object obj) {
        this.tail$volatile = obj;
    }

    private final /* synthetic */ void set_availablePermits$volatile(int i10) {
        this._availablePermits$volatile = i10;
    }

    private final boolean tryResumeAcquire(Object obj) {
        if (!(obj instanceof CancellableContinuation)) {
            if (obj instanceof SelectInstance) {
                return ((SelectInstance) obj).trySelect(this, Unit.INSTANCE);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
        Object objTryResume = cancellableContinuation.tryResume(Unit.INSTANCE, null, this.onCancellationRelease);
        if (objTryResume == null) {
            return false;
        }
        cancellableContinuation.completeResume(objTryResume);
        return true;
    }

    private final boolean tryResumeNextFromQueue() {
        Object objFindSegmentInternal;
        SemaphoreSegment semaphoreSegment = (SemaphoreSegment) head$volatile$FU.get(this);
        long andIncrement = deqIdx$volatile$FU.getAndIncrement(this);
        long j10 = andIncrement / SemaphoreKt.SEGMENT_SIZE;
        SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = head$volatile$FU;
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(semaphoreSegment, j10, semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (SegmentOrClosed.m25839isClosedimpl(objFindSegmentInternal)) {
                break;
            }
            Segment segmentM25837getSegmentimpl = SegmentOrClosed.m25837getSegmentimpl(objFindSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                if (segment.id >= segmentM25837getSegmentimpl.id) {
                    break loop0;
                }
                if (!segmentM25837getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                if (AbstractC3164a.m1545a(atomicReferenceFieldUpdater, this, segment, segmentM25837getSegmentimpl)) {
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                } else if (segmentM25837getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    segmentM25837getSegmentimpl.remove();
                }
            }
        }
        SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) SegmentOrClosed.m25837getSegmentimpl(objFindSegmentInternal);
        semaphoreSegment2.cleanPrev();
        if (semaphoreSegment2.id > j10) {
            return false;
        }
        int i10 = (int) (andIncrement % SemaphoreKt.SEGMENT_SIZE);
        Object andSet = semaphoreSegment2.getAcquirers().getAndSet(i10, SemaphoreKt.PERMIT);
        if (andSet != null) {
            if (andSet == SemaphoreKt.CANCELLED) {
                return false;
            }
            return tryResumeAcquire(andSet);
        }
        int i11 = SemaphoreKt.MAX_SPIN_CYCLES;
        for (int i12 = 0; i12 < i11; i12++) {
            if (semaphoreSegment2.getAcquirers().get(i10) == SemaphoreKt.TAKEN) {
                return true;
            }
        }
        return !AbstractC9881a.m16590a(semaphoreSegment2.getAcquirers(), i10, SemaphoreKt.PERMIT, SemaphoreKt.BROKEN);
    }

    public final Object acquire(Continuation<? super Unit> continuation) {
        if (decPermits() > 0) {
            return Unit.INSTANCE;
        }
        Object objAcquireSlowPath = acquireSlowPath(continuation);
        return objAcquireSlowPath == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAcquireSlowPath : Unit.INSTANCE;
    }

    public final int getAvailablePermits() {
        return Math.max(_availablePermits$volatile$FU.get(this), 0);
    }

    public final void onAcquireRegFunction(SelectInstance<?> select, Object ignoredParam) {
        while (decPermits() <= 0) {
            Intrinsics.checkNotNull(select, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (addAcquireToQueue((Waiter) select)) {
                return;
            }
        }
        select.selectInRegistrationPhase(Unit.INSTANCE);
    }

    public final void release() {
        do {
            int andIncrement = _availablePermits$volatile$FU.getAndIncrement(this);
            if (andIncrement >= this.permits) {
                coerceAvailablePermitsAtMaximum();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.permits).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!tryResumeNextFromQueue());
    }

    public final boolean tryAcquire() {
        while (true) {
            int i10 = _availablePermits$volatile$FU.get(this);
            if (i10 > this.permits) {
                coerceAvailablePermitsAtMaximum();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (_availablePermits$volatile$FU.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }

    private final <W> void acquire(W waiter, Function1<? super W, Boolean> suspend, Function1<? super W, Unit> onAcquired) {
        while (decPermits() <= 0) {
            if (suspend.invoke(waiter).booleanValue()) {
                return;
            }
        }
        onAcquired.invoke(waiter);
    }

    public final void acquire(CancellableContinuation<? super Unit> waiter) {
        while (decPermits() <= 0) {
            Intrinsics.checkNotNull(waiter, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (addAcquireToQueue((Waiter) waiter)) {
                return;
            }
        }
        waiter.resume((CancellableContinuation<? super Unit>) Unit.INSTANCE, this.onCancellationRelease);
    }
}
