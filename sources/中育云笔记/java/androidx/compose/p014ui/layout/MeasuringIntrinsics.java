package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.p014ui.unit.IntSize;
import kotlin.enums.AbstractC9953a;
import p181hd.InterfaceC9540l;
import p425yc.InterfaceC11943a;

/* loaded from: classes2.dex */
final class MeasuringIntrinsics {
    public static final MeasuringIntrinsics INSTANCE = new MeasuringIntrinsics();

    public static final class DefaultIntrinsicMeasurable implements Measurable {
        private final IntrinsicMeasurable measurable;
        private final IntrinsicMinMax minMax;
        private final IntrinsicWidthHeight widthHeight;

        public DefaultIntrinsicMeasurable(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
            this.measurable = intrinsicMeasurable;
            this.minMax = intrinsicMinMax;
            this.widthHeight = intrinsicWidthHeight;
        }

        public final IntrinsicMeasurable getMeasurable() {
            return this.measurable;
        }

        public final IntrinsicMinMax getMinMax() {
            return this.minMax;
        }

        @Override // androidx.compose.p014ui.layout.IntrinsicMeasurable
        public Object getParentData() {
            return this.measurable.getParentData();
        }

        public final IntrinsicWidthHeight getWidthHeight() {
            return this.widthHeight;
        }

        @Override // androidx.compose.p014ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i10) {
            return this.measurable.maxIntrinsicHeight(i10);
        }

        @Override // androidx.compose.p014ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i10) {
            return this.measurable.maxIntrinsicWidth(i10);
        }

        @Override // androidx.compose.p014ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public Placeable mo32229measureBRTryo0(long j10) {
            if (this.widthHeight == IntrinsicWidthHeight.Width) {
                return new EmptyPlaceable(this.minMax == IntrinsicMinMax.Max ? this.measurable.maxIntrinsicWidth(Constraints.m33453getMaxHeightimpl(j10)) : this.measurable.minIntrinsicWidth(Constraints.m33453getMaxHeightimpl(j10)), Constraints.m33449getHasBoundedHeightimpl(j10) ? Constraints.m33453getMaxHeightimpl(j10) : 32767);
            }
            return new EmptyPlaceable(Constraints.m33450getHasBoundedWidthimpl(j10) ? Constraints.m33454getMaxWidthimpl(j10) : 32767, this.minMax == IntrinsicMinMax.Max ? this.measurable.maxIntrinsicHeight(Constraints.m33454getMaxWidthimpl(j10)) : this.measurable.minIntrinsicHeight(Constraints.m33454getMaxWidthimpl(j10)));
        }

        @Override // androidx.compose.p014ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i10) {
            return this.measurable.minIntrinsicHeight(i10);
        }

        @Override // androidx.compose.p014ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i10) {
            return this.measurable.minIntrinsicWidth(i10);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IntrinsicMinMax {
        private static final /* synthetic */ InterfaceC11943a $ENTRIES;
        private static final /* synthetic */ IntrinsicMinMax[] $VALUES;
        public static final IntrinsicMinMax Min = new IntrinsicMinMax("Min", 0);
        public static final IntrinsicMinMax Max = new IntrinsicMinMax("Max", 1);

        private static final /* synthetic */ IntrinsicMinMax[] $values() {
            return new IntrinsicMinMax[]{Min, Max};
        }

        static {
            IntrinsicMinMax[] intrinsicMinMaxArr$values = $values();
            $VALUES = intrinsicMinMaxArr$values;
            $ENTRIES = AbstractC9953a.m20230a(intrinsicMinMaxArr$values);
        }

        private IntrinsicMinMax(String str, int i10) {
        }

        public static InterfaceC11943a getEntries() {
            return $ENTRIES;
        }

        public static IntrinsicMinMax valueOf(String str) {
            return (IntrinsicMinMax) Enum.valueOf(IntrinsicMinMax.class, str);
        }

        public static IntrinsicMinMax[] values() {
            return (IntrinsicMinMax[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IntrinsicWidthHeight {
        private static final /* synthetic */ InterfaceC11943a $ENTRIES;
        private static final /* synthetic */ IntrinsicWidthHeight[] $VALUES;
        public static final IntrinsicWidthHeight Width = new IntrinsicWidthHeight("Width", 0);
        public static final IntrinsicWidthHeight Height = new IntrinsicWidthHeight("Height", 1);

        private static final /* synthetic */ IntrinsicWidthHeight[] $values() {
            return new IntrinsicWidthHeight[]{Width, Height};
        }

        static {
            IntrinsicWidthHeight[] intrinsicWidthHeightArr$values = $values();
            $VALUES = intrinsicWidthHeightArr$values;
            $ENTRIES = AbstractC9953a.m20230a(intrinsicWidthHeightArr$values);
        }

        private IntrinsicWidthHeight(String str, int i10) {
        }

        public static InterfaceC11943a getEntries() {
            return $ENTRIES;
        }

        public static IntrinsicWidthHeight valueOf(String str) {
            return (IntrinsicWidthHeight) Enum.valueOf(IntrinsicWidthHeight.class, str);
        }

        public static IntrinsicWidthHeight[] values() {
            return (IntrinsicWidthHeight[]) $VALUES.clone();
        }
    }

    private MeasuringIntrinsics() {
    }

    public final int maxHeight(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return layoutModifier.mo27378measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Height), ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int maxWidth(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return layoutModifier.mo27378measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Width), ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null)).getWidth();
    }

    public final int minHeight(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return layoutModifier.mo27378measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Height), ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null)).getHeight();
    }

    public final int minWidth(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        return layoutModifier.mo27378measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Width), ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null)).getWidth();
    }

    public static final class EmptyPlaceable extends Placeable {
        public EmptyPlaceable(int i10, int i11) {
            m32291setMeasuredSizeozmzZPI(IntSize.m33667constructorimpl((i11 & 4294967295L) | (i10 << 32)));
        }

        @Override // androidx.compose.p014ui.layout.Measured
        public int get(AlignmentLine alignmentLine) {
            return Integer.MIN_VALUE;
        }

        @Override // androidx.compose.p014ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public void mo32230placeAtf8xVGno(long j10, float f10, InterfaceC9540l interfaceC9540l) {
        }
    }
}
