package androidx.compose.foundation.text.input.internal.selection;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.p012ui.text.TextRange;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m13413d2 = {"calculateNextCursorPositionAndWedgeAffinity", "Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;", "proposedCursor", "", "cursor", "transformedTextFieldState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "(IILandroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)J", "foundation_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt\n+ 2 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldStateKt\n*L\n1#1,560:1\n722#2,23:561\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt\n*L\n465#1:561,23\n*E\n"})
/* loaded from: classes.dex */
public final class TextPreparedSelectionKt {

    @Metadata(m13414k = 3, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
    public static final long calculateNextCursorPositionAndWedgeAffinity(int i9, int i10, TransformedTextFieldState transformedTextFieldState) {
        if (i9 == -1) {
            return CursorAndWedgeAffinity.m18715constructorimpl(i10);
        }
        boolean z9 = i9 > i10;
        long jM18700mapFromTransformedjx7JFs = transformedTextFieldState.m18700mapFromTransformedjx7JFs(i9);
        long jM18703mapToTransformedGEjPoXI = transformedTextFieldState.m18703mapToTransformedGEjPoXI(jM18700mapFromTransformedjx7JFs);
        int i11 = WhenMappings.$EnumSwitchMapping$0[((TextRange.m23454getCollapsedimpl(jM18700mapFromTransformedjx7JFs) && TextRange.m23454getCollapsedimpl(jM18703mapToTransformedGEjPoXI)) ? IndexTransformationType.Untransformed : (TextRange.m23454getCollapsedimpl(jM18700mapFromTransformedjx7JFs) || TextRange.m23454getCollapsedimpl(jM18703mapToTransformedGEjPoXI)) ? (!TextRange.m23454getCollapsedimpl(jM18700mapFromTransformedjx7JFs) || TextRange.m23454getCollapsedimpl(jM18703mapToTransformedGEjPoXI)) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion : IndexTransformationType.Replacement).ordinal()];
        if (i11 == 1) {
            return CursorAndWedgeAffinity.m18716constructorimpl(i9, z9 ? WedgeAffinity.Start : WedgeAffinity.End);
        }
        if (i11 == 2) {
            return CursorAndWedgeAffinity.m18715constructorimpl(i9);
        }
        if (i11 == 3) {
            return z9 ? CursorAndWedgeAffinity.m18716constructorimpl(TextRange.m23455getEndimpl(jM18703mapToTransformedGEjPoXI), WedgeAffinity.Start) : CursorAndWedgeAffinity.m18716constructorimpl(TextRange.m23460getStartimpl(jM18703mapToTransformedGEjPoXI), WedgeAffinity.End);
        }
        if (i11 == 4) {
            return z9 ? i9 == TextRange.m23460getStartimpl(jM18703mapToTransformedGEjPoXI) ? CursorAndWedgeAffinity.m18716constructorimpl(i9, WedgeAffinity.Start) : CursorAndWedgeAffinity.m18716constructorimpl(TextRange.m23455getEndimpl(jM18703mapToTransformedGEjPoXI), WedgeAffinity.End) : i9 == TextRange.m23455getEndimpl(jM18703mapToTransformedGEjPoXI) ? CursorAndWedgeAffinity.m18716constructorimpl(i9, WedgeAffinity.End) : CursorAndWedgeAffinity.m18716constructorimpl(TextRange.m23460getStartimpl(jM18703mapToTransformedGEjPoXI), WedgeAffinity.Start);
        }
        throw new NoWhenBranchMatchedException();
    }
}
