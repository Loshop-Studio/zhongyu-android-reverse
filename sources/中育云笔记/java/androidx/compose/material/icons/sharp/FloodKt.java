package androidx.compose.material.icons.sharp;

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
public final class FloodKt {
    private static ImageVector _flood;

    public static final ImageVector getFlood(Icons.Sharp sharp) {
        ImageVector imageVector = _flood;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Flood", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.67f, 19.0f);
        pathBuilder.curveToRelative(-1.95f, 0.0f, -2.09f, 1.0f, -3.33f, 1.0f);
        pathBuilder.curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f);
        pathBuilder.curveToRelative(-1.95f, 0.0f, -2.1f, 1.0f, -3.34f, 1.0f);
        pathBuilder.curveToRelative(-1.24f, 0.0f, -1.38f, -1.0f, -3.33f, -1.0f);
        pathBuilder.curveToRelative(-1.95f, 0.0f, -2.1f, 1.0f, -3.34f, 1.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveToRelative(1.95f, 0.0f, 2.11f, -1.0f, 3.34f, -1.0f);
        pathBuilder.curveToRelative(1.24f, 0.0f, 1.38f, 1.0f, 3.33f, 1.0f);
        pathBuilder.curveToRelative(1.95f, 0.0f, 2.1f, -1.0f, 3.34f, -1.0f);
        pathBuilder.curveToRelative(1.22f, 0.0f, 1.4f, 1.0f, 3.33f, 1.0f);
        pathBuilder.curveToRelative(1.93f, 0.0f, 2.1f, -1.0f, 3.33f, -1.0f);
        pathBuilder.curveToRelative(1.22f, 0.0f, 1.4f, 1.0f, 3.33f, 1.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveTo(20.76f, 20.0f, 20.62f, 19.0f, 18.67f, 19.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(8.68f, 17.5f);
        pathBuilder2.curveToRelative(1.95f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f);
        pathBuilder2.curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f);
        pathBuilder2.curveToRelative(1.95f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f);
        pathBuilder2.curveToRelative(1.19f, 0.0f, 1.4f, 0.98f, 3.31f, 1.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.curveToRelative(-0.63f, 0.0f, -1.0f, -0.28f, -1.48f, -0.55f);
        pathBuilder2.lineToRelative(-2.02f, -7.53f);
        pathBuilder2.lineToRelative(2.09f, 0.85f);
        pathBuilder2.lineToRelative(0.74f, -1.86f);
        pathBuilder2.lineTo(9.78f, 2.0f);
        pathBuilder2.lineTo(2.0f, 11.61f);
        pathBuilder2.lineToRelative(1.57f, 1.23f);
        pathBuilder2.lineToRelative(1.39f, -1.78f);
        pathBuilder2.lineToRelative(0.93f, 3.48f);
        pathBuilder2.curveToRelative(-0.18f, -0.02f, -0.35f, -0.05f, -0.56f, -0.05f);
        pathBuilder2.curveToRelative(-1.95f, 0.0f, -2.09f, 1.0f, -3.33f, 1.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.curveToRelative(1.9f, 0.0f, 2.17f, -1.0f, 3.35f, -1.0f);
        pathBuilder2.curveTo(6.54f, 16.5f, 6.77f, 17.5f, 8.68f, 17.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.04f, 10.18f);
        pathBuilder2.lineToRelative(1.42f, 5.31f);
        pathBuilder2.curveToRelative(-1.34f, 0.09f, -1.47f, -0.99f, -3.47f, -0.99f);
        pathBuilder2.curveToRelative(-0.36f, 0.0f, -0.65f, 0.04f, -0.91f, 0.1f);
        pathBuilder2.lineToRelative(-0.91f, -3.39f);
        pathBuilder2.lineTo(14.04f, 10.18f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flood = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
