package androidx.compose.foundation.text.input.internal;

import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.p011ui.node.ModifierNodeElement;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.flow.InterfaceC5958x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bs\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÂ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÂ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000bHÂ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÂ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u000eHÂ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0010HÂ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000bHÂ\u0003¢\u0006\u0004\b*\u0010$J\u0010\u0010+\u001a\u00020\u0013HÂ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u000bHÂ\u0003¢\u0006\u0004\b-\u0010$J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÂ\u0003¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0002H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u0002H\u0016¢\u0006\u0004\b3\u00104J\u0013\u00106\u001a\u00020\u0017*\u000205H\u0016¢\u0006\u0004\b6\u00107J\u0094\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010;\u001a\u00020:HÖ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010>\u001a\u00020=HÖ\u0001¢\u0006\u0004\b>\u0010?J\u001a\u0010B\u001a\u00020\u000b2\b\u0010A\u001a\u0004\u0018\u00010@HÖ\u0003¢\u0006\u0004\bB\u0010CR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010DR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010ER\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010FR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010GR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010HR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010HR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010IR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010JR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010HR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010KR\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010HR\u001c\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010L¨\u0006M"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "textFieldSelectionState", "Landroidx/compose/foundation/text/input/InputTransformation;", "filter", "", "enabled", "readOnly", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "keyboardActionHandler", "singleLine", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "isPassword", "Lkotlinx/coroutines/flow/x;", "Ld6/s;", "stylusHandwritingTrigger", "<init>", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/InputTransformation;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlinx/coroutines/flow/x;)V", "component1", "()Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "component2", "()Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "component3", "()Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "component4", "()Landroidx/compose/foundation/text/input/InputTransformation;", "component5", "()Z", "component6", "component7", "()Landroidx/compose/foundation/text/KeyboardOptions;", "component8", "()Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "component9", "component10", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "component11", "component12", "()Lkotlinx/coroutines/flow/x;", "create", "()Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;", "node", "update", "(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "copy", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/InputTransformation;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlinx/coroutines/flow/x;)Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifier;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "Landroidx/compose/foundation/text/input/InputTransformation;", "Z", "Landroidx/compose/foundation/text/KeyboardOptions;", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Lkotlinx/coroutines/flow/x;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class TextFieldDecoratorModifier extends ModifierNodeElement<TextFieldDecoratorModifierNode> {
    public static final int $stable = 0;
    private final boolean enabled;

    @Nullable
    private final InputTransformation filter;

    @NotNull
    private final MutableInteractionSource interactionSource;
    private final boolean isPassword;

    @Nullable
    private final KeyboardActionHandler keyboardActionHandler;

    @NotNull
    private final KeyboardOptions keyboardOptions;
    private final boolean readOnly;
    private final boolean singleLine;

    @Nullable
    private final InterfaceC5958x stylusHandwritingTrigger;

    @NotNull
    private final TextFieldSelectionState textFieldSelectionState;

    @NotNull
    private final TransformedTextFieldState textFieldState;

    @NotNull
    private final TextLayoutState textLayoutState;

    public TextFieldDecoratorModifier(@NotNull TransformedTextFieldState transformedTextFieldState, @NotNull TextLayoutState textLayoutState, @NotNull TextFieldSelectionState textFieldSelectionState, @Nullable InputTransformation inputTransformation, boolean z8, boolean z9, @NotNull KeyboardOptions keyboardOptions, @Nullable KeyboardActionHandler keyboardActionHandler, boolean z10, @NotNull MutableInteractionSource mutableInteractionSource, boolean z11, @Nullable InterfaceC5958x interfaceC5958x) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z8;
        this.readOnly = z9;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = z10;
        this.interactionSource = mutableInteractionSource;
        this.isPassword = z11;
        this.stylusHandwritingTrigger = interfaceC5958x;
    }

    /* renamed from: component1, reason: from getter */
    private final TransformedTextFieldState getTextFieldState() {
        return this.textFieldState;
    }

    /* renamed from: component10, reason: from getter */
    private final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    /* renamed from: component11, reason: from getter */
    private final boolean getIsPassword() {
        return this.isPassword;
    }

    /* renamed from: component12, reason: from getter */
    private final InterfaceC5958x getStylusHandwritingTrigger() {
        return this.stylusHandwritingTrigger;
    }

    /* renamed from: component2, reason: from getter */
    private final TextLayoutState getTextLayoutState() {
        return this.textLayoutState;
    }

    /* renamed from: component3, reason: from getter */
    private final TextFieldSelectionState getTextFieldSelectionState() {
        return this.textFieldSelectionState;
    }

    /* renamed from: component4, reason: from getter */
    private final InputTransformation getFilter() {
        return this.filter;
    }

    /* renamed from: component5, reason: from getter */
    private final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component6, reason: from getter */
    private final boolean getReadOnly() {
        return this.readOnly;
    }

    /* renamed from: component7, reason: from getter */
    private final KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    /* renamed from: component8, reason: from getter */
    private final KeyboardActionHandler getKeyboardActionHandler() {
        return this.keyboardActionHandler;
    }

    /* renamed from: component9, reason: from getter */
    private final boolean getSingleLine() {
        return this.singleLine;
    }

    public static /* synthetic */ TextFieldDecoratorModifier copy$default(TextFieldDecoratorModifier textFieldDecoratorModifier, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z8, boolean z9, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z10, MutableInteractionSource mutableInteractionSource, boolean z11, InterfaceC5958x interfaceC5958x, int i, Object obj) {
        if ((i & 1) != 0) {
            transformedTextFieldState = textFieldDecoratorModifier.textFieldState;
        }
        if ((i & 2) != 0) {
            textLayoutState = textFieldDecoratorModifier.textLayoutState;
        }
        if ((i & 4) != 0) {
            textFieldSelectionState = textFieldDecoratorModifier.textFieldSelectionState;
        }
        if ((i & 8) != 0) {
            inputTransformation = textFieldDecoratorModifier.filter;
        }
        if ((i & 16) != 0) {
            z8 = textFieldDecoratorModifier.enabled;
        }
        if ((i & 32) != 0) {
            z9 = textFieldDecoratorModifier.readOnly;
        }
        if ((i & 64) != 0) {
            keyboardOptions = textFieldDecoratorModifier.keyboardOptions;
        }
        if ((i & 128) != 0) {
            keyboardActionHandler = textFieldDecoratorModifier.keyboardActionHandler;
        }
        if ((i & 256) != 0) {
            z10 = textFieldDecoratorModifier.singleLine;
        }
        if ((i & 512) != 0) {
            mutableInteractionSource = textFieldDecoratorModifier.interactionSource;
        }
        if ((i & 1024) != 0) {
            z11 = textFieldDecoratorModifier.isPassword;
        }
        if ((i & 2048) != 0) {
            interfaceC5958x = textFieldDecoratorModifier.stylusHandwritingTrigger;
        }
        boolean z12 = z11;
        InterfaceC5958x interfaceC5958x2 = interfaceC5958x;
        boolean z13 = z10;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        KeyboardOptions keyboardOptions2 = keyboardOptions;
        KeyboardActionHandler keyboardActionHandler2 = keyboardActionHandler;
        boolean z14 = z8;
        boolean z15 = z9;
        return textFieldDecoratorModifier.copy(transformedTextFieldState, textLayoutState, textFieldSelectionState, inputTransformation, z14, z15, keyboardOptions2, keyboardActionHandler2, z13, mutableInteractionSource2, z12, interfaceC5958x2);
    }

    @NotNull
    public final TextFieldDecoratorModifier copy(@NotNull TransformedTextFieldState textFieldState, @NotNull TextLayoutState textLayoutState, @NotNull TextFieldSelectionState textFieldSelectionState, @Nullable InputTransformation filter, boolean enabled, boolean readOnly, @NotNull KeyboardOptions keyboardOptions, @Nullable KeyboardActionHandler keyboardActionHandler, boolean singleLine, @NotNull MutableInteractionSource interactionSource, boolean isPassword, @Nullable InterfaceC5958x stylusHandwritingTrigger) {
        return new TextFieldDecoratorModifier(textFieldState, textLayoutState, textFieldSelectionState, filter, enabled, readOnly, keyboardOptions, keyboardActionHandler, singleLine, interactionSource, isPassword, stylusHandwritingTrigger);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextFieldDecoratorModifier)) {
            return false;
        }
        TextFieldDecoratorModifier textFieldDecoratorModifier = (TextFieldDecoratorModifier) other;
        return AbstractC5830k.m5325b(this.textFieldState, textFieldDecoratorModifier.textFieldState) && AbstractC5830k.m5325b(this.textLayoutState, textFieldDecoratorModifier.textLayoutState) && AbstractC5830k.m5325b(this.textFieldSelectionState, textFieldDecoratorModifier.textFieldSelectionState) && AbstractC5830k.m5325b(this.filter, textFieldDecoratorModifier.filter) && this.enabled == textFieldDecoratorModifier.enabled && this.readOnly == textFieldDecoratorModifier.readOnly && AbstractC5830k.m5325b(this.keyboardOptions, textFieldDecoratorModifier.keyboardOptions) && AbstractC5830k.m5325b(this.keyboardActionHandler, textFieldDecoratorModifier.keyboardActionHandler) && this.singleLine == textFieldDecoratorModifier.singleLine && AbstractC5830k.m5325b(this.interactionSource, textFieldDecoratorModifier.interactionSource) && this.isPassword == textFieldDecoratorModifier.isPassword && AbstractC5830k.m5325b(this.stylusHandwritingTrigger, textFieldDecoratorModifier.stylusHandwritingTrigger);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = (this.textFieldSelectionState.hashCode() + ((this.textLayoutState.hashCode() + (this.textFieldState.hashCode() * 31)) * 31)) * 31;
        InputTransformation inputTransformation = this.filter;
        int iHashCode2 = (this.keyboardOptions.hashCode() + AbstractC0584a.m908i(this.readOnly, AbstractC0584a.m908i(this.enabled, (iHashCode + (inputTransformation == null ? 0 : inputTransformation.hashCode())) * 31, 31), 31)) * 31;
        KeyboardActionHandler keyboardActionHandler = this.keyboardActionHandler;
        int iM908i = AbstractC0584a.m908i(this.isPassword, (this.interactionSource.hashCode() + AbstractC0584a.m908i(this.singleLine, (iHashCode2 + (keyboardActionHandler == null ? 0 : keyboardActionHandler.hashCode())) * 31, 31)) * 31, 31);
        InterfaceC5958x interfaceC5958x = this.stylusHandwritingTrigger;
        return iM908i + (interfaceC5958x != null ? interfaceC5958x.hashCode() : 0);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
    }

    @NotNull
    public String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + this.textFieldState + ", textLayoutState=" + this.textLayoutState + ", textFieldSelectionState=" + this.textFieldSelectionState + ", filter=" + this.filter + ", enabled=" + this.enabled + ", readOnly=" + this.readOnly + ", keyboardOptions=" + this.keyboardOptions + ", keyboardActionHandler=" + this.keyboardActionHandler + ", singleLine=" + this.singleLine + ", interactionSource=" + this.interactionSource + ", isPassword=" + this.isPassword + ", stylusHandwritingTrigger=" + this.stylusHandwritingTrigger + ')';
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    @NotNull
    /* renamed from: create */
    public TextFieldDecoratorModifierNode getNode() {
        return new TextFieldDecoratorModifierNode(this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.filter, this.enabled, this.readOnly, this.keyboardOptions, this.keyboardActionHandler, this.singleLine, this.interactionSource, this.isPassword, this.stylusHandwritingTrigger);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void update(@NotNull TextFieldDecoratorModifierNode node) {
        node.updateNode(this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.filter, this.enabled, this.readOnly, this.keyboardOptions, this.keyboardActionHandler, this.singleLine, this.interactionSource, this.isPassword, this.stylusHandwritingTrigger);
    }
}
