package androidx.compose.material3.tokens;

import androidx.camera.video.AudioStats;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p014ui.graphics.RectangleShapeKt;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ShapeTokens {
    public static final int $stable = 0;
    private static final RoundedCornerShape CornerExtraLarge;
    private static final RoundedCornerShape CornerExtraLargeTop;
    private static final RoundedCornerShape CornerExtraSmall;
    private static final RoundedCornerShape CornerExtraSmallTop;
    private static final RoundedCornerShape CornerFull;
    private static final RoundedCornerShape CornerLarge;
    private static final RoundedCornerShape CornerLargeEnd;
    private static final RoundedCornerShape CornerLargeTop;
    private static final RoundedCornerShape CornerMedium;
    private static final Shape CornerNone;
    private static final RoundedCornerShape CornerSmall;
    public static final ShapeTokens INSTANCE = new ShapeTokens();

    static {
        float f10 = (float) 28.0d;
        CornerExtraLarge = RoundedCornerShapeKt.m27755RoundedCornerShape0680j_4(C3186Dp.m33501constructorimpl(f10));
        float fM33501constructorimpl = C3186Dp.m33501constructorimpl(f10);
        float fM33501constructorimpl2 = C3186Dp.m33501constructorimpl(f10);
        float f11 = (float) AudioStats.AUDIO_AMPLITUDE_NONE;
        CornerExtraLargeTop = RoundedCornerShapeKt.m27756RoundedCornerShapea9UjIt4(fM33501constructorimpl, fM33501constructorimpl2, C3186Dp.m33501constructorimpl(f11), C3186Dp.m33501constructorimpl(f11));
        float f12 = (float) 4.0d;
        CornerExtraSmall = RoundedCornerShapeKt.m27755RoundedCornerShape0680j_4(C3186Dp.m33501constructorimpl(f12));
        CornerExtraSmallTop = RoundedCornerShapeKt.m27756RoundedCornerShapea9UjIt4(C3186Dp.m33501constructorimpl(f12), C3186Dp.m33501constructorimpl(f12), C3186Dp.m33501constructorimpl(f11), C3186Dp.m33501constructorimpl(f11));
        CornerFull = RoundedCornerShapeKt.getCircleShape();
        float f13 = (float) 16.0d;
        CornerLarge = RoundedCornerShapeKt.m27755RoundedCornerShape0680j_4(C3186Dp.m33501constructorimpl(f13));
        CornerLargeEnd = RoundedCornerShapeKt.m27756RoundedCornerShapea9UjIt4(C3186Dp.m33501constructorimpl(f11), C3186Dp.m33501constructorimpl(f13), C3186Dp.m33501constructorimpl(f13), C3186Dp.m33501constructorimpl(f11));
        CornerLargeTop = RoundedCornerShapeKt.m27756RoundedCornerShapea9UjIt4(C3186Dp.m33501constructorimpl(f13), C3186Dp.m33501constructorimpl(f13), C3186Dp.m33501constructorimpl(f11), C3186Dp.m33501constructorimpl(f11));
        CornerMedium = RoundedCornerShapeKt.m27755RoundedCornerShape0680j_4(C3186Dp.m33501constructorimpl((float) 12.0d));
        CornerNone = RectangleShapeKt.getRectangleShape();
        CornerSmall = RoundedCornerShapeKt.m27755RoundedCornerShape0680j_4(C3186Dp.m33501constructorimpl((float) 8.0d));
    }

    private ShapeTokens() {
    }

    public final RoundedCornerShape getCornerExtraLarge() {
        return CornerExtraLarge;
    }

    public final RoundedCornerShape getCornerExtraLargeTop() {
        return CornerExtraLargeTop;
    }

    public final RoundedCornerShape getCornerExtraSmall() {
        return CornerExtraSmall;
    }

    public final RoundedCornerShape getCornerExtraSmallTop() {
        return CornerExtraSmallTop;
    }

    public final RoundedCornerShape getCornerFull() {
        return CornerFull;
    }

    public final RoundedCornerShape getCornerLarge() {
        return CornerLarge;
    }

    public final RoundedCornerShape getCornerLargeEnd() {
        return CornerLargeEnd;
    }

    public final RoundedCornerShape getCornerLargeTop() {
        return CornerLargeTop;
    }

    public final RoundedCornerShape getCornerMedium() {
        return CornerMedium;
    }

    public final Shape getCornerNone() {
        return CornerNone;
    }

    public final RoundedCornerShape getCornerSmall() {
        return CornerSmall;
    }
}
