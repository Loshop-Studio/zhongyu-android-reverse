package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.LayoutNode;
import androidx.compose.p013ui.node.LayoutNodeKt;
import androidx.compose.p013ui.spatial.RelativeLayoutBounds;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(m13557d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007\u001a.\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¨\u0006\f"}, m13558d2 = {"onLayoutRectChanged", "Landroidx/compose/ui/Modifier;", "throttleMillis", "", "debounceMillis", "callback", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "", "registerOnLayoutRectChanged", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "Landroidx/compose/ui/node/DelegatableNode;", "ui_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class OnLayoutRectChangedModifierKt {
    @Stable
    public static final Modifier onLayoutRectChanged(Modifier modifier, long j10, long j11, Function1<? super RelativeLayoutBounds, Unit> function1) {
        return modifier.then(new OnLayoutRectChangedElement(j10, j11, function1));
    }

    public static /* synthetic */ Modifier onLayoutRectChanged$default(Modifier modifier, long j10, long j11, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = 64;
        }
        return onLayoutRectChanged(modifier, j12, j11, function1);
    }

    public static final DelegatableNode.RegistrationHandle registerOnLayoutRectChanged(DelegatableNode delegatableNode, long j10, long j11, Function1<? super RelativeLayoutBounds, Unit> function1) {
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        return LayoutNodeKt.requireOwner(layoutNodeRequireLayoutNode).getRectManager().registerOnRectChangedCallback(layoutNodeRequireLayoutNode.getSemanticsId(), j10, j11, delegatableNode, function1);
    }
}
