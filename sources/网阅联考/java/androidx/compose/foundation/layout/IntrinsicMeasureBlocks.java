package androidx.compose.foundation.layout;

import androidx.compose.p006ui.layout.IntrinsicMeasurable;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R/\u0010\u0003\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR/\u0010\n\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR/\u0010\f\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR/\u0010\u000e\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR/\u0010\u0010\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR/\u0010\u0012\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\tR/\u0010\u0014\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\tR/\u0010\u0016\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, m5175d2 = {"Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;", "", "()V", "HorizontalMaxHeight", "Lkotlin/Function3;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "getHorizontalMaxHeight", "()Lkotlin/jvm/functions/Function3;", "HorizontalMaxWidth", "getHorizontalMaxWidth", "HorizontalMinHeight", "getHorizontalMinHeight", "HorizontalMinWidth", "getHorizontalMinWidth", "VerticalMaxHeight", "getVerticalMaxHeight", "VerticalMaxWidth", "getVerticalMaxWidth", "VerticalMinHeight", "getVerticalMinHeight", "VerticalMinWidth", "getVerticalMinWidth", "foundation-layout_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class IntrinsicMeasureBlocks {
    public static final IntrinsicMeasureBlocks INSTANCE = new IntrinsicMeasureBlocks();
    private static final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> HorizontalMinWidth = new Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinWidth$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }

        public final Integer invoke(List<? extends IntrinsicMeasurable> measurables, int i4, int i5) {
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            C05451 c05451 = new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinWidth$1.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicSize, int i6) {
                    Intrinsics.checkNotNullParameter(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.minIntrinsicWidth(i6));
                }
            };
            C05462 c05462 = new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinWidth$1.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicSize, int i6) {
                    Intrinsics.checkNotNullParameter(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.maxIntrinsicHeight(i6));
                }
            };
            LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
            return Integer.valueOf(RowColumnImplKt.intrinsicSize(measurables, c05451, c05462, i4, i5, layoutOrientation, layoutOrientation));
        }
    };
    private static final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> VerticalMinWidth = new Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinWidth$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }

        public final Integer invoke(List<? extends IntrinsicMeasurable> measurables, int i4, int i5) {
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return Integer.valueOf(RowColumnImplKt.intrinsicSize(measurables, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinWidth$1.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicSize, int i6) {
                    Intrinsics.checkNotNullParameter(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.minIntrinsicWidth(i6));
                }
            }, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinWidth$1.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicSize, int i6) {
                    Intrinsics.checkNotNullParameter(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.maxIntrinsicHeight(i6));
                }
            }, i4, i5, LayoutOrientation.Vertical, LayoutOrientation.Horizontal));
        }
    };
    private static final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> HorizontalMinHeight = new Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinHeight$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }

        public final Integer invoke(List<? extends IntrinsicMeasurable> measurables, int i4, int i5) {
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return Integer.valueOf(RowColumnImplKt.intrinsicSize(measurables, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinHeight$1.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicSize, int i6) {
                    Intrinsics.checkNotNullParameter(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.minIntrinsicHeight(i6));
                }
            }, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinHeight$1.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicSize, int i6) {
                    Intrinsics.checkNotNullParameter(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.maxIntrinsicWidth(i6));
                }
            }, i4, i5, LayoutOrientation.Horizontal, LayoutOrientation.Vertical));
        }
    };
    private static final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> VerticalMinHeight = new Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinHeight$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }

        public final Integer invoke(List<? extends IntrinsicMeasurable> measurables, int i4, int i5) {
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            C05511 c05511 = new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinHeight$1.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicSize, int i6) {
                    Intrinsics.checkNotNullParameter(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.minIntrinsicHeight(i6));
                }
            };
            C05522 c05522 = new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinHeight$1.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicSize, int i6) {
                    Intrinsics.checkNotNullParameter(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.maxIntrinsicWidth(i6));
                }
            };
            LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
            return Integer.valueOf(RowColumnImplKt.intrinsicSize(measurables, c05511, c05522, i4, i5, layoutOrientation, layoutOrientation));
        }
    };
    private static final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> HorizontalMaxWidth = new Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxWidth$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }

        public final Integer invoke(List<? extends IntrinsicMeasurable> measurables, int i4, int i5) {
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            C05411 c05411 = new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxWidth$1.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicSize, int i6) {
                    Intrinsics.checkNotNullParameter(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.maxIntrinsicWidth(i6));
                }
            };
            C05422 c05422 = new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxWidth$1.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicSize, int i6) {
                    Intrinsics.checkNotNullParameter(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.maxIntrinsicHeight(i6));
                }
            };
            LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
            return Integer.valueOf(RowColumnImplKt.intrinsicSize(measurables, c05411, c05422, i4, i5, layoutOrientation, layoutOrientation));
        }
    };
    private static final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> VerticalMaxWidth = new Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxWidth$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }

        public final Integer invoke(List<? extends IntrinsicMeasurable> measurables, int i4, int i5) {
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return Integer.valueOf(RowColumnImplKt.intrinsicSize(measurables, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxWidth$1.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicSize, int i6) {
                    Intrinsics.checkNotNullParameter(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.maxIntrinsicWidth(i6));
                }
            }, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxWidth$1.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicSize, int i6) {
                    Intrinsics.checkNotNullParameter(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.maxIntrinsicHeight(i6));
                }
            }, i4, i5, LayoutOrientation.Vertical, LayoutOrientation.Horizontal));
        }
    };
    private static final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> HorizontalMaxHeight = new Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxHeight$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }

        public final Integer invoke(List<? extends IntrinsicMeasurable> measurables, int i4, int i5) {
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            return Integer.valueOf(RowColumnImplKt.intrinsicSize(measurables, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxHeight$1.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicSize, int i6) {
                    Intrinsics.checkNotNullParameter(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.maxIntrinsicHeight(i6));
                }
            }, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxHeight$1.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicSize, int i6) {
                    Intrinsics.checkNotNullParameter(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.maxIntrinsicWidth(i6));
                }
            }, i4, i5, LayoutOrientation.Horizontal, LayoutOrientation.Vertical));
        }
    };
    private static final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> VerticalMaxHeight = new Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxHeight$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }

        public final Integer invoke(List<? extends IntrinsicMeasurable> measurables, int i4, int i5) {
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            C05471 c05471 = new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxHeight$1.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicSize, int i6) {
                    Intrinsics.checkNotNullParameter(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.maxIntrinsicHeight(i6));
                }
            };
            C05482 c05482 = new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxHeight$1.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }

                public final Integer invoke(IntrinsicMeasurable intrinsicSize, int i6) {
                    Intrinsics.checkNotNullParameter(intrinsicSize, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicSize.maxIntrinsicWidth(i6));
                }
            };
            LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
            return Integer.valueOf(RowColumnImplKt.intrinsicSize(measurables, c05471, c05482, i4, i5, layoutOrientation, layoutOrientation));
        }
    };

    private IntrinsicMeasureBlocks() {
    }

    public final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getHorizontalMaxHeight() {
        return HorizontalMaxHeight;
    }

    public final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getHorizontalMaxWidth() {
        return HorizontalMaxWidth;
    }

    public final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getHorizontalMinHeight() {
        return HorizontalMinHeight;
    }

    public final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getHorizontalMinWidth() {
        return HorizontalMinWidth;
    }

    public final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getVerticalMaxHeight() {
        return VerticalMaxHeight;
    }

    public final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getVerticalMaxWidth() {
        return VerticalMaxWidth;
    }

    public final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getVerticalMinHeight() {
        return VerticalMinHeight;
    }

    public final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getVerticalMinWidth() {
        return VerticalMinWidth;
    }
}
