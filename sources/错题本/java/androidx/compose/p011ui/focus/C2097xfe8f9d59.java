package androidx.compose.p011ui.focus;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.InterfaceC5826g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.InterfaceC5428d;
import p152r6.InterfaceC6471c;

@Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* renamed from: androidx.compose.ui.focus.FocusPropertiesKt$sam$androidx_compose_ui_focus_FocusPropertiesScope$0 */
/* loaded from: classes.dex */
public final class C2097xfe8f9d59 implements FocusPropertiesScope, InterfaceC5826g {
    private final /* synthetic */ InterfaceC6471c function;

    public C2097xfe8f9d59(InterfaceC6471c interfaceC6471c) {
        this.function = interfaceC6471c;
    }

    @Override // androidx.compose.p011ui.focus.FocusPropertiesScope
    public final /* synthetic */ void apply(FocusProperties focusProperties) {
        this.function.invoke(focusProperties);
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof FocusPropertiesScope) && (obj instanceof InterfaceC5826g)) {
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
}
