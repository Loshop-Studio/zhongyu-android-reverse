package kotlinx.coroutines.flow.internal;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", m26211f = "Merge.kt", m26212l = {23}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class ChannelFlowTransformLatest$flowCollect$3 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f23916c;

    /* renamed from: d */
    public /* synthetic */ Object f23917d;

    /* renamed from: e */
    public final /* synthetic */ ChannelFlowTransformLatest f23918e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC11595d f23919f;

    /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 */
    public static final class C100421 implements InterfaceC11595d {

        /* renamed from: c */
        public final /* synthetic */ Ref$ObjectRef f23920c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC11122i0 f23921d;

        /* renamed from: e */
        public final /* synthetic */ ChannelFlowTransformLatest f23922e;

        /* renamed from: f */
        public final /* synthetic */ InterfaceC11595d f23923f;

        @InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", m26211f = "Merge.kt", m26212l = {30}, m26213m = "invokeSuspend")
        /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f23924c;

            /* renamed from: d */
            public final /* synthetic */ ChannelFlowTransformLatest f23925d;

            /* renamed from: e */
            public final /* synthetic */ InterfaceC11595d f23926e;

            /* renamed from: f */
            public final /* synthetic */ Object f23927f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ChannelFlowTransformLatest channelFlowTransformLatest, InterfaceC11595d interfaceC11595d, Object obj, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f23925d = channelFlowTransformLatest;
                this.f23926e = interfaceC11595d;
                this.f23927f = obj;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass2(this.f23925d, this.f23926e, this.f23927f, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.f23924c;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    InterfaceC9545q interfaceC9545q = this.f23925d.f23915g;
                    InterfaceC11595d interfaceC11595d = this.f23926e;
                    Object obj2 = this.f23927f;
                    this.f23924c = 1;
                    if (interfaceC9545q.invoke(interfaceC11595d, obj2, this) == objM25952f) {
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
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C100421(Ref$ObjectRef ref$ObjectRef, InterfaceC11122i0 interfaceC11122i0, ChannelFlowTransformLatest channelFlowTransformLatest, InterfaceC11595d interfaceC11595d) {
            this.f23920c = ref$ObjectRef;
            this.f23921d = interfaceC11122i0;
            this.f23922e = channelFlowTransformLatest;
            this.f23923f = interfaceC11595d;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p379vd.InterfaceC11595d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r8, vc.InterfaceC11588c r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1) r0
                int r1 = r0.f23933h
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f23933h = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f23931f
                java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                int r2 = r0.f23933h
                r3 = 1
                if (r2 == 0) goto L3b
                if (r2 != r3) goto L33
                java.lang.Object r8 = r0.f23930e
                kotlinx.coroutines.g r8 = (kotlinx.coroutines.InterfaceC10045g) r8
                java.lang.Object r8 = r0.f23929d
                java.lang.Object r0 = r0.f23928c
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.C100421) r0
                kotlin.AbstractC9924b.m20071b(r9)
                goto L5e
            L33:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3b:
                kotlin.AbstractC9924b.m20071b(r9)
                kotlin.jvm.internal.Ref$ObjectRef r9 = r7.f23920c
                java.lang.Object r9 = r9.f23402c
                kotlinx.coroutines.g r9 = (kotlinx.coroutines.InterfaceC10045g) r9
                if (r9 == 0) goto L5d
                kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                r2.<init>()
                r9.cancel(r2)
                r0.f23928c = r7
                r0.f23929d = r8
                r0.f23930e = r9
                r0.f23933h = r3
                java.lang.Object r9 = r9.mo20458v(r0)
                if (r9 != r1) goto L5d
                return r1
            L5d:
                r0 = r7
            L5e:
                kotlin.jvm.internal.Ref$ObjectRef r9 = r0.f23920c
                sd.i0 r1 = r0.f23921d
                kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.f23479f
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest r2 = r0.f23922e
                vd.d r0 = r0.f23923f
                r5 = 0
                r4.<init>(r2, r0, r8, r5)
                r5 = 1
                r6 = 0
                r2 = 0
                kotlinx.coroutines.g r8 = sd.AbstractC11109f.m24706d(r1, r2, r3, r4, r5, r6)
                r9.f23402c = r8
                qc.q r8 = p309qc.C10786q.f26013a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.C100421.emit(java.lang.Object, vc.c):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlowTransformLatest$flowCollect$3(ChannelFlowTransformLatest channelFlowTransformLatest, InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f23918e = channelFlowTransformLatest;
        this.f23919f = interfaceC11595d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        ChannelFlowTransformLatest$flowCollect$3 channelFlowTransformLatest$flowCollect$3 = new ChannelFlowTransformLatest$flowCollect$3(this.f23918e, this.f23919f, interfaceC11588c);
        channelFlowTransformLatest$flowCollect$3.f23917d = obj;
        return channelFlowTransformLatest$flowCollect$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f23916c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.f23917d;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ChannelFlowTransformLatest channelFlowTransformLatest = this.f23918e;
            InterfaceC11594c interfaceC11594c = channelFlowTransformLatest.f23911f;
            C100421 c100421 = new C100421(ref$ObjectRef, interfaceC11122i0, channelFlowTransformLatest, this.f23919f);
            this.f23916c = 1;
            if (interfaceC11594c.collect(c100421, this) == objM25952f) {
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
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((ChannelFlowTransformLatest$flowCollect$3) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
