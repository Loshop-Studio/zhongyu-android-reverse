package coil3.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "coil3.network.NetworkFetcher", m13596f = "NetworkFetcher.kt", m13597i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, m13598l = {138, 153}, m13599m = "writeToDiskCache", m13600n = {"snapshot", "cacheResponse", "networkRequest", "networkResponse", "snapshot", "cacheResponse", "networkRequest", "networkResponse", "writeResult", "modifiedNetworkResponse", "editor"}, m13601s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"})
/* loaded from: classes3.dex */
public final class NetworkFetcher$writeToDiskCache$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f3164a;

    /* renamed from: b */
    public Object f3165b;

    /* renamed from: c */
    public Object f3166c;

    /* renamed from: d */
    public Object f3167d;

    /* renamed from: e */
    public Object f3168e;

    /* renamed from: f */
    public Object f3169f;

    /* renamed from: g */
    public Object f3170g;

    /* renamed from: h */
    public /* synthetic */ Object f3171h;

    /* renamed from: i */
    public final /* synthetic */ NetworkFetcher f3172i;

    /* renamed from: j */
    public int f3173j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$writeToDiskCache$1(NetworkFetcher networkFetcher, Continuation continuation) {
        super(continuation);
        this.f3172i = networkFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3171h = obj;
        this.f3173j |= Integer.MIN_VALUE;
        return this.f3172i.m3128r(null, null, null, null, this);
    }
}
