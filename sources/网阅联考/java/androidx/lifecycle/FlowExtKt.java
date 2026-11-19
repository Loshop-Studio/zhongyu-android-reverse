package androidx.lifecycle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(m5174d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m5175d2 = {"flowWithLifecycle", "Lkotlinx/coroutines/flow/Flow;", ExifInterface.GPS_DIRECTION_TRUE, "lifecycle", "Landroidx/lifecycle/Lifecycle;", "minActiveState", "Landroidx/lifecycle/Lifecycle$State;", "lifecycle-runtime-ktx_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class FlowExtKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(m5174d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, m5175d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/channels/ProducerScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
    @DebugMetadata(m5191c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", m5192f = "FlowExt.kt", m5193i = {0}, m5194l = {91}, m5195m = "invokeSuspend", m5196n = {"$this$callbackFlow"}, m5197s = {"L$0"})
    /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1 */
    public static final class C24491<T> extends SuspendLambda implements Function2<ProducerScope<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Lifecycle $lifecycle;
        final /* synthetic */ Lifecycle.State $minActiveState;
        final /* synthetic */ Flow<T> $this_flowWithLifecycle;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(m5174d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m5175d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m5176k = 3, m5177mv = {1, 8, 0})
        @DebugMetadata(m5191c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", m5192f = "FlowExt.kt", m5193i = {}, m5194l = {92}, m5195m = "invokeSuspend", m5196n = {}, m5197s = {})
        /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ ProducerScope<T> $$this$callbackFlow;
            final /* synthetic */ Flow<T> $this_flowWithLifecycle;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Flow<? extends T> flow, ProducerScope<? super T> producerScope, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$this_flowWithLifecycle = flow;
                this.$$this$callbackFlow = producerScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$this_flowWithLifecycle, this.$$this$callbackFlow, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.label;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<T> flow = this.$this_flowWithLifecycle;
                    final ProducerScope<T> producerScope = this.$$this$callbackFlow;
                    FlowCollector<? super T> flowCollector = new FlowCollector() { // from class: androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(T t3, Continuation<? super Unit> continuation) {
                            Object objSend = producerScope.send(t3, continuation);
                            return objSend == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flow.collect(flowCollector, this) == coroutine_suspended) {
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
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C24491(Lifecycle lifecycle, Lifecycle.State state, Flow<? extends T> flow, Continuation<? super C24491> continuation) {
            super(2, continuation);
            this.$lifecycle = lifecycle;
            this.$minActiveState = state;
            this.$this_flowWithLifecycle = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C24491 c24491 = new C24491(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, continuation);
            c24491.L$0 = obj;
            return c24491;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ProducerScope producerScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                ProducerScope producerScope2 = (ProducerScope) this.L$0;
                Lifecycle lifecycle = this.$lifecycle;
                Lifecycle.State state = this.$minActiveState;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_flowWithLifecycle, producerScope2, null);
                this.L$0 = producerScope2;
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                producerScope = producerScope2;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                producerScope = (ProducerScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super T> producerScope, Continuation<? super Unit> continuation) {
            return ((C24491) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final <T> Flow<T> flowWithLifecycle(Flow<? extends T> flow, Lifecycle lifecycle, Lifecycle.State minActiveState) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(minActiveState, "minActiveState");
        return FlowKt.callbackFlow(new C24491(lifecycle, minActiveState, flow, null));
    }

    public static /* synthetic */ Flow flowWithLifecycle$default(Flow flow, Lifecycle lifecycle, Lifecycle.State state, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(flow, lifecycle, state);
    }
}
