package androidx.compose.foundation.gestures;

import androidx.compose.p011ui.unit.Velocity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
@DebugMetadata(m5302c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1", m5303f = "AnchoredDraggable.kt", m5304i = {}, m5305l = {434, 436}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes.dex */
public final class AnchoredDraggableNode$onDragStopped$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ long $velocity;
    int label;
    final /* synthetic */ AnchoredDraggableNode<T> this$0;

    @Metadata(m5109d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, m5110d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Velocity;", ExifInterface.GPS_DIRECTION_TRUE, "availableVelocity"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1", m5303f = "AnchoredDraggable.kt", m5304i = {0}, m5305l = {438}, m5306m = "invokeSuspend", m5307n = {"availableVelocity"}, m5308s = {"J$0"})
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1 */
    public static final class C08281 extends SuspendLambda implements InterfaceC6473e {
        /* synthetic */ long J$0;
        int label;
        final /* synthetic */ AnchoredDraggableNode<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08281(AnchoredDraggableNode<T> anchoredDraggableNode, InterfaceC5631c<? super C08281> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.this$0 = anchoredDraggableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C08281 c08281 = new C08281(this.this$0, interfaceC5631c);
            c08281.J$0 = ((Velocity) obj).getPackedValue();
            return c08281;
        }

        @Override // p152r6.InterfaceC6473e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m6924invokesFctU(((Velocity) obj).getPackedValue(), (InterfaceC5631c) obj2);
        }

        /* renamed from: invoke-sF-c-tU, reason: not valid java name */
        public final Object m6924invokesFctU(long j7, InterfaceC5631c<? super Velocity> interfaceC5631c) {
            return ((C08281) create(Velocity.m13534boximpl(j7), interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            long jM6920toVelocityadjELrA;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                long j7 = this.J$0;
                AnchoredDraggableNode<T> anchoredDraggableNode = this.this$0;
                float fM6917toFloatTH1AsA0 = anchoredDraggableNode.m6917toFloatTH1AsA0(j7);
                this.J$0 = j7;
                this.label = 1;
                obj = anchoredDraggableNode.fling(fM6917toFloatTH1AsA0, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                jM6920toVelocityadjELrA = j7;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jM6920toVelocityadjELrA = this.J$0;
                AbstractC5774b.m5119b(obj);
            }
            float fFloatValue = ((Number) obj).floatValue();
            float fRequireOffset = ((AnchoredDraggableNode) this.this$0).state.requireOffset();
            float fMinPosition = ((AnchoredDraggableNode) this.this$0).state.getAnchors().minPosition();
            if (fRequireOffset >= ((AnchoredDraggableNode) this.this$0).state.getAnchors().maxPosition() || fRequireOffset <= fMinPosition) {
                jM6920toVelocityadjELrA = this.this$0.m6920toVelocityadjELrA(fFloatValue);
            }
            return Velocity.m13534boximpl(jM6920toVelocityadjELrA);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$onDragStopped$1(AnchoredDraggableNode<T> anchoredDraggableNode, long j7, InterfaceC5631c<? super AnchoredDraggableNode$onDragStopped$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = anchoredDraggableNode;
        this.$velocity = j7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new AnchoredDraggableNode$onDragStopped$1(this.this$0, this.$velocity, interfaceC5631c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r1.fling(r8, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if (r1.mo6732applyToFlingBMRW4eQ(r3, r8, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
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
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L15:
            kotlin.AbstractC5774b.m5119b(r8)
            goto L5b
        L19:
            kotlin.AbstractC5774b.m5119b(r8)
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r8 = r7.this$0
            long r4 = r7.$velocity
            long r4 = androidx.compose.foundation.gestures.AnchoredDraggableNode.m6909access$reverseIfNeededAH228Gc(r8, r4)
            float r8 = androidx.compose.foundation.gestures.AnchoredDraggableNode.m6911access$toFloatTH1AsA0(r8, r4)
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r1 = r7.this$0
            androidx.compose.foundation.OverscrollEffect r1 = androidx.compose.foundation.gestures.AnchoredDraggableNode.access$getOverscrollEffect$p(r1)
            if (r1 != 0) goto L3b
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r1 = r7.this$0
            r7.label = r3
            java.lang.Object r8 = androidx.compose.foundation.gestures.AnchoredDraggableNode.access$fling(r1, r8, r7)
            if (r8 != r0) goto L5b
            goto L5a
        L3b:
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r1 = r7.this$0
            androidx.compose.foundation.OverscrollEffect r1 = androidx.compose.foundation.gestures.AnchoredDraggableNode.access$getOverscrollEffect$p(r1)
            kotlin.jvm.internal.AbstractC5830k.m5327d(r1)
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r3 = r7.this$0
            long r3 = androidx.compose.foundation.gestures.AnchoredDraggableNode.m6914access$toVelocityadjELrA(r3, r8)
            androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1 r8 = new androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r5 = r7.this$0
            r6 = 0
            r8.<init>(r5, r6)
            r7.label = r2
            java.lang.Object r8 = r1.mo6732applyToFlingBMRW4eQ(r3, r8, r7)
            if (r8 != r0) goto L5b
        L5a:
            return r0
        L5b:
            d6.s r8 = p045d6.C5443s.f8405a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((AnchoredDraggableNode$onDragStopped$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
