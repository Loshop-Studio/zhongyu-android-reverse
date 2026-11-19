package android.view.viewmodel.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import p054e7.AbstractC5479k;
import p068g7.C5609e;
import p075h6.InterfaceC5636h;

@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m5110d2 = {"Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "createViewModelScope", "()Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "Lkotlinx/coroutines/v;", "asCloseable", "(Lkotlinx/coroutines/v;)Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "", "VIEW_MODEL_SCOPE_KEY", "Ljava/lang/String;", "lifecycle-viewmodel_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class CloseableCoroutineScopeKt {

    @NotNull
    public static final String VIEW_MODEL_SCOPE_KEY = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY";

    @NotNull
    public static final CloseableCoroutineScope asCloseable(@NotNull InterfaceC6009v interfaceC6009v) {
        AbstractC5830k.m5330g(interfaceC6009v, "<this>");
        return new CloseableCoroutineScope(interfaceC6009v);
    }

    @NotNull
    public static final CloseableCoroutineScope createViewModelScope() {
        InterfaceC5636h interfaceC5636h;
        try {
            C5609e c5609e = AbstractC5896f0.f9343a;
            interfaceC5636h = AbstractC5479k.f8471a.f8411d;
        } catch (IllegalStateException unused) {
            interfaceC5636h = EmptyCoroutineContext.INSTANCE;
        } catch (NotImplementedError unused2) {
            interfaceC5636h = EmptyCoroutineContext.INSTANCE;
        }
        return new CloseableCoroutineScope(interfaceC5636h.plus(AbstractC6014x.m5632c()));
    }
}
