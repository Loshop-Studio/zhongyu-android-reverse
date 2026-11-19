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
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.input.key.KeyEventType;
import androidx.compose.p011ui.input.key.KeyEvent_androidKt;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.platform.SoftwareKeyboardController;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JP\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013JA\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\f2\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00100\u0017¢\u0006\u0002\b\u0019H\u0082\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ:\u0010(\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'JX\u0010+\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00068"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "", "<init>", "()V", "Landroidx/compose/ui/input/key/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;", "clipboardKeyCommandsHandler", "", "editable", "singleLine", "Lkotlin/Function0;", "Ld6/s;", "onSubmit", "processKeyDownEvent-ZcWbMB8", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Lr6/c;ZZLr6/a;)Z", "processKeyDownEvent", "state", "isFromSoftKeyboard", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;", "Lkotlin/ExtensionFunctionType;", "block", "preparedSelectionContext", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;ZLr6/c;)V", "", "getVisibleTextLayoutHeight", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;)F", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "textFieldSelectionState", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "keyboardController", "onPreKeyEvent-MyFupTE", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Z", "onPreKeyEvent", "onKeyEvent-CJ9ybgU", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lr6/c;ZZLr6/a;)Z", "onKeyEvent", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;", "preparedSelectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;", "Landroidx/compose/foundation/text/DeadKeyCombiner;", "deadKeyCombiner", "Landroidx/compose/foundation/text/DeadKeyCombiner;", "Landroidx/compose/foundation/text/KeyMapping;", "keyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "Landroidx/collection/MutableLongSet;", "currentlyConsumedDownKeys", "Landroidx/collection/MutableLongSet;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextFieldKeyEventHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyEventHandler.kt\nandroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,294:1\n247#1,27:296\n1#2:295\n61#3:323\n70#4:324\n22#5:325\n*S KotlinDebug\n*F\n+ 1 TextFieldKeyEventHandler.kt\nandroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler\n*L\n160#1:296,27\n289#1:323\n289#1:324\n289#1:325\n*E\n"})
/* loaded from: classes.dex */
public abstract class TextFieldKeyEventHandler {
    public static final int $stable = 8;

    @Nullable
    private MutableLongSet currentlyConsumedDownKeys;

    @NotNull
    private final TextFieldPreparedSelectionState preparedSelectionState = new TextFieldPreparedSelectionState();

    @NotNull
    private final DeadKeyCombiner deadKeyCombiner = new DeadKeyCombiner();

    @NotNull
    private final KeyMapping keyMapping = KeyMapping_androidKt.getPlatformDefaultKeyMapping();

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
                iArr[KeyCommand.f757UP.ordinal()] = 10;
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
            return Float.intBitsToFloat((int) (rectLocalBoundingBoxOf$default.m10474getSizeNHjbRc() & 4294967295L));
        }
        return Float.NaN;
    }

    private final void preparedSelectionContext(TransformedTextFieldState state, TextLayoutState textLayoutState, boolean isFromSoftKeyboard, InterfaceC6471c block) {
        WedgeAffinity wedgeAffinity;
        TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(state, textLayoutState.getLayoutResult(), isFromSoftKeyboard, getVisibleTextLayoutHeight(textLayoutState), this.preparedSelectionState);
        block.invoke(textFieldPreparedSelection);
        if (!TextRange.m12763equalsimpl0(textFieldPreparedSelection.getSelection(), textFieldPreparedSelection.getInitialValue().getSelection())) {
            state.m7889selectCharsIn5zctL8(textFieldPreparedSelection.getSelection());
        }
        if (textFieldPreparedSelection.getWedgeAffinity() == null || (wedgeAffinity = textFieldPreparedSelection.getWedgeAffinity()) == null) {
            return;
        }
        if (TextRange.m12764getCollapsedimpl(state.getUntransformedText().getSelection())) {
            state.setSelectionWedgeAffinity(new SelectionWedgeAffinity(wedgeAffinity));
        } else {
            state.setSelectionWedgeAffinity(SelectionWedgeAffinity.copy$default(textFieldPreparedSelection.getInitialWedgeAffinity(), null, wedgeAffinity, 1, null));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: processKeyDownEvent-ZcWbMB8, reason: not valid java name */
    private final boolean m7859processKeyDownEventZcWbMB8(KeyEvent event, TransformedTextFieldState textFieldState, TextLayoutState textLayoutState, InterfaceC6471c clipboardKeyCommandsHandler, boolean editable, boolean singleLine, InterfaceC6469a onSubmit) {
        WedgeAffinity wedgeAffinity;
        Integer numM7605consumeZmokQxo;
        boolean z8 = false;
        if (TextFieldKeyInput_androidKt.m7713isTypedEventZmokQxo(event) && (numM7605consumeZmokQxo = this.deadKeyCombiner.m7605consumeZmokQxo(event)) != null) {
            String string = StringHelpers_jvmKt.appendCodePointX(new StringBuilder(2), numM7605consumeZmokQxo.intValue()).toString();
            if (!editable) {
                return false;
            }
            TransformedTextFieldState.replaceSelectedText$default(textFieldState, string, true, null, !TextFieldKeyEventHandler_androidKt.m7861isFromSoftKeyboardZmokQxo(event), 4, null);
            this.preparedSelectionState.resetCachedX();
            return true;
        }
        KeyCommand keyCommandMo7607mapZmokQxo = this.keyMapping.mo7607mapZmokQxo(event);
        if (keyCommandMo7607mapZmokQxo != null && (!keyCommandMo7607mapZmokQxo.getEditsText() || editable)) {
            TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(textFieldState, textLayoutState.getLayoutResult(), TextFieldKeyEventHandler_androidKt.m7861isFromSoftKeyboardZmokQxo(event), getVisibleTextLayoutHeight(textLayoutState), this.preparedSelectionState);
            switch (WhenMappings.$EnumSwitchMapping$0[keyCommandMo7607mapZmokQxo.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    clipboardKeyCommandsHandler.invoke(keyCommandMo7607mapZmokQxo);
                    z8 = true;
                    break;
                case 4:
                    textFieldPreparedSelection.collapseLeftOr(new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler$processKeyDownEvent$1$1
                        @Override // p152r6.InterfaceC6471c
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((TextFieldPreparedSelection) obj);
                            return C5443s.f8405a;
                        }

                        public final void invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                            textFieldPreparedSelection2.moveCursorLeftByChar();
                        }
                    });
                    z8 = true;
                    break;
                case 5:
                    textFieldPreparedSelection.collapseRightOr(new InterfaceC6471c() { // from class: androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler$processKeyDownEvent$1$2
                        @Override // p152r6.InterfaceC6471c
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((TextFieldPreparedSelection) obj);
                            return C5443s.f8405a;
                        }

                        public final void invoke(TextFieldPreparedSelection textFieldPreparedSelection2) {
                            textFieldPreparedSelection2.moveCursorRightByChar();
                        }
                    });
                    z8 = true;
                    break;
                case 6:
                    textFieldPreparedSelection.moveCursorLeftByWord();
                    z8 = true;
                    break;
                case 7:
                    textFieldPreparedSelection.moveCursorRightByWord();
                    z8 = true;
                    break;
                case 8:
                    textFieldPreparedSelection.moveCursorPrevByParagraph();
                    z8 = true;
                    break;
                case 9:
                    textFieldPreparedSelection.moveCursorNextByParagraph();
                    z8 = true;
                    break;
                case 10:
                    textFieldPreparedSelection.moveCursorUpByLine();
                    z8 = true;
                    break;
                case 11:
                    textFieldPreparedSelection.moveCursorDownByLine();
                    z8 = true;
                    break;
                case 12:
                    textFieldPreparedSelection.moveCursorUpByPage();
                    z8 = true;
                    break;
                case 13:
                    textFieldPreparedSelection.moveCursorDownByPage();
                    z8 = true;
                    break;
                case 14:
                    textFieldPreparedSelection.moveCursorToLineStart();
                    z8 = true;
                    break;
                case 15:
                    textFieldPreparedSelection.moveCursorToLineEnd();
                    z8 = true;
                    break;
                case 16:
                    textFieldPreparedSelection.moveCursorToLineLeftSide();
                    z8 = true;
                    break;
                case 17:
                    textFieldPreparedSelection.moveCursorToLineRightSide();
                    z8 = true;
                    break;
                case 18:
                    textFieldPreparedSelection.moveCursorToHome();
                    z8 = true;
                    break;
                case 19:
                    textFieldPreparedSelection.moveCursorToEnd();
                    z8 = true;
                    break;
                case 20:
                    textFieldPreparedSelection.moveCursorPrevByChar().deleteMovement();
                    z8 = true;
                    break;
                case 21:
                    textFieldPreparedSelection.moveCursorNextByChar().deleteMovement();
                    z8 = true;
                    break;
                case 22:
                    textFieldPreparedSelection.moveCursorPrevByWord().deleteMovement();
                    z8 = true;
                    break;
                case 23:
                    textFieldPreparedSelection.moveCursorNextByWord().deleteMovement();
                    z8 = true;
                    break;
                case 24:
                    textFieldPreparedSelection.moveCursorToLineStart().deleteMovement();
                    z8 = true;
                    break;
                case 25:
                    textFieldPreparedSelection.moveCursorToLineEnd().deleteMovement();
                    z8 = true;
                    break;
                case 26:
                    if (singleLine) {
                        onSubmit.invoke();
                    } else {
                        TransformedTextFieldState.replaceSelectedText$default(textFieldState, SignParameters.NEW_LINE, true, null, !TextFieldKeyEventHandler_androidKt.m7861isFromSoftKeyboardZmokQxo(event), 4, null);
                    }
                    z8 = true;
                    break;
                case 27:
                    if (!singleLine) {
                        TransformedTextFieldState.replaceSelectedText$default(textFieldState, "\t", true, null, !TextFieldKeyEventHandler_androidKt.m7861isFromSoftKeyboardZmokQxo(event), 4, null);
                        z8 = true;
                        break;
                    }
                    break;
                case 28:
                    textFieldPreparedSelection.selectAll();
                    z8 = true;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    textFieldPreparedSelection.moveCursorLeftByChar().selectMovement();
                    z8 = true;
                    break;
                case 30:
                    textFieldPreparedSelection.moveCursorRightByChar().selectMovement();
                    z8 = true;
                    break;
                case 31:
                    textFieldPreparedSelection.moveCursorLeftByWord().selectMovement();
                    z8 = true;
                    break;
                case 32:
                    textFieldPreparedSelection.moveCursorRightByWord().selectMovement();
                    z8 = true;
                    break;
                case 33:
                    textFieldPreparedSelection.moveCursorPrevByParagraph().selectMovement();
                    z8 = true;
                    break;
                case 34:
                    textFieldPreparedSelection.moveCursorNextByParagraph().selectMovement();
                    z8 = true;
                    break;
                case 35:
                    textFieldPreparedSelection.moveCursorToLineStart().selectMovement();
                    z8 = true;
                    break;
                case 36:
                    textFieldPreparedSelection.moveCursorToLineEnd().selectMovement();
                    z8 = true;
                    break;
                case 37:
                    textFieldPreparedSelection.moveCursorToLineLeftSide().selectMovement();
                    z8 = true;
                    break;
                case 38:
                    textFieldPreparedSelection.moveCursorToLineRightSide().selectMovement();
                    z8 = true;
                    break;
                case 39:
                    textFieldPreparedSelection.moveCursorUpByLine().selectMovement();
                    z8 = true;
                    break;
                case 40:
                    textFieldPreparedSelection.moveCursorDownByLine().selectMovement();
                    z8 = true;
                    break;
                case 41:
                    textFieldPreparedSelection.moveCursorUpByPage().selectMovement();
                    z8 = true;
                    break;
                case 42:
                    textFieldPreparedSelection.moveCursorDownByPage().selectMovement();
                    z8 = true;
                    break;
                case 43:
                    textFieldPreparedSelection.moveCursorToHome().selectMovement();
                    z8 = true;
                    break;
                case 44:
                    textFieldPreparedSelection.moveCursorToEnd().selectMovement();
                    z8 = true;
                    break;
                case 45:
                    textFieldPreparedSelection.deselect();
                    z8 = true;
                    break;
                case 46:
                    textFieldState.undo();
                    z8 = true;
                    break;
                case 47:
                    textFieldState.redo();
                    z8 = true;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    KeyEventHelpers_androidKt.showCharacterPalette();
                    z8 = true;
                    break;
                default:
                    z8 = true;
                    break;
            }
            if (!TextRange.m12763equalsimpl0(textFieldPreparedSelection.getSelection(), textFieldPreparedSelection.getInitialValue().getSelection())) {
                textFieldState.m7889selectCharsIn5zctL8(textFieldPreparedSelection.getSelection());
            }
            if (textFieldPreparedSelection.getWedgeAffinity() != null && (wedgeAffinity = textFieldPreparedSelection.getWedgeAffinity()) != null) {
                if (TextRange.m12764getCollapsedimpl(textFieldState.getUntransformedText().getSelection())) {
                    textFieldState.setSelectionWedgeAffinity(new SelectionWedgeAffinity(wedgeAffinity));
                    return z8;
                }
                textFieldState.setSelectionWedgeAffinity(SelectionWedgeAffinity.copy$default(textFieldPreparedSelection.getInitialWedgeAffinity(), null, wedgeAffinity, 1, null));
            }
        }
        return z8;
    }

    /* renamed from: onKeyEvent-CJ9ybgU */
    public boolean mo7777onKeyEventCJ9ybgU(@NotNull KeyEvent event, @NotNull TransformedTextFieldState textFieldState, @NotNull TextLayoutState textLayoutState, @NotNull TextFieldSelectionState textFieldSelectionState, @NotNull InterfaceC6471c clipboardKeyCommandsHandler, boolean editable, boolean singleLine, @NotNull InterfaceC6469a onSubmit) {
        long jM11763getKeyZmokQxo = KeyEvent_androidKt.m11763getKeyZmokQxo(event);
        int iM11764getTypeZmokQxo = KeyEvent_androidKt.m11764getTypeZmokQxo(event);
        KeyEventType.Companion companion = KeyEventType.INSTANCE;
        if (KeyEventType.m11756equalsimpl0(iM11764getTypeZmokQxo, companion.m11761getKeyUpCS__XNY())) {
            MutableLongSet mutableLongSet = this.currentlyConsumedDownKeys;
            if (mutableLongSet == null || !mutableLongSet.contains(jM11763getKeyZmokQxo)) {
                return false;
            }
            MutableLongSet mutableLongSet2 = this.currentlyConsumedDownKeys;
            if (mutableLongSet2 != null) {
                mutableLongSet2.remove(jM11763getKeyZmokQxo);
            }
            return true;
        }
        if (KeyEventType.m11756equalsimpl0(KeyEvent_androidKt.m11764getTypeZmokQxo(event), companion.m11762getUnknownCS__XNY()) && !TextFieldKeyInput_androidKt.m7713isTypedEventZmokQxo(event)) {
            return false;
        }
        boolean zM7859processKeyDownEventZcWbMB8 = m7859processKeyDownEventZcWbMB8(event, textFieldState, textLayoutState, clipboardKeyCommandsHandler, editable, singleLine, onSubmit);
        if (zM7859processKeyDownEventZcWbMB8) {
            MutableLongSet mutableLongSet3 = this.currentlyConsumedDownKeys;
            if (mutableLongSet3 == null) {
                mutableLongSet3 = new MutableLongSet(3);
                this.currentlyConsumedDownKeys = mutableLongSet3;
            }
            mutableLongSet3.plusAssign(jM11763getKeyZmokQxo);
        }
        return zM7859processKeyDownEventZcWbMB8;
    }

    /* renamed from: onPreKeyEvent-MyFupTE */
    public boolean mo7778onPreKeyEventMyFupTE(@NotNull KeyEvent event, @NotNull TransformedTextFieldState textFieldState, @NotNull TextFieldSelectionState textFieldSelectionState, @NotNull FocusManager focusManager, @NotNull SoftwareKeyboardController keyboardController) {
        if (TextRange.m12764getCollapsedimpl(textFieldState.getVisualText().getSelection()) || !KeyEventHelpers_androidKt.m7606cancelsTextSelectionZmokQxo(event)) {
            return false;
        }
        textFieldSelectionState.deselect();
        return true;
    }
}
