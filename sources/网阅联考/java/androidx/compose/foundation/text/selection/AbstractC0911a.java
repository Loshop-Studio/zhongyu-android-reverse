package androidx.compose.foundation.text.selection;

import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.layout.LayoutCoordinates;
import kotlin.Pair;

/* renamed from: androidx.compose.foundation.text.selection.a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0911a {
    /* renamed from: a */
    public static /* synthetic */ Pair m262a(Selectable selectable, long j4, long j5, Offset offset, boolean z3, LayoutCoordinates layoutCoordinates, SelectionAdjustment selectionAdjustment, Selection selection, int i4, Object obj) {
        if (obj == null) {
            return selectable.mo7708updateSelectionqCDeeow(j4, j5, offset, (i4 & 8) != 0 ? true : z3, layoutCoordinates, selectionAdjustment, (i4 & 64) != 0 ? null : selection);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateSelection-qCDeeow");
    }
}
