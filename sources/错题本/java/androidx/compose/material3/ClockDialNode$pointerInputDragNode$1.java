package androidx.compose.material3;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.unit.IntOffset;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/PointerInputScope;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
@DebugMetadata(m5302c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1", m5303f = "TimePicker.kt", m5304i = {}, m5305l = {1456}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes.dex */
public final class ClockDialNode$pointerInputDragNode$1 extends SuspendLambda implements InterfaceC6473e {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ClockDialNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockDialNode$pointerInputDragNode$1(ClockDialNode clockDialNode, InterfaceC5631c<? super ClockDialNode$pointerInputDragNode$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = clockDialNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
        ClockDialNode$pointerInputDragNode$1 clockDialNode$pointerInputDragNode$1 = new ClockDialNode$pointerInputDragNode$1(this.this$0, interfaceC5631c);
        clockDialNode$pointerInputDragNode$1.L$0 = obj;
        return clockDialNode$pointerInputDragNode$1;
    }

    @Override // p152r6.InterfaceC6473e
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((ClockDialNode$pointerInputDragNode$1) create(pointerInputScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            final ClockDialNode clockDialNode = this.this$0;
            InterfaceC6469a interfaceC6469a = new InterfaceC6469a() { // from class: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1.1

                @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
                @DebugMetadata(m5302c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1$1", m5303f = "TimePicker.kt", m5304i = {}, m5305l = {1462}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
                    int label;
                    final /* synthetic */ ClockDialNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(ClockDialNode clockDialNode, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                        super(2, interfaceC5631c);
                        this.this$0 = clockDialNode;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                        return new AnonymousClass1(this.this$0, interfaceC5631c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i = this.label;
                        if (i == 0) {
                            AbstractC5774b.m5119b(obj);
                            if (this.this$0.autoSwitchToMinute) {
                                this.this$0.state.mo8143setSelection6_8s6DQ(TimePickerSelectionMode.INSTANCE.m9167getMinuteyecRtBI());
                            }
                            AnalogTimePickerState analogTimePickerState = this.this$0.state;
                            this.label = 1;
                            if (analogTimePickerState.onGestureEnd(this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC5774b.m5119b(obj);
                        }
                        return C5443s.f8405a;
                    }

                    @Override // p152r6.InterfaceC6473e
                    @Nullable
                    public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
                        return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                    }
                }

                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m8269invoke();
                    return C5443s.f8405a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m8269invoke() {
                    AbstractC6014x.m5651v(clockDialNode.getCoroutineScope(), null, null, new AnonymousClass1(clockDialNode, null), 3);
                }
            };
            final ClockDialNode clockDialNode2 = this.this$0;
            InterfaceC6473e interfaceC6473e = new InterfaceC6473e() { // from class: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1.2

                @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
                @DebugMetadata(m5302c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1", m5303f = "TimePicker.kt", m5304i = {}, m5305l = {1469}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
                    final /* synthetic */ long $dragAmount;
                    int label;
                    final /* synthetic */ ClockDialNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(ClockDialNode clockDialNode, long j7, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                        super(2, interfaceC5631c);
                        this.this$0 = clockDialNode;
                        this.$dragAmount = j7;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                        return new AnonymousClass1(this.this$0, this.$dragAmount, interfaceC5631c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i = this.label;
                        if (i == 0) {
                            AbstractC5774b.m5119b(obj);
                            ClockDialNode clockDialNode = this.this$0;
                            clockDialNode.offsetX = Offset.m10441getXimpl(this.$dragAmount) + clockDialNode.offsetX;
                            ClockDialNode clockDialNode2 = this.this$0;
                            clockDialNode2.offsetY = Offset.m10442getYimpl(this.$dragAmount) + clockDialNode2.offsetY;
                            AnalogTimePickerState analogTimePickerState = this.this$0.state;
                            float fAtan = TimePickerKt.atan(this.this$0.offsetY - IntOffset.m13434getYimpl(this.this$0.center), this.this$0.offsetX - IntOffset.m13433getXimpl(this.this$0.center));
                            this.label = 1;
                            if (AnalogTimePickerState.rotateTo$default(analogTimePickerState, fAtan, false, this, 2, null) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC5774b.m5119b(obj);
                        }
                        return C5443s.f8405a;
                    }

                    @Override // p152r6.InterfaceC6473e
                    @Nullable
                    public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
                        return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                    }
                }

                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    m8270invokeUv8p0NA((PointerInputChange) obj2, ((Offset) obj3).m10451unboximpl());
                    return C5443s.f8405a;
                }

                /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                public final void m8270invokeUv8p0NA(@NotNull PointerInputChange pointerInputChange, long j7) {
                    AbstractC6014x.m5651v(clockDialNode2.getCoroutineScope(), null, null, new AnonymousClass1(clockDialNode2, j7, null), 3);
                    TimePickerKt.m9141moveSelectord3b8Pxo(clockDialNode2.state, clockDialNode2.offsetX, clockDialNode2.offsetY, clockDialNode2.getMaxDist(), clockDialNode2.center);
                }
            };
            this.label = 1;
            if (DragGestureDetectorKt.detectDragGestures$default(pointerInputScope, null, interfaceC6469a, null, interfaceC6473e, this, 5, null) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
        }
        return C5443s.f8405a;
    }
}
