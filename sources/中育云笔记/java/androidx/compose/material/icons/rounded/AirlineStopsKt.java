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
public final class AirlineStopsKt {
    private static ImageVector _airlineStops;

    public static final ImageVector getAirlineStops(Icons.Rounded rounded) {
        ImageVector imageVector = _airlineStops;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AirlineStops", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.0f, 18.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.curveToRelative(-0.47f, -4.21f, -3.89f, -7.55f, -8.12f, -7.96f);
        pathBuilder.curveTo(2.37f, 8.99f, 2.0f, 8.56f, 2.0f, 8.05f);
        pathBuilder.curveToRelative(0.0f, -0.59f, 0.52f, -1.06f, 1.11f, -1.0f);
        pathBuilder.curveTo(7.03f, 7.44f, 10.37f, 9.87f, 12.0f, 13.3f);
        pathBuilder.curveToRelative(1.13f, -2.43f, 2.99f, -4.25f, 4.78f, -5.52f);
        pathBuilder.lineToRelative(-1.92f, -1.92f);
        pathBuilder.curveTo(14.54f, 5.54f, 14.76f, 5.0f, 15.21f, 5.0f);
        pathBuilder.horizontalLineToRelative(5.29f);
        pathBuilder.curveTo(20.78f, 5.0f, 21.0f, 5.22f, 21.0f, 5.5f);
        pathBuilder.verticalLineToRelative(5.29f);
        pathBuilder.curveToRelative(0.0f, 0.45f, -0.54f, 0.67f, -0.85f, 0.35f);
        pathBuilder.lineToRelative(-1.94f, -1.94f);
        pathBuilder.curveTo(15.93f, 10.78f, 13.45f, 13.3f, 13.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.curveTo(14.55f, 17.0f, 15.0f, 17.45f, 15.0f, 18.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airlineStops = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
