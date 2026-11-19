package androidx.compose.p013ui.text;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.text.TextInclusionStrategy;

/* loaded from: classes2.dex */
public interface TextInclusionStrategy {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final TextInclusionStrategy AnyOverlap = new TextInclusionStrategy() { // from class: androidx.compose.ui.text.a
            @Override // androidx.compose.p013ui.text.TextInclusionStrategy
            public final boolean isIncluded(Rect rect, Rect rect2) {
                return rect.overlaps(rect2);
            }
        };
        private static final TextInclusionStrategy ContainsAll = new TextInclusionStrategy() { // from class: androidx.compose.ui.text.b
            @Override // androidx.compose.p013ui.text.TextInclusionStrategy
            public final boolean isIncluded(Rect rect, Rect rect2) {
                return TextInclusionStrategy.Companion.ContainsAll$lambda$1(rect, rect2);
            }
        };
        private static final TextInclusionStrategy ContainsCenter = new TextInclusionStrategy() { // from class: androidx.compose.ui.text.c
            @Override // androidx.compose.p013ui.text.TextInclusionStrategy
            public final boolean isIncluded(Rect rect, Rect rect2) {
                return TextInclusionStrategy.Companion.ContainsCenter$lambda$2(rect, rect2);
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean ContainsAll$lambda$1(Rect rect, Rect rect2) {
            return !rect2.isEmpty() && rect.getLeft() >= rect2.getLeft() && rect.getRight() <= rect2.getRight() && rect.getTop() >= rect2.getTop() && rect.getBottom() <= rect2.getBottom();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean ContainsCenter$lambda$2(Rect rect, Rect rect2) {
            return rect2.m24061containsk4lQ0M(rect.m24065getCenterF1C5BW0());
        }

        public final TextInclusionStrategy getAnyOverlap() {
            return AnyOverlap;
        }

        public final TextInclusionStrategy getContainsAll() {
            return ContainsAll;
        }

        public final TextInclusionStrategy getContainsCenter() {
            return ContainsCenter;
        }
    }

    boolean isIncluded(Rect rect, Rect rect2);
}
