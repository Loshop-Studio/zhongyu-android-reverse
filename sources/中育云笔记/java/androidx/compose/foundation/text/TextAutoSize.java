package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.unit.TextUnitKt;

/* loaded from: classes.dex */
public interface TextAutoSize {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* renamed from: StepBased-vU-0ePk$default, reason: not valid java name */
        public static /* synthetic */ TextAutoSize m27878StepBasedvU0ePk$default(Companion companion, long j10, long j11, long j12, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = TextAutoSizeDefaults.INSTANCE.m27881getMinFontSizeXSAIIZE();
            }
            long j13 = j10;
            if ((i10 & 2) != 0) {
                j11 = TextAutoSizeDefaults.INSTANCE.m27880getMaxFontSizeXSAIIZE();
            }
            long j14 = j11;
            if ((i10 & 4) != 0) {
                j12 = TextUnitKt.getSp(0.25d);
            }
            return companion.m27879StepBasedvU0ePk(j13, j14, j12);
        }

        /* renamed from: StepBased-vU-0ePk, reason: not valid java name */
        public final TextAutoSize m27879StepBasedvU0ePk(long j10, long j11, long j12) {
            return new AutoSizeStepBased(j10, j11, j12, null);
        }
    }

    boolean equals(Object obj);

    /* renamed from: getFontSize-Ci0_558 */
    long mo27759getFontSizeCi0_558(TextAutoSizeLayoutScope textAutoSizeLayoutScope, long j10, AnnotatedString annotatedString);

    int hashCode();
}
