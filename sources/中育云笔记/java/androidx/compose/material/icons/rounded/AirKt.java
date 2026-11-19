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
public final class AirKt {
    private static ImageVector _air;

    public static final ImageVector getAir(Icons.Rounded rounded) {
        ImageVector imageVector = _air;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Air", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.35f, 17.95f);
        pathBuilder.curveToRelative(-0.28f, 0.89f, -1.01f, 1.62f, -1.9f, 1.9f);
        pathBuilder.curveToRelative(-1.51f, 0.48f, -2.94f, -0.23f, -3.59f, -1.42f);
        pathBuilder.curveTo(8.51f, 17.78f, 9.03f, 17.0f, 9.77f, 17.0f);
        pathBuilder.horizontalLineToRelative(0.01f);
        pathBuilder.curveToRelative(0.34f, 0.0f, 0.68f, 0.16f, 0.84f, 0.46f);
        pathBuilder.curveToRelative(0.17f, 0.32f, 0.5f, 0.54f, 0.89f, 0.54f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(8.5f);
        pathBuilder.curveTo(13.46f, 14.0f, 15.0f, 15.9f, 14.35f, 17.95f);
        pathBuilder.close();
        pathBuilder.moveTo(18.91f, 5.67f);
        pathBuilder.curveToRelative(-0.29f, -1.26f, -1.32f, -2.29f, -2.58f, -2.58f);
        pathBuilder.curveToRelative(-1.76f, -0.4f, -3.37f, 0.53f, -4.02f, 1.98f);
        pathBuilder.curveTo(12.0f, 5.74f, 12.48f, 6.5f, 13.21f, 6.5f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.39f, 0.0f, 0.75f, -0.22f, 0.9f, -0.57f);
        pathBuilder.curveTo(14.34f, 5.38f, 14.87f, 5.0f, 15.5f, 5.0f);
        pathBuilder.curveTo(16.33f, 5.0f, 17.0f, 5.67f, 17.0f, 6.5f);
        pathBuilder.reflectiveCurveTo(16.33f, 8.0f, 15.5f, 8.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.curveTo(2.45f, 8.0f, 2.0f, 8.45f, 2.0f, 9.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(12.5f);
        pathBuilder.curveTo(17.7f, 10.0f, 19.43f, 7.96f, 18.91f, 5.67f);
        pathBuilder.close();
        pathBuilder.moveTo(18.4f, 11.0f);
        pathBuilder.lineTo(3.0f, 11.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(15.5f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.curveToRelative(0.0f, 0.63f, -0.38f, 1.16f, -0.93f, 1.39f);
        pathBuilder.curveToRelative(-0.36f, 0.15f, -0.57f, 0.51f, -0.57f, 0.9f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, 0.73f, 0.76f, 1.21f, 1.43f, 0.91f);
        pathBuilder.curveToRelative(1.43f, -0.64f, 2.35f, -2.21f, 2.0f, -3.93f);
        pathBuilder.curveTo(21.59f, 12.13f, 20.07f, 11.0f, 18.4f, 11.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _air = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
