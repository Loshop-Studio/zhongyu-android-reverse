package androidx.paging;

import androidx.annotation.RestrictTo;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.AbstractC10006d;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.AbstractC11597f;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public final class SimpleChannelFlowKt {

    @InterfaceC11829d(m26210c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1", m26211f = "SimpleChannelFlow.kt", m26212l = {46}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1 */
    public static final class C42891 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $block;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC11829d(m26210c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1", m26211f = "SimpleChannelFlow.kt", m26212l = {62, 63}, m26213m = "invokeSuspend", m26214v = 1)
        /* renamed from: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ InterfaceC11595d $$this$flow;
            final /* synthetic */ InterfaceC9544p $block;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC11595d interfaceC11595d, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$$this$flow = interfaceC11595d;
                this.$block = interfaceC9544p;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$flow, this.$block, interfaceC11588c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
            
                if (r6.emit(r13, r12) == r0) goto L20;
             */
            /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007b -> B:7:0x001a). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
                /*
                    r12 = this;
                    java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                    int r1 = r12.label
                    r2 = 2
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L31
                    if (r1 == r3) goto L25
                    if (r1 != r2) goto L1d
                    java.lang.Object r1 = r12.L$1
                    ud.e r1 = (p365ud.InterfaceC11390e) r1
                    java.lang.Object r5 = r12.L$0
                    kotlinx.coroutines.g r5 = (kotlinx.coroutines.InterfaceC10045g) r5
                    kotlin.AbstractC9924b.m20071b(r13)
                L1a:
                    r13 = r1
                    r1 = r5
                    goto L52
                L1d:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L25:
                    java.lang.Object r1 = r12.L$1
                    ud.e r1 = (p365ud.InterfaceC11390e) r1
                    java.lang.Object r5 = r12.L$0
                    kotlinx.coroutines.g r5 = (kotlinx.coroutines.InterfaceC10045g) r5
                    kotlin.AbstractC9924b.m20071b(r13)
                    goto L63
                L31:
                    kotlin.AbstractC9924b.m20071b(r13)
                    java.lang.Object r13 = r12.L$0
                    r5 = r13
                    sd.i0 r5 = (sd.InterfaceC11122i0) r5
                    r13 = 0
                    r1 = 6
                    kotlinx.coroutines.channels.a r13 = kotlinx.coroutines.channels.AbstractC10001b.m20722b(r13, r4, r4, r1, r4)
                    androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1 r8 = new androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1
                    hd.p r1 = r12.$block
                    r8.<init>(r13, r1, r4)
                    r9 = 3
                    r10 = 0
                    r6 = 0
                    r7 = 0
                    kotlinx.coroutines.g r1 = sd.AbstractC11109f.m24706d(r5, r6, r7, r8, r9, r10)
                    ud.e r13 = r13.iterator()
                L52:
                    r12.L$0 = r1
                    r12.L$1 = r13
                    r12.label = r3
                    java.lang.Object r5 = r13.mo20669a(r12)
                    if (r5 != r0) goto L5f
                    goto L7d
                L5f:
                    r11 = r1
                    r1 = r13
                    r13 = r5
                    r5 = r11
                L63:
                    java.lang.Boolean r13 = (java.lang.Boolean) r13
                    boolean r13 = r13.booleanValue()
                    if (r13 == 0) goto L7e
                    java.lang.Object r13 = r1.next()
                    vd.d r6 = r12.$$this$flow
                    r12.L$0 = r5
                    r12.L$1 = r1
                    r12.label = r2
                    java.lang.Object r13 = r6.emit(r13, r12)
                    if (r13 != r0) goto L1a
                L7d:
                    return r0
                L7e:
                    kotlinx.coroutines.InterfaceC10045g.a.m20900a(r5, r4, r3, r4)
                    qc.q r13 = p309qc.C10786q.f26013a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SimpleChannelFlowKt.C42891.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42891(InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C42891> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$block = interfaceC9544p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C42891 c42891 = new C42891(this.$block, interfaceC11588c);
            c42891.L$0 = obj;
            return c42891;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1((InterfaceC11595d) this.L$0, this.$block, null);
                this.label = 1;
                if (AbstractC10006d.m20748e(anonymousClass1, this) == objM25952f) {
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
        public final Object invoke(InterfaceC11595d interfaceC11595d, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C42891) create(interfaceC11595d, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public static final <T> InterfaceC11594c simpleChannelFlow(InterfaceC9544p block) {
        AbstractC9979u.m20294g(block, "block");
        return AbstractC11597f.m25578b(AbstractC11596e.m25531B(new C42891(block, null)), -2, null, 2, null);
    }
}
