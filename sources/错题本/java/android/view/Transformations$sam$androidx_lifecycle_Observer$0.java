package android.view;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.InterfaceC5826g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.InterfaceC5428d;
import p152r6.InterfaceC6471c;

@Metadata(m5111k = 3, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class Transformations$sam$androidx_lifecycle_Observer$0 implements Observer, InterfaceC5826g {
    private final /* synthetic */ InterfaceC6471c function;

    public Transformations$sam$androidx_lifecycle_Observer$0(InterfaceC6471c function) {
        AbstractC5830k.m5330g(function, "function");
        this.function = function;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof Observer) && (obj instanceof InterfaceC5826g)) {
            return AbstractC5830k.m5325b(getFunctionDelegate(), ((InterfaceC5826g) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC5826g
    @NotNull
    public final InterfaceC5428d getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // android.view.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
