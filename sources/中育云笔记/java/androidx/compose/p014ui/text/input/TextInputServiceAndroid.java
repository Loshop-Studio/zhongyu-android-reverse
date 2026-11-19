package androidx.compose.p014ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.p014ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.AbstractC9923a;
import kotlin.LazyThreadSafetyMode;
import kotlin.enums.AbstractC9953a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p211jd.AbstractC9719c;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p309qc.InterfaceC10773d;
import p425yc.InterfaceC11943a;

@StabilityInferred(parameters = 0)
@InterfaceC10770a
/* loaded from: classes2.dex */
public final class TextInputServiceAndroid implements PlatformTextInputService {
    public static final int $stable = 8;
    private final InterfaceC10773d baseInputConnection$delegate;
    private final CursorAnchorInfoController cursorAnchorInfoController;
    private boolean editorHasFocus;
    private Rect focusedRect;
    private Runnable frameCallback;
    private List<WeakReference<RecordingInputConnection>> ics;
    private ImeOptions imeOptions;
    private final Executor inputCommandProcessorExecutor;
    private final InputMethodManager inputMethodManager;
    private InterfaceC9540l onEditCommand;
    private InterfaceC9540l onImeActionPerformed;
    private TextFieldValue state;
    private final MutableVector<TextInputCommand> textInputCommandQueue;
    private final View view;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TextInputCommand {
        private static final /* synthetic */ InterfaceC11943a $ENTRIES;
        private static final /* synthetic */ TextInputCommand[] $VALUES;
        public static final TextInputCommand StartInput = new TextInputCommand("StartInput", 0);
        public static final TextInputCommand StopInput = new TextInputCommand("StopInput", 1);
        public static final TextInputCommand ShowKeyboard = new TextInputCommand("ShowKeyboard", 2);
        public static final TextInputCommand HideKeyboard = new TextInputCommand("HideKeyboard", 3);

        private static final /* synthetic */ TextInputCommand[] $values() {
            return new TextInputCommand[]{StartInput, StopInput, ShowKeyboard, HideKeyboard};
        }

        static {
            TextInputCommand[] textInputCommandArr$values = $values();
            $VALUES = textInputCommandArr$values;
            $ENTRIES = AbstractC9953a.m20230a(textInputCommandArr$values);
        }

        private TextInputCommand(String str, int i10) {
        }

        public static InterfaceC11943a getEntries() {
            return $ENTRIES;
        }

        public static TextInputCommand valueOf(String str) {
            return (TextInputCommand) Enum.valueOf(TextInputCommand.class, str);
        }

        public static TextInputCommand[] values() {
            return (TextInputCommand[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextInputCommand.values().length];
            try {
                iArr[TextInputCommand.StartInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextInputCommand.StopInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextInputCommand.ShowKeyboard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextInputCommand.HideKeyboard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TextInputServiceAndroid(View view, MatrixPositionCalculator matrixPositionCalculator, InputMethodManager inputMethodManager, Executor executor) {
        this.view = view;
        this.inputMethodManager = inputMethodManager;
        this.inputCommandProcessorExecutor = executor;
        this.onEditCommand = new InterfaceC9540l() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onEditCommand$1
            public final void invoke(List<? extends EditCommand> list) {
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends EditCommand>) obj);
                return C10786q.f26013a;
            }
        };
        this.onImeActionPerformed = new InterfaceC9540l() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onImeActionPerformed$1
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m33215invokeKlQnJC8(((ImeAction) obj).m33135unboximpl());
                return C10786q.f26013a;
            }

            /* renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m33215invokeKlQnJC8(int i10) {
            }
        };
        this.state = new TextFieldValue("", TextRange.Companion.m32971getZerod9O1mEE(), (TextRange) null, 4, (AbstractC9972n) null);
        this.imeOptions = ImeOptions.Companion.getDefault();
        this.ics = new ArrayList();
        this.baseInputConnection$delegate = AbstractC9923a.m20069b(LazyThreadSafetyMode.f23258e, new InterfaceC9529a() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$baseInputConnection$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final BaseInputConnection invoke() {
                return new BaseInputConnection(this.this$0.getView(), false);
            }
        });
        this.cursorAnchorInfoController = new CursorAnchorInfoController(matrixPositionCalculator, inputMethodManager);
        this.textInputCommandQueue = new MutableVector<>(new TextInputCommand[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection getBaseInputConnection() {
        return (BaseInputConnection) this.baseInputConnection$delegate.getValue();
    }

    private final void processInputCommands() {
        View viewFindFocus;
        if (!this.view.isFocused() && (viewFindFocus = this.view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
            this.textInputCommandQueue.clear();
            return;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        MutableVector<TextInputCommand> mutableVector = this.textInputCommandQueue;
        TextInputCommand[] textInputCommandArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            processInputCommands$applyToState(textInputCommandArr[i10], ref$ObjectRef, ref$ObjectRef2);
        }
        this.textInputCommandQueue.clear();
        if (AbstractC9979u.m20289b(ref$ObjectRef.f23402c, Boolean.TRUE)) {
            restartInputImmediately();
        }
        Boolean bool = (Boolean) ref$ObjectRef2.f23402c;
        if (bool != null) {
            setKeyboardVisibleImmediately(bool.booleanValue());
        }
        if (AbstractC9979u.m20289b(ref$ObjectRef.f23402c, Boolean.FALSE)) {
            restartInputImmediately();
        }
    }

    private static final void processInputCommands$applyToState(TextInputCommand textInputCommand, Ref$ObjectRef<Boolean> ref$ObjectRef, Ref$ObjectRef<Boolean> ref$ObjectRef2) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[textInputCommand.ordinal()];
        if (i10 == 1) {
            Boolean bool = Boolean.TRUE;
            ref$ObjectRef.f23402c = bool;
            ref$ObjectRef2.f23402c = bool;
        } else if (i10 == 2) {
            Boolean bool2 = Boolean.FALSE;
            ref$ObjectRef.f23402c = bool2;
            ref$ObjectRef2.f23402c = bool2;
        } else if ((i10 == 3 || i10 == 4) && !AbstractC9979u.m20289b(ref$ObjectRef.f23402c, Boolean.FALSE)) {
            ref$ObjectRef2.f23402c = Boolean.valueOf(textInputCommand == TextInputCommand.ShowKeyboard);
        }
    }

    private final void restartInputImmediately() {
        this.inputMethodManager.restartInput();
    }

    private final void sendInputCommand(TextInputCommand textInputCommand) {
        this.textInputCommandQueue.add(textInputCommand);
        if (this.frameCallback == null) {
            Runnable runnable = new Runnable() { // from class: androidx.compose.ui.text.input.c
                @Override // java.lang.Runnable
                public final void run() {
                    TextInputServiceAndroid.sendInputCommand$lambda$1(this.f1286c);
                }
            };
            this.inputCommandProcessorExecutor.execute(runnable);
            this.frameCallback = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendInputCommand$lambda$1(TextInputServiceAndroid textInputServiceAndroid) {
        textInputServiceAndroid.frameCallback = null;
        textInputServiceAndroid.processInputCommands();
    }

    private final void setKeyboardVisibleImmediately(boolean z10) {
        if (z10) {
            this.inputMethodManager.showSoftInput();
        } else {
            this.inputMethodManager.hideSoftInput();
        }
    }

    public final InputConnection createInputConnection(EditorInfo editorInfo) {
        if (!this.editorHasFocus) {
            return null;
        }
        TextInputServiceAndroid_androidKt.update(editorInfo, this.imeOptions, this.state);
        TextInputServiceAndroid_androidKt.updateWithEmojiCompat(editorInfo);
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.state, new InputEventCallback2() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid.createInputConnection.1
            @Override // androidx.compose.p014ui.text.input.InputEventCallback2
            public void onConnectionClosed(RecordingInputConnection recordingInputConnection2) {
                int size = TextInputServiceAndroid.this.ics.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (AbstractC9979u.m20289b(((WeakReference) TextInputServiceAndroid.this.ics.get(i10)).get(), recordingInputConnection2)) {
                        TextInputServiceAndroid.this.ics.remove(i10);
                        return;
                    }
                }
            }

            @Override // androidx.compose.p014ui.text.input.InputEventCallback2
            public void onEditCommands(List<? extends EditCommand> list) {
                TextInputServiceAndroid.this.onEditCommand.invoke(list);
            }

            @Override // androidx.compose.p014ui.text.input.InputEventCallback2
            /* renamed from: onImeAction-KlQnJC8 */
            public void mo33164onImeActionKlQnJC8(int i10) {
                TextInputServiceAndroid.this.onImeActionPerformed.invoke(ImeAction.m33129boximpl(i10));
            }

            @Override // androidx.compose.p014ui.text.input.InputEventCallback2
            public void onKeyEvent(KeyEvent keyEvent) {
                TextInputServiceAndroid.this.getBaseInputConnection().sendKeyEvent(keyEvent);
            }

            @Override // androidx.compose.p014ui.text.input.InputEventCallback2
            public void onRequestCursorAnchorInfo(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
                TextInputServiceAndroid.this.cursorAnchorInfoController.requestUpdate(z10, z11, z12, z13, z14, z15);
            }
        }, this.imeOptions.getAutoCorrect());
        this.ics.add(new WeakReference<>(recordingInputConnection));
        return recordingInputConnection;
    }

    public final TextFieldValue getState$ui_release() {
        return this.state;
    }

    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.p014ui.text.input.PlatformTextInputService
    public void hideSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.HideKeyboard);
    }

    public final boolean isEditorFocused() {
        return this.editorHasFocus;
    }

    @Override // androidx.compose.p014ui.text.input.PlatformTextInputService
    @InterfaceC10770a
    public void notifyFocusedRect(androidx.compose.p014ui.geometry.Rect rect) {
        Rect rect2;
        this.focusedRect = new Rect(AbstractC9719c.m19282d(rect.getLeft()), AbstractC9719c.m19282d(rect.getTop()), AbstractC9719c.m19282d(rect.getRight()), AbstractC9719c.m19282d(rect.getBottom()));
        if (!this.ics.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect2));
    }

    @Override // androidx.compose.p014ui.text.input.PlatformTextInputService
    public void showSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.ShowKeyboard);
    }

    @Override // androidx.compose.p014ui.text.input.PlatformTextInputService
    public void startInput(TextFieldValue textFieldValue, ImeOptions imeOptions, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        this.editorHasFocus = true;
        this.state = textFieldValue;
        this.imeOptions = imeOptions;
        this.onEditCommand = interfaceC9540l;
        this.onImeActionPerformed = interfaceC9540l2;
        sendInputCommand(TextInputCommand.StartInput);
    }

    @Override // androidx.compose.p014ui.text.input.PlatformTextInputService
    public void stopInput() {
        this.editorHasFocus = false;
        this.onEditCommand = new InterfaceC9540l() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.1
            public final void invoke(List<? extends EditCommand> list) {
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends EditCommand>) obj);
                return C10786q.f26013a;
            }
        };
        this.onImeActionPerformed = new InterfaceC9540l() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.2
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m33216invokeKlQnJC8(((ImeAction) obj).m33135unboximpl());
                return C10786q.f26013a;
            }

            /* renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m33216invokeKlQnJC8(int i10) {
            }
        };
        this.focusedRect = null;
        sendInputCommand(TextInputCommand.StopInput);
    }

    @Override // androidx.compose.p014ui.text.input.PlatformTextInputService
    public void updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        boolean z10 = (TextRange.m32959equalsimpl0(this.state.m33214getSelectiond9O1mEE(), textFieldValue2.m33214getSelectiond9O1mEE()) && AbstractC9979u.m20289b(this.state.m33213getCompositionMzsxiRA(), textFieldValue2.m33213getCompositionMzsxiRA())) ? false : true;
        this.state = textFieldValue2;
        int size = this.ics.size();
        for (int i10 = 0; i10 < size; i10++) {
            RecordingInputConnection recordingInputConnection = this.ics.get(i10).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.setMTextFieldValue$ui_release(textFieldValue2);
            }
        }
        this.cursorAnchorInfoController.invalidate();
        if (AbstractC9979u.m20289b(textFieldValue, textFieldValue2)) {
            if (z10) {
                InputMethodManager inputMethodManager = this.inputMethodManager;
                int iM32964getMinimpl = TextRange.m32964getMinimpl(textFieldValue2.m33214getSelectiond9O1mEE());
                int iM32963getMaximpl = TextRange.m32963getMaximpl(textFieldValue2.m33214getSelectiond9O1mEE());
                TextRange textRangeM33213getCompositionMzsxiRA = this.state.m33213getCompositionMzsxiRA();
                int iM32964getMinimpl2 = textRangeM33213getCompositionMzsxiRA != null ? TextRange.m32964getMinimpl(textRangeM33213getCompositionMzsxiRA.m32970unboximpl()) : -1;
                TextRange textRangeM33213getCompositionMzsxiRA2 = this.state.m33213getCompositionMzsxiRA();
                inputMethodManager.updateSelection(iM32964getMinimpl, iM32963getMaximpl, iM32964getMinimpl2, textRangeM33213getCompositionMzsxiRA2 != null ? TextRange.m32963getMaximpl(textRangeM33213getCompositionMzsxiRA2.m32970unboximpl()) : -1);
                return;
            }
            return;
        }
        if (textFieldValue != null && (!AbstractC9979u.m20289b(textFieldValue.getText(), textFieldValue2.getText()) || (TextRange.m32959equalsimpl0(textFieldValue.m33214getSelectiond9O1mEE(), textFieldValue2.m33214getSelectiond9O1mEE()) && !AbstractC9979u.m20289b(textFieldValue.m33213getCompositionMzsxiRA(), textFieldValue2.m33213getCompositionMzsxiRA())))) {
            restartInputImmediately();
            return;
        }
        int size2 = this.ics.size();
        for (int i11 = 0; i11 < size2; i11++) {
            RecordingInputConnection recordingInputConnection2 = this.ics.get(i11).get();
            if (recordingInputConnection2 != null) {
                recordingInputConnection2.updateInputState(this.state, this.inputMethodManager);
            }
        }
    }

    @Override // androidx.compose.p014ui.text.input.PlatformTextInputService
    public void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, InterfaceC9540l interfaceC9540l, androidx.compose.p014ui.geometry.Rect rect, androidx.compose.p014ui.geometry.Rect rect2) {
        this.cursorAnchorInfoController.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, interfaceC9540l, rect, rect2);
    }

    @Override // androidx.compose.p014ui.text.input.PlatformTextInputService
    public void startInput() {
        sendInputCommand(TextInputCommand.StartInput);
    }

    public /* synthetic */ TextInputServiceAndroid(View view, MatrixPositionCalculator matrixPositionCalculator, InputMethodManager inputMethodManager, Executor executor, int i10, AbstractC9972n abstractC9972n) {
        this(view, matrixPositionCalculator, inputMethodManager, (i10 & 8) != 0 ? TextInputServiceAndroid_androidKt.asExecutor(Choreographer.getInstance()) : executor);
    }

    public TextInputServiceAndroid(View view, MatrixPositionCalculator matrixPositionCalculator) {
        this(view, matrixPositionCalculator, new InputMethodManagerImpl(view), null, 8, null);
    }
}
