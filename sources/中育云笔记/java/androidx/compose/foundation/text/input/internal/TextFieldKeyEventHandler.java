package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.collection.MutableLongSet;
import androidx.compose.foundation.text.DeadKeyCombiner;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyEventHelpers_androidKt;
import androidx.compose.foundation.text.KeyMapping;
import androidx.compose.foundation.text.KeyMapping_androidKt;
import androidx.compose.foundation.text.StringHelpers_jvmKt;
import androidx.compose.foundation.text.TextFieldKeyInput_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.p014ui.focus.FocusManager;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.input.key.KeyEventType;
import androidx.compose.p014ui.input.key.KeyEvent_androidKt;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.platform.SoftwareKeyboardController;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class TextFieldKeyEventHandler {
    public static final int $stable = 8;
    private MutableLongSet currentlyConsumedDownKeys;
    private final TextFieldPreparedSelectionState preparedSelectionState = new TextFieldPreparedSelectionState();
    private final DeadKeyCombiner deadKeyCombiner = new DeadKeyCombiner();
    private final KeyMapping keyMapping = KeyMapping_androidKt.getPlatformDefaultKeyMapping();

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

    private final float getVisibleTextLayoutHeight(TextLayoutState textLayoutState) {
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates == null) {
            return Float.NaN;
        }
        Rect rectLocalBoundingBoxOf$default = null;
        if (!textLayoutNodeCoordinates.isAttached()) {
            textLayoutNodeCoordinates = null;
        }
        if (textLayoutNodeCoordinates == null) {
            return Float.NaN;
        }
        LayoutCoordinates decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates();
        if (decoratorNodeCoordinates != null) {
            if (!decoratorNodeCoordinates.isAttached()) {
                decoratorNodeCoordinates = null;
            }
            if (decoratorNodeCoordinates != null) {
                rectLocalBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(decoratorNodeCoordinates, textLayoutNodeCoordinates, false, 2, null);
            }
        }
        if (rectLocalBoundingBoxOf$default != null) {
            return Float.intBitsToFloat((int) (rectLocalBoundingBoxOf$default.m30670getSizeNHjbRc() & 4294967295L));
        }
        return Float.NaN;
    }

    private final void preparedSelectionContext(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, boolean z10, InterfaceC9540l interfaceC9540l) {
        WedgeAffinity wedgeAffinity;
        TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(transformedTextFieldState, textLayoutState.getLayoutResult(), z10, getVisibleTextLayoutHeight(textLayoutState), this.preparedSelectionState);
        interfaceC9540l.invoke(textFieldPreparedSelection);
        if (!TextRange.m32959equalsimpl0(textFieldPreparedSelection.m28119getSelectiond9O1mEE(), textFieldPreparedSelection.getInitialValue().m27947getSelectiond9O1mEE())) {
            transformedTextFieldState.m28085selectCharsIn5zctL8(textFieldPreparedSelection.m28119getSelectiond9O1mEE());
        }
        if (textFieldPreparedSelection.getWedgeAffinity() == null || (wedgeAffinity = textFieldPreparedSelection.getWedgeAffinity()) == null) {
            return;
        }
        if (TextRange.m32960getCollapsedimpl(transformedTextFieldState.getUntransformedText().m27947getSelectiond9O1mEE())) {
            transformedTextFieldState.setSelectionWedgeAffinity(new SelectionWedgeAffinity(wedgeAffinity));
        } else {
            transformedTextFieldState.setSelectionWedgeAffinity(SelectionWedgeAffinity.copy$default(textFieldPreparedSelection.getInitialWedgeAffinity(), null, wedgeAffinity, 1, null));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: processKeyDownEvent-ZcWbMB8, reason: not valid java name */
    private final boolean m28055processKeyDownEventZcWbMB8(KeyEvent keyEvent, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, InterfaceC9540l interfaceC9540l, boolean z10, boolean z11, InterfaceC9529a interfaceC9529a) {
        WedgeAffinity wedgeAffinity;
        Integer numM27801consumeZmokQxo;
        boolean z12 = false;
        if (TextFieldKeyInput_androidKt.m27909isTypedEventZmokQxo(keyEvent) && (numM27801consumeZmokQxo = this.deadKeyCombiner.m27801consumeZmokQxo(keyEvent)) != null) {
            String string = StringHelpers_jvmKt.appendCodePointX(new StringBuilder(2), numM27801consumeZmokQxo.intValue()).toString();
            if (!z10) {
                return false;
            }
            TransformedTextFieldState.replaceSelectedText$default(transformedTextFieldState, string, true, null, !TextFieldKeyEventHandler_androidKt.m28057isFromSoftKeyboardZmokQxo(keyEvent), 4, null);
            this.preparedSelectionState.resetCachedX();
            return true;
        }
        KeyCommand keyCommandMo27803mapZmokQxo = this.keyMapping.mo27803mapZmokQxo(keyEvent);
        if (keyCommandMo27803mapZmokQxo != null && (!keyCommandMo27803mapZmokQxo.getEditsText() || z10)) {
            TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(transformedTextFieldState, textLayoutState.getLayoutResult(), TextFieldKeyEventHandler_androidKt.m28057isFromSoftKeyboardZmokQxo(keyEvent), getVisibleTextLayoutHeight(textLayoutState), this.preparedSelectionState);
            switch (WhenMappings.$EnumSwitchMapping$0[keyCommandMo27803mapZmokQxo.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    interfaceC9540l.invoke(keyCommandMo27803mapZmokQxo);
                    z12 = true;
                    break;
                case 4:
                    textFieldPreparedSelection.collapseLeftOr(new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler$processKeyDownEvent$1$1
                        @Override // p181hd.InterfaceC9540l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((TextFieldPreparedSelection) obj);
                            return C10786q.f26013a;
                        }

                        public final void invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                            textFieldPreparedSelection2.moveCursorLeftByChar();
                        }
                    });
                    z12 = true;
                    break;
                case 5:
                    textFieldPreparedSelection.collapseRightOr(new InterfaceC9540l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler$processKeyDownEvent$1$2
                        @Override // p181hd.InterfaceC9540l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((TextFieldPreparedSelection) obj);
                            return C10786q.f26013a;
                        }

                        public final void invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                            textFieldPreparedSelection2.moveCursorRightByChar();
                        }
                    });
                    z12 = true;
                    break;
                case 6:
                    textFieldPreparedSelection.moveCursorLeftByWord();
                    z12 = true;
                    break;
                case 7:
                    textFieldPreparedSelection.moveCursorRightByWord();
                    z12 = true;
                    break;
                case 8:
                    textFieldPreparedSelection.moveCursorPrevByParagraph();
                    z12 = true;
                    break;
                case 9:
                    textFieldPreparedSelection.moveCursorNextByParagraph();
                    z12 = true;
                    break;
                case 10:
                    textFieldPreparedSelection.moveCursorUpByLine();
                    z12 = true;
                    break;
                case 11:
                    textFieldPreparedSelection.moveCursorDownByLine();
                    z12 = true;
                    break;
                case 12:
                    textFieldPreparedSelection.moveCursorUpByPage();
                    z12 = true;
                    break;
                case 13:
                    textFieldPreparedSelection.moveCursorDownByPage();
                    z12 = true;
                    break;
                case 14:
                    textFieldPreparedSelection.moveCursorToLineStart();
                    z12 = true;
                    break;
                case 15:
                    textFieldPreparedSelection.moveCursorToLineEnd();
                    z12 = true;
                    break;
                case 16:
                    textFieldPreparedSelection.moveCursorToLineLeftSide();
                    z12 = true;
                    break;
                case 17:
                    textFieldPreparedSelection.moveCursorToLineRightSide();
                    z12 = true;
                    break;
                case 18:
                    textFieldPreparedSelection.moveCursorToHome();
                    z12 = true;
                    break;
                case 19:
                    textFieldPreparedSelection.moveCursorToEnd();
                    z12 = true;
                    break;
                case 20:
                    textFieldPreparedSelection.moveCursorPrevByChar().deleteMovement();
                    z12 = true;
                    break;
                case 21:
                    textFieldPreparedSelection.moveCursorNextByChar().deleteMovement();
                    z12 = true;
                    break;
                case 22:
                    textFieldPreparedSelection.moveCursorPrevByWord().deleteMovement();
                    z12 = true;
                    break;
                case 23:
                    textFieldPreparedSelection.moveCursorNextByWord().deleteMovement();
                    z12 = true;
                    break;
                case 24:
                    textFieldPreparedSelection.moveCursorToLineStart().deleteMovement();
                    z12 = true;
                    break;
                case 25:
                    textFieldPreparedSelection.moveCursorToLineEnd().deleteMovement();
                    z12 = true;
                    break;
                case 26:
                    if (z11) {
                        interfaceC9529a.invoke();
                    } else {
                        TransformedTextFieldState.replaceSelectedText$default(transformedTextFieldState, SignParameters.NEW_LINE, true, null, !TextFieldKeyEventHandler_androidKt.m28057isFromSoftKeyboardZmokQxo(keyEvent), 4, null);
                    }
                    z12 = true;
                    break;
                case 27:
                    if (!z11) {
                        TransformedTextFieldState.replaceSelectedText$default(transformedTextFieldState, "\t", true, null, !TextFieldKeyEventHandler_androidKt.m28057isFromSoftKeyboardZmokQxo(keyEvent), 4, null);
                        z12 = true;
                        break;
                    }
                    break;
                case 28:
                    textFieldPreparedSelection.selectAll();
                    z12 = true;
                    break;
                case 29:
                    textFieldPreparedSelection.moveCursorLeftByChar().selectMovement();
                    z12 = true;
                    break;
                case 30:
                    textFieldPreparedSelection.moveCursorRightByChar().selectMovement();
                    z12 = true;
                    break;
                case 31:
                    textFieldPreparedSelection.moveCursorLeftByWord().selectMovement();
                    z12 = true;
                    break;
                case 32:
                    textFieldPreparedSelection.moveCursorRightByWord().selectMovement();
                    z12 = true;
                    break;
                case 33:
                    textFieldPreparedSelection.moveCursorPrevByParagraph().selectMovement();
                    z12 = true;
                    break;
                case 34:
                    textFieldPreparedSelection.moveCursorNextByParagraph().selectMovement();
                    z12 = true;
                    break;
                case 35:
                    textFieldPreparedSelection.moveCursorToLineStart().selectMovement();
                    z12 = true;
                    break;
                case 36:
                    textFieldPreparedSelection.moveCursorToLineEnd().selectMovement();
                    z12 = true;
                    break;
                case 37:
                    textFieldPreparedSelection.moveCursorToLineLeftSide().selectMovement();
                    z12 = true;
                    break;
                case 38:
                    textFieldPreparedSelection.moveCursorToLineRightSide().selectMovement();
                    z12 = true;
                    break;
                case 39:
                    textFieldPreparedSelection.moveCursorUpByLine().selectMovement();
                    z12 = true;
                    break;
                case 40:
                    textFieldPreparedSelection.moveCursorDownByLine().selectMovement();
                    z12 = true;
                    break;
                case 41:
                    textFieldPreparedSelection.moveCursorUpByPage().selectMovement();
                    z12 = true;
                    break;
                case 42:
                    textFieldPreparedSelection.moveCursorDownByPage().selectMovement();
                    z12 = true;
                    break;
                case 43:
                    textFieldPreparedSelection.moveCursorToHome().selectMovement();
                    z12 = true;
                    break;
                case 44:
                    textFieldPreparedSelection.moveCursorToEnd().selectMovement();
                    z12 = true;
                    break;
                case 45:
                    textFieldPreparedSelection.deselect();
                    z12 = true;
                    break;
                case 46:
                    transformedTextFieldState.undo();
                    z12 = true;
                    break;
                case 47:
                    transformedTextFieldState.redo();
                    z12 = true;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    KeyEventHelpers_androidKt.showCharacterPalette();
                    z12 = true;
                    break;
                default:
                    z12 = true;
                    break;
            }
            if (!TextRange.m32959equalsimpl0(textFieldPreparedSelection.m28119getSelectiond9O1mEE(), textFieldPreparedSelection.getInitialValue().m27947getSelectiond9O1mEE())) {
                transformedTextFieldState.m28085selectCharsIn5zctL8(textFieldPreparedSelection.m28119getSelectiond9O1mEE());
            }
            if (textFieldPreparedSelection.getWedgeAffinity() != null && (wedgeAffinity = textFieldPreparedSelection.getWedgeAffinity()) != null) {
                if (TextRange.m32960getCollapsedimpl(transformedTextFieldState.getUntransformedText().m27947getSelectiond9O1mEE())) {
                    transformedTextFieldState.setSelectionWedgeAffinity(new SelectionWedgeAffinity(wedgeAffinity));
                    return z12;
                }
                transformedTextFieldState.setSelectionWedgeAffinity(SelectionWedgeAffinity.copy$default(textFieldPreparedSelection.getInitialWedgeAffinity(), null, wedgeAffinity, 1, null));
            }
        }
        return z12;
    }

    /* renamed from: onKeyEvent-CJ9ybgU */
    public boolean mo27973onKeyEventCJ9ybgU(KeyEvent keyEvent, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InterfaceC9540l interfaceC9540l, boolean z10, boolean z11, InterfaceC9529a interfaceC9529a) {
        long jM31959getKeyZmokQxo = KeyEvent_androidKt.m31959getKeyZmokQxo(keyEvent);
        int iM31960getTypeZmokQxo = KeyEvent_androidKt.m31960getTypeZmokQxo(keyEvent);
        KeyEventType.Companion companion = KeyEventType.Companion;
        if (KeyEventType.m31952equalsimpl0(iM31960getTypeZmokQxo, companion.m31957getKeyUpCS__XNY())) {
            MutableLongSet mutableLongSet = this.currentlyConsumedDownKeys;
            if (mutableLongSet == null || !mutableLongSet.contains(jM31959getKeyZmokQxo)) {
                return false;
            }
            MutableLongSet mutableLongSet2 = this.currentlyConsumedDownKeys;
            if (mutableLongSet2 != null) {
                mutableLongSet2.remove(jM31959getKeyZmokQxo);
            }
            return true;
        }
        if (KeyEventType.m31952equalsimpl0(KeyEvent_androidKt.m31960getTypeZmokQxo(keyEvent), companion.m31958getUnknownCS__XNY()) && !TextFieldKeyInput_androidKt.m27909isTypedEventZmokQxo(keyEvent)) {
            return false;
        }
        boolean zM28055processKeyDownEventZcWbMB8 = m28055processKeyDownEventZcWbMB8(keyEvent, transformedTextFieldState, textLayoutState, interfaceC9540l, z10, z11, interfaceC9529a);
        if (zM28055processKeyDownEventZcWbMB8) {
            MutableLongSet mutableLongSet3 = this.currentlyConsumedDownKeys;
            if (mutableLongSet3 == null) {
                mutableLongSet3 = new MutableLongSet(3);
                this.currentlyConsumedDownKeys = mutableLongSet3;
            }
            mutableLongSet3.plusAssign(jM31959getKeyZmokQxo);
        }
        return zM28055processKeyDownEventZcWbMB8;
    }

    /* renamed from: onPreKeyEvent-MyFupTE */
    public boolean mo27974onPreKeyEventMyFupTE(KeyEvent keyEvent, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController) {
        if (TextRange.m32960getCollapsedimpl(transformedTextFieldState.getVisualText().m27947getSelectiond9O1mEE()) || !KeyEventHelpers_androidKt.m27802cancelsTextSelectionZmokQxo(keyEvent)) {
            return false;
        }
        textFieldSelectionState.deselect();
        return true;
    }
}
