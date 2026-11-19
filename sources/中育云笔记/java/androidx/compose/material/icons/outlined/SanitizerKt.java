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
public final class SanitizerKt {
    private static ImageVector _sanitizer;

    public static final ImageVector getSanitizer(Icons.Outlined outlined) {
        ImageVector imageVector = _sanitizer;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Sanitizer", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.5f, 6.5f);
        pathBuilder.curveTo(15.5f, 5.66f, 17.0f, 4.0f, 17.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 1.66f, 1.5f, 2.5f);
        pathBuilder.curveTo(18.5f, 7.33f, 17.83f, 8.0f, 17.0f, 8.0f);
        pathBuilder.reflectiveCurveTo(15.5f, 7.33f, 15.5f, 6.5f);
        pathBuilder.close();
        pathBuilder.moveTo(19.5f, 15.0f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilder.curveToRelative(0.0f, -1.67f, -2.5f, -4.5f, -2.5f, -4.5f);
        pathBuilder.reflectiveCurveTo(17.0f, 10.83f, 17.0f, 12.5f);
        pathBuilder.curveTo(17.0f, 13.88f, 18.12f, 15.0f, 19.5f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 12.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.curveToRelative(0.0f, -2.97f, 2.16f, -5.43f, 5.0f, -5.91f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.curveToRelative(1.13f, 0.0f, 2.15f, 0.39f, 2.99f, 1.01f);
        pathBuilder.lineToRelative(-1.43f, 1.43f);
        pathBuilder.curveTo(14.1f, 4.17f, 13.57f, 4.0f, 13.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.09f);
        pathBuilder.curveTo(13.84f, 6.57f, 16.0f, 9.03f, 16.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sanitizer = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
