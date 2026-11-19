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
public final class NightsStayKt {
    private static ImageVector _nightsStay;

    public static final ImageVector getNightsStay(Icons.Outlined outlined) {
        ImageVector imageVector = _nightsStay;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NightsStay", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.78f, 17.51f);
        pathBuilder.curveToRelative(-2.47f, 0.0f, -6.57f, -1.33f, -8.68f, -5.43f);
        pathBuilder.curveTo(8.77f, 7.57f, 10.6f, 3.6f, 11.63f, 2.01f);
        pathBuilder.curveTo(6.27f, 2.2f, 1.98f, 6.59f, 1.98f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 0.14f, 0.02f, 0.28f, 0.02f, 0.42f);
        pathBuilder.curveTo(2.61f, 12.16f, 3.28f, 12.0f, 3.98f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -3.09f, 1.73f, -5.77f, 4.3f, -7.1f);
        pathBuilder.curveTo(7.78f, 7.09f, 7.74f, 9.94f, 9.32f, 13.0f);
        pathBuilder.curveToRelative(1.57f, 3.04f, 4.18f, 4.95f, 6.8f, 5.86f);
        pathBuilder.curveToRelative(-1.23f, 0.74f, -2.65f, 1.15f, -4.13f, 1.15f);
        pathBuilder.curveToRelative(-0.5f, 0.0f, -1.0f, -0.05f, -1.48f, -0.14f);
        pathBuilder.curveToRelative(-0.37f, 0.7f, -0.94f, 1.27f, -1.64f, 1.64f);
        pathBuilder.curveToRelative(0.98f, 0.32f, 2.03f, 0.5f, 3.11f, 0.5f);
        pathBuilder.curveToRelative(3.5f, 0.0f, 6.58f, -1.8f, 8.37f, -4.52f);
        pathBuilder.curveTo(20.18f, 17.5f, 19.98f, 17.51f, 19.78f, 17.51f);
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
