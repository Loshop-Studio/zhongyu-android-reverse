package coil3.network;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.location.LocationRequestCompat;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "coil3.network.NetworkFetcher", m5303f = "NetworkFetcher.kt", m5304i = {0, 0, 1, 2}, m5305l = {61, 74, LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY}, m5306m = "fetch", m5307n = {"snapshot", "cacheResponse", "snapshot", "snapshot"}, m5308s = {"L$0", "L$1", "L$0", "L$0"})
/* loaded from: classes2.dex */
final class NetworkFetcher$fetch$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C3321j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$fetch$1(C3321j c3321j, InterfaceC5631c<? super NetworkFetcher$fetch$1> interfaceC5631c) {
        super(interfaceC5631c);
        this.this$0 = c3321j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo2253a(this);
    }
}
