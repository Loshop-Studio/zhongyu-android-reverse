package androidx.compose.material3;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorProducer;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.InterfaceC5826g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.InterfaceC5428d;
import p152r6.InterfaceC6469a;

@Metadata(m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* renamed from: androidx.compose.material3.TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0 */
/* loaded from: classes.dex */
public final class C1874x758e63df implements ColorProducer, InterfaceC5826g {
    private final /* synthetic */ InterfaceC6469a function;

    public C1874x758e63df(InterfaceC6469a interfaceC6469a) {
        this.function = interfaceC6469a;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof ColorProducer) && (obj instanceof InterfaceC5826g)) {
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

    @Override // androidx.compose.p011ui.graphics.ColorProducer
    /* renamed from: invoke-0d7_KjU */
    public final /* synthetic */ long mo8454invoke0d7_KjU() {
        return ((Color) this.function.invoke()).m10692unboximpl();
    }
}
