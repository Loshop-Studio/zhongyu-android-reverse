package coil3.intercept;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "coil3.intercept.RealInterceptorChain", m13451f = "RealInterceptorChain.kt", m13452i = {0}, m13453l = {31}, m13454m = "proceed", m13455n = {"interceptor"}, m13456s = {"L$0"})
/* loaded from: classes3.dex */
public final class RealInterceptorChain$proceed$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f3022a;

    /* renamed from: b */
    public /* synthetic */ Object f3023b;

    /* renamed from: c */
    public final /* synthetic */ RealInterceptorChain f3024c;

    /* renamed from: d */
    public int f3025d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealInterceptorChain$proceed$1(RealInterceptorChain realInterceptorChain, Continuation continuation) {
        super(continuation);
        this.f3024c = realInterceptorChain;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3023b = obj;
        this.f3025d |= Integer.MIN_VALUE;
        return this.f3024c.m2820g(this);
    }
}
