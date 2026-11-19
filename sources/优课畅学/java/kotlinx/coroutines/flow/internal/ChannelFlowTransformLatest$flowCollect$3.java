package kotlinx.coroutines.flow.internal;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", m17801f = "Merge.kt", m17802l = {23}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ChannelFlowTransformLatest$flowCollect$3 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f18004a;

    /* renamed from: b */
    public /* synthetic */ Object f18005b;

    /* renamed from: c */
    public final /* synthetic */ ChannelFlowTransformLatest f18006c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC9267d f18007d;

    /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 */
    public static final class C92001 implements InterfaceC9267d {

        /* renamed from: a */
        public final /* synthetic */ Ref$ObjectRef f18008a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC8822b0 f18009b;

        /* renamed from: c */
        public final /* synthetic */ ChannelFlowTransformLatest f18010c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC9267d f18011d;

        @InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", m17801f = "Merge.kt", m17802l = {30}, m17803m = "invokeSuspend")
        /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f18012a;

            /* renamed from: b */
            public final /* synthetic */ ChannelFlowTransformLatest f18013b;

            /* renamed from: c */
            public final /* synthetic */ InterfaceC9267d f18014c;

            /* renamed from: d */
            public final /* synthetic */ Object f18015d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ChannelFlowTransformLatest channelFlowTransformLatest, InterfaceC9267d interfaceC9267d, Object obj, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f18013b = channelFlowTransformLatest;
                this.f18014c = interfaceC9267d;
                this.f18015d = obj;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass2(this.f18013b, this.f18014c, this.f18015d, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f18012a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC10575q interfaceC10575q = this.f18013b.f18003e;
                    InterfaceC9267d interfaceC9267d = this.f18014c;
                    Object obj2 = this.f18015d;
                    this.f18012a = 1;
                    if (interfaceC10575q.invoke(interfaceC9267d, obj2, this) == objM17291f) {
                        return objM17291f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                }
                return C8736p.f16368a;
            }
        }

        public C92001(Ref$ObjectRef ref$ObjectRef, InterfaceC8822b0 interfaceC8822b0, ChannelFlowTransformLatest channelFlowTransformLatest, InterfaceC9267d interfaceC9267d) {
            this.f18008a = ref$ObjectRef;
            this.f18009b = interfaceC8822b0;
            this.f18010c = channelFlowTransformLatest;
            this.f18011d = interfaceC9267d;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p169l8.InterfaceC9267d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r8, p179m7.InterfaceC9324c r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1) r0
                int r1 = r0.f18021f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f18021f = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f18019d
                java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                int r2 = r0.f18021f
                r3 = 1
                if (r2 == 0) goto L3b
                if (r2 != r3) goto L33
                java.lang.Object r8 = r0.f18018c
                kotlinx.coroutines.n r8 = (kotlinx.coroutines.InterfaceC9212n) r8
                java.lang.Object r8 = r0.f18017b
                java.lang.Object r0 = r0.f18016a
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.C92001) r0
                kotlin.AbstractC9079b.m15926b(r9)
                goto L5e
            L33:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3b:
                kotlin.AbstractC9079b.m15926b(r9)
                kotlin.jvm.internal.Ref$ObjectRef r9 = r7.f18008a
                java.lang.Object r9 = r9.f17473a
                kotlinx.coroutines.n r9 = (kotlinx.coroutines.InterfaceC9212n) r9
                if (r9 == 0) goto L5d
                kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                r2.<init>()
                r9.cancel(r2)
                r0.f18016a = r7
                r0.f18017b = r8
                r0.f18018c = r9
                r0.f18021f = r3
                java.lang.Object r9 = r9.mo16291n(r0)
                if (r9 != r1) goto L5d
                return r1
            L5d:
                r0 = r7
            L5e:
                kotlin.jvm.internal.Ref$ObjectRef r9 = r0.f18008a
                i8.b0 r1 = r0.f18009b
                kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.f17555d
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest r2 = r0.f18010c
                l8.d r0 = r0.f18011d
                r5 = 0
                r4.<init>(r2, r0, r8, r5)
                r5 = 1
                r6 = 0
                r2 = 0
                kotlinx.coroutines.n r8 = p135i8.AbstractC8833f.m14845d(r1, r2, r3, r4, r5, r6)
                r9.f17473a = r8
                h7.p r8 = p123h7.C8736p.f16368a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.C92001.emit(java.lang.Object, m7.c):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlowTransformLatest$flowCollect$3(ChannelFlowTransformLatest channelFlowTransformLatest, InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f18006c = channelFlowTransformLatest;
        this.f18007d = interfaceC9267d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        ChannelFlowTransformLatest$flowCollect$3 channelFlowTransformLatest$flowCollect$3 = new ChannelFlowTransformLatest$flowCollect$3(this.f18006c, this.f18007d, interfaceC9324c);
        channelFlowTransformLatest$flowCollect$3.f18005b = obj;
        return channelFlowTransformLatest$flowCollect$3;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ChannelFlowTransformLatest$flowCollect$3) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f18004a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.f18005b;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ChannelFlowTransformLatest channelFlowTransformLatest = this.f18006c;
            InterfaceC9266c interfaceC9266c = channelFlowTransformLatest.f17999d;
            C92001 c92001 = new C92001(ref$ObjectRef, interfaceC8822b0, channelFlowTransformLatest, this.f18007d);
            this.f18004a = 1;
            if (interfaceC9266c.collect(c92001, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }
}
