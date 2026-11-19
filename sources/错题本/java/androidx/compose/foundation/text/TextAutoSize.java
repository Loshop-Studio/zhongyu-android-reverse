package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.unit.TextUnitKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u0013\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H¦\u0002J\b\u0010\u0005\u001a\u00020\u0006H&J&\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, m5110d2 = {"Landroidx/compose/foundation/text/TextAutoSize;", "", "equals", "", "other", "hashCode", "", "getFontSize", "Landroidx/compose/ui/unit/TextUnit;", "Landroidx/compose/foundation/text/modifiers/TextAutoSizeLayoutScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "getFontSize-Ci0_558", "(Landroidx/compose/foundation/text/modifiers/TextAutoSizeLayoutScope;JLandroidx/compose/ui/text/AnnotatedString;)J", "Companion", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface TextAutoSize {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, m5110d2 = {"Landroidx/compose/foundation/text/TextAutoSize$Companion;", "", "()V", "StepBased", "Landroidx/compose/foundation/text/TextAutoSize;", "minFontSize", "Landroidx/compose/ui/unit/TextUnit;", "maxFontSize", "stepSize", "StepBased-vU-0ePk", "(JJJ)Landroidx/compose/foundation/text/TextAutoSize;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* renamed from: StepBased-vU-0ePk$default, reason: not valid java name */
        public static /* synthetic */ TextAutoSize m7682StepBasedvU0ePk$default(Companion companion, long j7, long j8, long j9, int i, Object obj) {
            if ((i & 1) != 0) {
                j7 = TextAutoSizeDefaults.INSTANCE.m7685getMinFontSizeXSAIIZE();
            }
            long j10 = j7;
            if ((i & 2) != 0) {
                j8 = TextAutoSizeDefaults.INSTANCE.m7684getMaxFontSizeXSAIIZE();
            }
            long j11 = j8;
            if ((i & 4) != 0) {
                j9 = TextUnitKt.getSp(0.25d);
            }
            return companion.m7683StepBasedvU0ePk(j10, j11, j9);
        }

        @NotNull
        /* renamed from: StepBased-vU-0ePk, reason: not valid java name */
        public final TextAutoSize m7683StepBasedvU0ePk(long minFontSize, long maxFontSize, long stepSize) {
            return new AutoSizeStepBased(minFontSize, maxFontSize, stepSize, null);
        }
    }

    boolean equals(@Nullable Object other);

    /* renamed from: getFontSize-Ci0_558 */
    long mo7563getFontSizeCi0_558(@NotNull TextAutoSizeLayoutScope textAutoSizeLayoutScope, long j7, @NotNull AnnotatedString annotatedString);

    int hashCode();
}
