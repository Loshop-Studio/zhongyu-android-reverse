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
public final class AirplanemodeInactiveKt {
    private static ImageVector _airplanemodeInactive;

    public static final ImageVector getAirplanemodeInactive(Icons.Rounded rounded) {
        ImageVector imageVector = _airplanemodeInactive;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AirplanemodeInactive", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 14.6f);
        pathBuilder.curveToRelative(0.0f, 0.7f, -0.67f, 1.2f, -1.34f, 1.01f);
        pathBuilder.lineToRelative(-3.15f, -0.93f);
        pathBuilder.lineTo(10.5f, 7.67f);
        pathBuilder.verticalLineTo(3.5f);
        pathBuilder.curveTo(10.5f, 2.67f, 11.17f, 2.0f, 12.0f, 2.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.lineToRelative(7.98f, 4.7f);
        pathBuilder.curveTo(21.8f, 13.88f, 22.0f, 14.23f, 22.0f, 14.6f);
        pathBuilder.close();
        pathBuilder.moveTo(13.5f, 13.5f);
        pathBuilder.lineTo(9.56f, 9.56f);
        pathBuilder.lineTo(3.51f, 3.51f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(5.67f, 5.67f);
        pathBuilder.lineTo(2.52f, 13.7f);
        pathBuilder.curveTo(2.2f, 13.88f, 2.0f, 14.23f, 2.0f, 14.6f);
        pathBuilder.curveToRelative(0.0f, 0.7f, 0.67f, 1.2f, 1.34f, 1.01f);
        pathBuilder.lineToRelative(7.16f, -2.1f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.lineToRelative(-2.26f, 1.35f);
        pathBuilder.curveTo(8.09f, 20.44f, 8.0f, 20.61f, 8.0f, 20.78f);
        pathBuilder.lineToRelative(0.0f, 0.5f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.verticalLineToRelative(0.08f);
        pathBuilder.curveToRelative(0.0f, 0.33f, 0.31f, 0.57f, 0.62f, 0.49f);
        pathBuilder.lineToRelative(2.92f, -0.73f);
        pathBuilder.lineTo(12.0f, 21.0f);
        pathBuilder.lineToRelative(0.38f, 0.09f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder.lineToRelative(0.42f, 0.11f);
        pathBuilder.lineToRelative(1.9f, 0.48f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.lineToRelative(0.67f, 0.17f);
        pathBuilder.curveToRelative(0.32f, 0.08f, 0.62f, -0.16f, 0.62f, -0.49f);
        pathBuilder.verticalLineToRelative(-0.37f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder.verticalLineToRelative(-0.21f);
        pathBuilder.curveToRelative(0.0f, -0.18f, -0.09f, -0.34f, -0.24f, -0.43f);
        pathBuilder.lineTo(13.5f, 19.0f);
        pathBuilder.verticalLineToRelative(-2.67f);
        pathBuilder.lineToRelative(5.57f, 5.57f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineTo(13.5f, 13.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airplanemodeInactive = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
