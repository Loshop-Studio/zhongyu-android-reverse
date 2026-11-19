package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class WifiChannelKt {
    private static ImageVector _wifiChannel;

    public static final ImageVector getWifiChannel(Icons.TwoTone twoTone) {
        ImageVector imageVector = _wifiChannel;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.WifiChannel", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 21.0f);
        pathBuilder.curveToRelative(0.5f, -2.53f, 2.0f, -6.0f, 3.0f, -6.0f);
        pathBuilder.reflectiveCurveToRelative(2.5f, 3.53f, 3.0f, 6.0f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.01f, 21.0f);
        pathBuilder.curveToRelative(0.61f, -5.27f, 2.0f, -9.82f, 2.99f, -10.87f);
        pathBuilder.curveToRelative(0.98f, 1.05f, 2.38f, 5.61f, 2.99f, 10.87f);
        pathBuilder.horizontalLineTo(5.01f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 13.0f);
        pathBuilder.curveToRelative(-0.99f, 0.0f, -1.82f, 0.62f, -2.5f, 1.5f);
        pathBuilder.curveToRelative(0.57f, -4.77f, 1.54f, -8.62f, 2.5f, -9.44f);
        pathBuilder.curveToRelative(0.97f, 0.81f, 1.91f, 4.67f, 2.49f, 9.43f);
        pathBuilder.curveTo(17.81f, 13.62f, 16.98f, 13.0f, 16.0f, 13.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(16.0f, 3.0f);
        pathBuilder2.curveToRelative(-2.51f, 0.0f, -3.77f, 5.61f, -4.4f, 10.57f);
        pathBuilder2.curveTo(10.79f, 10.66f, 9.61f, 8.0f, 8.0f, 8.0f);
        pathBuilder2.curveTo(4.43f, 8.0f, 3.0f, 21.0f, 3.0f, 21.0f);
        pathBuilder2.horizontalLineToRelative(2.01f);
        pathBuilder2.curveToRelative(0.61f, -5.27f, 2.0f, -9.82f, 2.99f, -10.87f);
        pathBuilder2.curveToRelative(0.98f, 1.05f, 2.38f, 5.61f, 2.99f, 10.87f);
        pathBuilder2.horizontalLineTo(13.0f);
        pathBuilder2.curveToRelative(0.5f, -2.53f, 2.0f, -6.0f, 3.0f, -6.0f);
        pathBuilder2.reflectiveCurveToRelative(2.5f, 3.53f, 3.0f, 6.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.curveTo(21.0f, 21.0f, 20.5f, 3.0f, 16.0f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.0f, 13.0f);
        pathBuilder2.curveToRelative(-0.99f, 0.0f, -1.82f, 0.62f, -2.5f, 1.5f);
        pathBuilder2.curveToRelative(0.57f, -4.77f, 1.54f, -8.62f, 2.5f, -9.44f);
        pathBuilder2.curveToRelative(0.97f, 0.81f, 1.91f, 4.67f, 2.49f, 9.43f);
        pathBuilder2.curveTo(17.81f, 13.62f, 16.98f, 13.0f, 16.0f, 13.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiChannel = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
