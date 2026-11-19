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
public final class CoffeeKt {
    private static ImageVector _coffee;

    public static final ImageVector getCoffee(Icons.TwoTone twoTone) {
        ImageVector imageVector = _coffee;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Coffee", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.0f, 11.0f);
        pathBuilder.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(4.0f, 19.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(-16.0f);
        pathBuilder2.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw3 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk83 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(18.5f, 3.0f);
        pathBuilder3.horizontalLineTo(6.0f);
        pathBuilder3.curveTo(4.9f, 3.0f, 4.0f, 3.9f, 4.0f, 5.0f);
        pathBuilder3.verticalLineToRelative(5.71f);
        pathBuilder3.curveToRelative(0.0f, 3.83f, 2.95f, 7.18f, 6.78f, 7.29f);
        pathBuilder3.curveToRelative(3.96f, 0.12f, 7.22f, -3.06f, 7.22f, -7.0f);
        pathBuilder3.verticalLineToRelative(-1.0f);
        pathBuilder3.horizontalLineToRelative(0.5f);
        pathBuilder3.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder3.reflectiveCurveTo(20.43f, 3.0f, 18.5f, 3.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(16.0f, 11.0f);
        pathBuilder3.curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f);
        pathBuilder3.reflectiveCurveToRelative(-5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilder3.verticalLineToRelative(-1.0f);
        pathBuilder3.horizontalLineToRelative(10.0f);
        pathBuilder3.verticalLineTo(11.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(16.0f, 8.0f);
        pathBuilder3.horizontalLineTo(6.0f);
        pathBuilder3.verticalLineTo(5.0f);
        pathBuilder3.horizontalLineToRelative(10.0f);
        pathBuilder3.verticalLineTo(8.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(18.5f, 8.0f);
        pathBuilder3.horizontalLineTo(18.0f);
        pathBuilder3.verticalLineTo(5.0f);
        pathBuilder3.horizontalLineToRelative(0.5f);
        pathBuilder3.curveTo(19.33f, 5.0f, 20.0f, 5.67f, 20.0f, 6.5f);
        pathBuilder3.reflectiveCurveTo(19.33f, 8.0f, 18.5f, 8.0f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw3, iM31241getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _coffee = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
