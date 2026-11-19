package androidx.compose.material.icons.sharp;

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
public final class PatternKt {
    private static ImageVector _pattern;

    public static final ImageVector getPattern(Icons.Sharp sharp) {
        ImageVector imageVector = _pattern;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Pattern", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
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
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pattern = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
