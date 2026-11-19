package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10937b0;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10978w;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class UndoManager<T> {
    private final int capacity;
    private SnapshotStateList<T> redoStack;
    private SnapshotStateList<T> undoStack;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final /* synthetic */ <T> Saver<UndoManager<T>, Object> createSaver(final Saver<T, Object> saver) {
            AbstractC9979u.m20299l();
            return new Saver<UndoManager<T>, Object>() { // from class: androidx.compose.foundation.text.input.internal.undo.UndoManager$Companion$createSaver$1
                @Override // androidx.compose.runtime.saveable.Saver
                public UndoManager<T> restore(Object obj) {
                    AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                    List list = (List) obj;
                    int iIntValue = ((Number) list.get(0)).intValue();
                    int iIntValue2 = ((Number) list.get(1)).intValue();
                    int iIntValue3 = ((Number) list.get(2)).intValue();
                    Saver<T, Object> saver2 = saver;
                    List listM24124c = AbstractC10976v.m24124c();
                    int i10 = 3;
                    while (i10 < iIntValue2 + 3) {
                        T tRestore = saver2.restore(list.get(i10));
                        AbstractC9979u.m20291d(tRestore);
                        listM24124c.add(tRestore);
                        i10++;
                    }
                    List listM24122a = AbstractC10976v.m24122a(listM24124c);
                    Saver<T, Object> saver3 = saver;
                    List listM24124c2 = AbstractC10976v.m24124c();
                    while (i10 < iIntValue2 + iIntValue3 + 3) {
                        T tRestore2 = saver3.restore(list.get(i10));
                        AbstractC9979u.m20291d(tRestore2);
                        listM24124c2.add(tRestore2);
                        i10++;
                    }
                    return new UndoManager<>(listM24122a, AbstractC10976v.m24122a(listM24124c2), iIntValue);
                }

                @Override // androidx.compose.runtime.saveable.Saver
                public Object save(SaverScope saverScope, UndoManager<T> undoManager) {
                    Saver<T, Object> saver2 = saver;
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
        }

        private Companion() {
        }
    }

    public UndoManager() {
        this(null, null, 0, 7, null);
    }

    public final void clearHistory() {
        this.undoStack.clear();
        this.redoStack.clear();
    }

    public final boolean getCanRedo$foundation_release() {
        return !this.redoStack.isEmpty();
    }

    public final boolean getCanUndo$foundation_release() {
        return !this.undoStack.isEmpty();
    }

    public final int getSize() {
        return this.undoStack.size() + this.redoStack.size();
    }

    public final void record(T t10) {
        this.redoStack.clear();
        while (getSize() > this.capacity - 1) {
            AbstractC10937b0.m23868M(this.undoStack);
        }
        this.undoStack.add(t10);
    }

    public final T redo() {
        if (!getCanRedo$foundation_release()) {
            InlineClassHelperKt.throwIllegalStateException("It's an error to call redo while there is nothing to redo. Please first check `canRedo` value before calling the `redo` function.");
        }
        T t10 = (T) AbstractC10937b0.m23870O(this.redoStack);
        this.undoStack.add(t10);
        return t10;
    }

    public final T undo() {
        if (!getCanUndo$foundation_release()) {
            InlineClassHelperKt.throwIllegalStateException("It's an error to call undo while there is nothing to undo. Please first check `canUndo` value before calling the `undo` function.");
        }
        T t10 = (T) AbstractC10937b0.m23870O(this.undoStack);
        this.redoStack.add(t10);
        return t10;
    }

    public UndoManager(List<? extends T> list, List<? extends T> list2, int i10) {
        this.capacity = i10;
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(list);
        this.undoStack = snapshotStateList;
        SnapshotStateList<T> snapshotStateList2 = new SnapshotStateList<>();
        snapshotStateList2.addAll(list2);
        this.redoStack = snapshotStateList2;
        if (!(i10 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Capacity must be a positive integer");
        }
        if (getSize() <= i10) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Initial list of undo and redo operations have a size greater than the given capacity.");
    }

    public /* synthetic */ UndoManager(List list, List list2, int i10, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? AbstractC10978w.m24136n() : list, (i11 & 2) != 0 ? AbstractC10978w.m24136n() : list2, (i11 & 4) != 0 ? 100 : i10);
    }
}
