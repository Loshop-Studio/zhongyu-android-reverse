package coil3.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "coil3.network.NetworkFetcher", m13596f = "NetworkFetcher.kt", m13597i = {0, 0}, m13598l = {245}, m13599m = "toImageSource", m13600n = {"$this$toImageSource", "buffer"}, m13601s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
public final class NetworkFetcher$toImageSource$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f3159a;

    /* renamed from: b */
    public Object f3160b;

    /* renamed from: c */
    public /* synthetic */ Object f3161c;

    /* renamed from: d */
    public final /* synthetic */ NetworkFetcher f3162d;

    /* renamed from: e */
    public int f3163e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$toImageSource$1(NetworkFetcher networkFetcher, Continuation continuation) {
        super(continuation);
        this.f3162d = networkFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3161c = obj;
        this.f3163e |= Integer.MIN_VALUE;
        return this.f3162d.m3124n(null, this);
    }
}
