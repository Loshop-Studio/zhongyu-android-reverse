package androidx.compose.foundation.text.input.internal;

import androidx.autofill.HintConstants;
import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p011ui.node.ModifierNodeElement;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bg\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u00126\u0010\u0014\u001a2\u0012\u0004\u0012\u00020\f\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b¢\u0006\u0002\b\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÂ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÂ\u0003¢\u0006\u0004\b\u001f\u0010 J@\u0010!\u001a2\u0012\u0004\u0012\u00020\f\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b¢\u0006\u0002\b\u0013HÂ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0015HÂ\u0003¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)J\u0013\u0010+\u001a\u00020\u0012*\u00020*H\u0016¢\u0006\u0004\b+\u0010,J|\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t28\b\u0002\u0010\u0014\u001a2\u0012\u0004\u0012\u00020\f\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b¢\u0006\u0002\b\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u00020\t2\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b7\u00108R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00109R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010:R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010;R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010<RD\u0010\u0014\u001a2\u0012\u0004\u0012\u00020\f\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b¢\u0006\u0002\b\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010=R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010>¨\u0006?"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifierNode;", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "", "singleLine", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "getResult", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "onTextLayout", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "<init>", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextStyle;ZLr6/e;Landroidx/compose/foundation/text/KeyboardOptions;)V", "component1", "()Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "component2", "()Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "component3", "()Landroidx/compose/ui/text/TextStyle;", "component4", "()Z", "component5", "()Lr6/e;", "component6", "()Landroidx/compose/foundation/text/KeyboardOptions;", "create", "()Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifierNode;", "node", "update", "(Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "copy", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextStyle;ZLr6/e;Landroidx/compose/foundation/text/KeyboardOptions;)Landroidx/compose/foundation/text/input/internal/TextFieldTextLayoutModifier;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "Landroidx/compose/ui/text/TextStyle;", "Z", "Lr6/e;", "Landroidx/compose/foundation/text/KeyboardOptions;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class TextFieldTextLayoutModifier extends ModifierNodeElement<TextFieldTextLayoutModifierNode> {
    public static final int $stable = 0;

    @NotNull
    private final KeyboardOptions keyboardOptions;

    @Nullable
    private final InterfaceC6473e onTextLayout;
    private final boolean singleLine;

    @NotNull
    private final TransformedTextFieldState textFieldState;

    @NotNull
    private final TextLayoutState textLayoutState;

    @NotNull
    private final TextStyle textStyle;

    public TextFieldTextLayoutModifier(@NotNull TextLayoutState textLayoutState, @NotNull TransformedTextFieldState transformedTextFieldState, @NotNull TextStyle textStyle, boolean z8, @Nullable InterfaceC6473e interfaceC6473e, @NotNull KeyboardOptions keyboardOptions) {
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textStyle = textStyle;
        this.singleLine = z8;
        this.onTextLayout = interfaceC6473e;
        this.keyboardOptions = keyboardOptions;
    }

    /* renamed from: component1, reason: from getter */
    private final TextLayoutState getTextLayoutState() {
        return this.textLayoutState;
    }

    /* renamed from: component2, reason: from getter */
    private final TransformedTextFieldState getTextFieldState() {
        return this.textFieldState;
    }

    /* renamed from: component3, reason: from getter */
    private final TextStyle getTextStyle() {
        return this.textStyle;
    }

    /* renamed from: component4, reason: from getter */
    private final boolean getSingleLine() {
        return this.singleLine;
    }

    /* renamed from: component5, reason: from getter */
    private final InterfaceC6473e getOnTextLayout() {
        return this.onTextLayout;
    }

    /* renamed from: component6, reason: from getter */
    private final KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    public static /* synthetic */ TextFieldTextLayoutModifier copy$default(TextFieldTextLayoutModifier textFieldTextLayoutModifier, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z8, InterfaceC6473e interfaceC6473e, KeyboardOptions keyboardOptions, int i, Object obj) {
        if ((i & 1) != 0) {
            textLayoutState = textFieldTextLayoutModifier.textLayoutState;
        }
        if ((i & 2) != 0) {
            transformedTextFieldState = textFieldTextLayoutModifier.textFieldState;
        }
        if ((i & 4) != 0) {
            textStyle = textFieldTextLayoutModifier.textStyle;
        }
        if ((i & 8) != 0) {
            z8 = textFieldTextLayoutModifier.singleLine;
        }
        if ((i & 16) != 0) {
            interfaceC6473e = textFieldTextLayoutModifier.onTextLayout;
        }
        if ((i & 32) != 0) {
            keyboardOptions = textFieldTextLayoutModifier.keyboardOptions;
        }
        InterfaceC6473e interfaceC6473e2 = interfaceC6473e;
        KeyboardOptions keyboardOptions2 = keyboardOptions;
        return textFieldTextLayoutModifier.copy(textLayoutState, transformedTextFieldState, textStyle, z8, interfaceC6473e2, keyboardOptions2);
    }

    @NotNull
    public final TextFieldTextLayoutModifier copy(@NotNull TextLayoutState textLayoutState, @NotNull TransformedTextFieldState textFieldState, @NotNull TextStyle textStyle, boolean singleLine, @Nullable InterfaceC6473e onTextLayout, @NotNull KeyboardOptions keyboardOptions) {
        return new TextFieldTextLayoutModifier(textLayoutState, textFieldState, textStyle, singleLine, onTextLayout, keyboardOptions);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextFieldTextLayoutModifier)) {
            return false;
        }
        TextFieldTextLayoutModifier textFieldTextLayoutModifier = (TextFieldTextLayoutModifier) other;
        return AbstractC5830k.m5325b(this.textLayoutState, textFieldTextLayoutModifier.textLayoutState) && AbstractC5830k.m5325b(this.textFieldState, textFieldTextLayoutModifier.textFieldState) && AbstractC5830k.m5325b(this.textStyle, textFieldTextLayoutModifier.textStyle) && this.singleLine == textFieldTextLayoutModifier.singleLine && AbstractC5830k.m5325b(this.onTextLayout, textFieldTextLayoutModifier.onTextLayout) && AbstractC5830k.m5325b(this.keyboardOptions, textFieldTextLayoutModifier.keyboardOptions);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public int hashCode() {
        int iM908i = AbstractC0584a.m908i(this.singleLine, (this.textStyle.hashCode() + ((this.textFieldState.hashCode() + (this.textLayoutState.hashCode() * 31)) * 31)) * 31, 31);
        InterfaceC6473e interfaceC6473e = this.onTextLayout;
        return this.keyboardOptions.hashCode() + ((iM908i + (interfaceC6473e == null ? 0 : interfaceC6473e.hashCode())) * 31);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
    }

    @NotNull
    public String toString() {
        return "TextFieldTextLayoutModifier(textLayoutState=" + this.textLayoutState + ", textFieldState=" + this.textFieldState + ", textStyle=" + this.textStyle + ", singleLine=" + this.singleLine + ", onTextLayout=" + this.onTextLayout + ", keyboardOptions=" + this.keyboardOptions + ')';
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    @NotNull
    /* renamed from: create */
    public TextFieldTextLayoutModifierNode getNode() {
        return new TextFieldTextLayoutModifierNode(this.textLayoutState, this.textFieldState, this.textStyle, this.singleLine, this.onTextLayout, this.keyboardOptions);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void update(@NotNull TextFieldTextLayoutModifierNode node) {
        node.updateNode(this.textLayoutState, this.textFieldState, this.textStyle, this.singleLine, this.onTextLayout, this.keyboardOptions);
    }
}
