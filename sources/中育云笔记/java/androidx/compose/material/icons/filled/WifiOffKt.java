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
public final class WifiOffKt {
    private static ImageVector _wifiOff;

    public static final ImageVector getWifiOff(Icons.Filled filled) {
        ImageVector imageVector = _wifiOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.WifiOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.99f, 9.0f);
        pathBuilder.curveTo(19.15f, 5.16f, 13.8f, 3.76f, 8.84f, 4.78f);
        pathBuilder.lineToRelative(2.52f, 2.52f);
        pathBuilder.curveToRelative(3.47f, -0.17f, 6.99f, 1.05f, 9.63f, 3.7f);
        pathBuilder.lineToRelative(2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.99f, 13.0f);
        pathBuilder.curveToRelative(-1.29f, -1.29f, -2.84f, -2.13f, -4.49f, -2.56f);
        pathBuilder.lineToRelative(3.53f, 3.53f);
        pathBuilder.lineToRelative(0.96f, -0.97f);
        pathBuilder.close();
        pathBuilder.moveTo(2.0f, 3.05f);
        pathBuilder.lineTo(5.07f, 6.1f);
        pathBuilder.curveTo(3.6f, 6.82f, 2.22f, 7.78f, 1.0f, 9.0f);
        pathBuilder.lineToRelative(1.99f, 2.0f);
        pathBuilder.curveToRelative(1.24f, -1.24f, 2.67f, -2.16f, 4.2f, -2.77f);
        pathBuilder.lineToRelative(2.24f, 2.24f);
        pathBuilder.curveTo(7.81f, 10.89f, 6.27f, 11.73f, 5.0f, 13.0f);
        pathBuilder.verticalLineToRelative(0.01f);
        pathBuilder.lineTo(6.99f, 15.0f);
        pathBuilder.curveToRelative(1.36f, -1.36f, 3.14f, -2.04f, 4.92f, -2.06f);
        pathBuilder.lineTo(18.98f, 20.0f);
        pathBuilder.lineToRelative(1.27f, -1.26f);
        pathBuilder.lineTo(3.29f, 1.79f);
        pathBuilder.lineTo(2.0f, 3.05f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 17.0f);
        pathBuilder.lineToRelative(3.0f, 3.0f);
        pathBuilder.lineToRelative(3.0f, -3.0f);
        pathBuilder.curveToRelative(-1.65f, -1.66f, -4.34f, -1.66f, -6.0f, 0.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
