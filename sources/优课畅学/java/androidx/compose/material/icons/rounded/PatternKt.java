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
public final class PatternKt {
    private static ImageVector _pattern;

    public static final ImageVector getPattern(Icons.Rounded rounded) {
        ImageVector imageVector = _pattern;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Pattern", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.0f, 6.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(7.1f, 8.0f, 6.0f, 8.0f);
        pathBuilder.reflectiveCurveTo(4.0f, 7.1f, 4.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 14.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(4.9f, 14.0f, 6.0f, 14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 8.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(10.9f, 8.0f, 12.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 10.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(19.1f, 10.0f, 18.0f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.98f, 16.0f);
        pathBuilder.curveToRelative(-0.74f, 0.0f, -1.37f, 0.4f, -1.72f, 1.0f);
        pathBuilder.horizontalLineToRelative(-2.54f);
        pathBuilder.curveToRelative(-0.34f, -0.6f, -0.98f, -1.0f, -1.72f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.37f, 0.4f, -1.72f, 1.0f);
        pathBuilder.horizontalLineTo(8.41f);
        pathBuilder.lineToRelative(3.07f, -3.07f);
        pathBuilder.curveTo(11.65f, 13.97f, 11.82f, 14.0f, 12.0f, 14.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -0.18f, -0.03f, -0.35f, -0.07f, -0.51f);
        pathBuilder.lineToRelative(3.56f, -3.56f);
        pathBuilder.curveTo(17.65f, 7.97f, 17.82f, 8.0f, 18.0f, 8.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.curveToRelative(0.0f, 0.18f, 0.03f, 0.35f, 0.07f, 0.51f);
        pathBuilder.lineToRelative(-3.56f, 3.56f);
        pathBuilder.curveTo(12.35f, 10.03f, 12.18f, 10.0f, 12.0f, 10.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.curveToRelative(0.0f, 0.18f, 0.03f, 0.35f, 0.07f, 0.51f);
        pathBuilder.lineToRelative(-3.56f, 3.56f);
        pathBuilder.curveTo(6.35f, 16.03f, 6.18f, 16.0f, 6.0f, 16.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.curveToRelative(0.74f, 0.0f, 1.37f, -0.4f, 1.72f, -1.0f);
        pathBuilder.horizontalLineToRelative(2.57f);
        pathBuilder.curveToRelative(0.34f, 0.6f, 0.98f, 1.0f, 1.72f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(1.37f, -0.4f, 1.72f, -1.0f);
        pathBuilder.horizontalLineToRelative(2.55f);
        pathBuilder.curveToRelative(0.34f, 0.6f, 0.98f, 1.0f, 1.72f, 1.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.curveTo(19.98f, 16.9f, 19.08f, 16.0f, 17.98f, 16.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pattern = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
