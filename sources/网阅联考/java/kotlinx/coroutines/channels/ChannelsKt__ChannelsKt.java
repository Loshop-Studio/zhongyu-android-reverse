package kotlinx.coroutines.channels;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ChannelResult;

@Metadata(m5174d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u0007¢\u0006\u0002\u0010\u0005\u001a,\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, m5175d2 = {"sendBlocking", "", ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/SendChannel;", "element", "(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Object;)V", "trySendBlocking", "Lkotlinx/coroutines/channels/ChannelResult;", "(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m5176k = 5, m5177mv = {1, 6, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, m5180xs = "kotlinx/coroutines/channels/ChannelsKt")
/* loaded from: classes2.dex */
final /* synthetic */ class ChannelsKt__ChannelsKt {

    @Metadata(m5174d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m5175d2 = {ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 6, 0})
    @DebugMetadata(m5191c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", m5192f = "Channels.kt", m5193i = {}, m5194l = {58}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1 */
    public static final class C41371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ E $element;
        final /* synthetic */ SendChannel<E> $this_sendBlocking;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C41371(SendChannel<? super E> sendChannel, E e4, Continuation<? super C41371> continuation) {
            super(2, continuation);
            this.$this_sendBlocking = sendChannel;
            this.$element = e4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C41371(this.$this_sendBlocking, this.$element, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                SendChannel<E> sendChannel = this.$this_sendBlocking;
                E e4 = this.$element;
                this.label = 1;
                if (sendChannel.send(e4, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C41371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m5174d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m5175d2 = {ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/channels/ChannelResult;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 6, 0})
    @DebugMetadata(m5191c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", m5192f = "Channels.kt", m5193i = {}, m5194l = {39}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
    /* renamed from: kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2 */
    public static final class C41382 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelResult<? extends Unit>>, Object> {
        final /* synthetic */ E $element;
        final /* synthetic */ SendChannel<E> $this_trySendBlocking;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C41382(SendChannel<? super E> sendChannel, E e4, Continuation<? super C41382> continuation) {
            super(2, continuation);
            this.$this_trySendBlocking = sendChannel;
            this.$element = e4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C41382 c41382 = new C41382(this.$this_trySendBlocking, this.$element, continuation);
            c41382.L$0 = obj;
            return c41382;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super ChannelResult<? extends Unit>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super ChannelResult<Unit>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM11788constructorimpl;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.label;
            try {
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    SendChannel<E> sendChannel = this.$this_trySendBlocking;
                    E e4 = this.$element;
                    Result.Companion companion = Result.INSTANCE;
                    this.label = 1;
                    if (sendChannel.send(e4, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM11788constructorimpl = Result.m11788constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM11788constructorimpl = Result.m11788constructorimpl(ResultKt.createFailure(th));
            }
            return ChannelResult.m13311boximpl(Result.m11795isSuccessimpl(objM11788constructorimpl) ? ChannelResult.INSTANCE.m13326successJP2dKIU(Unit.INSTANCE) : ChannelResult.INSTANCE.m13324closedJP2dKIU(Result.m11791exceptionOrNullimpl(objM11788constructorimpl)));
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super ChannelResult<Unit>> continuation) {
            return ((C41382) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @ReplaceWith(expression = "trySendBlocking(element)", imports = {}))
    public static final <E> void sendBlocking(SendChannel<? super E> sendChannel, E e4) {
        if (ChannelResult.m13321isSuccessimpl(sendChannel.mo13306trySendJP2dKIU(e4))) {
            return;
        }
        BuildersKt__BuildersKt.runBlocking$default(null, new C41371(sendChannel, e4, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> Object trySendBlocking(SendChannel<? super E> sendChannel, E e4) {
        Object objMo13306trySendJP2dKIU = sendChannel.mo13306trySendJP2dKIU(e4);
        if (objMo13306trySendJP2dKIU instanceof ChannelResult.Failed) {
            return ((ChannelResult) BuildersKt__BuildersKt.runBlocking$default(null, new C41382(sendChannel, e4, null), 1, null)).getHolder();
        }
        return ChannelResult.INSTANCE.m13326successJP2dKIU(Unit.INSTANCE);
    }
}
