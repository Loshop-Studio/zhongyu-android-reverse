package coil3.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "coil3.network.NetworkFetcher", m7918f = "NetworkFetcher.kt", m7919i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, m7920l = {138, 153}, m7921m = "writeToDiskCache", m7922n = {"snapshot", "cacheResponse", "networkRequest", "networkResponse", "snapshot", "cacheResponse", "networkRequest", "networkResponse", "writeResult", "modifiedNetworkResponse", "editor"}, m7923s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"})
/* loaded from: classes3.dex */
public final class NetworkFetcher$writeToDiskCache$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f1848a;

    /* renamed from: b */
    public Object f1849b;

    /* renamed from: c */
    public Object f1850c;

    /* renamed from: d */
    public Object f1851d;

    /* renamed from: e */
    public Object f1852e;

    /* renamed from: f */
    public Object f1853f;

    /* renamed from: g */
    public Object f1854g;

    /* renamed from: h */
    public /* synthetic */ Object f1855h;

    /* renamed from: i */
    public final /* synthetic */ NetworkFetcher f1856i;

    /* renamed from: j */
    public int f1857j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$writeToDiskCache$1(NetworkFetcher networkFetcher, Continuation continuation) {
        super(continuation);
        this.f1856i = networkFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1855h = obj;
        this.f1857j |= Integer.MIN_VALUE;
        return this.f1856i.m1954r(null, null, null, null, this);
    }
}
