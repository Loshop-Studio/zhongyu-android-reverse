package androidx.compose.foundation.text.selection;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.TextLayoutResult;

/* loaded from: classes.dex */
public interface Selectable {
    void appendSelectableInfoToBuilder(SelectionLayoutBuilder selectionLayoutBuilder);

    Rect getBoundingBox(int i10);

    float getCenterYForOffset(int i10);

    /* renamed from: getHandlePosition-dBAh8RU */
    long mo21611getHandlePositiondBAh8RU(Selection selection, boolean z10);

    int getLastVisibleOffset();

    LayoutCoordinates getLayoutCoordinates();

    float getLineHeight(int i10);

    float getLineLeft(int i10);

    float getLineRight(int i10);

    /* renamed from: getRangeOfLineContaining--jx7JFs */
    long mo21612getRangeOfLineContainingjx7JFs(int i10);

    Selection getSelectAllSelection();

    long getSelectableId();

    AnnotatedString getText();

    TextLayoutResult textLayoutResult();
}
