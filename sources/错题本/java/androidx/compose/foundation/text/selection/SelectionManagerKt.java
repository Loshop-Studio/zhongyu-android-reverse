package androidx.compose.foundation.text.selection;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.RectKt;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinatesKt;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a*\u0010\u000f\u001a\u00020\u00012\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0001\u001a\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014H\u0000\u001a\u001e\u0010\u001a\u001a\u00020\u001b*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H 0\u0011\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u0011H\u0002\u001a\f\u0010!\u001a\u00020\u0001*\u00020\u0016H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, m5110d2 = {"invertedInfiniteRect", "Landroidx/compose/ui/geometry/Rect;", "calculateSelectionMagnifierCenterAndroid", "Landroidx/compose/ui/geometry/Offset;", "manager", "Landroidx/compose/foundation/text/selection/SelectionManager;", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;", "calculateSelectionMagnifierCenterAndroid-O0kMr_c", "(Landroidx/compose/foundation/text/selection/SelectionManager;J)J", "getMagnifierCenter", "anchor", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "getMagnifierCenter-JVtK1S4", "(Landroidx/compose/foundation/text/selection/SelectionManager;JLandroidx/compose/foundation/text/selection/Selection$AnchorInfo;)J", "getSelectedRegionRect", "selectableSubSelectionPairs", "", "Lkotlin/Pair;", "Landroidx/compose/foundation/text/selection/Selectable;", "Landroidx/compose/foundation/text/selection/Selection;", "containerCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "merge", "lhs", "rhs", "containsInclusive", "", TypedValues.CycleType.S_WAVE_OFFSET, "containsInclusive-Uv8p0NA", "(Landroidx/compose/ui/geometry/Rect;J)Z", "firstAndLast", ExifInterface.GPS_DIRECTION_TRUE, "visibleBounds", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManagerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,1107:1\n34#2,4:1108\n39#2:1132\n30#3:1112\n30#3:1116\n30#3:1138\n53#4,3:1113\n53#4,3:1117\n60#4:1121\n70#4:1124\n60#4:1127\n70#4:1130\n60#4:1134\n85#4:1137\n53#4,3:1139\n60#4:1143\n70#4:1146\n65#5:1120\n69#5:1123\n65#5:1126\n69#5:1129\n65#5:1133\n65#5:1142\n69#5:1145\n22#6:1122\n22#6:1125\n22#6:1128\n22#6:1131\n22#6:1135\n22#6:1144\n54#7:1136\n*S KotlinDebug\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManagerKt\n*L\n981#1:1108,4\n981#1:1132\n1004#1:1112\n1005#1:1116\n1092#1:1138\n1004#1:1113,3\n1005#1:1117,3\n1011#1:1121\n1012#1:1124\n1013#1:1127\n1014#1:1130\n1048#1:1134\n1080#1:1137\n1092#1:1139,3\n1106#1:1143\n1106#1:1146\n1011#1:1120\n1012#1:1123\n1013#1:1126\n1014#1:1129\n1048#1:1133\n1106#1:1142\n1106#1:1145\n1011#1:1122\n1012#1:1125\n1013#1:1128\n1014#1:1131\n1048#1:1135\n1106#1:1144\n1080#1:1136\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionManagerKt {

    @NotNull
    private static final Rect invertedInfiniteRect = new Rect(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
    public static final long m8070calculateSelectionMagnifierCenterAndroidO0kMr_c(@NotNull SelectionManager selectionManager, long j7) {
        Selection selection = selectionManager.getSelection();
        if (selection == null) {
            return Offset.INSTANCE.m10456getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = selectionManager.getDraggingHandle();
        int i = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i == -1) {
            return Offset.INSTANCE.m10456getUnspecifiedF1C5BW0();
        }
        if (i == 1) {
            return m8072getMagnifierCenterJVtK1S4(selectionManager, j7, selection.getStart());
        }
        if (i == 2) {
            return m8072getMagnifierCenterJVtK1S4(selectionManager, j7, selection.getEnd());
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("SelectionContainer does not support cursor");
    }

    /* renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    public static final boolean m8071containsInclusiveUv8p0NA(@NotNull Rect rect, long j7) {
        float left = rect.getLeft();
        float right = rect.getRight();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
        if (left > fIntBitsToFloat || fIntBitsToFloat > right) {
            return false;
        }
        float top2 = rect.getTop();
        float bottom = rect.getBottom();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        return top2 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= bottom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> firstAndLast(List<? extends T> list) {
        int size = list.size();
        return (size == 0 || size == 1) ? list : AbstractC5806u.m5287z(AbstractC5805t.m5228h0(list), AbstractC5805t.m5235o0(list));
    }

    /* renamed from: getMagnifierCenter-JVtK1S4, reason: not valid java name */
    private static final long m8072getMagnifierCenterJVtK1S4(SelectionManager selectionManager, long j7, Selection.AnchorInfo anchorInfo) {
        float fM5273l;
        Selectable anchorSelectable$foundation_release = selectionManager.getAnchorSelectable$foundation_release(anchorInfo);
        if (anchorSelectable$foundation_release == null) {
            return Offset.INSTANCE.m10456getUnspecifiedF1C5BW0();
        }
        LayoutCoordinates containerLayoutCoordinates = selectionManager.getContainerLayoutCoordinates();
        if (containerLayoutCoordinates == null) {
            return Offset.INSTANCE.m10456getUnspecifiedF1C5BW0();
        }
        LayoutCoordinates layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return Offset.INSTANCE.m10456getUnspecifiedF1C5BW0();
        }
        int offset = anchorInfo.getOffset();
        if (offset > anchorSelectable$foundation_release.getLastVisibleOffset()) {
            return Offset.INSTANCE.m10456getUnspecifiedF1C5BW0();
        }
        Offset offsetM8055getCurrentDragPosition_m7T9E = selectionManager.m8055getCurrentDragPosition_m7T9E();
        AbstractC5830k.m5327d(offsetM8055getCurrentDragPosition_m7T9E);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (layoutCoordinates.mo12042localPositionOfR5De75A(containerLayoutCoordinates, offsetM8055getCurrentDragPosition_m7T9E.m10451unboximpl()) >> 32));
        long jMo8018getRangeOfLineContainingjx7JFs = anchorSelectable$foundation_release.mo8018getRangeOfLineContainingjx7JFs(offset);
        if (TextRange.m12764getCollapsedimpl(jMo8018getRangeOfLineContainingjx7JFs)) {
            fM5273l = anchorSelectable$foundation_release.getLineLeft(offset);
        } else {
            float lineLeft = anchorSelectable$foundation_release.getLineLeft(TextRange.m12770getStartimpl(jMo8018getRangeOfLineContainingjx7JFs));
            float lineRight = anchorSelectable$foundation_release.getLineRight(TextRange.m12765getEndimpl(jMo8018getRangeOfLineContainingjx7JFs) - 1);
            fM5273l = AbstractC5806u.m5273l(fIntBitsToFloat, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
        }
        if (fM5273l == -1.0f) {
            return Offset.INSTANCE.m10456getUnspecifiedF1C5BW0();
        }
        if (!IntSize.m13474equalsimpl0(j7, IntSize.INSTANCE.m13481getZeroYbymL2g()) && Math.abs(fIntBitsToFloat - fM5273l) > ((int) (j7 >> 32)) / 2) {
            return Offset.INSTANCE.m10456getUnspecifiedF1C5BW0();
        }
        if (anchorSelectable$foundation_release.getCenterYForOffset(offset) == -1.0f) {
            return Offset.INSTANCE.m10456getUnspecifiedF1C5BW0();
        }
        return containerLayoutCoordinates.mo12042localPositionOfR5De75A(layoutCoordinates, Offset.m10433constructorimpl((Float.floatToRawIntBits(fM5273l) << 32) | (4294967295L & Float.floatToRawIntBits(r9))));
    }

    @VisibleForTesting
    @NotNull
    public static final Rect getSelectedRegionRect(@NotNull List<? extends Pair<? extends Selectable, Selection>> list, @NotNull LayoutCoordinates layoutCoordinates) {
        int i;
        LayoutCoordinates layoutCoordinates2;
        int[] iArr;
        if (list.isEmpty()) {
            return invertedInfiniteRect;
        }
        Rect rect = invertedInfiniteRect;
        float left = rect.getLeft();
        float top2 = rect.getTop();
        float right = rect.getRight();
        float bottom = rect.getBottom();
        int size = list.size();
        char c = 0;
        int i8 = 0;
        while (i8 < size) {
            Pair<? extends Selectable, Selection> pair = list.get(i8);
            Selectable selectableComponent1 = pair.component1();
            Selection selectionComponent2 = pair.component2();
            int offset = selectionComponent2.getStart().getOffset();
            int offset2 = selectionComponent2.getEnd().getOffset();
            if (offset == offset2 || (layoutCoordinates2 = selectableComponent1.getLayoutCoordinates()) == null) {
                i = size;
            } else {
                int iMin = Math.min(offset, offset2);
                int iMax = Math.max(offset, offset2) - 1;
                if (iMin == iMax) {
                    iArr = new int[1];
                    iArr[c] = iMin;
                } else {
                    int[] iArr2 = new int[2];
                    iArr2[c] = iMin;
                    iArr2[1] = iMax;
                    iArr = iArr2;
                }
                Rect rect2 = invertedInfiniteRect;
                float left2 = rect2.getLeft();
                float top3 = rect2.getTop();
                float right2 = rect2.getRight();
                float bottom2 = rect2.getBottom();
                int length = iArr.length;
                i = size;
                int i9 = 0;
                while (i9 < length) {
                    int i10 = i9;
                    Rect boundingBox = selectableComponent1.getBoundingBox(iArr[i10]);
                    left2 = Math.min(left2, boundingBox.getLeft());
                    top3 = Math.min(top3, boundingBox.getTop());
                    right2 = Math.max(right2, boundingBox.getRight());
                    bottom2 = Math.max(bottom2, boundingBox.getBottom());
                    i9 = i10 + 1;
                }
                long jM10433constructorimpl = Offset.m10433constructorimpl((Float.floatToRawIntBits(left2) << 32) | (Float.floatToRawIntBits(top3) & 4294967295L));
                long jM10433constructorimpl2 = Offset.m10433constructorimpl((Float.floatToRawIntBits(right2) << 32) | (Float.floatToRawIntBits(bottom2) & 4294967295L));
                long jMo12042localPositionOfR5De75A = layoutCoordinates.mo12042localPositionOfR5De75A(layoutCoordinates2, jM10433constructorimpl);
                long jMo12042localPositionOfR5De75A2 = layoutCoordinates.mo12042localPositionOfR5De75A(layoutCoordinates2, jM10433constructorimpl2);
                left = Math.min(left, Float.intBitsToFloat((int) (jMo12042localPositionOfR5De75A >> 32)));
                top2 = Math.min(top2, Float.intBitsToFloat((int) (jMo12042localPositionOfR5De75A & 4294967295L)));
                right = Math.max(right, Float.intBitsToFloat((int) (jMo12042localPositionOfR5De75A2 >> 32)));
                bottom = Math.max(bottom, Float.intBitsToFloat((int) (jMo12042localPositionOfR5De75A2 & 4294967295L)));
            }
            i8++;
            size = i;
            c = 0;
        }
        return new Rect(left, top2, right, bottom);
    }

    @Nullable
    public static final Selection merge(@Nullable Selection selection, @Nullable Selection selection2) {
        Selection selectionMerge;
        return (selection == null || (selectionMerge = selection.merge(selection2)) == null) ? selection2 : selectionMerge;
    }

    @NotNull
    public static final Rect visibleBounds(@NotNull LayoutCoordinates layoutCoordinates) {
        Rect rectBoundsInWindow = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates);
        return RectKt.m10479Rect0a9Yr6o(layoutCoordinates.mo12050windowToLocalMKHz9U(rectBoundsInWindow.m10476getTopLeftF1C5BW0()), layoutCoordinates.mo12050windowToLocalMKHz9U(rectBoundsInWindow.m10470getBottomRightF1C5BW0()));
    }
}
