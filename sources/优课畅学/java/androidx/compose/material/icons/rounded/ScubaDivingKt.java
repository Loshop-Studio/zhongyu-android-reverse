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
public final class ScubaDivingKt {
    private static ImageVector _scubaDiving;

    public static final ImageVector getScubaDiving(Icons.Rounded rounded) {
        ImageVector imageVector = _scubaDiving;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ScubaDiving", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(1.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(1.0f, 14.1f, 1.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.89f, 10.11f);
        pathBuilder.lineToRelative(3.56f, -0.95f);
        pathBuilder.curveToRelative(0.53f, -0.14f, 0.85f, -0.69f, 0.71f, -1.22f);
        pathBuilder.lineTo(12.9f, 6.97f);
        pathBuilder.curveToRelative(-0.14f, -0.53f, -0.69f, -0.85f, -1.22f, -0.71f);
        pathBuilder.lineTo(8.11f, 7.21f);
        pathBuilder.curveToRelative(-0.8f, 0.21f, -1.28f, 1.04f, -1.06f, 1.84f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(7.27f, 9.85f, 8.09f, 10.33f, 8.89f, 10.11f);
        pathBuilder.close();
        pathBuilder.moveTo(22.52f, 2.52f);
        pathBuilder.curveToRelative(-0.29f, -0.29f, -0.75f, -0.29f, -1.04f, 0.0f);
        pathBuilder.lineTo(19.0f, 5.0f);
        pathBuilder.lineToRelative(-2.0f, 4.0f);
        pathBuilder.lineToRelative(-9.48f, 2.87f);
        pathBuilder.curveToRelative(-0.82f, 0.2f, -1.39f, 0.89f, -1.5f, 1.68f);
        pathBuilder.lineTo(5.24f, 18.0f);
        pathBuilder.lineTo(3.0f, 21.0f);
        pathBuilder.curveToRelative(-0.33f, 0.44f, -0.24f, 1.07f, 0.2f, 1.4f);
        pathBuilder.curveToRelative(0.44f, 0.33f, 1.07f, 0.24f, 1.4f, -0.2f);
        pathBuilder.lineTo(7.0f, 19.0f);
        pathBuilder.lineToRelative(1.14f, -3.14f);
        pathBuilder.lineToRelative(5.57f, -1.77f);
        pathBuilder.curveToRelative(0.19f, -0.06f, 0.38f, -0.15f, 0.54f, -0.27f);
        pathBuilder.lineToRelative(4.2f, -2.94f);
        pathBuilder.curveToRelative(0.36f, -0.25f, 0.62f, -0.61f, 0.75f, -1.02f);
        pathBuilder.lineTo(20.5f, 5.9f);
        pathBuilder.lineToRelative(2.06f, -2.38f);
        pathBuilder.curveTo(22.81f, 3.22f, 22.79f, 2.79f, 22.52f, 2.52f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _scubaDiving = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
