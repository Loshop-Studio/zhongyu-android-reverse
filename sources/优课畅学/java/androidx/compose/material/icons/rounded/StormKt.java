package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.graphics.vector.PathBuilder;
import androidx.compose.p013ui.graphics.vector.VectorKt;
import androidx.compose.p013ui.unit.C3156Dp;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
public final class StormKt {
    private static ImageVector _storm;

    public static final ImageVector getStorm(Icons.Rounded rounded) {
        ImageVector imageVector = _storm;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Storm", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.93f, 8.0f);
        pathBuilder.curveTo(16.72f, 4.18f, 11.82f, 2.87f, 8.0f, 5.07f);
        pathBuilder.curveToRelative(-1.41f, 0.82f, -2.48f, 2.0f, -3.16f, 3.37f);
        pathBuilder.curveToRelative(-0.1f, -1.75f, 0.1f, -3.5f, 0.59f, -5.17f);
        pathBuilder.curveTo(5.61f, 2.63f, 5.14f, 2.0f, 4.48f, 2.0f);
        pathBuilder.horizontalLineTo(4.47f);
        pathBuilder.curveTo(4.04f, 2.0f, 3.64f, 2.28f, 3.52f, 2.7f);
        pathBuilder.curveTo(2.24f, 7.01f, 2.65f, 11.81f, 5.07f, 16.0f);
        pathBuilder.curveToRelative(1.1f, 1.91f, 2.88f, 3.19f, 4.86f, 3.72f);
        pathBuilder.curveToRelative(1.98f, 0.53f, 4.16f, 0.31f, 6.07f, -0.79f);
        pathBuilder.curveToRelative(1.41f, -0.82f, 2.48f, -2.0f, 3.16f, -3.37f);
        pathBuilder.curveToRelative(0.1f, 1.75f, -0.09f, 3.5f, -0.58f, 5.18f);
        pathBuilder.curveTo(18.4f, 21.37f, 18.87f, 22.0f, 19.53f, 22.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.44f, 0.0f, 0.83f, -0.28f, 0.95f, -0.7f);
        pathBuilder.curveTo(21.75f, 16.99f, 21.35f, 12.19f, 18.93f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 17.2f);
        pathBuilder.curveToRelative(-2.87f, 1.65f, -6.54f, 0.67f, -8.2f, -2.2f);
        pathBuilder.curveToRelative(-0.11f, -0.2f, -0.21f, -0.4f, -0.3f, -0.6f);
        pathBuilder.curveTo(5.3f, 11.64f, 6.33f, 8.34f, 9.0f, 6.8f);
        pathBuilder.curveToRelative(2.86f, -1.65f, 6.54f, -0.67f, 8.2f, 2.2f);
        pathBuilder.curveToRelative(0.11f, 0.2f, 0.21f, 0.4f, 0.3f, 0.6f);
        pathBuilder.curveTo(18.7f, 12.36f, 17.67f, 15.66f, 15.0f, 17.2f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 10.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(10.9f, 10.0f, 12.0f, 10.0f);
        pathBuilder.moveTo(12.0f, 8.0f);
        pathBuilder.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder.reflectiveCurveTo(14.21f, 8.0f, 12.0f, 8.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _storm = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
