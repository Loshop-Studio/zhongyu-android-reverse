package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$ObjectRef;
import p169l8.InterfaceC9267d;

/* loaded from: classes5.dex */
public final class FlowKt__ErrorsKt$catchImpl$2 implements InterfaceC9267d {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC9267d f17776a;

    /* renamed from: b */
    public final /* synthetic */ Ref$ObjectRef f17777b;

    public FlowKt__ErrorsKt$catchImpl$2(InterfaceC9267d interfaceC9267d, Ref$ObjectRef ref$ObjectRef) {
        this.f17776a = interfaceC9267d;
        this.f17777b = ref$ObjectRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p169l8.InterfaceC9267d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, p179m7.InterfaceC9324c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1) r0
            int r1 = r0.f17781d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17781d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f17779b
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f17781d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f17778a
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2 r5 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2) r5
            kotlin.AbstractC9079b.m15926b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L47
        L2d:
            r6 = move-exception
            goto L4c
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.AbstractC9079b.m15926b(r6)
            l8.d r6 = r4.f17776a     // Catch: java.lang.Throwable -> L4a
            r0.f17778a = r4     // Catch: java.lang.Throwable -> L4a
            r0.f17781d = r3     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4a
            if (r5 != r1) goto L47
            return r1
        L47:
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        L4a:
            r6 = move-exception
            r5 = r4
        L4c:
            kotlin.jvm.internal.Ref$ObjectRef r5 = r5.f17777b
            r5.f17473a = r6
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2.emit(java.lang.Object, m7.c):java.lang.Object");
    }
}
