package androidx.compose.p014ui.platform;

import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.DpKt;

/* loaded from: classes2.dex */
public interface ViewConfiguration {

    public static final class DefaultImpls {
        @Deprecated
        public static float getHandwritingGestureLineMargin(ViewConfiguration viewConfiguration) {
            return ViewConfiguration.super.getHandwritingGestureLineMargin();
        }

        @Deprecated
        public static float getHandwritingSlop(ViewConfiguration viewConfiguration) {
            return ViewConfiguration.super.getHandwritingSlop();
        }

        @Deprecated
        public static float getMaximumFlingVelocity(ViewConfiguration viewConfiguration) {
            return ViewConfiguration.super.getMaximumFlingVelocity();
        }

        @Deprecated
        /* renamed from: getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
        public static long m32708getMinimumTouchTargetSizeMYxV2XQ(ViewConfiguration viewConfiguration) {
            return ViewConfiguration.super.mo32418getMinimumTouchTargetSizeMYxV2XQ();
        }
    }

    long getDoubleTapMinTimeMillis();

    long getDoubleTapTimeoutMillis();

    default float getHandwritingGestureLineMargin() {
        return 16.0f;
    }

    default float getHandwritingSlop() {
        return 2.0f;
    }

    long getLongPressTimeoutMillis();

    default float getMaximumFlingVelocity() {
        return Float.MAX_VALUE;
    }

    /* renamed from: getMinimumTouchTargetSize-MYxV2XQ */
    default long mo32418getMinimumTouchTargetSizeMYxV2XQ() {
        float f10 = 48;
        return DpKt.m33523DpSizeYgX7TsA(C3186Dp.m33501constructorimpl(f10), C3186Dp.m33501constructorimpl(f10));
    }

    float getTouchSlop();
}
