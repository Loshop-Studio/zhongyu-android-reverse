package androidx.compose.p011ui;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.InspectorValueInfo;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0012\u0018\u00002\u00020\u00012\u00020\u0002B>\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\b\t¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u000b\u0010\fR-\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\b\t¢\u0006\u0002\b\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m5110d2 = {"Landroidx/compose/ui/ComposedModifier;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composable;", "factory", "<init>", "(Lr6/c;Lr6/f;)V", "Lr6/f;", "getFactory", "()Lr6/f;", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
class ComposedModifier extends InspectorValueInfo implements Modifier.Element {

    @NotNull
    private final InterfaceC6474f factory;

    public ComposedModifier(@NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6474f interfaceC6474f) {
        super(interfaceC6471c);
        this.factory = interfaceC6474f;
    }

    @NotNull
    public final InterfaceC6474f getFactory() {
        return this.factory;
    }
}
