package androidx.compose.material.icons.filled;

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
public final class FlightTakeoffKt {
    private static ImageVector _flightTakeoff;

    public static final ImageVector getFlightTakeoff(Icons.Filled filled) {
        ImageVector imageVector = _flightTakeoff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FlightTakeoff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.5f, 19.0f);
        pathBuilder.horizontalLineToRelative(19.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-19.0f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.07f, 9.64f);
        pathBuilder.curveToRelative(-0.21f, -0.8f, -1.04f, -1.28f, -1.84f, -1.06f);
        pathBuilder.lineTo(14.92f, 10.0f);
        pathBuilder.lineToRelative(-6.9f, -6.43f);
        pathBuilder.lineTo(6.09f, 4.08f);
        pathBuilder.lineToRelative(4.14f, 7.17f);
        pathBuilder.lineToRelative(-4.97f, 1.33f);
        pathBuilder.lineToRelative(-1.97f, -1.54f);
        pathBuilder.lineToRelative(-1.45f, 0.39f);
        pathBuilder.lineToRelative(2.59f, 4.49f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 7.12f, -1.9f, 16.57f, -4.43f);
        pathBuilder.curveTo(21.81f, 11.26f, 22.28f, 10.44f, 22.07f, 9.64f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flightTakeoff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
