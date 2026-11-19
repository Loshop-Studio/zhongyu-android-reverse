package coil3.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "coil3.util.LifecyclesKt", m5303f = "lifecycles.kt", m5304i = {0, 0}, m5305l = {42}, m5306m = "awaitStarted", m5307n = {"$this$awaitStarted", "observer"}, m5308s = {"L$0", "L$1"})
/* loaded from: classes2.dex */
final class LifecyclesKt$awaitStarted$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public LifecyclesKt$awaitStarted$1(InterfaceC5631c<? super LifecyclesKt$awaitStarted$1> interfaceC5631c) {
        super(interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC3343g.m2287a(null, this);
    }
}
