package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.p014ui.input.key.KeyEventType;
import androidx.compose.p014ui.input.key.KeyEvent_androidKt;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.input.CommitTextCommand;
import androidx.compose.p014ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.p014ui.text.input.EditCommand;
import androidx.compose.p014ui.text.input.EditProcessor;
import androidx.compose.p014ui.text.input.FinishComposingTextCommand;
import androidx.compose.p014ui.text.input.ImeAction;
import androidx.compose.p014ui.text.input.OffsetMapping;
import androidx.compose.p014ui.text.input.TextFieldValue;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$BooleanRef;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10976v;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextFieldKeyInput {
    public static final int $stable = 8;
    private final boolean editable;
    private final int imeAction;
    private final DeadKeyCombiner keyCombiner;
    private final KeyMapping keyMapping;
    private final OffsetMapping offsetMapping;
    private final InterfaceC9540l onValueChange;
    private final TextPreparedSelectionState preparedSelectionState;
    private final TextFieldSelectionManager selectionManager;
    private final boolean singleLine;
    private final LegacyTextFieldState state;
    private final UndoManager undoManager;
    private final TextFieldValue value;

    public /* synthetic */ TextFieldKeyInput(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z10, boolean z11, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, InterfaceC9540l interfaceC9540l, int i10, AbstractC9972n abstractC9972n) {
        this(legacyTextFieldState, textFieldSelectionManager, textFieldValue, z10, z11, textPreparedSelectionState, offsetMapping, undoManager, deadKeyCombiner, keyMapping, interfaceC9540l, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void apply(List<? extends EditCommand> list) {
        EditProcessor processor = this.state.getProcessor();
        List<? extends EditCommand> listM23925a1 = AbstractC10947g0.m23925a1(list);
        listM23925a1.add(0, new FinishComposingTextCommand());
        this.onValueChange.invoke(processor.apply(listM23925a1));
    }

    private final void commandExecutionContext(InterfaceC9540l interfaceC9540l) {
        TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(this.value, this.offsetMapping, this.state.getLayoutResult(), this.preparedSelectionState);
        interfaceC9540l.invoke(textFieldPreparedSelection);
        if (TextRange.m32959equalsimpl0(textFieldPreparedSelection.m28210getSelectiond9O1mEE(), this.value.m33214getSelectiond9O1mEE()) && AbstractC9979u.m20289b(textFieldPreparedSelection.getAnnotatedString(), this.value.getAnnotatedString())) {
            return;
        }
        this.onValueChange.invoke(textFieldPreparedSelection.getValue());
    }

    /* renamed from: typedCommand-ZmokQxo, reason: not valid java name */
    private final CommitTextCommand m27904typedCommandZmokQxo(KeyEvent keyEvent) {
        Integer numM27801consumeZmokQxo;
        if (TextFieldKeyInput_androidKt.m27909isTypedEventZmokQxo(keyEvent) && (numM27801consumeZmokQxo = this.keyCombiner.m27801consumeZmokQxo(keyEvent)) != null) {
            return new CommitTextCommand(StringHelpers_jvmKt.appendCodePointX(new StringBuilder(), numM27801consumeZmokQxo.intValue()).toString(), 1);
        }
        return null;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final TextPreparedSelectionState getPreparedSelectionState() {
        return this.preparedSelectionState;
    }

    public final TextFieldSelectionManager getSelectionManager() {
        return this.selectionManager;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public final LegacyTextFieldState getState() {
        return this.state;
    }

    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    public final TextFieldValue getValue() {
        return this.value;
    }

    /* renamed from: process-ZmokQxo, reason: not valid java name */
    public final boolean m27905processZmokQxo(KeyEvent keyEvent) {
        final KeyCommand keyCommandMo27803mapZmokQxo;
        CommitTextCommand commitTextCommandM27904typedCommandZmokQxo = m27904typedCommandZmokQxo(keyEvent);
        if (commitTextCommandM27904typedCommandZmokQxo != null) {
            if (!this.editable) {
                return false;
            }
            apply(commitTextCommandM27904typedCommandZmokQxo);
            this.preparedSelectionState.resetCachedX();
            return true;
        }
        if (!KeyEventType.m31952equalsimpl0(KeyEvent_androidKt.m31960getTypeZmokQxo(keyEvent), KeyEventType.Companion.m31956getKeyDownCS__XNY()) || (keyCommandMo27803mapZmokQxo = this.keyMapping.mo27803mapZmokQxo(keyEvent)) == null || (keyCommandMo27803mapZmokQxo.getEditsText() && !this.editable)) {
            return false;
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.f23398c = true;
        commandExecutionContext(new InterfaceC9540l() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2

            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[KeyCommand.values().length];
                    try {
                        iArr[KeyCommand.COPY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[KeyCommand.PASTE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[KeyCommand.CUT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[KeyCommand.LEFT_CHAR.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[KeyCommand.RIGHT_CHAR.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[KeyCommand.LEFT_WORD.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[KeyCommand.RIGHT_WORD.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[KeyCommand.PREV_PARAGRAPH.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[KeyCommand.NEXT_PARAGRAPH.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[KeyCommand.f1092UP.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[KeyCommand.DOWN.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[KeyCommand.PAGE_UP.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[KeyCommand.PAGE_DOWN.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[KeyCommand.LINE_START.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[KeyCommand.LINE_END.ordinal()] = 15;
                    } catch (NoSuchFieldError unused15) {
                    }
                    try {
                        iArr[KeyCommand.LINE_LEFT.ordinal()] = 16;
                    } catch (NoSuchFieldError unused16) {
                    }
                    try {
                        iArr[KeyCommand.LINE_RIGHT.ordinal()] = 17;
                    } catch (NoSuchFieldError unused17) {
                    }
                    try {
                        iArr[KeyCommand.HOME.ordinal()] = 18;
                    } catch (NoSuchFieldError unused18) {
                    }
                    try {
                        iArr[KeyCommand.END.ordinal()] = 19;
                    } catch (NoSuchFieldError unused19) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_PREV_CHAR.ordinal()] = 20;
                    } catch (NoSuchFieldError unused20) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_NEXT_CHAR.ordinal()] = 21;
                    } catch (NoSuchFieldError unused21) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_PREV_WORD.ordinal()] = 22;
                    } catch (NoSuchFieldError unused22) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_NEXT_WORD.ordinal()] = 23;
                    } catch (NoSuchFieldError unused23) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_FROM_LINE_START.ordinal()] = 24;
                    } catch (NoSuchFieldError unused24) {
                    }
                    try {
                        iArr[KeyCommand.DELETE_TO_LINE_END.ordinal()] = 25;
                    } catch (NoSuchFieldError unused25) {
                    }
                    try {
                        iArr[KeyCommand.NEW_LINE.ordinal()] = 26;
                    } catch (NoSuchFieldError unused26) {
                    }
                    try {
                        iArr[KeyCommand.TAB.ordinal()] = 27;
                    } catch (NoSuchFieldError unused27) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_ALL.ordinal()] = 28;
                    } catch (NoSuchFieldError unused28) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LEFT_CHAR.ordinal()] = 29;
                    } catch (NoSuchFieldError unused29) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_RIGHT_CHAR.ordinal()] = 30;
                    } catch (NoSuchFieldError unused30) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LEFT_WORD.ordinal()] = 31;
                    } catch (NoSuchFieldError unused31) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_RIGHT_WORD.ordinal()] = 32;
                    } catch (NoSuchFieldError unused32) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
                    } catch (NoSuchFieldError unused33) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
                    } catch (NoSuchFieldError unused34) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LINE_START.ordinal()] = 35;
                    } catch (NoSuchFieldError unused35) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LINE_END.ordinal()] = 36;
                    } catch (NoSuchFieldError unused36) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LINE_LEFT.ordinal()] = 37;
                    } catch (NoSuchFieldError unused37) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_LINE_RIGHT.ordinal()] = 38;
                    } catch (NoSuchFieldError unused38) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_UP.ordinal()] = 39;
                    } catch (NoSuchFieldError unused39) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_DOWN.ordinal()] = 40;
                    } catch (NoSuchFieldError unused40) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_PAGE_UP.ordinal()] = 41;
                    } catch (NoSuchFieldError unused41) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_PAGE_DOWN.ordinal()] = 42;
                    } catch (NoSuchFieldError unused42) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_HOME.ordinal()] = 43;
                    } catch (NoSuchFieldError unused43) {
                    }
                    try {
                        iArr[KeyCommand.SELECT_END.ordinal()] = 44;
                    } catch (NoSuchFieldError unused44) {
                    }
                    try {
                        iArr[KeyCommand.DESELECT.ordinal()] = 45;
                    } catch (NoSuchFieldError unused45) {
                    }
                    try {
                        iArr[KeyCommand.UNDO.ordinal()] = 46;
                    } catch (NoSuchFieldError unused46) {
                    }
                    try {
                        iArr[KeyCommand.REDO.ordinal()] = 47;
                    } catch (NoSuchFieldError unused47) {
                    }
                    try {
                        iArr[KeyCommand.CHARACTER_PALETTE.ordinal()] = 48;
                    } catch (NoSuchFieldError unused48) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldPreparedSelection) obj);
                return C10786q.f26013a;
            }

            public final void invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
                TextFieldValue textFieldValueUndo;
                TextFieldValue textFieldValueRedo;
                switch (WhenMappings.$EnumSwitchMapping$0[keyCommandMo27803mapZmokQxo.ordinal()]) {
                    case 1:
                        this.getSelectionManager().copy$foundation_release(false);
                        break;
                    case 2:
                        this.getSelectionManager().paste$foundation_release();
                        break;
                    case 3:
                        this.getSelectionManager().cut$foundation_release();
                        break;
                    case 4:
                        textFieldPreparedSelection.collapseLeftOr(new InterfaceC9540l() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.1
                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((TextFieldPreparedSelection) obj);
                                return C10786q.f26013a;
                            }

                            public final void invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                textFieldPreparedSelection2.moveCursorLeft();
                            }
                        });
                        break;
                    case 5:
                        textFieldPreparedSelection.collapseRightOr(new InterfaceC9540l() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.2
                            @Override // p181hd.InterfaceC9540l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((TextFieldPreparedSelection) obj);
                                return C10786q.f26013a;
                            }

                            public final void invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                textFieldPreparedSelection2.moveCursorRight();
                            }
                        });
                        break;
                    case 6:
                        textFieldPreparedSelection.moveCursorLeftByWord();
                        break;
                    case 7:
                        textFieldPreparedSelection.moveCursorRightByWord();
                        break;
                    case 8:
                        textFieldPreparedSelection.moveCursorPrevByParagraph();
                        break;
                    case 9:
                        textFieldPreparedSelection.moveCursorNextByParagraph();
                        break;
                    case 10:
                        textFieldPreparedSelection.moveCursorUpByLine();
                        break;
                    case 11:
                        textFieldPreparedSelection.moveCursorDownByLine();
                        break;
                    case 12:
                        textFieldPreparedSelection.moveCursorUpByPage();
                        break;
                    case 13:
                        textFieldPreparedSelection.moveCursorDownByPage();
                        break;
                    case 14:
                        textFieldPreparedSelection.moveCursorToLineStart();
                        break;
                    case 15:
                        textFieldPreparedSelection.moveCursorToLineEnd();
                        break;
                    case 16:
                        textFieldPreparedSelection.moveCursorToLineLeftSide();
                        break;
                    case 17:
                        textFieldPreparedSelection.moveCursorToLineRightSide();
                        break;
                    case 18:
                        textFieldPreparedSelection.moveCursorToHome();
                        break;
                    case 19:
                        textFieldPreparedSelection.moveCursorToEnd();
                        break;
                    case 20:
                        List<EditCommand> listDeleteIfSelectedOr = textFieldPreparedSelection.deleteIfSelectedOr(new InterfaceC9540l() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.3
                            @Override // p181hd.InterfaceC9540l
                            public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                return new DeleteSurroundingTextCommand(TextRange.m32961getEndimpl(textFieldPreparedSelection2.m28210getSelectiond9O1mEE()) - textFieldPreparedSelection2.getPrecedingCharacterIndex(), 0);
                            }
                        });
                        if (listDeleteIfSelectedOr != null) {
                            this.apply((List<? extends EditCommand>) listDeleteIfSelectedOr);
                            break;
                        }
                        break;
                    case 21:
                        List<EditCommand> listDeleteIfSelectedOr2 = textFieldPreparedSelection.deleteIfSelectedOr(new InterfaceC9540l() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.4
                            @Override // p181hd.InterfaceC9540l
                            public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                int nextCharacterIndex = textFieldPreparedSelection2.getNextCharacterIndex();
                                if (nextCharacterIndex != -1) {
                                    return new DeleteSurroundingTextCommand(0, nextCharacterIndex - TextRange.m32961getEndimpl(textFieldPreparedSelection2.m28210getSelectiond9O1mEE()));
                                }
                                return null;
                            }
                        });
                        if (listDeleteIfSelectedOr2 != null) {
                            this.apply((List<? extends EditCommand>) listDeleteIfSelectedOr2);
                            break;
                        }
                        break;
                    case 22:
                        List<EditCommand> listDeleteIfSelectedOr3 = textFieldPreparedSelection.deleteIfSelectedOr(new InterfaceC9540l() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.5
                            @Override // p181hd.InterfaceC9540l
                            public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                Integer previousWordOffset = textFieldPreparedSelection2.getPreviousWordOffset();
                                if (previousWordOffset == null) {
                                    return null;
                                }
                                return new DeleteSurroundingTextCommand(TextRange.m32961getEndimpl(textFieldPreparedSelection2.m28210getSelectiond9O1mEE()) - previousWordOffset.intValue(), 0);
                            }
                        });
                        if (listDeleteIfSelectedOr3 != null) {
                            this.apply((List<? extends EditCommand>) listDeleteIfSelectedOr3);
                            break;
                        }
                        break;
                    case 23:
                        List<EditCommand> listDeleteIfSelectedOr4 = textFieldPreparedSelection.deleteIfSelectedOr(new InterfaceC9540l() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.6
                            @Override // p181hd.InterfaceC9540l
                            public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                Integer nextWordOffset = textFieldPreparedSelection2.getNextWordOffset();
                                if (nextWordOffset != null) {
                                    return new DeleteSurroundingTextCommand(0, nextWordOffset.intValue() - TextRange.m32961getEndimpl(textFieldPreparedSelection2.m28210getSelectiond9O1mEE()));
                                }
                                return null;
                            }
                        });
                        if (listDeleteIfSelectedOr4 != null) {
                            this.apply((List<? extends EditCommand>) listDeleteIfSelectedOr4);
                            break;
                        }
                        break;
                    case 24:
                        List<EditCommand> listDeleteIfSelectedOr5 = textFieldPreparedSelection.deleteIfSelectedOr(new InterfaceC9540l() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.7
                            @Override // p181hd.InterfaceC9540l
                            public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                Integer lineStartByOffset = textFieldPreparedSelection2.getLineStartByOffset();
                                if (lineStartByOffset == null) {
                                    return null;
                                }
                                return new DeleteSurroundingTextCommand(TextRange.m32961getEndimpl(textFieldPreparedSelection2.m28210getSelectiond9O1mEE()) - lineStartByOffset.intValue(), 0);
                            }
                        });
                        if (listDeleteIfSelectedOr5 != null) {
                            this.apply((List<? extends EditCommand>) listDeleteIfSelectedOr5);
                            break;
                        }
                        break;
                    case 25:
                        List<EditCommand> listDeleteIfSelectedOr6 = textFieldPreparedSelection.deleteIfSelectedOr(new InterfaceC9540l() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.8
                            @Override // p181hd.InterfaceC9540l
                            public final EditCommand invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                                Integer lineEndByOffset = textFieldPreparedSelection2.getLineEndByOffset();
                                if (lineEndByOffset != null) {
                                    return new DeleteSurroundingTextCommand(0, lineEndByOffset.intValue() - TextRange.m32961getEndimpl(textFieldPreparedSelection2.m28210getSelectiond9O1mEE()));
                                }
                                return null;
                            }
                        });
                        if (listDeleteIfSelectedOr6 != null) {
                            this.apply((List<? extends EditCommand>) listDeleteIfSelectedOr6);
                            break;
                        }
                        break;
                    case 26:
                        if (!this.getSingleLine()) {
                            this.apply(new CommitTextCommand(SignParameters.NEW_LINE, 1));
                            break;
                        } else {
                            this.getState().getOnImeActionPerformed().invoke(ImeAction.m33129boximpl(this.imeAction));
                            break;
                        }
                    case 27:
                        if (!this.getSingleLine()) {
                            this.apply(new CommitTextCommand("\t", 1));
                            break;
                        } else {
                            ref$BooleanRef.f23398c = false;
                            break;
                        }
                    case 28:
                        textFieldPreparedSelection.selectAll();
                        break;
                    case 29:
                        textFieldPreparedSelection.moveCursorLeft().selectMovement();
                        break;
                    case 30:
                        textFieldPreparedSelection.moveCursorRight().selectMovement();
                        break;
                    case 31:
                        textFieldPreparedSelection.moveCursorLeftByWord().selectMovement();
                        break;
                    case 32:
                        textFieldPreparedSelection.moveCursorRightByWord().selectMovement();
                        break;
                    case 33:
                        textFieldPreparedSelection.moveCursorPrevByParagraph().selectMovement();
                        break;
                    case 34:
                        textFieldPreparedSelection.moveCursorNextByParagraph().selectMovement();
                        break;
                    case 35:
                        textFieldPreparedSelection.moveCursorToLineStart().selectMovement();
                        break;
                    case 36:
                        textFieldPreparedSelection.moveCursorToLineEnd().selectMovement();
                        break;
                    case 37:
                        textFieldPreparedSelection.moveCursorToLineLeftSide().selectMovement();
                        break;
                    case 38:
                        textFieldPreparedSelection.moveCursorToLineRightSide().selectMovement();
                        break;
                    case 39:
                        textFieldPreparedSelection.moveCursorUpByLine().selectMovement();
                        break;
                    case 40:
                        textFieldPreparedSelection.moveCursorDownByLine().selectMovement();
                        break;
                    case 41:
                        textFieldPreparedSelection.moveCursorUpByPage().selectMovement();
                        break;
                    case 42:
                        textFieldPreparedSelection.moveCursorDownByPage().selectMovement();
                        break;
                    case 43:
                        textFieldPreparedSelection.moveCursorToHome().selectMovement();
                        break;
                    case 44:
                        textFieldPreparedSelection.moveCursorToEnd().selectMovement();
                        break;
                    case 45:
                        textFieldPreparedSelection.deselect();
                        break;
                    case 46:
                        UndoManager undoManager = this.getUndoManager();
                        if (undoManager != null) {
                            undoManager.makeSnapshot(textFieldPreparedSelection.getValue());
                        }
                        UndoManager undoManager2 = this.getUndoManager();
                        if (undoManager2 != null && (textFieldValueUndo = undoManager2.undo()) != null) {
                            this.onValueChange.invoke(textFieldValueUndo);
                            break;
                        }
                        break;
                    case 47:
                        UndoManager undoManager3 = this.getUndoManager();
                        if (undoManager3 != null && (textFieldValueRedo = undoManager3.redo()) != null) {
                            this.onValueChange.invoke(textFieldValueRedo);
                            break;
                        }
                        break;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                        KeyEventHelpers_androidKt.showCharacterPalette();
                        break;
                }
            }
        });
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
        return ref$BooleanRef.f23398c;
    }

    private TextFieldKeyInput(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z10, boolean z11, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, InterfaceC9540l interfaceC9540l, int i10) {
        this.state = legacyTextFieldState;
        this.selectionManager = textFieldSelectionManager;
        this.value = textFieldValue;
        this.editable = z10;
        this.singleLine = z11;
        this.preparedSelectionState = textPreparedSelectionState;
        this.offsetMapping = offsetMapping;
        this.undoManager = undoManager;
        this.keyCombiner = deadKeyCombiner;
        this.keyMapping = keyMapping;
        this.onValueChange = interfaceC9540l;
        this.imeAction = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void apply(EditCommand editCommand) {
        apply(AbstractC10976v.m24126e(editCommand));
    }

    public /* synthetic */ TextFieldKeyInput(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z10, boolean z11, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, InterfaceC9540l interfaceC9540l, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(legacyTextFieldState, textFieldSelectionManager, (i11 & 4) != 0 ? new TextFieldValue((String) null, 0L, (TextRange) null, 7, (AbstractC9972n) null) : textFieldValue, (i11 & 8) != 0 ? true : z10, (i11 & 16) != 0 ? false : z11, textPreparedSelectionState, (i11 & 64) != 0 ? OffsetMapping.Companion.getIdentity() : offsetMapping, (i11 & 128) != 0 ? null : undoManager, deadKeyCombiner, (i11 & 512) != 0 ? KeyMapping_androidKt.getPlatformDefaultKeyMapping() : keyMapping, (i11 & 1024) != 0 ? new InterfaceC9540l() { // from class: androidx.compose.foundation.text.TextFieldKeyInput.1
            public final void invoke(TextFieldValue textFieldValue2) {
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TextFieldValue) obj);
                return C10786q.f26013a;
            }
        } : interfaceC9540l, i10, null);
    }
}
