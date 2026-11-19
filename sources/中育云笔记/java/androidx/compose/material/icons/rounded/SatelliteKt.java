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
public final class SatelliteKt {
    private static ImageVector _satellite;

    public static final ImageVector getSatellite(Icons.Rounded rounded) {
        ImageVector imageVector = _satellite;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Satellite", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 3.0f);
        pathBuilder.lineTo(5.0f, 3.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineTo(21.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        pathBuilder.lineTo(5.0f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 10.91f);
        pathBuilder.curveToRelative(0.0f, -0.49f, 0.36f, -0.9f, 0.85f, -0.98f);
        pathBuilder.curveToRelative(2.08f, -0.36f, 3.72f, -2.0f, 4.08f, -4.08f);
        pathBuilder.curveToRelative(0.08f, -0.49f, 0.49f, -0.85f, 0.98f, -0.85f);
        pathBuilder.curveToRelative(0.61f, 0.0f, 1.09f, 0.53f, 1.0f, 1.13f);
        pathBuilder.curveToRelative(-0.48f, 2.96f, -2.81f, 5.3f, -5.77f, 5.78f);
        pathBuilder.curveToRelative(-0.6f, 0.1f, -1.14f, -0.39f, -1.14f, -1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.63f, 17.19f);
        pathBuilder.lineToRelative(2.49f, -3.2f);
        pathBuilder.curveToRelative(0.2f, -0.25f, 0.58f, -0.26f, 0.78f, -0.01f);
        pathBuilder.lineToRelative(2.1f, 2.53f);
        pathBuilder.lineToRelative(3.1f, -3.99f);
        pathBuilder.curveToRelative(0.2f, -0.26f, 0.6f, -0.26f, 0.8f, 0.01f);
        pathBuilder.lineToRelative(3.51f, 4.68f);
        pathBuilder.curveToRelative(0.25f, 0.33f, 0.01f, 0.8f, -0.4f, 0.8f);
        pathBuilder.lineTo(6.02f, 18.01f);
        pathBuilder.curveToRelative(-0.41f, -0.01f, -0.65f, -0.49f, -0.39f, -0.82f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _satellite = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
