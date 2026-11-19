package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$IntRef;
import p169l8.InterfaceC9267d;

/* loaded from: classes5.dex */
public final class FlowKt__LimitKt$take$2$1 implements InterfaceC9267d {

    /* renamed from: a */
    public final /* synthetic */ Ref$IntRef f17822a;

    /* renamed from: b */
    public final /* synthetic */ int f17823b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC9267d f17824c;

    /* renamed from: d */
    public final /* synthetic */ Object f17825d;

    public FlowKt__LimitKt$take$2$1(Ref$IntRef ref$IntRef, int i10, InterfaceC9267d interfaceC9267d, Object obj) {
        this.f17822a = ref$IntRef;
        this.f17823b = i10;
        this.f17824c = interfaceC9267d;
        this.f17825d = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r7.emit(r6, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt__LimitKt.m16606d(r7, r6, r2, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p169l8.InterfaceC9267d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, p179m7.InterfaceC9324c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1) r0
            int r1 = r0.f17828c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17828c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f17826a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f17828c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.AbstractC9079b.m15926b(r7)
            goto L61
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.AbstractC9079b.m15926b(r7)
            goto L51
        L38:
            kotlin.AbstractC9079b.m15926b(r7)
            kotlin.jvm.internal.Ref$IntRef r7 = r5.f17822a
            int r2 = r7.f17471a
            int r2 = r2 + r4
            r7.f17471a = r2
            int r7 = r5.f17823b
            if (r2 >= r7) goto L54
            l8.d r7 = r5.f17824c
            r0.f17828c = r4
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L51
            goto L60
        L51:
            h7.p r6 = p123h7.C8736p.f16368a
            return r6
        L54:
            l8.d r7 = r5.f17824c
            java.lang.Object r2 = r5.f17825d
            r0.f17828c = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt__LimitKt.m16603a(r7, r6, r2, r0)
            if (r6 != r1) goto L61
        L60:
            return r1
        L61:
            h7.p r6 = p123h7.C8736p.f16368a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1.emit(java.lang.Object, m7.c):java.lang.Object");
    }
}
