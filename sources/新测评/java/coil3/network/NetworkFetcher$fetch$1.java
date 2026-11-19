package coil3.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "coil3.network.NetworkFetcher", m13596f = "NetworkFetcher.kt", m13597i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2}, m13598l = {61, 74, 102}, m13599m = "fetch", m13600n = {"snapshot", "cacheResponse", "snapshot", "readResult", "cacheResponse", "networkRequest", "snapshot", "readResult", "cacheResponse", "networkRequest", "fetchResult"}, m13601s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4"})
/* loaded from: classes3.dex */
public final class NetworkFetcher$fetch$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f3141a;

    /* renamed from: b */
    public Object f3142b;

    /* renamed from: c */
    public Object f3143c;

    /* renamed from: d */
    public Object f3144d;

    /* renamed from: e */
    public Object f3145e;

    /* renamed from: f */
    public /* synthetic */ Object f3146f;

    /* renamed from: g */
    public final /* synthetic */ NetworkFetcher f3147g;

    /* renamed from: h */
    public int f3148h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$fetch$1(NetworkFetcher networkFetcher, Continuation continuation) {
        super(continuation);
        this.f3147g = networkFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3146f = obj;
        this.f3148h |= Integer.MIN_VALUE;
        return this.f3147g.mo3117a(this);
    }
}
