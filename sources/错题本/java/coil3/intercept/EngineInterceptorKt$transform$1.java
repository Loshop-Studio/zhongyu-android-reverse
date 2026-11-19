package coil3.intercept;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "coil3.intercept.EngineInterceptorKt", m5303f = "EngineInterceptor.kt", m5304i = {0, 0, 0, 0, 0, 0}, m5305l = {259}, m5306m = "transform", m5307n = {"result", "request", "options", "eventListener", "$this$foldIndices$iv", "i$iv"}, m5308s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
/* loaded from: classes2.dex */
final class EngineInterceptorKt$transform$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public EngineInterceptorKt$transform$1(InterfaceC5631c<? super EngineInterceptorKt$transform$1> interfaceC5631c) {
        super(interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC3301c.m2230a(null, null, null, null, this);
    }
}
