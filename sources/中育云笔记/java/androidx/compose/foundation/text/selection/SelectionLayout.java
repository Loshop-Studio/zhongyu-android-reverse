package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public interface SelectionLayout {
    LongObjectMap<Selection> createSubSelections(Selection selection);

    void forEachMiddleInfo(InterfaceC9540l interfaceC9540l);

    CrossStatus getCrossStatus();

    SelectableInfo getCurrentInfo();

    SelectableInfo getEndInfo();

    int getEndSlot();

    SelectableInfo getFirstInfo();

    SelectableInfo getLastInfo();

    Selection getPreviousSelection();

    int getSize();

    SelectableInfo getStartInfo();

    int getStartSlot();

    boolean isStartHandle();

    boolean shouldRecomputeSelection(SelectionLayout selectionLayout);
}
