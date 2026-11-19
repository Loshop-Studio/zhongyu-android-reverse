package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$IntRef;
import p169l8.InterfaceC9267d;

/* loaded from: classes5.dex */
public final class FlowKt__LimitKt$drop$2$1 implements InterfaceC9267d {

    /* renamed from: a */
    public final /* synthetic */ Ref$IntRef f17805a;

    /* renamed from: b */
    public final /* synthetic */ int f17806b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC9267d f17807c;

    public FlowKt__LimitKt$drop$2$1(Ref$IntRef ref$IntRef, int i10, InterfaceC9267d interfaceC9267d) {
        this.f17805a = ref$IntRef;
        this.f17806b = i10;
        this.f17807c = interfaceC9267d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p169l8.InterfaceC9267d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, p179m7.InterfaceC9324c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1) r0
            int r1 = r0.f17810c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17810c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f17808a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f17810c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9079b.m15926b(r7)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.AbstractC9079b.m15926b(r7)
            kotlin.jvm.internal.Ref$IntRef r7 = r5.f17805a
            int r2 = r7.f17471a
            int r4 = r5.f17806b
            if (r2 < r4) goto L4a
            l8.d r7 = r5.f17807c
            r0.f17810c = r3
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            h7.p r6 = p123h7.C8736p.f16368a
            return r6
        L4a:
            int r2 = r2 + r3
            r7.f17471a = r2
            h7.p r6 = p123h7.C8736p.f16368a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1.emit(java.lang.Object, m7.c):java.lang.Object");
    }
}
