package coil3.intercept;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "coil3.intercept.RealInterceptorChain", m5303f = "RealInterceptorChain.kt", m5304i = {0}, m5305l = {31}, m5306m = "proceed", m5307n = {"interceptor"}, m5308s = {"L$0"})
/* loaded from: classes2.dex */
final class RealInterceptorChain$proceed$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C3303e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealInterceptorChain$proceed$1(C3303e c3303e, InterfaceC5631c<? super RealInterceptorChain$proceed$1> interfaceC5631c) {
        super(interfaceC5631c);
        this.this$0 = c3303e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m2231a(this);
    }
}
