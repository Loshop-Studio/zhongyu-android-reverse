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
public final class WifiProtectedSetupKt {
    private static ImageVector _wifiProtectedSetup;

    public static final ImageVector getWifiProtectedSetup(Icons.TwoTone twoTone) {
        ImageVector imageVector = _wifiProtectedSetup;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.WifiProtectedSetup", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.71f, 5.29f);
        pathBuilder.lineTo(19.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.lineToRelative(2.3f, -2.3f);
        pathBuilder.curveToRelative(1.97f, 1.46f, 3.25f, 3.78f, 3.25f, 6.42f);
        pathBuilder.curveToRelative(0.0f, 1.31f, -0.32f, 2.54f, -0.88f, 3.63f);
        pathBuilder.curveToRelative(2.33f, -1.52f, 3.88f, -4.14f, 3.88f, -7.13f);
        pathBuilder.curveTo(19.55f, 9.1f, 18.44f, 6.85f, 16.71f, 5.29f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(7.46f, 8.88f);
        pathBuilder2.curveToRelative(0.0f, -1.31f, 0.32f, -2.54f, 0.88f, -3.63f);
        pathBuilder2.curveTo(6.0f, 6.77f, 4.46f, 9.39f, 4.46f, 12.38f);
        pathBuilder2.curveToRelative(0.0f, 2.52f, 1.1f, 4.77f, 2.84f, 6.33f);
        pathBuilder2.lineTo(5.0f, 21.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.verticalLineToRelative(-8.0f);
        pathBuilder2.lineToRelative(-2.3f, 2.3f);
        pathBuilder2.curveTo(8.74f, 13.84f, 7.46f, 11.52f, 7.46f, 8.88f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiProtectedSetup = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
