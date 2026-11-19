package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p379vd.InterfaceC11602k;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifier extends ModifierNodeElement<TextFieldDecoratorModifierNode> {
    public static final int $stable = 0;
    private final boolean enabled;
    private final InputTransformation filter;
    private final MutableInteractionSource interactionSource;
    private final boolean isPassword;
    private final KeyboardActionHandler keyboardActionHandler;
    private final KeyboardOptions keyboardOptions;
    private final boolean readOnly;
    private final boolean singleLine;
    private final InterfaceC11602k stylusHandwritingTrigger;
    private final TextFieldSelectionState textFieldSelectionState;
    private final TransformedTextFieldState textFieldState;
    private final TextLayoutState textLayoutState;

    public TextFieldDecoratorModifier(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z10, boolean z11, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z12, MutableInteractionSource mutableInteractionSource, boolean z13, InterfaceC11602k interfaceC11602k) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z10;
        this.readOnly = z11;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = z12;
        this.interactionSource = mutableInteractionSource;
        this.isPassword = z13;
        this.stylusHandwritingTrigger = interfaceC11602k;
    }

    private final TransformedTextFieldState component1() {
        return this.textFieldState;
    }

    private final MutableInteractionSource component10() {
        return this.interactionSource;
    }

    private final boolean component11() {
        return this.isPassword;
    }

    private final InterfaceC11602k component12() {
        return this.stylusHandwritingTrigger;
    }

    private final TextLayoutState component2() {
        return this.textLayoutState;
    }

    private final TextFieldSelectionState component3() {
        return this.textFieldSelectionState;
    }

    private final InputTransformation component4() {
        return this.filter;
    }

    private final boolean component5() {
        return this.enabled;
    }

    private final boolean component6() {
        return this.readOnly;
    }

    private final KeyboardOptions component7() {
        return this.keyboardOptions;
    }

    private final KeyboardActionHandler component8() {
        return this.keyboardActionHandler;
    }

    private final boolean component9() {
        return this.singleLine;
    }

    public static /* synthetic */ TextFieldDecoratorModifier copy$default(TextFieldDecoratorModifier textFieldDecoratorModifier, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z10, boolean z11, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z12, MutableInteractionSource mutableInteractionSource, boolean z13, InterfaceC11602k interfaceC11602k, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            transformedTextFieldState = textFieldDecoratorModifier.textFieldState;
        }
        if ((i10 & 2) != 0) {
            textLayoutState = textFieldDecoratorModifier.textLayoutState;
        }
        if ((i10 & 4) != 0) {
            textFieldSelectionState = textFieldDecoratorModifier.textFieldSelectionState;
        }
        if ((i10 & 8) != 0) {
            inputTransformation = textFieldDecoratorModifier.filter;
        }
        if ((i10 & 16) != 0) {
            z10 = textFieldDecoratorModifier.enabled;
        }
        if ((i10 & 32) != 0) {
            z11 = textFieldDecoratorModifier.readOnly;
        }
        if ((i10 & 64) != 0) {
            keyboardOptions = textFieldDecoratorModifier.keyboardOptions;
        }
        if ((i10 & 128) != 0) {
            keyboardActionHandler = textFieldDecoratorModifier.keyboardActionHandler;
        }
        if ((i10 & 256) != 0) {
            z12 = textFieldDecoratorModifier.singleLine;
        }
        if ((i10 & 512) != 0) {
            mutableInteractionSource = textFieldDecoratorModifier.interactionSource;
        }
        if ((i10 & 1024) != 0) {
            z13 = textFieldDecoratorModifier.isPassword;
        }
        if ((i10 & 2048) != 0) {
            interfaceC11602k = textFieldDecoratorModifier.stylusHandwritingTrigger;
        }
        boolean z14 = z13;
        InterfaceC11602k interfaceC11602k2 = interfaceC11602k;
        boolean z15 = z12;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        KeyboardOptions keyboardOptions2 = keyboardOptions;
        KeyboardActionHandler keyboardActionHandler2 = keyboardActionHandler;
        boolean z16 = z10;
        boolean z17 = z11;
        return textFieldDecoratorModifier.copy(transformedTextFieldState, textLayoutState, textFieldSelectionState, inputTransformation, z16, z17, keyboardOptions2, keyboardActionHandler2, z15, mutableInteractionSource2, z14, interfaceC11602k2);
    }

    public final TextFieldDecoratorModifier copy(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z10, boolean z11, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z12, MutableInteractionSource mutableInteractionSource, boolean z13, InterfaceC11602k interfaceC11602k) {
        return new TextFieldDecoratorModifier(transformedTextFieldState, textLayoutState, textFieldSelectionState, inputTransformation, z10, z11, keyboardOptions, keyboardActionHandler, z12, mutableInteractionSource, z13, interfaceC11602k);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldDecoratorModifier)) {
            return false;
        }
        TextFieldDecoratorModifier textFieldDecoratorModifier = (TextFieldDecoratorModifier) obj;
        return AbstractC9979u.m20289b(this.textFieldState, textFieldDecoratorModifier.textFieldState) && AbstractC9979u.m20289b(this.textLayoutState, textFieldDecoratorModifier.textLayoutState) && AbstractC9979u.m20289b(this.textFieldSelectionState, textFieldDecoratorModifier.textFieldSelectionState) && AbstractC9979u.m20289b(this.filter, textFieldDecoratorModifier.filter) && this.enabled == textFieldDecoratorModifier.enabled && this.readOnly == textFieldDecoratorModifier.readOnly && AbstractC9979u.m20289b(this.keyboardOptions, textFieldDecoratorModifier.keyboardOptions) && AbstractC9979u.m20289b(this.keyboardActionHandler, textFieldDecoratorModifier.keyboardActionHandler) && this.singleLine == textFieldDecoratorModifier.singleLine && AbstractC9979u.m20289b(this.interactionSource, textFieldDecoratorModifier.interactionSource) && this.isPassword == textFieldDecoratorModifier.isPassword && AbstractC9979u.m20289b(this.stylusHandwritingTrigger, textFieldDecoratorModifier.stylusHandwritingTrigger);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = ((((this.textFieldState.hashCode() * 31) + this.textLayoutState.hashCode()) * 31) + this.textFieldSelectionState.hashCode()) * 31;
        InputTransformation inputTransformation = this.filter;
        int iHashCode2 = (((((((iHashCode + (inputTransformation == null ? 0 : inputTransformation.hashCode())) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.readOnly)) * 31) + this.keyboardOptions.hashCode()) * 31;
        KeyboardActionHandler keyboardActionHandler = this.keyboardActionHandler;
        int iHashCode3 = (((((((iHashCode2 + (keyboardActionHandler == null ? 0 : keyboardActionHandler.hashCode())) * 31) + Boolean.hashCode(this.singleLine)) * 31) + this.interactionSource.hashCode()) * 31) + Boolean.hashCode(this.isPassword)) * 31;
        InterfaceC11602k interfaceC11602k = this.stylusHandwritingTrigger;
        return iHashCode3 + (interfaceC11602k != null ? interfaceC11602k.hashCode() : 0);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + this.textFieldState + ", textLayoutState=" + this.textLayoutState + ", textFieldSelectionState=" + this.textFieldSelectionState + ", filter=" + this.filter + ", enabled=" + this.enabled + ", readOnly=" + this.readOnly + ", keyboardOptions=" + this.keyboardOptions + ", keyboardActionHandler=" + this.keyboardActionHandler + ", singleLine=" + this.singleLine + ", interactionSource=" + this.interactionSource + ", isPassword=" + this.isPassword + ", stylusHandwritingTrigger=" + this.stylusHandwritingTrigger + ')';
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public TextFieldDecoratorModifierNode create() {
        return new TextFieldDecoratorModifierNode(this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.filter, this.enabled, this.readOnly, this.keyboardOptions, this.keyboardActionHandler, this.singleLine, this.interactionSource, this.isPassword, this.stylusHandwritingTrigger);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        textFieldDecoratorModifierNode.updateNode(this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.filter, this.enabled, this.readOnly, this.keyboardOptions, this.keyboardActionHandler, this.singleLine, this.interactionSource, this.isPassword, this.stylusHandwritingTrigger);
    }
}
