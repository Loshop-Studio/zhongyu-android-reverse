package androidx.compose.foundation.text.input.internal.selection;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.p013ui.text.TextRange;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m13558d2 = {"calculateNextCursorPositionAndWedgeAffinity", "Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;", "proposedCursor", "", "cursor", "transformedTextFieldState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "(IILandroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)J", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt\n+ 2 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldStateKt\n*L\n1#1,560:1\n722#2,23:561\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt\n*L\n465#1:561,23\n*E\n"})
/* loaded from: classes.dex */
public final class TextPreparedSelectionKt {

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
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
    public static final long calculateNextCursorPositionAndWedgeAffinity(int i10, int i11, TransformedTextFieldState transformedTextFieldState) {
        if (i10 == -1) {
            return CursorAndWedgeAffinity.m18282constructorimpl(i11);
        }
        boolean z9 = i10 > i11;
        long jM18267mapFromTransformedjx7JFs = transformedTextFieldState.m18267mapFromTransformedjx7JFs(i10);
        long jM18270mapToTransformedGEjPoXI = transformedTextFieldState.m18270mapToTransformedGEjPoXI(jM18267mapFromTransformedjx7JFs);
        int i12 = WhenMappings.$EnumSwitchMapping$0[((TextRange.m23021getCollapsedimpl(jM18267mapFromTransformedjx7JFs) && TextRange.m23021getCollapsedimpl(jM18270mapToTransformedGEjPoXI)) ? IndexTransformationType.Untransformed : (TextRange.m23021getCollapsedimpl(jM18267mapFromTransformedjx7JFs) || TextRange.m23021getCollapsedimpl(jM18270mapToTransformedGEjPoXI)) ? (!TextRange.m23021getCollapsedimpl(jM18267mapFromTransformedjx7JFs) || TextRange.m23021getCollapsedimpl(jM18270mapToTransformedGEjPoXI)) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion : IndexTransformationType.Replacement).ordinal()];
        if (i12 == 1) {
            return CursorAndWedgeAffinity.m18283constructorimpl(i10, z9 ? WedgeAffinity.Start : WedgeAffinity.End);
        }
        if (i12 == 2) {
            return CursorAndWedgeAffinity.m18282constructorimpl(i10);
        }
        if (i12 == 3) {
            return z9 ? CursorAndWedgeAffinity.m18283constructorimpl(TextRange.m23022getEndimpl(jM18270mapToTransformedGEjPoXI), WedgeAffinity.Start) : CursorAndWedgeAffinity.m18283constructorimpl(TextRange.m23027getStartimpl(jM18270mapToTransformedGEjPoXI), WedgeAffinity.End);
        }
        if (i12 == 4) {
            return z9 ? i10 == TextRange.m23027getStartimpl(jM18270mapToTransformedGEjPoXI) ? CursorAndWedgeAffinity.m18283constructorimpl(i10, WedgeAffinity.Start) : CursorAndWedgeAffinity.m18283constructorimpl(TextRange.m23022getEndimpl(jM18270mapToTransformedGEjPoXI), WedgeAffinity.End) : i10 == TextRange.m23022getEndimpl(jM18270mapToTransformedGEjPoXI) ? CursorAndWedgeAffinity.m18283constructorimpl(i10, WedgeAffinity.End) : CursorAndWedgeAffinity.m18283constructorimpl(TextRange.m23027getStartimpl(jM18270mapToTransformedGEjPoXI), WedgeAffinity.Start);
        }
        throw new NoWhenBranchMatchedException();
    }
}
