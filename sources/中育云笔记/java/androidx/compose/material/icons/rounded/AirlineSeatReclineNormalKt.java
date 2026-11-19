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
public final class AirlineSeatReclineNormalKt {
    private static ImageVector _airlineSeatReclineNormal;

    public static final ImageVector getAirlineSeatReclineNormal(Icons.Rounded rounded) {
        ImageVector imageVector = _airlineSeatReclineNormal;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AirlineSeatReclineNormal", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        pathBuilder.lineTo(6.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.lineTo(9.0f, 19.0f);
        pathBuilder.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.28f, 19.35f);
        pathBuilder.lineToRelative(-3.77f, -3.77f);
        pathBuilder.curveToRelative(-0.37f, -0.37f, -0.88f, -0.58f, -1.41f, -0.58f);
        pathBuilder.horizontalLineToRelative(-2.6f);
        pathBuilder.verticalLineToRelative(-3.68f);
        pathBuilder.curveToRelative(1.09f, 0.89f, 2.66f, 1.7f, 4.2f, 2.02f);
        pathBuilder.curveToRelative(0.67f, 0.14f, 1.3f, -0.36f, 1.3f, -1.04f);
        pathBuilder.curveToRelative(0.0f, -0.53f, -0.39f, -0.96f, -0.92f, -1.05f);
        pathBuilder.curveToRelative(-1.42f, -0.24f, -2.88f, -1.01f, -3.75f, -1.97f);
        pathBuilder.lineToRelative(-1.4f, -1.55f);
        pathBuilder.curveToRelative(-0.19f, -0.21f, -0.43f, -0.38f, -0.69f, -0.5f);
        pathBuilder.curveToRelative(-0.29f, -0.14f, -0.62f, -0.23f, -0.96f, -0.23f);
        pathBuilder.horizontalLineToRelative(-0.03f);
        pathBuilder.curveTo(8.01f, 7.0f, 7.0f, 8.01f, 7.0f, 9.25f);
        pathBuilder.lineTo(7.0f, 15.0f);
        pathBuilder.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(5.07f);
        pathBuilder.lineToRelative(2.78f, 2.78f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.04f, 0.39f, 1.43f, 0.0f);
        pathBuilder.curveToRelative(0.4f, -0.39f, 0.4f, -1.03f, 0.0f, -1.43f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airlineSeatReclineNormal = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
