package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import p379vd.InterfaceC11595d;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class FlowKt__ReduceKt {

    /* renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$a */
    public static final class C10025a implements InterfaceC11595d {

        /* renamed from: c */
        public final /* synthetic */ Ref$ObjectRef f23775c;

        public C10025a(Ref$ObjectRef ref$ObjectRef) {
            this.f23775c = ref$ObjectRef;
        }

        @Override // p379vd.InterfaceC11595d
        public Object emit(Object obj, InterfaceC11588c interfaceC11588c) {
            this.f23775c.f23402c = obj;
            throw new AbortFlowException(this);
        }
    }

    /* renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$b */
    public static final class C10026b implements InterfaceC11595d {

        /* renamed from: c */
        public final /* synthetic */ Ref$ObjectRef f23776c;

        public C10026b(Ref$ObjectRef ref$ObjectRef) {
            this.f23776c = ref$ObjectRef;
        }

        @Override // p379vd.InterfaceC11595d
        public Object emit(Object obj, InterfaceC11588c interfaceC11588c) {
            this.f23776c.f23402c = obj;
            throw new AbortFlowException(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m20801a(p379vd.InterfaceC11594c r4, p181hd.InterfaceC9544p r5, vc.InterfaceC11588c r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3) r0
            int r1 = r0.f23784f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23784f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f23783e
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23784f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f23782d
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2 r4 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2) r4
            java.lang.Object r5 = r0.f23781c
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref$ObjectRef) r5
            kotlin.AbstractC9924b.m20071b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L69
        L31:
            r6 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.AbstractC9924b.m20071b(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            xd.c0 r2 = p394wd.AbstractC11737l.f27896a
            r6.f23402c = r2
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2 r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2
            r2.<init>(r5, r6)
            r0.f23781c = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f23782d = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f23784f = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r5 = r6
            goto L69
        L5b:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L5f:
            p394wd.AbstractC11733h.m25964a(r6, r4)
            kotlin.coroutines.d r4 = r0.getContext()
            sd.AbstractC11147o1.m24775i(r4)
        L69:
            java.lang.Object r4 = r5.f23402c
            xd.c0 r5 = p394wd.AbstractC11737l.f27896a
            if (r4 == r5) goto L70
            return r4
        L70:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element matching the predicate"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.m20801a(vd.c, hd.p, vc.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m20802b(p379vd.InterfaceC11594c r4, vc.InterfaceC11588c r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1) r0
            int r1 = r0.f23780f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23780f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f23779e
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23780f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f23778d
            kotlinx.coroutines.flow.FlowKt__ReduceKt$a r4 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C10025a) r4
            java.lang.Object r1 = r0.f23777c
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            kotlin.AbstractC9924b.m20071b(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L69
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.AbstractC9924b.m20071b(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            xd.c0 r2 = p394wd.AbstractC11737l.f27896a
            r5.f23402c = r2
            kotlinx.coroutines.flow.FlowKt__ReduceKt$a r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$a
            r2.<init>(r5)
            r0.f23777c = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f23778d = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f23780f = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r1 = r5
            goto L69
        L5b:
            r4 = move-exception
            r1 = r5
            r5 = r4
            r4 = r2
        L5f:
            p394wd.AbstractC11733h.m25964a(r5, r4)
            kotlin.coroutines.d r4 = r0.getContext()
            sd.AbstractC11147o1.m24775i(r4)
        L69:
            java.lang.Object r4 = r1.f23402c
            xd.c0 r5 = p394wd.AbstractC11737l.f27896a
            if (r4 == r5) goto L70
            return r4
        L70:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.m20802b(vd.c, vc.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m20803c(p379vd.InterfaceC11594c r4, p181hd.InterfaceC9544p r5, vc.InterfaceC11588c r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3) r0
            int r1 = r0.f23792f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23792f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f23791e
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23792f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f23790d
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 r4 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) r4
            java.lang.Object r5 = r0.f23789c
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref$ObjectRef) r5
            kotlin.AbstractC9924b.m20071b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L65
        L31:
            r6 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.AbstractC9924b.m20071b(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2
            r2.<init>(r5, r6)
            r0.f23789c = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f23790d = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f23792f = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r5 = r6
            goto L65
        L57:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L5b:
            p394wd.AbstractC11733h.m25964a(r6, r4)
            kotlin.coroutines.d r4 = r0.getContext()
            sd.AbstractC11147o1.m24775i(r4)
        L65:
            java.lang.Object r4 = r5.f23402c
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.m20803c(vd.c, hd.p, vc.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m20804d(p379vd.InterfaceC11594c r4, vc.InterfaceC11588c r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1) r0
            int r1 = r0.f23788f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23788f = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f23787e
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23788f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f23786d
            kotlinx.coroutines.flow.FlowKt__ReduceKt$b r4 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.C10026b) r4
            java.lang.Object r1 = r0.f23785c
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            kotlin.AbstractC9924b.m20071b(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L65
        L31:
            r5 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.AbstractC9924b.m20071b(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            kotlinx.coroutines.flow.FlowKt__ReduceKt$b r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$b
            r2.<init>(r5)
            r0.f23785c = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f23786d = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f23788f = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r1 = r5
            goto L65
        L57:
            r4 = move-exception
            r1 = r5
            r5 = r4
            r4 = r2
        L5b:
            p394wd.AbstractC11733h.m25964a(r5, r4)
            kotlin.coroutines.d r4 = r0.getContext()
            sd.AbstractC11147o1.m24775i(r4)
        L65:
            java.lang.Object r4 = r1.f23402c
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.m20804d(vd.c, vc.c):java.lang.Object");
    }
}
