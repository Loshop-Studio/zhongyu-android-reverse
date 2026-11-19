package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C6010v0;
import kotlinx.coroutines.C6015x0;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.InterfaceC6013w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5636h;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\b\b\u0000\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m5110d2 = {"Landroidx/compose/runtime/RememberedCoroutineScope;", "Lkotlinx/coroutines/v;", "Landroidx/compose/runtime/RememberObserver;", "Lh6/h;", "parentContext", "overlayContext", "<init>", "(Lh6/h;Lh6/h;)V", "Ld6/s;", "cancelIfCreated", "()V", "onRemembered", "onForgotten", "onAbandoned", "Lh6/h;", "", "lock", "Ljava/lang/Object;", "_coroutineContext", "getCoroutineContext", "()Lh6/h;", "coroutineContext", "Companion", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/RememberedCoroutineScope\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,561:1\n27#2:562\n33#2,2:563\n33#2,2:565\n*S KotlinDebug\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/RememberedCoroutineScope\n*L\n431#1:562\n451#1:563,2\n478#1:565,2\n*E\n"})
/* loaded from: classes.dex */
public final class RememberedCoroutineScope implements InterfaceC6009v, RememberObserver {

    @Nullable
    private volatile InterfaceC5636h _coroutineContext;

    @NotNull
    private final Object lock = this;

    @NotNull
    private final InterfaceC5636h overlayContext;

    @NotNull
    private final InterfaceC5636h parentContext;
    public static final int $stable = 8;

    @JvmField
    @NotNull
    public static final InterfaceC5636h CancelledCoroutineContext = new CancelledCoroutineContext();

    public RememberedCoroutineScope(@NotNull InterfaceC5636h interfaceC5636h, @NotNull InterfaceC5636h interfaceC5636h2) {
        this.parentContext = interfaceC5636h;
        this.overlayContext = interfaceC5636h2;
    }

    public final void cancelIfCreated() {
        synchronized (this.lock) {
            try {
                InterfaceC5636h interfaceC5636h = this._coroutineContext;
                if (interfaceC5636h == null) {
                    this._coroutineContext = CancelledCoroutineContext;
                } else {
                    ForgottenCoroutineScopeException forgottenCoroutineScopeException = new ForgottenCoroutineScopeException();
                    InterfaceC6013w0 interfaceC6013w0 = (InterfaceC6013w0) interfaceC5636h.get(C6010v0.f9513a);
                    if (interfaceC6013w0 != null) {
                        interfaceC6013w0.cancel(forgottenCoroutineScopeException);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlinx.coroutines.InterfaceC6009v
    @NotNull
    public InterfaceC5636h getCoroutineContext() {
        InterfaceC5636h interfaceC5636hPlus;
        InterfaceC5636h interfaceC5636h = this._coroutineContext;
        if (interfaceC5636h == null || interfaceC5636h == CancelledCoroutineContext) {
            synchronized (this.lock) {
                try {
                    interfaceC5636hPlus = this._coroutineContext;
                    if (interfaceC5636hPlus == null) {
                        InterfaceC5636h interfaceC5636h2 = this.parentContext;
                        interfaceC5636hPlus = interfaceC5636h2.plus(new C6015x0((InterfaceC6013w0) interfaceC5636h2.get(C6010v0.f9513a))).plus(this.overlayContext);
                    } else if (interfaceC5636hPlus == CancelledCoroutineContext) {
                        InterfaceC5636h interfaceC5636h3 = this.parentContext;
                        C6015x0 c6015x0 = new C6015x0((InterfaceC6013w0) interfaceC5636h3.get(C6010v0.f9513a));
                        c6015x0.m5462v(new ForgottenCoroutineScopeException());
                        interfaceC5636hPlus = interfaceC5636h3.plus(c6015x0).plus(this.overlayContext);
                    }
                    this._coroutineContext = interfaceC5636hPlus;
                } catch (Throwable th) {
                    throw th;
                }
            }
            interfaceC5636h = interfaceC5636hPlus;
        }
        AbstractC5830k.m5327d(interfaceC5636h);
        return interfaceC5636h;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        cancelIfCreated();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        cancelIfCreated();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
