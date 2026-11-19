package androidx.compose.foundation;

import androidx.compose.foundation.MarqueeSpacing;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.Stable;
import p322z7.AbstractC10729c;

@Stable
/* loaded from: classes.dex */
public interface MarqueeSpacing {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int fractionOfContainer$lambda$0(float f10, Density density, int i10, int i11) {
            return AbstractC10729c.m20035d(f10 * i11);
        }

        public final MarqueeSpacing fractionOfContainer(final float f10) {
            return new MarqueeSpacing() { // from class: androidx.compose.foundation.d
                @Override // androidx.compose.foundation.MarqueeSpacing
                public final int calculateSpacing(Density density, int i10, int i11) {
                    return MarqueeSpacing.Companion.fractionOfContainer$lambda$0(f10, density, i10, i11);
                }
            };
        }
    }

    int calculateSpacing(Density density, int i10, int i11);
}
