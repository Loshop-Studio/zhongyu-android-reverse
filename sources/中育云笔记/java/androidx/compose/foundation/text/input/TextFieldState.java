package androidx.compose.foundation.text.input;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextUndoManager;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.TextRangeKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p310qd.AbstractC10819z;
import p325rc.AbstractC10978w;

@Stable
/* loaded from: classes.dex */
public final class TextFieldState {
    public static final int $stable = 0;
    private final MutableState isEditing$delegate;
    private TextFieldBuffer mainBuffer;
    private final MutableVector<NotifyImeListener> notifyImeListeners;
    private final TextUndoManager textUndoManager;
    private final UndoState undoState;
    private final MutableState value$delegate;

    public interface NotifyImeListener {
        void onChange(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z10);
    }

    @StabilityInferred(parameters = 1)
    public static final class Saver implements androidx.compose.runtime.saveable.Saver<TextFieldState, Object> {
        public static final int $stable = 0;
        public static final Saver INSTANCE = new Saver();

        private Saver() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.compose.runtime.saveable.Saver
        public TextFieldState restore(Object obj) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Object obj3 = list.get(1);
            Object obj4 = list.get(2);
            Object obj5 = list.get(3);
            AbstractC9979u.m20292e(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            AbstractC9979u.m20292e(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            AbstractC9979u.m20292e(obj4, "null cannot be cast to non-null type kotlin.Int");
            long jTextRange = TextRangeKt.TextRange(iIntValue, ((Integer) obj4).intValue());
            TextUndoManager.Companion.Saver saver = TextUndoManager.Companion.Saver.INSTANCE;
            AbstractC9979u.m20291d(obj5);
            TextUndoManager textUndoManagerRestore = saver.restore(obj5);
            AbstractC9979u.m20291d(textUndoManagerRestore);
            return new TextFieldState(str, jTextRange, textUndoManagerRestore, (AbstractC9972n) null);
        }

        @Override // androidx.compose.runtime.saveable.Saver
        public Object save(SaverScope saverScope, TextFieldState textFieldState) {
            return AbstractC10978w.m24139q(textFieldState.getText().toString(), Integer.valueOf(TextRange.m32966getStartimpl(textFieldState.m27949getSelectiond9O1mEE())), Integer.valueOf(TextRange.m32961getEndimpl(textFieldState.m27949getSelectiond9O1mEE())), TextUndoManager.Companion.Saver.INSTANCE.save(saverScope, textFieldState.getTextUndoManager$foundation_release()));
        }
    }

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

    public /* synthetic */ TextFieldState(String str, long j10, TextUndoManager textUndoManager, AbstractC9972n abstractC9972n) {
        this(str, j10, textUndoManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void commitEditAsUser(InputTransformation inputTransformation, boolean z10, TextFieldEditUndoBehavior textFieldEditUndoBehavior) {
        TextFieldCharSequence value$foundation_release = getValue$foundation_release();
        if (this.mainBuffer.getChangeTracker$foundation_release().getChangeCount() == 0 && TextRange.m32959equalsimpl0(value$foundation_release.m27947getSelectiond9O1mEE(), this.mainBuffer.m27939getSelectiond9O1mEE())) {
            if (AbstractC9979u.m20289b(value$foundation_release.m27946getCompositionMzsxiRA(), this.mainBuffer.m27937getCompositionMzsxiRA$foundation_release()) && AbstractC9979u.m20289b(value$foundation_release.getHighlight(), this.mainBuffer.getHighlight$foundation_release()) && AbstractC9979u.m20289b(value$foundation_release.getComposingAnnotations(), this.mainBuffer.getComposingAnnotations$foundation_release())) {
                return;
            }
            updateValueAndNotifyListeners(getValue$foundation_release(), new TextFieldCharSequence(this.mainBuffer.toString(), this.mainBuffer.m27939getSelectiond9O1mEE(), this.mainBuffer.m27937getCompositionMzsxiRA$foundation_release(), this.mainBuffer.getHighlight$foundation_release(), TextFieldStateKt.m27951finalizeComposingAnnotationsitr0ztk(this.mainBuffer.m27937getCompositionMzsxiRA$foundation_release(), this.mainBuffer.getComposingAnnotations$foundation_release()), null), z10);
            return;
        }
        boolean z11 = false;
        boolean z12 = this.mainBuffer.getChangeTracker$foundation_release().getChangeCount() != 0;
        TextFieldCharSequence textFieldCharSequence = new TextFieldCharSequence(this.mainBuffer.toString(), this.mainBuffer.m27939getSelectiond9O1mEE(), this.mainBuffer.m27937getCompositionMzsxiRA$foundation_release(), this.mainBuffer.getHighlight$foundation_release(), TextFieldStateKt.m27951finalizeComposingAnnotationsitr0ztk(this.mainBuffer.m27937getCompositionMzsxiRA$foundation_release(), this.mainBuffer.getComposingAnnotations$foundation_release()), null);
        if (inputTransformation == null) {
            if (z12 && z10) {
                z11 = true;
            }
            updateValueAndNotifyListeners(value$foundation_release, textFieldCharSequence, z11);
            recordEditForUndo(value$foundation_release, textFieldCharSequence, this.mainBuffer.getChangeTracker$foundation_release(), textFieldEditUndoBehavior);
            return;
        }
        TextFieldBuffer textFieldBuffer = new TextFieldBuffer(textFieldCharSequence, this.mainBuffer.getChangeTracker$foundation_release(), value$foundation_release, null, 8, null);
        inputTransformation.transformInput(textFieldBuffer);
        boolean zM23245w = AbstractC10819z.m23245w(textFieldBuffer.asCharSequence(), textFieldCharSequence);
        boolean z13 = !zM23245w;
        boolean zM32959equalsimpl0 = TextRange.m32959equalsimpl0(textFieldBuffer.m27939getSelectiond9O1mEE(), textFieldCharSequence.m27947getSelectiond9O1mEE());
        boolean z14 = !zM32959equalsimpl0;
        if (zM23245w && zM32959equalsimpl0) {
            updateValueAndNotifyListeners(value$foundation_release, TextFieldBuffer.m27936toTextFieldCharSequenceI88jaVs$foundation_release$default(textFieldBuffer, 0L, textFieldCharSequence.m27946getCompositionMzsxiRA(), null, 5, null), z10);
        } else {
            syncMainBufferToTemporaryBuffer$foundation_release(textFieldBuffer, z13, z14);
        }
        recordEditForUndo(value$foundation_release, getValue$foundation_release(), textFieldBuffer.getChanges(), textFieldEditUndoBehavior);
    }

    public static /* synthetic */ void commitEditAsUser$default(TextFieldState textFieldState, InputTransformation inputTransformation, boolean z10, TextFieldEditUndoBehavior textFieldEditUndoBehavior, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        textFieldState.commitEditAsUser(inputTransformation, z10, textFieldEditUndoBehavior);
    }

    public static /* synthetic */ void editAsUser$foundation_release$default(TextFieldState textFieldState, InputTransformation inputTransformation, boolean z10, TextFieldEditUndoBehavior textFieldEditUndoBehavior, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        interfaceC9540l.invoke(textFieldState.getMainBuffer$foundation_release());
        textFieldState.commitEditAsUser(inputTransformation, z10, textFieldEditUndoBehavior);
    }

    @VisibleForTesting
    public static /* synthetic */ void getMainBuffer$foundation_release$annotations() {
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getUndoState$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isEditing() {
        return ((Boolean) this.isEditing$delegate.getValue()).booleanValue();
    }

    private final void recordEditForUndo(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, TextFieldBuffer.ChangeList changeList, TextFieldEditUndoBehavior textFieldEditUndoBehavior) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[textFieldEditUndoBehavior.ordinal()];
        if (i10 == 1) {
            this.textUndoManager.clearHistory();
        } else if (i10 == 2) {
            TextUndoManagerKt.recordChanges(this.textUndoManager, textFieldCharSequence, textFieldCharSequence2, changeList, true);
        } else {
            if (i10 != 3) {
                return;
            }
            TextUndoManagerKt.recordChanges(this.textUndoManager, textFieldCharSequence, textFieldCharSequence2, changeList, false);
        }
    }

    private final void setEditing(boolean z10) {
        this.isEditing$delegate.setValue(Boolean.valueOf(z10));
    }

    private final void setValue(TextFieldCharSequence textFieldCharSequence) {
        this.value$delegate.setValue(textFieldCharSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateValueAndNotifyListeners(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z10) {
        setValue(textFieldCharSequence2);
        finishEditing();
        MutableVector<NotifyImeListener> mutableVector = this.notifyImeListeners;
        NotifyImeListener[] notifyImeListenerArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            notifyImeListenerArr[i10].onChange(textFieldCharSequence, textFieldCharSequence2, (!z10 || textFieldCharSequence.contentEquals(textFieldCharSequence2) || textFieldCharSequence.m27946getCompositionMzsxiRA() == null) ? false : true);
        }
    }

    public final void addNotifyImeListener$foundation_release(NotifyImeListener notifyImeListener) {
        this.notifyImeListeners.add(notifyImeListener);
    }

    public final void commitEdit(TextFieldBuffer textFieldBuffer) {
        boolean z10 = textFieldBuffer.getChanges().getChangeCount() > 0;
        boolean zM32959equalsimpl0 = true ^ TextRange.m32959equalsimpl0(textFieldBuffer.m27939getSelectiond9O1mEE(), this.mainBuffer.m27939getSelectiond9O1mEE());
        if (z10) {
            this.textUndoManager.clearHistory();
        }
        syncMainBufferToTemporaryBuffer$foundation_release(textFieldBuffer, z10, zM32959equalsimpl0);
    }

    public final void edit(InterfaceC9540l interfaceC9540l) {
        TextFieldBuffer textFieldBufferStartEdit = startEdit();
        try {
            interfaceC9540l.invoke(textFieldBufferStartEdit);
            commitEdit(textFieldBufferStartEdit);
        } finally {
            AbstractC9977s.m20286b(1);
            finishEditing();
            AbstractC9977s.m20285a(1);
        }
    }

    public final void editAsUser$foundation_release(InputTransformation inputTransformation, boolean z10, TextFieldEditUndoBehavior textFieldEditUndoBehavior, InterfaceC9540l interfaceC9540l) {
        getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        interfaceC9540l.invoke(getMainBuffer$foundation_release());
        commitEditAsUser(inputTransformation, z10, textFieldEditUndoBehavior);
    }

    public final void editWithNoSideEffects$foundation_release(InterfaceC9540l interfaceC9540l) {
        getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        interfaceC9540l.invoke(getMainBuffer$foundation_release());
        updateValueAndNotifyListeners(getValue$foundation_release(), TextFieldBuffer.m27936toTextFieldCharSequenceI88jaVs$foundation_release$default(getMainBuffer$foundation_release(), 0L, null, null, 7, null), true);
    }

    public final void finishEditing() {
        setEditing(false);
    }

    /* renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final TextRange m27948getCompositionMzsxiRA() {
        return getValue$foundation_release().m27946getCompositionMzsxiRA();
    }

    public final TextFieldBuffer getMainBuffer$foundation_release() {
        return this.mainBuffer;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m27949getSelectiond9O1mEE() {
        return getValue$foundation_release().m27947getSelectiond9O1mEE();
    }

    public final CharSequence getText() {
        return getValue$foundation_release().getText();
    }

    public final TextUndoManager getTextUndoManager$foundation_release() {
        return this.textUndoManager;
    }

    @ExperimentalFoundationApi
    public final UndoState getUndoState() {
        return this.undoState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextFieldCharSequence getValue$foundation_release() {
        return (TextFieldCharSequence) this.value$delegate.getValue();
    }

    public final void removeNotifyImeListener$foundation_release(NotifyImeListener notifyImeListener) {
        this.notifyImeListeners.remove(notifyImeListener);
    }

    public final void setMainBuffer$foundation_release(TextFieldBuffer textFieldBuffer) {
        this.mainBuffer = textFieldBuffer;
    }

    public final TextFieldBuffer startEdit() {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        InterfaceC9540l readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
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
    public final void syncMainBufferToTemporaryBuffer$foundation_release(TextFieldBuffer textFieldBuffer, boolean z10, boolean z11) {
        TextFieldCharSequence textFieldCharSequenceM27936toTextFieldCharSequenceI88jaVs$foundation_release$default = TextFieldBuffer.m27936toTextFieldCharSequenceI88jaVs$foundation_release$default(this.mainBuffer, 0L, null, null, 7, null);
        if (z10) {
            this.mainBuffer = new TextFieldBuffer(new TextFieldCharSequence(textFieldBuffer.toString(), textFieldBuffer.m27939getSelectiond9O1mEE(), null, null, null, 28, null), null, null, null, 14, null);
        } else if (z11) {
            this.mainBuffer.m27941setSelection5zctL8(TextRangeKt.TextRange(TextRange.m32966getStartimpl(textFieldBuffer.m27939getSelectiond9O1mEE()), TextRange.m32961getEndimpl(textFieldBuffer.m27939getSelectiond9O1mEE())));
        }
        if (z10 || z11 || !AbstractC9979u.m20289b(textFieldCharSequenceM27936toTextFieldCharSequenceI88jaVs$foundation_release$default.m27946getCompositionMzsxiRA(), textFieldBuffer.m27937getCompositionMzsxiRA$foundation_release())) {
            this.mainBuffer.commitComposition$foundation_release();
        }
        updateValueAndNotifyListeners(textFieldCharSequenceM27936toTextFieldCharSequenceI88jaVs$foundation_release$default, TextFieldBuffer.m27936toTextFieldCharSequenceI88jaVs$foundation_release$default(this.mainBuffer, 0L, null, null, 7, null), true);
    }

    public String toString() {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        InterfaceC9540l readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            return "TextFieldState(selection=" + ((Object) TextRange.m32969toStringimpl(m27949getSelectiond9O1mEE())) + ", text=\"" + ((Object) getText()) + "\")";
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }

    public /* synthetic */ TextFieldState(String str, long j10, AbstractC9972n abstractC9972n) {
        this(str, j10);
    }

    private TextFieldState(String str, long j10, TextUndoManager textUndoManager) {
        this.textUndoManager = textUndoManager;
        this.mainBuffer = new TextFieldBuffer(new TextFieldCharSequence(str, TextRangeKt.m32972coerceIn8ffj60Q(j10, 0, str.length()), null, null, null, 28, null), null, null, null, 14, null);
        this.isEditing$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldCharSequence(str, j10, null, null, null, 28, null), null, 2, null);
        this.undoState = new UndoState(this);
        this.notifyImeListeners = new MutableVector<>(new NotifyImeListener[16], 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextFieldState(String str, long j10, int i10, AbstractC9972n abstractC9972n) {
        str = (i10 & 1) != 0 ? "" : str;
        this(str, (i10 & 2) != 0 ? TextRangeKt.TextRange(str.length()) : j10, (AbstractC9972n) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextFieldState(String str, long j10) {
        this(str, j10, new TextUndoManager(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), (AbstractC9972n) null);
    }
}
