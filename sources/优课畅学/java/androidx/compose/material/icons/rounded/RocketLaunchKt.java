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
public final class RocketLaunchKt {
    private static ImageVector _rocketLaunch;

    public static final ImageVector getRocketLaunch(Icons.Rounded rounded) {
        ImageVector imageVector = _rocketLaunch;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RocketLaunch", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.19f, 6.35f);
        pathBuilder.curveToRelative(-2.04f, 2.29f, -3.44f, 5.58f, -3.57f, 5.89f);
        pathBuilder.lineToRelative(-2.26f, -0.97f);
        pathBuilder.curveToRelative(-0.65f, -0.28f, -0.81f, -1.13f, -0.31f, -1.63f);
        pathBuilder.lineToRelative(3.01f, -3.01f);
        pathBuilder.curveToRelative(0.47f, -0.47f, 1.15f, -0.68f, 1.81f, -0.55f);
        pathBuilder.lineTo(9.19f, 6.35f);
        pathBuilder.lineTo(9.19f, 6.35f);
        pathBuilder.close();
        pathBuilder.moveTo(10.68f, 16.51f);
        pathBuilder.curveToRelative(0.3f, 0.3f, 0.74f, 0.38f, 1.12f, 0.2f);
        pathBuilder.curveToRelative(1.16f, -0.54f, 3.65f, -1.81f, 5.26f, -3.42f);
        pathBuilder.curveToRelative(4.59f, -4.59f, 4.63f, -8.33f, 4.36f, -9.93f);
        pathBuilder.curveToRelative(-0.07f, -0.4f, -0.39f, -0.72f, -0.79f, -0.79f);
        pathBuilder.curveToRelative(-1.6f, -0.27f, -5.34f, -0.23f, -9.93f, 4.36f);
        pathBuilder.curveToRelative(-1.61f, 1.61f, -2.87f, 4.1f, -3.42f, 5.26f);
        pathBuilder.curveToRelative(-0.18f, 0.38f, -0.09f, 0.83f, 0.2f, 1.12f);
        pathBuilder.lineTo(10.68f, 16.51f);
        pathBuilder.close();
        pathBuilder.moveTo(17.65f, 14.81f);
        pathBuilder.curveToRelative(-2.29f, 2.04f, -5.58f, 3.44f, -5.89f, 3.57f);
        pathBuilder.lineToRelative(0.97f, 2.26f);
        pathBuilder.curveToRelative(0.28f, 0.65f, 1.13f, 0.81f, 1.63f, 0.31f);
        pathBuilder.lineToRelative(3.01f, -3.01f);
        pathBuilder.curveToRelative(0.47f, -0.47f, 0.68f, -1.15f, 0.55f, -1.81f);
        pathBuilder.lineTo(17.65f, 14.81f);
        pathBuilder.lineTo(17.65f, 14.81f);
        pathBuilder.close();
        pathBuilder.moveTo(8.94f, 17.41f);
        pathBuilder.curveToRelative(0.2f, 1.06f, -0.15f, 2.04f, -0.82f, 2.71f);
        pathBuilder.curveToRelative(-0.77f, 0.77f, -3.16f, 1.34f, -4.71f, 1.64f);
        pathBuilder.curveToRelative(-0.69f, 0.13f, -1.3f, -0.48f, -1.17f, -1.17f);
        pathBuilder.curveToRelative(0.3f, -1.55f, 0.86f, -3.94f, 1.64f, -4.71f);
        pathBuilder.curveToRelative(0.67f, -0.67f, 1.65f, -1.02f, 2.71f, -0.82f);
        pathBuilder.curveTo(7.76f, 15.28f, 8.72f, 16.24f, 8.94f, 17.41f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(13.0f, 10.1f, 13.0f, 9.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rocketLaunch = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
