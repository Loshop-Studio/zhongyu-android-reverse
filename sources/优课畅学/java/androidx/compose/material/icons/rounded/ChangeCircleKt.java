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
public final class ChangeCircleKt {
    private static ImageVector _changeCircle;

    public static final ImageVector getChangeCircle(Icons.Rounded rounded) {
        ImageVector imageVector = _changeCircle;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ChangeCircle", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.91f, 18.15f);
        pathBuilder.curveToRelative(-0.31f, 0.31f, -0.85f, 0.09f, -0.85f, -0.35f);
        pathBuilder.verticalLineToRelative(-0.8f);
        pathBuilder.curveToRelative(-0.02f, 0.0f, -0.04f, 0.0f, -0.06f, 0.0f);
        pathBuilder.curveToRelative(-1.28f, 0.0f, -2.56f, -0.49f, -3.54f, -1.46f);
        pathBuilder.curveToRelative(-1.43f, -1.43f, -1.81f, -3.52f, -1.14f, -5.3f);
        pathBuilder.curveToRelative(0.19f, -0.51f, 0.86f, -0.64f, 1.24f, -0.25f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.22f, 0.22f, 0.27f, 0.54f, 0.17f, 0.82f);
        pathBuilder.curveToRelative(-0.46f, 1.24f, -0.2f, 2.68f, 0.8f, 3.68f);
        pathBuilder.curveToRelative(0.7f, 0.7f, 1.62f, 1.03f, 2.54f, 1.01f);
        pathBuilder.verticalLineToRelative(-0.94f);
        pathBuilder.curveToRelative(0.0f, -0.45f, 0.54f, -0.67f, 0.85f, -0.35f);
        pathBuilder.lineToRelative(1.62f, 1.62f);
        pathBuilder.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder.lineTo(12.91f, 18.15f);
        pathBuilder.close();
        pathBuilder.moveTo(15.44f, 14.02f);
        pathBuilder.lineTo(15.44f, 14.02f);
        pathBuilder.curveToRelative(-0.22f, -0.22f, -0.27f, -0.54f, -0.17f, -0.82f);
        pathBuilder.curveToRelative(0.46f, -1.24f, 0.2f, -2.68f, -0.8f, -3.68f);
        pathBuilder.curveToRelative(-0.7f, -0.7f, -1.62f, -1.04f, -2.53f, -1.02f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder.verticalLineToRelative(0.94f);
        pathBuilder.curveToRelative(0.0f, 0.45f, -0.54f, 0.67f, -0.85f, 0.35f);
        pathBuilder.lineTo(9.46f, 8.18f);
        pathBuilder.curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0.0f, -0.71f);
        pathBuilder.lineToRelative(1.62f, -1.62f);
        pathBuilder.curveToRelative(0.31f, -0.31f, 0.85f, -0.09f, 0.85f, 0.35f);
        pathBuilder.verticalLineToRelative(0.81f);
        pathBuilder.curveToRelative(1.3f, -0.02f, 2.61f, 0.45f, 3.6f, 1.45f);
        pathBuilder.curveToRelative(1.43f, 1.43f, 1.81f, 3.52f, 1.14f, 5.3f);
        pathBuilder.curveTo(16.48f, 14.28f, 15.82f, 14.41f, 15.44f, 14.02f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _changeCircle = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
