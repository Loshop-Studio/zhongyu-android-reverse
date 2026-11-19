package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(m5109d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u001a\u0010\u0006\u001a\u00020\u0003*\u00020\u00072\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¨\u0006\b"}, m5110d2 = {"androidx/compose/foundation/text/input/internal/undo/UndoManager$Companion$createSaver$1", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/input/internal/undo/UndoManager;", "", RequestParameters.X_OSS_RESTORE, "value", "save", "Landroidx/compose/runtime/saveable/SaverScope;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = 176)
@SourceDebugExtension({"SMAP\nUndoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UndoManager.kt\nandroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion$createSaver$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,162:1\n34#2,4:163\n39#2:168\n34#2,6:169\n1#3:167\n*S KotlinDebug\n*F\n+ 1 UndoManager.kt\nandroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion$createSaver$1\n*L\n136#1:163,4\n136#1:168\n137#1:169,6\n*E\n"})
/* loaded from: classes.dex */
public final class UndoManager$Companion$createSaver$1<T> implements Saver<UndoManager<T>, Object> {
    final /* synthetic */ Saver<T, Object> $itemSaver;

    public UndoManager$Companion$createSaver$1(Saver<T, Object> saver) {
        this.$itemSaver = saver;
    }

    @Override // androidx.compose.runtime.saveable.Saver
    public UndoManager<T> restore(Object value) {
        AbstractC5830k.m5328e(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) value;
        int iIntValue = ((Number) list.get(0)).intValue();
        int iIntValue2 = ((Number) list.get(1)).intValue();
        int iIntValue3 = ((Number) list.get(2)).intValue();
        Saver<T, Object> saver = this.$itemSaver;
        ListBuilder listBuilderM5278q = AbstractC5806u.m5278q();
        int i = 3;
        while (i < iIntValue2 + 3) {
            T tRestore = saver.restore(list.get(i));
            AbstractC5830k.m5327d(tRestore);
            listBuilderM5278q.add(tRestore);
            i++;
        }
        List listBuild = listBuilderM5278q.build();
        Saver<T, Object> saver2 = this.$itemSaver;
        ListBuilder listBuilderM5278q2 = AbstractC5806u.m5278q();
        while (i < iIntValue2 + iIntValue3 + 3) {
            T tRestore2 = saver2.restore(list.get(i));
            AbstractC5830k.m5327d(tRestore2);
            listBuilderM5278q2.add(tRestore2);
            i++;
        }
        return new UndoManager<>(listBuild, listBuilderM5278q2.build(), iIntValue);
    }

    @Override // androidx.compose.runtime.saveable.Saver
    public Object save(SaverScope saverScope, UndoManager<T> undoManager) {
        Saver<T, Object> saver = this.$itemSaver;
        ListBuilder listBuilderM5278q = AbstractC5806u.m5278q();
        listBuilderM5278q.add(Integer.valueOf(((UndoManager) undoManager).capacity));
        listBuilderM5278q.add(Integer.valueOf(((UndoManager) undoManager).undoStack.size()));
        listBuilderM5278q.add(Integer.valueOf(((UndoManager) undoManager).redoStack.size()));
        SnapshotStateList snapshotStateList = ((UndoManager) undoManager).undoStack;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            listBuilderM5278q.add(saver.save(saverScope, snapshotStateList.get(i)));
        }
        SnapshotStateList snapshotStateList2 = ((UndoManager) undoManager).redoStack;
        int size2 = snapshotStateList2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            listBuilderM5278q.add(saver.save(saverScope, snapshotStateList2.get(i8)));
        }
        return listBuilderM5278q.build();
    }
}
