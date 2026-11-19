package androidx.compose.material.icons.outlined;

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
public final class CompassCalibrationKt {
    private static ImageVector _compassCalibration;

    public static final ImageVector getCompassCalibration(Icons.Outlined outlined) {
        ImageVector imageVector = _compassCalibration;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.CompassCalibration", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 12.0f);
        pathBuilder.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(3.0f, 1.35f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-1.35f, 3.0f, -3.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 3.0f);
        pathBuilder.curveTo(8.1f, 3.0f, 4.56f, 4.59f, 2.0f, 7.15f);
        pathBuilder.lineToRelative(5.0f, 5.0f);
        pathBuilder.curveToRelative(1.28f, -1.28f, 3.05f, -2.08f, 5.0f, -2.08f);
        pathBuilder.reflectiveCurveToRelative(3.72f, 0.79f, 5.0f, 2.07f);
        pathBuilder.lineToRelative(5.0f, -5.0f);
        pathBuilder.curveTo(19.44f, 4.59f, 15.9f, 3.0f, 12.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.84f, 9.47f);
        pathBuilder.curveToRelative(-1.44f, -0.91f, -3.1f, -1.4f, -4.84f, -1.4f);
        pathBuilder.curveToRelative(-1.74f, 0.0f, -3.41f, 0.49f, -4.85f, 1.41f);
        pathBuilder.lineTo(4.94f, 7.26f);
        pathBuilder.curveTo(6.99f, 5.79f, 9.44f, 5.0f, 12.0f, 5.0f);
        pathBuilder.curveToRelative(2.56f, 0.0f, 5.0f, 0.79f, 7.05f, 2.26f);
        pathBuilder.lineToRelative(-2.21f, 2.21f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _compassCalibration = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
