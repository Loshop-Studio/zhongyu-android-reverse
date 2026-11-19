package androidx.compose.foundation.text.selection;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.geometry.RectKt;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.layout.LayoutCoordinatesKt;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.unit.IntSize;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;

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
    public static final long m21664calculateSelectionMagnifierCenterAndroidO0kMr_c(SelectionManager selectionManager, long j10) {
        Selection selection = selectionManager.getSelection();
        if (selection == null) {
            return Offset.Companion.m24050getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = selectionManager.getDraggingHandle();
        int i10 = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i10 == -1) {
            return Offset.Companion.m24050getUnspecifiedF1C5BW0();
        }
        if (i10 == 1) {
            return m21666getMagnifierCenterJVtK1S4(selectionManager, j10, selection.getStart());
        }
        if (i10 == 2) {
            return m21666getMagnifierCenterJVtK1S4(selectionManager, j10, selection.getEnd());
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("SelectionContainer does not support cursor");
    }

    /* renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    public static final boolean m21665containsInclusiveUv8p0NA(Rect rect, long j10) {
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
        return (size == 0 || size == 1) ? list : AbstractC8809v.m14774q(AbstractC8778f0.m14566l0(list), AbstractC8778f0.m14578x0(list));
    }

    /* renamed from: getMagnifierCenter-JVtK1S4, reason: not valid java name */
    private static final long m21666getMagnifierCenterJVtK1S4(SelectionManager selectionManager, long j10, Selection.AnchorInfo anchorInfo) {
        float fM13517l;
        Selectable anchorSelectable$foundation_release = selectionManager.getAnchorSelectable$foundation_release(anchorInfo);
        if (anchorSelectable$foundation_release == null) {
            return Offset.Companion.m24050getUnspecifiedF1C5BW0();
        }
        LayoutCoordinates containerLayoutCoordinates = selectionManager.getContainerLayoutCoordinates();
        if (containerLayoutCoordinates == null) {
            return Offset.Companion.m24050getUnspecifiedF1C5BW0();
        }
        LayoutCoordinates layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return Offset.Companion.m24050getUnspecifiedF1C5BW0();
        }
        int offset = anchorInfo.getOffset();
        if (offset > anchorSelectable$foundation_release.getLastVisibleOffset()) {
            return Offset.Companion.m24050getUnspecifiedF1C5BW0();
        }
        Offset offsetM21649getCurrentDragPosition_m7T9E = selectionManager.m21649getCurrentDragPosition_m7T9E();
        AbstractC9133u.m16130d(offsetM21649getCurrentDragPosition_m7T9E);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (layoutCoordinates.mo25636localPositionOfR5De75A(containerLayoutCoordinates, offsetM21649getCurrentDragPosition_m7T9E.m24045unboximpl()) >> 32));
        long jMo21612getRangeOfLineContainingjx7JFs = anchorSelectable$foundation_release.mo21612getRangeOfLineContainingjx7JFs(offset);
        if (TextRange.m26358getCollapsedimpl(jMo21612getRangeOfLineContainingjx7JFs)) {
            fM13517l = anchorSelectable$foundation_release.getLineLeft(offset);
        } else {
            float lineLeft = anchorSelectable$foundation_release.getLineLeft(TextRange.m26364getStartimpl(jMo21612getRangeOfLineContainingjx7JFs));
            float lineRight = anchorSelectable$foundation_release.getLineRight(TextRange.m26359getEndimpl(jMo21612getRangeOfLineContainingjx7JFs) - 1);
            fM13517l = AbstractC8323h.m13517l(fIntBitsToFloat, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
        }
        if (fM13517l == -1.0f) {
            return Offset.Companion.m24050getUnspecifiedF1C5BW0();
        }
        if (!IntSize.m27068equalsimpl0(j10, IntSize.Companion.m27075getZeroYbymL2g()) && Math.abs(fIntBitsToFloat - fM13517l) > ((int) (j10 >> 32)) / 2) {
            return Offset.Companion.m24050getUnspecifiedF1C5BW0();
        }
        if (anchorSelectable$foundation_release.getCenterYForOffset(offset) == -1.0f) {
            return Offset.Companion.m24050getUnspecifiedF1C5BW0();
        }
        return containerLayoutCoordinates.mo25636localPositionOfR5De75A(layoutCoordinates, Offset.m24027constructorimpl((Float.floatToRawIntBits(fM13517l) << 32) | (4294967295L & Float.floatToRawIntBits(r9))));
    }

    @VisibleForTesting
    public static final Rect getSelectedRegionRect(List<? extends Pair<? extends Selectable, Selection>> list, LayoutCoordinates layoutCoordinates) {
        int i10;
        LayoutCoordinates layoutCoordinates2;
        int[] iArr;
        if (list.isEmpty()) {
            return invertedInfiniteRect;
        }
        Rect rect = invertedInfiniteRect;
        float fComponent1 = rect.component1();
        float fComponent2 = rect.component2();
        float fComponent3 = rect.component3();
        float fComponent4 = rect.component4();
        int size = list.size();
        char c10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Pair<? extends Selectable, Selection> pair = list.get(i11);
            Selectable selectable = (Selectable) pair.m15903a();
            Selection selection = (Selection) pair.m15904b();
            int offset = selection.getStart().getOffset();
            int offset2 = selection.getEnd().getOffset();
            if (offset == offset2 || (layoutCoordinates2 = selectable.getLayoutCoordinates()) == null) {
                i10 = size;
            } else {
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
                i10 = size;
                int i12 = 0;
                while (i12 < length) {
                    int i13 = i12;
                    Rect boundingBox = selectable.getBoundingBox(iArr[i13]);
                    fComponent12 = Math.min(fComponent12, boundingBox.getLeft());
                    fComponent22 = Math.min(fComponent22, boundingBox.getTop());
                    fComponent32 = Math.max(fComponent32, boundingBox.getRight());
                    fComponent42 = Math.max(fComponent42, boundingBox.getBottom());
                    i12 = i13 + 1;
                }
                long jM24027constructorimpl = Offset.m24027constructorimpl((Float.floatToRawIntBits(fComponent12) << 32) | (Float.floatToRawIntBits(fComponent22) & 4294967295L));
                long jM24027constructorimpl2 = Offset.m24027constructorimpl((Float.floatToRawIntBits(fComponent32) << 32) | (Float.floatToRawIntBits(fComponent42) & 4294967295L));
                long jMo25636localPositionOfR5De75A = layoutCoordinates.mo25636localPositionOfR5De75A(layoutCoordinates2, jM24027constructorimpl);
                long jMo25636localPositionOfR5De75A2 = layoutCoordinates.mo25636localPositionOfR5De75A(layoutCoordinates2, jM24027constructorimpl2);
                fComponent1 = Math.min(fComponent1, Float.intBitsToFloat((int) (jMo25636localPositionOfR5De75A >> 32)));
                fComponent2 = Math.min(fComponent2, Float.intBitsToFloat((int) (jMo25636localPositionOfR5De75A & 4294967295L)));
                fComponent3 = Math.max(fComponent3, Float.intBitsToFloat((int) (jMo25636localPositionOfR5De75A2 >> 32)));
                fComponent4 = Math.max(fComponent4, Float.intBitsToFloat((int) (jMo25636localPositionOfR5De75A2 & 4294967295L)));
            }
            i11++;
            size = i10;
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
        return RectKt.m24073Rect0a9Yr6o(layoutCoordinates.mo25644windowToLocalMKHz9U(rectBoundsInWindow.m24070getTopLeftF1C5BW0()), layoutCoordinates.mo25644windowToLocalMKHz9U(rectBoundsInWindow.m24064getBottomRightF1C5BW0()));
    }
}
