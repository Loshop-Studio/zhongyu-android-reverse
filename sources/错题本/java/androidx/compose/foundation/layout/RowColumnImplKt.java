package androidx.compose.foundation.layout;

import androidx.compose.p011ui.layout.IntrinsicMeasurable;
import androidx.compose.p011ui.layout.Placeable;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000@\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aM\u0010\t\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u001d\u0010\u0006\u001a\u0019\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u00052\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b\t\u0010\n\u001al\u0010\r\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u001d\u0010\u0006\u001a\u0019\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u00052\u001d\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u00052\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b\r\u0010\u000e\"\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0014\"\u001a\u0010\u0018\u001a\u00020\u0015*\u0004\u0018\u00010\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u001a\u0010\u001c\u001a\u00020\u0019*\u0004\u0018\u00010\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u001c\u0010 \u001a\u0004\u0018\u00010\u001d*\u0004\u0018\u00010\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u001a\u0010!\u001a\u00020\u0019*\u0004\u0018\u00010\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001b¨\u0006\""}, m5110d2 = {"", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "children", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "mainAxisSize", "crossAxisAvailable", "mainAxisSpacing", "intrinsicMainAxisSize", "(Ljava/util/List;Lr6/e;II)I", "crossAxisSize", "mainAxisAvailable", "intrinsicCrossAxisSize", "(Ljava/util/List;Lr6/e;Lr6/e;II)I", "Landroidx/compose/foundation/layout/RowColumnParentData;", "getRowColumnParentData", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;", "rowColumnParentData", "Landroidx/compose/ui/layout/Placeable;", "(Landroidx/compose/ui/layout/Placeable;)Landroidx/compose/foundation/layout/RowColumnParentData;", "", "getWeight", "(Landroidx/compose/foundation/layout/RowColumnParentData;)F", "weight", "", "getFill", "(Landroidx/compose/foundation/layout/RowColumnParentData;)Z", "fill", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisAlignment", "(Landroidx/compose/foundation/layout/RowColumnParentData;)Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisAlignment", "isRelative", "foundation-layout_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,707:1\n34#2,4:708\n39#2:713\n34#2,6:715\n34#2,4:722\n39#2:727\n26#3:712\n26#3:714\n26#3:721\n26#3:726\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n*L\n425#1:708,4\n425#1:713\n451#1:715,6\n478#1:722,4\n478#1:727\n432#1:712\n435#1:714\n475#1:721\n487#1:726\n*E\n"})
/* loaded from: classes.dex */
public final class RowColumnImplKt {
    @Nullable
    public static final CrossAxisAlignment getCrossAxisAlignment(@Nullable RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getCrossAxisAlignment();
        }
        return null;
    }

    public static final boolean getFill(@Nullable RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getFill();
        }
        return true;
    }

    @Nullable
    public static final RowColumnParentData getRowColumnParentData(@NotNull IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        if (parentData instanceof RowColumnParentData) {
            return (RowColumnParentData) parentData;
        }
        return null;
    }

    public static final float getWeight(@Nullable RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getWeight();
        }
        return 0.0f;
    }

    private static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, InterfaceC6473e interfaceC6473e, InterfaceC6473e interfaceC6473e2, int i, int i8) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i8, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i9 = 0; i9 < size; i9++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i9);
            float weight = getWeight(getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int iMin2 = Math.min(((Number) interfaceC6473e.invoke(intrinsicMeasurable, Integer.MAX_VALUE)).intValue(), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, ((Number) interfaceC6473e2.invoke(intrinsicMeasurable, Integer.valueOf(iMin2))).intValue());
            } else if (weight > 0.0f) {
                f += weight;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i10 = 0; i10 < size2; i10++) {
            IntrinsicMeasurable intrinsicMeasurable2 = list.get(i10);
            float weight2 = getWeight(getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                iMax = Math.max(iMax, ((Number) interfaceC6473e2.invoke(intrinsicMeasurable2, Integer.valueOf(iRound != Integer.MAX_VALUE ? Math.round(iRound * weight2) : Integer.MAX_VALUE))).intValue());
            }
        }
        return iMax;
    }

    private static final int intrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, InterfaceC6473e interfaceC6473e, int i, int i8) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i9 = 0;
        float f = 0.0f;
        for (int i10 = 0; i10 < size; i10++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i10);
            float weight = getWeight(getRowColumnParentData(intrinsicMeasurable));
            int iIntValue = ((Number) interfaceC6473e.invoke(intrinsicMeasurable, Integer.valueOf(i))).intValue();
            if (weight == 0.0f) {
                i9 += iIntValue;
            } else if (weight > 0.0f) {
                f += weight;
                iMax = Math.max(iMax, Math.round(iIntValue / weight));
            }
        }
        return ((list.size() - 1) * i8) + Math.round(iMax * f) + i9;
    }

    public static final boolean isRelative(@Nullable RowColumnParentData rowColumnParentData) {
        CrossAxisAlignment crossAxisAlignment = getCrossAxisAlignment(rowColumnParentData);
        if (crossAxisAlignment != null) {
            return crossAxisAlignment.isRelative$foundation_layout_release();
        }
        return false;
    }

    @Nullable
    public static final RowColumnParentData getRowColumnParentData(@NotNull Placeable placeable) {
        Object parentData = placeable.getParentData();
        if (parentData instanceof RowColumnParentData) {
            return (RowColumnParentData) parentData;
        }
        return null;
    }
}
