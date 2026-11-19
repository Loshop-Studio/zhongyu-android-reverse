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
public final class DownhillSkiingKt {
    private static ImageVector _downhillSkiing;

    public static final ImageVector getDownhillSkiing(Icons.Rounded rounded) {
        ImageVector imageVector = _downhillSkiing;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DownhillSkiing", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.5f, 4.5f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(18.5f, 3.4f, 18.5f, 4.5f);
        pathBuilder.close();
        pathBuilder.moveTo(15.78f, 20.9f);
        pathBuilder.lineToRelative(0.76f, 0.27f);
        pathBuilder.curveToRelative(0.62f, 0.21f, 1.27f, 0.33f, 1.96f, 0.33f);
        pathBuilder.curveToRelative(0.68f, 0.0f, 1.34f, -0.12f, 1.95f, -0.33f);
        pathBuilder.curveToRelative(0.27f, -0.09f, 0.57f, -0.02f, 0.78f, 0.18f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.39f, 0.4f, 0.23f, 1.06f, -0.3f, 1.24f);
        pathBuilder.curveTo(20.17f, 22.86f, 19.35f, 23.0f, 18.5f, 23.0f);
        pathBuilder.curveToRelative(-0.86f, 0.0f, -1.68f, -0.14f, -2.45f, -0.41f);
        pathBuilder.lineTo(2.7f, 17.72f);
        pathBuilder.curveToRelative(-0.39f, -0.14f, -0.59f, -0.57f, -0.45f, -0.95f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.14f, -0.39f, 0.57f, -0.6f, 0.96f, -0.45f);
        pathBuilder.lineToRelative(6.19f, 2.25f);
        pathBuilder.lineToRelative(1.72f, -4.44f);
        pathBuilder.lineTo(7.55f, 10.4f);
        pathBuilder.curveTo(6.65f, 9.46f, 6.87f, 7.93f, 8.0f, 7.28f);
        pathBuilder.lineToRelative(3.48f, -2.01f);
        pathBuilder.curveToRelative(1.1f, -0.64f, 2.52f, -0.1f, 2.91f, 1.11f);
        pathBuilder.lineToRelative(0.33f, 1.08f);
        pathBuilder.curveToRelative(0.44f, 1.42f, 1.48f, 2.57f, 2.83f, 3.14f);
        pathBuilder.lineToRelative(0.29f, -0.89f);
        pathBuilder.curveToRelative(0.13f, -0.39f, 0.55f, -0.61f, 0.94f, -0.48f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.4f, 0.13f, 0.61f, 0.55f, 0.48f, 0.95f);
        pathBuilder.lineToRelative(-0.6f, 1.85f);
        pathBuilder.curveToRelative(-0.17f, 0.52f, -0.72f, 0.82f, -1.24f, 0.65f);
        pathBuilder.curveToRelative(-2.02f, -0.63f, -3.64f, -2.15f, -4.42f, -4.1f);
        pathBuilder.lineToRelative(-2.53f, 1.45f);
        pathBuilder.lineToRelative(2.23f, 2.55f);
        pathBuilder.curveToRelative(0.49f, 0.56f, 0.63f, 1.34f, 0.36f, 2.04f);
        pathBuilder.lineToRelative(-1.78f, 4.63f);
        pathBuilder.lineToRelative(3.09f, 1.12f);
        pathBuilder.lineToRelative(2.1f, -6.44f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.46f, 0.18f, 0.94f, 0.31f, 1.44f, 0.41f);
        pathBuilder.lineTo(15.78f, 20.9f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _downhillSkiing = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
