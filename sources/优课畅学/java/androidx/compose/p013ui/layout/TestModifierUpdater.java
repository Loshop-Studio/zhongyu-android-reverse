package androidx.compose.p013ui.layout;

import androidx.annotation.RestrictTo;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.node.LayoutNode;
import androidx.compose.runtime.internal.StabilityInferred;
import p123h7.InterfaceC8721a;

@StabilityInferred(parameters = 0)
@InterfaceC8721a
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public final class TestModifierUpdater {
    public static final int $stable = 8;
    private final LayoutNode node;

    public TestModifierUpdater(LayoutNode layoutNode) {
        this.node = layoutNode;
    }

    public final void updateModifier(Modifier modifier) {
        this.node.setModifier(modifier);
    }
}
