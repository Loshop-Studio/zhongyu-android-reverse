package androidx.compose.material3;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.PointerInputChange;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import androidx.compose.p013ui.unit.IntOffset;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1", m17801f = "TimePicker.kt", m17802l = {1456}, m17803m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ClockDialNode$pointerInputDragNode$1 extends SuspendLambda implements InterfaceC10574p {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ClockDialNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockDialNode$pointerInputDragNode$1(ClockDialNode clockDialNode, InterfaceC9324c<? super ClockDialNode$pointerInputDragNode$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.this$0 = clockDialNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        ClockDialNode$pointerInputDragNode$1 clockDialNode$pointerInputDragNode$1 = new ClockDialNode$pointerInputDragNode$1(this.this$0, interfaceC9324c);
        clockDialNode$pointerInputDragNode$1.L$0 = obj;
        return clockDialNode$pointerInputDragNode$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(PointerInputScope pointerInputScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((ClockDialNode$pointerInputDragNode$1) create(pointerInputScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            final ClockDialNode clockDialNode = this.this$0;
            InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1.1

                @InterfaceC9539d(m17800c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1$1", m17801f = "TimePicker.kt", m17802l = {1462}, m17803m = "invokeSuspend")
                /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
                    int label;
                    final /* synthetic */ ClockDialNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(ClockDialNode clockDialNode, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                        super(2, interfaceC9324c);
                        this.this$0 = clockDialNode;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                        return new AnonymousClass1(this.this$0, interfaceC9324c);
                    }

                    @Override // p300x7.InterfaceC10574p
                    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                        return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        Object objM17291f = AbstractC9434a.m17291f();
                        int i10 = this.label;
                        if (i10 == 0) {
                            AbstractC9079b.m15926b(obj);
                            if (this.this$0.autoSwitchToMinute) {
                                this.this$0.state.mo21737setSelection6_8s6DQ(TimePickerSelectionMode.Companion.m22761getMinuteyecRtBI());
                            }
                            AnalogTimePickerState analogTimePickerState = this.this$0.state;
                            this.label = 1;
                            if (analogTimePickerState.onGestureEnd(this) == objM17291f) {
                                return objM17291f;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC9079b.m15926b(obj);
                        }
                        return C8736p.f16368a;
                    }
                }

                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m21863invoke();
                    return C8736p.f16368a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m21863invoke() {
                    AbstractC8839h.m14861d(clockDialNode.getCoroutineScope(), null, null, new AnonymousClass1(clockDialNode, null), 3, null);
                }
            };
            final ClockDialNode clockDialNode2 = this.this$0;
            InterfaceC10574p interfaceC10574p = new InterfaceC10574p() { // from class: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1.2

                @InterfaceC9539d(m17800c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1", m17801f = "TimePicker.kt", m17802l = {1469}, m17803m = "invokeSuspend")
                /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
                    final /* synthetic */ long $dragAmount;
                    int label;
                    final /* synthetic */ ClockDialNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(ClockDialNode clockDialNode, long j10, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                        super(2, interfaceC9324c);
                        this.this$0 = clockDialNode;
                        this.$dragAmount = j10;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                        return new AnonymousClass1(this.this$0, this.$dragAmount, interfaceC9324c);
                    }

                    @Override // p300x7.InterfaceC10574p
                    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                        return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        Object objM17291f = AbstractC9434a.m17291f();
                        int i10 = this.label;
                        if (i10 == 0) {
                            AbstractC9079b.m15926b(obj);
                            this.this$0.offsetX += Offset.m24035getXimpl(this.$dragAmount);
                            this.this$0.offsetY += Offset.m24036getYimpl(this.$dragAmount);
                            AnalogTimePickerState analogTimePickerState = this.this$0.state;
                            float fAtan = TimePickerKt.atan(this.this$0.offsetY - IntOffset.m27028getYimpl(this.this$0.center), this.this$0.offsetX - IntOffset.m27027getXimpl(this.this$0.center));
                            this.label = 1;
                            if (AnalogTimePickerState.rotateTo$default(analogTimePickerState, fAtan, false, this, 2, null) == objM17291f) {
                                return objM17291f;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC9079b.m15926b(obj);
                        }
                        return C8736p.f16368a;
                    }
                }

                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    m21864invokeUv8p0NA((PointerInputChange) obj2, ((Offset) obj3).m24045unboximpl());
                    return C8736p.f16368a;
                }

                /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                public final void m21864invokeUv8p0NA(PointerInputChange pointerInputChange, long j10) {
                    AbstractC8839h.m14861d(clockDialNode2.getCoroutineScope(), null, null, new AnonymousClass1(clockDialNode2, j10, null), 3, null);
                    TimePickerKt.m22735moveSelectord3b8Pxo(clockDialNode2.state, clockDialNode2.offsetX, clockDialNode2.offsetY, clockDialNode2.getMaxDist(), clockDialNode2.center);
                }
            };
            this.label = 1;
            if (DragGestureDetectorKt.detectDragGestures$default(pointerInputScope, null, interfaceC10559a, null, interfaceC10574p, this, 5, null) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }
}
