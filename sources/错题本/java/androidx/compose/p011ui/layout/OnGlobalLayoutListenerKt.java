package androidx.compose.p011ui.layout;

import androidx.compose.p011ui.node.DelegatableNode;
import androidx.compose.p011ui.node.DelegatableNodeKt;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.p011ui.node.LayoutNodeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m5110d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "", "throttleMillis", "debounceMillis", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "Ld6/s;", "callback", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "registerOnGlobalLayoutListener", "(Landroidx/compose/ui/node/DelegatableNode;JJLr6/c;)Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class OnGlobalLayoutListenerKt {
    @NotNull
    public static final DelegatableNode.RegistrationHandle registerOnGlobalLayoutListener(@NotNull DelegatableNode delegatableNode, long j7, long j8, @NotNull InterfaceC6471c interfaceC6471c) {
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        return LayoutNodeKt.requireOwner(layoutNodeRequireLayoutNode).getRectManager().registerOnGlobalLayoutCallback(layoutNodeRequireLayoutNode.getSemanticsId(), j7, j8, delegatableNode.getNode(), interfaceC6471c);
    }
}
