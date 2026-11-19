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
public final class WifiProtectedSetupKt {
    private static ImageVector _wifiProtectedSetup;

    public static final ImageVector getWifiProtectedSetup(Icons.Rounded rounded) {
        ImageVector imageVector = _wifiProtectedSetup;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WifiProtectedSetup", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.7f, 5.3f);
        pathBuilder.lineToRelative(1.44f, -1.44f);
        pathBuilder.curveToRelative(0.32f, -0.32f, 0.09f, -0.85f, -0.35f, -0.85f);
        pathBuilder.horizontalLineTo(11.5f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilder.verticalLineTo(9.8f);
        pathBuilder.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        pathBuilder.lineToRelative(1.45f, -1.45f);
        pathBuilder.curveToRelative(1.97f, 1.46f, 3.25f, 3.78f, 3.25f, 6.42f);
        pathBuilder.curveToRelative(0.0f, 0.66f, -0.08f, 1.31f, -0.24f, 1.92f);
        pathBuilder.curveToRelative(-0.12f, 0.5f, 0.48f, 0.86f, 0.84f, 0.49f);
        pathBuilder.curveToRelative(1.48f, -1.53f, 2.4f, -3.61f, 2.4f, -5.91f);
        pathBuilder.curveTo(19.55f, 9.11f, 18.44f, 6.86f, 16.7f, 5.3f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.15f, 13.86f);
        pathBuilder2.lineTo(10.7f, 15.3f);
        pathBuilder2.curveToRelative(-1.97f, -1.46f, -3.25f, -3.78f, -3.25f, -6.42f);
        pathBuilder2.curveToRelative(0.0f, -0.66f, 0.08f, -1.31f, 0.24f, -1.92f);
        pathBuilder2.curveToRelative(0.12f, -0.5f, -0.48f, -0.86f, -0.84f, -0.49f);
        pathBuilder2.curveToRelative(-1.48f, 1.53f, -2.4f, 3.61f, -2.4f, 5.91f);
        pathBuilder2.curveToRelative(0.0f, 2.52f, 1.1f, 4.77f, 2.84f, 6.33f);
        pathBuilder2.lineToRelative(-1.44f, 1.44f);
        pathBuilder2.curveToRelative(-0.32f, 0.32f, -0.09f, 0.85f, 0.35f, 0.85f);
        pathBuilder2.horizontalLineToRelative(6.29f);
        pathBuilder2.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilder2.verticalLineToRelative(-6.29f);
        pathBuilder2.curveTo(13.0f, 13.77f, 12.46f, 13.54f, 12.15f, 13.86f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiProtectedSetup = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
