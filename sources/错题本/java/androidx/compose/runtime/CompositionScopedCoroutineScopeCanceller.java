package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m5110d2 = {"Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlinx/coroutines/v;", "coroutineScope", "<init>", "(Lkotlinx/coroutines/v;)V", "Ld6/s;", "onRemembered", "()V", "onForgotten", "onAbandoned", "Lkotlinx/coroutines/v;", "getCoroutineScope", "()Lkotlinx/coroutines/v;", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@PublishedApi
/* loaded from: classes.dex */
public final class CompositionScopedCoroutineScopeCanceller implements RememberObserver {
    public static final int $stable = 8;

    @NotNull
    private final InterfaceC6009v coroutineScope;

    public CompositionScopedCoroutineScopeCanceller(@NotNull InterfaceC6009v interfaceC6009v) {
        this.coroutineScope = interfaceC6009v;
    }

    @NotNull
    public final InterfaceC6009v getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        InterfaceC6009v interfaceC6009v = this.coroutineScope;
        if (interfaceC6009v instanceof RememberedCoroutineScope) {
            ((RememberedCoroutineScope) interfaceC6009v).cancelIfCreated();
        } else {
            AbstractC6014x.m5635f(interfaceC6009v, new LeftCompositionCancellationException());
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        InterfaceC6009v interfaceC6009v = this.coroutineScope;
        if (interfaceC6009v instanceof RememberedCoroutineScope) {
            ((RememberedCoroutineScope) interfaceC6009v).cancelIfCreated();
        } else {
            AbstractC6014x.m5635f(interfaceC6009v, new LeftCompositionCancellationException());
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
