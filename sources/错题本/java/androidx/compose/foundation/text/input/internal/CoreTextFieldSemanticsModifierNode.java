package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldDelegate;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p011ui.autofill.ContentDataType;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.node.DelegatableNodeKt;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.node.SemanticsModifierNode;
import androidx.compose.p011ui.node.SemanticsModifierNodeKt;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRangeKt;
import androidx.compose.p011ui.text.input.CommitTextCommand;
import androidx.compose.p011ui.text.input.DeleteAllCommand;
import androidx.compose.p011ui.text.input.FinishComposingTextCommand;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.compose.p011ui.text.input.ImeOptions;
import androidx.compose.p011ui.text.input.OffsetMapping;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.text.input.TransformedText;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6474f;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b1\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\u0019*\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ]\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010\u0016R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010/\u001a\u0004\b4\u00101\"\u0004\b5\u00103R\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010/\u001a\u0004\b\f\u00101\"\u0004\b6\u00103R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u00101¨\u0006M"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/text/input/TransformedText;", "transformedText", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "state", "", "readOnly", "enabled", "isPassword", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "<init>", "(Landroidx/compose/ui/text/input/TransformedText;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/LegacyTextFieldState;ZZZLandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/focus/FocusRequester;)V", "", "text", "Ld6/s;", "handleTextUpdateFromSemantics", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Ljava/lang/String;ZZ)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "updateNodeSemantics", "Landroidx/compose/ui/text/input/TransformedText;", "getTransformedText", "()Landroidx/compose/ui/text/input/TransformedText;", "setTransformedText", "(Landroidx/compose/ui/text/input/TransformedText;)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "getValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setValue", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "getState", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "setState", "(Landroidx/compose/foundation/text/LegacyTextFieldState;)V", "Z", "getReadOnly", "()Z", "setReadOnly", "(Z)V", "getEnabled", "setEnabled", "setPassword", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "setOffsetMapping", "(Landroidx/compose/ui/text/input/OffsetMapping;)V", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "setManager", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "Landroidx/compose/ui/text/input/ImeOptions;", "getImeOptions", "()Landroidx/compose/ui/text/input/ImeOptions;", "setImeOptions", "(Landroidx/compose/ui/text/input/ImeOptions;)V", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "getShouldMergeDescendantSemantics", "shouldMergeDescendantSemantics", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCoreTextFieldSemanticsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextFieldSemanticsModifier.kt\nandroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,337:1\n1#2:338\n*E\n"})
/* loaded from: classes.dex */
public final class CoreTextFieldSemanticsModifierNode extends DelegatingNode implements SemanticsModifierNode {
    public static final int $stable = 8;
    private boolean enabled;

    @NotNull
    private FocusRequester focusRequester;

    @NotNull
    private ImeOptions imeOptions;
    private boolean isPassword;

    @NotNull
    private TextFieldSelectionManager manager;

    @NotNull
    private OffsetMapping offsetMapping;
    private boolean readOnly;

    @NotNull
    private LegacyTextFieldState state;

    @NotNull
    private TransformedText transformedText;

    @NotNull
    private TextFieldValue value;

    public CoreTextFieldSemanticsModifierNode(@NotNull TransformedText transformedText, @NotNull TextFieldValue textFieldValue, @NotNull LegacyTextFieldState legacyTextFieldState, boolean z8, boolean z9, boolean z10, @NotNull OffsetMapping offsetMapping, @NotNull TextFieldSelectionManager textFieldSelectionManager, @NotNull ImeOptions imeOptions, @NotNull FocusRequester focusRequester) {
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
        textFieldSelectionManager.setRequestAutofillAction$foundation_release(new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m7789invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7789invoke() {
                DelegatableNodeKt.requestAutofill(CoreTextFieldSemanticsModifierNode.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTextUpdateFromSemantics(LegacyTextFieldState state, String text, boolean readOnly, boolean enabled) {
        C5443s c5443s;
        if (readOnly || !enabled) {
            return;
        }
        androidx.compose.p011ui.text.input.TextInputSession inputSession = state.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(AbstractC5806u.m5287z(new DeleteAllCommand(), new CommitTextCommand(text, 1)), state.getProcessor(), state.getOnValueChange(), inputSession);
            c5443s = C5443s.f8405a;
        } else {
            c5443s = null;
        }
        if (c5443s == null) {
            state.getOnValueChange().invoke(new TextFieldValue(text, TextRangeKt.TextRange(text.length()), (TextRange) null, 4, (AbstractC5824e) null));
        }
    }

    @Override // androidx.compose.p011ui.node.SemanticsModifierNode
    public void applySemantics(@NotNull final SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setInputText(semanticsPropertyReceiver, this.value.getAnnotatedString());
        SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, this.transformedText.getText());
        SemanticsPropertiesKt.m12552setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, this.value.getSelection());
        SemanticsPropertiesKt.setContentDataType(semanticsPropertyReceiver, ContentDataType.INSTANCE.getText());
        SemanticsPropertiesKt.onAutofillText$default(semanticsPropertyReceiver, null, new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
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
        boolean z8 = this.enabled && !this.readOnly;
        SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z8);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.2
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public final Boolean invoke(List<TextLayoutResult> list) {
                boolean z9;
                if (CoreTextFieldSemanticsModifierNode.this.getState().getLayoutResult() != null) {
                    TextLayoutResultProxy layoutResult = CoreTextFieldSemanticsModifierNode.this.getState().getLayoutResult();
                    AbstractC5830k.m5327d(layoutResult);
                    list.add(layoutResult.getValue());
                    z9 = true;
                } else {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            }
        }, 1, null);
        if (z8) {
            SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.3
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public final Boolean invoke(AnnotatedString annotatedString) {
                    CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = CoreTextFieldSemanticsModifierNode.this;
                    coreTextFieldSemanticsModifierNode.handleTextUpdateFromSemantics(coreTextFieldSemanticsModifierNode.getState(), annotatedString.getText(), CoreTextFieldSemanticsModifierNode.this.getReadOnly(), CoreTextFieldSemanticsModifierNode.this.getEnabled());
                    return Boolean.TRUE;
                }
            }, 1, null);
            SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public final Boolean invoke(AnnotatedString replacement) {
                    C5443s c5443s;
                    if (CoreTextFieldSemanticsModifierNode.this.getReadOnly() || !CoreTextFieldSemanticsModifierNode.this.getEnabled()) {
                        return Boolean.FALSE;
                    }
                    androidx.compose.p011ui.text.input.TextInputSession inputSession = CoreTextFieldSemanticsModifierNode.this.getState().getInputSession();
                    if (inputSession != null) {
                        CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = CoreTextFieldSemanticsModifierNode.this;
                        TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(AbstractC5806u.m5287z(new FinishComposingTextCommand(), new CommitTextCommand(replacement, 1)), coreTextFieldSemanticsModifierNode.getState().getProcessor(), coreTextFieldSemanticsModifierNode.getState().getOnValueChange(), inputSession);
                        c5443s = C5443s.f8405a;
                    } else {
                        c5443s = null;
                    }
                    if (c5443s == null) {
                        CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode2 = CoreTextFieldSemanticsModifierNode.this;
                        String text = coreTextFieldSemanticsModifierNode2.getValue().getText();
                        int iM12770getStartimpl = TextRange.m12770getStartimpl(coreTextFieldSemanticsModifierNode2.getValue().getSelection());
                        int iM12765getEndimpl = TextRange.m12765getEndimpl(coreTextFieldSemanticsModifierNode2.getValue().getSelection());
                        AbstractC5830k.m5330g(text, "<this>");
                        AbstractC5830k.m5330g(replacement, "replacement");
                        if (iM12765getEndimpl < iM12770getStartimpl) {
                            throw new IndexOutOfBoundsException("End index (" + iM12765getEndimpl + ") is less than start index (" + iM12770getStartimpl + ").");
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append((CharSequence) text, 0, iM12770getStartimpl);
                        sb.append((CharSequence) replacement);
                        sb.append((CharSequence) text, iM12765getEndimpl, text.length());
                        coreTextFieldSemanticsModifierNode2.getState().getOnValueChange().invoke(new TextFieldValue(sb.toString(), TextRangeKt.TextRange(replacement.length() + TextRange.m12770getStartimpl(coreTextFieldSemanticsModifierNode2.getValue().getSelection())), (TextRange) null, 4, (AbstractC5824e) null));
                    }
                    return Boolean.TRUE;
                }
            }, 1, null);
        }
        SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new InterfaceC6474f() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.5
            {
                super(3);
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Boolean) obj3).booleanValue());
            }

            public final Boolean invoke(int i, int i8, boolean z9) {
                if (!z9) {
                    i = CoreTextFieldSemanticsModifierNode.this.getOffsetMapping().transformedToOriginal(i);
                }
                if (!z9) {
                    i8 = CoreTextFieldSemanticsModifierNode.this.getOffsetMapping().transformedToOriginal(i8);
                }
                boolean z10 = false;
                if (CoreTextFieldSemanticsModifierNode.this.getEnabled() && (i != TextRange.m12770getStartimpl(CoreTextFieldSemanticsModifierNode.this.getValue().getSelection()) || i8 != TextRange.m12765getEndimpl(CoreTextFieldSemanticsModifierNode.this.getValue().getSelection()))) {
                    if (Math.min(i, i8) < 0 || Math.max(i, i8) > CoreTextFieldSemanticsModifierNode.this.getValue().getAnnotatedString().length()) {
                        CoreTextFieldSemanticsModifierNode.this.getManager().exitSelectionMode$foundation_release();
                    } else {
                        if (z9 || i == i8) {
                            CoreTextFieldSemanticsModifierNode.this.getManager().exitSelectionMode$foundation_release();
                        } else {
                            TextFieldSelectionManager.enterSelectionMode$foundation_release$default(CoreTextFieldSemanticsModifierNode.this.getManager(), false, 1, null);
                        }
                        CoreTextFieldSemanticsModifierNode.this.getState().getOnValueChange().invoke(new TextFieldValue(CoreTextFieldSemanticsModifierNode.this.getValue().getAnnotatedString(), TextRangeKt.TextRange(i, i8), (TextRange) null, 4, (AbstractC5824e) null));
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
            }
        }, 1, null);
        SemanticsPropertiesKt.m12548onImeAction9UiTYpY$default(semanticsPropertyReceiver, this.imeOptions.getImeAction(), null, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.6
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final Boolean invoke() {
                CoreTextFieldSemanticsModifierNode.this.getState().getOnImeActionPerformed().invoke(ImeAction.m12933boximpl(CoreTextFieldSemanticsModifierNode.this.getImeOptions().getImeAction()));
                return Boolean.TRUE;
            }
        }, 2, null);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.7
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final Boolean invoke() {
                CoreTextFieldKt.tapToFocus(CoreTextFieldSemanticsModifierNode.this.getState(), CoreTextFieldSemanticsModifierNode.this.getFocusRequester(), !CoreTextFieldSemanticsModifierNode.this.getReadOnly());
                return Boolean.TRUE;
            }
        }, 1, null);
        SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.8
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final Boolean invoke() {
                TextFieldSelectionManager.enterSelectionMode$foundation_release$default(CoreTextFieldSemanticsModifierNode.this.getManager(), false, 1, null);
                return Boolean.TRUE;
            }
        }, 1, null);
        if (!TextRange.m12764getCollapsedimpl(this.value.getSelection()) && !this.isPassword) {
            SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.9
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public final Boolean invoke() {
                    TextFieldSelectionManager.copy$foundation_release$default(CoreTextFieldSemanticsModifierNode.this.getManager(), false, 1, null);
                    return Boolean.TRUE;
                }
            }, 1, null);
            if (this.enabled && !this.readOnly) {
                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.10
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
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
        SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.applySemantics.11
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final Boolean invoke() {
                CoreTextFieldSemanticsModifierNode.this.getManager().paste$foundation_release();
                return Boolean.TRUE;
            }
        }, 1, null);
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

    @Override // androidx.compose.p011ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
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

    /* renamed from: isPassword, reason: from getter */
    public final boolean getIsPassword() {
        return this.isPassword;
    }

    public final void setEnabled(boolean z8) {
        this.enabled = z8;
    }

    public final void setFocusRequester(@NotNull FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final void setImeOptions(@NotNull ImeOptions imeOptions) {
        this.imeOptions = imeOptions;
    }

    public final void setManager(@NotNull TextFieldSelectionManager textFieldSelectionManager) {
        this.manager = textFieldSelectionManager;
    }

    public final void setOffsetMapping(@NotNull OffsetMapping offsetMapping) {
        this.offsetMapping = offsetMapping;
    }

    public final void setPassword(boolean z8) {
        this.isPassword = z8;
    }

    public final void setReadOnly(boolean z8) {
        this.readOnly = z8;
    }

    public final void setState(@NotNull LegacyTextFieldState legacyTextFieldState) {
        this.state = legacyTextFieldState;
    }

    public final void setTransformedText(@NotNull TransformedText transformedText) {
        this.transformedText = transformedText;
    }

    public final void setValue(@NotNull TextFieldValue textFieldValue) {
        this.value = textFieldValue;
    }

    public final void updateNodeSemantics(@NotNull TransformedText transformedText, @NotNull TextFieldValue value, @NotNull LegacyTextFieldState state, boolean readOnly, boolean enabled, boolean isPassword, @NotNull OffsetMapping offsetMapping, @NotNull TextFieldSelectionManager manager, @NotNull ImeOptions imeOptions, @NotNull FocusRequester focusRequester) {
        boolean z8 = this.enabled;
        boolean z9 = false;
        boolean z10 = z8 && !this.readOnly;
        boolean z11 = this.isPassword;
        ImeOptions imeOptions2 = this.imeOptions;
        TextFieldSelectionManager textFieldSelectionManager = this.manager;
        if (enabled && !readOnly) {
            z9 = true;
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
        if (enabled != z8 || z9 != z10 || !AbstractC5830k.m5325b(imeOptions, imeOptions2) || isPassword != z11 || !TextRange.m12764getCollapsedimpl(value.getSelection())) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (AbstractC5830k.m5325b(manager, textFieldSelectionManager)) {
            return;
        }
        manager.setRequestAutofillAction$foundation_release(new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode.updateNodeSemantics.1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m7790invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m7790invoke() {
                DelegatableNodeKt.requestAutofill(CoreTextFieldSemanticsModifierNode.this);
            }
        });
    }
}
