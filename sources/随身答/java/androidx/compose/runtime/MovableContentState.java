package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.collection.ExtensionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J3\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00000\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0000¢\u0006\u0002\b\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m13413d2 = {"Landroidx/compose/runtime/MovableContentState;", "", "slotTable", "Landroidx/compose/runtime/SlotTable;", "(Landroidx/compose/runtime/SlotTable;)V", "getSlotTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "extractNestedStates", "Landroidx/collection/ScatterMap;", "Landroidx/compose/runtime/MovableContentStateReference;", "applier", "Landroidx/compose/runtime/Applier;", "references", "Landroidx/collection/ObjectList;", "extractNestedStates$runtime_release", "runtime_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@InternalComposeApi
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/MovableContentState\n+ 2 Extensions.kt\nandroidx/compose/runtime/collection/ExtensionsKt\n+ 3 ObjectList.kt\nandroidx/collection/ObjectList\n+ 4 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,4891:1\n29#2,8:4892\n37#2:4906\n287#3,6:4900\n287#3,6:4913\n919#4,2:4907\n174#5,4:4909\n179#5,3:4920\n1#6:4919\n4643#7,5:4923\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/MovableContentState\n*L\n422#1:4892,8\n422#1:4906\n422#1:4900,6\n445#1:4913,6\n422#1:4907,2\n426#1:4909,4\n426#1:4920,3\n426#1:4919\n442#1:4923,5\n*E\n"})
/* loaded from: classes2.dex */
public final class MovableContentState {
    public static final int $stable = 8;
    private final SlotTable slotTable;

    public MovableContentState(SlotTable slotTable) {
        this.slotTable = slotTable;
    }

    private static final void extractNestedStates$lambda$3$closeToGroupContaining(SlotWriter slotWriter, int i9) {
        while (slotWriter.getParent() >= 0 && slotWriter.getCurrentGroupEnd() <= i9) {
            slotWriter.skipToGroupEnd();
            slotWriter.endGroup();
        }
    }

    private static final void extractNestedStates$lambda$3$openParent(SlotWriter slotWriter, int i9) {
        extractNestedStates$lambda$3$closeToGroupContaining(slotWriter, i9);
        while (slotWriter.getCurrentGroup() != i9 && !slotWriter.isGroupEnd()) {
            if (i9 < ComposerKt.getNextGroup(slotWriter)) {
                slotWriter.startGroup();
            } else {
                slotWriter.skipGroup();
            }
        }
        if (!(slotWriter.getCurrentGroup() == i9)) {
            ComposerKt.composeImmediateRuntimeError("Unexpected slot table structure");
        }
        slotWriter.startGroup();
    }

    public final ScatterMap<MovableContentStateReference, MovableContentState> extractNestedStates$runtime_release(Applier<?> applier, ObjectList<MovableContentStateReference> references) {
        Object[] objArr = references.content;
        int i9 = references._size;
        int i10 = 0;
        while (true) {
            if (i10 >= i9) {
                break;
            }
            if (this.slotTable.ownsAnchor(((MovableContentStateReference) objArr[i10]).getAnchor())) {
                i10++;
            } else {
                MutableObjectList mutableObjectList = new MutableObjectList(0, 1, null);
                Object[] objArr2 = references.content;
                int i11 = references._size;
                for (int i12 = 0; i12 < i11; i12++) {
                    Object obj = objArr2[i12];
                    if (this.slotTable.ownsAnchor(((MovableContentStateReference) obj).getAnchor())) {
                        mutableObjectList.add(obj);
                    }
                }
                references = mutableObjectList;
            }
        }
        ObjectList objectListSortedBy = ExtensionsKt.sortedBy(references, new Function1<MovableContentStateReference, Integer>() { // from class: androidx.compose.runtime.MovableContentState$extractNestedStates$referencesToExtract$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Integer invoke(MovableContentStateReference movableContentStateReference) {
                return Integer.valueOf(this.this$0.getSlotTable().anchorIndex(movableContentStateReference.getAnchor()));
            }
        });
        if (objectListSortedBy.isEmpty()) {
            return ScatterMapKt.emptyScatterMap();
        }
        MutableScatterMap mutableScatterMapMutableScatterMapOf = ScatterMapKt.mutableScatterMapOf();
        SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
        try {
            Object[] objArr3 = objectListSortedBy.content;
            int i13 = objectListSortedBy._size;
            for (int i14 = 0; i14 < i13; i14++) {
                MovableContentStateReference movableContentStateReference = (MovableContentStateReference) objArr3[i14];
                int iAnchorIndex = slotWriterOpenWriter.anchorIndex(movableContentStateReference.getAnchor());
                int iParent = slotWriterOpenWriter.parent(iAnchorIndex);
                extractNestedStates$lambda$3$closeToGroupContaining(slotWriterOpenWriter, iParent);
                extractNestedStates$lambda$3$openParent(slotWriterOpenWriter, iParent);
                slotWriterOpenWriter.advanceBy(iAnchorIndex - slotWriterOpenWriter.getCurrentGroup());
                mutableScatterMapMutableScatterMapOf.set(movableContentStateReference, ComposerKt.extractMovableContentAtCurrent(movableContentStateReference.getComposition(), movableContentStateReference, slotWriterOpenWriter, applier));
            }
            extractNestedStates$lambda$3$closeToGroupContaining(slotWriterOpenWriter, Integer.MAX_VALUE);
            Unit unit = Unit.INSTANCE;
            slotWriterOpenWriter.close(true);
            return mutableScatterMapMutableScatterMapOf;
        } catch (Throwable th) {
            slotWriterOpenWriter.close(false);
            throw th;
        }
    }

    /* renamed from: getSlotTable$runtime_release, reason: from getter */
    public final SlotTable getSlotTable() {
        return this.slotTable;
    }
}
