package androidx.compose.foundation.gestures;

import androidx.compose.p013ui.unit.Velocity;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, m13558d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1", m13596f = "AnchoredDraggable.kt", m13597i = {}, m13598l = {434, 436}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes.dex */
public final class AnchoredDraggableNode$onDragStopped$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $velocity;
    int label;
    final /* synthetic */ AnchoredDraggableNode<T> this$0;

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, m13558d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Velocity;", ExifInterface.GPS_DIRECTION_TRUE, "availableVelocity"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1", m13596f = "AnchoredDraggable.kt", m13597i = {0}, m13598l = {438}, m13599m = "invokeSuspend", m13600n = {"availableVelocity"}, m13601s = {"J$0"})
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1 */
    public static final class C12141 extends SuspendLambda implements Function2<Velocity, Continuation<? super Velocity>, Object> {
        /* synthetic */ long J$0;
        int label;
        final /* synthetic */ AnchoredDraggableNode<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12141(AnchoredDraggableNode<T> anchoredDraggableNode, Continuation<? super C12141> continuation) {
            super(2, continuation);
            this.this$0 = anchoredDraggableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12141 c12141 = new C12141(this.this$0, continuation);
            c12141.J$0 = ((Velocity) obj).getPackedValue();
            return c12141;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Velocity velocity, Continuation<? super Velocity> continuation) {
            return m17353invokesFctU(velocity.getPackedValue(), continuation);
        }

        /* renamed from: invoke-sF-c-tU, reason: not valid java name */
        public final Object m17353invokesFctU(long j10, Continuation<? super Velocity> continuation) {
            return ((C12141) create(Velocity.m23790boximpl(j10), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            long jM17349toVelocityadjELrA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                long j10 = this.J$0;
                AnchoredDraggableNode<T> anchoredDraggableNode = this.this$0;
                float fM17346toFloatTH1AsA0 = anchoredDraggableNode.m17346toFloatTH1AsA0(j10);
                this.J$0 = j10;
                this.label = 1;
                obj = anchoredDraggableNode.fling(fM17346toFloatTH1AsA0, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                jM17349toVelocityadjELrA = j10;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jM17349toVelocityadjELrA = this.J$0;
                ResultKt.throwOnFailure(obj);
            }
            float fFloatValue = ((Number) obj).floatValue();
            float fRequireOffset = ((AnchoredDraggableNode) this.this$0).state.requireOffset();
            float fMinPosition = ((AnchoredDraggableNode) this.this$0).state.getAnchors().minPosition();
            if (fRequireOffset >= ((AnchoredDraggableNode) this.this$0).state.getAnchors().maxPosition() || fRequireOffset <= fMinPosition) {
                jM17349toVelocityadjELrA = this.this$0.m17349toVelocityadjELrA(fFloatValue);
            }
            return Velocity.m23790boximpl(jM17349toVelocityadjELrA);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$onDragStopped$1(AnchoredDraggableNode<T> anchoredDraggableNode, long j10, Continuation<? super AnchoredDraggableNode$onDragStopped$1> continuation) {
        super(2, continuation);
        this.this$0 = anchoredDraggableNode;
        this.$velocity = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AnchoredDraggableNode$onDragStopped$1(this.this$0, this.$velocity, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r1.fling(r8, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        if (r1.mo17168applyToFlingBMRW4eQ(r3, r8, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5d
        L1b:
            kotlin.ResultKt.throwOnFailure(r8)
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r8 = r7.this$0
            long r4 = r7.$velocity
            long r4 = androidx.compose.foundation.gestures.AnchoredDraggableNode.m17338access$reverseIfNeededAH228Gc(r8, r4)
            float r8 = androidx.compose.foundation.gestures.AnchoredDraggableNode.m17340access$toFloatTH1AsA0(r8, r4)
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r1 = r7.this$0
            androidx.compose.foundation.OverscrollEffect r1 = androidx.compose.foundation.gestures.AnchoredDraggableNode.access$getOverscrollEffect$p(r1)
            if (r1 != 0) goto L3d
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r1 = r7.this$0
            r7.label = r3
            java.lang.Object r8 = androidx.compose.foundation.gestures.AnchoredDraggableNode.access$fling(r1, r8, r7)
            if (r8 != r0) goto L5d
            goto L5c
        L3d:
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r1 = r7.this$0
            androidx.compose.foundation.OverscrollEffect r1 = androidx.compose.foundation.gestures.AnchoredDraggableNode.access$getOverscrollEffect$p(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r3 = r7.this$0
            long r3 = androidx.compose.foundation.gestures.AnchoredDraggableNode.m17343access$toVelocityadjELrA(r3, r8)
            androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1 r8 = new androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r5 = r7.this$0
            r6 = 0
            r8.<init>(r5, r6)
            r7.label = r2
            java.lang.Object r8 = r1.mo17168applyToFlingBMRW4eQ(r3, r8, r7)
            if (r8 != r0) goto L5d
        L5c:
            return r0
        L5d:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AnchoredDraggableNode$onDragStopped$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
