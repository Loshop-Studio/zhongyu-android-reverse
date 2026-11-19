package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.p011ui.geometry.InlineClassHelperKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEventKt;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.SourceDebugExtension;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m5110d2 = {"<anonymous>", "Landroidx/compose/foundation/text/selection/DownResolution;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1", m5303f = "SelectionGestures.kt", m5304i = {0}, m5305l = {283}, m5306m = "invokeSuspend", m5307n = {"$this$withTimeoutOrNull"}, m5308s = {"L$0"})
@SourceDebugExtension({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,449:1\n273#2:450\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1\n*L\n289#1:450\n*E\n"})
/* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 */
/* loaded from: classes.dex */
public final class C1460xcb1d223 extends RestrictedSuspendLambda implements InterfaceC6473e {
    final /* synthetic */ Ref$LongRef $overSlop;
    final /* synthetic */ long $pointerId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1460xcb1d223(long j7, Ref$LongRef ref$LongRef, InterfaceC5631c<? super C1460xcb1d223> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$pointerId = j7;
        this.$overSlop = ref$LongRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        C1460xcb1d223 c1460xcb1d223 = new C1460xcb1d223(this.$pointerId, this.$overSlop, interfaceC5631c);
        c1460xcb1d223.L$0 = obj;
        return c1460xcb1d223;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC5631c<? super DownResolution> interfaceC5631c) {
        return ((C1460xcb1d223) create(awaitPointerEventScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
            long j7 = this.$pointerId;
            final Ref$LongRef ref$LongRef = this.$overSlop;
            InterfaceC6473e interfaceC6473e = new InterfaceC6473e() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1$firstDragPastSlop$1
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    m8026invokeUv8p0NA((PointerInputChange) obj2, ((Offset) obj3).m10451unboximpl());
                    return C5443s.f8405a;
                }

                /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                public final void m8026invokeUv8p0NA(PointerInputChange pointerInputChange, long j8) {
                    pointerInputChange.consume();
                    ref$LongRef.element = j8;
                }
            };
            this.L$0 = awaitPointerEventScope2;
            this.label = 1;
            Object objM6954awaitTouchSlopOrCancellationjO51t88 = DragGestureDetectorKt.m6954awaitTouchSlopOrCancellationjO51t88(awaitPointerEventScope2, j7, interfaceC6473e, this);
            if (objM6954awaitTouchSlopOrCancellationjO51t88 == coroutineSingletons) {
                return coroutineSingletons;
            }
            awaitPointerEventScope = awaitPointerEventScope2;
            obj = objM6954awaitTouchSlopOrCancellationjO51t88;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            AbstractC5774b.m5119b(obj);
        }
        if (((PointerInputChange) obj) != null && (this.$overSlop.element & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            return DownResolution.Drag;
        }
        PointerInputChange pointerInputChange = (PointerInputChange) AbstractC5805t.m5228h0(awaitPointerEventScope.getCurrentEvent().getChanges());
        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            return DownResolution.Cancel;
        }
        pointerInputChange.consume();
        return DownResolution.f785Up;
    }
}
