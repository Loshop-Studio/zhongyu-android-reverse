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
public final class RunCircleKt {
    private static ImageVector _runCircle;

    public static final ImageVector getRunCircle(Icons.Rounded rounded) {
        ImageVector imageVector = _runCircle;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RunCircle", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        pathBuilder.moveTo(13.5f, 6.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.curveTo(12.5f, 6.45f, 12.95f, 6.0f, 13.5f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.41f, 11.91f);
        pathBuilder.curveToRelative(-0.71f, -0.2f, -1.63f, -0.74f, -2.32f, -1.66f);
        pathBuilder.lineToRelative(-0.41f, 2.35f);
        pathBuilder.lineToRelative(1.19f, 1.3f);
        pathBuilder.curveTo(13.95f, 13.98f, 14.0f, 14.1f, 14.0f, 14.22f);
        pathBuilder.verticalLineToRelative(3.28f);
        pathBuilder.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.verticalLineToRelative(-3.08f);
        pathBuilder.lineToRelative(-1.11f, -1.21f);
        pathBuilder.lineToRelative(-0.43f, 2.15f);
        pathBuilder.curveToRelative(-0.05f, 0.27f, -0.32f, 0.45f, -0.59f, 0.39f);
        pathBuilder.lineToRelative(-2.78f, -0.57f);
        pathBuilder.curveToRelative(-0.27f, -0.06f, -0.45f, -0.32f, -0.39f, -0.59f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.06f, -0.27f, 0.32f, -0.44f, 0.59f, -0.39f);
        pathBuilder.lineToRelative(2.29f, 0.47f);
        pathBuilder.lineToRelative(0.96f, -4.89f);
        pathBuilder.lineTo(10.0f, 10.35f);
        pathBuilder.verticalLineToRelative(1.15f);
        pathBuilder.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(9.22f, 12.0f, 9.0f, 11.78f, 9.0f, 11.5f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.curveToRelative(0.0f, -0.21f, 0.13f, -0.4f, 0.33f, -0.47f);
        pathBuilder.lineToRelative(2.95f, -1.09f);
        pathBuilder.curveToRelative(0.49f, -0.18f, 1.02f, 0.04f, 1.25f, 0.51f);
        pathBuilder.curveToRelative(0.65f, 1.35f, 1.55f, 1.85f, 2.1f, 2.0f);
        pathBuilder.curveTo(15.85f, 11.0f, 16.0f, 11.18f, 16.0f, 11.4f);
        pathBuilder.verticalLineToRelative(0.04f);
        pathBuilder.curveTo(16.0f, 11.75f, 15.71f, 11.99f, 15.41f, 11.91f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _runCircle = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
