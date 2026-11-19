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
public final class AirportShuttleKt {
    private static ImageVector _airportShuttle;

    public static final ImageVector getAirportShuttle(Icons.Outlined outlined) {
        ImageVector imageVector = _airportShuttle;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AirportShuttle", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 5.0f);
        pathBuilder.lineTo(3.0f, 5.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(9.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-5.0f);
        pathBuilder.lineToRelative(-6.0f, -6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.lineToRelative(3.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.lineTo(15.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.lineTo(9.0f, 10.0f);
        pathBuilder.lineTo(9.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.lineTo(3.0f, 10.0f);
        pathBuilder.lineTo(3.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 17.25f);
        pathBuilder.curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f);
        pathBuilder.reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f);
        pathBuilder.reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f);
        pathBuilder.reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 17.25f);
        pathBuilder.curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f);
        pathBuilder.reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f);
        pathBuilder.reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f);
        pathBuilder.reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(-0.78f);
        pathBuilder.curveToRelative(-0.55f, -0.61f, -1.34f, -1.0f, -2.22f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.67f, 0.39f, -2.22f, 1.0f);
        pathBuilder.lineTo(8.22f, 14.0f);
        pathBuilder.curveToRelative(-0.55f, -0.61f, -1.33f, -1.0f, -2.22f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.67f, 0.39f, -2.22f, 1.0f);
        pathBuilder.lineTo(3.0f, 14.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airportShuttle = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
