package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p181hd.InterfaceC9544p;
import p379vd.InterfaceC11607p;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public final class SubscribedSharedFlow implements InterfaceC11607p {

    /* renamed from: c */
    public final InterfaceC11607p f23891c;

    /* renamed from: d */
    public final InterfaceC9544p f23892d;

    @InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.SubscribedSharedFlow", m26211f = "Share.kt", m26212l = {412}, m26213m = "collect")
    /* renamed from: kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1 */
    public static final class C100391 extends ContinuationImpl {

        /* renamed from: c */
        public /* synthetic */ Object f23893c;

        /* renamed from: e */
        public int f23895e;

        public C100391(InterfaceC11588c interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f23893c = obj;
            this.f23895e |= Integer.MIN_VALUE;
            return SubscribedSharedFlow.this.collect(null, this);
        }
    }

    public SubscribedSharedFlow(InterfaceC11607p interfaceC11607p, InterfaceC9544p interfaceC9544p) {
        this.f23891c = interfaceC11607p;
        this.f23892d = interfaceC9544p;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p379vd.InterfaceC11607p, p379vd.InterfaceC11594c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(p379vd.InterfaceC11595d r6, vc.InterfaceC11588c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.SubscribedSharedFlow.C100391
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1 r0 = (kotlinx.coroutines.flow.SubscribedSharedFlow.C100391) r0
            int r1 = r0.f23895e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23895e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1 r0 = new kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f23893c
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23895e
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            kotlin.AbstractC9924b.m20071b(r7)
            goto L46
        L31:
            kotlin.AbstractC9924b.m20071b(r7)
            vd.p r7 = r5.f23891c
            kotlinx.coroutines.flow.SubscribedFlowCollector r2 = new kotlinx.coroutines.flow.SubscribedFlowCollector
            hd.p r4 = r5.f23892d
            r2.<init>(r6, r4)
            r0.f23895e = r3
            java.lang.Object r6 = r7.collect(r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SubscribedSharedFlow.collect(vd.d, vc.c):java.lang.Object");
    }
}
