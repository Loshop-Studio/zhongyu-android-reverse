package coil3.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "coil3.network.NetworkFetcher", m7918f = "NetworkFetcher.kt", m7919i = {0, 0}, m7920l = {245}, m7921m = "toImageSource", m7922n = {"$this$toImageSource", "buffer"}, m7923s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
public final class NetworkFetcher$toImageSource$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f1843a;

    /* renamed from: b */
    public Object f1844b;

    /* renamed from: c */
    public /* synthetic */ Object f1845c;

    /* renamed from: d */
    public final /* synthetic */ NetworkFetcher f1846d;

    /* renamed from: e */
    public int f1847e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$toImageSource$1(NetworkFetcher networkFetcher, Continuation continuation) {
        super(continuation);
        this.f1846d = networkFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f1845c = obj;
        this.f1847e |= Integer.MIN_VALUE;
        return this.f1846d.m1950n(null, this);
    }
}
