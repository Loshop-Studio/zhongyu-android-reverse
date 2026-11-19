package androidx.compose.p011ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.p011ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.AbstractC5773a;
import kotlin.Deprecated;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009a8.RunnableC0023a;
import p045d6.C5443s;
import p045d6.InterfaceC5429e;
import p092j6.InterfaceC5748a;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p169t6.AbstractC6600a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001hB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010 JM\u0010+\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0018\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&\u0012\u0004\u0012\u00020\u00100%2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00100%H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010+\u001a\u00020\u0010H\u0016¢\u0006\u0004\b+\u0010\u0014J\u000f\u0010-\u001a\u00020\u0010H\u0016¢\u0006\u0004\b-\u0010\u0014J\u000f\u0010.\u001a\u00020\u0010H\u0016¢\u0006\u0004\b.\u0010\u0014J\u000f\u0010/\u001a\u00020\u0010H\u0016¢\u0006\u0004\b/\u0010\u0014J!\u00102\u001a\u00020\u00102\b\u00100\u001a\u0004\u0018\u00010!2\u0006\u00101\u001a\u00020!H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u00102\u0006\u00105\u001a\u000204H\u0017¢\u0006\u0004\b6\u00107JK\u0010A\u001a\u00020\u00102\u0006\u00108\u001a\u00020!2\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u00100%2\u0006\u0010?\u001a\u0002042\u0006\u0010@\u001a\u000204H\u0016¢\u0006\u0004\bA\u0010BR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010FR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010GR\u0016\u0010H\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR(\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&\u0012\u0004\u0012\u00020\u00100%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010JR\"\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00100%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010JR$\u0010L\u001a\u00020!2\u0006\u0010K\u001a\u00020!8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010PR\"\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0R0Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u001b\u0010[\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0018\u0010]\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020\u000e0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010f\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010g¨\u0006i"}, m5110d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "Landroid/view/View;", "view", "Landroidx/compose/ui/input/pointer/MatrixPositionCalculator;", "rootPositionCalculator", "Landroidx/compose/ui/text/input/InputMethodManager;", "inputMethodManager", "Ljava/util/concurrent/Executor;", "inputCommandProcessorExecutor", "<init>", "(Landroid/view/View;Landroidx/compose/ui/input/pointer/MatrixPositionCalculator;Landroidx/compose/ui/text/input/InputMethodManager;Ljava/util/concurrent/Executor;)V", "positionCalculator", "(Landroid/view/View;Landroidx/compose/ui/input/pointer/MatrixPositionCalculator;)V", "Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "command", "Ld6/s;", "sendInputCommand", "(Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;)V", "processInputCommands", "()V", "restartInputImmediately", "", "visible", "setKeyboardVisibleImmediately", "(Z)V", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "createInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "isEditorFocused", "()Z", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/EditCommand;", "onEditCommand", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "startInput", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/ImeOptions;Lr6/c;Lr6/c;)V", "stopInput", "showSoftwareKeyboard", "hideSoftwareKeyboard", "oldValue", "newValue", "updateState", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroidx/compose/ui/geometry/Rect;", "rect", "notifyFocusedRect", "(Landroidx/compose/ui/geometry/Rect;)V", "textFieldValue", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/ui/graphics/Matrix;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "updateTextLayoutResult", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Lr6/c;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroidx/compose/ui/text/input/InputMethodManager;", "Ljava/util/concurrent/Executor;", "editorHasFocus", "Z", "Lr6/c;", "<set-?>", "state", "Landroidx/compose/ui/text/input/TextFieldValue;", "getState$ui_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "Landroidx/compose/ui/text/input/ImeOptions;", "", "Ljava/lang/ref/WeakReference;", "Landroidx/compose/ui/text/input/RecordingInputConnection;", "ics", "Ljava/util/List;", "Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection$delegate", "Ld6/e;", "getBaseInputConnection", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection", "Landroid/graphics/Rect;", "focusedRect", "Landroid/graphics/Rect;", "Landroidx/compose/ui/text/input/CursorAnchorInfoController;", "cursorAnchorInfoController", "Landroidx/compose/ui/text/input/CursorAnchorInfoController;", "Landroidx/compose/runtime/collection/MutableVector;", "textInputCommandQueue", "Landroidx/compose/runtime/collection/MutableVector;", "Ljava/lang/Runnable;", "frameCallback", "Ljava/lang/Runnable;", "TextInputCommand", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Deprecated(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
@SourceDebugExtension({"SMAP\nTextInputServiceAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,586:1\n1101#2:587\n1083#2,2:588\n641#3,2:590\n423#3,9:593\n1#4:592\n*S KotlinDebug\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid\n*L\n116#1:587\n116#1:588,2\n261#1:590,2\n338#1:593,9\n*E\n"})
/* loaded from: classes2.dex */
public final class TextInputServiceAndroid implements PlatformTextInputService {
    public static final int $stable = 8;

    /* renamed from: baseInputConnection$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e baseInputConnection;

    @NotNull
    private final CursorAnchorInfoController cursorAnchorInfoController;
    private boolean editorHasFocus;

    @Nullable
    private Rect focusedRect;

    @Nullable
    private Runnable frameCallback;

    @NotNull
    private List<WeakReference<RecordingInputConnection>> ics;

    @NotNull
    private ImeOptions imeOptions;

    @NotNull
    private final Executor inputCommandProcessorExecutor;

    @NotNull
    private final InputMethodManager inputMethodManager;

    @NotNull
    private InterfaceC6471c onEditCommand;

    @NotNull
    private InterfaceC6471c onImeActionPerformed;

    @NotNull
    private TextFieldValue state;

    @NotNull
    private final MutableVector<TextInputCommand> textInputCommandQueue;

    @NotNull
    private final View view;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m5110d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "", "(Ljava/lang/String;I)V", "StartInput", "StopInput", "ShowKeyboard", "HideKeyboard", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class TextInputCommand {
        private static final /* synthetic */ InterfaceC5748a $ENTRIES;
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
            $ENTRIES = AbstractC5817a.m5310a(textInputCommandArr$values);
        }

        private TextInputCommand(String str, int i) {
        }

        @NotNull
        public static InterfaceC5748a getEntries() {
            return $ENTRIES;
        }

        public static TextInputCommand valueOf(String str) {
            return (TextInputCommand) Enum.valueOf(TextInputCommand.class, str);
        }

        public static TextInputCommand[] values() {
            return (TextInputCommand[]) $VALUES.clone();
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

    public TextInputServiceAndroid(@NotNull View view, @NotNull MatrixPositionCalculator matrixPositionCalculator, @NotNull InputMethodManager inputMethodManager, @NotNull Executor executor) {
        this.view = view;
        this.inputMethodManager = inputMethodManager;
        this.inputCommandProcessorExecutor = executor;
        this.onEditCommand = new InterfaceC6471c() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onEditCommand$1
            public final void invoke(List<? extends EditCommand> list) {
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends EditCommand>) obj);
                return C5443s.f8405a;
            }
        };
        this.onImeActionPerformed = new InterfaceC6471c() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onImeActionPerformed$1
            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m13019invokeKlQnJC8(((ImeAction) obj).getValue());
                return C5443s.f8405a;
            }

            /* renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m13019invokeKlQnJC8(int i) {
            }
        };
        this.state = new TextFieldValue("", TextRange.INSTANCE.m12775getZerod9O1mEE(), (TextRange) null, 4, (AbstractC5824e) null);
        this.imeOptions = ImeOptions.INSTANCE.getDefault();
        this.ics = new ArrayList();
        this.baseInputConnection = AbstractC5773a.m5116a(LazyThreadSafetyMode.NONE, new InterfaceC6469a() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$baseInputConnection$2
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public final BaseInputConnection invoke() {
                return new BaseInputConnection(this.this$0.getView(), false);
            }
        });
        this.cursorAnchorInfoController = new CursorAnchorInfoController(matrixPositionCalculator, inputMethodManager);
        this.textInputCommandQueue = new MutableVector<>(new TextInputCommand[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection getBaseInputConnection() {
        return (BaseInputConnection) this.baseInputConnection.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        for (int i = 0; i < size; i++) {
            processInputCommands$applyToState(textInputCommandArr[i], ref$ObjectRef, ref$ObjectRef2);
        }
        this.textInputCommandQueue.clear();
        if (AbstractC5830k.m5325b(ref$ObjectRef.element, Boolean.TRUE)) {
            restartInputImmediately();
        }
        Boolean bool = (Boolean) ref$ObjectRef2.element;
        if (bool != null) {
            setKeyboardVisibleImmediately(bool.booleanValue());
        }
        if (AbstractC5830k.m5325b(ref$ObjectRef.element, Boolean.FALSE)) {
            restartInputImmediately();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Boolean] */
    private static final void processInputCommands$applyToState(TextInputCommand textInputCommand, Ref$ObjectRef<Boolean> ref$ObjectRef, Ref$ObjectRef<Boolean> ref$ObjectRef2) {
        int i = WhenMappings.$EnumSwitchMapping$0[textInputCommand.ordinal()];
        if (i == 1) {
            ?? r32 = Boolean.TRUE;
            ref$ObjectRef.element = r32;
            ref$ObjectRef2.element = r32;
        } else if (i == 2) {
            ?? r33 = Boolean.FALSE;
            ref$ObjectRef.element = r33;
            ref$ObjectRef2.element = r33;
        } else if ((i == 3 || i == 4) && !AbstractC5830k.m5325b(ref$ObjectRef.element, Boolean.FALSE)) {
            ref$ObjectRef2.element = Boolean.valueOf(textInputCommand == TextInputCommand.ShowKeyboard);
        }
    }

    private final void restartInputImmediately() {
        this.inputMethodManager.restartInput();
    }

    private final void sendInputCommand(TextInputCommand command) {
        this.textInputCommandQueue.add(command);
        if (this.frameCallback == null) {
            RunnableC0023a runnableC0023a = new RunnableC0023a(this, 13);
            this.inputCommandProcessorExecutor.execute(runnableC0023a);
            this.frameCallback = runnableC0023a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendInputCommand$lambda$1(TextInputServiceAndroid textInputServiceAndroid) {
        textInputServiceAndroid.frameCallback = null;
        textInputServiceAndroid.processInputCommands();
    }

    private final void setKeyboardVisibleImmediately(boolean visible) {
        if (visible) {
            this.inputMethodManager.showSoftInput();
        } else {
            this.inputMethodManager.hideSoftInput();
        }
    }

    @Nullable
    public final InputConnection createInputConnection(@NotNull EditorInfo outAttrs) {
        if (!this.editorHasFocus) {
            return null;
        }
        TextInputServiceAndroid_androidKt.update(outAttrs, this.imeOptions, this.state);
        TextInputServiceAndroid_androidKt.updateWithEmojiCompat(outAttrs);
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.state, new InputEventCallback2() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid.createInputConnection.1
            @Override // androidx.compose.p011ui.text.input.InputEventCallback2
            public void onConnectionClosed(RecordingInputConnection inputConnection) {
                int size = TextInputServiceAndroid.this.ics.size();
                for (int i = 0; i < size; i++) {
                    if (AbstractC5830k.m5325b(((WeakReference) TextInputServiceAndroid.this.ics.get(i)).get(), inputConnection)) {
                        TextInputServiceAndroid.this.ics.remove(i);
                        return;
                    }
                }
            }

            @Override // androidx.compose.p011ui.text.input.InputEventCallback2
            public void onEditCommands(List<? extends EditCommand> editCommands) {
                TextInputServiceAndroid.this.onEditCommand.invoke(editCommands);
            }

            @Override // androidx.compose.p011ui.text.input.InputEventCallback2
            /* renamed from: onImeAction-KlQnJC8 */
            public void mo12968onImeActionKlQnJC8(int imeAction) {
                TextInputServiceAndroid.this.onImeActionPerformed.invoke(ImeAction.m12933boximpl(imeAction));
            }

            @Override // androidx.compose.p011ui.text.input.InputEventCallback2
            public void onKeyEvent(KeyEvent event) {
                TextInputServiceAndroid.this.getBaseInputConnection().sendKeyEvent(event);
            }

            @Override // androidx.compose.p011ui.text.input.InputEventCallback2
            public void onRequestCursorAnchorInfo(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
                TextInputServiceAndroid.this.cursorAnchorInfoController.requestUpdate(immediate, monitor, includeInsertionMarker, includeCharacterBounds, includeEditorBounds, includeLineBounds);
            }
        }, this.imeOptions.getAutoCorrect());
        this.ics.add(new WeakReference<>(recordingInputConnection));
        return recordingInputConnection;
    }

    @NotNull
    /* renamed from: getState$ui_release, reason: from getter */
    public final TextFieldValue getState() {
        return this.state;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.p011ui.text.input.PlatformTextInputService
    public void hideSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.HideKeyboard);
    }

    /* renamed from: isEditorFocused, reason: from getter */
    public final boolean getEditorHasFocus() {
        return this.editorHasFocus;
    }

    @Override // androidx.compose.p011ui.text.input.PlatformTextInputService
    @Deprecated(message = "This method should not be called, used BringIntoViewRequester instead.")
    public void notifyFocusedRect(@NotNull androidx.compose.p011ui.geometry.Rect rect) {
        Rect rect2;
        this.focusedRect = new Rect(AbstractC6600a.m6241q(rect.getLeft()), AbstractC6600a.m6241q(rect.getTop()), AbstractC6600a.m6241q(rect.getRight()), AbstractC6600a.m6241q(rect.getBottom()));
        if (!this.ics.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect2));
    }

    @Override // androidx.compose.p011ui.text.input.PlatformTextInputService
    public void showSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.ShowKeyboard);
    }

    @Override // androidx.compose.p011ui.text.input.PlatformTextInputService
    public void startInput(@NotNull TextFieldValue value, @NotNull ImeOptions imeOptions, @NotNull InterfaceC6471c onEditCommand, @NotNull InterfaceC6471c onImeActionPerformed) {
        this.editorHasFocus = true;
        this.state = value;
        this.imeOptions = imeOptions;
        this.onEditCommand = onEditCommand;
        this.onImeActionPerformed = onImeActionPerformed;
        sendInputCommand(TextInputCommand.StartInput);
    }

    @Override // androidx.compose.p011ui.text.input.PlatformTextInputService
    public void stopInput() {
        this.editorHasFocus = false;
        this.onEditCommand = new InterfaceC6471c() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.1
            public final void invoke(List<? extends EditCommand> list) {
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends EditCommand>) obj);
                return C5443s.f8405a;
            }
        };
        this.onImeActionPerformed = new InterfaceC6471c() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.2
            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m13020invokeKlQnJC8(((ImeAction) obj).getValue());
                return C5443s.f8405a;
            }

            /* renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m13020invokeKlQnJC8(int i) {
            }
        };
        this.focusedRect = null;
        sendInputCommand(TextInputCommand.StopInput);
    }

    @Override // androidx.compose.p011ui.text.input.PlatformTextInputService
    public void updateState(@Nullable TextFieldValue oldValue, @NotNull TextFieldValue newValue) {
        boolean z8 = (TextRange.m12763equalsimpl0(this.state.getSelection(), newValue.getSelection()) && AbstractC5830k.m5325b(this.state.getComposition(), newValue.getComposition())) ? false : true;
        this.state = newValue;
        int size = this.ics.size();
        for (int i = 0; i < size; i++) {
            RecordingInputConnection recordingInputConnection = this.ics.get(i).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.setMTextFieldValue$ui_release(newValue);
            }
        }
        this.cursorAnchorInfoController.invalidate();
        if (AbstractC5830k.m5325b(oldValue, newValue)) {
            if (z8) {
                InputMethodManager inputMethodManager = this.inputMethodManager;
                int iM12768getMinimpl = TextRange.m12768getMinimpl(newValue.getSelection());
                int iM12767getMaximpl = TextRange.m12767getMaximpl(newValue.getSelection());
                TextRange textRangeM13017getCompositionMzsxiRA = this.state.getComposition();
                int iM12768getMinimpl2 = textRangeM13017getCompositionMzsxiRA != null ? TextRange.m12768getMinimpl(textRangeM13017getCompositionMzsxiRA.getPackedValue()) : -1;
                TextRange textRangeM13017getCompositionMzsxiRA2 = this.state.getComposition();
                inputMethodManager.updateSelection(iM12768getMinimpl, iM12767getMaximpl, iM12768getMinimpl2, textRangeM13017getCompositionMzsxiRA2 != null ? TextRange.m12767getMaximpl(textRangeM13017getCompositionMzsxiRA2.getPackedValue()) : -1);
                return;
            }
            return;
        }
        if (oldValue != null && (!AbstractC5830k.m5325b(oldValue.getText(), newValue.getText()) || (TextRange.m12763equalsimpl0(oldValue.getSelection(), newValue.getSelection()) && !AbstractC5830k.m5325b(oldValue.getComposition(), newValue.getComposition())))) {
            restartInputImmediately();
            return;
        }
        int size2 = this.ics.size();
        for (int i8 = 0; i8 < size2; i8++) {
            RecordingInputConnection recordingInputConnection2 = this.ics.get(i8).get();
            if (recordingInputConnection2 != null) {
                recordingInputConnection2.updateInputState(this.state, this.inputMethodManager);
            }
        }
    }

    @Override // androidx.compose.p011ui.text.input.PlatformTextInputService
    public void updateTextLayoutResult(@NotNull TextFieldValue textFieldValue, @NotNull OffsetMapping offsetMapping, @NotNull TextLayoutResult textLayoutResult, @NotNull InterfaceC6471c textFieldToRootTransform, @NotNull androidx.compose.p011ui.geometry.Rect innerTextFieldBounds, @NotNull androidx.compose.p011ui.geometry.Rect decorationBoxBounds) {
        this.cursorAnchorInfoController.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, textFieldToRootTransform, innerTextFieldBounds, decorationBoxBounds);
    }

    @Override // androidx.compose.p011ui.text.input.PlatformTextInputService
    public void startInput() {
        sendInputCommand(TextInputCommand.StartInput);
    }

    public /* synthetic */ TextInputServiceAndroid(View view, MatrixPositionCalculator matrixPositionCalculator, InputMethodManager inputMethodManager, Executor executor, int i, AbstractC5824e abstractC5824e) {
        this(view, matrixPositionCalculator, inputMethodManager, (i & 8) != 0 ? TextInputServiceAndroid_androidKt.asExecutor(Choreographer.getInstance()) : executor);
    }

    public TextInputServiceAndroid(@NotNull View view, @NotNull MatrixPositionCalculator matrixPositionCalculator) {
        this(view, matrixPositionCalculator, new InputMethodManagerImpl(view), null, 8, null);
    }
}
