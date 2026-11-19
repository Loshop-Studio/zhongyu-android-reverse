package coil3.network;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p327s.C11019l;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "coil3.network.NetworkFetcher$executeNetworkRequest$2", m26211f = "NetworkFetcher.kt", m26212l = {205}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class NetworkFetcher$executeNetworkRequest$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f3813c;

    /* renamed from: d */
    public /* synthetic */ Object f3814d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC9544p f3815e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$executeNetworkRequest$2(InterfaceC9544p interfaceC9544p, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f3815e = interfaceC9544p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        NetworkFetcher$executeNetworkRequest$2 networkFetcher$executeNetworkRequest$2 = new NetworkFetcher$executeNetworkRequest$2(this.f3815e, interfaceC11588c);
        networkFetcher$executeNetworkRequest$2.f3814d = obj;
        return networkFetcher$executeNetworkRequest$2;
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(C11019l c11019l, InterfaceC11588c interfaceC11588c) {
        return ((NetworkFetcher$executeNetworkRequest$2) create(c11019l, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C11019l c11019l = (C11019l) this.f3814d;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f3813c;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return obj;
        }
        AbstractC9924b.m20071b(obj);
        int iM24340d = c11019l.m24340d();
        if ((200 > iM24340d || iM24340d >= 300) && c11019l.m24340d() != 304) {
            throw new HttpException(c11019l);
        }
        InterfaceC9544p interfaceC9544p = this.f3815e;
        this.f3814d = AbstractC11833h.m26224a(c11019l);
        this.f3813c = 1;
        Object objInvoke = interfaceC9544p.invoke(c11019l, this);
        return objInvoke == objM25952f ? objM25952f : objInvoke;
    }
}
