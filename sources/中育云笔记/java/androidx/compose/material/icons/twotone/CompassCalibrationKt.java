package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class CompassCalibrationKt {
    private static ImageVector _compassCalibration;

    public static final ImageVector getCompassCalibration(Icons.TwoTone twoTone) {
        ImageVector imageVector = _compassCalibration;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CompassCalibration", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.94f, 7.26f);
        pathBuilder.lineToRelative(2.21f, 2.21f);
        pathBuilder.curveToRelative(1.44f, -0.91f, 3.11f, -1.4f, 4.85f, -1.4f);
        pathBuilder.curveToRelative(1.74f, 0.0f, 3.41f, 0.49f, 4.84f, 1.4f);
        pathBuilder.lineToRelative(2.21f, -2.21f);
        pathBuilder.curveTo(17.0f, 5.79f, 14.56f, 5.0f, 12.0f, 5.0f);
        pathBuilder.curveToRelative(-2.56f, 0.0f, -5.01f, 0.79f, -7.06f, 2.26f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 17.0f);
        pathBuilder2.moveToRelative(-3.0f, 0.0f);
        pathBuilder2.arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f);
        pathBuilder2.arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f);
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw3 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk83 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(17.0f, 17.0f);
        pathBuilder3.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        pathBuilder3.reflectiveCurveToRelative(-5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder3.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder3.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(9.0f, 17.0f);
        pathBuilder3.curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f);
        pathBuilder3.reflectiveCurveToRelative(3.0f, 1.35f, 3.0f, 3.0f);
        pathBuilder3.reflectiveCurveToRelative(-1.35f, 3.0f, -3.0f, 3.0f);
        pathBuilder3.reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(2.0f, 7.15f);
        pathBuilder3.lineToRelative(5.0f, 5.0f);
        pathBuilder3.curveToRelative(1.28f, -1.28f, 3.05f, -2.08f, 5.0f, -2.08f);
        pathBuilder3.reflectiveCurveToRelative(3.72f, 0.79f, 5.0f, 2.07f);
        pathBuilder3.lineToRelative(5.0f, -5.0f);
        pathBuilder3.curveTo(19.44f, 4.59f, 15.9f, 3.0f, 12.0f, 3.0f);
        pathBuilder3.curveTo(8.1f, 3.0f, 4.56f, 4.59f, 2.0f, 7.15f);
        pathBuilder3.close();
        pathBuilder3.moveTo(16.84f, 9.47f);
        pathBuilder3.curveToRelative(-1.44f, -0.91f, -3.1f, -1.4f, -4.84f, -1.4f);
        pathBuilder3.curveToRelative(-1.74f, 0.0f, -3.41f, 0.49f, -4.85f, 1.41f);
        pathBuilder3.lineTo(4.94f, 7.26f);
        pathBuilder3.curveTo(6.99f, 5.79f, 9.44f, 5.0f, 12.0f, 5.0f);
        pathBuilder3.curveToRelative(2.56f, 0.0f, 5.0f, 0.79f, 7.05f, 2.26f);
        pathBuilder3.lineToRelative(-2.21f, 2.21f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw3, iM31241getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _compassCalibration = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
