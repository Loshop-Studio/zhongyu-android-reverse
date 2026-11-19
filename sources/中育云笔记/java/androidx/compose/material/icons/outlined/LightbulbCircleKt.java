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
public final class LightbulbCircleKt {
    private static ImageVector _lightbulbCircle;

    public static final ImageVector getLightbulbCircle(Icons.Outlined outlined) {
        ImageVector imageVector = _lightbulbCircle;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.LightbulbCircle", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveTo(16.41f, 20.0f, 12.0f, 20.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 19.0f);
        pathBuilder2.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder2.horizontalLineToRelative(-3.0f);
        pathBuilder2.curveTo(10.5f, 18.33f, 11.17f, 19.0f, 12.0f, 19.0f);
        pathBuilder2.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw3 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk83 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(9.0f, 15.0f);
        pathBuilder3.horizontalLineToRelative(6.0f);
        pathBuilder3.verticalLineToRelative(1.5f);
        pathBuilder3.horizontalLineToRelative(-6.0f);
        pathBuilder3.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw3, iM31241getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw4 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk84 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(12.0f, 5.0f);
        pathBuilder4.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder4.curveToRelative(0.0f, 1.64f, 0.8f, 3.09f, 2.03f, 4.0f);
        pathBuilder4.horizontalLineToRelative(5.95f);
        pathBuilder4.curveTo(16.2f, 13.09f, 17.0f, 11.64f, 17.0f, 10.0f);
        pathBuilder4.curveTo(17.0f, 7.24f, 14.76f, 5.0f, 12.0f, 5.0f);
        pathBuilder4.close();
        pathBuilder4.moveTo(14.43f, 12.5f);
        pathBuilder4.horizontalLineTo(9.57f);
        pathBuilder4.curveTo(8.89f, 11.84f, 8.5f, 10.95f, 8.5f, 10.0f);
        pathBuilder4.curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f);
        pathBuilder4.reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f);
        pathBuilder4.curveTo(15.5f, 10.95f, 15.11f, 11.84f, 14.43f, 12.5f);
        pathBuilder4.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw4, iM31241getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _lightbulbCircle = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
