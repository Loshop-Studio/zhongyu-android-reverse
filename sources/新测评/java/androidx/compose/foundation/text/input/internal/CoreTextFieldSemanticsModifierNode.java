package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldDelegate;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p013ui.autofill.ContentDataType;
import androidx.compose.p013ui.focus.FocusRequester;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.DelegatingNode;
import androidx.compose.p013ui.node.SemanticsModifierNode;
import androidx.compose.p013ui.node.SemanticsModifierNodeKt;
import androidx.compose.p013ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import androidx.compose.p013ui.text.input.CommitTextCommand;
import androidx.compose.p013ui.text.input.DeleteAllCommand;
import androidx.compose.p013ui.text.input.EditCommand;
import androidx.compose.p013ui.text.input.FinishComposingTextCommand;
import androidx.compose.p013ui.text.input.ImeAction;
import androidx.compose.p013ui.text.input.ImeOptions;
import androidx.compose.p013ui.text.input.OffsetMapping;
import androidx.compose.p013ui.text.input.TextFieldValue;
import androidx.compose.p013ui.text.input.TransformedText;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BU\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J(\u0010;\u001a\u00020<2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010=\u001a\u00020>2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002JV\u0010?\u001a\u00020<2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\f\u0010@\u001a\u00020<*\u00020AH\u0016R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0017\"\u0004\b\"\u0010\u0019R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0017\"\u0004\b,\u0010\u0019R\u0014\u0010-\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006B"}, m13558d2 = {"Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "transformedText", "Landroidx/compose/ui/text/input/TransformedText;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "state", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "readOnly", "", "enabled", "isPassword", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "(Landroidx/compose/ui/text/input/TransformedText;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/LegacyTextFieldState;ZZZLandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/focus/FocusRequester;)V", "getEnabled", "()Z", "setEnabled", "(Z)V", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "getImeOptions", "()Landroidx/compose/ui/text/input/ImeOptions;", "setImeOptions", "(Landroidx/compose/ui/text/input/ImeOptions;)V", "setPassword", "getManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "setManager", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "setOffsetMapping", "(Landroidx/compose/ui/text/input/OffsetMapping;)V", "getReadOnly", "setReadOnly", "shouldMergeDescendantSemantics", "getShouldMergeDescendantSemantics", "getState", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "setState", "(Landroidx/compose/foundation/text/LegacyTextFieldState;)V", "getTransformedText", "()Landroidx/compose/ui/text/input/TransformedText;", "setTransformedText", "(Landroidx/compose/ui/text/input/TransformedText;)V", "getValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setValue", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "handleTextUpdateFromSemantics", "", "text", "", "updateNodeSemantics", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nCoreTextFieldSemanticsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextFieldSemanticsModifier.kt\nandroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,337:1\n1#2:338\n*E\n"})
/* loaded from: classes.dex */
public final class CoreTextFieldSemanticsModifierNode extends DelegatingNode implements SemanticsModifierNode {
    public static final int $stable = 8;
    private boolean enabled;
    private FocusRequester focusRequester;
    private ImeOptions imeOptions;
    private boolean isPassword;
    private TextFieldSelectionManager manager;
    private OffsetMapping offsetMapping;
    private boolean readOnly;
    private LegacyTextFieldState state;
    private TransformedText transformedText;
    private TextFieldValue value;

    public CoreTextFieldSemanticsModifierNode(TransformedText transformedText, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, boolean z9, boolean z10, boolean z11, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, FocusRequester focusRequester) {
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
        textFieldSelectionManager.setRequestAutofillAction$foundation_release(new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                DelegatableNodeKt.requestAutofill(CoreTextFieldSemanticsModifierNode.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTextUpdateFromSemantics(LegacyTextFieldState state, String text, boolean readOnly, boolean enabled) {
        Unit unit;
        if (readOnly || !enabled) {
            return;
        }
        androidx.compose.p013ui.text.input.TextInputSession inputSession = state.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new DeleteAllCommand(), new CommitTextCommand(text, 1)}), state.getProcessor(), state.getOnValueChange(), inputSession);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            state.getOnValueChange().invoke(new TextFieldValue(text, TextRangeKt.TextRange(text.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
        }
    }

    @Override // androidx.compose.p013ui.node.SemanticsModifierNode
    public void applySemantics(final SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setInputText(semanticsPropertyReceiver, this.value.getText());
        SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, this.transformedText.getText());
        SemanticsPropertiesKt.m22811setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, this.value.getSelection());
        SemanticsPropertiesKt.setContentDataType(semanticsPropertyReceiver, ContentDataType.INSTANCE.getText());
        SemanticsPropertiesKt.onAutofillText$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(AnnotatedString annotatedString) {
                CoreTextFieldSemanticsModifierNode.this.getState().setJustAutofilled(true);
                CoreTextFieldSemanticsModifierNode.this.getState().setAutofillHighlightOn(true);
                CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = CoreTextFieldSemanticsModifierNode.this;
                coreTextFieldSemanticsModifierNode.handleTextUpdateFromSemantics(coreTextFieldSemanticsModifierNode.getState(), annotatedString.getText(), CoreTextFieldSemanticsModifierNode.this.getReadOnly(), CoreTextFieldSemanticsModifierNode.this.getEnabled());
                return Boolean.TRUE;
            }
        }, 1, null);
        if (!this.enabled) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        if (this.isPassword) {
            SemanticsPropertiesKt.password(semanticsPropertyReceiver);
        }
        boolean z9 = this.enabled && !this.readOnly;
        SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z9);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(List<TextLayoutResult> list) {
                boolean z10;
                if (CoreTextFieldSemanticsModifierNode.this.getState().getLayoutResult() != null) {
                    TextLayoutResultProxy layoutResult = CoreTextFieldSemanticsModifierNode.this.getState().getLayoutResult();
                    Intrinsics.checkNotNull(layoutResult);
                    list.add(layoutResult.getValue());
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }, 1, null);
        if (z9) {
            SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(AnnotatedString annotatedString) {
                    CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = CoreTextFieldSemanticsModifierNode.this;
                    coreTextFieldSemanticsModifierNode.handleTextUpdateFromSemantics(coreTextFieldSemanticsModifierNode.getState(), annotatedString.getText(), CoreTextFieldSemanticsModifierNode.this.getReadOnly(), CoreTextFieldSemanticsModifierNode.this.getEnabled());
                    return Boolean.TRUE;
                }
            }, 1, null);
            SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(AnnotatedString annotatedString) {
                    Unit unit;
                    if (CoreTextFieldSemanticsModifierNode.this.getReadOnly() || !CoreTextFieldSemanticsModifierNode.this.getEnabled()) {
                        return Boolean.FALSE;
                    }
                    androidx.compose.p013ui.text.input.TextInputSession inputSession = CoreTextFieldSemanticsModifierNode.this.getState().getInputSession();
                    if (inputSession != null) {
                        CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = CoreTextFieldSemanticsModifierNode.this;
                        TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new FinishComposingTextCommand(), new CommitTextCommand(annotatedString, 1)}), coreTextFieldSemanticsModifierNode.getState().getProcessor(), coreTextFieldSemanticsModifierNode.getState().getOnValueChange(), inputSession);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode2 = CoreTextFieldSemanticsModifierNode.this;
                        coreTextFieldSemanticsModifierNode2.getState().getOnValueChange().invoke(new TextFieldValue(StringsKt.replaceRange((CharSequence) coreTextFieldSemanticsModifierNode2.getValue().getText(), TextRange.m23027getStartimpl(coreTextFieldSemanticsModifierNode2.getValue().getSelection()), TextRange.m23022getEndimpl(coreTextFieldSemanticsModifierNode2.getValue().getSelection()), (CharSequence) annotatedString).toString(), TextRangeKt.TextRange(TextRange.m23027getStartimpl(coreTextFieldSemanticsModifierNode2.getValue().getSelection()) + annotatedString.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                    }
                    return Boolean.TRUE;
                }
            }, 1, null);
        }
        SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.5
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
            }

            public final Boolean invoke(int i10, int i11, boolean z10) {
                if (!z10) {
                    i10 = CoreTextFieldSemanticsModifierNode.this.getOffsetMapping().transformedToOriginal(i10);
                }
                if (!z10) {
                    i11 = CoreTextFieldSemanticsModifierNode.this.getOffsetMapping().transformedToOriginal(i11);
                }
                boolean z11 = false;
                if (CoreTextFieldSemanticsModifierNode.this.getEnabled() && (i10 != TextRange.m23027getStartimpl(CoreTextFieldSemanticsModifierNode.this.getValue().getSelection()) || i11 != TextRange.m23022getEndimpl(CoreTextFieldSemanticsModifierNode.this.getValue().getSelection()))) {
                    if (Math.min(i10, i11) < 0 || Math.max(i10, i11) > CoreTextFieldSemanticsModifierNode.this.getValue().getText().length()) {
                        CoreTextFieldSemanticsModifierNode.this.getManager().exitSelectionMode$foundation_release();
                    } else {
                        if (z10 || i10 == i11) {
                            CoreTextFieldSemanticsModifierNode.this.getManager().exitSelectionMode$foundation_release();
                        } else {
                            TextFieldSelectionManager.enterSelectionMode$foundation_release$default(CoreTextFieldSemanticsModifierNode.this.getManager(), false, 1, null);
                        }
                        CoreTextFieldSemanticsModifierNode.this.getState().getOnValueChange().invoke(new TextFieldValue(CoreTextFieldSemanticsModifierNode.this.getValue().getText(), TextRangeKt.TextRange(i10, i11), (TextRange) null, 4, (DefaultConstructorMarker) null));
                        z11 = true;
                    }
                }
                return Boolean.valueOf(z11);
            }
        }, 1, null);
        SemanticsPropertiesKt.m22807onImeAction9UiTYpY$default(semanticsPropertyReceiver, this.imeOptions.getImeAction(), null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                CoreTextFieldSemanticsModifierNode.this.getState().getOnImeActionPerformed().invoke(ImeAction.m23190boximpl(CoreTextFieldSemanticsModifierNode.this.getImeOptions().getImeAction()));
                return Boolean.TRUE;
            }
        }, 2, null);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.7
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                CoreTextFieldKt.tapToFocus(CoreTextFieldSemanticsModifierNode.this.getState(), CoreTextFieldSemanticsModifierNode.this.getFocusRequester(), !CoreTextFieldSemanticsModifierNode.this.getReadOnly());
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.8
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                TextFieldSelectionManager.enterSelectionMode$foundation_release$default(CoreTextFieldSemanticsModifierNode.this.getManager(), false, 1, null);
                return Boolean.TRUE;
            }
        }, 1, null);
        if (!TextRange.m23021getCollapsedimpl(this.value.getSelection()) && !this.isPassword) {
            SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.9
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    TextFieldSelectionManager.copy$foundation_release$default(CoreTextFieldSemanticsModifierNode.this.getManager(), false, 1, null);
                    return Boolean.TRUE;
                }
            }, 1, null);
            if (this.enabled && !this.readOnly) {
                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.10
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        CoreTextFieldSemanticsModifierNode.this.getManager().cut$foundation_release();
                        return Boolean.TRUE;
                    }
                }, 1, null);
            }
        }
        if (!this.enabled || this.readOnly) {
            return;
        }
        SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.11
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                CoreTextFieldSemanticsModifierNode.this.getManager().paste$foundation_release();
                return Boolean.TRUE;
            }
        }, 1, null);
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

    @Override // androidx.compose.p013ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
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

    /* renamed from: isPassword, reason: from getter */
    public final boolean getIsPassword() {
        return this.isPassword;
    }

    public final void setEnabled(boolean z9) {
        this.enabled = z9;
    }

    public final void setFocusRequester(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final void setImeOptions(ImeOptions imeOptions) {
        this.imeOptions = imeOptions;
    }

    public final void setManager(TextFieldSelectionManager textFieldSelectionManager) {
        this.manager = textFieldSelectionManager;
    }

    public final void setOffsetMapping(OffsetMapping offsetMapping) {
        this.offsetMapping = offsetMapping;
    }

    public final void setPassword(boolean z9) {
        this.isPassword = z9;
    }

    public final void setReadOnly(boolean z9) {
        this.readOnly = z9;
    }

    public final void setState(LegacyTextFieldState legacyTextFieldState) {
        this.state = legacyTextFieldState;
    }

    public final void setTransformedText(TransformedText transformedText) {
        this.transformedText = transformedText;
    }

    public final void setValue(TextFieldValue textFieldValue) {
        this.value = textFieldValue;
    }

    public final void updateNodeSemantics(TransformedText transformedText, TextFieldValue value, LegacyTextFieldState state, boolean readOnly, boolean enabled, boolean isPassword, OffsetMapping offsetMapping, TextFieldSelectionManager manager, ImeOptions imeOptions, FocusRequester focusRequester) {
        boolean z9 = this.enabled;
        boolean z10 = false;
        boolean z11 = z9 && !this.readOnly;
        boolean z12 = this.isPassword;
        ImeOptions imeOptions2 = this.imeOptions;
        TextFieldSelectionManager textFieldSelectionManager = this.manager;
        if (enabled && !readOnly) {
            z10 = true;
        }
        this.transformedText = transformedText;
        this.value = value;
        this.state = state;
        this.readOnly = readOnly;
        this.enabled = enabled;
        this.offsetMapping = offsetMapping;
        this.manager = manager;
        this.imeOptions = imeOptions;
        this.focusRequester = focusRequester;
        if (enabled != z9 || z10 != z11 || !Intrinsics.areEqual(imeOptions, imeOptions2) || isPassword != z12 || !TextRange.m23021getCollapsedimpl(value.getSelection())) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (Intrinsics.areEqual(manager, textFieldSelectionManager)) {
            return;
        }
        manager.setRequestAutofillAction$foundation_release(new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.updateNodeSemantics.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                DelegatableNodeKt.requestAutofill(CoreTextFieldSemanticsModifierNode.this);
            }
        });
    }
}
