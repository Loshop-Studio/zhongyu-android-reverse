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
public final class ShutterSpeedKt {
    private static ImageVector _shutterSpeed;

    public static final ImageVector getShutterSpeed(Icons.Outlined outlined) {
        ImageVector imageVector = _shutterSpeed;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ShutterSpeed", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.0f, 1.0f);
        pathBuilder.lineTo(9.0f, 1.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.lineTo(15.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.03f, 7.39f);
        pathBuilder.lineToRelative(1.42f, -1.42f);
        pathBuilder.curveToRelative(-0.43f, -0.51f, -0.9f, -0.99f, -1.41f, -1.41f);
        pathBuilder.lineToRelative(-1.42f, 1.42f);
        pathBuilder.curveTo(16.07f, 4.74f, 14.12f, 4.0f, 12.0f, 4.0f);
        pathBuilder.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(4.02f, 9.0f, 9.0f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(9.0f, -4.03f, 9.0f, -9.0f);
        pathBuilder.curveToRelative(0.0f, -2.12f, -0.74f, -4.07f, -1.97f, -5.61f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        pathBuilder.reflectiveCurveToRelative(3.13f, -7.0f, 7.0f, -7.0f);
        pathBuilder.reflectiveCurveToRelative(7.0f, 3.13f, 7.0f, 7.0f);
        pathBuilder.reflectiveCurveToRelative(-3.13f, 7.0f, -7.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.68f, 15.0f);
        pathBuilder.lineTo(6.35f, 15.0f);
        pathBuilder.curveToRelative(0.57f, 1.62f, 1.82f, 2.92f, 3.41f, 3.56f);
        pathBuilder.lineToRelative(-0.11f, -0.06f);
        pathBuilder.lineToRelative(2.03f, -3.5f);
        pathBuilder.close();
        pathBuilder.moveTo(17.65f, 11.0f);
        pathBuilder.curveToRelative(-0.57f, -1.6f, -1.78f, -2.89f, -3.34f, -3.54f);
        pathBuilder.lineTo(12.26f, 11.0f);
        pathBuilder.horizontalLineToRelative(5.39f);
        pathBuilder.close();
        pathBuilder.moveTo(10.61f, 18.83f);
        pathBuilder.curveToRelative(0.45f, 0.11f, 0.91f, 0.17f, 1.39f, 0.17f);
        pathBuilder.curveToRelative(1.34f, 0.0f, 2.57f, -0.45f, 3.57f, -1.19f);
        pathBuilder.lineToRelative(-2.11f, -3.9f);
        pathBuilder.lineToRelative(-2.85f, 4.92f);
        pathBuilder.close();
        pathBuilder.moveTo(7.55f, 8.99f);
        pathBuilder.curveTo(6.59f, 10.05f, 6.0f, 11.46f, 6.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, 0.34f, 0.04f, 0.67f, 0.09f, 1.0f);
        pathBuilder.horizontalLineToRelative(4.72f);
        pathBuilder.lineTo(7.55f, 8.99f);
        pathBuilder.close();
        pathBuilder.moveTo(16.34f, 17.13f);
        pathBuilder.curveTo(17.37f, 16.06f, 18.0f, 14.6f, 18.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, -0.34f, -0.04f, -0.67f, -0.09f, -1.0f);
        pathBuilder.horizontalLineToRelative(-4.34f);
        pathBuilder.lineToRelative(2.77f, 5.13f);
        pathBuilder.close();
        pathBuilder.moveTo(13.33f, 7.15f);
        pathBuilder.curveTo(12.9f, 7.06f, 12.46f, 7.0f, 12.0f, 7.0f);
        pathBuilder.curveToRelative(-1.4f, 0.0f, -2.69f, 0.49f, -3.71f, 1.29f);
        pathBuilder.lineToRelative(2.32f, 3.56f);
        pathBuilder.lineToRelative(2.72f, -4.7f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shutterSpeed = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
