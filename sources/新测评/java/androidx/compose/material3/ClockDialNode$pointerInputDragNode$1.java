package androidx.compose.material3;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.PointerInputChange;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import androidx.compose.p013ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1", m13596f = "TimePicker.kt", m13597i = {}, m13598l = {1456}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes2.dex */
public final class ClockDialNode$pointerInputDragNode$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ClockDialNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockDialNode$pointerInputDragNode$1(ClockDialNode clockDialNode, Continuation<? super ClockDialNode$pointerInputDragNode$1> continuation) {
        super(2, continuation);
        this.this$0 = clockDialNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ClockDialNode$pointerInputDragNode$1 clockDialNode$pointerInputDragNode$1 = new ClockDialNode$pointerInputDragNode$1(this.this$0, continuation);
        clockDialNode$pointerInputDragNode$1.L$0 = obj;
        return clockDialNode$pointerInputDragNode$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((ClockDialNode$pointerInputDragNode$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            final ClockDialNode clockDialNode = this.this$0;
            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1.1

                @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
                @DebugMetadata(m13595c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1$1", m13596f = "TimePicker.kt", m13597i = {}, m13598l = {1462}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
                /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    int label;
                    final /* synthetic */ ClockDialNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(ClockDialNode clockDialNode, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.this$0 = clockDialNode;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass1(this.this$0, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i10 = this.label;
                        if (i10 == 0) {
                            ResultKt.throwOnFailure(obj);
                            if (this.this$0.autoSwitchToMinute) {
                                this.this$0.state.mo18497setSelection6_8s6DQ(TimePickerSelectionMode.INSTANCE.m19489getMinuteyecRtBI());
                            }
                            AnalogTimePickerState analogTimePickerState = this.this$0.state;
                            this.label = 1;
                            if (analogTimePickerState.onGestureEnd(this) == coroutine_suspended) {
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
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    BuildersKt__Builders_commonKt.launch$default(clockDialNode.getCoroutineScope(), null, null, new AnonymousClass1(clockDialNode, null), 3, null);
                }
            };
            final ClockDialNode clockDialNode2 = this.this$0;
            Function2<PointerInputChange, Offset, Unit> function2 = new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1.2

                @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
                @DebugMetadata(m13595c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1", m13596f = "TimePicker.kt", m13597i = {}, m13598l = {1469}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
                /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ long $dragAmount;
                    int label;
                    final /* synthetic */ ClockDialNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(ClockDialNode clockDialNode, long j10, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.this$0 = clockDialNode;
                        this.$dragAmount = j10;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass1(this.this$0, this.$dragAmount, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i10 = this.label;
                        if (i10 == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.this$0.offsetX += Offset.m20735getXimpl(this.$dragAmount);
                            this.this$0.offsetY += Offset.m20736getYimpl(this.$dragAmount);
                            AnalogTimePickerState analogTimePickerState = this.this$0.state;
                            float fAtan = TimePickerKt.atan(this.this$0.offsetY - IntOffset.m23690getYimpl(this.this$0.center), this.this$0.offsetX - IntOffset.m23689getXimpl(this.this$0.center));
                            this.label = 1;
                            if (AnalogTimePickerState.rotateTo$default(analogTimePickerState, fAtan, false, this, 2, null) == coroutine_suspended) {
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
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
                    m18620invokeUv8p0NA(pointerInputChange, offset.m20745unboximpl());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                public final void m18620invokeUv8p0NA(PointerInputChange pointerInputChange, long j10) {
                    BuildersKt__Builders_commonKt.launch$default(clockDialNode2.getCoroutineScope(), null, null, new AnonymousClass1(clockDialNode2, j10, null), 3, null);
                    TimePickerKt.m19466moveSelectord3b8Pxo(clockDialNode2.state, clockDialNode2.offsetX, clockDialNode2.offsetY, clockDialNode2.getMaxDist(), clockDialNode2.center);
                }
            };
            this.label = 1;
            if (DragGestureDetectorKt.detectDragGestures$default(pointerInputScope, null, function0, null, function2, this, 5, null) == coroutine_suspended) {
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
