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
public final class PixKt {
    private static ImageVector _pix;

    public static final ImageVector getPix(Icons.Rounded rounded) {
        ImageVector imageVector = _pix;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Pix", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.45f, 16.52f);
        pathBuilder.lineToRelative(-3.01f, -3.01f);
        pathBuilder.curveToRelative(-0.11f, -0.11f, -0.24f, -0.13f, -0.31f, -0.13f);
        pathBuilder.reflectiveCurveToRelative(-0.2f, 0.02f, -0.31f, 0.13f);
        pathBuilder.lineTo(8.8f, 16.53f);
        pathBuilder.curveToRelative(-0.34f, 0.34f, -0.87f, 0.89f, -2.64f, 0.89f);
        pathBuilder.lineToRelative(3.71f, 3.7f);
        pathBuilder.curveToRelative(1.17f, 1.17f, 3.07f, 1.17f, 4.24f, 0.0f);
        pathBuilder.lineToRelative(3.72f, -3.71f);
        pathBuilder.curveTo(16.92f, 17.41f, 16.16f, 17.23f, 15.45f, 16.52f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(8.8f, 7.47f);
        pathBuilder2.lineToRelative(3.02f, 3.02f);
        pathBuilder2.curveToRelative(0.08f, 0.08f, 0.2f, 0.13f, 0.31f, 0.13f);
        pathBuilder2.reflectiveCurveToRelative(0.23f, -0.05f, 0.31f, -0.13f);
        pathBuilder2.lineToRelative(2.99f, -2.99f);
        pathBuilder2.curveToRelative(0.71f, -0.74f, 1.52f, -0.91f, 2.43f, -0.91f);
        pathBuilder2.lineToRelative(-3.72f, -3.71f);
        pathBuilder2.curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0.0f);
        pathBuilder2.lineToRelative(-3.71f, 3.7f);
        pathBuilder2.curveTo(7.95f, 6.58f, 8.49f, 7.16f, 8.8f, 7.47f);
        pathBuilder2.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw3 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk83 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(21.11f, 9.85f);
        pathBuilder3.lineToRelative(-2.25f, -2.26f);
        pathBuilder3.horizontalLineTo(17.6f);
        pathBuilder3.curveToRelative(-0.54f, 0.0f, -1.08f, 0.22f, -1.45f, 0.61f);
        pathBuilder3.lineToRelative(-3.0f, 3.0f);
        pathBuilder3.curveToRelative(-0.28f, 0.28f, -0.65f, 0.42f, -1.02f, 0.42f);
        pathBuilder3.curveToRelative(-0.36f, 0.0f, -0.74f, -0.15f, -1.02f, -0.42f);
        pathBuilder3.lineTo(8.09f, 8.17f);
        pathBuilder3.curveToRelative(-0.38f, -0.38f, -0.9f, -0.6f, -1.45f, -0.6f);
        pathBuilder3.horizontalLineTo(5.17f);
        pathBuilder3.lineToRelative(-2.29f, 2.3f);
        pathBuilder3.curveToRelative(-1.17f, 1.17f, -1.17f, 3.07f, 0.0f, 4.24f);
        pathBuilder3.lineToRelative(2.29f, 2.3f);
        pathBuilder3.horizontalLineToRelative(1.48f);
        pathBuilder3.curveToRelative(0.54f, 0.0f, 1.06f, -0.22f, 1.45f, -0.6f);
        pathBuilder3.lineToRelative(3.02f, -3.02f);
        pathBuilder3.curveToRelative(0.28f, -0.28f, 0.65f, -0.42f, 1.02f, -0.42f);
        pathBuilder3.curveToRelative(0.37f, 0.0f, 0.74f, 0.14f, 1.02f, 0.42f);
        pathBuilder3.lineToRelative(3.01f, 3.01f);
        pathBuilder3.curveToRelative(0.38f, 0.38f, 0.9f, 0.6f, 1.45f, 0.6f);
        pathBuilder3.horizontalLineToRelative(1.26f);
        pathBuilder3.lineToRelative(2.25f, -2.26f);
        pathBuilder3.curveTo(22.3f, 12.96f, 22.3f, 11.04f, 21.11f, 9.85f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw3, iM31241getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pix = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
