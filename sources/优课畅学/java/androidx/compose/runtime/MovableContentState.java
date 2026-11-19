package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.collection.ExtensionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
@InternalComposeApi
/* loaded from: classes2.dex */
public final class MovableContentState {
    public static final int $stable = 8;
    private final SlotTable slotTable;

    public MovableContentState(SlotTable slotTable) {
        this.slotTable = slotTable;
    }

    private static final void extractNestedStates$lambda$3$closeToGroupContaining(SlotWriter slotWriter, int i10) {
        while (slotWriter.getParent() >= 0 && slotWriter.getCurrentGroupEnd() <= i10) {
            slotWriter.skipToGroupEnd();
            slotWriter.endGroup();
        }
    }

    private static final void extractNestedStates$lambda$3$openParent(SlotWriter slotWriter, int i10) {
        extractNestedStates$lambda$3$closeToGroupContaining(slotWriter, i10);
        while (slotWriter.getCurrentGroup() != i10 && !slotWriter.isGroupEnd()) {
            if (i10 < ComposerKt.getNextGroup(slotWriter)) {
                slotWriter.startGroup();
            } else {
                slotWriter.skipGroup();
            }
        }
        if (!(slotWriter.getCurrentGroup() == i10)) {
            ComposerKt.composeImmediateRuntimeError("Unexpected slot table structure");
        }
        slotWriter.startGroup();
    }

    public final ScatterMap<MovableContentStateReference, MovableContentState> extractNestedStates$runtime_release(Applier<?> applier, ObjectList<MovableContentStateReference> objectList) {
        Object[] objArr = objectList.content;
        int i10 = objectList._size;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            if (this.slotTable.ownsAnchor(((MovableContentStateReference) objArr[i11]).getAnchor$runtime_release())) {
                i11++;
            } else {
                MutableObjectList mutableObjectList = new MutableObjectList(0, 1, null);
                Object[] objArr2 = objectList.content;
                int i12 = objectList._size;
                for (int i13 = 0; i13 < i12; i13++) {
                    Object obj = objArr2[i13];
                    if (this.slotTable.ownsAnchor(((MovableContentStateReference) obj).getAnchor$runtime_release())) {
                        mutableObjectList.add(obj);
                    }
                }
                objectList = mutableObjectList;
            }
        }
        ObjectList objectListSortedBy = ExtensionsKt.sortedBy(objectList, new InterfaceC10570l() { // from class: androidx.compose.runtime.MovableContentState$extractNestedStates$referencesToExtract$2
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final Integer invoke(MovableContentStateReference movableContentStateReference) {
                return Integer.valueOf(this.this$0.getSlotTable$runtime_release().anchorIndex(movableContentStateReference.getAnchor$runtime_release()));
            }
        });
        if (objectListSortedBy.isEmpty()) {
            return ScatterMapKt.emptyScatterMap();
        }
        MutableScatterMap mutableScatterMapMutableScatterMapOf = ScatterMapKt.mutableScatterMapOf();
        SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
        try {
            Object[] objArr3 = objectListSortedBy.content;
            int i14 = objectListSortedBy._size;
            for (int i15 = 0; i15 < i14; i15++) {
                MovableContentStateReference movableContentStateReference = (MovableContentStateReference) objArr3[i15];
                int iAnchorIndex = slotWriterOpenWriter.anchorIndex(movableContentStateReference.getAnchor$runtime_release());
                int iParent = slotWriterOpenWriter.parent(iAnchorIndex);
                extractNestedStates$lambda$3$closeToGroupContaining(slotWriterOpenWriter, iParent);
                extractNestedStates$lambda$3$openParent(slotWriterOpenWriter, iParent);
                slotWriterOpenWriter.advanceBy(iAnchorIndex - slotWriterOpenWriter.getCurrentGroup());
                mutableScatterMapMutableScatterMapOf.set(movableContentStateReference, ComposerKt.extractMovableContentAtCurrent(movableContentStateReference.getComposition$runtime_release(), movableContentStateReference, slotWriterOpenWriter, applier));
            }
            extractNestedStates$lambda$3$closeToGroupContaining(slotWriterOpenWriter, Integer.MAX_VALUE);
            C8736p c8736p = C8736p.f16368a;
            slotWriterOpenWriter.close(true);
            return mutableScatterMapMutableScatterMapOf;
        } catch (Throwable th) {
            slotWriterOpenWriter.close(false);
            throw th;
        }
    }

    public final SlotTable getSlotTable$runtime_release() {
        return this.slotTable;
    }
}
