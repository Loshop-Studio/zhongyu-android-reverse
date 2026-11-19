package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p011ui.node.ModifierNodeElement;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u000e*\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0019¨\u0006-"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifierNode;", "Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;", "serviceAdapter", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "legacyTextFieldState", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "textFieldSelectionManager", "<init>", "(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "create", "()Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifierNode;", "node", "Ld6/s;", "update", "(Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;", "component2", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "component3", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "copy", "(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifier;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;", "getServiceAdapter", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "getLegacyTextFieldState", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getTextFieldSelectionManager", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final /* data */ class LegacyAdaptingPlatformTextInputModifier extends ModifierNodeElement<LegacyAdaptingPlatformTextInputModifierNode> {

    @NotNull
    private final LegacyTextFieldState legacyTextFieldState;

    @NotNull
    private final LegacyPlatformTextInputServiceAdapter serviceAdapter;

    @NotNull
    private final TextFieldSelectionManager textFieldSelectionManager;

    public LegacyAdaptingPlatformTextInputModifier(@NotNull LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter, @NotNull LegacyTextFieldState legacyTextFieldState, @NotNull TextFieldSelectionManager textFieldSelectionManager) {
        this.serviceAdapter = legacyPlatformTextInputServiceAdapter;
        this.legacyTextFieldState = legacyTextFieldState;
        this.textFieldSelectionManager = textFieldSelectionManager;
    }

    public static /* synthetic */ LegacyAdaptingPlatformTextInputModifier copy$default(LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier, LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, int i, Object obj) {
        if ((i & 1) != 0) {
            legacyPlatformTextInputServiceAdapter = legacyAdaptingPlatformTextInputModifier.serviceAdapter;
        }
        if ((i & 2) != 0) {
            legacyTextFieldState = legacyAdaptingPlatformTextInputModifier.legacyTextFieldState;
        }
        if ((i & 4) != 0) {
            textFieldSelectionManager = legacyAdaptingPlatformTextInputModifier.textFieldSelectionManager;
        }
        return legacyAdaptingPlatformTextInputModifier.copy(legacyPlatformTextInputServiceAdapter, legacyTextFieldState, textFieldSelectionManager);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final LegacyPlatformTextInputServiceAdapter getServiceAdapter() {
        return this.serviceAdapter;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final LegacyTextFieldState getLegacyTextFieldState() {
        return this.legacyTextFieldState;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextFieldSelectionManager getTextFieldSelectionManager() {
        return this.textFieldSelectionManager;
    }

    @NotNull
    public final LegacyAdaptingPlatformTextInputModifier copy(@NotNull LegacyPlatformTextInputServiceAdapter serviceAdapter, @NotNull LegacyTextFieldState legacyTextFieldState, @NotNull TextFieldSelectionManager textFieldSelectionManager) {
        return new LegacyAdaptingPlatformTextInputModifier(serviceAdapter, legacyTextFieldState, textFieldSelectionManager);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) other;
        return AbstractC5830k.m5325b(this.serviceAdapter, legacyAdaptingPlatformTextInputModifier.serviceAdapter) && AbstractC5830k.m5325b(this.legacyTextFieldState, legacyAdaptingPlatformTextInputModifier.legacyTextFieldState) && AbstractC5830k.m5325b(this.textFieldSelectionManager, legacyAdaptingPlatformTextInputModifier.textFieldSelectionManager);
    }

    @NotNull
    public final LegacyTextFieldState getLegacyTextFieldState() {
        return this.legacyTextFieldState;
    }

    @NotNull
    public final LegacyPlatformTextInputServiceAdapter getServiceAdapter() {
        return this.serviceAdapter;
    }

    @NotNull
    public final TextFieldSelectionManager getTextFieldSelectionManager() {
        return this.textFieldSelectionManager;
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public int hashCode() {
        return this.textFieldSelectionManager.hashCode() + ((this.legacyTextFieldState.hashCode() + (this.serviceAdapter.hashCode() * 31)) * 31);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
    }

    @NotNull
    public String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.serviceAdapter + ", legacyTextFieldState=" + this.legacyTextFieldState + ", textFieldSelectionManager=" + this.textFieldSelectionManager + ')';
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    @NotNull
    /* renamed from: create */
    public LegacyAdaptingPlatformTextInputModifierNode getNode() {
        return new LegacyAdaptingPlatformTextInputModifierNode(this.serviceAdapter, this.legacyTextFieldState, this.textFieldSelectionManager);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void update(@NotNull LegacyAdaptingPlatformTextInputModifierNode node) {
        node.setServiceAdapter(this.serviceAdapter);
        node.setLegacyTextFieldState(this.legacyTextFieldState);
        node.setTextFieldSelectionManager(this.textFieldSelectionManager);
    }
}
