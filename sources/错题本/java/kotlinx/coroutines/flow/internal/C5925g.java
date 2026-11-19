package kotlinx.coroutines.flow.internal;

import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.InterfaceC5912g;

/* renamed from: kotlinx.coroutines.flow.internal.g */
/* loaded from: classes4.dex */
public final class C5925g implements InterfaceC5912g {

    /* renamed from: a */
    public final /* synthetic */ Ref$ObjectRef f9394a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6009v f9395b;

    /* renamed from: c */
    public final /* synthetic */ C5926h f9396c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC5912g f9397d;

    public C5925g(Ref$ObjectRef ref$ObjectRef, InterfaceC6009v interfaceC6009v, C5926h c5926h, InterfaceC5912g interfaceC5912g) {
        this.f9394a = ref$ObjectRef;
        this.f9395b = interfaceC6009v;
        this.f9396c = c5926h;
        this.f9397d = interfaceC5912g;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, kotlinx.coroutines.k1] */
    @Override // kotlinx.coroutines.flow.InterfaceC5912g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, p075h6.InterfaceC5631c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.L$2
            kotlinx.coroutines.w0 r8 = (kotlinx.coroutines.InterfaceC6013w0) r8
            java.lang.Object r8 = r0.L$1
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.flow.internal.g r0 = (kotlinx.coroutines.flow.internal.C5925g) r0
            kotlin.AbstractC5774b.m5119b(r9)
            goto L5c
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.AbstractC5774b.m5119b(r9)
            kotlin.jvm.internal.Ref$ObjectRef r9 = r7.f9394a
            T r9 = r9.element
            kotlinx.coroutines.w0 r9 = (kotlinx.coroutines.InterfaceC6013w0) r9
            if (r9 == 0) goto L5b
            kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
            r2.<init>()
            r9.cancel(r2)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r9
            r0.label = r3
            java.lang.Object r9 = r9.mo5456e(r0)
            if (r9 != r1) goto L5b
            return r1
        L5b:
            r0 = r7
        L5c:
            kotlin.jvm.internal.Ref$ObjectRef r9 = r0.f9394a
            kotlinx.coroutines.v r1 = r0.f9395b
            kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2
            kotlinx.coroutines.flow.internal.h r5 = r0.f9396c
            kotlinx.coroutines.flow.g r0 = r0.f9397d
            r6 = 0
            r4.<init>(r5, r0, r8, r6)
            kotlinx.coroutines.k1 r8 = kotlinx.coroutines.AbstractC6014x.m5651v(r1, r6, r2, r4, r3)
            r9.element = r8
            d6.s r8 = p045d6.C5443s.f8405a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.C5925g.emit(java.lang.Object, h6.c):java.lang.Object");
    }
}
