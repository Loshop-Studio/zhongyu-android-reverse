package coil3;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "coil3.RealImageLoader", m5303f = "RealImageLoader.kt", m5304i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, m5305l = {117, 129, 133}, m5306m = "execute", m5307n = {"requestDelegate", "request", "eventListener", "requestDelegate", "request", "eventListener", "cachedPlaceholder", "requestDelegate", "request", "eventListener"}, m5308s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
/* loaded from: classes2.dex */
final class RealImageLoader$execute$3 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C3333r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$3(C3333r c3333r, InterfaceC5631c<? super RealImageLoader$execute$3> interfaceC5631c) {
        super(interfaceC5631c);
        this.this$0 = c3333r;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C3333r c3333r = this.this$0;
        int i = C3333r.f2044f;
        return c3333r.m2275b(null, 0, this);
    }
}
