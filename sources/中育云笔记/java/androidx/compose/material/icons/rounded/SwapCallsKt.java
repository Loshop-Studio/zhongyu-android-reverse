package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.SolidColor;
import androidx.compose.p014ui.graphics.StrokeCap;
import androidx.compose.p014ui.graphics.StrokeJoin;
import androidx.compose.p014ui.graphics.vector.ImageVector;
import androidx.compose.p014ui.graphics.vector.PathBuilder;
import androidx.compose.p014ui.graphics.vector.VectorKt;
import androidx.compose.p014ui.unit.C3186Dp;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class SwapCallsKt {
    private static ImageVector _swapCalls;

    public static final ImageVector getSwapCalls(Icons.Rounded rounded) {
        ImageVector imageVector = _swapCalls;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SwapCalls", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.65f, 4.35f);
        pathBuilder.lineToRelative(-2.79f, 2.79f);
        pathBuilder.curveToRelative(-0.32f, 0.32f, -0.1f, 0.86f, 0.35f, 0.86f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.verticalLineToRelative(6.88f);
        pathBuilder.curveToRelative(0.0f, 1.0f, -0.67f, 1.93f, -1.66f, 2.09f);
        pathBuilder.curveToRelative(-1.25f, 0.21f, -2.34f, -0.76f, -2.34f, -1.97f);
        pathBuilder.verticalLineTo(8.17f);
        pathBuilder.curveToRelative(0.0f, -2.09f, -1.53f, -3.95f, -3.61f, -4.15f);
        pathBuilder.curveTo(7.01f, 3.79f, 5.0f, 5.66f, 5.0f, 8.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.horizontalLineTo(3.21f);
        pathBuilder.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        pathBuilder.lineToRelative(2.79f, 2.79f);
        pathBuilder.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilder.lineToRelative(2.79f, -2.79f);
        pathBuilder.curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.36f, -0.85f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineTo(8.12f);
        pathBuilder.curveToRelative(0.0f, -1.0f, 0.67f, -1.93f, 1.66f, -2.09f);
        pathBuilder.curveTo(9.91f, 5.82f, 11.0f, 6.79f, 11.0f, 8.0f);
        pathBuilder.verticalLineToRelative(6.83f);
        pathBuilder.curveToRelative(0.0f, 2.09f, 1.53f, 3.95f, 3.61f, 4.15f);
        pathBuilder.curveTo(16.99f, 19.21f, 19.0f, 17.34f, 19.0f, 15.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineToRelative(1.79f);
        pathBuilder.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        pathBuilder.lineToRelative(-2.79f, -2.79f);
        pathBuilder.curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.7f, -0.01f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swapCalls = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
