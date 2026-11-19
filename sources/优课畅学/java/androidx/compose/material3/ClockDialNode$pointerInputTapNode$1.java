package androidx.compose.material3;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1", m17801f = "TimePicker.kt", m17802l = {1439}, m17803m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ClockDialNode$pointerInputTapNode$1 extends SuspendLambda implements InterfaceC10574p {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ClockDialNode this$0;

    @InterfaceC9539d(m17800c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1", m17801f = "TimePicker.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1 */
    public static final class C20701 extends SuspendLambda implements InterfaceC10575q {
        /* synthetic */ long J$0;
        int label;
        final /* synthetic */ ClockDialNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20701(ClockDialNode clockDialNode, InterfaceC9324c<? super C20701> interfaceC9324c) {
            super(3, interfaceC9324c);
            this.this$0 = clockDialNode;
        }

        @Override // p300x7.InterfaceC10575q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m21865invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m24045unboximpl(), (InterfaceC9324c) obj3);
        }

        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m21865invoked4ec7I(PressGestureScope pressGestureScope, long j10, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            C20701 c20701 = new C20701(this.this$0, interfaceC9324c);
            c20701.J$0 = j10;
            return c20701.invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            long j10 = this.J$0;
            this.this$0.offsetX = Offset.m24035getXimpl(j10);
            this.this$0.offsetY = Offset.m24036getYimpl(j10);
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockDialNode$pointerInputTapNode$1(ClockDialNode clockDialNode, InterfaceC9324c<? super ClockDialNode$pointerInputTapNode$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.this$0 = clockDialNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        ClockDialNode$pointerInputTapNode$1 clockDialNode$pointerInputTapNode$1 = new ClockDialNode$pointerInputTapNode$1(this.this$0, interfaceC9324c);
        clockDialNode$pointerInputTapNode$1.L$0 = obj;
        return clockDialNode$pointerInputTapNode$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(PointerInputScope pointerInputScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((ClockDialNode$pointerInputTapNode$1) create(pointerInputScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            C20701 c20701 = new C20701(this.this$0, null);
            final ClockDialNode clockDialNode = this.this$0;
            InterfaceC10570l interfaceC10570l = new InterfaceC10570l() { // from class: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1.2

                @InterfaceC9539d(m17800c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1", m17801f = "TimePicker.kt", m17802l = {1446}, m17803m = "invokeSuspend")
                /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
                    final /* synthetic */ long $it;
                    int label;
                    final /* synthetic */ ClockDialNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(ClockDialNode clockDialNode, long j10, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                        super(2, interfaceC9324c);
                        this.this$0 = clockDialNode;
                        this.$it = j10;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                        return new AnonymousClass1(this.this$0, this.$it, interfaceC9324c);
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
                            AnalogTimePickerState analogTimePickerState = this.this$0.state;
                            float fM24035getXimpl = Offset.m24035getXimpl(this.$it);
                            float fM24036getYimpl = Offset.m24036getYimpl(this.$it);
                            float maxDist = this.this$0.getMaxDist();
                            boolean z10 = this.this$0.autoSwitchToMinute;
                            long j10 = this.this$0.center;
                            this.label = 1;
                            if (TimePickerKt.m22737onTaprOwcSBo(analogTimePickerState, fM24035getXimpl, fM24036getYimpl, maxDist, z10, j10, this) == objM17291f) {
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
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m21866invokek4lQ0M(((Offset) obj2).m24045unboximpl());
                    return C8736p.f16368a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m21866invokek4lQ0M(long j10) {
                    AbstractC8839h.m14861d(clockDialNode.getCoroutineScope(), null, null, new AnonymousClass1(clockDialNode, j10, null), 3, null);
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, c20701, interfaceC10570l, this, 3, null) == objM17291f) {
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
