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
public final class CircleNotificationsKt {
    private static ImageVector _circleNotifications;

    public static final ImageVector getCircleNotifications(Icons.Filled filled) {
        ImageVector imageVector = _circleNotifications;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CircleNotifications", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 18.5f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 16.0f);
        pathBuilder.lineTo(7.0f, 16.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.lineToRelative(1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-2.61f);
        pathBuilder.curveTo(8.0f, 9.27f, 9.03f, 7.47f, 11.0f, 7.0f);
        pathBuilder.verticalLineToRelative(-0.5f);
        pathBuilder.curveToRelative(0.0f, -0.57f, 0.43f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.43f, 1.0f, 1.0f);
        pathBuilder.lineTo(13.0f, 7.0f);
        pathBuilder.curveToRelative(1.97f, 0.47f, 3.0f, 2.28f, 3.0f, 4.39f);
        pathBuilder.lineTo(16.0f, 14.0f);
        pathBuilder.lineToRelative(1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _circleNotifications = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
