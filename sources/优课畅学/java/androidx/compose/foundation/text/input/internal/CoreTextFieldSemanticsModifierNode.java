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
import androidx.compose.p013ui.text.input.FinishComposingTextCommand;
import androidx.compose.p013ui.text.input.ImeAction;
import androidx.compose.p013ui.text.input.ImeOptions;
import androidx.compose.p013ui.text.input.OffsetMapping;
import androidx.compose.p013ui.text.input.TextFieldValue;
import androidx.compose.p013ui.text.input.TransformedText;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8661c0;
import p123h7.C8736p;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10575q;

@StabilityInferred(parameters = 0)
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

    public CoreTextFieldSemanticsModifierNode(TransformedText transformedText, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, boolean z10, boolean z11, boolean z12, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, FocusRequester focusRequester) {
        this.transformedText = transformedText;
        this.value = textFieldValue;
        this.state = legacyTextFieldState;
        this.readOnly = z10;
        this.enabled = z11;
        this.isPassword = z12;
        this.offsetMapping = offsetMapping;
        this.manager = textFieldSelectionManager;
        this.imeOptions = imeOptions;
        this.focusRequester = focusRequester;
        textFieldSelectionManager.setRequestAutofillAction$foundation_release(new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m21383invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m21383invoke() {
                DelegatableNodeKt.requestAutofill(CoreTextFieldSemanticsModifierNode.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTextUpdateFromSemantics(LegacyTextFieldState legacyTextFieldState, String str, boolean z10, boolean z11) {
        C8736p c8736p;
        if (z10 || !z11) {
            return;
        }
        androidx.compose.p013ui.text.input.TextInputSession inputSession = legacyTextFieldState.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.Companion.onEditCommand$foundation_release(AbstractC8809v.m14774q(new DeleteAllCommand(), new CommitTextCommand(str, 1)), legacyTextFieldState.getProcessor(), legacyTextFieldState.getOnValueChange(), inputSession);
            c8736p = C8736p.f16368a;
        } else {
            c8736p = null;
        }
        if (c8736p == null) {
            legacyTextFieldState.getOnValueChange().invoke(new TextFieldValue(str, TextRangeKt.TextRange(str.length()), (TextRange) null, 4, (AbstractC9126n) null));
        }
    }

    @Override // androidx.compose.p013ui.node.SemanticsModifierNode
    public void applySemantics(final SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setInputText(semanticsPropertyReceiver, this.value.getAnnotatedString());
        SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, this.transformedText.getText());
        SemanticsPropertiesKt.m26146setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, this.value.m26612getSelectiond9O1mEE());
        SemanticsPropertiesKt.setContentDataType(semanticsPropertyReceiver, ContentDataType.Companion.getText());
        SemanticsPropertiesKt.onAutofillText$default(semanticsPropertyReceiver, null, new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
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
        boolean z10 = this.enabled && !this.readOnly;
        SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z10);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.2
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final Boolean invoke(List<TextLayoutResult> list) {
                boolean z11;
                if (CoreTextFieldSemanticsModifierNode.this.getState().getLayoutResult() != null) {
                    TextLayoutResultProxy layoutResult = CoreTextFieldSemanticsModifierNode.this.getState().getLayoutResult();
                    AbstractC9133u.m16130d(layoutResult);
                    list.add(layoutResult.getValue());
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            }
        }, 1, null);
        if (z10) {
            SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.3
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public final Boolean invoke(AnnotatedString annotatedString) {
                    CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = CoreTextFieldSemanticsModifierNode.this;
                    coreTextFieldSemanticsModifierNode.handleTextUpdateFromSemantics(coreTextFieldSemanticsModifierNode.getState(), annotatedString.getText(), CoreTextFieldSemanticsModifierNode.this.getReadOnly(), CoreTextFieldSemanticsModifierNode.this.getEnabled());
                    return Boolean.TRUE;
                }
            }, 1, null);
            SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new InterfaceC10570l() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public final Boolean invoke(AnnotatedString annotatedString) {
                    C8736p c8736p;
                    if (CoreTextFieldSemanticsModifierNode.this.getReadOnly() || !CoreTextFieldSemanticsModifierNode.this.getEnabled()) {
                        return Boolean.FALSE;
                    }
                    androidx.compose.p013ui.text.input.TextInputSession inputSession = CoreTextFieldSemanticsModifierNode.this.getState().getInputSession();
                    if (inputSession != null) {
                        CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = CoreTextFieldSemanticsModifierNode.this;
                        TextFieldDelegate.Companion.onEditCommand$foundation_release(AbstractC8809v.m14774q(new FinishComposingTextCommand(), new CommitTextCommand(annotatedString, 1)), coreTextFieldSemanticsModifierNode.getState().getProcessor(), coreTextFieldSemanticsModifierNode.getState().getOnValueChange(), inputSession);
                        c8736p = C8736p.f16368a;
                    } else {
                        c8736p = null;
                    }
                    if (c8736p == null) {
                        CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode2 = CoreTextFieldSemanticsModifierNode.this;
                        coreTextFieldSemanticsModifierNode2.getState().getOnValueChange().invoke(new TextFieldValue(AbstractC8661c0.m13952C0(coreTextFieldSemanticsModifierNode2.getValue().getText(), TextRange.m26364getStartimpl(coreTextFieldSemanticsModifierNode2.getValue().m26612getSelectiond9O1mEE()), TextRange.m26359getEndimpl(coreTextFieldSemanticsModifierNode2.getValue().m26612getSelectiond9O1mEE()), annotatedString).toString(), TextRangeKt.TextRange(TextRange.m26364getStartimpl(coreTextFieldSemanticsModifierNode2.getValue().m26612getSelectiond9O1mEE()) + annotatedString.length()), (TextRange) null, 4, (AbstractC9126n) null));
                    }
                    return Boolean.TRUE;
                }
            }, 1, null);
        }
        SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new InterfaceC10575q() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.5
            {
                super(3);
            }

            @Override // p300x7.InterfaceC10575q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue());
            }

            public final Boolean invoke(int i10, int i11, boolean z11) {
                if (!z11) {
                    i10 = CoreTextFieldSemanticsModifierNode.this.getOffsetMapping().transformedToOriginal(i10);
                }
                if (!z11) {
                    i11 = CoreTextFieldSemanticsModifierNode.this.getOffsetMapping().transformedToOriginal(i11);
                }
                boolean z12 = false;
                if (CoreTextFieldSemanticsModifierNode.this.getEnabled() && (i10 != TextRange.m26364getStartimpl(CoreTextFieldSemanticsModifierNode.this.getValue().m26612getSelectiond9O1mEE()) || i11 != TextRange.m26359getEndimpl(CoreTextFieldSemanticsModifierNode.this.getValue().m26612getSelectiond9O1mEE()))) {
                    if (Math.min(i10, i11) < 0 || Math.max(i10, i11) > CoreTextFieldSemanticsModifierNode.this.getValue().getAnnotatedString().length()) {
                        CoreTextFieldSemanticsModifierNode.this.getManager().exitSelectionMode$foundation_release();
                    } else {
                        if (z11 || i10 == i11) {
                            CoreTextFieldSemanticsModifierNode.this.getManager().exitSelectionMode$foundation_release();
                        } else {
                            TextFieldSelectionManager.enterSelectionMode$foundation_release$default(CoreTextFieldSemanticsModifierNode.this.getManager(), false, 1, null);
                        }
                        CoreTextFieldSemanticsModifierNode.this.getState().getOnValueChange().invoke(new TextFieldValue(CoreTextFieldSemanticsModifierNode.this.getValue().getAnnotatedString(), TextRangeKt.TextRange(i10, i11), (TextRange) null, 4, (AbstractC9126n) null));
                        z12 = true;
                    }
                }
                return Boolean.valueOf(z12);
            }
        }, 1, null);
        SemanticsPropertiesKt.m26142onImeAction9UiTYpY$default(semanticsPropertyReceiver, this.imeOptions.m26559getImeActioneUduSuo(), null, new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.6
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Boolean invoke() {
                CoreTextFieldSemanticsModifierNode.this.getState().getOnImeActionPerformed().invoke(ImeAction.m26527boximpl(CoreTextFieldSemanticsModifierNode.this.getImeOptions().m26559getImeActioneUduSuo()));
                return Boolean.TRUE;
            }
        }, 2, null);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.7
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Boolean invoke() {
                CoreTextFieldKt.tapToFocus(CoreTextFieldSemanticsModifierNode.this.getState(), CoreTextFieldSemanticsModifierNode.this.getFocusRequester(), !CoreTextFieldSemanticsModifierNode.this.getReadOnly());
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.8
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Boolean invoke() {
                TextFieldSelectionManager.enterSelectionMode$foundation_release$default(CoreTextFieldSemanticsModifierNode.this.getManager(), false, 1, null);
                return Boolean.TRUE;
            }
        }, 1, null);
        if (!TextRange.m26358getCollapsedimpl(this.value.m26612getSelectiond9O1mEE()) && !this.isPassword) {
            SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.9
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public final Boolean invoke() {
                    TextFieldSelectionManager.copy$foundation_release$default(CoreTextFieldSemanticsModifierNode.this.getManager(), false, 1, null);
                    return Boolean.TRUE;
                }
            }, 1, null);
            if (this.enabled && !this.readOnly) {
                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.10
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
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
        SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.11
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
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

    public final boolean isPassword() {
        return this.isPassword;
    }

    public final void setEnabled(boolean z10) {
        this.enabled = z10;
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

    public final void setPassword(boolean z10) {
        this.isPassword = z10;
    }

    public final void setReadOnly(boolean z10) {
        this.readOnly = z10;
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

    public final void updateNodeSemantics(TransformedText transformedText, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, boolean z10, boolean z11, boolean z12, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, FocusRequester focusRequester) {
        boolean z13 = this.enabled;
        boolean z14 = false;
        boolean z15 = z13 && !this.readOnly;
        boolean z16 = this.isPassword;
        ImeOptions imeOptions2 = this.imeOptions;
        TextFieldSelectionManager textFieldSelectionManager2 = this.manager;
        if (z11 && !z10) {
            z14 = true;
        }
        this.transformedText = transformedText;
        this.value = textFieldValue;
        this.state = legacyTextFieldState;
        this.readOnly = z10;
        this.enabled = z11;
        this.offsetMapping = offsetMapping;
        this.manager = textFieldSelectionManager;
        this.imeOptions = imeOptions;
        this.focusRequester = focusRequester;
        if (z11 != z13 || z14 != z15 || !AbstractC9133u.m16128b(imeOptions, imeOptions2) || z12 != z16 || !TextRange.m26358getCollapsedimpl(textFieldValue.m26612getSelectiond9O1mEE())) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (AbstractC9133u.m16128b(textFieldSelectionManager, textFieldSelectionManager2)) {
            return;
        }
        textFieldSelectionManager.setRequestAutofillAction$foundation_release(new InterfaceC10559a() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.updateNodeSemantics.1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m21384invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m21384invoke() {
                DelegatableNodeKt.requestAutofill(CoreTextFieldSemanticsModifierNode.this);
            }
        });
    }
}
