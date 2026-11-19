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
public final class AirlineSeatReclineNormalKt {
    private static ImageVector _airlineSeatReclineNormal;

    public static final ImageVector getAirlineSeatReclineNormal(Icons.TwoTone twoTone) {
        ImageVector imageVector = _airlineSeatReclineNormal;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AirlineSeatReclineNormal", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.59f, 5.41f);
        pathBuilder.curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0.0f, -2.83f);
        pathBuilder.reflectiveCurveToRelative(2.05f, -0.78f, 2.83f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilder.curveToRelative(-0.79f, 0.79f, -2.05f, 0.79f, -2.83f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 16.0f);
        pathBuilder.lineTo(6.0f, 7.0f);
        pathBuilder.lineTo(4.0f, 7.0f);
        pathBuilder.verticalLineToRelative(9.0f);
        pathBuilder.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.lineTo(9.0f, 19.0f);
        pathBuilder.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 20.07f);
        pathBuilder.lineTo(14.93f, 15.0f);
        pathBuilder.lineTo(11.5f, 15.0f);
        pathBuilder.verticalLineToRelative(-3.68f);
        pathBuilder.curveToRelative(1.4f, 1.15f, 3.6f, 2.16f, 5.5f, 2.16f);
        pathBuilder.verticalLineToRelative(-2.16f);
        pathBuilder.curveToRelative(-1.66f, 0.02f, -3.61f, -0.87f, -4.67f, -2.04f);
        pathBuilder.lineToRelative(-1.4f, -1.55f);
        pathBuilder.curveToRelative(-0.19f, -0.21f, -0.43f, -0.38f, -0.69f, -0.5f);
        pathBuilder.curveToRelative(-0.29f, -0.14f, -0.62f, -0.23f, -0.96f, -0.23f);
        pathBuilder.horizontalLineToRelative(-0.03f);
        pathBuilder.curveTo(8.01f, 7.0f, 7.0f, 8.01f, 7.0f, 9.25f);
        pathBuilder.lineTo(7.0f, 15.0f);
        pathBuilder.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(5.07f);
        pathBuilder.lineToRelative(3.5f, 3.5f);
        pathBuilder.lineTo(20.0f, 20.07f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airlineSeatReclineNormal = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
