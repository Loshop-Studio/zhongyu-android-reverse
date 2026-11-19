package androidx.compose.material3;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.pointer.PointerInputChange;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import androidx.compose.p014ui.unit.IntOffset;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1", m26211f = "TimePicker.kt", m26212l = {1456}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ClockDialNode$pointerInputDragNode$1 extends SuspendLambda implements InterfaceC9544p {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ClockDialNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockDialNode$pointerInputDragNode$1(ClockDialNode clockDialNode, InterfaceC11588c<? super ClockDialNode$pointerInputDragNode$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = clockDialNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        ClockDialNode$pointerInputDragNode$1 clockDialNode$pointerInputDragNode$1 = new ClockDialNode$pointerInputDragNode$1(this.this$0, interfaceC11588c);
        clockDialNode$pointerInputDragNode$1.L$0 = obj;
        return clockDialNode$pointerInputDragNode$1;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((ClockDialNode$pointerInputDragNode$1) create(pointerInputScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            final ClockDialNode clockDialNode = this.this$0;
            InterfaceC9529a interfaceC9529a = new InterfaceC9529a() { // from class: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1.1

                @InterfaceC11829d(m26210c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1$1", m26211f = "TimePicker.kt", m26212l = {1462}, m26213m = "invokeSuspend")
                /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
                    int label;
                    final /* synthetic */ ClockDialNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(ClockDialNode clockDialNode, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                        super(2, interfaceC11588c);
                        this.this$0 = clockDialNode;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                        return new AnonymousClass1(this.this$0, interfaceC11588c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        Object objM25952f = AbstractC11725a.m25952f();
                        int i10 = this.label;
                        if (i10 == 0) {
                            AbstractC9924b.m20071b(obj);
                            if (this.this$0.autoSwitchToMinute) {
                                this.this$0.state.mo28339setSelection6_8s6DQ(TimePickerSelectionMode.Companion.m29363getMinuteyecRtBI());
                            }
                            AnalogTimePickerState analogTimePickerState = this.this$0.state;
                            this.label = 1;
                            if (analogTimePickerState.onGestureEnd(this) == objM25952f) {
                                return objM25952f;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC9924b.m20071b(obj);
                        }
                        return C10786q.f26013a;
                    }

                    @Override // p181hd.InterfaceC9544p
                    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                        return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                    }
                }

                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m28465invoke();
                    return C10786q.f26013a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m28465invoke() {
                    AbstractC11117h.m24726d(clockDialNode.getCoroutineScope(), null, null, new AnonymousClass1(clockDialNode, null), 3, null);
                }
            };
            final ClockDialNode clockDialNode2 = this.this$0;
            InterfaceC9544p interfaceC9544p = new InterfaceC9544p() { // from class: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1.2

                @InterfaceC11829d(m26210c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1", m26211f = "TimePicker.kt", m26212l = {1469}, m26213m = "invokeSuspend")
                /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
                    final /* synthetic */ long $dragAmount;
                    int label;
                    final /* synthetic */ ClockDialNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(ClockDialNode clockDialNode, long j10, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                        super(2, interfaceC11588c);
                        this.this$0 = clockDialNode;
                        this.$dragAmount = j10;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                        return new AnonymousClass1(this.this$0, this.$dragAmount, interfaceC11588c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        Object objM25952f = AbstractC11725a.m25952f();
                        int i10 = this.label;
                        if (i10 == 0) {
                            AbstractC9924b.m20071b(obj);
                            this.this$0.offsetX += Offset.m30637getXimpl(this.$dragAmount);
                            this.this$0.offsetY += Offset.m30638getYimpl(this.$dragAmount);
                            AnalogTimePickerState analogTimePickerState = this.this$0.state;
                            float fAtan = TimePickerKt.atan(this.this$0.offsetY - IntOffset.m33630getYimpl(this.this$0.center), this.this$0.offsetX - IntOffset.m33629getXimpl(this.this$0.center));
                            this.label = 1;
                            if (AnalogTimePickerState.rotateTo$default(analogTimePickerState, fAtan, false, this, 2, null) == objM25952f) {
                                return objM25952f;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC9924b.m20071b(obj);
                        }
                        return C10786q.f26013a;
                    }

                    @Override // p181hd.InterfaceC9544p
                    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                        return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                    }
                }

                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    m28466invokeUv8p0NA((PointerInputChange) obj2, ((Offset) obj3).m30647unboximpl());
                    return C10786q.f26013a;
                }

                /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                public final void m28466invokeUv8p0NA(PointerInputChange pointerInputChange, long j10) {
                    AbstractC11117h.m24726d(clockDialNode2.getCoroutineScope(), null, null, new AnonymousClass1(clockDialNode2, j10, null), 3, null);
                    TimePickerKt.m29337moveSelectord3b8Pxo(clockDialNode2.state, clockDialNode2.offsetX, clockDialNode2.offsetY, clockDialNode2.getMaxDist(), clockDialNode2.center);
                }
            };
            this.label = 1;
            if (DragGestureDetectorKt.detectDragGestures$default(pointerInputScope, null, interfaceC9529a, null, interfaceC9544p, this, 5, null) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }
}
