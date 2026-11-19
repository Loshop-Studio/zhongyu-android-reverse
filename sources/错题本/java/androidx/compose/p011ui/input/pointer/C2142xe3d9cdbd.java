package androidx.compose.p011ui.input.pointer;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.InterfaceC5826g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.InterfaceC5428d;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0 */
/* loaded from: classes2.dex */
public final class C2142xe3d9cdbd implements PointerInputEventHandler, InterfaceC5826g {
    private final /* synthetic */ InterfaceC6473e function;

    public C2142xe3d9cdbd(InterfaceC6473e interfaceC6473e) {
        this.function = interfaceC6473e;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof PointerInputEventHandler) && (obj instanceof InterfaceC5826g)) {
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

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(PointerInputScope pointerInputScope, InterfaceC5631c interfaceC5631c) {
        return this.function.invoke(pointerInputScope, interfaceC5631c);
    }
}
