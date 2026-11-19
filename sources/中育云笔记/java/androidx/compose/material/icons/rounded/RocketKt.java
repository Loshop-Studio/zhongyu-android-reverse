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
public final class RocketKt {
    private static ImageVector _rocket;

    public static final ImageVector getRocket(Icons.Rounded rounded) {
        ImageVector imageVector = _rocket;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Rocket", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.41f, 2.87f);
        pathBuilder.curveToRelative(0.35f, -0.26f, 0.82f, -0.26f, 1.18f, 0.0f);
        pathBuilder.curveTo(13.81f, 3.75f, 16.5f, 6.46f, 16.5f, 13.0f);
        pathBuilder.curveToRelative(0.0f, 2.16f, -0.78f, 4.76f, -1.36f, 6.35f);
        pathBuilder.curveTo(15.0f, 19.74f, 14.63f, 20.0f, 14.21f, 20.0f);
        pathBuilder.lineToRelative(-4.41f, 0.0f);
        pathBuilder.curveToRelative(-0.42f, 0.0f, -0.8f, -0.26f, -0.94f, -0.65f);
        pathBuilder.curveTo(8.28f, 17.76f, 7.5f, 15.16f, 7.5f, 13.0f);
        pathBuilder.curveTo(7.5f, 6.46f, 10.19f, 3.75f, 11.41f, 2.87f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 11.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(14.0f, 12.1f, 14.0f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.69f, 20.52f);
        pathBuilder.curveToRelative(-0.48f, -1.23f, -1.52f, -4.17f, -1.67f, -6.87f);
        pathBuilder.lineToRelative(-1.13f, 0.75f);
        pathBuilder.curveTo(4.33f, 14.78f, 4.0f, 15.4f, 4.0f, 16.07f);
        pathBuilder.verticalLineToRelative(4.45f);
        pathBuilder.curveToRelative(0.0f, 0.71f, 0.71f, 1.19f, 1.37f, 0.93f);
        pathBuilder.lineTo(7.69f, 20.52f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 20.52f);
        pathBuilder.verticalLineToRelative(-4.45f);
        pathBuilder.curveToRelative(0.0f, -0.67f, -0.33f, -1.29f, -0.89f, -1.66f);
        pathBuilder.lineToRelative(-1.13f, -0.75f);
        pathBuilder.curveToRelative(-0.15f, 2.69f, -1.2f, 5.64f, -1.67f, 6.87f);
        pathBuilder.lineToRelative(2.32f, 0.93f);
        pathBuilder.curveTo(19.29f, 21.71f, 20.0f, 21.23f, 20.0f, 20.52f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rocket = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
