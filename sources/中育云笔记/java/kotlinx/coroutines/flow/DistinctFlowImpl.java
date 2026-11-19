package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p394wd.AbstractC11737l;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public final class DistinctFlowImpl implements InterfaceC11594c {

    /* renamed from: c */
    public final InterfaceC11594c f23600c;

    /* renamed from: d */
    public final InterfaceC9540l f23601d;

    /* renamed from: e */
    public final InterfaceC9544p f23602e;

    /* renamed from: kotlinx.coroutines.flow.DistinctFlowImpl$collect$2 */
    public static final class C100102 implements InterfaceC11595d {

        /* renamed from: d */
        public final /* synthetic */ Ref$ObjectRef f23604d;

        /* renamed from: e */
        public final /* synthetic */ InterfaceC11595d f23605e;

        public C100102(Ref$ObjectRef ref$ObjectRef, InterfaceC11595d interfaceC11595d) {
            this.f23604d = ref$ObjectRef;
            this.f23605e = interfaceC11595d;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p379vd.InterfaceC11595d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r6, vc.InterfaceC11588c r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1 r0 = (kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1) r0
                int r1 = r0.f23608e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f23608e = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1 r0 = new kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f23606c
                java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                int r2 = r0.f23608e
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.AbstractC9924b.m20071b(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.AbstractC9924b.m20071b(r7)
                kotlinx.coroutines.flow.DistinctFlowImpl r7 = kotlinx.coroutines.flow.DistinctFlowImpl.this
                hd.l r7 = r7.f23601d
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.Ref$ObjectRef r2 = r5.f23604d
                java.lang.Object r2 = r2.f23402c
                xd.c0 r4 = p394wd.AbstractC11737l.f27896a
                if (r2 == r4) goto L58
                kotlinx.coroutines.flow.DistinctFlowImpl r4 = kotlinx.coroutines.flow.DistinctFlowImpl.this
                hd.p r4 = r4.f23602e
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                qc.q r6 = p309qc.C10786q.f26013a
                return r6
            L58:
                kotlin.jvm.internal.Ref$ObjectRef r2 = r5.f23604d
                r2.f23402c = r7
                vd.d r7 = r5.f23605e
                r0.f23608e = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                qc.q r6 = p309qc.C10786q.f26013a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.DistinctFlowImpl.C100102.emit(java.lang.Object, vc.c):java.lang.Object");
        }
    }

    public DistinctFlowImpl(InterfaceC11594c interfaceC11594c, InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p) {
        this.f23600c = interfaceC11594c;
        this.f23601d = interfaceC9540l;
        this.f23602e = interfaceC9544p;
    }

    @Override // p379vd.InterfaceC11594c
    public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f23402c = AbstractC11737l.f27896a;
        Object objCollect = this.f23600c.collect(new C100102(ref$ObjectRef, interfaceC11595d), interfaceC11588c);
        return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
    }
}
