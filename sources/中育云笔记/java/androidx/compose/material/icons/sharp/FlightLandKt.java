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
public final class FlightLandKt {
    private static ImageVector _flightLand;

    public static final ImageVector getFlightLand(Icons.Sharp sharp) {
        ImageVector imageVector = _flightLand;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FlightLand", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.5f, 19.0f);
        pathBuilder.horizontalLineToRelative(19.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-19.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.34f, 15.85f);
        pathBuilder.curveToRelative(0.8f, 0.21f, 1.62f, -0.26f, 1.84f, -1.06f);
        pathBuilder.curveToRelative(0.21f, -0.8f, -0.26f, -1.62f, -1.06f, -1.84f);
        pathBuilder.lineToRelative(-5.31f, -1.42f);
        pathBuilder.lineToRelative(-2.76f, -9.02f);
        pathBuilder.lineTo(10.12f, 2.0f);
        pathBuilder.verticalLineToRelative(8.28f);
        pathBuilder.lineTo(5.15f, 8.95f);
        pathBuilder.lineToRelative(-0.93f, -2.32f);
        pathBuilder.lineToRelative(-1.45f, -0.39f);
        pathBuilder.verticalLineToRelative(5.17f);
        pathBuilder.lineToRelative(16.57f, 4.44f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flightLand = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
