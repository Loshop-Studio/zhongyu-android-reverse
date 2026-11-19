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
public final class SensorsKt {
    private static ImageVector _sensors;

    public static final ImageVector getSensors(Icons.Outlined outlined) {
        ImageVector imageVector = _sensors;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Sensors", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.76f, 16.24f);
        pathBuilder.curveTo(6.67f, 15.16f, 6.0f, 13.66f, 6.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(0.67f, -3.16f, 1.76f, -4.24f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder.curveTo(8.45f, 9.9f, 8.0f, 10.9f, 8.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.45f, 2.1f, 1.17f, 2.83f);
        pathBuilder.lineTo(7.76f, 16.24f);
        pathBuilder.close();
        pathBuilder.moveTo(16.24f, 16.24f);
        pathBuilder.curveTo(17.33f, 15.16f, 18.0f, 13.66f, 18.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(-0.67f, -3.16f, -1.76f, -4.24f);
        pathBuilder.lineToRelative(-1.42f, 1.42f);
        pathBuilder.curveTo(15.55f, 9.9f, 16.0f, 10.9f, 16.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.45f, 2.1f, -1.17f, 2.83f);
        pathBuilder.lineTo(16.24f, 16.24f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 10.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(13.1f, 10.0f, 12.0f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 2.21f, -0.9f, 4.21f, -2.35f, 5.65f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder.curveTo(20.88f, 17.26f, 22.0f, 14.76f, 22.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(-1.12f, -5.26f, -2.93f, -7.07f);
        pathBuilder.lineToRelative(-1.42f, 1.42f);
        pathBuilder.curveTo(19.1f, 7.79f, 20.0f, 9.79f, 20.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.35f, 6.35f);
        pathBuilder.lineTo(4.93f, 4.93f);
        pathBuilder.curveTo(3.12f, 6.74f, 2.0f, 9.24f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(1.12f, 5.26f, 2.93f, 7.07f);
        pathBuilder.lineToRelative(1.42f, -1.42f);
        pathBuilder.curveTo(4.9f, 16.21f, 4.0f, 14.21f, 4.0f, 12.0f);
        pathBuilder.reflectiveCurveTo(4.9f, 7.79f, 6.35f, 6.35f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sensors = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
