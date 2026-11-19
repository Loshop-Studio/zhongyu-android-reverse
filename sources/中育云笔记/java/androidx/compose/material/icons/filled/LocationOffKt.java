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
public final class LocationOffKt {
    private static ImageVector _locationOff;

    public static final ImageVector getLocationOff(Icons.Filled filled) {
        ImageVector imageVector = _locationOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.LocationOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 6.5f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilder.curveToRelative(0.0f, 0.74f, -0.33f, 1.39f, -0.83f, 1.85f);
        pathBuilder.lineToRelative(3.63f, 3.63f);
        pathBuilder.curveToRelative(0.98f, -1.86f, 1.7f, -3.8f, 1.7f, -5.48f);
        pathBuilder.curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        pathBuilder.curveToRelative(-1.98f, 0.0f, -3.76f, 0.83f, -5.04f, 2.15f);
        pathBuilder.lineToRelative(3.19f, 3.19f);
        pathBuilder.curveToRelative(0.46f, -0.52f, 1.11f, -0.84f, 1.85f, -0.84f);
        pathBuilder.close();
        pathBuilder.moveTo(16.37f, 16.1f);
        pathBuilder.lineToRelative(-4.63f, -4.63f);
        pathBuilder.lineToRelative(-0.11f, -0.11f);
        pathBuilder.lineTo(3.27f, 3.0f);
        pathBuilder.lineTo(2.0f, 4.27f);
        pathBuilder.lineToRelative(3.18f, 3.18f);
        pathBuilder.curveTo(5.07f, 7.95f, 5.0f, 8.47f, 5.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, 5.25f, 7.0f, 13.0f, 7.0f, 13.0f);
        pathBuilder.reflectiveCurveToRelative(1.67f, -1.85f, 3.38f, -4.35f);
        pathBuilder.lineTo(18.73f, 21.0f);
        pathBuilder.lineTo(20.0f, 19.73f);
        pathBuilder.lineToRelative(-3.63f, -3.63f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _locationOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
