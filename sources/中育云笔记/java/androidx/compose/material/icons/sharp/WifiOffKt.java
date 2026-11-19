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
public final class WifiOffKt {
    private static ImageVector _wifiOff;

    public static final ImageVector getWifiOff(Icons.Sharp sharp) {
        ImageVector imageVector = _wifiOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.WifiOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 11.0f);
        pathBuilder.lineToRelative(2.0f, -2.0f);
        pathBuilder.curveToRelative(-3.73f, -3.73f, -8.87f, -5.15f, -13.7f, -4.31f);
        pathBuilder.lineToRelative(2.58f, 2.58f);
        pathBuilder.curveToRelative(3.3f, -0.02f, 6.61f, 1.22f, 9.12f, 3.73f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 17.0f);
        pathBuilder.lineToRelative(3.0f, 3.0f);
        pathBuilder.lineToRelative(3.0f, -3.0f);
        pathBuilder.curveToRelative(-1.65f, -1.66f, -4.34f, -1.66f, -6.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 13.0f);
        pathBuilder.curveToRelative(-1.08f, -1.08f, -2.36f, -1.85f, -3.72f, -2.33f);
        pathBuilder.lineToRelative(3.02f, 3.02f);
        pathBuilder.lineToRelative(0.7f, -0.69f);
        pathBuilder.close();
        pathBuilder.moveTo(3.41f, 1.64f);
        pathBuilder.lineTo(2.0f, 3.05f);
        pathBuilder.lineTo(5.05f, 6.1f);
        pathBuilder.curveTo(3.59f, 6.83f, 2.22f, 7.79f, 1.0f, 9.0f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.curveToRelative(1.23f, -1.23f, 2.65f, -2.16f, 4.17f, -2.78f);
        pathBuilder.lineToRelative(2.24f, 2.24f);
        pathBuilder.curveTo(7.79f, 10.89f, 6.27f, 11.74f, 5.0f, 13.0f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.curveToRelative(1.35f, -1.35f, 3.11f, -2.04f, 4.89f, -2.06f);
        pathBuilder.lineToRelative(7.08f, 7.08f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(3.41f, 1.64f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
