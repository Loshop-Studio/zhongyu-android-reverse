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
public final class WifiChannelKt {
    private static ImageVector _wifiChannel;

    public static final ImageVector getWifiChannel(Icons.Filled filled) {
        ImageVector imageVector = _wifiChannel;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.WifiChannel", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.0f, 3.0f);
        pathBuilder.curveToRelative(-2.51f, 0.0f, -3.77f, 5.61f, -4.4f, 10.57f);
        pathBuilder.curveTo(10.79f, 10.66f, 9.61f, 8.0f, 8.0f, 8.0f);
        pathBuilder.curveTo(4.43f, 8.0f, 3.0f, 21.0f, 3.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(2.01f);
        pathBuilder.curveToRelative(0.61f, -5.27f, 2.0f, -9.82f, 2.99f, -10.87f);
        pathBuilder.curveToRelative(0.98f, 1.05f, 2.38f, 5.61f, 2.99f, 10.87f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.curveToRelative(0.5f, -2.53f, 2.0f, -6.0f, 3.0f, -6.0f);
        pathBuilder.reflectiveCurveToRelative(2.5f, 3.53f, 3.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveTo(21.0f, 21.0f, 20.5f, 3.0f, 16.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 13.0f);
        pathBuilder.curveToRelative(-0.99f, 0.0f, -1.82f, 0.62f, -2.5f, 1.5f);
        pathBuilder.curveToRelative(0.57f, -4.77f, 1.54f, -8.62f, 2.5f, -9.44f);
        pathBuilder.curveToRelative(0.97f, 0.81f, 1.91f, 4.67f, 2.49f, 9.43f);
        pathBuilder.curveTo(17.81f, 13.62f, 16.98f, 13.0f, 16.0f, 13.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiChannel = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
