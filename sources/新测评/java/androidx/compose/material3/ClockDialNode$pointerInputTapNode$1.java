package androidx.compose.material3;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1", m13596f = "TimePicker.kt", m13597i = {}, m13598l = {1439}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes2.dex */
public final class ClockDialNode$pointerInputTapNode$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ClockDialNode this$0;

    @Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m13558d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1", m13596f = "TimePicker.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1 */
    public static final class C20411 extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
        /* synthetic */ long J$0;
        int label;
        final /* synthetic */ ClockDialNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20411(ClockDialNode clockDialNode, Continuation<? super C20411> continuation) {
            super(3, continuation);
            this.this$0 = clockDialNode;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
            return m18621invoked4ec7I(pressGestureScope, offset.m20745unboximpl(), continuation);
        }

        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m18621invoked4ec7I(PressGestureScope pressGestureScope, long j10, Continuation<? super Unit> continuation) {
            C20411 c20411 = new C20411(this.this$0, continuation);
            c20411.J$0 = j10;
            return c20411.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            long j10 = this.J$0;
            this.this$0.offsetX = Offset.m20735getXimpl(j10);
            this.this$0.offsetY = Offset.m20736getYimpl(j10);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockDialNode$pointerInputTapNode$1(ClockDialNode clockDialNode, Continuation<? super ClockDialNode$pointerInputTapNode$1> continuation) {
        super(2, continuation);
        this.this$0 = clockDialNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ClockDialNode$pointerInputTapNode$1 clockDialNode$pointerInputTapNode$1 = new ClockDialNode$pointerInputTapNode$1(this.this$0, continuation);
        clockDialNode$pointerInputTapNode$1.L$0 = obj;
        return clockDialNode$pointerInputTapNode$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((ClockDialNode$pointerInputTapNode$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            C20411 c20411 = new C20411(this.this$0, null);
            final ClockDialNode clockDialNode = this.this$0;
            Function1<Offset, Unit> function1 = new Function1<Offset, Unit>() { // from class: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1.2

                @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
                @DebugMetadata(m13595c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1", m13596f = "TimePicker.kt", m13597i = {}, m13598l = {1446}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
                /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ long $it;
                    int label;
                    final /* synthetic */ ClockDialNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(ClockDialNode clockDialNode, long j10, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.this$0 = clockDialNode;
                        this.$it = j10;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass1(this.this$0, this.$it, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i10 = this.label;
                        if (i10 == 0) {
                            ResultKt.throwOnFailure(obj);
                            AnalogTimePickerState analogTimePickerState = this.this$0.state;
                            float fM20735getXimpl = Offset.m20735getXimpl(this.$it);
                            float fM20736getYimpl = Offset.m20736getYimpl(this.$it);
                            float maxDist = this.this$0.getMaxDist();
                            boolean z9 = this.this$0.autoSwitchToMinute;
                            long j10 = this.this$0.center;
                            this.label = 1;
                            if (TimePickerKt.m19468onTaprOwcSBo(analogTimePickerState, fM20735getXimpl, fM20736getYimpl, maxDist, z9, j10, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i10 != 1) {
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

                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m18622invokek4lQ0M(offset.m20745unboximpl());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m18622invokek4lQ0M(long j10) {
                    BuildersKt__Builders_commonKt.launch$default(clockDialNode.getCoroutineScope(), null, null, new AnonymousClass1(clockDialNode, j10, null), 3, null);
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, c20411, function1, this, 3, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
