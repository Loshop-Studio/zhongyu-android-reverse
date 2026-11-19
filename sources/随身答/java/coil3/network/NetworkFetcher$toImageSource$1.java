package coil3.network;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "coil3.network.NetworkFetcher", m13451f = "NetworkFetcher.kt", m13452i = {0}, m13453l = {245}, m13454m = "toImageSource", m13455n = {"buffer"}, m13456s = {"L$0"})
/* loaded from: classes3.dex */
public final class NetworkFetcher$toImageSource$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f3059a;

    /* renamed from: b */
    public /* synthetic */ Object f3060b;

    /* renamed from: c */
    public final /* synthetic */ NetworkFetcher f3061c;

    /* renamed from: d */
    public int f3062d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$toImageSource$1(NetworkFetcher networkFetcher, Continuation continuation) {
        super(continuation);
        this.f3061c = networkFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3060b = obj;
        this.f3062d |= Integer.MIN_VALUE;
        return this.f3061c.m2844n(null, this);
    }
}
