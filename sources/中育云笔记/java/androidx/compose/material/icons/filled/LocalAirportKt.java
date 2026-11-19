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
public final class LocalAirportKt {
    private static ImageVector _localAirport;

    public static final ImageVector getLocalAirport(Icons.Filled filled) {
        ImageVector imageVector = _localAirport;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.LocalAirport", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 16.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.lineToRelative(-8.5f, -5.0f);
        pathBuilder.verticalLineTo(3.5f);
        pathBuilder.curveTo(13.5f, 2.67f, 12.83f, 2.0f, 12.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.lineTo(2.0f, 14.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineToRelative(8.5f, -2.5f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.lineTo(8.0f, 20.5f);
        pathBuilder.lineTo(8.0f, 22.0f);
        pathBuilder.lineToRelative(4.0f, -1.0f);
        pathBuilder.lineToRelative(4.0f, 1.0f);
        pathBuilder.lineToRelative(0.0f, -1.5f);
        pathBuilder.lineTo(13.5f, 19.0f);
        pathBuilder.verticalLineToRelative(-5.5f);
        pathBuilder.lineTo(22.0f, 16.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localAirport = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
