package coil3.network;

import coil3.disk.C3291i;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p119n.C6206k;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lcoil3/network/m;", "response", "Ln/k;", "<anonymous>", "(Lcoil3/network/m;)Ln/k;"}, m5111k = 3, m5112mv = {2, 1, 0})
@DebugMetadata(m5302c = "coil3.network.NetworkFetcher$fetch$fetchResult$1", m5303f = "NetworkFetcher.kt", m5304i = {0, 1}, m5305l = {76, 87}, m5306m = "invokeSuspend", m5307n = {"response", "response"}, m5308s = {"L$0", "L$0"})
/* loaded from: classes2.dex */
final class NetworkFetcher$fetch$fetchResult$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ Ref$ObjectRef<C3324m> $cacheResponse;
    final /* synthetic */ C3323l $networkRequest;
    final /* synthetic */ Ref$ObjectRef<C3291i> $snapshot;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C3321j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$fetch$fetchResult$1(Ref$ObjectRef<C3291i> ref$ObjectRef, C3321j c3321j, Ref$ObjectRef<C3324m> ref$ObjectRef2, C3323l c3323l, InterfaceC5631c<? super NetworkFetcher$fetch$fetchResult$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$snapshot = ref$ObjectRef;
        this.this$0 = c3321j;
        this.$cacheResponse = ref$ObjectRef2;
        this.$networkRequest = c3323l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        NetworkFetcher$fetch$fetchResult$1 networkFetcher$fetch$fetchResult$1 = new NetworkFetcher$fetch$fetchResult$1(this.$snapshot, this.this$0, this.$cacheResponse, this.$networkRequest, interfaceC5631c);
        networkFetcher$fetch$fetchResult$1.L$0 = obj;
        return networkFetcher$fetch$fetchResult$1;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(C3324m c3324m, InterfaceC5631c<? super C6206k> interfaceC5631c) {
        return ((NetworkFetcher$fetch$fetchResult$1) create(c3324m, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1 A[RETURN] */
    /* JADX WARN: Type inference failed for: r10v11, types: [T, coil3.network.m] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.NetworkFetcher$fetch$fetchResult$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
