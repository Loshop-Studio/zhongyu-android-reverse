package coil3.network;

import androidx.core.location.LocationRequestCompat;
import coil3.decode.DataSource;
import coil3.decode.InterfaceC3275p;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p119n.C6206k;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lcoil3/network/m;", "response", "Ln/k;", "<anonymous>", "(Lcoil3/network/m;)Ln/k;"}, m5111k = 3, m5112mv = {2, 1, 0})
@DebugMetadata(m5302c = "coil3.network.NetworkFetcher$fetch$2", m5303f = "NetworkFetcher.kt", m5304i = {0}, m5305l = {LocationRequestCompat.QUALITY_LOW_POWER}, m5306m = "invokeSuspend", m5307n = {"response"}, m5308s = {"L$0"})
/* loaded from: classes2.dex */
final class NetworkFetcher$fetch$2 extends SuspendLambda implements InterfaceC6473e {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C3321j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$fetch$2(C3321j c3321j, InterfaceC5631c<? super NetworkFetcher$fetch$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = c3321j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        NetworkFetcher$fetch$2 networkFetcher$fetch$2 = new NetworkFetcher$fetch$2(this.this$0, interfaceC5631c);
        networkFetcher$fetch$2.L$0 = obj;
        return networkFetcher$fetch$2;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(C3324m c3324m, InterfaceC5631c<? super C6206k> interfaceC5631c) {
        return ((NetworkFetcher$fetch$2) create(c3324m, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C3324m c3324m;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            C3324m c3324m2 = (C3324m) this.L$0;
            C3321j c3321j = this.this$0;
            C3325n c3325n = c3324m2.f2028e;
            if (c3325n == null) {
                throw new IllegalStateException("body == null");
            }
            this.L$0 = c3324m2;
            this.label = 1;
            Object objM2250b = C3321j.m2250b(c3321j, c3325n, this);
            if (objM2250b == coroutineSingletons) {
                return coroutineSingletons;
            }
            c3324m = c3324m2;
            obj = objM2250b;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3324m = (C3324m) this.L$0;
            AbstractC5774b.m5119b(obj);
        }
        return new C6206k((InterfaceC3275p) obj, C3321j.m2252f(this.this$0.f2012a, c3324m.f2027d.m2259a()), DataSource.NETWORK);
    }
}
