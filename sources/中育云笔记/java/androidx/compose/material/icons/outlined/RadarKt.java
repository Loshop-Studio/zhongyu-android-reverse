package androidx.compose.material.icons.outlined;

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
public final class RadarKt {
    private static ImageVector _radar;

    public static final ImageVector getRadar(Icons.Outlined outlined) {
        ImageVector imageVector = _radar;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Radar", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.74f, 18.33f);
        pathBuilder.curveTo(21.15f, 16.6f, 22.0f, 14.4f, 22.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        pathBuilder.reflectiveCurveTo(2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.curveToRelative(2.4f, 0.0f, 4.6f, -0.85f, 6.33f, -2.26f);
        pathBuilder.curveToRelative(0.27f, -0.22f, 0.53f, -0.46f, 0.78f, -0.71f);
        pathBuilder.curveToRelative(0.03f, -0.03f, 0.05f, -0.06f, 0.07f, -0.08f);
        pathBuilder.curveTo(19.38f, 18.75f, 19.57f, 18.54f, 19.74f, 18.33f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, 1.85f, -0.63f, 3.54f, -1.69f, 4.9f);
        pathBuilder.lineToRelative(-1.43f, -1.43f);
        pathBuilder.curveToRelative(0.69f, -0.98f, 1.1f, -2.17f, 1.1f, -3.46f);
        pathBuilder.curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f);
        pathBuilder.reflectiveCurveToRelative(-6.0f, 2.69f, -6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilder.curveToRelative(1.3f, 0.0f, 2.51f, -0.42f, 3.49f, -1.13f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder.curveTo(15.54f, 19.37f, 13.85f, 20.0f, 12.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.92f, 12.51f);
        pathBuilder.curveToRelative(0.17f, -0.66f, 0.02f, -1.38f, -0.49f, -1.9f);
        pathBuilder.lineToRelative(-0.02f, -0.02f);
        pathBuilder.curveToRelative(-0.77f, -0.77f, -2.0f, -0.78f, -2.78f, -0.04f);
        pathBuilder.curveToRelative(-0.01f, 0.01f, -0.03f, 0.02f, -0.05f, 0.04f);
        pathBuilder.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilder.lineToRelative(0.02f, 0.02f);
        pathBuilder.curveToRelative(0.52f, 0.51f, 1.25f, 0.67f, 1.91f, 0.49f);
        pathBuilder.lineToRelative(1.51f, 1.51f);
        pathBuilder.curveToRelative(-0.6f, 0.36f, -1.29f, 0.58f, -2.04f, 0.58f);
        pathBuilder.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, 0.73f, -0.21f, 1.41f, -0.56f, 2.0f);
        pathBuilder.lineTo(13.92f, 12.51f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _radar = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
