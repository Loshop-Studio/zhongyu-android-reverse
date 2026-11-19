package coil3.network.okhttp.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "coil3.network.okhttp.internal.CallFactoryNetworkClient", m5303f = "utils.kt", m5304i = {0, 1}, m5305l = {24, 24, 25}, m5306m = "executeRequest-impl", m5307n = {"block", "block"}, m5308s = {"L$0", "L$0"})
/* loaded from: classes2.dex */
final class CallFactoryNetworkClient$executeRequest$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public CallFactoryNetworkClient$executeRequest$1(InterfaceC5631c<? super CallFactoryNetworkClient$executeRequest$1> interfaceC5631c) {
        super(interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C3326a.m2260a(null, null, null, this);
    }
}
