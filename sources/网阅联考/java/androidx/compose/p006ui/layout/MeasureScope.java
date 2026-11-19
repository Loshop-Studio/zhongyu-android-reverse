package androidx.compose.p006ui.layout;

import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.layout.Placeable;
import androidx.compose.p006ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.p006ui.node.LookaheadCapablePlaceable;
import androidx.compose.p006ui.unit.AbstractC1702a;
import androidx.compose.p006ui.unit.DpRect;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JG\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, m5175d2 = {"Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "layout", "Landroidx/compose/ui/layout/MeasureResult;", "width", "", "height", "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "placementBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface MeasureScope extends IntrinsicMeasureScope {

    /* renamed from: androidx.compose.ui.layout.MeasureScope$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        /* renamed from: a */
        public static MeasureResult m619a(MeasureScope measureScope, int i4, int i5, Map alignmentLines, Function1 placementBlock) {
            Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
            Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
            return new MeasureResult(i4, i5, alignmentLines, measureScope, placementBlock) { // from class: androidx.compose.ui.layout.MeasureScope.layout.1
                final /* synthetic */ Function1<Placeable.PlacementScope, Unit> $placementBlock;
                final /* synthetic */ int $width;
                private final Map<AlignmentLine, Integer> alignmentLines;
                private final int height;
                final /* synthetic */ MeasureScope this$0;
                private final int width;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.$width = i4;
                    this.this$0 = measureScope;
                    this.$placementBlock = placementBlock;
                    this.width = i4;
                    this.height = i5;
                    this.alignmentLines = alignmentLines;
                }

                @Override // androidx.compose.p006ui.layout.MeasureResult
                public Map<AlignmentLine, Integer> getAlignmentLines() {
                    return this.alignmentLines;
                }

                @Override // androidx.compose.p006ui.layout.MeasureResult
                public int getHeight() {
                    return this.height;
                }

                @Override // androidx.compose.p006ui.layout.MeasureResult
                public int getWidth() {
                    return this.width;
                }

                @Override // androidx.compose.p006ui.layout.MeasureResult
                public void placeChildren() {
                    Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
                    int i6 = this.$width;
                    LayoutDirection layoutDirection = this.this$0.getLayoutDirection();
                    MeasureScope measureScope2 = this.this$0;
                    LookaheadCapablePlaceable lookaheadCapablePlaceable = measureScope2 instanceof LookaheadCapablePlaceable ? (LookaheadCapablePlaceable) measureScope2 : null;
                    Function1<Placeable.PlacementScope, Unit> function1 = this.$placementBlock;
                    LayoutCoordinates layoutCoordinates = Placeable.PlacementScope._coordinates;
                    int parentWidth = companion.getParentWidth();
                    LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = Placeable.PlacementScope.layoutDelegate;
                    Placeable.PlacementScope.parentWidth = i6;
                    Placeable.PlacementScope.parentLayoutDirection = layoutDirection;
                    boolean zConfigureForPlacingForAlignment = companion.configureForPlacingForAlignment(lookaheadCapablePlaceable);
                    function1.invoke(companion);
                    if (lookaheadCapablePlaceable != null) {
                        lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(zConfigureForPlacingForAlignment);
                    }
                    Placeable.PlacementScope.parentWidth = parentWidth;
                    Placeable.PlacementScope.parentLayoutDirection = parentLayoutDirection;
                    Placeable.PlacementScope._coordinates = layoutCoordinates;
                    Placeable.PlacementScope.layoutDelegate = layoutNodeLayoutDelegate;
                }
            };
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: p */
        public static /* synthetic */ MeasureResult m634p(MeasureScope measureScope, int i4, int i5, Map map, Function1 function1, int i6, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
            }
            if ((i6 & 4) != 0) {
                map = MapsKt__MapsKt.emptyMap();
            }
            return measureScope.layout(i4, i5, map, function1);
        }
    }

    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        @Deprecated
        public static MeasureResult layout(MeasureScope measureScope, int i4, int i5, Map<AlignmentLine, Integer> alignmentLines, Function1<? super Placeable.PlacementScope, Unit> placementBlock) {
            Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
            Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
            return CC.m619a(measureScope, i4, i5, alignmentLines, placementBlock);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m10599roundToPxR2X_6o(MeasureScope measureScope, long j4) {
            return AbstractC1702a.m906a(measureScope, j4);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m10600roundToPx0680j_4(MeasureScope measureScope, float f4) {
            return AbstractC1702a.m907b(measureScope, f4);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m10601toDpGaN1DYA(MeasureScope measureScope, long j4) {
            return AbstractC1702a.m908c(measureScope, j4);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m10602toDpu2uoSUM(MeasureScope measureScope, float f4) {
            return AbstractC1702a.m909d(measureScope, f4);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m10604toDpSizekrfVVM(MeasureScope measureScope, long j4) {
            return AbstractC1702a.m911f(measureScope, j4);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m10605toPxR2X_6o(MeasureScope measureScope, long j4) {
            return AbstractC1702a.m912g(measureScope, j4);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m10606toPx0680j_4(MeasureScope measureScope, float f4) {
            return AbstractC1702a.m913h(measureScope, f4);
        }

        @Stable
        @Deprecated
        public static Rect toRect(MeasureScope measureScope, DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return AbstractC1702a.m914i(measureScope, receiver);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m10607toSizeXkaWNTQ(MeasureScope measureScope, long j4) {
            return AbstractC1702a.m915j(measureScope, j4);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m10608toSp0xMU5do(MeasureScope measureScope, float f4) {
            return AbstractC1702a.m916k(measureScope, f4);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m10609toSpkPz2Gy4(MeasureScope measureScope, float f4) {
            return AbstractC1702a.m917l(measureScope, f4);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m10603toDpu2uoSUM(MeasureScope measureScope, int i4) {
            return AbstractC1702a.m910e(measureScope, i4);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m10610toSpkPz2Gy4(MeasureScope measureScope, int i4) {
            return AbstractC1702a.m918m(measureScope, i4);
        }
    }

    MeasureResult layout(int width, int height, Map<AlignmentLine, Integer> alignmentLines, Function1<? super Placeable.PlacementScope, Unit> placementBlock);
}
