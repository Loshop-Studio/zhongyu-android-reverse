package androidx.compose.foundation.gestures;

import androidx.compose.p013ui.unit.Velocity;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", m17801f = "Scrollable.kt", m17802l = {748, 751, 754}, m17803m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ScrollingLogic$onScrollStopped$performFling$1 extends SuspendLambda implements InterfaceC10574p {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onScrollStopped$performFling$1(ScrollingLogic scrollingLogic, InterfaceC9324c<? super ScrollingLogic$onScrollStopped$performFling$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.this$0 = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this.this$0, interfaceC9324c);
        scrollingLogic$onScrollStopped$performFling$1.J$0 = ((Velocity) obj).m27146unboximpl();
        return scrollingLogic$onScrollStopped$performFling$1;
    }

    @Override // p300x7.InterfaceC10574p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m20648invokesFctU(((Velocity) obj).m27146unboximpl(), (InterfaceC9324c) obj2);
    }

    /* renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m20648invokesFctU(long j10, InterfaceC9324c<? super Velocity> interfaceC9324c) {
        return ((ScrollingLogic$onScrollStopped$performFling$1) create(Velocity.m27128boximpl(j10), interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
            java.lang.Object r6 = p190n7.AbstractC9434a.m17291f()
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
            kotlin.AbstractC9079b.m15926b(r14)
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
            kotlin.AbstractC9079b.m15926b(r14)
            r0 = r14
            goto L68
        L2e:
            long r3 = r13.J$0
            kotlin.AbstractC9079b.m15926b(r14)
            r0 = r14
            goto L4c
        L35:
            kotlin.AbstractC9079b.m15926b(r14)
            long r7 = r13.J$0
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = androidx.compose.foundation.gestures.ScrollingLogic.access$getNestedScrollDispatcher$p(r0)
            r13.J$0 = r7
            r13.label = r3
            java.lang.Object r0 = r0.m25377dispatchPreFlingQWom1Mo(r7, r13)
            if (r0 != r6) goto L4b
            goto L87
        L4b:
            r3 = r7
        L4c:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.p013ui.unit.Velocity) r0
            long r7 = r0.m27146unboximpl()
            long r7 = androidx.compose.p013ui.unit.Velocity.m27140minusAH228Gc(r3, r7)
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            r13.J$0 = r3
            r13.J$1 = r7
            r13.label = r2
            java.lang.Object r0 = r0.m20640doFlingAnimationQWom1Mo(r7, r13)
            if (r0 != r6) goto L65
            goto L87
        L65:
            r11 = r7
            r7 = r3
            r2 = r11
        L68:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.p013ui.unit.Velocity) r0
            long r9 = r0.m27146unboximpl()
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = androidx.compose.foundation.gestures.ScrollingLogic.access$getNestedScrollDispatcher$p(r0)
            long r2 = androidx.compose.p013ui.unit.Velocity.m27140minusAH228Gc(r2, r9)
            r13.J$0 = r7
            r13.J$1 = r9
            r13.label = r1
            r5 = r13
            r1 = r2
            r3 = r9
            java.lang.Object r0 = r0.m25375dispatchPostFlingRZ2iAVY(r1, r3, r5)
            if (r0 != r6) goto L88
        L87:
            return r6
        L88:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.p013ui.unit.Velocity) r0
            long r0 = r0.m27146unboximpl()
            long r0 = androidx.compose.p013ui.unit.Velocity.m27140minusAH228Gc(r3, r0)
            long r0 = androidx.compose.p013ui.unit.Velocity.m27140minusAH228Gc(r7, r0)
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.p013ui.unit.Velocity.m27128boximpl(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
