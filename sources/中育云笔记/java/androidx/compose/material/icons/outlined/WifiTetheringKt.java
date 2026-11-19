package androidx.compose.material.icons.outlined;

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
public final class WifiTetheringKt {
    private static ImageVector _wifiTethering;

    public static final ImageVector getWifiTethering(Icons.Outlined outlined) {
        ImageVector imageVector = _wifiTethering;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.WifiTethering", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 11.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f);
        pathBuilder.reflectiveCurveToRelative(-6.0f, 2.69f, -6.0f, 6.0f);
        pathBuilder.curveToRelative(0.0f, 2.22f, 1.21f, 4.15f, 3.0f, 5.19f);
        pathBuilder.lineToRelative(1.0f, -1.74f);
        pathBuilder.curveToRelative(-1.19f, -0.7f, -2.0f, -1.97f, -2.0f, -3.45f);
        pathBuilder.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, 1.48f, -0.81f, 2.75f, -2.0f, 3.45f);
        pathBuilder.lineToRelative(1.0f, 1.74f);
        pathBuilder.curveToRelative(1.79f, -1.04f, 3.0f, -2.97f, 3.0f, -5.19f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 3.0f);
        pathBuilder.curveTo(6.48f, 3.0f, 2.0f, 7.48f, 2.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, 3.7f, 2.01f, 6.92f, 4.99f, 8.65f);
        pathBuilder.lineToRelative(1.0f, -1.73f);
        pathBuilder.curveTo(5.61f, 18.53f, 4.0f, 15.96f, 4.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, 2.96f, -1.61f, 5.53f, -4.0f, 6.92f);
        pathBuilder.lineToRelative(1.0f, 1.73f);
        pathBuilder.curveToRelative(2.99f, -1.73f, 5.0f, -4.95f, 5.0f, -8.65f);
        pathBuilder.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiTethering = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
