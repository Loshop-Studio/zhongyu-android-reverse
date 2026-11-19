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
public final class FlightKt {
    private static ImageVector _flight;

    public static final ImageVector getFlight(Icons.Sharp sharp) {
        ImageVector imageVector = _flight;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Flight", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 16.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.lineToRelative(-8.0f, -5.0f);
        pathBuilder.verticalLineTo(3.5f);
        pathBuilder.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(10.0f, 2.67f, 10.0f, 3.5f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.lineToRelative(-8.0f, 5.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineToRelative(8.0f, -2.5f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.lineToRelative(-2.0f, 1.5f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.lineToRelative(3.5f, -1.0f);
        pathBuilder.lineToRelative(3.5f, 1.0f);
        pathBuilder.verticalLineToRelative(-1.5f);
        pathBuilder.lineTo(13.0f, 19.0f);
        pathBuilder.verticalLineToRelative(-5.5f);
        pathBuilder.lineToRelative(8.0f, 2.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flight = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
