package coil3.network;

import androidx.exifinterface.media.ExifInterface;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcoil3/network/m;", "response", "<anonymous>"}, m5111k = 3, m5112mv = {2, 1, 0})
@DebugMetadata(m5302c = "coil3.network.NetworkFetcher$executeNetworkRequest$2", m5303f = "NetworkFetcher.kt", m5304i = {}, m5305l = {205}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes2.dex */
final class NetworkFetcher$executeNetworkRequest$2 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ InterfaceC6473e $block;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$executeNetworkRequest$2(InterfaceC6473e interfaceC6473e, InterfaceC5631c<? super NetworkFetcher$executeNetworkRequest$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$block = interfaceC6473e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        NetworkFetcher$executeNetworkRequest$2 networkFetcher$executeNetworkRequest$2 = new NetworkFetcher$executeNetworkRequest$2(this.$block, interfaceC5631c);
        networkFetcher$executeNetworkRequest$2.L$0 = obj;
        return networkFetcher$executeNetworkRequest$2;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(C3324m c3324m, InterfaceC5631c<Object> interfaceC5631c) {
        return ((NetworkFetcher$executeNetworkRequest$2) create(c3324m, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            return obj;
        }
        AbstractC5774b.m5119b(obj);
        C3324m c3324m = (C3324m) this.L$0;
        int i8 = c3324m.f2024a;
        if ((200 > i8 || i8 >= 300) && i8 != 304) {
            throw new HttpException(c3324m);
        }
        InterfaceC6473e interfaceC6473e = this.$block;
        this.label = 1;
        Object objInvoke = interfaceC6473e.invoke(c3324m, this);
        return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
    }
}
