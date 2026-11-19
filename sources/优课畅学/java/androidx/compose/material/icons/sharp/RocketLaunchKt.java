package androidx.compose.material.icons.sharp;

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

    public static final ImageVector getRocketLaunch(Icons.Sharp sharp) {
        ImageVector imageVector = _rocketLaunch;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.RocketLaunch", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.19f, 6.35f);
        pathBuilder.curveToRelative(-2.04f, 2.29f, -3.44f, 5.58f, -3.57f, 5.89f);
        pathBuilder.lineTo(2.0f, 10.69f);
        pathBuilder.lineToRelative(4.81f, -4.81f);
        pathBuilder.lineTo(9.19f, 6.35f);
        pathBuilder.lineTo(9.19f, 6.35f);
        pathBuilder.close();
        pathBuilder.moveTo(11.17f, 17.0f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 3.74f, -1.55f, 5.89f, -3.7f);
        pathBuilder.curveToRelative(5.4f, -5.4f, 4.5f, -9.62f, 4.21f, -10.57f);
        pathBuilder.curveToRelative(-0.95f, -0.3f, -5.17f, -1.19f, -10.57f, 4.21f);
        pathBuilder.curveTo(8.55f, 9.09f, 7.0f, 12.83f, 7.0f, 12.83f);
        pathBuilder.lineTo(11.17f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.65f, 14.81f);
        pathBuilder.curveToRelative(-2.29f, 2.04f, -5.58f, 3.44f, -5.89f, 3.57f);
        pathBuilder.lineTo(13.31f, 22.0f);
        pathBuilder.lineToRelative(4.81f, -4.81f);
        pathBuilder.lineTo(17.65f, 14.81f);
        pathBuilder.lineTo(17.65f, 14.81f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 18.0f);
        pathBuilder.curveToRelative(0.0f, 0.83f, -0.34f, 1.58f, -0.88f, 2.12f);
        pathBuilder.curveTo(6.94f, 21.3f, 2.0f, 22.0f, 2.0f, 22.0f);
        pathBuilder.reflectiveCurveToRelative(0.7f, -4.94f, 1.88f, -6.12f);
        pathBuilder.curveTo(4.42f, 15.34f, 5.17f, 15.0f, 6.0f, 15.0f);
        pathBuilder.curveTo(7.66f, 15.0f, 9.0f, 16.34f, 9.0f, 18.0f);
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
