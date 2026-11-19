package androidx.compose.foundation.layout;

import androidx.compose.p011ui.layout.IntrinsicMeasurable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J$\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J$\u0010\f\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J$\u0010\r\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J$\u0010\u000e\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J$\u0010\u000f\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J$\u0010\u0010\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J$\u0010\u0011\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¨\u0006\u0012"}, m5110d2 = {"Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;", "", "()V", "HorizontalMaxHeight", "", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "availableWidth", "mainAxisSpacing", "HorizontalMaxWidth", "availableHeight", "HorizontalMinHeight", "HorizontalMinWidth", "VerticalMaxHeight", "VerticalMaxWidth", "VerticalMinHeight", "VerticalMinWidth", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/IntrinsicMeasureBlocks\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,707:1\n421#2,5:708\n426#2,7:717\n434#2:725\n435#2,3:727\n447#2,5:730\n452#2,15:739\n470#2,6:755\n469#2,27:762\n447#2,5:789\n452#2,15:798\n470#2,6:814\n469#2,27:821\n421#2,5:848\n426#2,7:857\n434#2:865\n435#2,3:867\n421#2,5:870\n426#2,7:879\n434#2:887\n435#2,3:889\n447#2,5:892\n452#2,15:901\n470#2,6:917\n469#2,27:924\n447#2,5:951\n452#2,15:960\n470#2,6:976\n469#2,27:983\n421#2,5:1010\n426#2,7:1019\n434#2:1027\n435#2,3:1029\n34#3,4:713\n39#3:726\n34#3,4:735\n39#3:754\n34#3,4:794\n39#3:813\n34#3,4:853\n39#3:866\n34#3,4:875\n39#3:888\n34#3,4:897\n39#3:916\n34#3,4:956\n39#3:975\n34#3,4:1015\n39#3:1028\n26#4:724\n26#4:761\n26#4:820\n26#4:864\n26#4:886\n26#4:923\n26#4:982\n26#4:1026\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/IntrinsicMeasureBlocks\n*L\n311#1:708,5\n311#1:717,7\n311#1:725\n311#1:727,3\n324#1:730,5\n324#1:739,15\n324#1:755,6\n324#1:762,27\n338#1:789,5\n338#1:798,15\n338#1:814,6\n338#1:821,27\n352#1:848,5\n352#1:857,7\n352#1:865\n352#1:867,3\n365#1:870,5\n365#1:879,7\n365#1:887\n365#1:889,3\n378#1:892,5\n378#1:901,15\n378#1:917,6\n378#1:924,27\n392#1:951,5\n392#1:960,15\n392#1:976,6\n392#1:983,27\n406#1:1010,5\n406#1:1019,7\n406#1:1027\n406#1:1029,3\n311#1:713,4\n311#1:726\n324#1:735,4\n324#1:754\n338#1:794,4\n338#1:813\n352#1:853,4\n352#1:866\n365#1:875,4\n365#1:888\n378#1:897,4\n378#1:916\n392#1:956,4\n392#1:975\n406#1:1015,4\n406#1:1028\n311#1:724\n324#1:761\n338#1:820\n352#1:864\n365#1:886\n378#1:923\n392#1:982\n406#1:1026\n*E\n"})
/* loaded from: classes.dex */
public final class IntrinsicMeasureBlocks {
    public static final int $stable = 0;

    @NotNull
    public static final IntrinsicMeasureBlocks INSTANCE = new IntrinsicMeasureBlocks();

    private IntrinsicMeasureBlocks() {
    }

    public final int HorizontalMaxHeight(@NotNull List<? extends IntrinsicMeasurable> measurables, int availableWidth, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((measurables.size() - 1) * mainAxisSpacing, availableWidth);
        int size = measurables.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            IntrinsicMeasurable intrinsicMeasurable = measurables.get(i);
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int iMin2 = Math.min(intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE), availableWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : availableWidth - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, intrinsicMeasurable.maxIntrinsicHeight(iMin2));
            } else if (weight > 0.0f) {
                f += weight;
            }
        }
        int iRound = f == 0.0f ? 0 : availableWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(availableWidth - iMin, 0) / f);
        int size2 = measurables.size();
        for (int i8 = 0; i8 < size2; i8++) {
            IntrinsicMeasurable intrinsicMeasurable2 = measurables.get(i8);
            float weight2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                iMax = Math.max(iMax, intrinsicMeasurable2.maxIntrinsicHeight(iRound != Integer.MAX_VALUE ? Math.round(iRound * weight2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int HorizontalMaxWidth(@NotNull List<? extends IntrinsicMeasurable> measurables, int availableHeight, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int iMax = 0;
        int i = 0;
        float f = 0.0f;
        for (int i8 = 0; i8 < size; i8++) {
            IntrinsicMeasurable intrinsicMeasurable = measurables.get(i8);
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            int iMaxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(availableHeight);
            if (weight == 0.0f) {
                i += iMaxIntrinsicWidth;
            } else if (weight > 0.0f) {
                f += weight;
                iMax = Math.max(iMax, Math.round(iMaxIntrinsicWidth / weight));
            }
        }
        return ((measurables.size() - 1) * mainAxisSpacing) + Math.round(iMax * f) + i;
    }

    public final int HorizontalMinHeight(@NotNull List<? extends IntrinsicMeasurable> measurables, int availableWidth, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((measurables.size() - 1) * mainAxisSpacing, availableWidth);
        int size = measurables.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            IntrinsicMeasurable intrinsicMeasurable = measurables.get(i);
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int iMin2 = Math.min(intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE), availableWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : availableWidth - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, intrinsicMeasurable.minIntrinsicHeight(iMin2));
            } else if (weight > 0.0f) {
                f += weight;
            }
        }
        int iRound = f == 0.0f ? 0 : availableWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(availableWidth - iMin, 0) / f);
        int size2 = measurables.size();
        for (int i8 = 0; i8 < size2; i8++) {
            IntrinsicMeasurable intrinsicMeasurable2 = measurables.get(i8);
            float weight2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                iMax = Math.max(iMax, intrinsicMeasurable2.minIntrinsicHeight(iRound != Integer.MAX_VALUE ? Math.round(iRound * weight2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int HorizontalMinWidth(@NotNull List<? extends IntrinsicMeasurable> measurables, int availableHeight, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int iMax = 0;
        int i = 0;
        float f = 0.0f;
        for (int i8 = 0; i8 < size; i8++) {
            IntrinsicMeasurable intrinsicMeasurable = measurables.get(i8);
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            int iMinIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(availableHeight);
            if (weight == 0.0f) {
                i += iMinIntrinsicWidth;
            } else if (weight > 0.0f) {
                f += weight;
                iMax = Math.max(iMax, Math.round(iMinIntrinsicWidth / weight));
            }
        }
        return ((measurables.size() - 1) * mainAxisSpacing) + Math.round(iMax * f) + i;
    }

    public final int VerticalMaxHeight(@NotNull List<? extends IntrinsicMeasurable> measurables, int availableWidth, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int iMax = 0;
        int i = 0;
        float f = 0.0f;
        for (int i8 = 0; i8 < size; i8++) {
            IntrinsicMeasurable intrinsicMeasurable = measurables.get(i8);
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            int iMaxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(availableWidth);
            if (weight == 0.0f) {
                i += iMaxIntrinsicHeight;
            } else if (weight > 0.0f) {
                f += weight;
                iMax = Math.max(iMax, Math.round(iMaxIntrinsicHeight / weight));
            }
        }
        return ((measurables.size() - 1) * mainAxisSpacing) + Math.round(iMax * f) + i;
    }

    public final int VerticalMaxWidth(@NotNull List<? extends IntrinsicMeasurable> measurables, int availableHeight, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((measurables.size() - 1) * mainAxisSpacing, availableHeight);
        int size = measurables.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            IntrinsicMeasurable intrinsicMeasurable = measurables.get(i);
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int iMin2 = Math.min(intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE), availableHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : availableHeight - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, intrinsicMeasurable.maxIntrinsicWidth(iMin2));
            } else if (weight > 0.0f) {
                f += weight;
            }
        }
        int iRound = f == 0.0f ? 0 : availableHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(availableHeight - iMin, 0) / f);
        int size2 = measurables.size();
        for (int i8 = 0; i8 < size2; i8++) {
            IntrinsicMeasurable intrinsicMeasurable2 = measurables.get(i8);
            float weight2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                iMax = Math.max(iMax, intrinsicMeasurable2.maxIntrinsicWidth(iRound != Integer.MAX_VALUE ? Math.round(iRound * weight2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int VerticalMinHeight(@NotNull List<? extends IntrinsicMeasurable> measurables, int availableWidth, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int iMax = 0;
        int i = 0;
        float f = 0.0f;
        for (int i8 = 0; i8 < size; i8++) {
            IntrinsicMeasurable intrinsicMeasurable = measurables.get(i8);
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            int iMinIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(availableWidth);
            if (weight == 0.0f) {
                i += iMinIntrinsicHeight;
            } else if (weight > 0.0f) {
                f += weight;
                iMax = Math.max(iMax, Math.round(iMinIntrinsicHeight / weight));
            }
        }
        return ((measurables.size() - 1) * mainAxisSpacing) + Math.round(iMax * f) + i;
    }

    public final int VerticalMinWidth(@NotNull List<? extends IntrinsicMeasurable> measurables, int availableHeight, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((measurables.size() - 1) * mainAxisSpacing, availableHeight);
        int size = measurables.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            IntrinsicMeasurable intrinsicMeasurable = measurables.get(i);
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int iMin2 = Math.min(intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE), availableHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : availableHeight - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, intrinsicMeasurable.minIntrinsicWidth(iMin2));
            } else if (weight > 0.0f) {
                f += weight;
            }
        }
        int iRound = f == 0.0f ? 0 : availableHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(availableHeight - iMin, 0) / f);
        int size2 = measurables.size();
        for (int i8 = 0; i8 < size2; i8++) {
            IntrinsicMeasurable intrinsicMeasurable2 = measurables.get(i8);
            float weight2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                iMax = Math.max(iMax, intrinsicMeasurable2.minIntrinsicWidth(iRound != Integer.MAX_VALUE ? Math.round(iRound * weight2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }
}
