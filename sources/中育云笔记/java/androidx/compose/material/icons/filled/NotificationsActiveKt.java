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
public final class NotificationsActiveKt {
    private static ImageVector _notificationsActive;

    public static final ImageVector getNotificationsActive(Icons.Filled filled) {
        ImageVector imageVector = _notificationsActive;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NotificationsActive", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.58f, 4.08f);
        pathBuilder.lineTo(6.15f, 2.65f);
        pathBuilder.curveTo(3.75f, 4.48f, 2.17f, 7.3f, 2.03f, 10.5f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.15f, -2.65f, 1.51f, -4.97f, 3.55f, -6.42f);
        pathBuilder.close();
        pathBuilder.moveTo(19.97f, 10.5f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(-0.15f, -3.2f, -1.73f, -6.02f, -4.12f, -7.85f);
        pathBuilder.lineToRelative(-1.42f, 1.43f);
        pathBuilder.curveToRelative(2.02f, 1.45f, 3.39f, 3.77f, 3.54f, 6.42f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 11.0f);
        pathBuilder.curveToRelative(0.0f, -3.07f, -1.64f, -5.64f, -4.5f, -6.32f);
        pathBuilder.lineTo(13.5f, 4.0f);
        pathBuilder.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilder.verticalLineToRelative(0.68f);
        pathBuilder.curveTo(7.63f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.lineToRelative(-2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.lineToRelative(-2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 22.0f);
        pathBuilder.curveToRelative(0.14f, 0.0f, 0.27f, -0.01f, 0.4f, -0.04f);
        pathBuilder.curveToRelative(0.65f, -0.14f, 1.18f, -0.58f, 1.44f, -1.18f);
        pathBuilder.curveToRelative(0.1f, -0.24f, 0.15f, -0.5f, 0.15f, -0.78f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(0.01f, 1.1f, 0.9f, 2.0f, 2.01f, 2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notificationsActive = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
