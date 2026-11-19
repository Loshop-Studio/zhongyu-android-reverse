package androidx.compose.material.icons.rounded;

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
public final class RollerSkatingKt {
    private static ImageVector _rollerSkating;

    public static final ImageVector getRollerSkating(Icons.Rounded rounded) {
        ImageVector imageVector = _rollerSkating;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RollerSkating", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 16.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineToRelative(0.0f, -0.88f);
        pathBuilder.curveToRelative(0.0f, -2.1f, -1.55f, -3.53f, -3.03f, -3.88f);
        pathBuilder.lineToRelative(-2.7f, -0.67f);
        pathBuilder.curveTo(13.4f, 8.35f, 12.7f, 7.76f, 12.32f, 7.0f);
        pathBuilder.horizontalLineTo(9.5f);
        pathBuilder.curveTo(9.22f, 7.0f, 9.0f, 6.78f, 9.0f, 6.5f);
        pathBuilder.reflectiveCurveTo(9.22f, 6.0f, 9.5f, 6.0f);
        pathBuilder.horizontalLineToRelative(2.52f);
        pathBuilder.lineTo(12.0f, 5.0f);
        pathBuilder.horizontalLineTo(9.5f);
        pathBuilder.curveTo(9.22f, 5.0f, 9.0f, 4.78f, 9.0f, 4.5f);
        pathBuilder.curveTo(9.0f, 4.22f, 9.22f, 4.0f, 9.5f, 4.0f);
        pathBuilder.horizontalLineTo(12.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.curveTo(4.9f, 1.0f, 4.0f, 1.9f, 4.0f, 3.0f);
        pathBuilder.verticalLineToRelative(11.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 23.0f);
        pathBuilder.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveTo(6.66f, 23.0f, 5.0f, 23.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 23.0f);
        pathBuilder.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveTo(20.66f, 23.0f, 19.0f, 23.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 23.0f);
        pathBuilder.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveTo(13.66f, 23.0f, 12.0f, 23.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rollerSkating = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
