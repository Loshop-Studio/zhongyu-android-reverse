package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.internal.Symbol;

@Metadata(m13557d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006:\u0001iB\u001f\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010,\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000/H\u0096@¢\u0006\u0002\u00100J\u0015\u00101\u001a\u0002022\u0006\u00103\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00104J\u0016\u00105\u001a\u0002062\u0006\u00103\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u00107J\u0015\u00108\u001a\u0002022\u0006\u00103\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00104J\u0015\u00109\u001a\u0002022\u0006\u00103\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00104J\b\u0010:\u001a\u000206H\u0002J\u0010\u0010;\u001a\u0002062\u0006\u0010<\u001a\u00020\u0013H\u0002J\u0012\u0010=\u001a\u0002062\b\u0010>\u001a\u0004\u0018\u00010\u0010H\u0002J7\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0010\u0010@\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000f2\u0006\u0010A\u001a\u00020\b2\u0006\u0010B\u001a\u00020\bH\u0002¢\u0006\u0002\u0010CJ\u0016\u0010D\u001a\u0002062\u0006\u00103\u001a\u00028\u0000H\u0082@¢\u0006\u0002\u00107J\u0010\u0010E\u001a\u0002062\u0006\u0010F\u001a\u00020GH\u0002J\r\u0010H\u001a\u00020\u0013H\u0000¢\u0006\u0002\bIJ%\u0010J\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u000206\u0018\u00010K0\u000f2\u0006\u0010L\u001a\u00020\u0013H\u0000¢\u0006\u0004\bM\u0010NJ(\u0010O\u001a\u0002062\u0006\u0010P\u001a\u00020\u00132\u0006\u0010Q\u001a\u00020\u00132\u0006\u0010R\u001a\u00020\u00132\u0006\u0010S\u001a\u00020\u0013H\u0002J\b\u0010T\u001a\u000206H\u0002J\u0012\u0010U\u001a\u0004\u0018\u00010\u00102\u0006\u0010V\u001a\u00020\u0003H\u0002J\u0010\u0010W\u001a\u00020\u00132\u0006\u0010V\u001a\u00020\u0003H\u0002J\u0012\u0010X\u001a\u0004\u0018\u00010\u00102\u0006\u0010Y\u001a\u00020\u0013H\u0002J\u0016\u0010Z\u001a\u0002062\u0006\u0010V\u001a\u00020\u0003H\u0082@¢\u0006\u0002\u0010[J1\u0010\\\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u000206\u0018\u00010K0\u000f2\u0014\u0010]\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u000206\u0018\u00010K0\u000fH\u0002¢\u0006\u0002\u0010^J\b\u0010_\u001a\u00020\u0003H\u0014J\u001d\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000f2\u0006\u0010a\u001a\u00020\bH\u0014¢\u0006\u0002\u0010bJ\b\u0010c\u001a\u000206H\u0016J&\u0010d\u001a\b\u0012\u0004\u0012\u00028\u00000e2\u0006\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0019R\u0014\u0010!\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001a\u0010'\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006j"}, m13558d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlowSlot;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "replay", "", "bufferCapacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "<init>", "(IILkotlinx/coroutines/channels/BufferOverflow;)V", "buffer", "", "", "[Ljava/lang/Object;", "replayIndex", "", "minCollectorIndex", "bufferSize", "queueSize", "head", "getHead", "()J", "replaySize", "getReplaySize", "()I", "totalSize", "getTotalSize", "bufferEndIndex", "getBufferEndIndex", "queueEndIndex", "getQueueEndIndex", "replayCache", "", "getReplayCache", "()Ljava/util/List;", "lastReplayedLocked", "getLastReplayedLocked$annotations", "()V", "getLastReplayedLocked", "()Ljava/lang/Object;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryEmit", "", "value", "(Ljava/lang/Object;)Z", "emit", "", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryEmitLocked", "tryEmitNoCollectorsLocked", "dropOldestLocked", "correctCollectorIndexesOnDropOldest", "newHead", "enqueueLocked", "item", "growBuffer", "curBuffer", "curSize", "newSize", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "emitSuspend", "cancelEmitter", "emitter", "Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "updateNewCollectorIndexLocked", "updateNewCollectorIndexLocked$kotlinx_coroutines_core", "updateCollectorIndexLocked", "Lkotlin/coroutines/Continuation;", "oldIndex", "updateCollectorIndexLocked$kotlinx_coroutines_core", "(J)[Lkotlin/coroutines/Continuation;", "updateBufferLocked", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "cleanupTailLocked", "tryTakeValue", "slot", "tryPeekLocked", "getPeekedValueLockedAt", "index", "awaitValue", "(Lkotlinx/coroutines/flow/SharedFlowSlot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findSlotsToResumeLocked", "resumesIn", "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;", "createSlot", "createSlotArray", "size", "(I)[Lkotlinx/coroutines/flow/SharedFlowSlot;", "resetReplayCache", "fuse", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "Emitter", "kotlinx-coroutines-core"}, m13559k = 1, m13560mv = {2, 1, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,746:1\n29#2:747\n29#2:750\n29#2:769\n29#2:773\n29#2:782\n29#2:793\n29#2:804\n16#3:748\n16#3:751\n16#3:770\n16#3:774\n16#3:783\n16#3:794\n16#3:805\n375#4:749\n1#5:752\n91#6,2:753\n93#6,2:756\n95#6:759\n91#6,2:775\n93#6,2:778\n95#6:781\n91#6,2:797\n93#6,2:800\n95#6:803\n13402#7:755\n13403#7:758\n13402#7:777\n13403#7:780\n13402#7:799\n13403#7:802\n426#8,9:760\n435#8,2:771\n426#8,9:784\n435#8,2:795\n*S KotlinDebug\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n*L\n366#1:747\n406#1:750\n500#1:769\n521#1:773\n641#1:782\n676#1:793\n704#1:804\n366#1:748\n406#1:751\n500#1:770\n521#1:774\n641#1:783\n676#1:794\n704#1:805\n388#1:749\n468#1:753,2\n468#1:756,2\n468#1:759\n544#1:775,2\n544#1:778,2\n544#1:781\n691#1:797,2\n691#1:800,2\n691#1:803\n468#1:755\n468#1:758\n544#1:777\n544#1:780\n691#1:799\n691#1:802\n498#1:760,9\n498#1:771,2\n675#1:784,9\n675#1:795,2\n*E\n"})
/* loaded from: classes5.dex */
public class SharedFlowImpl<T> extends AbstractSharedFlow<SharedFlowSlot> implements MutableSharedFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    private Object[] buffer;
    private final int bufferCapacity;
    private int bufferSize;
    private long minCollectorIndex;
    private final BufferOverflow onBufferOverflow;
    private int queueSize;
    private final int replay;
    private long replayIndex;

    @Metadata(m13557d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m13558d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "Lkotlinx/coroutines/DisposableHandle;", "flow", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "index", "", "value", "", "cont", "Lkotlin/coroutines/Continuation;", "", "<init>", "(Lkotlinx/coroutines/flow/SharedFlowImpl;JLjava/lang/Object;Lkotlin/coroutines/Continuation;)V", "dispose", "kotlinx-coroutines-core"}, m13559k = 1, m13560mv = {2, 1, 0}, m13562xi = 48)
    public static final class Emitter implements DisposableHandle {

        @JvmField
        public final Continuation<Unit> cont;

        @JvmField
        public final SharedFlowImpl<?> flow;

        @JvmField
        public long index;

        @JvmField
        public final Object value;

        /* JADX WARN: Multi-variable type inference failed */
        public Emitter(SharedFlowImpl<?> sharedFlowImpl, long j10, Object obj, Continuation<? super Unit> continuation) {
            this.flow = sharedFlowImpl;
            this.index = j10;
            this.value = obj;
            this.cont = continuation;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
            this.flow.cancelEmitter(this);
        }
    }

    @Metadata(m13559k = 3, m13560mv = {2, 1, 0}, m13562xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m13559k = 3, m13560mv = {2, 1, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "kotlinx.coroutines.flow.SharedFlowImpl", m13596f = "SharedFlow.kt", m13597i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, m13598l = {387, 394, 397}, m13599m = "collect$suspendImpl", m13600n = {"$this", "collector", "slot", "$this", "collector", "slot", "collectorJob", "$this", "collector", "slot", "collectorJob"}, m13601s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: kotlinx.coroutines.flow.SharedFlowImpl$collect$1 */
    public static final class C83831<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SharedFlowImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C83831(SharedFlowImpl<T> sharedFlowImpl, Continuation<? super C83831> continuation) {
            super(continuation);
            this.this$0 = sharedFlowImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedFlowImpl.collect$suspendImpl(this.this$0, null, this);
        }
    }

    public SharedFlowImpl(int i10, int i11, BufferOverflow bufferOverflow) {
        this.replay = i10;
        this.bufferCapacity = i11;
        this.onBufferOverflow = bufferOverflow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitValue(SharedFlowSlot sharedFlowSlot, Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        synchronized (this) {
            try {
                if (tryPeekLocked(sharedFlowSlot) < 0) {
                    sharedFlowSlot.cont = cancellableContinuationImpl;
                } else {
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuationImpl.resumeWith(Result.m24299constructorimpl(Unit.INSTANCE));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelEmitter(Emitter emitter) {
        synchronized (this) {
            if (emitter.index < getHead()) {
                return;
            }
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            if (SharedFlowKt.getBufferAt(objArr, emitter.index) != emitter) {
                return;
            }
            SharedFlowKt.setBufferAt(objArr, emitter.index, SharedFlowKt.NO_VALUE);
            cleanupTailLocked();
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void cleanupTailLocked() {
        if (this.bufferCapacity != 0 || this.queueSize > 1) {
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            while (this.queueSize > 0 && SharedFlowKt.getBufferAt(objArr, (getHead() + getTotalSize()) - 1) == SharedFlowKt.NO_VALUE) {
                this.queueSize--;
                SharedFlowKt.setBufferAt(objArr, getHead() + getTotalSize(), null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (((kotlinx.coroutines.flow.SubscribedFlowCollector) r9).onSubscription(r0) == r1) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ <T> java.lang.Object collect$suspendImpl(kotlinx.coroutines.flow.SharedFlowImpl<T> r8, kotlinx.coroutines.flow.FlowCollector<? super T> r9, kotlin.coroutines.Continuation<?> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.collect$suspendImpl(kotlinx.coroutines.flow.SharedFlowImpl, kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void correctCollectorIndexesOnDropOldest(long newHead) {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        if (((AbstractSharedFlow) this).nCollectors != 0 && (abstractSharedFlowSlotArr = ((AbstractSharedFlow) this).slots) != null) {
            for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                if (abstractSharedFlowSlot != null) {
                    SharedFlowSlot sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot;
                    long j10 = sharedFlowSlot.index;
                    if (j10 >= 0 && j10 < newHead) {
                        sharedFlowSlot.index = newHead;
                    }
                }
            }
        }
        this.minCollectorIndex = newHead;
    }

    private final void dropOldestLocked() {
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        SharedFlowKt.setBufferAt(objArr, getHead(), null);
        this.bufferSize--;
        long head = getHead() + 1;
        if (this.replayIndex < head) {
            this.replayIndex = head;
        }
        if (this.minCollectorIndex < head) {
            correctCollectorIndexesOnDropOldest(head);
        }
    }

    public static /* synthetic */ <T> Object emit$suspendImpl(SharedFlowImpl<T> sharedFlowImpl, T t10, Continuation<? super Unit> continuation) throws Throwable {
        if (sharedFlowImpl.tryEmit(t10)) {
            return Unit.INSTANCE;
        }
        Object objEmitSuspend = sharedFlowImpl.emitSuspend(t10, continuation);
        return objEmitSuspend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmitSuspend : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object emitSuspend(T t10, Continuation<? super Unit> continuation) throws Throwable {
        Throwable th;
        Continuation<Unit>[] continuationArrFindSlotsToResumeLocked;
        Emitter emitter;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        Continuation<Unit>[] continuationArrFindSlotsToResumeLocked2 = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            try {
                if (tryEmitLocked(t10)) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuationImpl.resumeWith(Result.m24299constructorimpl(Unit.INSTANCE));
                        continuationArrFindSlotsToResumeLocked = findSlotsToResumeLocked(continuationArrFindSlotsToResumeLocked2);
                        emitter = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        emitter = new Emitter(this, getHead() + getTotalSize(), t10, cancellableContinuationImpl);
                        enqueueLocked(emitter);
                        this.queueSize++;
                        if (this.bufferCapacity == 0) {
                            continuationArrFindSlotsToResumeLocked2 = findSlotsToResumeLocked(continuationArrFindSlotsToResumeLocked2);
                        }
                        continuationArrFindSlotsToResumeLocked = continuationArrFindSlotsToResumeLocked2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (emitter != null) {
                    CancellableContinuationKt.disposeOnCancellation(cancellableContinuationImpl, emitter);
                }
                for (Continuation<Unit> continuation2 : continuationArrFindSlotsToResumeLocked) {
                    if (continuation2 != null) {
                        Result.Companion companion2 = Result.INSTANCE;
                        continuation2.resumeWith(Result.m24299constructorimpl(Unit.INSTANCE));
                    }
                }
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enqueueLocked(Object item) {
        int totalSize = getTotalSize();
        Object[] objArrGrowBuffer = this.buffer;
        if (objArrGrowBuffer == null) {
            objArrGrowBuffer = growBuffer(null, 0, 2);
        } else if (totalSize >= objArrGrowBuffer.length) {
            objArrGrowBuffer = growBuffer(objArrGrowBuffer, totalSize, objArrGrowBuffer.length * 2);
        }
        SharedFlowKt.setBufferAt(objArrGrowBuffer, getHead() + totalSize, item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final Continuation<Unit>[] findSlotsToResumeLocked(Continuation<Unit>[] resumesIn) {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        SharedFlowSlot sharedFlowSlot;
        Continuation<? super Unit> continuation;
        int length = resumesIn.length;
        if (((AbstractSharedFlow) this).nCollectors != 0 && (abstractSharedFlowSlotArr = ((AbstractSharedFlow) this).slots) != null) {
            int length2 = abstractSharedFlowSlotArr.length;
            int i10 = 0;
            resumesIn = resumesIn;
            while (i10 < length2) {
                AbstractSharedFlowSlot abstractSharedFlowSlot = abstractSharedFlowSlotArr[i10];
                if (abstractSharedFlowSlot != null && (continuation = (sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot).cont) != null && tryPeekLocked(sharedFlowSlot) >= 0) {
                    int length3 = resumesIn.length;
                    resumesIn = resumesIn;
                    if (length >= length3) {
                        ?? CopyOf = Arrays.copyOf(resumesIn, Math.max(2, resumesIn.length * 2));
                        Intrinsics.checkNotNullExpressionValue(CopyOf, "copyOf(...)");
                        resumesIn = CopyOf;
                    }
                    resumesIn[length] = continuation;
                    sharedFlowSlot.cont = null;
                    length++;
                }
                i10++;
                resumesIn = resumesIn;
            }
        }
        return resumesIn;
    }

    private final long getBufferEndIndex() {
        return getHead() + this.bufferSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getHead() {
        return Math.min(this.minCollectorIndex, this.replayIndex);
    }

    public static /* synthetic */ void getLastReplayedLocked$annotations() {
    }

    private final Object getPeekedValueLockedAt(long index) {
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        Object bufferAt = SharedFlowKt.getBufferAt(objArr, index);
        return bufferAt instanceof Emitter ? ((Emitter) bufferAt).value : bufferAt;
    }

    private final long getQueueEndIndex() {
        return getHead() + this.bufferSize + this.queueSize;
    }

    private final int getReplaySize() {
        return (int) ((getHead() + this.bufferSize) - this.replayIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTotalSize() {
        return this.bufferSize + this.queueSize;
    }

    private final Object[] growBuffer(Object[] curBuffer, int curSize, int newSize) {
        if (newSize <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr = new Object[newSize];
        this.buffer = objArr;
        if (curBuffer != null) {
            long head = getHead();
            for (int i10 = 0; i10 < curSize; i10++) {
                long j10 = i10 + head;
                SharedFlowKt.setBufferAt(objArr, j10, SharedFlowKt.getBufferAt(curBuffer, j10));
            }
        }
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean tryEmitLocked(T value) {
        if (getNCollectors() == 0) {
            return tryEmitNoCollectorsLocked(value);
        }
        if (this.bufferSize >= this.bufferCapacity && this.minCollectorIndex <= this.replayIndex) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[this.onBufferOverflow.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        enqueueLocked(value);
        int i11 = this.bufferSize + 1;
        this.bufferSize = i11;
        if (i11 > this.bufferCapacity) {
            dropOldestLocked();
        }
        if (getReplaySize() > this.replay) {
            updateBufferLocked(this.replayIndex + 1, this.minCollectorIndex, getBufferEndIndex(), getQueueEndIndex());
        }
        return true;
    }

    private final boolean tryEmitNoCollectorsLocked(T value) {
        if (this.replay == 0) {
            return true;
        }
        enqueueLocked(value);
        int i10 = this.bufferSize + 1;
        this.bufferSize = i10;
        if (i10 > this.replay) {
            dropOldestLocked();
        }
        this.minCollectorIndex = getHead() + this.bufferSize;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long tryPeekLocked(SharedFlowSlot slot) {
        long j10 = slot.index;
        if (j10 >= getBufferEndIndex() && (this.bufferCapacity > 0 || j10 > getHead() || this.queueSize == 0)) {
            return -1L;
        }
        return j10;
    }

    private final Object tryTakeValue(SharedFlowSlot slot) {
        Object obj;
        Continuation<Unit>[] continuationArrUpdateCollectorIndexLocked$kotlinx_coroutines_core = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            try {
                long jTryPeekLocked = tryPeekLocked(slot);
                if (jTryPeekLocked < 0) {
                    obj = SharedFlowKt.NO_VALUE;
                } else {
                    long j10 = slot.index;
                    Object peekedValueLockedAt = getPeekedValueLockedAt(jTryPeekLocked);
                    slot.index = jTryPeekLocked + 1;
                    continuationArrUpdateCollectorIndexLocked$kotlinx_coroutines_core = updateCollectorIndexLocked$kotlinx_coroutines_core(j10);
                    obj = peekedValueLockedAt;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation<Unit> continuation : continuationArrUpdateCollectorIndexLocked$kotlinx_coroutines_core) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m24299constructorimpl(Unit.INSTANCE));
            }
        }
        return obj;
    }

    private final void updateBufferLocked(long newReplayIndex, long newMinCollectorIndex, long newBufferEndIndex, long newQueueEndIndex) {
        long jMin = Math.min(newMinCollectorIndex, newReplayIndex);
        for (long head = getHead(); head < jMin; head++) {
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            SharedFlowKt.setBufferAt(objArr, head, null);
        }
        this.replayIndex = newReplayIndex;
        this.minCollectorIndex = newMinCollectorIndex;
        this.bufferSize = (int) (newBufferEndIndex - jMin);
        this.queueSize = (int) (newQueueEndIndex - newBufferEndIndex);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<?> continuation) {
        return collect$suspendImpl(this, flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t10, Continuation<? super Unit> continuation) {
        return emit$suspendImpl(this, t10, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public Flow<T> fuse(CoroutineContext context, int capacity, BufferOverflow onBufferOverflow) {
        return SharedFlowKt.fuseSharedFlow(this, context, capacity, onBufferOverflow);
    }

    public final T getLastReplayedLocked() {
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        return (T) SharedFlowKt.getBufferAt(objArr, (this.replayIndex + getReplaySize()) - 1);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<T> getReplayCache() {
        synchronized (this) {
            int replaySize = getReplaySize();
            if (replaySize == 0) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(replaySize);
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            for (int i10 = 0; i10 < replaySize; i10++) {
                arrayList.add(SharedFlowKt.getBufferAt(objArr, this.replayIndex + i10));
            }
            return arrayList;
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() throws Throwable {
        synchronized (this) {
            try {
                try {
                    updateBufferLocked(getBufferEndIndex(), this.minCollectorIndex, getBufferEndIndex(), getQueueEndIndex());
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T value) {
        int i10;
        boolean z9;
        Continuation<Unit>[] continuationArrFindSlotsToResumeLocked = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            if (tryEmitLocked(value)) {
                continuationArrFindSlotsToResumeLocked = findSlotsToResumeLocked(continuationArrFindSlotsToResumeLocked);
                z9 = true;
            } else {
                z9 = false;
            }
        }
        for (Continuation<Unit> continuation : continuationArrFindSlotsToResumeLocked) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m24299constructorimpl(Unit.INSTANCE));
            }
        }
        return z9;
    }

    public final Continuation<Unit>[] updateCollectorIndexLocked$kotlinx_coroutines_core(long oldIndex) {
        long j10;
        long j11;
        long j12;
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        if (oldIndex > this.minCollectorIndex) {
            return AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long head = getHead();
        long j13 = this.bufferSize + head;
        if (this.bufferCapacity == 0 && this.queueSize > 0) {
            j13++;
        }
        if (((AbstractSharedFlow) this).nCollectors != 0 && (abstractSharedFlowSlotArr = ((AbstractSharedFlow) this).slots) != null) {
            for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                if (abstractSharedFlowSlot != null) {
                    long j14 = ((SharedFlowSlot) abstractSharedFlowSlot).index;
                    if (j14 >= 0 && j14 < j13) {
                        j13 = j14;
                    }
                }
            }
        }
        if (j13 <= this.minCollectorIndex) {
            return AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long bufferEndIndex = getBufferEndIndex();
        int iMin = getNCollectors() > 0 ? Math.min(this.queueSize, this.bufferCapacity - ((int) (bufferEndIndex - j13))) : this.queueSize;
        Continuation<Unit>[] continuationArr = AbstractSharedFlowKt.EMPTY_RESUMES;
        long j15 = this.queueSize + bufferEndIndex;
        if (iMin > 0) {
            continuationArr = new Continuation[iMin];
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            j12 = 1;
            long j16 = bufferEndIndex;
            int i10 = 0;
            while (true) {
                if (bufferEndIndex >= j15) {
                    j10 = head;
                    j11 = j13;
                    bufferEndIndex = j16;
                    break;
                }
                Object bufferAt = SharedFlowKt.getBufferAt(objArr, bufferEndIndex);
                j10 = head;
                Symbol symbol = SharedFlowKt.NO_VALUE;
                if (bufferAt != symbol) {
                    Intrinsics.checkNotNull(bufferAt, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    Emitter emitter = (Emitter) bufferAt;
                    int i11 = i10 + 1;
                    j11 = j13;
                    continuationArr[i10] = emitter.cont;
                    SharedFlowKt.setBufferAt(objArr, bufferEndIndex, symbol);
                    SharedFlowKt.setBufferAt(objArr, j16, emitter.value);
                    long j17 = j16 + 1;
                    if (i11 >= iMin) {
                        bufferEndIndex = j17;
                        break;
                    }
                    i10 = i11;
                    j16 = j17;
                } else {
                    j11 = j13;
                }
                bufferEndIndex++;
                head = j10;
                j13 = j11;
            }
        } else {
            j10 = head;
            j11 = j13;
            j12 = 1;
        }
        Continuation<Unit>[] continuationArr2 = continuationArr;
        int i12 = (int) (bufferEndIndex - j10);
        long j18 = getNCollectors() == 0 ? bufferEndIndex : j11;
        long jMax = Math.max(this.replayIndex, bufferEndIndex - Math.min(this.replay, i12));
        if (this.bufferCapacity == 0 && jMax < j15) {
            Object[] objArr2 = this.buffer;
            Intrinsics.checkNotNull(objArr2);
            if (Intrinsics.areEqual(SharedFlowKt.getBufferAt(objArr2, jMax), SharedFlowKt.NO_VALUE)) {
                bufferEndIndex += j12;
                jMax += j12;
            }
        }
        updateBufferLocked(jMax, j18, bufferEndIndex, j15);
        cleanupTailLocked();
        return !(continuationArr2.length == 0) ? findSlotsToResumeLocked(continuationArr2) : continuationArr2;
    }

    public final long updateNewCollectorIndexLocked$kotlinx_coroutines_core() {
        long j10 = this.replayIndex;
        if (j10 < this.minCollectorIndex) {
            this.minCollectorIndex = j10;
        }
        return j10;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public SharedFlowSlot createSlot() {
        return new SharedFlowSlot();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public SharedFlowSlot[] createSlotArray(int size) {
        return new SharedFlowSlot[size];
    }
}
