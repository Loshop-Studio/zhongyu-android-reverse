package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", m17801f = "SharingStarted.kt", m17802l = {174, 176, 178, 179, 181}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class StartedWhileSubscribed$command$1 extends SuspendLambda implements InterfaceC10575q {

    /* renamed from: a */
    public int f17956a;

    /* renamed from: b */
    public /* synthetic */ Object f17957b;

    /* renamed from: c */
    public /* synthetic */ int f17958c;

    /* renamed from: d */
    public final /* synthetic */ StartedWhileSubscribed f17959d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedWhileSubscribed$command$1(StartedWhileSubscribed startedWhileSubscribed, InterfaceC9324c interfaceC9324c) {
        super(3, interfaceC9324c);
        this.f17959d = startedWhileSubscribed;
    }

    /* renamed from: c */
    public final Object m16683c(InterfaceC9267d interfaceC9267d, int i10, InterfaceC9324c interfaceC9324c) {
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this.f17959d, interfaceC9324c);
        startedWhileSubscribed$command$1.f17957b = interfaceC9267d;
        startedWhileSubscribed$command$1.f17958c = i10;
        return startedWhileSubscribed$command$1.invokeSuspend(C8736p.f16368a);
    }

    @Override // p300x7.InterfaceC10575q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m16683c((InterfaceC9267d) obj, ((Number) obj2).intValue(), (InterfaceC9324c) obj3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r1.emit(r10, r9) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        if (r1.emit(r10, r9) != r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[PHI: r1
      0x008e: PHI (r1v5 l8.d) = (r1v3 l8.d), (r1v4 l8.d), (r1v11 l8.d) binds: [B:25:0x006e, B:30:0x008b, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r9.f17956a
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L3c
            if (r1 == r6) goto L38
            if (r1 == r5) goto L30
            if (r1 == r4) goto L28
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            goto L38
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            java.lang.Object r1 = r9.f17957b
            l8.d r1 = (p169l8.InterfaceC9267d) r1
            kotlin.AbstractC9079b.m15926b(r10)
            goto L8e
        L28:
            java.lang.Object r1 = r9.f17957b
            l8.d r1 = (p169l8.InterfaceC9267d) r1
            kotlin.AbstractC9079b.m15926b(r10)
            goto L7d
        L30:
            java.lang.Object r1 = r9.f17957b
            l8.d r1 = (p169l8.InterfaceC9267d) r1
            kotlin.AbstractC9079b.m15926b(r10)
            goto L64
        L38:
            kotlin.AbstractC9079b.m15926b(r10)
            goto L9c
        L3c:
            kotlin.AbstractC9079b.m15926b(r10)
            java.lang.Object r10 = r9.f17957b
            r1 = r10
            l8.d r1 = (p169l8.InterfaceC9267d) r1
            int r10 = r9.f17958c
            if (r10 <= 0) goto L53
            kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.f17941a
            r9.f17956a = r6
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L9c
            goto L9b
        L53:
            kotlinx.coroutines.flow.StartedWhileSubscribed r10 = r9.f17959d
            long r6 = kotlinx.coroutines.flow.StartedWhileSubscribed.m16682c(r10)
            r9.f17957b = r1
            r9.f17956a = r5
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.m16227b(r6, r9)
            if (r10 != r0) goto L64
            goto L9b
        L64:
            kotlinx.coroutines.flow.StartedWhileSubscribed r10 = r9.f17959d
            long r5 = kotlinx.coroutines.flow.StartedWhileSubscribed.m16681b(r10)
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 <= 0) goto L8e
            kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.f17942b
            r9.f17957b = r1
            r9.f17956a = r4
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L7d
            goto L9b
        L7d:
            kotlinx.coroutines.flow.StartedWhileSubscribed r10 = r9.f17959d
            long r4 = kotlinx.coroutines.flow.StartedWhileSubscribed.m16681b(r10)
            r9.f17957b = r1
            r9.f17956a = r3
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.m16227b(r4, r9)
            if (r10 != r0) goto L8e
            goto L9b
        L8e:
            kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.f17943c
            r3 = 0
            r9.f17957b = r3
            r9.f17956a = r2
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L9c
        L9b:
            return r0
        L9c:
            h7.p r10 = p123h7.C8736p.f16368a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedWhileSubscribed$command$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
