package androidx.compose.foundation.text.input.internal.selection;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.p011ui.text.TextRange;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m5110d2 = {"calculateNextCursorPositionAndWedgeAffinity", "Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;", "proposedCursor", "", "cursor", "transformedTextFieldState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "(IILandroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)J", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt\n+ 2 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldStateKt\n*L\n1#1,560:1\n722#2,23:561\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt\n*L\n465#1:561,23\n*E\n"})
/* loaded from: classes.dex */
public final class TextPreparedSelectionKt {

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IndexTransformationType.values().length];
            try {
                iArr[IndexTransformationType.Untransformed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IndexTransformationType.Deletion.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IndexTransformationType.Replacement.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IndexTransformationType.Insertion.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @VisibleForTesting
    public static final long calculateNextCursorPositionAndWedgeAffinity(int i, int i8, @NotNull TransformedTextFieldState transformedTextFieldState) {
        if (i == -1) {
            return CursorAndWedgeAffinity.m7899constructorimpl(i8);
        }
        boolean z8 = i > i8;
        long jM7884mapFromTransformedjx7JFs = transformedTextFieldState.m7884mapFromTransformedjx7JFs(i);
        long jM7887mapToTransformedGEjPoXI = transformedTextFieldState.m7887mapToTransformedGEjPoXI(jM7884mapFromTransformedjx7JFs);
        int i9 = WhenMappings.$EnumSwitchMapping$0[((TextRange.m12764getCollapsedimpl(jM7884mapFromTransformedjx7JFs) && TextRange.m12764getCollapsedimpl(jM7887mapToTransformedGEjPoXI)) ? IndexTransformationType.Untransformed : (TextRange.m12764getCollapsedimpl(jM7884mapFromTransformedjx7JFs) || TextRange.m12764getCollapsedimpl(jM7887mapToTransformedGEjPoXI)) ? (!TextRange.m12764getCollapsedimpl(jM7884mapFromTransformedjx7JFs) || TextRange.m12764getCollapsedimpl(jM7887mapToTransformedGEjPoXI)) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion : IndexTransformationType.Replacement).ordinal()];
        if (i9 == 1) {
            return CursorAndWedgeAffinity.m7900constructorimpl(i, z8 ? WedgeAffinity.Start : WedgeAffinity.End);
        }
        if (i9 == 2) {
            return CursorAndWedgeAffinity.m7899constructorimpl(i);
        }
        if (i9 == 3) {
            return z8 ? CursorAndWedgeAffinity.m7900constructorimpl(TextRange.m12765getEndimpl(jM7887mapToTransformedGEjPoXI), WedgeAffinity.Start) : CursorAndWedgeAffinity.m7900constructorimpl(TextRange.m12770getStartimpl(jM7887mapToTransformedGEjPoXI), WedgeAffinity.End);
        }
        if (i9 == 4) {
            return z8 ? i == TextRange.m12770getStartimpl(jM7887mapToTransformedGEjPoXI) ? CursorAndWedgeAffinity.m7900constructorimpl(i, WedgeAffinity.Start) : CursorAndWedgeAffinity.m7900constructorimpl(TextRange.m12765getEndimpl(jM7887mapToTransformedGEjPoXI), WedgeAffinity.End) : i == TextRange.m12765getEndimpl(jM7887mapToTransformedGEjPoXI) ? CursorAndWedgeAffinity.m7900constructorimpl(i, WedgeAffinity.End) : CursorAndWedgeAffinity.m7900constructorimpl(TextRange.m12770getStartimpl(jM7887mapToTransformedGEjPoXI), WedgeAffinity.Start);
        }
        throw new NoWhenBranchMatchedException();
    }
}
