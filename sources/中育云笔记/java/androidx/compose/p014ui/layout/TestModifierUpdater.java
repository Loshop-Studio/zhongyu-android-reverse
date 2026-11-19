package androidx.compose.p014ui.layout;

import androidx.annotation.RestrictTo;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.node.LayoutNode;
import androidx.compose.runtime.internal.StabilityInferred;
import p309qc.InterfaceC10770a;

@StabilityInferred(parameters = 0)
@InterfaceC10770a
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
