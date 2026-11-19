package androidx.compose.p013ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.p013ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.enums.AbstractC9108a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.Ref$ObjectRef;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p123h7.InterfaceC8724d;
import p212p7.InterfaceC9760a;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p322z7.AbstractC10729c;

@StabilityInferred(parameters = 0)
@InterfaceC8721a
/* loaded from: classes2.dex */
public final class TextInputServiceAndroid implements PlatformTextInputService {
    public static final int $stable = 8;
    private final InterfaceC8724d baseInputConnection$delegate;
    private final CursorAnchorInfoController cursorAnchorInfoController;
    private boolean editorHasFocus;
    private Rect focusedRect;
    private Runnable frameCallback;
    private List<WeakReference<RecordingInputConnection>> ics;
    private ImeOptions imeOptions;
    private final Executor inputCommandProcessorExecutor;
    private final InputMethodManager inputMethodManager;
    private InterfaceC10570l onEditCommand;
    private InterfaceC10570l onImeActionPerformed;
    private TextFieldValue state;
    private final MutableVector<TextInputCommand> textInputCommandQueue;
    private final View view;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TextInputCommand {
        private static final /* synthetic */ InterfaceC9760a $ENTRIES;
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
            $ENTRIES = AbstractC9108a.m16085a(textInputCommandArr$values);
        }

        private TextInputCommand(String str, int i10) {
        }

        public static InterfaceC9760a getEntries() {
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
        this.onEditCommand = new InterfaceC10570l() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onEditCommand$1
            public final void invoke(List<? extends EditCommand> list) {
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends EditCommand>) obj);
                return C8736p.f16368a;
            }
        };
        this.onImeActionPerformed = new InterfaceC10570l() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onImeActionPerformed$1
            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m26613invokeKlQnJC8(((ImeAction) obj).m26533unboximpl());
                return C8736p.f16368a;
            }

            /* renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m26613invokeKlQnJC8(int i10) {
            }
        };
        this.state = new TextFieldValue("", TextRange.Companion.m26369getZerod9O1mEE(), (TextRange) null, 4, (AbstractC9126n) null);
        this.imeOptions = ImeOptions.Companion.getDefault();
        this.ics = new ArrayList();
        this.baseInputConnection$delegate = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$baseInputConnection$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
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
        if (AbstractC9133u.m16128b(ref$ObjectRef.f17473a, Boolean.TRUE)) {
            restartInputImmediately();
        }
        Boolean bool = (Boolean) ref$ObjectRef2.f17473a;
        if (bool != null) {
            setKeyboardVisibleImmediately(bool.booleanValue());
        }
        if (AbstractC9133u.m16128b(ref$ObjectRef.f17473a, Boolean.FALSE)) {
            restartInputImmediately();
        }
    }

    private static final void processInputCommands$applyToState(TextInputCommand textInputCommand, Ref$ObjectRef<Boolean> ref$ObjectRef, Ref$ObjectRef<Boolean> ref$ObjectRef2) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[textInputCommand.ordinal()];
        if (i10 == 1) {
            Boolean bool = Boolean.TRUE;
            ref$ObjectRef.f17473a = bool;
            ref$ObjectRef2.f17473a = bool;
        } else if (i10 == 2) {
            Boolean bool2 = Boolean.FALSE;
            ref$ObjectRef.f17473a = bool2;
            ref$ObjectRef2.f17473a = bool2;
        } else if ((i10 == 3 || i10 == 4) && !AbstractC9133u.m16128b(ref$ObjectRef.f17473a, Boolean.FALSE)) {
            ref$ObjectRef2.f17473a = Boolean.valueOf(textInputCommand == TextInputCommand.ShowKeyboard);
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
                    TextInputServiceAndroid.sendInputCommand$lambda$1(this.f1356a);
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
            @Override // androidx.compose.p013ui.text.input.InputEventCallback2
            public void onConnectionClosed(RecordingInputConnection recordingInputConnection2) {
                int size = TextInputServiceAndroid.this.ics.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (AbstractC9133u.m16128b(((WeakReference) TextInputServiceAndroid.this.ics.get(i10)).get(), recordingInputConnection2)) {
                        TextInputServiceAndroid.this.ics.remove(i10);
                        return;
                    }
                }
            }

            @Override // androidx.compose.p013ui.text.input.InputEventCallback2
            public void onEditCommands(List<? extends EditCommand> list) {
                TextInputServiceAndroid.this.onEditCommand.invoke(list);
            }

            @Override // androidx.compose.p013ui.text.input.InputEventCallback2
            /* renamed from: onImeAction-KlQnJC8 */
            public void mo26562onImeActionKlQnJC8(int i10) {
                TextInputServiceAndroid.this.onImeActionPerformed.invoke(ImeAction.m26527boximpl(i10));
            }

            @Override // androidx.compose.p013ui.text.input.InputEventCallback2
            public void onKeyEvent(KeyEvent keyEvent) {
                TextInputServiceAndroid.this.getBaseInputConnection().sendKeyEvent(keyEvent);
            }

            @Override // androidx.compose.p013ui.text.input.InputEventCallback2
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

    @Override // androidx.compose.p013ui.text.input.PlatformTextInputService
    public void hideSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.HideKeyboard);
    }

    public final boolean isEditorFocused() {
        return this.editorHasFocus;
    }

    @Override // androidx.compose.p013ui.text.input.PlatformTextInputService
    @InterfaceC8721a
    public void notifyFocusedRect(androidx.compose.p013ui.geometry.Rect rect) {
        Rect rect2;
        this.focusedRect = new Rect(AbstractC10729c.m20035d(rect.getLeft()), AbstractC10729c.m20035d(rect.getTop()), AbstractC10729c.m20035d(rect.getRight()), AbstractC10729c.m20035d(rect.getBottom()));
        if (!this.ics.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect2));
    }

    @Override // androidx.compose.p013ui.text.input.PlatformTextInputService
    public void showSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.ShowKeyboard);
    }

    @Override // androidx.compose.p013ui.text.input.PlatformTextInputService
    public void startInput(TextFieldValue textFieldValue, ImeOptions imeOptions, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        this.editorHasFocus = true;
        this.state = textFieldValue;
        this.imeOptions = imeOptions;
        this.onEditCommand = interfaceC10570l;
        this.onImeActionPerformed = interfaceC10570l2;
        sendInputCommand(TextInputCommand.StartInput);
    }

    @Override // androidx.compose.p013ui.text.input.PlatformTextInputService
    public void stopInput() {
        this.editorHasFocus = false;
        this.onEditCommand = new InterfaceC10570l() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.1
            public final void invoke(List<? extends EditCommand> list) {
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends EditCommand>) obj);
                return C8736p.f16368a;
            }
        };
        this.onImeActionPerformed = new InterfaceC10570l() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.2
            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m26614invokeKlQnJC8(((ImeAction) obj).m26533unboximpl());
                return C8736p.f16368a;
            }

            /* renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m26614invokeKlQnJC8(int i10) {
            }
        };
        this.focusedRect = null;
        sendInputCommand(TextInputCommand.StopInput);
    }

    @Override // androidx.compose.p013ui.text.input.PlatformTextInputService
    public void updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        boolean z10 = (TextRange.m26357equalsimpl0(this.state.m26612getSelectiond9O1mEE(), textFieldValue2.m26612getSelectiond9O1mEE()) && AbstractC9133u.m16128b(this.state.m26611getCompositionMzsxiRA(), textFieldValue2.m26611getCompositionMzsxiRA())) ? false : true;
        this.state = textFieldValue2;
        int size = this.ics.size();
        for (int i10 = 0; i10 < size; i10++) {
            RecordingInputConnection recordingInputConnection = this.ics.get(i10).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.setMTextFieldValue$ui_release(textFieldValue2);
            }
        }
        this.cursorAnchorInfoController.invalidate();
        if (AbstractC9133u.m16128b(textFieldValue, textFieldValue2)) {
            if (z10) {
                InputMethodManager inputMethodManager = this.inputMethodManager;
                int iM26362getMinimpl = TextRange.m26362getMinimpl(textFieldValue2.m26612getSelectiond9O1mEE());
                int iM26361getMaximpl = TextRange.m26361getMaximpl(textFieldValue2.m26612getSelectiond9O1mEE());
                TextRange textRangeM26611getCompositionMzsxiRA = this.state.m26611getCompositionMzsxiRA();
                int iM26362getMinimpl2 = textRangeM26611getCompositionMzsxiRA != null ? TextRange.m26362getMinimpl(textRangeM26611getCompositionMzsxiRA.m26368unboximpl()) : -1;
                TextRange textRangeM26611getCompositionMzsxiRA2 = this.state.m26611getCompositionMzsxiRA();
                inputMethodManager.updateSelection(iM26362getMinimpl, iM26361getMaximpl, iM26362getMinimpl2, textRangeM26611getCompositionMzsxiRA2 != null ? TextRange.m26361getMaximpl(textRangeM26611getCompositionMzsxiRA2.m26368unboximpl()) : -1);
                return;
            }
            return;
        }
        if (textFieldValue != null && (!AbstractC9133u.m16128b(textFieldValue.getText(), textFieldValue2.getText()) || (TextRange.m26357equalsimpl0(textFieldValue.m26612getSelectiond9O1mEE(), textFieldValue2.m26612getSelectiond9O1mEE()) && !AbstractC9133u.m16128b(textFieldValue.m26611getCompositionMzsxiRA(), textFieldValue2.m26611getCompositionMzsxiRA())))) {
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

    @Override // androidx.compose.p013ui.text.input.PlatformTextInputService
    public void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, InterfaceC10570l interfaceC10570l, androidx.compose.p013ui.geometry.Rect rect, androidx.compose.p013ui.geometry.Rect rect2) {
        this.cursorAnchorInfoController.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, interfaceC10570l, rect, rect2);
    }

    @Override // androidx.compose.p013ui.text.input.PlatformTextInputService
    public void startInput() {
        sendInputCommand(TextInputCommand.StartInput);
    }

    public /* synthetic */ TextInputServiceAndroid(View view, MatrixPositionCalculator matrixPositionCalculator, InputMethodManager inputMethodManager, Executor executor, int i10, AbstractC9126n abstractC9126n) {
        this(view, matrixPositionCalculator, inputMethodManager, (i10 & 8) != 0 ? TextInputServiceAndroid_androidKt.asExecutor(Choreographer.getInstance()) : executor);
    }

    public TextInputServiceAndroid(View view, MatrixPositionCalculator matrixPositionCalculator) {
        this(view, matrixPositionCalculator, new InputMethodManagerImpl(view), null, 8, null);
    }
}
