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
public final class SocialDistanceKt {
    private static ImageVector _socialDistance;

    public static final ImageVector getSocialDistance(Icons.Rounded rounded) {
        ImageVector imageVector = _socialDistance;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SocialDistance", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(4.0f, 6.1f, 4.0f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.78f, 8.58f);
        pathBuilder.curveTo(7.93f, 8.21f, 6.99f, 8.0f, 6.0f, 8.0f);
        pathBuilder.reflectiveCurveTo(4.07f, 8.21f, 3.22f, 8.58f);
        pathBuilder.curveTo(2.48f, 8.9f, 2.0f, 9.62f, 2.0f, 10.43f);
        pathBuilder.lineTo(2.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.lineToRelative(0.0f, -0.57f);
        pathBuilder.curveTo(10.0f, 9.62f, 9.52f, 8.9f, 8.78f, 8.58f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 7.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.curveTo(16.0f, 6.1f, 16.9f, 7.0f, 18.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.78f, 8.58f);
        pathBuilder.curveTo(19.93f, 8.21f, 18.99f, 8.0f, 18.0f, 8.0f);
        pathBuilder.curveToRelative(-0.99f, 0.0f, -1.93f, 0.21f, -2.78f, 0.58f);
        pathBuilder.curveTo(14.48f, 8.9f, 14.0f, 9.62f, 14.0f, 10.43f);
        pathBuilder.lineTo(14.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.lineToRelative(0.0f, -0.57f);
        pathBuilder.curveTo(22.0f, 9.62f, 21.52f, 8.9f, 20.78f, 8.58f);
        pathBuilder.close();
        pathBuilder.moveTo(21.65f, 16.65f);
        pathBuilder.lineToRelative(-2.79f, -2.79f);
        pathBuilder.curveTo(18.54f, 13.54f, 18.0f, 13.76f, 18.0f, 14.21f);
        pathBuilder.verticalLineTo(16.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineToRelative(-1.79f);
        pathBuilder.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        pathBuilder.lineToRelative(-2.79f, 2.79f);
        pathBuilder.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder.lineToRelative(2.79f, 2.79f);
        pathBuilder.curveTo(5.46f, 20.46f, 6.0f, 20.24f, 6.0f, 19.79f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(1.79f);
        pathBuilder.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        pathBuilder.lineToRelative(2.79f, -2.79f);
        pathBuilder.curveTo(21.84f, 17.16f, 21.84f, 16.84f, 21.65f, 16.65f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _socialDistance = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
