package androidx.compose.material3;

import androidx.camera.video.AudioStats;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.p013ui.graphics.RectangleShapeKt;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import kotlin.NoWhenBranchMatchedException;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public final class ShapesKt {
    private static final ProvidableCompositionLocal<Shapes> LocalShapes = CompositionLocalKt.staticCompositionLocalOf(new InterfaceC10559a() { // from class: androidx.compose.material3.ShapesKt$LocalShapes$1
        @Override // p300x7.InterfaceC10559a
        public final Shapes invoke() {
            return new Shapes(null, null, null, null, null, 31, null);
        }
    });

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShapeKeyTokens.values().length];
            try {
                iArr[ShapeKeyTokens.CornerExtraLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShapeKeyTokens.CornerExtraLargeTop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShapeKeyTokens.CornerExtraSmall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShapeKeyTokens.CornerExtraSmallTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShapeKeyTokens.CornerFull.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ShapeKeyTokens.CornerLarge.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ShapeKeyTokens.CornerLargeEnd.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ShapeKeyTokens.CornerLargeTop.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ShapeKeyTokens.CornerMedium.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ShapeKeyTokens.CornerNone.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ShapeKeyTokens.CornerSmall.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final CornerBasedShape bottom(CornerBasedShape cornerBasedShape) {
        float f10 = (float) AudioStats.AUDIO_AMPLITUDE_NONE;
        return CornerBasedShape.copy$default(cornerBasedShape, CornerSizeKt.m21145CornerSize0680j_4(C3156Dp.m26899constructorimpl(f10)), CornerSizeKt.m21145CornerSize0680j_4(C3156Dp.m26899constructorimpl(f10)), null, null, 12, null);
    }

    public static final CornerBasedShape end(CornerBasedShape cornerBasedShape) {
        float f10 = (float) AudioStats.AUDIO_AMPLITUDE_NONE;
        return CornerBasedShape.copy$default(cornerBasedShape, CornerSizeKt.m21145CornerSize0680j_4(C3156Dp.m26899constructorimpl(f10)), null, null, CornerSizeKt.m21145CornerSize0680j_4(C3156Dp.m26899constructorimpl(f10)), 6, null);
    }

    public static final Shape fromToken(Shapes shapes, ShapeKeyTokens shapeKeyTokens) {
        switch (WhenMappings.$EnumSwitchMapping$0[shapeKeyTokens.ordinal()]) {
            case 1:
                return shapes.getExtraLarge();
            case 2:
                return top(shapes.getExtraLarge());
            case 3:
                return shapes.getExtraSmall();
            case 4:
                return top(shapes.getExtraSmall());
            case 5:
                return RoundedCornerShapeKt.getCircleShape();
            case 6:
                return shapes.getLarge();
            case 7:
                return end(shapes.getLarge());
            case 8:
                return top(shapes.getLarge());
            case 9:
                return shapes.getMedium();
            case 10:
                return RectangleShapeKt.getRectangleShape();
            case 11:
                return shapes.getSmall();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final ProvidableCompositionLocal<Shapes> getLocalShapes() {
        return LocalShapes;
    }

    @Composable
    @ReadOnlyComposable
    public static final Shape getValue(ShapeKeyTokens shapeKeyTokens, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1629172543, i10, -1, "androidx.compose.material3.<get-value> (Shapes.kt:191)");
        }
        Shape shapeFromToken = fromToken(MaterialTheme.INSTANCE.getShapes(composer, 6), shapeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shapeFromToken;
    }

    public static final CornerBasedShape start(CornerBasedShape cornerBasedShape) {
        float f10 = (float) AudioStats.AUDIO_AMPLITUDE_NONE;
        return CornerBasedShape.copy$default(cornerBasedShape, null, CornerSizeKt.m21145CornerSize0680j_4(C3156Dp.m26899constructorimpl(f10)), CornerSizeKt.m21145CornerSize0680j_4(C3156Dp.m26899constructorimpl(f10)), null, 9, null);
    }

    public static final CornerBasedShape top(CornerBasedShape cornerBasedShape) {
        float f10 = (float) AudioStats.AUDIO_AMPLITUDE_NONE;
        return CornerBasedShape.copy$default(cornerBasedShape, null, null, CornerSizeKt.m21145CornerSize0680j_4(C3156Dp.m26899constructorimpl(f10)), CornerSizeKt.m21145CornerSize0680j_4(C3156Dp.m26899constructorimpl(f10)), 3, null);
    }
}
