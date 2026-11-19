package androidx.compose.material.icons.sharp;

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
public final class ColorLensKt {
    private static ImageVector _colorLens;

    public static final ImageVector getColorLens(Icons.Sharp sharp) {
        ImageVector imageVector = _colorLens;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ColorLens", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 3.0f);
        pathBuilder.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(4.03f, 9.0f, 9.0f, 9.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.curveToRelative(0.0f, -0.39f, -0.15f, -0.74f, -0.39f, -1.01f);
        pathBuilder.curveToRelative(-0.23f, -0.26f, -0.38f, -0.61f, -0.38f, -0.99f);
        pathBuilder.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.lineTo(16.0f, 16.0f);
        pathBuilder.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilder.curveToRelative(0.0f, -4.42f, -4.03f, -8.0f, -9.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.5f, 12.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(5.67f, 9.0f, 6.5f, 9.0f);
        pathBuilder.reflectiveCurveTo(8.0f, 9.67f, 8.0f, 10.5f);
        pathBuilder.reflectiveCurveTo(7.33f, 12.0f, 6.5f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.5f, 8.0f);
        pathBuilder.curveTo(8.67f, 8.0f, 8.0f, 7.33f, 8.0f, 6.5f);
        pathBuilder.reflectiveCurveTo(8.67f, 5.0f, 9.5f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(10.33f, 8.0f, 9.5f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.5f, 8.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(13.67f, 5.0f, 14.5f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(15.33f, 8.0f, 14.5f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.5f, 12.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(16.67f, 9.0f, 17.5f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _colorLens = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
