package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.undo.TextUndoOperation;
import androidx.compose.foundation.text.input.internal.undo.TextUndoOperationKt;
import androidx.compose.foundation.text.input.internal.undo.UndoManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10978w;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextUndoManager {
    private final MutableState stagingUndo$delegate;
    private final UndoManager<TextUndoOperation> undoManager;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {

        @StabilityInferred(parameters = 0)
        public static final class Saver implements androidx.compose.runtime.saveable.Saver<TextUndoManager, Object> {
            public static final int $stable;
            public static final Saver INSTANCE = new Saver();
            private static final androidx.compose.runtime.saveable.Saver<UndoManager<TextUndoOperation>, Object> undoManagerSaver;

            static {
                UndoManager.Companion companion = UndoManager.Companion;
                final androidx.compose.runtime.saveable.Saver<TextUndoOperation, Object> saver = TextUndoOperation.Companion.getSaver();
                undoManagerSaver = new androidx.compose.runtime.saveable.Saver<UndoManager<TextUndoOperation>, Object>() { // from class: androidx.compose.foundation.text.input.TextUndoManager$Companion$Saver$special$$inlined$createSaver$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // androidx.compose.runtime.saveable.Saver
                    public UndoManager<TextUndoOperation> restore(Object obj) {
                        AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list = (List) obj;
                        int iIntValue = ((Number) list.get(0)).intValue();
                        int iIntValue2 = ((Number) list.get(1)).intValue();
                        int iIntValue3 = ((Number) list.get(2)).intValue();
                        Saver saver2 = saver;
                        List listM24124c = AbstractC10976v.m24124c();
                        int i10 = 3;
                        while (i10 < iIntValue2 + 3) {
                            Object objRestore = saver2.restore(list.get(i10));
                            AbstractC9979u.m20291d(objRestore);
                            listM24124c.add(objRestore);
                            i10++;
                        }
                        List listM24122a = AbstractC10976v.m24122a(listM24124c);
                        Saver saver3 = saver;
                        List listM24124c2 = AbstractC10976v.m24124c();
                        while (i10 < iIntValue2 + iIntValue3 + 3) {
                            Object objRestore2 = saver3.restore(list.get(i10));
                            AbstractC9979u.m20291d(objRestore2);
                            listM24124c2.add(objRestore2);
                            i10++;
                        }
                        return new UndoManager<>(listM24122a, AbstractC10976v.m24122a(listM24124c2), iIntValue);
                    }

                    @Override // androidx.compose.runtime.saveable.Saver
                    public Object save(SaverScope saverScope, UndoManager<TextUndoOperation> undoManager) {
                        Saver saver2 = saver;
                        List listM24124c = AbstractC10976v.m24124c();
                        listM24124c.add(Integer.valueOf(((UndoManager) undoManager).capacity));
                        listM24124c.add(Integer.valueOf(((UndoManager) undoManager).undoStack.size()));
                        listM24124c.add(Integer.valueOf(((UndoManager) undoManager).redoStack.size()));
                        SnapshotStateList snapshotStateList = ((UndoManager) undoManager).undoStack;
                        int size = snapshotStateList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            listM24124c.add(saver2.save(saverScope, snapshotStateList.get(i10)));
                        }
                        SnapshotStateList snapshotStateList2 = ((UndoManager) undoManager).redoStack;
                        int size2 = snapshotStateList2.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            listM24124c.add(saver2.save(saverScope, snapshotStateList2.get(i11)));
                        }
                        return AbstractC10976v.m24122a(listM24124c);
                    }
                };
                $stable = 8;
            }

            private Saver() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.compose.runtime.saveable.Saver
            public TextUndoManager restore(Object obj) {
                AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Object obj3 = list.get(1);
                TextUndoOperation textUndoOperationRestore = obj2 != null ? TextUndoOperation.Companion.getSaver().restore(obj2) : null;
                androidx.compose.runtime.saveable.Saver<UndoManager<TextUndoOperation>, Object> saver = undoManagerSaver;
                AbstractC9979u.m20291d(obj3);
                UndoManager<TextUndoOperation> undoManagerRestore = saver.restore(obj3);
                AbstractC9979u.m20291d(undoManagerRestore);
                return new TextUndoManager(textUndoOperationRestore, undoManagerRestore);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            public Object save(SaverScope saverScope, TextUndoManager textUndoManager) {
                TextUndoOperation stagingUndo = textUndoManager.getStagingUndo();
                return AbstractC10978w.m24139q(stagingUndo != null ? TextUndoOperation.Companion.getSaver().save(saverScope, stagingUndo) : null, undoManagerSaver.save(saverScope, textUndoManager.undoManager));
            }
        }

        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextUndoManager() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final void flush() {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        InterfaceC9540l readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            TextUndoOperation stagingUndo = getStagingUndo();
            if (stagingUndo != null) {
                this.undoManager.record(stagingUndo);
            }
            setStagingUndo(null);
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final TextUndoOperation getStagingUndo() {
        return (TextUndoOperation) this.stagingUndo$delegate.getValue();
    }

    private final void setStagingUndo(TextUndoOperation textUndoOperation) {
        this.stagingUndo$delegate.setValue(textUndoOperation);
    }

    public final void clearHistory() {
        setStagingUndo(null);
        this.undoManager.clearHistory();
    }

    public final boolean getCanRedo() {
        return this.undoManager.getCanRedo$foundation_release() && getStagingUndo() == null;
    }

    public final boolean getCanUndo() {
        return this.undoManager.getCanUndo$foundation_release() || getStagingUndo() != null;
    }

    public final void record(TextUndoOperation textUndoOperation) {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        InterfaceC9540l readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            TextUndoOperation stagingUndo = getStagingUndo();
            if (stagingUndo == null) {
                setStagingUndo(textUndoOperation);
                return;
            }
            TextUndoOperation textUndoOperationMerge = TextUndoManagerKt.merge(stagingUndo, textUndoOperation);
            if (textUndoOperationMerge != null) {
                setStagingUndo(textUndoOperationMerge);
            } else {
                flush();
                setStagingUndo(textUndoOperation);
            }
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }

    public final void redo(TextFieldState textFieldState) {
        if (getCanRedo()) {
            TextUndoOperationKt.redo(textFieldState, this.undoManager.redo());
        }
    }

    public final void undo(TextFieldState textFieldState) {
        if (getCanUndo()) {
            flush();
            TextUndoOperationKt.undo(textFieldState, this.undoManager.undo());
        }
    }

    public TextUndoManager(TextUndoOperation textUndoOperation, UndoManager<TextUndoOperation> undoManager) {
        this.undoManager = undoManager;
        this.stagingUndo$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(textUndoOperation, null, 2, null);
    }

    public /* synthetic */ TextUndoManager(TextUndoOperation textUndoOperation, UndoManager undoManager, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? null : textUndoOperation, (i10 & 2) != 0 ? new UndoManager(null, null, 100, 3, null) : undoManager);
    }
}
