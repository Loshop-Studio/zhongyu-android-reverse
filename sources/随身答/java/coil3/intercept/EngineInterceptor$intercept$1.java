package coil3.intercept;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "coil3.intercept.EngineInterceptor", m13451f = "EngineInterceptor.kt", m13452i = {0}, m13453l = {75}, m13454m = "intercept", m13455n = {"chain"}, m13456s = {"L$0"})
/* loaded from: classes3.dex */
public final class EngineInterceptor$intercept$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f2994a;

    /* renamed from: b */
    public /* synthetic */ Object f2995b;

    /* renamed from: c */
    public final /* synthetic */ EngineInterceptor f2996c;

    /* renamed from: d */
    public int f2997d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$intercept$1(EngineInterceptor engineInterceptor, Continuation continuation) {
        super(continuation);
        this.f2996c = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2995b = obj;
        this.f2997d |= Integer.MIN_VALUE;
        return this.f2996c.mo2803a(null, this);
    }
}
