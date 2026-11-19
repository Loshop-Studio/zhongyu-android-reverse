package androidx.compose.foundation.pager;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.Stable;

@Stable
/* loaded from: classes.dex */
public interface PagerSnapDistance {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final PagerSnapDistance atMost(int i10) {
            if (!(i10 >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("pages should be greater than or equal to 0. You have used " + i10 + '.');
            }
            return new PagerSnapDistanceMaxPages(i10);
        }
    }

    int calculateTargetPage(int i10, int i11, float f10, int i12, int i13);
}
