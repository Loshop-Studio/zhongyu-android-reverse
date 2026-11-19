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
public final class SwapHorizKt {
    private static ImageVector _swapHoriz;

    public static final ImageVector getSwapHoriz(Icons.Rounded rounded) {
        ImageVector imageVector = _swapHoriz;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SwapHoriz", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.14f, 11.86f);
        pathBuilder.lineToRelative(-2.78f, 2.79f);
        pathBuilder.curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0.0f, 0.71f);
        pathBuilder.lineToRelative(2.78f, 2.79f);
        pathBuilder.curveToRelative(0.31f, 0.32f, 0.85f, 0.09f, 0.85f, -0.35f);
        pathBuilder.lineTo(6.99f, 16.0f);
        pathBuilder.lineTo(13.0f, 16.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.lineTo(6.99f, 14.0f);
        pathBuilder.verticalLineToRelative(-1.79f);
        pathBuilder.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        pathBuilder.close();
        pathBuilder.moveTo(20.65f, 8.65f);
        pathBuilder.lineToRelative(-2.78f, -2.79f);
        pathBuilder.curveToRelative(-0.31f, -0.32f, -0.85f, -0.09f, -0.85f, 0.35f);
        pathBuilder.lineTo(17.02f, 8.0f);
        pathBuilder.lineTo(11.0f, 8.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(6.01f);
        pathBuilder.verticalLineToRelative(1.79f);
        pathBuilder.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        pathBuilder.lineToRelative(2.78f, -2.79f);
        pathBuilder.curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.7f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swapHoriz = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
