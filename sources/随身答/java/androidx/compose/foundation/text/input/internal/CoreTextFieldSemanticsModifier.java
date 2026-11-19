package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p012ui.focus.FocusRequester;
import androidx.compose.p012ui.node.ModifierNodeElement;
import androidx.compose.p012ui.platform.InspectorInfo;
import androidx.compose.p012ui.text.input.ImeOptions;
import androidx.compose.p012ui.text.input.OffsetMapping;
import androidx.compose.p012ui.text.input.TextFieldValue;
import androidx.compose.p012ui.text.input.TransformedText;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m13412d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\t\u0010'\u001a\u00020\u0004HÆ\u0003J\t\u0010(\u001a\u00020\u0014HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\u000eHÆ\u0003J\t\u0010/\u001a\u00020\u0010HÆ\u0003J\t\u00100\u001a\u00020\u0012HÆ\u0003Jm\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001J\b\u00102\u001a\u00020\u0002H\u0016J\u0013\u00103\u001a\u00020\n2\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u000209HÖ\u0001J\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0002H\u0016J\f\u0010=\u001a\u00020;*\u00020>H\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006?"}, m13413d2 = {"Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifierNode;", "transformedText", "Landroidx/compose/ui/text/input/TransformedText;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "state", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "readOnly", "", "enabled", "isPassword", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "(Landroidx/compose/ui/text/input/TransformedText;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/LegacyTextFieldState;ZZZLandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/focus/FocusRequester;)V", "getEnabled", "()Z", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "getImeOptions", "()Landroidx/compose/ui/text/input/ImeOptions;", "getManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "getReadOnly", "getState", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "getTransformedText", "()Landroidx/compose/ui/text/input/TransformedText;", "getValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "create", "equals", "other", "", "hashCode", "", "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class CoreTextFieldSemanticsModifier extends ModifierNodeElement<CoreTextFieldSemanticsModifierNode> {
    public static final int $stable = 0;
    private final boolean enabled;
    private final FocusRequester focusRequester;
    private final ImeOptions imeOptions;
    private final boolean isPassword;
    private final TextFieldSelectionManager manager;
    private final OffsetMapping offsetMapping;
    private final boolean readOnly;
    private final LegacyTextFieldState state;
    private final TransformedText transformedText;
    private final TextFieldValue value;

    public CoreTextFieldSemanticsModifier(TransformedText transformedText, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, boolean z9, boolean z10, boolean z11, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, FocusRequester focusRequester) {
        this.transformedText = transformedText;
        this.value = textFieldValue;
        this.state = legacyTextFieldState;
        this.readOnly = z9;
        this.enabled = z10;
        this.isPassword = z11;
        this.offsetMapping = offsetMapping;
        this.manager = textFieldSelectionManager;
        this.imeOptions = imeOptions;
        this.focusRequester = focusRequester;
    }

    public static /* synthetic */ CoreTextFieldSemanticsModifier copy$default(CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier, TransformedText transformedText, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, boolean z9, boolean z10, boolean z11, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, FocusRequester focusRequester, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            transformedText = coreTextFieldSemanticsModifier.transformedText;
        }
        if ((i9 & 2) != 0) {
            textFieldValue = coreTextFieldSemanticsModifier.value;
        }
        if ((i9 & 4) != 0) {
            legacyTextFieldState = coreTextFieldSemanticsModifier.state;
        }
        if ((i9 & 8) != 0) {
            z9 = coreTextFieldSemanticsModifier.readOnly;
        }
        if ((i9 & 16) != 0) {
            z10 = coreTextFieldSemanticsModifier.enabled;
        }
        if ((i9 & 32) != 0) {
            z11 = coreTextFieldSemanticsModifier.isPassword;
        }
        if ((i9 & 64) != 0) {
            offsetMapping = coreTextFieldSemanticsModifier.offsetMapping;
        }
        if ((i9 & 128) != 0) {
            textFieldSelectionManager = coreTextFieldSemanticsModifier.manager;
        }
        if ((i9 & 256) != 0) {
            imeOptions = coreTextFieldSemanticsModifier.imeOptions;
        }
        if ((i9 & 512) != 0) {
            focusRequester = coreTextFieldSemanticsModifier.focusRequester;
        }
        ImeOptions imeOptions2 = imeOptions;
        FocusRequester focusRequester2 = focusRequester;
        OffsetMapping offsetMapping2 = offsetMapping;
        TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
        boolean z12 = z10;
        boolean z13 = z11;
        return coreTextFieldSemanticsModifier.copy(transformedText, textFieldValue, legacyTextFieldState, z9, z12, z13, offsetMapping2, textFieldSelectionManager2, imeOptions2, focusRequester2);
    }

    /* renamed from: component1, reason: from getter */
    public final TransformedText getTransformedText() {
        return this.transformedText;
    }

    /* renamed from: component10, reason: from getter */
    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    /* renamed from: component2, reason: from getter */
    public final TextFieldValue getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final LegacyTextFieldState getState() {
        return this.state;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getReadOnly() {
        return this.readOnly;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsPassword() {
        return this.isPassword;
    }

    /* renamed from: component7, reason: from getter */
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    /* renamed from: component8, reason: from getter */
    public final TextFieldSelectionManager getManager() {
        return this.manager;
    }

    /* renamed from: component9, reason: from getter */
    public final ImeOptions getImeOptions() {
        return this.imeOptions;
    }

    public final CoreTextFieldSemanticsModifier copy(TransformedText transformedText, TextFieldValue value, LegacyTextFieldState state, boolean readOnly, boolean enabled, boolean isPassword, OffsetMapping offsetMapping, TextFieldSelectionManager manager, ImeOptions imeOptions, FocusRequester focusRequester) {
        return new CoreTextFieldSemanticsModifier(transformedText, value, state, readOnly, enabled, isPassword, offsetMapping, manager, imeOptions, focusRequester);
    }

    @Override // androidx.compose.p012ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoreTextFieldSemanticsModifier)) {
            return false;
        }
        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = (CoreTextFieldSemanticsModifier) other;
        return Intrinsics.areEqual(this.transformedText, coreTextFieldSemanticsModifier.transformedText) && Intrinsics.areEqual(this.value, coreTextFieldSemanticsModifier.value) && Intrinsics.areEqual(this.state, coreTextFieldSemanticsModifier.state) && this.readOnly == coreTextFieldSemanticsModifier.readOnly && this.enabled == coreTextFieldSemanticsModifier.enabled && this.isPassword == coreTextFieldSemanticsModifier.isPassword && Intrinsics.areEqual(this.offsetMapping, coreTextFieldSemanticsModifier.offsetMapping) && Intrinsics.areEqual(this.manager, coreTextFieldSemanticsModifier.manager) && Intrinsics.areEqual(this.imeOptions, coreTextFieldSemanticsModifier.imeOptions) && Intrinsics.areEqual(this.focusRequester, coreTextFieldSemanticsModifier.focusRequester);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final ImeOptions getImeOptions() {
        return this.imeOptions;
    }

    public final TextFieldSelectionManager getManager() {
        return this.manager;
    }

    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final LegacyTextFieldState getState() {
        return this.state;
    }

    public final TransformedText getTransformedText() {
        return this.transformedText;
    }

    public final TextFieldValue getValue() {
        return this.value;
    }

    @Override // androidx.compose.p012ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((((((((((((this.transformedText.hashCode() * 31) + this.value.hashCode()) * 31) + this.state.hashCode()) * 31) + Boolean.hashCode(this.readOnly)) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.isPassword)) * 31) + this.offsetMapping.hashCode()) * 31) + this.manager.hashCode()) * 31) + this.imeOptions.hashCode()) * 31) + this.focusRequester.hashCode();
    }

    @Override // androidx.compose.p012ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public final boolean isPassword() {
        return this.isPassword;
    }

    public String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.transformedText + ", value=" + this.value + ", state=" + this.state + ", readOnly=" + this.readOnly + ", enabled=" + this.enabled + ", isPassword=" + this.isPassword + ", offsetMapping=" + this.offsetMapping + ", manager=" + this.manager + ", imeOptions=" + this.imeOptions + ", focusRequester=" + this.focusRequester + ')';
    }

    @Override // androidx.compose.p012ui.node.ModifierNodeElement
    /* renamed from: create */
    public CoreTextFieldSemanticsModifierNode getNode() {
        return new CoreTextFieldSemanticsModifierNode(this.transformedText, this.value, this.state, this.readOnly, this.enabled, this.isPassword, this.offsetMapping, this.manager, this.imeOptions, this.focusRequester);
    }

    @Override // androidx.compose.p012ui.node.ModifierNodeElement
    public void update(CoreTextFieldSemanticsModifierNode node) {
        node.updateNodeSemantics(this.transformedText, this.value, this.state, this.readOnly, this.enabled, this.isPassword, this.offsetMapping, this.manager, this.imeOptions, this.focusRequester);
    }
}
