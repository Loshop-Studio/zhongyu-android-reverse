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
public final class ShieldMoonKt {
    private static ImageVector _shieldMoon;

    public static final ImageVector getShieldMoon(Icons.Filled filled) {
        ImageVector imageVector = _shieldMoon;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ShieldMoon", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.lineTo(4.0f, 5.0f);
        pathBuilder.verticalLineToRelative(6.09f);
        pathBuilder.curveToRelative(0.0f, 5.05f, 3.41f, 9.76f, 8.0f, 10.91f);
        pathBuilder.curveToRelative(4.59f, -1.15f, 8.0f, -5.86f, 8.0f, -10.91f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.lineTo(12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.97f, 14.41f);
        pathBuilder.curveToRelative(-1.84f, 2.17f, -5.21f, 2.1f, -6.96f, -0.07f);
        pathBuilder.curveToRelative(-2.19f, -2.72f, -0.65f, -6.72f, 2.69f, -7.33f);
        pathBuilder.curveToRelative(0.34f, -0.06f, 0.63f, 0.27f, 0.51f, 0.6f);
        pathBuilder.curveToRelative(-0.46f, 1.23f, -0.39f, 2.64f, 0.32f, 3.86f);
        pathBuilder.curveToRelative(0.71f, 1.22f, 1.89f, 1.99f, 3.18f, 2.2f);
        pathBuilder.curveTo(16.05f, 13.72f, 16.2f, 14.14f, 15.97f, 14.41f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shieldMoon = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
