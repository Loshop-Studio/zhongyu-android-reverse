package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(m13557d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001:\u0003\b\t\nJ\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m13558d2 = {"Landroidx/compose/foundation/lazy/grid/GridCells;", "", "calculateCrossAxisCellSizes", "", "", "Landroidx/compose/ui/unit/Density;", "availableSize", "spacing", "Adaptive", "Fixed", "FixedSize", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public interface GridCells {

    @StabilityInferred(parameters = 1)
    @Metadata(m13557d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, m13558d2 = {"Landroidx/compose/foundation/lazy/grid/GridCells$Adaptive;", "Landroidx/compose/foundation/lazy/grid/GridCells;", "minSize", "Landroidx/compose/ui/unit/Dp;", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "equals", "", "other", "", "hashCode", "", "calculateCrossAxisCellSizes", "", "Landroidx/compose/ui/unit/Density;", "availableSize", "spacing", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Adaptive\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,656:1\n113#2:657\n96#3,5:658\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Adaptive\n*L\n359#1:657\n359#1:658,5\n*E\n"})
    public static final class Adaptive implements GridCells {
        public static final int $stable = 0;
        private final float minSize;

        public /* synthetic */ Adaptive(float f10, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10);
        }

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        public List<Integer> calculateCrossAxisCellSizes(Density density, int i10, int i11) {
            return LazyGridDslKt.calculateCellsCrossAxisSizeImpl(i10, Math.max((i10 + i11) / (density.mo17326roundToPx0680j_4(this.minSize) + i11), 1), i11);
        }

        public boolean equals(Object other) {
            return (other instanceof Adaptive) && C3127Dp.m23566equalsimpl0(this.minSize, ((Adaptive) other).minSize);
        }

        public int hashCode() {
            return C3127Dp.m23567hashCodeimpl(this.minSize);
        }

        private Adaptive(float f10) {
            this.minSize = f10;
            if (C3127Dp.m23560compareTo0680j_4(f10, C3127Dp.m23561constructorimpl((float) 0)) > 0) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("Provided min size should be larger than zero.");
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m13557d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\u0003H\u0016J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m13558d2 = {"Landroidx/compose/foundation/lazy/grid/GridCells$Fixed;", "Landroidx/compose/foundation/lazy/grid/GridCells;", "count", "", "(I)V", "equals", "", "other", "", "hashCode", "calculateCrossAxisCellSizes", "", "Landroidx/compose/ui/unit/Density;", "availableSize", "spacing", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Fixed\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,656:1\n96#2,5:657\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Fixed\n*L\n330#1:657,5\n*E\n"})
    public static final class Fixed implements GridCells {
        public static final int $stable = 0;
        private final int count;

        public Fixed(int i10) {
            this.count = i10;
            if (i10 > 0) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("Provided count should be larger than zero");
        }

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        public List<Integer> calculateCrossAxisCellSizes(Density density, int i10, int i11) {
            return LazyGridDslKt.calculateCellsCrossAxisSizeImpl(i10, this.count, i11);
        }

        public boolean equals(Object other) {
            return (other instanceof Fixed) && this.count == ((Fixed) other).count;
        }

        public int hashCode() {
            return -this.count;
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(m13557d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, m13558d2 = {"Landroidx/compose/foundation/lazy/grid/GridCells$FixedSize;", "Landroidx/compose/foundation/lazy/grid/GridCells;", "size", "Landroidx/compose/ui/unit/Dp;", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "equals", "", "other", "", "hashCode", "", "calculateCrossAxisCellSizes", "", "Landroidx/compose/ui/unit/Density;", "availableSize", "spacing", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$FixedSize\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,656:1\n113#2:657\n96#3,5:658\n1#4:663\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$FixedSize\n*L\n392#1:657\n392#1:658,5\n*E\n"})
    public static final class FixedSize implements GridCells {
        public static final int $stable = 0;
        private final float size;

        public /* synthetic */ FixedSize(float f10, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10);
        }

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        public List<Integer> calculateCrossAxisCellSizes(Density density, int i10, int i11) {
            int iMo17326roundToPx0680j_4 = density.mo17326roundToPx0680j_4(this.size);
            int i12 = iMo17326roundToPx0680j_4 + i11;
            int i13 = i11 + i10;
            if (i12 >= i13) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf(i10));
                return arrayList;
            }
            int i14 = i13 / i12;
            ArrayList arrayList2 = new ArrayList(i14);
            for (int i15 = 0; i15 < i14; i15++) {
                arrayList2.add(Integer.valueOf(iMo17326roundToPx0680j_4));
            }
            return arrayList2;
        }

        public boolean equals(Object other) {
            return (other instanceof FixedSize) && C3127Dp.m23566equalsimpl0(this.size, ((FixedSize) other).size);
        }

        public int hashCode() {
            return C3127Dp.m23567hashCodeimpl(this.size);
        }

        private FixedSize(float f10) {
            this.size = f10;
            if (C3127Dp.m23560compareTo0680j_4(f10, C3127Dp.m23561constructorimpl((float) 0)) > 0) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("Provided size should be larger than zero.");
        }
    }

    List<Integer> calculateCrossAxisCellSizes(Density density, int i10, int i11);
}
