package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$BooleanRef;
import p181hd.InterfaceC9544p;
import p379vd.InterfaceC11595d;

/* loaded from: classes6.dex */
public final class FlowKt__LimitKt$dropWhile$1$1 implements InterfaceC11595d {

    /* renamed from: c */
    public final /* synthetic */ Ref$BooleanRef f23738c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC11595d f23739d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC9544p f23740e;

    public FlowKt__LimitKt$dropWhile$1$1(Ref$BooleanRef ref$BooleanRef, InterfaceC11595d interfaceC11595d, InterfaceC9544p interfaceC9544p) {
        this.f23738c = ref$BooleanRef;
        this.f23739d = interfaceC11595d;
        this.f23740e = interfaceC9544p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r8.emit(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r8.emit(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p379vd.InterfaceC11595d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, vc.InterfaceC11588c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1) r0
            int r1 = r0.f23745g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23745g = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f23743e
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23745g
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L41
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.AbstractC9924b.m20071b(r8)
            goto L88
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            java.lang.Object r7 = r0.f23742d
            java.lang.Object r2 = r0.f23741c
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1 r2 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1) r2
            kotlin.AbstractC9924b.m20071b(r8)
            goto L6c
        L41:
            kotlin.AbstractC9924b.m20071b(r8)
            goto L59
        L45:
            kotlin.AbstractC9924b.m20071b(r8)
            kotlin.jvm.internal.Ref$BooleanRef r8 = r6.f23738c
            boolean r8 = r8.f23398c
            if (r8 == 0) goto L5c
            vd.d r8 = r6.f23739d
            r0.f23745g = r5
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L59
            goto L87
        L59:
            qc.q r7 = p309qc.C10786q.f26013a
            return r7
        L5c:
            hd.p r8 = r6.f23740e
            r0.f23741c = r6
            r0.f23742d = r7
            r0.f23745g = r4
            java.lang.Object r8 = r8.invoke(r7, r0)
            if (r8 != r1) goto L6b
            goto L87
        L6b:
            r2 = r6
        L6c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L8b
            kotlin.jvm.internal.Ref$BooleanRef r8 = r2.f23738c
            r8.f23398c = r5
            vd.d r8 = r2.f23739d
            r2 = 0
            r0.f23741c = r2
            r0.f23742d = r2
            r0.f23745g = r3
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L88
        L87:
            return r1
        L88:
            qc.q r7 = p309qc.C10786q.f26013a
            return r7
        L8b:
            qc.q r7 = p309qc.C10786q.f26013a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1.emit(java.lang.Object, vc.c):java.lang.Object");
    }
}
