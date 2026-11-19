package androidx.compose.foundation.text.input.internal;

import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.node.ModifierNodeElement;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.p011ui.text.input.ImeOptions;
import androidx.compose.p011ui.text.input.OffsetMapping;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.text.input.TransformedText;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u001a*\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b)\u0010'J\u0010\u0010*\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b0\u00101Jt\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u000204HÖ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00108\u001a\u000207HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020\t2\b\u0010;\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\b?\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bA\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bC\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bE\u0010'R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bF\u0010'R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\b\f\u0010'R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010G\u001a\u0004\bH\u0010+R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010I\u001a\u0004\bJ\u0010-R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010K\u001a\u0004\bL\u0010/R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010M\u001a\u0004\bN\u00101¨\u0006O"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifierNode;", "Landroidx/compose/ui/text/input/TransformedText;", "transformedText", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "state", "", "readOnly", "enabled", "isPassword", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "<init>", "(Landroidx/compose/ui/text/input/TransformedText;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/LegacyTextFieldState;ZZZLandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/focus/FocusRequester;)V", "create", "()Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifierNode;", "node", "Ld6/s;", "update", "(Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1", "()Landroidx/compose/ui/text/input/TransformedText;", "component2", "()Landroidx/compose/ui/text/input/TextFieldValue;", "component3", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "component4", "()Z", "component5", "component6", "component7", "()Landroidx/compose/ui/text/input/OffsetMapping;", "component8", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "component9", "()Landroidx/compose/ui/text/input/ImeOptions;", "component10", "()Landroidx/compose/ui/focus/FocusRequester;", "copy", "(Landroidx/compose/ui/text/input/TransformedText;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/LegacyTextFieldState;ZZZLandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/focus/FocusRequester;)Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/text/input/TransformedText;", "getTransformedText", "Landroidx/compose/ui/text/input/TextFieldValue;", "getValue", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "getState", "Z", "getReadOnly", "getEnabled", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getManager", "Landroidx/compose/ui/text/input/ImeOptions;", "getImeOptions", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class CoreTextFieldSemanticsModifier extends ModifierNodeElement<CoreTextFieldSemanticsModifierNode> {
    public static final int $stable = 0;
    private final boolean enabled;

    @NotNull
    private final FocusRequester focusRequester;

    @NotNull
    private final ImeOptions imeOptions;
    private final boolean isPassword;

    @NotNull
    private final TextFieldSelectionManager manager;

    @NotNull
    private final OffsetMapping offsetMapping;
    private final boolean readOnly;

    @NotNull
    private final LegacyTextFieldState state;

    @NotNull
    private final TransformedText transformedText;

    @NotNull
    private final TextFieldValue value;

    public CoreTextFieldSemanticsModifier(@NotNull TransformedText transformedText, @NotNull TextFieldValue textFieldValue, @NotNull LegacyTextFieldState legacyTextFieldState, boolean z8, boolean z9, boolean z10, @NotNull OffsetMapping offsetMapping, @NotNull TextFieldSelectionManager textFieldSelectionManager, @NotNull ImeOptions imeOptions, @NotNull FocusRequester focusRequester) {
        this.transformedText = transformedText;
        this.value = textFieldValue;
        this.state = legacyTextFieldState;
        this.readOnly = z8;
        this.enabled = z9;
        this.isPassword = z10;
        this.offsetMapping = offsetMapping;
        this.manager = textFieldSelectionManager;
        this.imeOptions = imeOptions;
        this.focusRequester = focusRequester;
    }

    public static /* synthetic */ CoreTextFieldSemanticsModifier copy$default(CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier, TransformedText transformedText, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, boolean z8, boolean z9, boolean z10, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, FocusRequester focusRequester, int i, Object obj) {
        if ((i & 1) != 0) {
            transformedText = coreTextFieldSemanticsModifier.transformedText;
        }
        if ((i & 2) != 0) {
            textFieldValue = coreTextFieldSemanticsModifier.value;
        }
        if ((i & 4) != 0) {
            legacyTextFieldState = coreTextFieldSemanticsModifier.state;
        }
        if ((i & 8) != 0) {
            z8 = coreTextFieldSemanticsModifier.readOnly;
        }
        if ((i & 16) != 0) {
            z9 = coreTextFieldSemanticsModifier.enabled;
        }
        if ((i & 32) != 0) {
            z10 = coreTextFieldSemanticsModifier.isPassword;
        }
        if ((i & 64) != 0) {
            offsetMapping = coreTextFieldSemanticsModifier.offsetMapping;
        }
        if ((i & 128) != 0) {
            textFieldSelectionManager = coreTextFieldSemanticsModifier.manager;
        }
        if ((i & 256) != 0) {
            imeOptions = coreTextFieldSemanticsModifier.imeOptions;
        }
        if ((i & 512) != 0) {
            focusRequester = coreTextFieldSemanticsModifier.focusRequester;
        }
        ImeOptions imeOptions2 = imeOptions;
        FocusRequester focusRequester2 = focusRequester;
        OffsetMapping offsetMapping2 = offsetMapping;
        TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
        boolean z11 = z9;
        boolean z12 = z10;
        return coreTextFieldSemanticsModifier.copy(transformedText, textFieldValue, legacyTextFieldState, z8, z11, z12, offsetMapping2, textFieldSelectionManager2, imeOptions2, focusRequester2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TransformedText getTransformedText() {
        return this.transformedText;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextFieldValue getValue() {
        return this.value;
    }

    @NotNull
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

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final TextFieldSelectionManager getManager() {
        return this.manager;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final ImeOptions getImeOptions() {
        return this.imeOptions;
    }

    @NotNull
    public final CoreTextFieldSemanticsModifier copy(@NotNull TransformedText transformedText, @NotNull TextFieldValue value, @NotNull LegacyTextFieldState state, boolean readOnly, boolean enabled, boolean isPassword, @NotNull OffsetMapping offsetMapping, @NotNull TextFieldSelectionManager manager, @NotNull ImeOptions imeOptions, @NotNull FocusRequester focusRequester) {
        return new CoreTextFieldSemanticsModifier(transformedText, value, state, readOnly, enabled, isPassword, offsetMapping, manager, imeOptions, focusRequester);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoreTextFieldSemanticsModifier)) {
            return false;
        }
        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = (CoreTextFieldSemanticsModifier) other;
        return AbstractC5830k.m5325b(this.transformedText, coreTextFieldSemanticsModifier.transformedText) && AbstractC5830k.m5325b(this.value, coreTextFieldSemanticsModifier.value) && AbstractC5830k.m5325b(this.state, coreTextFieldSemanticsModifier.state) && this.readOnly == coreTextFieldSemanticsModifier.readOnly && this.enabled == coreTextFieldSemanticsModifier.enabled && this.isPassword == coreTextFieldSemanticsModifier.isPassword && AbstractC5830k.m5325b(this.offsetMapping, coreTextFieldSemanticsModifier.offsetMapping) && AbstractC5830k.m5325b(this.manager, coreTextFieldSemanticsModifier.manager) && AbstractC5830k.m5325b(this.imeOptions, coreTextFieldSemanticsModifier.imeOptions) && AbstractC5830k.m5325b(this.focusRequester, coreTextFieldSemanticsModifier.focusRequester);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    @NotNull
    public final ImeOptions getImeOptions() {
        return this.imeOptions;
    }

    @NotNull
    public final TextFieldSelectionManager getManager() {
        return this.manager;
    }

    @NotNull
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    @NotNull
    public final LegacyTextFieldState getState() {
        return this.state;
    }

    @NotNull
    public final TransformedText getTransformedText() {
        return this.transformedText;
    }

    @NotNull
    public final TextFieldValue getValue() {
        return this.value;
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public int hashCode() {
        return this.focusRequester.hashCode() + ((this.imeOptions.hashCode() + ((this.manager.hashCode() + ((this.offsetMapping.hashCode() + AbstractC0584a.m908i(this.isPassword, AbstractC0584a.m908i(this.enabled, AbstractC0584a.m908i(this.readOnly, (this.state.hashCode() + ((this.value.hashCode() + (this.transformedText.hashCode() * 31)) * 31)) * 31, 31), 31), 31)) * 31)) * 31)) * 31);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
    }

    public final boolean isPassword() {
        return this.isPassword;
    }

    @NotNull
    public String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.transformedText + ", value=" + this.value + ", state=" + this.state + ", readOnly=" + this.readOnly + ", enabled=" + this.enabled + ", isPassword=" + this.isPassword + ", offsetMapping=" + this.offsetMapping + ", manager=" + this.manager + ", imeOptions=" + this.imeOptions + ", focusRequester=" + this.focusRequester + ')';
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    @NotNull
    /* renamed from: create */
    public CoreTextFieldSemanticsModifierNode getNode() {
        return new CoreTextFieldSemanticsModifierNode(this.transformedText, this.value, this.state, this.readOnly, this.enabled, this.isPassword, this.offsetMapping, this.manager, this.imeOptions, this.focusRequester);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void update(@NotNull CoreTextFieldSemanticsModifierNode node) {
        node.updateNodeSemantics(this.transformedText, this.value, this.state, this.readOnly, this.enabled, this.isPassword, this.offsetMapping, this.manager, this.imeOptions, this.focusRequester);
    }
}
