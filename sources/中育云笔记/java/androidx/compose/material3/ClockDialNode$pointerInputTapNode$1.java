package androidx.compose.material3;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1", m26211f = "TimePicker.kt", m26212l = {1439}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ClockDialNode$pointerInputTapNode$1 extends SuspendLambda implements InterfaceC9544p {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ClockDialNode this$0;

    @InterfaceC11829d(m26210c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1", m26211f = "TimePicker.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1 */
    public static final class C21001 extends SuspendLambda implements InterfaceC9545q {
        /* synthetic */ long J$0;
        int label;
        final /* synthetic */ ClockDialNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21001(ClockDialNode clockDialNode, InterfaceC11588c<? super C21001> interfaceC11588c) {
            super(3, interfaceC11588c);
            this.this$0 = clockDialNode;
        }

        @Override // p181hd.InterfaceC9545q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m28467invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m30647unboximpl(), (InterfaceC11588c) obj3);
        }

        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m28467invoked4ec7I(PressGestureScope pressGestureScope, long j10, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            C21001 c21001 = new C21001(this.this$0, interfaceC11588c);
            c21001.J$0 = j10;
            return c21001.invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            long j10 = this.J$0;
            this.this$0.offsetX = Offset.m30637getXimpl(j10);
            this.this$0.offsetY = Offset.m30638getYimpl(j10);
            return C10786q.f26013a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockDialNode$pointerInputTapNode$1(ClockDialNode clockDialNode, InterfaceC11588c<? super ClockDialNode$pointerInputTapNode$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = clockDialNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        ClockDialNode$pointerInputTapNode$1 clockDialNode$pointerInputTapNode$1 = new ClockDialNode$pointerInputTapNode$1(this.this$0, interfaceC11588c);
        clockDialNode$pointerInputTapNode$1.L$0 = obj;
        return clockDialNode$pointerInputTapNode$1;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(PointerInputScope pointerInputScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((ClockDialNode$pointerInputTapNode$1) create(pointerInputScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            C21001 c21001 = new C21001(this.this$0, null);
            final ClockDialNode clockDialNode = this.this$0;
            InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1.2

                @InterfaceC11829d(m26210c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1", m26211f = "TimePicker.kt", m26212l = {1446}, m26213m = "invokeSuspend")
                /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
                    final /* synthetic */ long $it;
                    int label;
                    final /* synthetic */ ClockDialNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(ClockDialNode clockDialNode, long j10, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                        super(2, interfaceC11588c);
                        this.this$0 = clockDialNode;
                        this.$it = j10;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                        return new AnonymousClass1(this.this$0, this.$it, interfaceC11588c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        Object objM25952f = AbstractC11725a.m25952f();
                        int i10 = this.label;
                        if (i10 == 0) {
                            AbstractC9924b.m20071b(obj);
                            AnalogTimePickerState analogTimePickerState = this.this$0.state;
                            float fM30637getXimpl = Offset.m30637getXimpl(this.$it);
                            float fM30638getYimpl = Offset.m30638getYimpl(this.$it);
                            float maxDist = this.this$0.getMaxDist();
                            boolean z10 = this.this$0.autoSwitchToMinute;
                            long j10 = this.this$0.center;
                            this.label = 1;
                            if (TimePickerKt.m29339onTaprOwcSBo(analogTimePickerState, fM30637getXimpl, fM30638getYimpl, maxDist, z10, j10, this) == objM25952f) {
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
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m28468invokek4lQ0M(((Offset) obj2).m30647unboximpl());
                    return C10786q.f26013a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m28468invokek4lQ0M(long j10) {
                    AbstractC11117h.m24726d(clockDialNode.getCoroutineScope(), null, null, new AnonymousClass1(clockDialNode, j10, null), 3, null);
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, c21001, interfaceC9540l, this, 3, null) == objM25952f) {
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
