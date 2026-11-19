package androidx.compose.foundation.gestures;

import androidx.compose.p014ui.unit.Velocity;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", m26211f = "Scrollable.kt", m26212l = {748, 751, 754}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ScrollingLogic$onScrollStopped$performFling$1 extends SuspendLambda implements InterfaceC9544p {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onScrollStopped$performFling$1(ScrollingLogic scrollingLogic, InterfaceC11588c<? super ScrollingLogic$onScrollStopped$performFling$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this.this$0, interfaceC11588c);
        scrollingLogic$onScrollStopped$performFling$1.J$0 = ((Velocity) obj).m33748unboximpl();
        return scrollingLogic$onScrollStopped$performFling$1;
    }

    @Override // p181hd.InterfaceC9544p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m27250invokesFctU(((Velocity) obj).m33748unboximpl(), (InterfaceC11588c) obj2);
    }

    /* renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m27250invokesFctU(long j10, InterfaceC11588c<? super Velocity> interfaceC11588c) {
        return ((ScrollingLogic$onScrollStopped$performFling$1) create(Velocity.m33730boximpl(j10), interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (r0 != r6) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.Object r6 = p393wc.AbstractC11725a.m25952f()
            int r0 = r13.label
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L35
            if (r0 == r3) goto L2e
            if (r0 == r2) goto L25
            if (r0 != r1) goto L1d
            long r0 = r13.J$1
            long r2 = r13.J$0
            kotlin.AbstractC9924b.m20071b(r14)
            r7 = r2
            r3 = r0
            r0 = r14
            goto L88
        L1d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L25:
            long r2 = r13.J$1
            long r7 = r13.J$0
            kotlin.AbstractC9924b.m20071b(r14)
            r0 = r14
            goto L68
        L2e:
            long r3 = r13.J$0
            kotlin.AbstractC9924b.m20071b(r14)
            r0 = r14
            goto L4c
        L35:
            kotlin.AbstractC9924b.m20071b(r14)
            long r7 = r13.J$0
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = androidx.compose.foundation.gestures.ScrollingLogic.access$getNestedScrollDispatcher$p(r0)
            r13.J$0 = r7
            r13.label = r3
            java.lang.Object r0 = r0.m31979dispatchPreFlingQWom1Mo(r7, r13)
            if (r0 != r6) goto L4b
            goto L87
        L4b:
            r3 = r7
        L4c:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.p014ui.unit.Velocity) r0
            long r7 = r0.m33748unboximpl()
            long r7 = androidx.compose.p014ui.unit.Velocity.m33742minusAH228Gc(r3, r7)
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            r13.J$0 = r3
            r13.J$1 = r7
            r13.label = r2
            java.lang.Object r0 = r0.m27242doFlingAnimationQWom1Mo(r7, r13)
            if (r0 != r6) goto L65
            goto L87
        L65:
            r11 = r7
            r7 = r3
            r2 = r11
        L68:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.p014ui.unit.Velocity) r0
            long r9 = r0.m33748unboximpl()
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = androidx.compose.foundation.gestures.ScrollingLogic.access$getNestedScrollDispatcher$p(r0)
            long r2 = androidx.compose.p014ui.unit.Velocity.m33742minusAH228Gc(r2, r9)
            r13.J$0 = r7
            r13.J$1 = r9
            r13.label = r1
            r5 = r13
            r1 = r2
            r3 = r9
            java.lang.Object r0 = r0.m31977dispatchPostFlingRZ2iAVY(r1, r3, r5)
            if (r0 != r6) goto L88
        L87:
            return r6
        L88:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.p014ui.unit.Velocity) r0
            long r0 = r0.m33748unboximpl()
            long r0 = androidx.compose.p014ui.unit.Velocity.m33742minusAH228Gc(r3, r0)
            long r0 = androidx.compose.p014ui.unit.Velocity.m33742minusAH228Gc(r7, r0)
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.p014ui.unit.Velocity.m33730boximpl(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
