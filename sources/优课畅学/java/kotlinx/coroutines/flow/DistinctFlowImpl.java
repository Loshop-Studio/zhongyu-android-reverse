package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$ObjectRef;
import p123h7.C8736p;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p180m8.AbstractC9339l;
import p190n7.AbstractC9434a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes5.dex */
public final class DistinctFlowImpl implements InterfaceC9266c {

    /* renamed from: a */
    public final InterfaceC9266c f17692a;

    /* renamed from: b */
    public final InterfaceC10570l f17693b;

    /* renamed from: c */
    public final InterfaceC10574p f17694c;

    /* renamed from: kotlinx.coroutines.flow.DistinctFlowImpl$collect$2 */
    public static final class C91682 implements InterfaceC9267d {

        /* renamed from: b */
        public final /* synthetic */ Ref$ObjectRef f17696b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9267d f17697c;

        public C91682(Ref$ObjectRef ref$ObjectRef, InterfaceC9267d interfaceC9267d) {
            this.f17696b = ref$ObjectRef;
            this.f17697c = interfaceC9267d;
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
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1 r0 = (kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1) r0
                int r1 = r0.f17700c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f17700c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1 r0 = new kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f17698a
                java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                int r2 = r0.f17700c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.AbstractC9079b.m15926b(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.AbstractC9079b.m15926b(r7)
                kotlinx.coroutines.flow.DistinctFlowImpl r7 = kotlinx.coroutines.flow.DistinctFlowImpl.this
                x7.l r7 = r7.f17693b
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.Ref$ObjectRef r2 = r5.f17696b
                java.lang.Object r2 = r2.f17473a
                n8.d0 r4 = p180m8.AbstractC9339l.f18395a
                if (r2 == r4) goto L58
                kotlinx.coroutines.flow.DistinctFlowImpl r4 = kotlinx.coroutines.flow.DistinctFlowImpl.this
                x7.p r4 = r4.f17694c
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                h7.p r6 = p123h7.C8736p.f16368a
                return r6
            L58:
                kotlin.jvm.internal.Ref$ObjectRef r2 = r5.f17696b
                r2.f17473a = r7
                l8.d r7 = r5.f17697c
                r0.f17700c = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                h7.p r6 = p123h7.C8736p.f16368a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.DistinctFlowImpl.C91682.emit(java.lang.Object, m7.c):java.lang.Object");
        }
    }

    public DistinctFlowImpl(InterfaceC9266c interfaceC9266c, InterfaceC10570l interfaceC10570l, InterfaceC10574p interfaceC10574p) {
        this.f17692a = interfaceC9266c;
        this.f17693b = interfaceC10570l;
        this.f17694c = interfaceC10574p;
    }

    @Override // p169l8.InterfaceC9266c
    public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f17473a = AbstractC9339l.f18395a;
        Object objCollect = this.f17692a.collect(new C91682(ref$ObjectRef, interfaceC9267d), interfaceC9324c);
        return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
    }
}
