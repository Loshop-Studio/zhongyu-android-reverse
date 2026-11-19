package coil3.network;

import com.alibaba.fastjson.asm.Opcodes;
import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p327s.C11017j;
import p327s.C11019l;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "coil3.network.NetworkFetcher$fetch$fetchResult$1", m26211f = "NetworkFetcher.kt", m26212l = {PatchStatus.CODE_LOAD_SOPHIX_VERSION, Opcodes.POP}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class NetworkFetcher$fetch$fetchResult$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f3827c;

    /* renamed from: d */
    public int f3828d;

    /* renamed from: e */
    public /* synthetic */ Object f3829e;

    /* renamed from: f */
    public final /* synthetic */ Ref$ObjectRef f3830f;

    /* renamed from: g */
    public final /* synthetic */ NetworkFetcher f3831g;

    /* renamed from: h */
    public final /* synthetic */ Ref$ObjectRef f3832h;

    /* renamed from: i */
    public final /* synthetic */ C11017j f3833i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$fetch$fetchResult$1(Ref$ObjectRef ref$ObjectRef, NetworkFetcher networkFetcher, Ref$ObjectRef ref$ObjectRef2, C11017j c11017j, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f3830f = ref$ObjectRef;
        this.f3831g = networkFetcher;
        this.f3832h = ref$ObjectRef2;
        this.f3833i = c11017j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        NetworkFetcher$fetch$fetchResult$1 networkFetcher$fetch$fetchResult$1 = new NetworkFetcher$fetch$fetchResult$1(this.f3830f, this.f3831g, this.f3832h, this.f3833i, interfaceC11588c);
        networkFetcher$fetch$fetchResult$1.f3829e = obj;
        return networkFetcher$fetch$fetchResult$1;
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(C11019l c11019l, InterfaceC11588c interfaceC11588c) {
        return ((NetworkFetcher$fetch$fetchResult$1) create(c11019l, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        if (r12 == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Exception {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f3829e
            r5 = r0
            s.l r5 = (p327s.C11019l) r5
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r11.f3828d
            java.lang.String r7 = "Content-Type"
            r8 = 2
            r2 = 1
            r9 = 0
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L24
            if (r1 != r8) goto L1c
            kotlin.AbstractC9924b.m20071b(r12)
            r6 = r11
            goto Laf
        L1c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L24:
            java.lang.Object r1 = r11.f3827c
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            kotlin.AbstractC9924b.m20071b(r12)
            r6 = r11
            goto L54
        L2d:
            kotlin.AbstractC9924b.m20071b(r12)
            kotlin.jvm.internal.Ref$ObjectRef r12 = r11.f3830f
            coil3.network.NetworkFetcher r1 = r11.f3831g
            java.lang.Object r3 = r12.f23402c
            coil3.disk.a$c r3 = (coil3.disk.InterfaceC5467a.c) r3
            kotlin.jvm.internal.Ref$ObjectRef r4 = r11.f3832h
            java.lang.Object r4 = r4.f23402c
            s.l r4 = (p327s.C11019l) r4
            r6 = r2
            r2 = r3
            r3 = r4
            s.j r4 = r11.f3833i
            r11.f3829e = r5
            r11.f3827c = r12
            r11.f3828d = r6
            r6 = r11
            java.lang.Object r1 = coil3.network.NetworkFetcher.m3207g(r1, r2, r3, r4, r5, r6)
            if (r1 != r0) goto L51
            goto Lae
        L51:
            r10 = r1
            r1 = r12
            r12 = r10
        L54:
            r1.f23402c = r12
            kotlin.jvm.internal.Ref$ObjectRef r12 = r6.f3830f
            java.lang.Object r12 = r12.f23402c
            if (r12 == 0) goto L9e
            kotlin.jvm.internal.Ref$ObjectRef r0 = r6.f3832h
            coil3.network.NetworkFetcher r1 = r6.f3831g
            kotlin.jvm.internal.AbstractC9979u.m20291d(r12)
            coil3.disk.a$c r12 = (coil3.disk.InterfaceC5467a.c) r12
            s.l r12 = coil3.network.NetworkFetcher.m3206f(r1, r12)
            r0.f23402c = r12
            n.p r12 = new n.p
            coil3.network.NetworkFetcher r0 = r6.f3831g
            kotlin.jvm.internal.Ref$ObjectRef r1 = r6.f3830f
            java.lang.Object r1 = r1.f23402c
            kotlin.jvm.internal.AbstractC9979u.m20291d(r1)
            coil3.disk.a$c r1 = (coil3.disk.InterfaceC5467a.c) r1
            l.r r0 = coil3.network.NetworkFetcher.m3204d(r0, r1)
            coil3.network.NetworkFetcher r1 = r6.f3831g
            java.lang.String r2 = coil3.network.NetworkFetcher.m3202b(r1)
            kotlin.jvm.internal.Ref$ObjectRef r3 = r6.f3832h
            java.lang.Object r3 = r3.f23402c
            s.l r3 = (p327s.C11019l) r3
            if (r3 == 0) goto L94
            coil3.network.c r3 = r3.m24341e()
            if (r3 == 0) goto L94
            java.lang.String r9 = r3.m3240c(r7)
        L94:
            java.lang.String r1 = r1.m3212k(r2, r9)
            coil3.decode.DataSource r2 = coil3.decode.DataSource.f3613f
            r12.<init>(r0, r1, r2)
            return r12
        L9e:
            s.m r12 = coil3.network.internal.UtilsKt.m3251f(r5)
            r6.f3829e = r5
            r6.f3827c = r9
            r6.f3828d = r8
            java.lang.Object r12 = coil3.network.internal.UtilsKt.m3250e(r12, r11)
            if (r12 != r0) goto Laf
        Lae:
            return r0
        Laf:
            okio.Buffer r12 = (okio.Buffer) r12
            long r0 = r12.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Ldb
            n.p r0 = new n.p
            coil3.network.NetworkFetcher r1 = r6.f3831g
            l.r r12 = coil3.network.NetworkFetcher.m3205e(r1, r12)
            coil3.network.NetworkFetcher r1 = r6.f3831g
            java.lang.String r2 = coil3.network.NetworkFetcher.m3202b(r1)
            coil3.network.c r3 = r5.m24341e()
            java.lang.String r3 = r3.m3240c(r7)
            java.lang.String r1 = r1.m3212k(r2, r3)
            coil3.decode.DataSource r2 = coil3.decode.DataSource.f3613f
            r0.<init>(r12, r1, r2)
            return r0
        Ldb:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.NetworkFetcher$fetch$fetchResult$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
