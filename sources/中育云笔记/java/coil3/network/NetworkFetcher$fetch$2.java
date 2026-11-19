package coil3.network;

import coil3.decode.DataSource;
import coil3.network.internal.UtilsKt;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p228l.InterfaceC10085r;
import p253n.C10286p;
import p309qc.C10786q;
import p327s.C11019l;
import p327s.InterfaceC11020m;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "coil3.network.NetworkFetcher$fetch$2", m26211f = "NetworkFetcher.kt", m26212l = {104}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class NetworkFetcher$fetch$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f3824c;

    /* renamed from: d */
    public /* synthetic */ Object f3825d;

    /* renamed from: e */
    public final /* synthetic */ NetworkFetcher f3826e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$fetch$2(NetworkFetcher networkFetcher, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f3826e = networkFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        NetworkFetcher$fetch$2 networkFetcher$fetch$2 = new NetworkFetcher$fetch$2(this.f3826e, interfaceC11588c);
        networkFetcher$fetch$2.f3825d = obj;
        return networkFetcher$fetch$2;
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(C11019l c11019l, InterfaceC11588c interfaceC11588c) {
        return ((NetworkFetcher$fetch$2) create(c11019l, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C11019l c11019l = (C11019l) this.f3825d;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f3824c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            NetworkFetcher networkFetcher = this.f3826e;
            InterfaceC11020m interfaceC11020mM3251f = UtilsKt.m3251f(c11019l);
            this.f3825d = c11019l;
            this.f3824c = 1;
            obj = networkFetcher.m3215n(interfaceC11020mM3251f, this);
            if (obj == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        NetworkFetcher networkFetcher2 = this.f3826e;
        return new C10286p((InterfaceC10085r) obj, networkFetcher2.m3212k(networkFetcher2.f3803a, c11019l.m24341e().m3240c("Content-Type")), DataSource.f3613f);
    }
}
