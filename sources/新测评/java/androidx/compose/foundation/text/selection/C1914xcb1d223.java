package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.p013ui.geometry.InlineClassHelperKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p013ui.input.pointer.PointerEventKt;
import androidx.compose.p013ui.input.pointer.PointerInputChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "Landroidx/compose/foundation/text/selection/DownResolution;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1", m13596f = "SelectionGestures.kt", m13597i = {0}, m13598l = {283}, m13599m = "invokeSuspend", m13600n = {"$this$withTimeoutOrNull"}, m13601s = {"L$0"})
@SourceDebugExtension({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,449:1\n273#2:450\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1\n*L\n289#1:450\n*E\n"})
/* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 */
/* loaded from: classes.dex */
public final class C1914xcb1d223 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super DownResolution>, Object> {
    final /* synthetic */ Ref.LongRef $overSlop;
    final /* synthetic */ long $pointerId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1914xcb1d223(long j10, Ref.LongRef longRef, Continuation<? super C1914xcb1d223> continuation) {
        super(2, continuation);
        this.$pointerId = j10;
        this.$overSlop = longRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C1914xcb1d223 c1914xcb1d223 = new C1914xcb1d223(this.$pointerId, this.$overSlop, continuation);
        c1914xcb1d223.L$0 = obj;
        return c1914xcb1d223;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super DownResolution> continuation) {
        return ((C1914xcb1d223) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
            long j10 = this.$pointerId;
            final Ref.LongRef longRef = this.$overSlop;
            Function2<PointerInputChange, Offset, Unit> function2 = new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1$firstDragPastSlop$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
                    m18398invokeUv8p0NA(pointerInputChange, offset.m20745unboximpl());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                public final void m18398invokeUv8p0NA(PointerInputChange pointerInputChange, long j11) {
                    pointerInputChange.consume();
                    longRef.element = j11;
                }
            };
            this.L$0 = awaitPointerEventScope2;
            this.label = 1;
            Object objM17382awaitTouchSlopOrCancellationjO51t88 = DragGestureDetectorKt.m17382awaitTouchSlopOrCancellationjO51t88(awaitPointerEventScope2, j10, function2, this);
            if (objM17382awaitTouchSlopOrCancellationjO51t88 == coroutine_suspended) {
                return coroutine_suspended;
            }
            awaitPointerEventScope = awaitPointerEventScope2;
            obj = objM17382awaitTouchSlopOrCancellationjO51t88;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (((PointerInputChange) obj) != null && (this.$overSlop.element & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            return DownResolution.Drag;
        }
        PointerInputChange pointerInputChange = (PointerInputChange) CollectionsKt.first((List) awaitPointerEventScope.getCurrentEvent().getChanges());
        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            return DownResolution.Cancel;
        }
        pointerInputChange.consume();
        return DownResolution.f1296Up;
    }
}
