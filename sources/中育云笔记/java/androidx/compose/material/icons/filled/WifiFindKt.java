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
public final class WifiFindKt {
    private static ImageVector _wifiFind;

    public static final ImageVector getWifiFind(Icons.Filled filled) {
        ImageVector imageVector = _wifiFind;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.WifiFind", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 14.0f);
        pathBuilder.curveToRelative(0.0f, -3.36f, 2.64f, -6.0f, 6.0f, -6.0f);
        pathBuilder.curveToRelative(2.2f, 0.0f, 4.08f, 1.13f, 5.13f, 2.86f);
        pathBuilder.lineTo(24.0f, 8.98f);
        pathBuilder.curveTo(20.93f, 5.9f, 16.69f, 4.0f, 12.0f, 4.0f);
        pathBuilder.curveTo(7.31f, 4.0f, 3.07f, 5.9f, 0.0f, 8.98f);
        pathBuilder.lineTo(12.0f, 21.0f);
        pathBuilder.lineToRelative(1.86f, -1.87f);
        pathBuilder.curveTo(12.14f, 18.09f, 11.0f, 16.2f, 11.0f, 14.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(21.0f, 14.0f);
        pathBuilder2.curveToRelative(0.0f, -2.24f, -1.76f, -4.0f, -4.0f, -4.0f);
        pathBuilder2.reflectiveCurveToRelative(-4.0f, 1.76f, -4.0f, 4.0f);
        pathBuilder2.curveToRelative(0.0f, 2.24f, 1.76f, 4.0f, 4.0f, 4.0f);
        pathBuilder2.curveToRelative(0.75f, 0.0f, 1.44f, -0.21f, 2.03f, -0.56f);
        pathBuilder2.lineTo(21.59f, 20.0f);
        pathBuilder2.lineTo(23.0f, 18.59f);
        pathBuilder2.lineToRelative(-2.56f, -2.56f);
        pathBuilder2.curveTo(20.79f, 15.44f, 21.0f, 14.75f, 21.0f, 14.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.0f, 14.0f);
        pathBuilder2.curveToRelative(0.0f, -1.12f, 0.88f, -2.0f, 2.0f, -2.0f);
        pathBuilder2.reflectiveCurveToRelative(2.0f, 0.88f, 2.0f, 2.0f);
        pathBuilder2.curveToRelative(0.0f, 1.12f, -0.88f, 2.0f, -2.0f, 2.0f);
        pathBuilder2.reflectiveCurveTo(15.0f, 15.12f, 15.0f, 14.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiFind = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
