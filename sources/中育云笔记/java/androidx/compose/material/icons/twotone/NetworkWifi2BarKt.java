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
public final class NetworkWifi2BarKt {
    private static ImageVector _networkWifi2Bar;

    public static final ImageVector getNetworkWifi2Bar(Icons.TwoTone twoTone) {
        ImageVector imageVector = _networkWifi2Bar;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.NetworkWifi2Bar", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.78f, 13.38f);
        pathBuilder.curveTo(15.4f, 12.5f, 13.76f, 12.0f, 12.0f, 12.0f);
        pathBuilder.curveToRelative(-1.76f, 0.0f, -3.4f, 0.5f, -4.78f, 1.38f);
        pathBuilder.lineToRelative(-4.3f, -4.3f);
        pathBuilder.curveTo(5.51f, 7.08f, 8.67f, 6.0f, 12.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(6.49f, 1.08f, 9.08f, 3.07f);
        pathBuilder.lineTo(16.78f, 13.38f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 4.0f);
        pathBuilder2.curveTo(7.31f, 4.0f, 3.07f, 5.9f, 0.0f, 8.98f);
        pathBuilder2.lineTo(12.0f, 21.0f);
        pathBuilder2.lineTo(24.0f, 8.98f);
        pathBuilder2.curveTo(20.93f, 5.9f, 16.69f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.78f, 13.38f);
        pathBuilder2.curveTo(15.4f, 12.5f, 13.76f, 12.0f, 12.0f, 12.0f);
        pathBuilder2.curveToRelative(-1.76f, 0.0f, -3.4f, 0.5f, -4.78f, 1.38f);
        pathBuilder2.lineToRelative(-4.3f, -4.3f);
        pathBuilder2.curveTo(5.51f, 7.08f, 8.67f, 6.0f, 12.0f, 6.0f);
        pathBuilder2.reflectiveCurveToRelative(6.49f, 1.08f, 9.08f, 3.07f);
        pathBuilder2.lineTo(16.78f, 13.38f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _networkWifi2Bar = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
