package androidx.compose.material3;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
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
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/PointerInputScope;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
@DebugMetadata(m5302c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1", m5303f = "TimePicker.kt", m5304i = {}, m5305l = {1439}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes.dex */
public final class ClockDialNode$pointerInputTapNode$1 extends SuspendLambda implements InterfaceC6473e {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ClockDialNode this$0;

    @Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m5110d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", "it", "Ld6/s;", "<anonymous>", "(Landroidx/compose/foundation/gestures/PressGestureScope;Landroidx/compose/ui/geometry/Offset;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
    @DebugMetadata(m5302c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1", m5303f = "TimePicker.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1 */
    public static final class C15801 extends SuspendLambda implements InterfaceC6474f {
        /* synthetic */ long J$0;
        int label;
        final /* synthetic */ ClockDialNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15801(ClockDialNode clockDialNode, InterfaceC5631c<? super C15801> interfaceC5631c) {
            super(3, interfaceC5631c);
            this.this$0 = clockDialNode;
        }

        @Override // p152r6.InterfaceC6474f
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m8271invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m10451unboximpl(), (InterfaceC5631c) obj3);
        }

        @Nullable
        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m8271invoked4ec7I(@NotNull PressGestureScope pressGestureScope, long j7, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
            C15801 c15801 = new C15801(this.this$0, interfaceC5631c);
            c15801.J$0 = j7;
            return c15801.invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            long j7 = this.J$0;
            this.this$0.offsetX = Offset.m10441getXimpl(j7);
            this.this$0.offsetY = Offset.m10442getYimpl(j7);
            return C5443s.f8405a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockDialNode$pointerInputTapNode$1(ClockDialNode clockDialNode, InterfaceC5631c<? super ClockDialNode$pointerInputTapNode$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = clockDialNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
        ClockDialNode$pointerInputTapNode$1 clockDialNode$pointerInputTapNode$1 = new ClockDialNode$pointerInputTapNode$1(this.this$0, interfaceC5631c);
        clockDialNode$pointerInputTapNode$1.L$0 = obj;
        return clockDialNode$pointerInputTapNode$1;
    }

    @Override // p152r6.InterfaceC6473e
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((ClockDialNode$pointerInputTapNode$1) create(pointerInputScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            C15801 c15801 = new C15801(this.this$0, null);
            final ClockDialNode clockDialNode = this.this$0;
            InterfaceC6471c interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1.2

                @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
                @DebugMetadata(m5302c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1", m5303f = "TimePicker.kt", m5304i = {}, m5305l = {1446}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
                    final /* synthetic */ long $it;
                    int label;
                    final /* synthetic */ ClockDialNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(ClockDialNode clockDialNode, long j7, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                        super(2, interfaceC5631c);
                        this.this$0 = clockDialNode;
                        this.$it = j7;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final InterfaceC5631c<C5443s> create(@Nullable Object obj, @NotNull InterfaceC5631c<?> interfaceC5631c) {
                        return new AnonymousClass1(this.this$0, this.$it, interfaceC5631c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i = this.label;
                        if (i == 0) {
                            AbstractC5774b.m5119b(obj);
                            AnalogTimePickerState analogTimePickerState = this.this$0.state;
                            float fM10441getXimpl = Offset.m10441getXimpl(this.$it);
                            float fM10442getYimpl = Offset.m10442getYimpl(this.$it);
                            float maxDist = this.this$0.getMaxDist();
                            boolean z8 = this.this$0.autoSwitchToMinute;
                            long j7 = this.this$0.center;
                            this.label = 1;
                            if (TimePickerKt.m9143onTaprOwcSBo(analogTimePickerState, fM10441getXimpl, fM10442getYimpl, maxDist, z8, j7, this) == coroutineSingletons) {
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
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m8272invokek4lQ0M(((Offset) obj2).m10451unboximpl());
                    return C5443s.f8405a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m8272invokek4lQ0M(long j7) {
                    AbstractC6014x.m5651v(clockDialNode.getCoroutineScope(), null, null, new AnonymousClass1(clockDialNode, j7, null), 3);
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, c15801, interfaceC6471c, this, 3, null) == coroutineSingletons) {
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
