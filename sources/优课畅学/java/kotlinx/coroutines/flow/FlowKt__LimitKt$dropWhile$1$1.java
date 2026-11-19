package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$BooleanRef;
import p169l8.InterfaceC9267d;
import p300x7.InterfaceC10574p;

/* loaded from: classes5.dex */
public final class FlowKt__LimitKt$dropWhile$1$1 implements InterfaceC9267d {

    /* renamed from: a */
    public final /* synthetic */ Ref$BooleanRef f17811a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC9267d f17812b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC10574p f17813c;

    public FlowKt__LimitKt$dropWhile$1$1(Ref$BooleanRef ref$BooleanRef, InterfaceC9267d interfaceC9267d, InterfaceC10574p interfaceC10574p) {
        this.f17811a = ref$BooleanRef;
        this.f17812b = interfaceC9267d;
        this.f17813c = interfaceC10574p;
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
    @Override // p169l8.InterfaceC9267d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, p179m7.InterfaceC9324c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1) r0
            int r1 = r0.f17818e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17818e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f17816c
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f17818e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L41
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.AbstractC9079b.m15926b(r8)
            goto L88
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            java.lang.Object r7 = r0.f17815b
            java.lang.Object r2 = r0.f17814a
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1 r2 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1) r2
            kotlin.AbstractC9079b.m15926b(r8)
            goto L6c
        L41:
            kotlin.AbstractC9079b.m15926b(r8)
            goto L59
        L45:
            kotlin.AbstractC9079b.m15926b(r8)
            kotlin.jvm.internal.Ref$BooleanRef r8 = r6.f17811a
            boolean r8 = r8.f17469a
            if (r8 == 0) goto L5c
            l8.d r8 = r6.f17812b
            r0.f17818e = r5
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L59
            goto L87
        L59:
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        L5c:
            x7.p r8 = r6.f17813c
            r0.f17814a = r6
            r0.f17815b = r7
            r0.f17818e = r4
            java.lang.Object r8 = r8.invoke(r7, r0)
            if (r8 != r1) goto L6b
            goto L87
        L6b:
            r2 = r6
        L6c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L8b
            kotlin.jvm.internal.Ref$BooleanRef r8 = r2.f17811a
            r8.f17469a = r5
            l8.d r8 = r2.f17812b
            r2 = 0
            r0.f17814a = r2
            r0.f17815b = r2
            r0.f17818e = r3
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L88
        L87:
            return r1
        L88:
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        L8b:
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1.emit(java.lang.Object, m7.c):java.lang.Object");
    }
}
