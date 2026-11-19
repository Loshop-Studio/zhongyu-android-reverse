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
public final class NotificationsPausedKt {
    private static ImageVector _notificationsPaused;

    public static final ImageVector getNotificationsPaused(Icons.Rounded rounded) {
        ImageVector imageVector = _notificationsPaused;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NotificationsPaused", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 22.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.29f, 17.29f);
        pathBuilder.lineTo(18.0f, 16.0f);
        pathBuilder.verticalLineToRelative(-5.0f);
        pathBuilder.curveToRelative(0.0f, -3.07f, -1.64f, -5.64f, -4.5f, -6.32f);
        pathBuilder.lineTo(13.5f, 4.0f);
        pathBuilder.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilder.verticalLineToRelative(0.68f);
        pathBuilder.curveTo(7.63f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.lineToRelative(-1.29f, 1.29f);
        pathBuilder.curveToRelative(-0.63f, 0.63f, -0.19f, 1.71f, 0.7f, 1.71f);
        pathBuilder.horizontalLineToRelative(13.17f);
        pathBuilder.curveToRelative(0.9f, 0.0f, 1.34f, -1.08f, 0.71f, -1.71f);
        pathBuilder.close();
        pathBuilder.moveTo(14.5f, 9.33f);
        pathBuilder.curveToRelative(0.0f, 0.31f, -0.11f, 0.6f, -0.3f, 0.84f);
        pathBuilder.lineToRelative(-2.5f, 3.03f);
        pathBuilder.horizontalLineToRelative(1.9f);
        pathBuilder.curveToRelative(0.5f, 0.0f, 0.9f, 0.4f, 0.9f, 0.9f);
        pathBuilder.reflectiveCurveToRelative(-0.4f, 0.9f, -0.9f, 0.9f);
        pathBuilder.horizontalLineToRelative(-2.78f);
        pathBuilder.curveToRelative(-0.73f, 0.0f, -1.32f, -0.59f, -1.32f, -1.32f);
        pathBuilder.verticalLineToRelative(-0.01f);
        pathBuilder.curveToRelative(0.0f, -0.31f, 0.11f, -0.6f, 0.3f, -0.84f);
        pathBuilder.lineToRelative(2.5f, -3.03f);
        pathBuilder.horizontalLineToRelative(-1.9f);
        pathBuilder.curveToRelative(-0.5f, 0.0f, -0.9f, -0.4f, -0.9f, -0.9f);
        pathBuilder.reflectiveCurveToRelative(0.4f, -0.9f, 0.9f, -0.9f);
        pathBuilder.horizontalLineToRelative(2.78f);
        pathBuilder.curveToRelative(0.73f, 0.0f, 1.32f, 0.59f, 1.32f, 1.33f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notificationsPaused = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
