package coil3.network;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "coil3.network.NetworkFetcher", m13451f = "NetworkFetcher.kt", m13452i = {0, 0, 1, 1, 1}, m13453l = {138, 153}, m13454m = "writeToDiskCache", m13455n = {"snapshot", "networkResponse", "networkResponse", "modifiedNetworkResponse", "editor"}, m13456s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
public final class NetworkFetcher$writeToDiskCache$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f3063a;

    /* renamed from: b */
    public Object f3064b;

    /* renamed from: c */
    public Object f3065c;

    /* renamed from: d */
    public /* synthetic */ Object f3066d;

    /* renamed from: e */
    public final /* synthetic */ NetworkFetcher f3067e;

    /* renamed from: f */
    public int f3068f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$writeToDiskCache$1(NetworkFetcher networkFetcher, Continuation continuation) {
        super(continuation);
        this.f3067e = networkFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3066d = obj;
        this.f3068f |= Integer.MIN_VALUE;
        return this.f3067e.m2848r(null, null, null, null, this);
    }
}
