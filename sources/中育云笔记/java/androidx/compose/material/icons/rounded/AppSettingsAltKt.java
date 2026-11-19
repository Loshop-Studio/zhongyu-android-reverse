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
public final class AppSettingsAltKt {
    private static ImageVector _appSettingsAlt;

    public static final ImageVector getAppSettingsAlt(Icons.Rounded rounded) {
        ImageVector imageVector = _appSettingsAlt;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AppSettingsAlt", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 18.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.lineTo(7.0f, 1.01f);
        pathBuilder.curveTo(5.9f, 1.01f, 5.0f, 1.9f, 5.0f, 3.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -0.13f, -0.02f, -0.26f, -0.04f, -0.39f);
        pathBuilder.lineToRelative(0.64f, -0.48f);
        pathBuilder.curveToRelative(0.2f, -0.15f, 0.26f, -0.44f, 0.13f, -0.66f);
        pathBuilder.lineToRelative(-0.57f, -0.96f);
        pathBuilder.curveToRelative(-0.13f, -0.21f, -0.39f, -0.3f, -0.62f, -0.2f);
        pathBuilder.lineToRelative(-0.72f, 0.3f);
        pathBuilder.curveToRelative(-0.2f, -0.15f, -0.42f, -0.29f, -0.65f, -0.39f);
        pathBuilder.lineToRelative(-0.1f, -0.77f);
        pathBuilder.curveToRelative(-0.03f, -0.25f, -0.24f, -0.43f, -0.49f, -0.44f);
        pathBuilder.lineToRelative(-1.12f, -0.02f);
        pathBuilder.curveToRelative(-0.26f, 0.0f, -0.47f, 0.18f, -0.5f, 0.44f);
        pathBuilder.lineToRelative(-0.1f, 0.79f);
        pathBuilder.curveToRelative(-0.24f, 0.1f, -0.45f, 0.23f, -0.65f, 0.39f);
        pathBuilder.lineToRelative(-0.72f, -0.3f);
        pathBuilder.curveToRelative(-0.23f, -0.1f, -0.5f, -0.01f, -0.62f, 0.2f);
        pathBuilder.lineToRelative(-0.57f, 0.96f);
        pathBuilder.curveToRelative(-0.13f, 0.22f, -0.08f, 0.5f, 0.13f, 0.66f);
        pathBuilder.lineToRelative(0.64f, 0.48f);
        pathBuilder.curveTo(15.02f, 11.74f, 15.0f, 11.87f, 15.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 0.13f, 0.02f, 0.25f, 0.04f, 0.37f);
        pathBuilder.lineToRelative(-0.64f, 0.49f);
        pathBuilder.curveToRelative(-0.2f, 0.15f, -0.26f, 0.43f, -0.13f, 0.65f);
        pathBuilder.lineToRelative(0.56f, 0.97f);
        pathBuilder.curveToRelative(0.13f, 0.22f, 0.39f, 0.31f, 0.63f, 0.21f);
        pathBuilder.lineToRelative(0.73f, -0.31f);
        pathBuilder.curveToRelative(0.2f, 0.16f, 0.42f, 0.3f, 0.67f, 0.4f);
        pathBuilder.lineToRelative(0.1f, 0.77f);
        pathBuilder.curveToRelative(0.03f, 0.25f, 0.24f, 0.44f, 0.5f, 0.44f);
        pathBuilder.horizontalLineToRelative(1.12f);
        pathBuilder.curveToRelative(0.25f, 0.0f, 0.46f, -0.19f, 0.5f, -0.44f);
        pathBuilder.lineToRelative(0.1f, -0.77f);
        pathBuilder.curveToRelative(0.24f, -0.1f, 0.46f, -0.24f, 0.67f, -0.4f);
        pathBuilder.lineToRelative(0.73f, 0.31f);
        pathBuilder.curveToRelative(0.23f, 0.1f, 0.5f, 0.01f, 0.63f, -0.21f);
        pathBuilder.lineToRelative(0.56f, -0.97f);
        pathBuilder.curveToRelative(0.13f, -0.22f, 0.07f, -0.5f, -0.13f, -0.65f);
        pathBuilder.lineToRelative(-0.64f, -0.49f);
        pathBuilder.curveTo(20.98f, 12.25f, 21.0f, 12.13f, 21.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 13.5f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(18.83f, 13.5f, 18.0f, 13.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _appSettingsAlt = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
