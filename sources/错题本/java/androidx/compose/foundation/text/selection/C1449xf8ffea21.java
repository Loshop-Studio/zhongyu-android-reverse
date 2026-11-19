package androidx.compose.foundation.text.selection;

import androidx.compose.p011ui.geometry.Offset;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.InterfaceC5826g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.InterfaceC5428d;
import p152r6.InterfaceC6469a;

@Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* renamed from: androidx.compose.foundation.text.selection.SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0 */
/* loaded from: classes.dex */
public final class C1449xf8ffea21 implements OffsetProvider, InterfaceC5826g {
    private final /* synthetic */ InterfaceC6469a function;

    public C1449xf8ffea21(InterfaceC6469a interfaceC6469a) {
        this.function = interfaceC6469a;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof OffsetProvider) && (obj instanceof InterfaceC5826g)) {
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

    @Override // androidx.compose.foundation.text.selection.OffsetProvider
    /* renamed from: provide-F1C5BW0 */
    public final /* synthetic */ long mo7576provideF1C5BW0() {
        return ((Offset) this.function.invoke()).m10451unboximpl();
    }
}
