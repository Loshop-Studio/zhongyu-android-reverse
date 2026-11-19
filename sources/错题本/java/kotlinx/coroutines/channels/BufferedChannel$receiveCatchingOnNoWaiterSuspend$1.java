package kotlinx.coroutines.channels;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "kotlinx.coroutines.channels.BufferedChannel", m5303f = "BufferedChannel.kt", m5304i = {0, 0, 0, 0}, m5305l = {3117}, m5306m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", m5307n = {"this", "segment", "index", "r"}, m5308s = {"L$0", "L$1", "I$0", "J$0"})
/* loaded from: classes4.dex */
final class BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C5873b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(C5873b c5873b, InterfaceC5631c<? super BufferedChannel$receiveCatchingOnNoWaiterSuspend$1> interfaceC5631c) {
        super(interfaceC5631c);
        this.this$0 = c5873b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C5873b c5873b = this.this$0;
        AtomicLongFieldUpdater atomicLongFieldUpdater = C5873b.f9295b;
        Object objM5475C = c5873b.m5475C(null, 0, 0L, this);
        return objM5475C == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5475C : new C5879h(objM5475C);
    }
}
