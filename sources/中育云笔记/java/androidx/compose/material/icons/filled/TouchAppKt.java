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
public final class TouchAppKt {
    private static ImageVector _touchApp;

    public static final ImageVector getTouchApp(Icons.Filled filled) {
        ImageVector imageVector = _touchApp;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.TouchApp", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 11.24f);
        pathBuilder.verticalLineTo(7.5f);
        pathBuilder.curveTo(9.0f, 6.12f, 10.12f, 5.0f, 11.5f, 5.0f);
        pathBuilder.reflectiveCurveTo(14.0f, 6.12f, 14.0f, 7.5f);
        pathBuilder.verticalLineToRelative(3.74f);
        pathBuilder.curveToRelative(1.21f, -0.81f, 2.0f, -2.18f, 2.0f, -3.74f);
        pathBuilder.curveTo(16.0f, 5.01f, 13.99f, 3.0f, 11.5f, 3.0f);
        pathBuilder.reflectiveCurveTo(7.0f, 5.01f, 7.0f, 7.5f);
        pathBuilder.curveTo(7.0f, 9.06f, 7.79f, 10.43f, 9.0f, 11.24f);
        pathBuilder.close();
        pathBuilder.moveTo(18.84f, 15.87f);
        pathBuilder.lineToRelative(-4.54f, -2.26f);
        pathBuilder.curveToRelative(-0.17f, -0.07f, -0.35f, -0.11f, -0.54f, -0.11f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.curveTo(13.0f, 6.67f, 12.33f, 6.0f, 11.5f, 6.0f);
        pathBuilder.reflectiveCurveTo(10.0f, 6.67f, 10.0f, 7.5f);
        pathBuilder.verticalLineToRelative(10.74f);
        pathBuilder.curveToRelative(-3.6f, -0.76f, -3.54f, -0.75f, -3.67f, -0.75f);
        pathBuilder.curveToRelative(-0.31f, 0.0f, -0.59f, 0.13f, -0.79f, 0.33f);
        pathBuilder.lineToRelative(-0.79f, 0.8f);
        pathBuilder.lineToRelative(4.94f, 4.94f);
        pathBuilder.curveTo(9.96f, 23.83f, 10.34f, 24.0f, 10.75f, 24.0f);
        pathBuilder.horizontalLineToRelative(6.79f);
        pathBuilder.curveToRelative(0.75f, 0.0f, 1.33f, -0.55f, 1.44f, -1.28f);
        pathBuilder.lineToRelative(0.75f, -5.27f);
        pathBuilder.curveToRelative(0.01f, -0.07f, 0.02f, -0.14f, 0.02f, -0.2f);
        pathBuilder.curveTo(19.75f, 16.63f, 19.37f, 16.09f, 18.84f, 15.87f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _touchApp = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
