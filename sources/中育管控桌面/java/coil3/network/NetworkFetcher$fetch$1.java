package coil3.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "coil3.network.NetworkFetcher", m7918f = "NetworkFetcher.kt", m7919i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2}, m7920l = {61, 74, 102}, m7921m = "fetch", m7922n = {"snapshot", "cacheResponse", "snapshot", "readResult", "cacheResponse", "networkRequest", "snapshot", "readResult", "cacheResponse", "networkRequest", "fetchResult"}, m7923s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4"})
/* loaded from: classes3.dex */
public final class NetworkFetcher$fetch$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f1825a;

    /* renamed from: b */
    public Object f1826b;

    /* renamed from: c */
    public Object f1827c;

    /* renamed from: d */
    public Object f1828d;

    /* renamed from: e */
    public Object f1829e;

    /* renamed from: f */
    public /* synthetic */ Object f1830f;

    /* renamed from: g */
    public final /* synthetic */ NetworkFetcher f1831g;

    /* renamed from: h */
    public int f1832h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$fetch$1(NetworkFetcher networkFetcher, Continuation continuation) {
        super(continuation);
        this.f1831g = networkFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1830f = obj;
        this.f1832h |= Integer.MIN_VALUE;
        return this.f1831g.mo1943a(this);
    }
}
