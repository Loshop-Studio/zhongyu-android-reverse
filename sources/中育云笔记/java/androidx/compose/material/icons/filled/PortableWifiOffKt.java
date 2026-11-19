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
public final class PortableWifiOffKt {
    private static ImageVector _portableWifiOff;

    public static final ImageVector getPortableWifiOff(Icons.Filled filled) {
        ImageVector imageVector = _portableWifiOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PortableWifiOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.56f, 14.24f);
        pathBuilder.curveToRelative(0.28f, -0.69f, 0.44f, -1.45f, 0.44f, -2.24f);
        pathBuilder.curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f);
        pathBuilder.curveToRelative(-0.79f, 0.0f, -1.55f, 0.16f, -2.24f, 0.44f);
        pathBuilder.lineToRelative(1.62f, 1.62f);
        pathBuilder.curveToRelative(0.2f, -0.03f, 0.41f, -0.06f, 0.62f, -0.06f);
        pathBuilder.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, 0.21f, -0.02f, 0.42f, -0.05f, 0.63f);
        pathBuilder.lineToRelative(1.61f, 1.61f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveToRelative(4.42f, 0.0f, 8.0f, 3.58f, 8.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, 1.35f, -0.35f, 2.62f, -0.95f, 3.74f);
        pathBuilder.lineToRelative(1.47f, 1.47f);
        pathBuilder.curveTo(21.46f, 15.69f, 22.0f, 13.91f, 22.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        pathBuilder.curveToRelative(-1.91f, 0.0f, -3.69f, 0.55f, -5.21f, 1.47f);
        pathBuilder.lineToRelative(1.46f, 1.46f);
        pathBuilder.curveTo(9.37f, 4.34f, 10.65f, 4.0f, 12.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.27f, 2.5f);
        pathBuilder.lineTo(2.0f, 3.77f);
        pathBuilder.lineToRelative(2.1f, 2.1f);
        pathBuilder.curveTo(2.79f, 7.57f, 2.0f, 9.69f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 3.7f, 2.01f, 6.92f, 4.99f, 8.65f);
        pathBuilder.lineToRelative(1.0f, -1.73f);
        pathBuilder.curveTo(5.61f, 17.53f, 4.0f, 14.96f, 4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.76f, 0.57f, -3.38f, 1.53f, -4.69f);
        pathBuilder.lineToRelative(1.43f, 1.44f);
        pathBuilder.curveTo(6.36f, 9.68f, 6.0f, 10.8f, 6.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 2.22f, 1.21f, 4.15f, 3.0f, 5.19f);
        pathBuilder.lineToRelative(1.0f, -1.74f);
        pathBuilder.curveToRelative(-1.19f, -0.7f, -2.0f, -1.97f, -2.0f, -3.45f);
        pathBuilder.curveToRelative(0.0f, -0.65f, 0.17f, -1.25f, 0.44f, -1.79f);
        pathBuilder.lineToRelative(1.58f, 1.58f);
        pathBuilder.lineTo(10.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.lineToRelative(0.21f, -0.02f);
        pathBuilder.lineToRelative(0.01f, 0.01f);
        pathBuilder.lineToRelative(7.51f, 7.51f);
        pathBuilder.lineTo(21.0f, 20.23f);
        pathBuilder.lineTo(4.27f, 3.5f);
        pathBuilder.lineToRelative(-1.0f, -1.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _portableWifiOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
