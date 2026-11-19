package androidx.compose.foundation.text.input.internal.selection;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.p013ui.text.TextRange;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class TextPreparedSelectionKt {

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
            return CursorAndWedgeAffinity.m21493constructorimpl(i11);
        }
        boolean z10 = i10 > i11;
        long jM21478mapFromTransformedjx7JFs = transformedTextFieldState.m21478mapFromTransformedjx7JFs(i10);
        long jM21481mapToTransformedGEjPoXI = transformedTextFieldState.m21481mapToTransformedGEjPoXI(jM21478mapFromTransformedjx7JFs);
        int i12 = WhenMappings.$EnumSwitchMapping$0[((TextRange.m26358getCollapsedimpl(jM21478mapFromTransformedjx7JFs) && TextRange.m26358getCollapsedimpl(jM21481mapToTransformedGEjPoXI)) ? IndexTransformationType.Untransformed : (TextRange.m26358getCollapsedimpl(jM21478mapFromTransformedjx7JFs) || TextRange.m26358getCollapsedimpl(jM21481mapToTransformedGEjPoXI)) ? (!TextRange.m26358getCollapsedimpl(jM21478mapFromTransformedjx7JFs) || TextRange.m26358getCollapsedimpl(jM21481mapToTransformedGEjPoXI)) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion : IndexTransformationType.Replacement).ordinal()];
        if (i12 == 1) {
            return CursorAndWedgeAffinity.m21494constructorimpl(i10, z10 ? WedgeAffinity.Start : WedgeAffinity.End);
        }
        if (i12 == 2) {
            return CursorAndWedgeAffinity.m21493constructorimpl(i10);
        }
        if (i12 == 3) {
            return z10 ? CursorAndWedgeAffinity.m21494constructorimpl(TextRange.m26359getEndimpl(jM21481mapToTransformedGEjPoXI), WedgeAffinity.Start) : CursorAndWedgeAffinity.m21494constructorimpl(TextRange.m26364getStartimpl(jM21481mapToTransformedGEjPoXI), WedgeAffinity.End);
        }
        if (i12 == 4) {
            return z10 ? i10 == TextRange.m26364getStartimpl(jM21481mapToTransformedGEjPoXI) ? CursorAndWedgeAffinity.m21494constructorimpl(i10, WedgeAffinity.Start) : CursorAndWedgeAffinity.m21494constructorimpl(TextRange.m26359getEndimpl(jM21481mapToTransformedGEjPoXI), WedgeAffinity.End) : i10 == TextRange.m26359getEndimpl(jM21481mapToTransformedGEjPoXI) ? CursorAndWedgeAffinity.m21494constructorimpl(i10, WedgeAffinity.End) : CursorAndWedgeAffinity.m21494constructorimpl(TextRange.m26364getStartimpl(jM21481mapToTransformedGEjPoXI), WedgeAffinity.Start);
        }
        throw new NoWhenBranchMatchedException();
    }
}
