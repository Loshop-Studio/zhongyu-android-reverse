package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J=\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJi\u0010\u001f\u001a\u00020\u001e2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J/\u0010$\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b$\u0010%J/\u0010(\u001a\u00020'2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u00068À\u0006\u0001"}, m5110d2 = {"Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "Landroidx/compose/ui/layout/Placeable;", "", "mainAxisSize", "(Landroidx/compose/ui/layout/Placeable;)I", "crossAxisSize", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "", "isPrioritizing", "Landroidx/compose/ui/unit/Constraints;", "createConstraints-xF2OJ5Q", "(IIIIZ)J", "createConstraints", "", "placeables", "Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "beforeCrossAxisAlignmentLine", "", "mainAxisPositions", "mainAxisLayoutSize", "crossAxisLayoutSize", "crossAxisOffset", "currentLineIndex", "startIndex", "endIndex", "Landroidx/compose/ui/layout/MeasureResult;", "placeHelper", "([Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/MeasureScope;I[III[IIII)Landroidx/compose/ui/layout/MeasureResult;", "placeable", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getCrossAxisPosition", "(Landroidx/compose/ui/layout/Placeable;ILandroidx/compose/ui/unit/LayoutDirection;I)I", "childrenMainAxisSize", "Ld6/s;", "populateMainAxisPositions", "(I[I[ILandroidx/compose/ui/layout/MeasureScope;)V", "isHorizontal", "()Z", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getHorizontalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getVerticalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisAlignment", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface FlowLineMeasurePolicy extends RowColumnMeasurePolicy {
    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    /* renamed from: createConstraints-xF2OJ5Q */
    default long mo7175createConstraintsxF2OJ5Q(int mainAxisMin, int crossAxisMin, int mainAxisMax, int crossAxisMax, boolean isPrioritizing) {
        return isHorizontal() ? RowKt.createRowConstraints(isPrioritizing, mainAxisMin, crossAxisMin, mainAxisMax, crossAxisMax) : ColumnKt.createColumnConstraints(isPrioritizing, mainAxisMin, crossAxisMin, mainAxisMax, crossAxisMax);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default int crossAxisSize(@NotNull Placeable placeable) {
        return isHorizontal() ? placeable.getMeasuredHeight() : placeable.getMeasuredWidth();
    }

    @NotNull
    CrossAxisAlignment getCrossAxisAlignment();

    default int getCrossAxisPosition(@NotNull Placeable placeable, int crossAxisLayoutSize, @NotNull LayoutDirection layoutDirection, int beforeCrossAxisAlignmentLine) {
        CrossAxisAlignment crossAxisAlignment;
        RowColumnParentData rowColumnParentData = RowColumnImplKt.getRowColumnParentData(placeable);
        if (rowColumnParentData == null || (crossAxisAlignment = rowColumnParentData.getCrossAxisAlignment()) == null) {
            crossAxisAlignment = getCrossAxisAlignment();
        }
        return crossAxisAlignment.align$foundation_layout_release(crossAxisLayoutSize - crossAxisSize(placeable), layoutDirection, placeable, beforeCrossAxisAlignmentLine);
    }

    @NotNull
    Arrangement.Horizontal getHorizontalArrangement();

    @NotNull
    Arrangement.Vertical getVerticalArrangement();

    boolean isHorizontal();

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default int mainAxisSize(@NotNull Placeable placeable) {
        return isHorizontal() ? placeable.getMeasuredWidth() : placeable.getMeasuredHeight();
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    @NotNull
    default MeasureResult placeHelper(@NotNull final Placeable[] placeables, @NotNull MeasureScope measureScope, final int beforeCrossAxisAlignmentLine, @NotNull final int[] mainAxisPositions, int mainAxisLayoutSize, final int crossAxisLayoutSize, @Nullable final int[] crossAxisOffset, final int currentLineIndex, final int startIndex, final int endIndex) {
        int i;
        int i8;
        if (isHorizontal()) {
            i8 = mainAxisLayoutSize;
            i = crossAxisLayoutSize;
        } else {
            i = mainAxisLayoutSize;
            i8 = crossAxisLayoutSize;
        }
        final LayoutDirection layoutDirection = isHorizontal() ? LayoutDirection.Ltr : measureScope.getLayoutDirection();
        return MeasureScope.layout$default(measureScope, i8, i, null, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.FlowLineMeasurePolicy$placeHelper$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope placementScope2;
                int[] iArr = crossAxisOffset;
                int i9 = iArr != null ? iArr[currentLineIndex] : 0;
                int i10 = startIndex;
                while (i10 < endIndex) {
                    Placeable placeable = placeables[i10];
                    AbstractC5830k.m5327d(placeable);
                    int crossAxisPosition = this.getCrossAxisPosition(placeable, crossAxisLayoutSize, layoutDirection, beforeCrossAxisAlignmentLine) + i9;
                    if (this.isHorizontal()) {
                        placementScope2 = placementScope;
                        Placeable.PlacementScope.place$default(placementScope2, placeable, mainAxisPositions[i10 - startIndex], crossAxisPosition, 0.0f, 4, null);
                    } else {
                        placementScope2 = placementScope;
                        Placeable.PlacementScope.place$default(placementScope2, placeable, crossAxisPosition, mainAxisPositions[i10 - startIndex], 0.0f, 4, null);
                    }
                    i10++;
                    placementScope = placementScope2;
                }
            }
        }, 4, null);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    default void populateMainAxisPositions(int mainAxisLayoutSize, @NotNull int[] childrenMainAxisSize, @NotNull int[] mainAxisPositions, @NotNull MeasureScope measureScope) {
        if (isHorizontal()) {
            getHorizontalArrangement().arrange(measureScope, mainAxisLayoutSize, childrenMainAxisSize, measureScope.getLayoutDirection(), mainAxisPositions);
        } else {
            getVerticalArrangement().arrange(measureScope, mainAxisLayoutSize, childrenMainAxisSize, mainAxisPositions);
        }
    }
}
