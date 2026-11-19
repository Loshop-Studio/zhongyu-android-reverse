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
public final class PhpKt {
    private static ImageVector _php;

    public static final ImageVector getPhp(Icons.Rounded rounded) {
        ImageVector imageVector = _php;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Php", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.5f, 10.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(10.5f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 10.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(10.5f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 12.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(1.75f);
        pathBuilder.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilder.reflectiveCurveTo(9.5f, 14.66f, 9.5f, 14.25f);
        pathBuilder.verticalLineToRelative(-4.5f);
        pathBuilder.curveTo(9.5f, 9.34f, 9.84f, 9.0f, 10.25f, 9.0f);
        pathBuilder.reflectiveCurveTo(11.0f, 9.34f, 11.0f, 9.75f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(9.75f);
        pathBuilder.curveTo(13.0f, 9.34f, 13.34f, 9.0f, 13.75f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder.verticalLineToRelative(4.5f);
        pathBuilder.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilder.reflectiveCurveTo(13.0f, 14.66f, 13.0f, 14.25f);
        pathBuilder.verticalLineTo(12.5f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 14.25f);
        pathBuilder.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilder.reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, 0.68f, 1.5f, 1.5f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.0f, 0.82f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(14.25f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 10.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(2.5f);
        pathBuilder.curveTo(7.33f, 9.0f, 8.0f, 9.68f, 8.0f, 10.5f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveTo(8.0f, 12.32f, 7.33f, 13.0f, 6.5f, 13.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(1.25f);
        pathBuilder.curveTo(4.5f, 14.66f, 4.16f, 15.0f, 3.75f, 15.0f);
        pathBuilder.reflectiveCurveTo(3.0f, 14.66f, 3.0f, 14.25f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _php = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
