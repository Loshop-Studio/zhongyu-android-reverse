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
public final class NightsStayKt {
    private static ImageVector _nightsStay;

    public static final ImageVector getNightsStay(Icons.Rounded rounded) {
        ImageVector imageVector = _nightsStay;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NightsStay", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.1f, 12.08f);
        pathBuilder.curveToRelative(-2.0f, -3.88f, -0.92f, -7.36f, 0.07f, -9.27f);
        pathBuilder.curveToRelative(0.19f, -0.36f, -0.12f, -0.77f, -0.53f, -0.72f);
        pathBuilder.curveTo(5.62f, 2.77f, 1.78f, 7.16f, 1.99f, 12.41f);
        pathBuilder.curveToRelative(0.01f, 0.0f, 0.01f, 0.0f, 0.01f, 0.01f);
        pathBuilder.curveTo(2.62f, 12.15f, 3.29f, 12.0f, 4.0f, 12.0f);
        pathBuilder.curveToRelative(1.66f, 0.0f, 3.18f, 0.83f, 4.1f, 2.15f);
        pathBuilder.curveTo(9.77f, 14.63f, 11.0f, 16.17f, 11.0f, 18.0f);
        pathBuilder.curveToRelative(0.0f, 1.52f, -0.87f, 2.83f, -2.12f, 3.51f);
        pathBuilder.curveToRelative(0.98f, 0.32f, 2.03f, 0.5f, 3.11f, 0.5f);
        pathBuilder.curveToRelative(3.13f, 0.0f, 5.92f, -1.44f, 7.76f, -3.69f);
        pathBuilder.curveToRelative(0.26f, -0.32f, 0.04f, -0.79f, -0.37f, -0.82f);
        pathBuilder.curveTo(16.89f, 17.37f, 13.1f, 15.97f, 11.1f, 12.08f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(7.0f, 16.0f);
        pathBuilder2.lineToRelative(-0.18f, 0.0f);
        pathBuilder2.curveTo(6.4f, 14.84f, 5.3f, 14.0f, 4.0f, 14.0f);
        pathBuilder2.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder2.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder2.curveToRelative(0.62f, 0.0f, 2.49f, 0.0f, 3.0f, 0.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.curveTo(9.0f, 16.9f, 8.1f, 16.0f, 7.0f, 16.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nightsStay = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
