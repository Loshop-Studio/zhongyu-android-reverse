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
public final class MosqueKt {
    private static ImageVector _mosque;

    public static final ImageVector getMosque(Icons.Filled filled) {
        ImageVector imageVector = _mosque;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Mosque", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.curveToRelative(0.29f, 0.0f, 0.57f, 0.06f, 0.84f, 0.13f);
        pathBuilder.curveTo(17.93f, 7.8f, 18.0f, 7.46f, 18.0f, 7.09f);
        pathBuilder.curveToRelative(0.0f, -1.31f, -0.65f, -2.53f, -1.74f, -3.25f);
        pathBuilder.lineTo(12.0f, 1.0f);
        pathBuilder.lineTo(7.74f, 3.84f);
        pathBuilder.curveTo(6.65f, 4.56f, 6.0f, 5.78f, 6.0f, 7.09f);
        pathBuilder.curveTo(6.0f, 7.46f, 6.07f, 7.8f, 6.16f, 8.13f);
        pathBuilder.curveTo(6.43f, 8.06f, 6.71f, 8.0f, 7.0f, 8.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(24.0f, 7.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, -2.0f, -3.0f, -2.0f, -3.0f);
        pathBuilder2.reflectiveCurveToRelative(-2.0f, 1.9f, -2.0f, 3.0f);
        pathBuilder2.curveToRelative(0.0f, 0.74f, 0.4f, 1.38f, 1.0f, 1.72f);
        pathBuilder2.verticalLineTo(13.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.horizontalLineTo(7.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineTo(3.0f);
        pathBuilder2.verticalLineTo(8.72f);
        pathBuilder2.curveTo(3.6f, 8.38f, 4.0f, 7.74f, 4.0f, 7.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, -2.0f, -3.0f, -2.0f, -3.0f);
        pathBuilder2.reflectiveCurveTo(0.0f, 5.9f, 0.0f, 7.0f);
        pathBuilder2.curveToRelative(0.0f, 0.74f, 0.4f, 1.38f, 1.0f, 1.72f);
        pathBuilder2.verticalLineTo(21.0f);
        pathBuilder2.horizontalLineToRelative(9.0f);
        pathBuilder2.verticalLineToRelative(-4.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder2.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(4.0f);
        pathBuilder2.horizontalLineToRelative(9.0f);
        pathBuilder2.verticalLineTo(8.72f);
        pathBuilder2.curveTo(23.6f, 8.38f, 24.0f, 7.74f, 24.0f, 7.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mosque = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
