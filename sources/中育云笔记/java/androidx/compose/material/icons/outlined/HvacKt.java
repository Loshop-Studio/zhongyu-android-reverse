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
public final class HvacKt {
    private static ImageVector _hvac;

    public static final ImageVector getHvac(Icons.Outlined outlined) {
        ImageVector imageVector = _hvac;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Hvac", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 3.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 19.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 18.0f);
        pathBuilder2.curveToRelative(3.31f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f);
        pathBuilder2.reflectiveCurveToRelative(-2.69f, -6.0f, -6.0f, -6.0f);
        pathBuilder2.reflectiveCurveToRelative(-6.0f, 2.69f, -6.0f, 6.0f);
        pathBuilder2.reflectiveCurveTo(8.69f, 18.0f, 12.0f, 18.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.44f, 10.0f);
        pathBuilder2.curveToRelative(0.26f, 0.45f, 0.44f, 0.96f, 0.51f, 1.5f);
        pathBuilder2.horizontalLineToRelative(-7.9f);
        pathBuilder2.curveToRelative(0.07f, -0.54f, 0.24f, -1.05f, 0.51f, -1.5f);
        pathBuilder2.horizontalLineTo(15.44f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.95f, 12.5f);
        pathBuilder2.curveToRelative(-0.07f, 0.54f, -0.24f, 1.05f, -0.51f, 1.5f);
        pathBuilder2.horizontalLineTo(8.56f);
        pathBuilder2.curveToRelative(-0.26f, -0.45f, -0.44f, -0.96f, -0.51f, -1.5f);
        pathBuilder2.horizontalLineTo(15.95f);
        pathBuilder2.close();
        pathBuilder2.moveTo(9.38f, 15.0f);
        pathBuilder2.horizontalLineToRelative(5.24f);
        pathBuilder2.curveToRelative(-0.7f, 0.61f, -1.61f, 1.0f, -2.62f, 1.0f);
        pathBuilder2.reflectiveCurveTo(10.09f, 15.61f, 9.38f, 15.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.62f, 9.0f);
        pathBuilder2.horizontalLineTo(9.38f);
        pathBuilder2.curveToRelative(0.7f, -0.61f, 1.61f, -1.0f, 2.62f, -1.0f);
        pathBuilder2.reflectiveCurveTo(13.91f, 8.39f, 14.62f, 9.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hvac = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
