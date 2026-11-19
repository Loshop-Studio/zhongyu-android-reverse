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
public final class ShieldMoonKt {
    private static ImageVector _shieldMoon;

    public static final ImageVector getShieldMoon(Icons.Outlined outlined) {
        ImageVector imageVector = _shieldMoon;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ShieldMoon", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.lineTo(4.0f, 5.0f);
        pathBuilder.verticalLineToRelative(6.09f);
        pathBuilder.curveToRelative(0.0f, 5.05f, 3.41f, 9.76f, 8.0f, 10.91f);
        pathBuilder.curveToRelative(4.59f, -1.15f, 8.0f, -5.86f, 8.0f, -10.91f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.lineTo(12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 11.09f);
        pathBuilder.curveToRelative(0.0f, 4.0f, -2.55f, 7.7f, -6.0f, 8.83f);
        pathBuilder.curveToRelative(-3.45f, -1.13f, -6.0f, -4.82f, -6.0f, -8.83f);
        pathBuilder.verticalLineToRelative(-4.7f);
        pathBuilder.lineToRelative(6.0f, -2.25f);
        pathBuilder.lineToRelative(6.0f, 2.25f);
        pathBuilder.verticalLineTo(11.09f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(9.01f, 14.33f);
        pathBuilder2.curveToRelative(1.75f, 2.17f, 5.12f, 2.24f, 6.96f, 0.07f);
        pathBuilder2.curveToRelative(0.23f, -0.27f, 0.08f, -0.68f, -0.26f, -0.74f);
        pathBuilder2.curveToRelative(-1.29f, -0.21f, -2.48f, -0.98f, -3.18f, -2.2f);
        pathBuilder2.curveToRelative(-0.71f, -1.22f, -0.78f, -2.63f, -0.32f, -3.86f);
        pathBuilder2.curveToRelative(0.12f, -0.33f, -0.16f, -0.66f, -0.51f, -0.6f);
        pathBuilder2.curveTo(8.36f, 7.62f, 6.81f, 11.61f, 9.01f, 14.33f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shieldMoon = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
