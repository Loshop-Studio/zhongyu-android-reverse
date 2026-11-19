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
public final class DarkModeKt {
    private static ImageVector _darkMode;

    public static final ImageVector getDarkMode(Icons.Outlined outlined) {
        ImageVector imageVector = _darkMode;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DarkMode", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.37f, 5.51f);
        pathBuilder.curveTo(9.19f, 6.15f, 9.1f, 6.82f, 9.1f, 7.5f);
        pathBuilder.curveToRelative(0.0f, 4.08f, 3.32f, 7.4f, 7.4f, 7.4f);
        pathBuilder.curveToRelative(0.68f, 0.0f, 1.35f, -0.09f, 1.99f, -0.27f);
        pathBuilder.curveTo(17.45f, 17.19f, 14.93f, 19.0f, 12.0f, 19.0f);
        pathBuilder.curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f);
        pathBuilder.curveTo(5.0f, 9.07f, 6.81f, 6.55f, 9.37f, 5.51f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 3.0f);
        pathBuilder.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(4.03f, 9.0f, 9.0f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(9.0f, -4.03f, 9.0f, -9.0f);
        pathBuilder.curveToRelative(0.0f, -0.46f, -0.04f, -0.92f, -0.1f, -1.36f);
        pathBuilder.curveToRelative(-0.98f, 1.37f, -2.58f, 2.26f, -4.4f, 2.26f);
        pathBuilder.curveToRelative(-2.98f, 0.0f, -5.4f, -2.42f, -5.4f, -5.4f);
        pathBuilder.curveToRelative(0.0f, -1.81f, 0.89f, -3.42f, 2.26f, -4.4f);
        pathBuilder.curveTo(12.92f, 3.04f, 12.46f, 3.0f, 12.0f, 3.0f);
        pathBuilder.lineTo(12.0f, 3.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _darkMode = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
