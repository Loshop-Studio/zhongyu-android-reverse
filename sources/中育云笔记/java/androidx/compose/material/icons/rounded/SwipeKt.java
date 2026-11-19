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
public final class SwipeKt {
    private static ImageVector _swipe;

    public static final ImageVector getSwipe(Icons.Rounded rounded) {
        ImageVector imageVector = _swipe;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Swipe", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.15f, 2.85f);
        pathBuilder.lineToRelative(-1.02f, 1.02f);
        pathBuilder.curveTo(18.69f, 2.17f, 15.6f, 1.0f, 12.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(5.31f, 2.17f, 3.87f, 3.87f);
        pathBuilder.lineTo(2.85f, 2.85f);
        pathBuilder.curveTo(2.54f, 2.54f, 2.0f, 2.76f, 2.0f, 3.21f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.curveTo(2.0f, 6.78f, 2.22f, 7.0f, 2.5f, 7.0f);
        pathBuilder.horizontalLineToRelative(3.29f);
        pathBuilder.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        pathBuilder.lineTo(4.93f, 4.93f);
        pathBuilder.curveToRelative(1.0f, -1.29f, 3.7f, -2.43f, 7.07f, -2.43f);
        pathBuilder.reflectiveCurveToRelative(6.07f, 1.14f, 7.07f, 2.43f);
        pathBuilder.lineToRelative(-1.22f, 1.22f);
        pathBuilder.curveTo(17.54f, 6.46f, 17.76f, 7.0f, 18.21f, 7.0f);
        pathBuilder.horizontalLineToRelative(3.29f);
        pathBuilder.curveTo(21.78f, 7.0f, 22.0f, 6.78f, 22.0f, 6.5f);
        pathBuilder.verticalLineTo(3.21f);
        pathBuilder.curveTo(22.0f, 2.76f, 21.46f, 2.54f, 21.15f, 2.85f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(14.5f, 12.71f);
        pathBuilder2.curveToRelative(-0.28f, -0.14f, -0.58f, -0.21f, -0.89f, -0.21f);
        pathBuilder2.horizontalLineTo(13.0f);
        pathBuilder2.verticalLineToRelative(-6.0f);
        pathBuilder2.curveTo(13.0f, 5.67f, 12.33f, 5.0f, 11.5f, 5.0f);
        pathBuilder2.reflectiveCurveTo(10.0f, 5.67f, 10.0f, 6.5f);
        pathBuilder2.verticalLineToRelative(10.74f);
        pathBuilder2.lineToRelative(-3.44f, -0.72f);
        pathBuilder2.curveToRelative(-0.37f, -0.08f, -0.76f, 0.04f, -1.03f, 0.31f);
        pathBuilder2.lineToRelative(0.0f, 0.0f);
        pathBuilder2.curveToRelative(-0.43f, 0.44f, -0.43f, 1.14f, 0.01f, 1.58f);
        pathBuilder2.lineToRelative(4.01f, 4.01f);
        pathBuilder2.curveTo(9.92f, 22.79f, 10.43f, 23.0f, 10.96f, 23.0f);
        pathBuilder2.horizontalLineToRelative(6.41f);
        pathBuilder2.curveToRelative(1.0f, 0.0f, 1.84f, -0.73f, 1.98f, -1.72f);
        pathBuilder2.lineToRelative(0.63f, -4.46f);
        pathBuilder2.curveToRelative(0.12f, -0.85f, -0.32f, -1.69f, -1.09f, -2.07f);
        pathBuilder2.lineTo(14.5f, 12.71f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipe = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
