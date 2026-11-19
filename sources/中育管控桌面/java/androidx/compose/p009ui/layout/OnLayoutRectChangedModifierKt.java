package androidx.compose.p009ui.layout;

import androidx.compose.p009ui.Modifier;
import androidx.compose.p009ui.node.DelegatableNode;
import androidx.compose.p009ui.node.DelegatableNodeKt;
import androidx.compose.p009ui.node.LayoutNode;
import androidx.compose.p009ui.node.LayoutNodeKt;
import androidx.compose.p009ui.spatial.RelativeLayoutBounds;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(m7879d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007\u001a.\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¨\u0006\f"}, m7880d2 = {"onLayoutRectChanged", "Landroidx/compose/ui/Modifier;", "throttleMillis", "", "debounceMillis", "callback", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "", "registerOnLayoutRectChanged", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "Landroidx/compose/ui/node/DelegatableNode;", "ui_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class OnLayoutRectChangedModifierKt {
    @Stable
    public static final Modifier onLayoutRectChanged(Modifier modifier, long j6, long j7, Function1<? super RelativeLayoutBounds, Unit> function1) {
        return modifier.then(new OnLayoutRectChangedElement(j6, j7, function1));
    }

    public static /* synthetic */ Modifier onLayoutRectChanged$default(Modifier modifier, long j6, long j7, Function1 function1, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            j6 = 0;
        }
        long j8 = j6;
        if ((i6 & 2) != 0) {
            j7 = 64;
        }
        return onLayoutRectChanged(modifier, j8, j7, function1);
    }

    public static final DelegatableNode.RegistrationHandle registerOnLayoutRectChanged(DelegatableNode delegatableNode, long j6, long j7, Function1<? super RelativeLayoutBounds, Unit> function1) {
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        return LayoutNodeKt.requireOwner(layoutNodeRequireLayoutNode).getRectManager().registerOnRectChangedCallback(layoutNodeRequireLayoutNode.getSemanticsId(), j6, j7, delegatableNode, function1);
    }
}
