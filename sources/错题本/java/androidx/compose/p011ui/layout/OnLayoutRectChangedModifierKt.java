package androidx.compose.p011ui.layout;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.node.DelegatableNode;
import androidx.compose.p011ui.node.DelegatableNodeKt;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.p011ui.node.LayoutNodeKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\f\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m5110d2 = {"Landroidx/compose/ui/Modifier;", "", "throttleMillis", "debounceMillis", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "Ld6/s;", "callback", "onLayoutRectChanged", "(Landroidx/compose/ui/Modifier;JJLr6/c;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "registerOnLayoutRectChanged", "(Landroidx/compose/ui/node/DelegatableNode;JJLr6/c;)Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class OnLayoutRectChangedModifierKt {
    @Stable
    @NotNull
    public static final Modifier onLayoutRectChanged(@NotNull Modifier modifier, long j7, long j8, @NotNull InterfaceC6471c interfaceC6471c) {
        return modifier.then(new OnLayoutRectChangedElement(j7, j8, interfaceC6471c));
    }

    public static /* synthetic */ Modifier onLayoutRectChanged$default(Modifier modifier, long j7, long j8, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            j7 = 0;
        }
        long j9 = j7;
        if ((i & 2) != 0) {
            j8 = 64;
        }
        return onLayoutRectChanged(modifier, j9, j8, interfaceC6471c);
    }

    @NotNull
    public static final DelegatableNode.RegistrationHandle registerOnLayoutRectChanged(@NotNull DelegatableNode delegatableNode, long j7, long j8, @NotNull InterfaceC6471c interfaceC6471c) {
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        return LayoutNodeKt.requireOwner(layoutNodeRequireLayoutNode).getRectManager().registerOnRectChangedCallback(layoutNodeRequireLayoutNode.getSemanticsId(), j7, j8, delegatableNode, interfaceC6471c);
    }
}
