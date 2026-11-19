package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.p014ui.geometry.InlineClassHelperKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p014ui.input.pointer.PointerEventKt;
import androidx.compose.p014ui.input.pointer.PointerInputChange;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1", m26211f = "SelectionGestures.kt", m26212l = {283}, m26213m = "invokeSuspend")
/* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 */
/* loaded from: classes.dex */
public final class C1973xcb1d223 extends RestrictedSuspendLambda implements InterfaceC9544p {
    final /* synthetic */ Ref$LongRef $overSlop;
    final /* synthetic */ long $pointerId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1973xcb1d223(long j10, Ref$LongRef ref$LongRef, InterfaceC11588c<? super C1973xcb1d223> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$pointerId = j10;
        this.$overSlop = ref$LongRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        C1973xcb1d223 c1973xcb1d223 = new C1973xcb1d223(this.$pointerId, this.$overSlop, interfaceC11588c);
        c1973xcb1d223.L$0 = obj;
        return c1973xcb1d223;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC11588c<? super DownResolution> interfaceC11588c) {
        return ((C1973xcb1d223) create(awaitPointerEventScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AwaitPointerEventScope awaitPointerEventScope;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
            long j10 = this.$pointerId;
            final Ref$LongRef ref$LongRef = this.$overSlop;
            InterfaceC9544p interfaceC9544p = new InterfaceC9544p() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1$firstDragPastSlop$1
                {
                    super(2);
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    m28222invokeUv8p0NA((PointerInputChange) obj2, ((Offset) obj3).m30647unboximpl());
                    return C10786q.f26013a;
                }

                /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                public final void m28222invokeUv8p0NA(PointerInputChange pointerInputChange, long j11) {
                    pointerInputChange.consume();
                    ref$LongRef.f23401c = j11;
                }
            };
            this.L$0 = awaitPointerEventScope2;
            this.label = 1;
            Object objM27150awaitTouchSlopOrCancellationjO51t88 = DragGestureDetectorKt.m27150awaitTouchSlopOrCancellationjO51t88(awaitPointerEventScope2, j10, interfaceC9544p, this);
            if (objM27150awaitTouchSlopOrCancellationjO51t88 == objM25952f) {
                return objM25952f;
            }
            awaitPointerEventScope = awaitPointerEventScope2;
            obj = objM27150awaitTouchSlopOrCancellationjO51t88;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            AbstractC9924b.m20071b(obj);
        }
        if (((PointerInputChange) obj) != null && (this.$overSlop.f23401c & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            return DownResolution.Drag;
        }
        PointerInputChange pointerInputChange = (PointerInputChange) AbstractC10947g0.m23944m0(awaitPointerEventScope.getCurrentEvent().getChanges());
        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            return DownResolution.Cancel;
        }
        pointerInputChange.consume();
        return DownResolution.f1123Up;
    }
}
