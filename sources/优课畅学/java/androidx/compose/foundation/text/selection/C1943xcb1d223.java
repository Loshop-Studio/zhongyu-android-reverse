package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.p013ui.geometry.InlineClassHelperKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p013ui.input.pointer.PointerEventKt;
import androidx.compose.p013ui.input.pointer.PointerInputChange;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1", m17801f = "SelectionGestures.kt", m17802l = {283}, m17803m = "invokeSuspend")
/* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 */
/* loaded from: classes.dex */
public final class C1943xcb1d223 extends RestrictedSuspendLambda implements InterfaceC10574p {
    final /* synthetic */ Ref$LongRef $overSlop;
    final /* synthetic */ long $pointerId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1943xcb1d223(long j10, Ref$LongRef ref$LongRef, InterfaceC9324c<? super C1943xcb1d223> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$pointerId = j10;
        this.$overSlop = ref$LongRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        C1943xcb1d223 c1943xcb1d223 = new C1943xcb1d223(this.$pointerId, this.$overSlop, interfaceC9324c);
        c1943xcb1d223.L$0 = obj;
        return c1943xcb1d223;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC9324c<? super DownResolution> interfaceC9324c) {
        return ((C1943xcb1d223) create(awaitPointerEventScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AwaitPointerEventScope awaitPointerEventScope;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
            long j10 = this.$pointerId;
            final Ref$LongRef ref$LongRef = this.$overSlop;
            InterfaceC10574p interfaceC10574p = new InterfaceC10574p() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1$firstDragPastSlop$1
                {
                    super(2);
                }

                @Override // p300x7.InterfaceC10574p
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    m21620invokeUv8p0NA((PointerInputChange) obj2, ((Offset) obj3).m24045unboximpl());
                    return C8736p.f16368a;
                }

                /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                public final void m21620invokeUv8p0NA(PointerInputChange pointerInputChange, long j11) {
                    pointerInputChange.consume();
                    ref$LongRef.f17472a = j11;
                }
            };
            this.L$0 = awaitPointerEventScope2;
            this.label = 1;
            Object objM20548awaitTouchSlopOrCancellationjO51t88 = DragGestureDetectorKt.m20548awaitTouchSlopOrCancellationjO51t88(awaitPointerEventScope2, j10, interfaceC10574p, this);
            if (objM20548awaitTouchSlopOrCancellationjO51t88 == objM17291f) {
                return objM17291f;
            }
            awaitPointerEventScope = awaitPointerEventScope2;
            obj = objM20548awaitTouchSlopOrCancellationjO51t88;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            AbstractC9079b.m15926b(obj);
        }
        if (((PointerInputChange) obj) != null && (this.$overSlop.f17472a & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            return DownResolution.Drag;
        }
        PointerInputChange pointerInputChange = (PointerInputChange) AbstractC8778f0.m14566l0(awaitPointerEventScope.getCurrentEvent().getChanges());
        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            return DownResolution.Cancel;
        }
        pointerInputChange.consume();
        return DownResolution.f1193Up;
    }
}
