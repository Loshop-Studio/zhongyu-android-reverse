package androidx.compose.foundation.gestures;

import androidx.compose.p013ui.unit.Velocity;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1", m17801f = "AnchoredDraggable.kt", m17802l = {434, 436}, m17803m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AnchoredDraggableNode$onDragStopped$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ long $velocity;
    int label;
    final /* synthetic */ AnchoredDraggableNode<T> this$0;

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1", m17801f = "AnchoredDraggable.kt", m17802l = {438}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1 */
    public static final class C12431 extends SuspendLambda implements InterfaceC10574p {
        /* synthetic */ long J$0;
        int label;
        final /* synthetic */ AnchoredDraggableNode<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12431(AnchoredDraggableNode<T> anchoredDraggableNode, InterfaceC9324c<? super C12431> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = anchoredDraggableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C12431 c12431 = new C12431(this.this$0, interfaceC9324c);
            c12431.J$0 = ((Velocity) obj).m27146unboximpl();
            return c12431;
        }

        @Override // p300x7.InterfaceC10574p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m20518invokesFctU(((Velocity) obj).m27146unboximpl(), (InterfaceC9324c) obj2);
        }

        /* renamed from: invoke-sF-c-tU, reason: not valid java name */
        public final Object m20518invokesFctU(long j10, InterfaceC9324c<? super Velocity> interfaceC9324c) {
            return ((C12431) create(Velocity.m27128boximpl(j10), interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            long jM20514toVelocityadjELrA;
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                long j10 = this.J$0;
                AnchoredDraggableNode<T> anchoredDraggableNode = this.this$0;
                float fM20511toFloatTH1AsA0 = anchoredDraggableNode.m20511toFloatTH1AsA0(j10);
                this.J$0 = j10;
                this.label = 1;
                obj = anchoredDraggableNode.fling(fM20511toFloatTH1AsA0, this);
                if (obj == objM17291f) {
                    return objM17291f;
                }
                jM20514toVelocityadjELrA = j10;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jM20514toVelocityadjELrA = this.J$0;
                AbstractC9079b.m15926b(obj);
            }
            float fFloatValue = ((Number) obj).floatValue();
            float fRequireOffset = ((AnchoredDraggableNode) this.this$0).state.requireOffset();
            float fMinPosition = ((AnchoredDraggableNode) this.this$0).state.getAnchors().minPosition();
            if (fRequireOffset >= ((AnchoredDraggableNode) this.this$0).state.getAnchors().maxPosition() || fRequireOffset <= fMinPosition) {
                jM20514toVelocityadjELrA = this.this$0.m20514toVelocityadjELrA(fFloatValue);
            }
            return Velocity.m27128boximpl(jM20514toVelocityadjELrA);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$onDragStopped$1(AnchoredDraggableNode<T> anchoredDraggableNode, long j10, InterfaceC9324c<? super AnchoredDraggableNode$onDragStopped$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.this$0 = anchoredDraggableNode;
        this.$velocity = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new AnchoredDraggableNode$onDragStopped$1(this.this$0, this.$velocity, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((AnchoredDraggableNode$onDragStopped$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r1.fling(r8, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        if (r1.mo20326applyToFlingBMRW4eQ(r3, r8, r7) == r0) goto L17;
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
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
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
            kotlin.AbstractC9079b.m15926b(r8)
            goto L5d
        L1b:
            kotlin.AbstractC9079b.m15926b(r8)
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r8 = r7.this$0
            long r4 = r7.$velocity
            long r4 = androidx.compose.foundation.gestures.AnchoredDraggableNode.m20503access$reverseIfNeededAH228Gc(r8, r4)
            float r8 = androidx.compose.foundation.gestures.AnchoredDraggableNode.m20505access$toFloatTH1AsA0(r8, r4)
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
            kotlin.jvm.internal.AbstractC9133u.m16130d(r1)
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r3 = r7.this$0
            long r3 = androidx.compose.foundation.gestures.AnchoredDraggableNode.m20508access$toVelocityadjELrA(r3, r8)
            androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1 r8 = new androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r5 = r7.this$0
            r6 = 0
            r8.<init>(r5, r6)
            r7.label = r2
            java.lang.Object r8 = r1.mo20326applyToFlingBMRW4eQ(r3, r8, r7)
            if (r8 != r0) goto L5d
        L5c:
            return r0
        L5d:
            h7.p r8 = p123h7.C8736p.f16368a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
