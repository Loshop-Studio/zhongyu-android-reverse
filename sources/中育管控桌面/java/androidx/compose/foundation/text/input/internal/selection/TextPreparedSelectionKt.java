package androidx.compose.foundation.text.input.internal.selection;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.p009ui.text.TextRange;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m7880d2 = {"calculateNextCursorPositionAndWedgeAffinity", "Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;", "proposedCursor", "", "cursor", "transformedTextFieldState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "(IILandroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)J", "foundation_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt\n+ 2 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldStateKt\n*L\n1#1,560:1\n722#2,23:561\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextPreparedSelectionKt\n*L\n465#1:561,23\n*E\n"})
/* loaded from: classes.dex */
public final class TextPreparedSelectionKt {

    @Metadata(m7881k = 3, m7882mv = {1, 9, 0}, m7884xi = 48)
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
    public static final long calculateNextCursorPositionAndWedgeAffinity(int i6, int i7, TransformedTextFieldState transformedTextFieldState) {
        if (i6 == -1) {
            return CursorAndWedgeAffinity.m11205constructorimpl(i7);
        }
        boolean z6 = i6 > i7;
        long jM11190mapFromTransformedjx7JFs = transformedTextFieldState.m11190mapFromTransformedjx7JFs(i6);
        long jM11193mapToTransformedGEjPoXI = transformedTextFieldState.m11193mapToTransformedGEjPoXI(jM11190mapFromTransformedjx7JFs);
        int i8 = WhenMappings.$EnumSwitchMapping$0[((TextRange.m15944getCollapsedimpl(jM11190mapFromTransformedjx7JFs) && TextRange.m15944getCollapsedimpl(jM11193mapToTransformedGEjPoXI)) ? IndexTransformationType.Untransformed : (TextRange.m15944getCollapsedimpl(jM11190mapFromTransformedjx7JFs) || TextRange.m15944getCollapsedimpl(jM11193mapToTransformedGEjPoXI)) ? (!TextRange.m15944getCollapsedimpl(jM11190mapFromTransformedjx7JFs) || TextRange.m15944getCollapsedimpl(jM11193mapToTransformedGEjPoXI)) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion : IndexTransformationType.Replacement).ordinal()];
        if (i8 == 1) {
            return CursorAndWedgeAffinity.m11206constructorimpl(i6, z6 ? WedgeAffinity.Start : WedgeAffinity.End);
        }
        if (i8 == 2) {
            return CursorAndWedgeAffinity.m11205constructorimpl(i6);
        }
        if (i8 == 3) {
            return z6 ? CursorAndWedgeAffinity.m11206constructorimpl(TextRange.m15945getEndimpl(jM11193mapToTransformedGEjPoXI), WedgeAffinity.Start) : CursorAndWedgeAffinity.m11206constructorimpl(TextRange.m15950getStartimpl(jM11193mapToTransformedGEjPoXI), WedgeAffinity.End);
        }
        if (i8 == 4) {
            return z6 ? i6 == TextRange.m15950getStartimpl(jM11193mapToTransformedGEjPoXI) ? CursorAndWedgeAffinity.m11206constructorimpl(i6, WedgeAffinity.Start) : CursorAndWedgeAffinity.m11206constructorimpl(TextRange.m15945getEndimpl(jM11193mapToTransformedGEjPoXI), WedgeAffinity.End) : i6 == TextRange.m15945getEndimpl(jM11193mapToTransformedGEjPoXI) ? CursorAndWedgeAffinity.m11206constructorimpl(i6, WedgeAffinity.End) : CursorAndWedgeAffinity.m11206constructorimpl(TextRange.m15950getStartimpl(jM11193mapToTransformedGEjPoXI), WedgeAffinity.Start);
        }
        throw new NoWhenBranchMatchedException();
    }
}
