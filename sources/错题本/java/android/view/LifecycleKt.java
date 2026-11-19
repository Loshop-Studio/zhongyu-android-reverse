package android.view;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.C5982m1;
import kotlinx.coroutines.C6010v0;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.C5902b;
import kotlinx.coroutines.flow.InterfaceC5910f;
import kotlinx.coroutines.flow.internal.AbstractC5920b;
import org.jetbrains.annotations.NotNull;
import p046d7.C5447d;
import p054e7.AbstractC5479k;
import p068g7.C5609e;
import p169t6.AbstractC6600a;

@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m5110d2 = {"Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/LifecycleCoroutineScope;", "getCoroutineScope", "(Landroidx/lifecycle/Lifecycle;)Landroidx/lifecycle/LifecycleCoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/flow/f;", "Landroidx/lifecycle/Lifecycle$Event;", "getEventFlow", "(Landroidx/lifecycle/Lifecycle;)Lkotlinx/coroutines/flow/f;", "eventFlow", "lifecycle-common"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class LifecycleKt {
    @NotNull
    public static final LifecycleCoroutineScope getCoroutineScope(@NotNull Lifecycle lifecycle) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        AbstractC5830k.m5330g(lifecycle, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) lifecycle.getInternalScopeRef().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            C5982m1 c5982m1M5632c = AbstractC6014x.m5632c();
            C5609e c5609e = AbstractC5896f0.f9343a;
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, AbstractC6600a.m6239o(AbstractC5479k.f8471a.f8411d, c5982m1M5632c));
        } while (!lifecycle.getInternalScopeRef().compareAndSet(null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.register();
        return lifecycleCoroutineScopeImpl;
    }

    @NotNull
    public static final InterfaceC5910f getEventFlow(@NotNull Lifecycle lifecycle) {
        AbstractC5830k.m5330g(lifecycle, "<this>");
        C5902b c5902bM5551g = AbstractC5914h.m5551g(new LifecycleKt$eventFlow$1(lifecycle, null));
        C5609e c5609e = AbstractC5896f0.f9343a;
        C5447d c5447d = AbstractC5479k.f8471a.f8411d;
        if (c5447d.get(C6010v0.f9513a) == null) {
            return c5447d.equals(EmptyCoroutineContext.INSTANCE) ? c5902bM5551g : AbstractC5920b.m5564b(c5902bM5551g, c5447d, 0, null, 6);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + c5447d).toString());
    }
}
