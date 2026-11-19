package androidx.compose.foundation.gestures;

import androidx.compose.p014ui.unit.Velocity;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1", m26211f = "AnchoredDraggable.kt", m26212l = {434, 436}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AnchoredDraggableNode$onDragStopped$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ long $velocity;
    int label;
    final /* synthetic */ AnchoredDraggableNode<T> this$0;

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1", m26211f = "AnchoredDraggable.kt", m26212l = {438}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1 */
    public static final class C12731 extends SuspendLambda implements InterfaceC9544p {
        /* synthetic */ long J$0;
        int label;
        final /* synthetic */ AnchoredDraggableNode<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12731(AnchoredDraggableNode<T> anchoredDraggableNode, InterfaceC11588c<? super C12731> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = anchoredDraggableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C12731 c12731 = new C12731(this.this$0, interfaceC11588c);
            c12731.J$0 = ((Velocity) obj).m33748unboximpl();
            return c12731;
        }

        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m27120invokesFctU(((Velocity) obj).m33748unboximpl(), (InterfaceC11588c) obj2);
        }

        /* renamed from: invoke-sF-c-tU, reason: not valid java name */
        public final Object m27120invokesFctU(long j10, InterfaceC11588c<? super Velocity> interfaceC11588c) {
            return ((C12731) create(Velocity.m33730boximpl(j10), interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            long jM27116toVelocityadjELrA;
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                long j10 = this.J$0;
                AnchoredDraggableNode<T> anchoredDraggableNode = this.this$0;
                float fM27113toFloatTH1AsA0 = anchoredDraggableNode.m27113toFloatTH1AsA0(j10);
                this.J$0 = j10;
                this.label = 1;
                obj = anchoredDraggableNode.fling(fM27113toFloatTH1AsA0, this);
                if (obj == objM25952f) {
                    return objM25952f;
                }
                jM27116toVelocityadjELrA = j10;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jM27116toVelocityadjELrA = this.J$0;
                AbstractC9924b.m20071b(obj);
            }
            float fFloatValue = ((Number) obj).floatValue();
            float fRequireOffset = ((AnchoredDraggableNode) this.this$0).state.requireOffset();
            float fMinPosition = ((AnchoredDraggableNode) this.this$0).state.getAnchors().minPosition();
            if (fRequireOffset >= ((AnchoredDraggableNode) this.this$0).state.getAnchors().maxPosition() || fRequireOffset <= fMinPosition) {
                jM27116toVelocityadjELrA = this.this$0.m27116toVelocityadjELrA(fFloatValue);
            }
            return Velocity.m33730boximpl(jM27116toVelocityadjELrA);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$onDragStopped$1(AnchoredDraggableNode<T> anchoredDraggableNode, long j10, InterfaceC11588c<? super AnchoredDraggableNode$onDragStopped$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = anchoredDraggableNode;
        this.$velocity = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new AnchoredDraggableNode$onDragStopped$1(this.this$0, this.$velocity, interfaceC11588c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r1.fling(r8, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        if (r1.mo26928applyToFlingBMRW4eQ(r3, r8, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
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
            kotlin.AbstractC9924b.m20071b(r8)
            goto L5d
        L1b:
            kotlin.AbstractC9924b.m20071b(r8)
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r8 = r7.this$0
            long r4 = r7.$velocity
            long r4 = androidx.compose.foundation.gestures.AnchoredDraggableNode.m27105access$reverseIfNeededAH228Gc(r8, r4)
            float r8 = androidx.compose.foundation.gestures.AnchoredDraggableNode.m27107access$toFloatTH1AsA0(r8, r4)
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
            kotlin.jvm.internal.AbstractC9979u.m20291d(r1)
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r3 = r7.this$0
            long r3 = androidx.compose.foundation.gestures.AnchoredDraggableNode.m27110access$toVelocityadjELrA(r3, r8)
            androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1 r8 = new androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r5 = r7.this$0
            r6 = 0
            r8.<init>(r5, r6)
            r7.label = r2
            java.lang.Object r8 = r1.mo26928applyToFlingBMRW4eQ(r3, r8, r7)
            if (r8 != r0) goto L5d
        L5c:
            return r0
        L5d:
            qc.q r8 = p309qc.C10786q.f26013a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((AnchoredDraggableNode$onDragStopped$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
