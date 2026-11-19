package android.view.viewmodel.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.C6010v0;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.InterfaceC6013w0;
import org.jetbrains.annotations.NotNull;
import p075h6.InterfaceC5636h;

@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m5110d2 = {"Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lkotlinx/coroutines/v;", "Lh6/h;", "coroutineContext", "<init>", "(Lh6/h;)V", "coroutineScope", "(Lkotlinx/coroutines/v;)V", "Ld6/s;", "close", "()V", "Lh6/h;", "getCoroutineContext", "()Lh6/h;", "lifecycle-viewmodel_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class CloseableCoroutineScope implements AutoCloseable, InterfaceC6009v {

    @NotNull
    private final InterfaceC5636h coroutineContext;

    public CloseableCoroutineScope(@NotNull InterfaceC5636h coroutineContext) {
        AbstractC5830k.m5330g(coroutineContext, "coroutineContext");
        this.coroutineContext = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        InterfaceC6013w0 interfaceC6013w0 = (InterfaceC6013w0) getCoroutineContext().get(C6010v0.f9513a);
        if (interfaceC6013w0 != null) {
            interfaceC6013w0.cancel(null);
        }
    }

    @Override // kotlinx.coroutines.InterfaceC6009v
    @NotNull
    public InterfaceC5636h getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CloseableCoroutineScope(@NotNull InterfaceC6009v coroutineScope) {
        this(coroutineScope.getCoroutineContext());
        AbstractC5830k.m5330g(coroutineScope, "coroutineScope");
    }
}
