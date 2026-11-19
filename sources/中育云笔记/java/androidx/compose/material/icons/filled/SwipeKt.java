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
public final class SwipeKt {
    private static ImageVector _swipe;

    public static final ImageVector getSwipe(Icons.Filled filled) {
        ImageVector imageVector = _swipe;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Swipe", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.89f, 14.75f);
        pathBuilder.lineToRelative(-4.09f, -2.04f);
        pathBuilder.curveToRelative(-0.28f, -0.14f, -0.58f, -0.21f, -0.89f, -0.21f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.curveTo(13.0f, 5.67f, 12.33f, 5.0f, 11.5f, 5.0f);
        pathBuilder.reflectiveCurveTo(10.0f, 5.67f, 10.0f, 6.5f);
        pathBuilder.verticalLineToRelative(10.74f);
        pathBuilder.lineTo(6.75f, 16.5f);
        pathBuilder.curveToRelative(-0.33f, -0.07f, -0.68f, 0.03f, -0.92f, 0.28f);
        pathBuilder.lineTo(5.0f, 17.62f);
        pathBuilder.lineToRelative(4.54f, 4.79f);
        pathBuilder.curveTo(9.92f, 22.79f, 10.68f, 23.0f, 11.21f, 23.0f);
        pathBuilder.horizontalLineToRelative(6.16f);
        pathBuilder.curveToRelative(1.0f, 0.0f, 1.84f, -0.73f, 1.98f, -1.72f);
        pathBuilder.lineToRelative(0.63f, -4.46f);
        pathBuilder.curveTo(20.1f, 15.97f, 19.66f, 15.14f, 18.89f, 14.75f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.13f, 3.87f);
        pathBuilder2.curveTo(18.69f, 2.17f, 15.6f, 1.0f, 12.0f, 1.0f);
        pathBuilder2.reflectiveCurveTo(5.31f, 2.17f, 3.87f, 3.87f);
        pathBuilder2.lineTo(2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(5.0f);
        pathBuilder2.horizontalLineToRelative(5.0f);
        pathBuilder2.lineTo(4.93f, 4.93f);
        pathBuilder2.curveToRelative(1.0f, -1.29f, 3.7f, -2.43f, 7.07f, -2.43f);
        pathBuilder2.reflectiveCurveToRelative(6.07f, 1.14f, 7.07f, 2.43f);
        pathBuilder2.lineTo(17.0f, 7.0f);
        pathBuilder2.horizontalLineToRelative(5.0f);
        pathBuilder2.verticalLineTo(2.0f);
        pathBuilder2.lineTo(20.13f, 3.87f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipe = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
