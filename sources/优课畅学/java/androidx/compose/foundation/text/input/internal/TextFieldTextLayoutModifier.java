package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextFieldTextLayoutModifier extends ModifierNodeElement<TextFieldTextLayoutModifierNode> {
    public static final int $stable = 0;
    private final KeyboardOptions keyboardOptions;
    private final InterfaceC10574p onTextLayout;
    private final boolean singleLine;
    private final TransformedTextFieldState textFieldState;
    private final TextLayoutState textLayoutState;
    private final TextStyle textStyle;

    public TextFieldTextLayoutModifier(TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z10, InterfaceC10574p interfaceC10574p, KeyboardOptions keyboardOptions) {
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textStyle = textStyle;
        this.singleLine = z10;
        this.onTextLayout = interfaceC10574p;
        this.keyboardOptions = keyboardOptions;
    }

    private final TextLayoutState component1() {
        return this.textLayoutState;
    }

    private final TransformedTextFieldState component2() {
        return this.textFieldState;
    }

    private final TextStyle component3() {
        return this.textStyle;
    }

    private final boolean component4() {
        return this.singleLine;
    }

    private final InterfaceC10574p component5() {
        return this.onTextLayout;
    }

    private final KeyboardOptions component6() {
        return this.keyboardOptions;
    }

    public static /* synthetic */ TextFieldTextLayoutModifier copy$default(TextFieldTextLayoutModifier textFieldTextLayoutModifier, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z10, InterfaceC10574p interfaceC10574p, KeyboardOptions keyboardOptions, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textLayoutState = textFieldTextLayoutModifier.textLayoutState;
        }
        if ((i10 & 2) != 0) {
            transformedTextFieldState = textFieldTextLayoutModifier.textFieldState;
        }
        if ((i10 & 4) != 0) {
            textStyle = textFieldTextLayoutModifier.textStyle;
        }
        if ((i10 & 8) != 0) {
            z10 = textFieldTextLayoutModifier.singleLine;
        }
        if ((i10 & 16) != 0) {
            interfaceC10574p = textFieldTextLayoutModifier.onTextLayout;
        }
        if ((i10 & 32) != 0) {
            keyboardOptions = textFieldTextLayoutModifier.keyboardOptions;
        }
        InterfaceC10574p interfaceC10574p2 = interfaceC10574p;
        KeyboardOptions keyboardOptions2 = keyboardOptions;
        return textFieldTextLayoutModifier.copy(textLayoutState, transformedTextFieldState, textStyle, z10, interfaceC10574p2, keyboardOptions2);
    }

    public final TextFieldTextLayoutModifier copy(TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z10, InterfaceC10574p interfaceC10574p, KeyboardOptions keyboardOptions) {
        return new TextFieldTextLayoutModifier(textLayoutState, transformedTextFieldState, textStyle, z10, interfaceC10574p, keyboardOptions);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldTextLayoutModifier)) {
            return false;
        }
        TextFieldTextLayoutModifier textFieldTextLayoutModifier = (TextFieldTextLayoutModifier) obj;
        return AbstractC9133u.m16128b(this.textLayoutState, textFieldTextLayoutModifier.textLayoutState) && AbstractC9133u.m16128b(this.textFieldState, textFieldTextLayoutModifier.textFieldState) && AbstractC9133u.m16128b(this.textStyle, textFieldTextLayoutModifier.textStyle) && this.singleLine == textFieldTextLayoutModifier.singleLine && AbstractC9133u.m16128b(this.onTextLayout, textFieldTextLayoutModifier.onTextLayout) && AbstractC9133u.m16128b(this.keyboardOptions, textFieldTextLayoutModifier.keyboardOptions);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = ((((((this.textLayoutState.hashCode() * 31) + this.textFieldState.hashCode()) * 31) + this.textStyle.hashCode()) * 31) + Boolean.hashCode(this.singleLine)) * 31;
        InterfaceC10574p interfaceC10574p = this.onTextLayout;
        return ((iHashCode + (interfaceC10574p == null ? 0 : interfaceC10574p.hashCode())) * 31) + this.keyboardOptions.hashCode();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public String toString() {
        return "TextFieldTextLayoutModifier(textLayoutState=" + this.textLayoutState + ", textFieldState=" + this.textFieldState + ", textStyle=" + this.textStyle + ", singleLine=" + this.singleLine + ", onTextLayout=" + this.onTextLayout + ", keyboardOptions=" + this.keyboardOptions + ')';
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public TextFieldTextLayoutModifierNode create() {
        return new TextFieldTextLayoutModifierNode(this.textLayoutState, this.textFieldState, this.textStyle, this.singleLine, this.onTextLayout, this.keyboardOptions);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(TextFieldTextLayoutModifierNode textFieldTextLayoutModifierNode) {
        textFieldTextLayoutModifierNode.updateNode(this.textLayoutState, this.textFieldState, this.textStyle, this.singleLine, this.onTextLayout, this.keyboardOptions);
    }
}
