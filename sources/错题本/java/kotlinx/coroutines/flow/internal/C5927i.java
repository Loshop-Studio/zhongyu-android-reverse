package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.channels.InterfaceC5876e;
import kotlinx.coroutines.flow.InterfaceC5912g;

/* renamed from: kotlinx.coroutines.flow.internal.i */
/* loaded from: classes4.dex */
public final class C5927i implements InterfaceC5912g {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC5876e f9399a;

    /* renamed from: b */
    public final /* synthetic */ int f9400b;

    public C5927i(InterfaceC5876e interfaceC5876e, int i) {
        this.f9399a = interfaceC5876e;
        this.f9400b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (kotlinx.coroutines.AbstractC6014x.m5629I(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC5912g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, p075h6.InterfaceC5631c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.AbstractC5774b.m5119b(r7)
            goto L54
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.AbstractC5774b.m5119b(r7)
            goto L4b
        L36:
            kotlin.AbstractC5774b.m5119b(r7)
            kotlin.collections.a0 r7 = new kotlin.collections.a0
            int r2 = r5.f9400b
            r7.<init>(r2, r6)
            r0.label = r4
            kotlinx.coroutines.channels.e r6 = r5.f9399a
            java.lang.Object r6 = r6.mo5494q(r0, r7)
            if (r6 != r1) goto L4b
            goto L53
        L4b:
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.AbstractC6014x.m5629I(r0)
            if (r6 != r1) goto L54
        L53:
            return r1
        L54:
            d6.s r6 = p045d6.C5443s.f8405a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.C5927i.emit(java.lang.Object, h6.c):java.lang.Object");
    }
}
