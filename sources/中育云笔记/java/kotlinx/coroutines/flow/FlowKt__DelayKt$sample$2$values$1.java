package kotlinx.coroutines.flow;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p365ud.InterfaceC11395j;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1", m26211f = "Delay.kt", m26212l = {273}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class FlowKt__DelayKt$sample$2$values$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f23665c;

    /* renamed from: d */
    public /* synthetic */ Object f23666d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC11594c f23667e;

    /* renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1 */
    public static final class C100141 implements InterfaceC11595d {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC11395j f23668c;

        public C100141(InterfaceC11395j interfaceC11395j) {
            this.f23668c = interfaceC11395j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p379vd.InterfaceC11595d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r5, vc.InterfaceC11588c r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1$emit$1
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1$emit$1) r0
                int r1 = r0.f23671e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f23671e = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1$emit$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f23669c
                java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                int r2 = r0.f23671e
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.AbstractC9924b.m20071b(r6)
                goto L43
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.AbstractC9924b.m20071b(r6)
                ud.j r6 = r4.f23668c
                if (r5 != 0) goto L3a
                xd.c0 r5 = p394wd.AbstractC11737l.f27896a
            L3a:
                r0.f23671e = r3
                java.lang.Object r5 = r6.send(r5, r0)
                if (r5 != r1) goto L43
                return r1
            L43:
                qc.q r5 = p309qc.C10786q.f26013a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1.C100141.emit(java.lang.Object, vc.c):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$values$1(InterfaceC11594c interfaceC11594c, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f23667e = interfaceC11594c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        FlowKt__DelayKt$sample$2$values$1 flowKt__DelayKt$sample$2$values$1 = new FlowKt__DelayKt$sample$2$values$1(this.f23667e, interfaceC11588c);
        flowKt__DelayKt$sample$2$values$1.f23666d = obj;
        return flowKt__DelayKt$sample$2$values$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f23665c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11395j interfaceC11395j = (InterfaceC11395j) this.f23666d;
            InterfaceC11594c interfaceC11594c = this.f23667e;
            C100141 c100141 = new C100141(interfaceC11395j);
            this.f23665c = 1;
            if (interfaceC11594c.collect(c100141, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11395j interfaceC11395j, InterfaceC11588c interfaceC11588c) {
        return ((FlowKt__DelayKt$sample$2$values$1) create(interfaceC11395j, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
