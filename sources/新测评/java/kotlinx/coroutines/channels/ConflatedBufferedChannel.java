package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectInstance;

@Metadata(m13557d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\"\b\u0002\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\n¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00028\u0000H\u0090@¢\u0006\u0004\b\u0014\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00162\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u00162\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u00162\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u001e\u0010\u001f\u001a\u00020\t2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030!2\b\u0010\u0011\u001a\u0004\u0018\u00010\"H\u0014J\r\u0010#\u001a\u00020\u000eH\u0010¢\u0006\u0002\b$R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000f¨\u0006%"}, m13558d2 = {"Lkotlinx/coroutines/channels/ConflatedBufferedChannel;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/BufferedChannel;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "<init>", "(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;)V", "isConflatedDropOldest", "", "()Z", "send", "element", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendBroadcast", "sendBroadcast$kotlinx_coroutines_core", "trySend", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySendImpl", "isSendOp", "trySendImpl-Mj0NB7M", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "trySendDropLatest", "trySendDropLatest-Mj0NB7M", "registerSelectForSend", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "", "shouldSendSuspend", "shouldSendSuspend$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, m13559k = 1, m13560mv = {2, 1, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nConflatedBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,90:1\n1047#2,2:91\n1009#2,2:93\n1009#2,2:95\n1047#2,2:97\n*S KotlinDebug\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n*L\n33#1:91,2\n45#1:93,2\n77#1:95,2\n80#1:97,2\n*E\n"})
/* loaded from: classes5.dex */
public class ConflatedBufferedChannel<E> extends BufferedChannel<E> {
    private final int capacity;
    private final BufferOverflow onBufferOverflow;

    public /* synthetic */ ConflatedBufferedChannel(int i10, BufferOverflow bufferOverflow, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, bufferOverflow, (i11 & 4) != 0 ? null : function1);
    }

    public static /* synthetic */ <E> Object send$suspendImpl(ConflatedBufferedChannel<E> conflatedBufferedChannel, E e10, Continuation<? super Unit> continuation) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        Object objM25804trySendImplMj0NB7M = conflatedBufferedChannel.m25804trySendImplMj0NB7M(e10, true);
        if (!(objM25804trySendImplMj0NB7M instanceof ChannelResult.Closed)) {
            return Unit.INSTANCE;
        }
        ChannelResult.m25791exceptionOrNullimpl(objM25804trySendImplMj0NB7M);
        Function1<E, Unit> function1 = conflatedBufferedChannel.onUndeliveredElement;
        if (function1 == null || (undeliveredElementExceptionCallUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, e10, null, 2, null)) == null) {
            throw conflatedBufferedChannel.getSendException();
        }
        ExceptionsKt.addSuppressed(undeliveredElementExceptionCallUndeliveredElementCatchingException$default, conflatedBufferedChannel.getSendException());
        throw undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
    }

    public static /* synthetic */ <E> Object sendBroadcast$suspendImpl(ConflatedBufferedChannel<E> conflatedBufferedChannel, E e10, Continuation<? super Boolean> continuation) {
        Object objM25804trySendImplMj0NB7M = conflatedBufferedChannel.m25804trySendImplMj0NB7M(e10, true);
        if (objM25804trySendImplMj0NB7M instanceof ChannelResult.Failed) {
            return Boxing.boxBoolean(false);
        }
        return Boxing.boxBoolean(true);
    }

    /* renamed from: trySendDropLatest-Mj0NB7M, reason: not valid java name */
    private final Object m25803trySendDropLatestMj0NB7M(E element, boolean isSendOp) {
        Function1<E, Unit> function1;
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        Object objMo24070trySendJP2dKIU = super.mo24070trySendJP2dKIU(element);
        if (ChannelResult.m25797isSuccessimpl(objMo24070trySendJP2dKIU) || ChannelResult.m25795isClosedimpl(objMo24070trySendJP2dKIU)) {
            return objMo24070trySendJP2dKIU;
        }
        if (!isSendOp || (function1 = this.onUndeliveredElement) == null || (undeliveredElementExceptionCallUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, element, null, 2, null)) == null) {
            return ChannelResult.INSTANCE.m25802successJP2dKIU(Unit.INSTANCE);
        }
        throw undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
    }

    /* renamed from: trySendImpl-Mj0NB7M, reason: not valid java name */
    private final Object m25804trySendImplMj0NB7M(E element, boolean isSendOp) {
        return this.onBufferOverflow == BufferOverflow.DROP_LATEST ? m25803trySendDropLatestMj0NB7M(element, isSendOp) : m25781trySendDropOldestJP2dKIU(element);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean isConflatedDropOldest() {
        return this.onBufferOverflow == BufferOverflow.DROP_OLDEST;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.BufferedChannel
    public void registerSelectForSend(SelectInstance<?> select, Object element) {
        Object objMo24070trySendJP2dKIU = mo24070trySendJP2dKIU(element);
        if (!(objMo24070trySendJP2dKIU instanceof ChannelResult.Failed)) {
            select.selectInRegistrationPhase(Unit.INSTANCE);
        } else {
            if (!(objMo24070trySendJP2dKIU instanceof ChannelResult.Closed)) {
                throw new IllegalStateException("unreachable");
            }
            ChannelResult.m25791exceptionOrNullimpl(objMo24070trySendJP2dKIU);
            select.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public Object send(E e10, Continuation<? super Unit> continuation) {
        return send$suspendImpl((ConflatedBufferedChannel) this, (Object) e10, continuation);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public Object sendBroadcast$kotlinx_coroutines_core(E e10, Continuation<? super Boolean> continuation) {
        return sendBroadcast$suspendImpl((ConflatedBufferedChannel) this, (Object) e10, continuation);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU */
    public Object mo24070trySendJP2dKIU(E element) {
        return m25804trySendImplMj0NB7M(element, false);
    }

    public ConflatedBufferedChannel(int i10, BufferOverflow bufferOverflow, Function1<? super E, Unit> function1) {
        super(i10, function1);
        this.capacity = i10;
        this.onBufferOverflow = bufferOverflow;
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + Reflection.getOrCreateKotlinClass(BufferedChannel.class).getSimpleName() + " instead").toString());
        }
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
    }
}
