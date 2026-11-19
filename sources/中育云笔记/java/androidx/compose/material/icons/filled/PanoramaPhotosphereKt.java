package androidx.compose.material.icons.filled;

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
public final class PanoramaPhotosphereKt {
    private static ImageVector _panoramaPhotosphere;

    public static final ImageVector getPanoramaPhotosphere(Icons.Filled filled) {
        ImageVector imageVector = _panoramaPhotosphere;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PanoramaPhotosphere", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.4f, 11.32f);
        pathBuilder.verticalLineToRelative(2.93f);
        pathBuilder.curveToRelative(-0.1f, 0.05f, -2.17f, 0.85f, -3.33f, 1.17f);
        pathBuilder.curveToRelative(-0.94f, 0.26f, -3.84f, 0.73f, -6.07f, 0.73f);
        pathBuilder.curveToRelative(-3.7f, 0.0f, -7.0f, -0.7f, -9.16f, -1.8f);
        pathBuilder.curveToRelative(-0.08f, -0.04f, -0.16f, -0.06f, -0.24f, -0.1f);
        pathBuilder.lineTo(2.6f, 9.76f);
        pathBuilder.curveToRelative(6.02f, -2.84f, 12.6f, -2.92f, 18.8f, 0.0f);
        pathBuilder.verticalLineToRelative(1.56f);
        pathBuilder.close();
        pathBuilder.moveTo(12.01f, 20.2f);
        pathBuilder.curveToRelative(-2.5f, 0.0f, -4.87f, -1.15f, -6.41f, -3.12f);
        pathBuilder.curveToRelative(4.19f, 1.22f, 8.57f, 1.23f, 12.82f, -0.01f);
        pathBuilder.curveToRelative(-1.54f, 1.97f, -3.9f, 3.13f, -6.41f, 3.13f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 3.8f);
        pathBuilder.curveToRelative(2.6f, 0.0f, 4.91f, 1.23f, 6.41f, 3.12f);
        pathBuilder.curveToRelative(-4.1f, -1.19f, -8.48f, -1.26f, -12.83f, 0.01f);
        pathBuilder.curveTo(7.08f, 5.03f, 9.4f, 3.8f, 12.0f, 3.8f);
        pathBuilder.close();
        pathBuilder.moveTo(22.49f, 8.51f);
        pathBuilder.curveToRelative(-0.47f, -0.23f, -0.93f, -0.44f, -1.4f, -0.64f);
        pathBuilder.curveTo(19.52f, 4.41f, 16.05f, 2.0f, 12.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(4.47f, 4.41f, 2.9f, 7.88f);
        pathBuilder.curveToRelative(-0.47f, 0.2f, -0.93f, 0.41f, -1.4f, 0.63f);
        pathBuilder.curveToRelative(-0.31f, 0.15f, -0.5f, 0.48f, -0.5f, 0.83f);
        pathBuilder.verticalLineToRelative(5.32f);
        pathBuilder.curveToRelative(0.0f, 0.35f, 0.19f, 0.68f, 0.51f, 0.83f);
        pathBuilder.curveToRelative(0.47f, 0.23f, 0.93f, 0.44f, 1.39f, 0.64f);
        pathBuilder.curveToRelative(3.55f, 7.83f, 14.65f, 7.82f, 18.2f, 0.0f);
        pathBuilder.curveToRelative(0.47f, -0.2f, 0.93f, -0.41f, 1.39f, -0.63f);
        pathBuilder.curveToRelative(0.31f, -0.17f, 0.51f, -0.49f, 0.51f, -0.84f);
        pathBuilder.lineTo(23.0f, 9.34f);
        pathBuilder.curveToRelative(0.0f, -0.35f, -0.19f, -0.68f, -0.51f, -0.83f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panoramaPhotosphere = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
