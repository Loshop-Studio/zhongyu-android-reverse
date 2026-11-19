package coil3.network;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import p194p.C8800p;
import p249u.C9524j;
import p249u.C9526l;

@Metadata(m13557d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13558d2 = {"Lu/l;", "response", "Lp/p;", "<anonymous>", "(Lu/l;)Lp/p;"}, m13559k = 3, m13560mv = {2, 2, 0})
@DebugMetadata(m13595c = "coil3.network.NetworkFetcher$fetch$fetchResult$1", m13596f = "NetworkFetcher.kt", m13597i = {0, 1}, m13598l = {76, 87}, m13599m = "invokeSuspend", m13600n = {"response", "response"}, m13601s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
public final class NetworkFetcher$fetch$fetchResult$1 extends SuspendLambda implements Function2<C9526l, Continuation<? super C8800p>, Object> {

    /* renamed from: a */
    public Object f3152a;

    /* renamed from: b */
    public int f3153b;

    /* renamed from: c */
    public /* synthetic */ Object f3154c;

    /* renamed from: d */
    public final /* synthetic */ Ref.ObjectRef f3155d;

    /* renamed from: e */
    public final /* synthetic */ NetworkFetcher f3156e;

    /* renamed from: f */
    public final /* synthetic */ Ref.ObjectRef f3157f;

    /* renamed from: g */
    public final /* synthetic */ C9524j f3158g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$fetch$fetchResult$1(Ref.ObjectRef objectRef, NetworkFetcher networkFetcher, Ref.ObjectRef objectRef2, C9524j c9524j, Continuation continuation) {
        super(2, continuation);
        this.f3155d = objectRef;
        this.f3156e = networkFetcher;
        this.f3157f = objectRef2;
        this.f3158g = c9524j;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(C9526l c9526l, Continuation continuation) {
        return ((NetworkFetcher$fetch$fetchResult$1) create(c9526l, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NetworkFetcher$fetch$fetchResult$1 networkFetcher$fetch$fetchResult$1 = new NetworkFetcher$fetch$fetchResult$1(this.f3155d, this.f3156e, this.f3157f, this.f3158g, continuation);
        networkFetcher$fetch$fetchResult$1.f3154c = obj;
        return networkFetcher$fetch$fetchResult$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        if (r12 == r0) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v9, types: [T, u.l] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Exception {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f3154c
            r5 = r0
            u.l r5 = (p249u.C9526l) r5
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.f3153b
            java.lang.String r7 = "Content-Type"
            r8 = 2
            r2 = 1
            r9 = 0
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L24
            if (r1 != r8) goto L1c
            kotlin.ResultKt.throwOnFailure(r12)
            r6 = r11
            goto Laf
        L1c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L24:
            java.lang.Object r1 = r11.f3152a
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            kotlin.ResultKt.throwOnFailure(r12)
            r6 = r11
            goto L54
        L2d:
            kotlin.ResultKt.throwOnFailure(r12)
            kotlin.jvm.internal.Ref$ObjectRef r12 = r11.f3155d
            coil3.network.NetworkFetcher r1 = r11.f3156e
            T r3 = r12.element
            coil3.disk.a$c r3 = (coil3.disk.InterfaceC5190a.c) r3
            kotlin.jvm.internal.Ref$ObjectRef r4 = r11.f3157f
            T r4 = r4.element
            u.l r4 = (p249u.C9526l) r4
            r6 = r2
            r2 = r3
            r3 = r4
            u.j r4 = r11.f3158g
            r11.f3154c = r5
            r11.f3152a = r12
            r11.f3153b = r6
            r6 = r11
            java.lang.Object r1 = coil3.network.NetworkFetcher.m3116g(r1, r2, r3, r4, r5, r6)
            if (r1 != r0) goto L51
            goto Lae
        L51:
            r10 = r1
            r1 = r12
            r12 = r10
        L54:
            r1.element = r12
            kotlin.jvm.internal.Ref$ObjectRef r12 = r6.f3155d
            T r12 = r12.element
            if (r12 == 0) goto L9e
            kotlin.jvm.internal.Ref$ObjectRef r0 = r6.f3157f
            coil3.network.NetworkFetcher r1 = r6.f3156e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r12)
            coil3.disk.a$c r12 = (coil3.disk.InterfaceC5190a.c) r12
            u.l r12 = coil3.network.NetworkFetcher.m3115f(r1, r12)
            r0.element = r12
            p.p r12 = new p.p
            coil3.network.NetworkFetcher r0 = r6.f3156e
            kotlin.jvm.internal.Ref$ObjectRef r1 = r6.f3155d
            T r1 = r1.element
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            coil3.disk.a$c r1 = (coil3.disk.InterfaceC5190a.c) r1
            n.r r0 = coil3.network.NetworkFetcher.m3113d(r0, r1)
            coil3.network.NetworkFetcher r1 = r6.f3156e
            java.lang.String r2 = coil3.network.NetworkFetcher.m3111b(r1)
            kotlin.jvm.internal.Ref$ObjectRef r3 = r6.f3157f
            T r3 = r3.element
            u.l r3 = (p249u.C9526l) r3
            if (r3 == 0) goto L94
            coil3.network.c r3 = r3.m15893e()
            if (r3 == 0) goto L94
            java.lang.String r9 = r3.m3149c(r7)
        L94:
            java.lang.String r1 = r1.m3121k(r2, r9)
            coil3.decode.DataSource r2 = coil3.decode.DataSource.f2938d
            r12.<init>(r0, r1, r2)
            return r12
        L9e:
            u.m r12 = coil3.network.internal.UtilsKt.m3160f(r5)
            r6.f3154c = r5
            r6.f3152a = r9
            r6.f3153b = r8
            java.lang.Object r12 = coil3.network.internal.UtilsKt.m3159e(r12, r11)
            if (r12 != r0) goto Laf
        Lae:
            return r0
        Laf:
            okio.Buffer r12 = (okio.Buffer) r12
            long r0 = r12.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Ldb
            p.p r0 = new p.p
            coil3.network.NetworkFetcher r1 = r6.f3156e
            n.r r12 = coil3.network.NetworkFetcher.m3114e(r1, r12)
            coil3.network.NetworkFetcher r1 = r6.f3156e
            java.lang.String r2 = coil3.network.NetworkFetcher.m3111b(r1)
            coil3.network.c r3 = r5.m15893e()
            java.lang.String r3 = r3.m3149c(r7)
            java.lang.String r1 = r1.m3121k(r2, r3)
            coil3.decode.DataSource r2 = coil3.decode.DataSource.f2938d
            r0.<init>(r12, r1, r2)
            return r0
        Ldb:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.NetworkFetcher$fetch$fetchResult$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
