package coil3.network.okhttp.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "coil3.network.okhttp.internal.CallFactoryNetworkClient", m13451f = "utils.kt", m13452i = {0, 1}, m13453l = {24, 24, 25}, m13454m = "executeRequest-impl", m13455n = {"block", "block"}, m13456s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
public final class CallFactoryNetworkClient$executeRequest$1<T> extends ContinuationImpl {

    /* renamed from: a */
    public Object f3087a;

    /* renamed from: b */
    public Object f3088b;

    /* renamed from: c */
    public /* synthetic */ Object f3089c;

    /* renamed from: d */
    public int f3090d;

    public CallFactoryNetworkClient$executeRequest$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3089c = obj;
        this.f3090d |= Integer.MIN_VALUE;
        return CallFactoryNetworkClient.m2884e(null, null, null, this);
    }
}
