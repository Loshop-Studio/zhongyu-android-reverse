package androidx.compose.foundation.text.input;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextUndoManager;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.p012ui.text.TextRange;
import androidx.compose.p012ui.text.TextRangeKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Stable
@Metadata(m13412d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0002[\\B\u001b\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0015\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u001fH\u0000¢\u0006\u0002\b9J\u0010\u0010:\u001a\u0002072\u0006\u0010;\u001a\u00020\u0016H\u0001J&\u0010<\u001a\u0002072\b\u0010=\u001a\u0004\u0018\u00010>2\b\b\u0002\u0010?\u001a\u00020\u000e2\b\b\u0002\u0010@\u001a\u00020AH\u0002J\"\u0010B\u001a\u0002072\u0017\u0010C\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u0002070D¢\u0006\u0002\bEH\u0086\bJE\u0010F\u001a\u0002072\b\u0010=\u001a\u0004\u0018\u00010>2\b\b\u0002\u0010?\u001a\u00020\u000e2\b\b\u0002\u0010@\u001a\u00020A2\u0017\u0010C\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u0002070D¢\u0006\u0002\bEH\u0080\b¢\u0006\u0002\bGJ'\u0010H\u001a\u0002072\u0017\u0010C\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u0002070D¢\u0006\u0002\bEH\u0080\b¢\u0006\u0002\bIJ\b\u0010J\u001a\u000207H\u0001J(\u0010K\u001a\u0002072\u0006\u0010L\u001a\u00020/2\u0006\u0010M\u001a\u00020/2\u0006\u0010N\u001a\u00020O2\u0006\u0010@\u001a\u00020AH\u0002J\u0015\u0010P\u001a\u0002072\u0006\u00108\u001a\u00020\u001fH\u0000¢\u0006\u0002\bQJ\b\u0010R\u001a\u00020\u0016H\u0001J%\u0010S\u001a\u0002072\u0006\u0010T\u001a\u00020\u00162\u0006\u0010U\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020\u000eH\u0001¢\u0006\u0002\bWJ\b\u0010X\u001a\u00020\u0003H\u0016J \u0010Y\u001a\u0002072\u0006\u0010Z\u001a\u00020/2\u0006\u0010;\u001a\u00020/2\u0006\u0010?\u001a\u00020\u000eH\u0002R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u00020\u00168\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010 \u001a\u00020\u00058Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001c\u0010*\u001a\u00020+8GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u0018\u001a\u0004\b-\u0010.R+\u00100\u001a\u00020/2\u0006\u0010\r\u001a\u00020/8@@BX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\u0014\u001a\u0004\b1\u00102\"\u0004\b3\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006]"}, m13413d2 = {"Landroidx/compose/foundation/text/input/TextFieldState;", "", "initialText", "", "initialSelection", "Landroidx/compose/ui/text/TextRange;", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "initialTextUndoManager", "Landroidx/compose/foundation/text/input/TextUndoManager;", "(Ljava/lang/String;JLandroidx/compose/foundation/text/input/TextUndoManager;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "composition", "getComposition-MzsxiRA", "()Landroidx/compose/ui/text/TextRange;", "<set-?>", "", "isEditing", "()Z", "setEditing", "(Z)V", "isEditing$delegate", "Landroidx/compose/runtime/MutableState;", "mainBuffer", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "getMainBuffer$foundation_release$annotations", "()V", "getMainBuffer$foundation_release", "()Landroidx/compose/foundation/text/input/TextFieldBuffer;", "setMainBuffer$foundation_release", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V", "notifyImeListeners", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;", "selection", "getSelection-d9O1mEE", "()J", "text", "", "getText", "()Ljava/lang/CharSequence;", "textUndoManager", "getTextUndoManager$foundation_release", "()Landroidx/compose/foundation/text/input/TextUndoManager;", "undoState", "Landroidx/compose/foundation/text/input/UndoState;", "getUndoState$annotations", "getUndoState", "()Landroidx/compose/foundation/text/input/UndoState;", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "value", "getValue$foundation_release", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "setValue", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;)V", "value$delegate", "addNotifyImeListener", "", "notifyImeListener", "addNotifyImeListener$foundation_release", "commitEdit", "newValue", "commitEditAsUser", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "restartImeIfContentChanges", "undoBehavior", "Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;", "edit", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "editAsUser", "editAsUser$foundation_release", "editWithNoSideEffects", "editWithNoSideEffects$foundation_release", "finishEditing", "recordEditForUndo", "previousValue", "postValue", "changes", "Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "removeNotifyImeListener", "removeNotifyImeListener$foundation_release", "startEdit", "syncMainBufferToTemporaryBuffer", "temporaryBuffer", "textChanged", "selectionChanged", "syncMainBufferToTemporaryBuffer$foundation_release", "toString", "updateValueAndNotifyListeners", "oldValue", "NotifyImeListener", "Saver", "foundation_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,765:1\n1101#2:766\n1083#2,2:767\n85#3:769\n113#3,2:770\n85#3:772\n113#3,2:773\n602#4,8:775\n602#4,8:783\n50#5,5:791\n1#6:796\n423#7,9:797\n*S KotlinDebug\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n593#1:766\n593#1:767,2\n96#1:769\n96#1:770,2\n110#1:772\n110#1:773,2\n180#1:775,8\n197#1:783,8\n198#1:791,5\n447#1:797,9\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldState {
    public static final int $stable = 0;

    /* renamed from: isEditing$delegate, reason: from kotlin metadata */
    private final MutableState isEditing;
    private TextFieldBuffer mainBuffer;
    private final MutableVector<NotifyImeListener> notifyImeListeners;
    private final TextUndoManager textUndoManager;
    private final UndoState undoState;

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final MutableState value;

    @Metadata(m13412d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m13413d2 = {"Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;", "", "onChange", "", "oldValue", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "newValue", "restartIme", "", "foundation_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public interface NotifyImeListener {
        void onChange(TextFieldCharSequence oldValue, TextFieldCharSequence newValue, boolean restartIme);
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m13412d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\t"}, m13413d2 = {"Landroidx/compose/foundation/text/input/TextFieldState$Saver;", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/input/TextFieldState;", "", "()V", RequestParameters.X_OSS_RESTORE, "value", "save", "Landroidx/compose/runtime/saveable/SaverScope;", "foundation_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState$Saver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,765:1\n1#2:766\n*E\n"})
    public static final class Saver implements androidx.compose.runtime.saveable.Saver<TextFieldState, Object> {
        public static final int $stable = 0;
        public static final Saver INSTANCE = new Saver();

        private Saver() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.compose.runtime.saveable.Saver
        public TextFieldState restore(Object value) {
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) value;
            Object obj = list.get(0);
            Object obj2 = list.get(1);
            Object obj3 = list.get(2);
            Object obj4 = list.get(3);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj2).intValue();
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
            long jTextRange = TextRangeKt.TextRange(iIntValue, ((Integer) obj3).intValue());
            TextUndoManager.Companion.Saver saver = TextUndoManager.Companion.Saver.INSTANCE;
            Intrinsics.checkNotNull(obj4);
            TextUndoManager textUndoManagerRestore = saver.restore(obj4);
            Intrinsics.checkNotNull(textUndoManagerRestore);
            return new TextFieldState(str, jTextRange, textUndoManagerRestore, (DefaultConstructorMarker) null);
        }

        @Override // androidx.compose.runtime.saveable.Saver
        public Object save(SaverScope saverScope, TextFieldState textFieldState) {
            return CollectionsKt.listOf(textFieldState.getText().toString(), Integer.valueOf(TextRange.m23460getStartimpl(textFieldState.m18579getSelectiond9O1mEE())), Integer.valueOf(TextRange.m23455getEndimpl(textFieldState.m18579getSelectiond9O1mEE())), TextUndoManager.Companion.Saver.INSTANCE.save(saverScope, textFieldState.getTextUndoManager()));
        }
    }

    @Metadata(m13414k = 3, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextFieldEditUndoBehavior.values().length];
            try {
                iArr[TextFieldEditUndoBehavior.ClearHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldEditUndoBehavior.MergeIfPossible.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextFieldEditUndoBehavior.NeverMerge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ TextFieldState(String str, long j9, TextUndoManager textUndoManager, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j9, textUndoManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void commitEditAsUser(InputTransformation inputTransformation, boolean restartImeIfContentChanges, TextFieldEditUndoBehavior undoBehavior) {
        TextFieldCharSequence value$foundation_release = getValue$foundation_release();
        if (this.mainBuffer.getChangeTracker$foundation_release().getChangeCount() == 0 && TextRange.m23453equalsimpl0(value$foundation_release.getSelection(), this.mainBuffer.getSelectionInChars())) {
            if (Intrinsics.areEqual(value$foundation_release.getComposition(), this.mainBuffer.getComposition()) && Intrinsics.areEqual(value$foundation_release.getHighlight(), this.mainBuffer.getHighlight$foundation_release()) && Intrinsics.areEqual(value$foundation_release.getComposingAnnotations(), this.mainBuffer.getComposingAnnotations$foundation_release())) {
                return;
            }
            updateValueAndNotifyListeners(getValue$foundation_release(), new TextFieldCharSequence(this.mainBuffer.toString(), this.mainBuffer.getSelectionInChars(), this.mainBuffer.getComposition(), this.mainBuffer.getHighlight$foundation_release(), TextFieldStateKt.m18581finalizeComposingAnnotationsitr0ztk(this.mainBuffer.getComposition(), this.mainBuffer.getComposingAnnotations$foundation_release()), null), restartImeIfContentChanges);
            return;
        }
        boolean z9 = false;
        boolean z10 = this.mainBuffer.getChangeTracker$foundation_release().getChangeCount() != 0;
        TextFieldCharSequence textFieldCharSequence = new TextFieldCharSequence(this.mainBuffer.toString(), this.mainBuffer.getSelectionInChars(), this.mainBuffer.getComposition(), this.mainBuffer.getHighlight$foundation_release(), TextFieldStateKt.m18581finalizeComposingAnnotationsitr0ztk(this.mainBuffer.getComposition(), this.mainBuffer.getComposingAnnotations$foundation_release()), null);
        if (inputTransformation == null) {
            if (z10 && restartImeIfContentChanges) {
                z9 = true;
            }
            updateValueAndNotifyListeners(value$foundation_release, textFieldCharSequence, z9);
            recordEditForUndo(value$foundation_release, textFieldCharSequence, this.mainBuffer.getChangeTracker$foundation_release(), undoBehavior);
            return;
        }
        TextFieldBuffer textFieldBuffer = new TextFieldBuffer(textFieldCharSequence, this.mainBuffer.getChangeTracker$foundation_release(), value$foundation_release, null, 8, null);
        inputTransformation.transformInput(textFieldBuffer);
        boolean zContentEquals = StringsKt.contentEquals(textFieldBuffer.asCharSequence(), textFieldCharSequence);
        boolean z11 = !zContentEquals;
        boolean zM23453equalsimpl0 = TextRange.m23453equalsimpl0(textFieldBuffer.getSelectionInChars(), textFieldCharSequence.getSelection());
        boolean z12 = !zM23453equalsimpl0;
        if (zContentEquals && zM23453equalsimpl0) {
            updateValueAndNotifyListeners(value$foundation_release, TextFieldBuffer.m18566toTextFieldCharSequenceI88jaVs$foundation_release$default(textFieldBuffer, 0L, textFieldCharSequence.getComposition(), null, 5, null), restartImeIfContentChanges);
        } else {
            syncMainBufferToTemporaryBuffer$foundation_release(textFieldBuffer, z11, z12);
        }
        recordEditForUndo(value$foundation_release, getValue$foundation_release(), textFieldBuffer.getChanges(), undoBehavior);
    }

    public static /* synthetic */ void commitEditAsUser$default(TextFieldState textFieldState, InputTransformation inputTransformation, boolean z9, TextFieldEditUndoBehavior textFieldEditUndoBehavior, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z9 = true;
        }
        if ((i9 & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        textFieldState.commitEditAsUser(inputTransformation, z9, textFieldEditUndoBehavior);
    }

    public static /* synthetic */ void editAsUser$foundation_release$default(TextFieldState textFieldState, InputTransformation inputTransformation, boolean z9, TextFieldEditUndoBehavior textFieldEditUndoBehavior, Function1 function1, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z9 = true;
        }
        if ((i9 & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        textFieldState.getMainBuffer().getChangeTracker$foundation_release().clearChanges();
        function1.invoke(textFieldState.getMainBuffer());
        textFieldState.commitEditAsUser(inputTransformation, z9, textFieldEditUndoBehavior);
    }

    @VisibleForTesting
    public static /* synthetic */ void getMainBuffer$foundation_release$annotations() {
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getUndoState$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isEditing() {
        return ((Boolean) this.isEditing.getValue()).booleanValue();
    }

    private final void recordEditForUndo(TextFieldCharSequence previousValue, TextFieldCharSequence postValue, TextFieldBuffer.ChangeList changes, TextFieldEditUndoBehavior undoBehavior) {
        int i9 = WhenMappings.$EnumSwitchMapping$0[undoBehavior.ordinal()];
        if (i9 == 1) {
            this.textUndoManager.clearHistory();
        } else if (i9 == 2) {
            TextUndoManagerKt.recordChanges(this.textUndoManager, previousValue, postValue, changes, true);
        } else {
            if (i9 != 3) {
                return;
            }
            TextUndoManagerKt.recordChanges(this.textUndoManager, previousValue, postValue, changes, false);
        }
    }

    private final void setEditing(boolean z9) {
        this.isEditing.setValue(Boolean.valueOf(z9));
    }

    private final void setValue(TextFieldCharSequence textFieldCharSequence) {
        this.value.setValue(textFieldCharSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateValueAndNotifyListeners(TextFieldCharSequence oldValue, TextFieldCharSequence newValue, boolean restartImeIfContentChanges) {
        setValue(newValue);
        finishEditing();
        MutableVector<NotifyImeListener> mutableVector = this.notifyImeListeners;
        NotifyImeListener[] notifyImeListenerArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i9 = 0; i9 < size; i9++) {
            notifyImeListenerArr[i9].onChange(oldValue, newValue, (!restartImeIfContentChanges || oldValue.contentEquals(newValue) || oldValue.getComposition() == null) ? false : true);
        }
    }

    public final void addNotifyImeListener$foundation_release(NotifyImeListener notifyImeListener) {
        this.notifyImeListeners.add(notifyImeListener);
    }

    @PublishedApi
    public final void commitEdit(TextFieldBuffer newValue) {
        boolean z9 = newValue.getChanges().getChangeCount() > 0;
        boolean zM23453equalsimpl0 = true ^ TextRange.m23453equalsimpl0(newValue.getSelectionInChars(), this.mainBuffer.getSelectionInChars());
        if (z9) {
            this.textUndoManager.clearHistory();
        }
        syncMainBufferToTemporaryBuffer$foundation_release(newValue, z9, zM23453equalsimpl0);
    }

    public final void edit(Function1<? super TextFieldBuffer, Unit> block) {
        TextFieldBuffer textFieldBufferStartEdit = startEdit();
        try {
            block.invoke(textFieldBufferStartEdit);
            commitEdit(textFieldBufferStartEdit);
        } finally {
            InlineMarker.finallyStart(1);
            finishEditing();
            InlineMarker.finallyEnd(1);
        }
    }

    public final void editAsUser$foundation_release(InputTransformation inputTransformation, boolean restartImeIfContentChanges, TextFieldEditUndoBehavior undoBehavior, Function1<? super TextFieldBuffer, Unit> block) {
        getMainBuffer().getChangeTracker$foundation_release().clearChanges();
        block.invoke(getMainBuffer());
        commitEditAsUser(inputTransformation, restartImeIfContentChanges, undoBehavior);
    }

    public final void editWithNoSideEffects$foundation_release(Function1<? super TextFieldBuffer, Unit> block) {
        getMainBuffer().getChangeTracker$foundation_release().clearChanges();
        block.invoke(getMainBuffer());
        updateValueAndNotifyListeners(getValue$foundation_release(), TextFieldBuffer.m18566toTextFieldCharSequenceI88jaVs$foundation_release$default(getMainBuffer(), 0L, null, null, 7, null), true);
    }

    @PublishedApi
    public final void finishEditing() {
        setEditing(false);
    }

    /* renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final TextRange m18578getCompositionMzsxiRA() {
        return getValue$foundation_release().getComposition();
    }

    /* renamed from: getMainBuffer$foundation_release, reason: from getter */
    public final TextFieldBuffer getMainBuffer() {
        return this.mainBuffer;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m18579getSelectiond9O1mEE() {
        return getValue$foundation_release().getSelection();
    }

    public final CharSequence getText() {
        return getValue$foundation_release().getText();
    }

    /* renamed from: getTextUndoManager$foundation_release, reason: from getter */
    public final TextUndoManager getTextUndoManager() {
        return this.textUndoManager;
    }

    @ExperimentalFoundationApi
    public final UndoState getUndoState() {
        return this.undoState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextFieldCharSequence getValue$foundation_release() {
        return (TextFieldCharSequence) this.value.getValue();
    }

    public final void removeNotifyImeListener$foundation_release(NotifyImeListener notifyImeListener) {
        this.notifyImeListeners.remove(notifyImeListener);
    }

    public final void setMainBuffer$foundation_release(TextFieldBuffer textFieldBuffer) {
        this.mainBuffer = textFieldBuffer;
    }

    @PublishedApi
    public final TextFieldBuffer startEdit() {
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (isEditing()) {
                InlineClassHelperKt.throwIllegalStateException("TextFieldState does not support concurrent or nested editing.");
            }
            setEditing(true);
            return new TextFieldBuffer(getValue$foundation_release(), null, null, null, 14, null);
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }

    @VisibleForTesting
    public final void syncMainBufferToTemporaryBuffer$foundation_release(TextFieldBuffer temporaryBuffer, boolean textChanged, boolean selectionChanged) {
        TextFieldCharSequence textFieldCharSequenceM18566toTextFieldCharSequenceI88jaVs$foundation_release$default = TextFieldBuffer.m18566toTextFieldCharSequenceI88jaVs$foundation_release$default(this.mainBuffer, 0L, null, null, 7, null);
        if (textChanged) {
            this.mainBuffer = new TextFieldBuffer(new TextFieldCharSequence(temporaryBuffer.toString(), temporaryBuffer.getSelectionInChars(), null, null, null, 28, null), null, null, null, 14, null);
        } else if (selectionChanged) {
            this.mainBuffer.m18571setSelection5zctL8(TextRangeKt.TextRange(TextRange.m23460getStartimpl(temporaryBuffer.getSelectionInChars()), TextRange.m23455getEndimpl(temporaryBuffer.getSelectionInChars())));
        }
        if (textChanged || selectionChanged || !Intrinsics.areEqual(textFieldCharSequenceM18566toTextFieldCharSequenceI88jaVs$foundation_release$default.getComposition(), temporaryBuffer.getComposition())) {
            this.mainBuffer.commitComposition$foundation_release();
        }
        updateValueAndNotifyListeners(textFieldCharSequenceM18566toTextFieldCharSequenceI88jaVs$foundation_release$default, TextFieldBuffer.m18566toTextFieldCharSequenceI88jaVs$foundation_release$default(this.mainBuffer, 0L, null, null, 7, null), true);
    }

    public String toString() {
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            return "TextFieldState(selection=" + ((Object) TextRange.m23463toStringimpl(m18579getSelectiond9O1mEE())) + ", text=\"" + ((Object) getText()) + "\")";
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }

    public /* synthetic */ TextFieldState(String str, long j9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j9);
    }

    private TextFieldState(String str, long j9, TextUndoManager textUndoManager) {
        this.textUndoManager = textUndoManager;
        this.mainBuffer = new TextFieldBuffer(new TextFieldCharSequence(str, TextRangeKt.m23466coerceIn8ffj60Q(j9, 0, str.length()), null, null, null, 28, null), null, null, null, 14, null);
        this.isEditing = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.value = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldCharSequence(str, j9, null, null, null, 28, null), null, 2, null);
        this.undoState = new UndoState(this);
        this.notifyImeListeners = new MutableVector<>(new NotifyImeListener[16], 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextFieldState(String str, long j9, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i9 & 1) != 0 ? "" : str;
        this(str, (i9 & 2) != 0 ? TextRangeKt.TextRange(str.length()) : j9, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextFieldState(String str, long j9) {
        this(str, j9, new TextUndoManager(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), (DefaultConstructorMarker) null);
    }
}
