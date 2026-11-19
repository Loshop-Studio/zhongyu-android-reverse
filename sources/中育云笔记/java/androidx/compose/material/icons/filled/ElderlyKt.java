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
public final class ElderlyKt {
    private static ImageVector _elderly;

    public static final ImageVector getElderly(Icons.Filled filled) {
        ImageVector imageVector = _elderly;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Elderly", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.5f, 5.5f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(12.4f, 5.5f, 13.5f, 5.5f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 12.5f);
        pathBuilder.verticalLineTo(23.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineTo(12.5f);
        pathBuilder.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder.reflectiveCurveTo(18.0f, 12.22f, 18.0f, 12.5f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineToRelative(-0.69f);
        pathBuilder.curveToRelative(-1.46f, -0.38f, -2.7f, -1.29f, -3.51f, -2.52f);
        pathBuilder.curveTo(13.18f, 11.16f, 13.0f, 12.07f, 13.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, 0.23f, 0.02f, 0.46f, 0.03f, 0.69f);
        pathBuilder.lineTo(15.0f, 16.5f);
        pathBuilder.verticalLineTo(23.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-5.0f);
        pathBuilder.lineToRelative(-1.78f, -2.54f);
        pathBuilder.lineTo(11.0f, 19.0f);
        pathBuilder.lineToRelative(-3.0f, 4.0f);
        pathBuilder.lineToRelative(-1.6f, -1.2f);
        pathBuilder.lineTo(9.0f, 18.33f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.curveToRelative(0.0f, -1.15f, 0.18f, -2.29f, 0.5f, -3.39f);
        pathBuilder.lineTo(8.0f, 10.46f);
        pathBuilder.verticalLineTo(14.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineTo(9.3f);
        pathBuilder.lineToRelative(5.4f, -3.07f);
        pathBuilder.lineToRelative(0.0f, 0.01f);
        pathBuilder.curveToRelative(0.59f, -0.31f, 1.32f, -0.33f, 1.94f, 0.03f);
        pathBuilder.curveToRelative(0.36f, 0.21f, 0.63f, 0.51f, 0.8f, 0.85f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.lineToRelative(0.79f, 1.67f);
        pathBuilder.curveTo(15.58f, 10.1f, 16.94f, 11.0f, 18.5f, 11.0f);
        pathBuilder.curveTo(19.33f, 11.0f, 20.0f, 11.67f, 20.0f, 12.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _elderly = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
