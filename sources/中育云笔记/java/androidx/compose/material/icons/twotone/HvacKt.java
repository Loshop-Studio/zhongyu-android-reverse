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
public final class HvacKt {
    private static ImageVector _hvac;

    public static final ImageVector getHvac(Icons.TwoTone twoTone) {
        ImageVector imageVector = _hvac;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Hvac", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 6.0f);
        pathBuilder.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilder.reflectiveCurveTo(8.69f, 6.0f, 12.0f, 6.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(19.0f, 3.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilder2.verticalLineToRelative(14.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(14.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.verticalLineTo(5.0f);
        pathBuilder2.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 19.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.verticalLineTo(5.0f);
        pathBuilder2.horizontalLineToRelative(14.0f);
        pathBuilder2.verticalLineTo(19.0f);
        pathBuilder2.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw3 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk83 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.0f, 18.0f);
        pathBuilder3.curveToRelative(3.31f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f);
        pathBuilder3.reflectiveCurveToRelative(-2.69f, -6.0f, -6.0f, -6.0f);
        pathBuilder3.reflectiveCurveToRelative(-6.0f, 2.69f, -6.0f, 6.0f);
        pathBuilder3.reflectiveCurveTo(8.69f, 18.0f, 12.0f, 18.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.0f, 16.0f);
        pathBuilder3.curveToRelative(-1.01f, 0.0f, -1.91f, -0.39f, -2.62f, -1.0f);
        pathBuilder3.horizontalLineToRelative(5.24f);
        pathBuilder3.curveTo(13.91f, 15.61f, 13.01f, 16.0f, 12.0f, 16.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.0f, 8.0f);
        pathBuilder3.curveToRelative(1.01f, 0.0f, 1.91f, 0.39f, 2.62f, 1.0f);
        pathBuilder3.horizontalLineTo(9.38f);
        pathBuilder3.curveTo(10.09f, 8.39f, 10.99f, 8.0f, 12.0f, 8.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(8.56f, 10.0f);
        pathBuilder3.horizontalLineToRelative(6.89f);
        pathBuilder3.curveToRelative(0.26f, 0.45f, 0.44f, 0.96f, 0.51f, 1.5f);
        pathBuilder3.horizontalLineToRelative(-7.9f);
        pathBuilder3.curveTo(8.12f, 10.96f, 8.29f, 10.45f, 8.56f, 10.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(15.95f, 12.5f);
        pathBuilder3.curveToRelative(-0.07f, 0.54f, -0.24f, 1.05f, -0.51f, 1.5f);
        pathBuilder3.horizontalLineTo(8.56f);
        pathBuilder3.curveToRelative(-0.26f, -0.45f, -0.44f, -0.96f, -0.51f, -1.5f);
        pathBuilder3.horizontalLineTo(15.95f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw3, iM31241getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hvac = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
