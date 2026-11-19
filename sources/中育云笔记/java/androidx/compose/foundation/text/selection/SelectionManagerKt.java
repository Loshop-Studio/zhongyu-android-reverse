package androidx.compose.foundation.text.selection;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.geometry.RectKt;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.layout.LayoutCoordinatesKt;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.unit.IntSize;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;

/* loaded from: classes.dex */
public final class SelectionManagerKt {
    private static final Rect invertedInfiniteRect = new Rect(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.SelectionStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.Cursor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m28266calculateSelectionMagnifierCenterAndroidO0kMr_c(SelectionManager selectionManager, long j10) {
        Selection selection = selectionManager.getSelection();
        if (selection == null) {
            return Offset.Companion.m30652getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = selectionManager.getDraggingHandle();
        int i10 = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i10 == -1) {
            return Offset.Companion.m30652getUnspecifiedF1C5BW0();
        }
        if (i10 == 1) {
            return m28268getMagnifierCenterJVtK1S4(selectionManager, j10, selection.getStart());
        }
        if (i10 == 2) {
            return m28268getMagnifierCenterJVtK1S4(selectionManager, j10, selection.getEnd());
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("SelectionContainer does not support cursor");
    }

    /* renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    public static final boolean m28267containsInclusiveUv8p0NA(Rect rect, long j10) {
        float left = rect.getLeft();
        float right = rect.getRight();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        if (left > fIntBitsToFloat || fIntBitsToFloat > right) {
            return false;
        }
        float top2 = rect.getTop();
        float bottom = rect.getBottom();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return top2 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= bottom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> firstAndLast(List<? extends T> list) {
        int size = list.size();
        return (size == 0 || size == 1) ? list : AbstractC10978w.m24139q(AbstractC10947g0.m23944m0(list), AbstractC10947g0.m23956y0(list));
    }

    /* renamed from: getMagnifierCenter-JVtK1S4, reason: not valid java name */
    private static final long m28268getMagnifierCenterJVtK1S4(SelectionManager selectionManager, long j10, Selection.AnchorInfo anchorInfo) {
        float fM21760m;
        Selectable anchorSelectable$foundation_release = selectionManager.getAnchorSelectable$foundation_release(anchorInfo);
        if (anchorSelectable$foundation_release == null) {
            return Offset.Companion.m30652getUnspecifiedF1C5BW0();
        }
        LayoutCoordinates containerLayoutCoordinates = selectionManager.getContainerLayoutCoordinates();
        if (containerLayoutCoordinates == null) {
            return Offset.Companion.m30652getUnspecifiedF1C5BW0();
        }
        LayoutCoordinates layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return Offset.Companion.m30652getUnspecifiedF1C5BW0();
        }
        int offset = anchorInfo.getOffset();
        if (offset > anchorSelectable$foundation_release.getLastVisibleOffset()) {
            return Offset.Companion.m30652getUnspecifiedF1C5BW0();
        }
        Offset offsetM28251getCurrentDragPosition_m7T9E = selectionManager.m28251getCurrentDragPosition_m7T9E();
        AbstractC9979u.m20291d(offsetM28251getCurrentDragPosition_m7T9E);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (layoutCoordinates.mo32238localPositionOfR5De75A(containerLayoutCoordinates, offsetM28251getCurrentDragPosition_m7T9E.m30647unboximpl()) >> 32));
        long jMo28214getRangeOfLineContainingjx7JFs = anchorSelectable$foundation_release.mo28214getRangeOfLineContainingjx7JFs(offset);
        if (TextRange.m32960getCollapsedimpl(jMo28214getRangeOfLineContainingjx7JFs)) {
            fM21760m = anchorSelectable$foundation_release.getLineLeft(offset);
        } else {
            float lineLeft = anchorSelectable$foundation_release.getLineLeft(TextRange.m32966getStartimpl(jMo28214getRangeOfLineContainingjx7JFs));
            float lineRight = anchorSelectable$foundation_release.getLineRight(TextRange.m32961getEndimpl(jMo28214getRangeOfLineContainingjx7JFs) - 1);
            fM21760m = AbstractC10410o.m21760m(fIntBitsToFloat, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
        }
        if (fM21760m == -1.0f) {
            return Offset.Companion.m30652getUnspecifiedF1C5BW0();
        }
        if (!IntSize.m33670equalsimpl0(j10, IntSize.Companion.m33677getZeroYbymL2g()) && Math.abs(fIntBitsToFloat - fM21760m) > ((int) (j10 >> 32)) / 2) {
            return Offset.Companion.m30652getUnspecifiedF1C5BW0();
        }
        if (anchorSelectable$foundation_release.getCenterYForOffset(offset) == -1.0f) {
            return Offset.Companion.m30652getUnspecifiedF1C5BW0();
        }
        return containerLayoutCoordinates.mo32238localPositionOfR5De75A(layoutCoordinates, Offset.m30629constructorimpl((Float.floatToRawIntBits(fM21760m) << 32) | (4294967295L & Float.floatToRawIntBits(r9))));
    }

    @VisibleForTesting
    public static final Rect getSelectedRegionRect(List<? extends Pair<? extends Selectable, Selection>> list, LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        int[] iArr;
        List<? extends Pair<? extends Selectable, Selection>> list2 = list;
        if (list2.isEmpty()) {
            return invertedInfiniteRect;
        }
        Rect rect = invertedInfiniteRect;
        float fComponent1 = rect.component1();
        float fComponent2 = rect.component2();
        float fComponent3 = rect.component3();
        float fComponent4 = rect.component4();
        int size = list2.size();
        char c10 = 0;
        int i10 = 0;
        while (i10 < size) {
            Pair<? extends Selectable, Selection> pair = list2.get(i10);
            Selectable selectable = (Selectable) pair.m20048a();
            Selection selection = (Selection) pair.m20049c();
            int offset = selection.getStart().getOffset();
            int offset2 = selection.getEnd().getOffset();
            if (offset != offset2 && (layoutCoordinates2 = selectable.getLayoutCoordinates()) != null) {
                int iMin = Math.min(offset, offset2);
                int iMax = Math.max(offset, offset2) - 1;
                if (iMin == iMax) {
                    iArr = new int[1];
                    iArr[c10] = iMin;
                } else {
                    int[] iArr2 = new int[2];
                    iArr2[c10] = iMin;
                    iArr2[1] = iMax;
                    iArr = iArr2;
                }
                Rect rect2 = invertedInfiniteRect;
                float fComponent12 = rect2.component1();
                float fComponent22 = rect2.component2();
                float fComponent32 = rect2.component3();
                float fComponent42 = rect2.component4();
                int length = iArr.length;
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i11;
                    Rect boundingBox = selectable.getBoundingBox(iArr[i12]);
                    fComponent12 = Math.min(fComponent12, boundingBox.getLeft());
                    fComponent22 = Math.min(fComponent22, boundingBox.getTop());
                    fComponent32 = Math.max(fComponent32, boundingBox.getRight());
                    fComponent42 = Math.max(fComponent42, boundingBox.getBottom());
                    i11 = i12 + 1;
                }
                long jM30629constructorimpl = Offset.m30629constructorimpl((Float.floatToRawIntBits(fComponent12) << 32) | (Float.floatToRawIntBits(fComponent22) & 4294967295L));
                long jM30629constructorimpl2 = Offset.m30629constructorimpl((Float.floatToRawIntBits(fComponent42) & 4294967295L) | (Float.floatToRawIntBits(fComponent32) << 32));
                long jMo32238localPositionOfR5De75A = layoutCoordinates.mo32238localPositionOfR5De75A(layoutCoordinates2, jM30629constructorimpl);
                long jMo32238localPositionOfR5De75A2 = layoutCoordinates.mo32238localPositionOfR5De75A(layoutCoordinates2, jM30629constructorimpl2);
                fComponent1 = Math.min(fComponent1, Float.intBitsToFloat((int) (jMo32238localPositionOfR5De75A >> 32)));
                fComponent2 = Math.min(fComponent2, Float.intBitsToFloat((int) (jMo32238localPositionOfR5De75A & 4294967295L)));
                fComponent3 = Math.max(fComponent3, Float.intBitsToFloat((int) (jMo32238localPositionOfR5De75A2 >> 32)));
                fComponent4 = Math.max(fComponent4, Float.intBitsToFloat((int) (jMo32238localPositionOfR5De75A2 & 4294967295L)));
            }
            i10++;
            list2 = list;
            c10 = 0;
        }
        return new Rect(fComponent1, fComponent2, fComponent3, fComponent4);
    }

    public static final Selection merge(Selection selection, Selection selection2) {
        Selection selectionMerge;
        return (selection == null || (selectionMerge = selection.merge(selection2)) == null) ? selection2 : selectionMerge;
    }

    public static final Rect visibleBounds(LayoutCoordinates layoutCoordinates) {
        Rect rectBoundsInWindow = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates);
        return RectKt.m30675Rect0a9Yr6o(layoutCoordinates.mo32246windowToLocalMKHz9U(rectBoundsInWindow.m30672getTopLeftF1C5BW0()), layoutCoordinates.mo32246windowToLocalMKHz9U(rectBoundsInWindow.m30666getBottomRightF1C5BW0()));
    }
}
