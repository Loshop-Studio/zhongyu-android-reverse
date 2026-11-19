package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class SwipeKt {
    private static ImageVector _swipe;

    public static final ImageVector getSwipe(Icons.TwoTone twoTone) {
        ImageVector imageVector = _swipe;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Swipe", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.13f, 3.87f);
        pathBuilder.curveTo(18.69f, 2.17f, 15.6f, 1.0f, 12.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(5.31f, 2.17f, 3.87f, 3.87f);
        pathBuilder.lineTo(2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.lineTo(4.93f, 4.93f);
        pathBuilder.curveToRelative(1.0f, -1.29f, 3.7f, -2.43f, 7.07f, -2.43f);
        pathBuilder.reflectiveCurveToRelative(6.07f, 1.14f, 7.07f, 2.43f);
        pathBuilder.lineTo(17.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.lineTo(20.13f, 3.87f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 13.68f);
        pathBuilder2.verticalLineTo(7.5f);
        pathBuilder2.curveTo(12.0f, 7.22f, 11.78f, 7.0f, 11.5f, 7.0f);
        pathBuilder2.reflectiveCurveTo(11.0f, 7.22f, 11.0f, 7.5f);
        pathBuilder2.verticalLineToRelative(10.61f);
        pathBuilder2.lineToRelative(-4.17f, -0.89f);
        pathBuilder2.lineToRelative(3.7f, 3.78f);
        pathBuilder2.horizontalLineToRelative(6.55f);
        pathBuilder2.lineTo(18.0f, 15.56f);
        pathBuilder2.lineToRelative(-4.24f, -1.89f);
        pathBuilder2.horizontalLineTo(12.0f);
        pathBuilder2.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw3 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk83 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(18.89f, 13.77f);
        pathBuilder3.lineToRelative(-3.8f, -1.67f);
        pathBuilder3.curveTo(14.96f, 12.04f, 14.81f, 12.0f, 14.65f, 12.0f);
        pathBuilder3.horizontalLineTo(14.0f);
        pathBuilder3.verticalLineTo(7.63f);
        pathBuilder3.curveToRelative(0.0f, -1.32f, -0.96f, -2.5f, -2.27f, -2.62f);
        pathBuilder3.curveTo(10.25f, 4.88f, 9.0f, 6.05f, 9.0f, 7.5f);
        pathBuilder3.verticalLineToRelative(8.15f);
        pathBuilder3.lineToRelative(-1.87f, -0.4f);
        pathBuilder3.curveToRelative(-0.19f, -0.03f, -1.02f, -0.15f, -1.73f, 0.56f);
        pathBuilder3.lineTo(4.0f, 17.22f);
        pathBuilder3.lineToRelative(5.12f, 5.19f);
        pathBuilder3.curveTo(9.49f, 22.79f, 10.0f, 23.0f, 10.53f, 23.0f);
        pathBuilder3.horizontalLineToRelative(6.55f);
        pathBuilder3.curveToRelative(0.98f, 0.0f, 1.81f, -0.7f, 1.97f, -1.67f);
        pathBuilder3.lineToRelative(0.92f, -5.44f);
        pathBuilder3.curveTo(20.12f, 15.03f, 19.68f, 14.17f, 18.89f, 13.77f);
        pathBuilder3.close();
        pathBuilder3.moveTo(17.08f, 21.0f);
        pathBuilder3.horizontalLineToRelative(-6.55f);
        pathBuilder3.lineToRelative(-3.7f, -3.78f);
        pathBuilder3.lineTo(11.0f, 18.11f);
        pathBuilder3.verticalLineTo(7.5f);
        pathBuilder3.curveTo(11.0f, 7.22f, 11.22f, 7.0f, 11.5f, 7.0f);
        pathBuilder3.reflectiveCurveTo(12.0f, 7.22f, 12.0f, 7.5f);
        pathBuilder3.verticalLineToRelative(6.18f);
        pathBuilder3.horizontalLineToRelative(1.76f);
        pathBuilder3.lineTo(18.0f, 15.56f);
        pathBuilder3.lineTo(17.08f, 21.0f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw3, iM31241getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipe = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
