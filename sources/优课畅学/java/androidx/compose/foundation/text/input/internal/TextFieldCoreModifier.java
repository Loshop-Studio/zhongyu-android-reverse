package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextFieldCoreModifier extends ModifierNodeElement<TextFieldCoreModifierNode> {
    public static final int $stable = 0;
    private final Brush cursorBrush;
    private final boolean isDragHovered;
    private final boolean isFocused;
    private final Orientation orientation;
    private final ScrollState scrollState;
    private final TextFieldSelectionState textFieldSelectionState;
    private final TransformedTextFieldState textFieldState;
    private final TextLayoutState textLayoutState;
    private final boolean writeable;

    public TextFieldCoreModifier(boolean z10, boolean z11, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z12, ScrollState scrollState, Orientation orientation) {
        this.isFocused = z10;
        this.isDragHovered = z11;
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = brush;
        this.writeable = z12;
        this.scrollState = scrollState;
        this.orientation = orientation;
    }

    private final boolean component1() {
        return this.isFocused;
    }

    private final boolean component2() {
        return this.isDragHovered;
    }

    private final TextLayoutState component3() {
        return this.textLayoutState;
    }

    private final TransformedTextFieldState component4() {
        return this.textFieldState;
    }

    private final TextFieldSelectionState component5() {
        return this.textFieldSelectionState;
    }

    private final Brush component6() {
        return this.cursorBrush;
    }

    private final boolean component7() {
        return this.writeable;
    }

    private final ScrollState component8() {
        return this.scrollState;
    }

    private final Orientation component9() {
        return this.orientation;
    }

    public static /* synthetic */ TextFieldCoreModifier copy$default(TextFieldCoreModifier textFieldCoreModifier, boolean z10, boolean z11, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z12, ScrollState scrollState, Orientation orientation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = textFieldCoreModifier.isFocused;
        }
        if ((i10 & 2) != 0) {
            z11 = textFieldCoreModifier.isDragHovered;
        }
        if ((i10 & 4) != 0) {
            textLayoutState = textFieldCoreModifier.textLayoutState;
        }
        if ((i10 & 8) != 0) {
            transformedTextFieldState = textFieldCoreModifier.textFieldState;
        }
        if ((i10 & 16) != 0) {
            textFieldSelectionState = textFieldCoreModifier.textFieldSelectionState;
        }
        if ((i10 & 32) != 0) {
            brush = textFieldCoreModifier.cursorBrush;
        }
        if ((i10 & 64) != 0) {
            z12 = textFieldCoreModifier.writeable;
        }
        if ((i10 & 128) != 0) {
            scrollState = textFieldCoreModifier.scrollState;
        }
        if ((i10 & 256) != 0) {
            orientation = textFieldCoreModifier.orientation;
        }
        ScrollState scrollState2 = scrollState;
        Orientation orientation2 = orientation;
        Brush brush2 = brush;
        boolean z13 = z12;
        TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
        TextLayoutState textLayoutState2 = textLayoutState;
        return textFieldCoreModifier.copy(z10, z11, textLayoutState2, transformedTextFieldState, textFieldSelectionState2, brush2, z13, scrollState2, orientation2);
    }

    public final TextFieldCoreModifier copy(boolean z10, boolean z11, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z12, ScrollState scrollState, Orientation orientation) {
        return new TextFieldCoreModifier(z10, z11, textLayoutState, transformedTextFieldState, textFieldSelectionState, brush, z12, scrollState, orientation);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldCoreModifier)) {
            return false;
        }
        TextFieldCoreModifier textFieldCoreModifier = (TextFieldCoreModifier) obj;
        return this.isFocused == textFieldCoreModifier.isFocused && this.isDragHovered == textFieldCoreModifier.isDragHovered && AbstractC9133u.m16128b(this.textLayoutState, textFieldCoreModifier.textLayoutState) && AbstractC9133u.m16128b(this.textFieldState, textFieldCoreModifier.textFieldState) && AbstractC9133u.m16128b(this.textFieldSelectionState, textFieldCoreModifier.textFieldSelectionState) && AbstractC9133u.m16128b(this.cursorBrush, textFieldCoreModifier.cursorBrush) && this.writeable == textFieldCoreModifier.writeable && AbstractC9133u.m16128b(this.scrollState, textFieldCoreModifier.scrollState) && this.orientation == textFieldCoreModifier.orientation;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.isFocused) * 31) + Boolean.hashCode(this.isDragHovered)) * 31) + this.textLayoutState.hashCode()) * 31) + this.textFieldState.hashCode()) * 31) + this.textFieldSelectionState.hashCode()) * 31) + this.cursorBrush.hashCode()) * 31) + Boolean.hashCode(this.writeable)) * 31) + this.scrollState.hashCode()) * 31) + this.orientation.hashCode();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.isFocused + ", isDragHovered=" + this.isDragHovered + ", textLayoutState=" + this.textLayoutState + ", textFieldState=" + this.textFieldState + ", textFieldSelectionState=" + this.textFieldSelectionState + ", cursorBrush=" + this.cursorBrush + ", writeable=" + this.writeable + ", scrollState=" + this.scrollState + ", orientation=" + this.orientation + ')';
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public TextFieldCoreModifierNode create() {
        return new TextFieldCoreModifierNode(this.isFocused, this.isDragHovered, this.textLayoutState, this.textFieldState, this.textFieldSelectionState, this.cursorBrush, this.writeable, this.scrollState, this.orientation);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(TextFieldCoreModifierNode textFieldCoreModifierNode) {
        textFieldCoreModifierNode.updateNode(this.isFocused, this.isDragHovered, this.textLayoutState, this.textFieldState, this.textFieldSelectionState, this.cursorBrush, this.writeable, this.scrollState, this.orientation);
    }
}
