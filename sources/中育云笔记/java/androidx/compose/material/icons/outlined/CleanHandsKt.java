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
public final class CleanHandsKt {
    private static ImageVector _cleanHands;

    public static final ImageVector getCleanHands(Icons.Outlined outlined) {
        ImageVector imageVector = _cleanHands;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.CleanHands", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.99f, 5.0f);
        pathBuilder.lineToRelative(0.63f, 1.37f);
        pathBuilder.lineTo(18.99f, 7.0f);
        pathBuilder.lineToRelative(-1.37f, 0.63f);
        pathBuilder.lineTo(16.99f, 9.0f);
        pathBuilder.lineToRelative(-0.63f, -1.37f);
        pathBuilder.lineTo(14.99f, 7.0f);
        pathBuilder.lineToRelative(1.37f, -0.63f);
        pathBuilder.lineTo(16.99f, 5.0f);
        pathBuilder.moveTo(20.0f, 14.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -2.0f, -4.0f, -2.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 2.9f, -2.0f, 4.0f);
        pathBuilder.curveTo(18.0f, 13.1f, 18.9f, 14.0f, 20.0f, 14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 6.1f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.57f, 0.0f, 1.1f, 0.17f, 1.55f, 0.45f);
        pathBuilder.lineToRelative(1.43f, -1.43f);
        pathBuilder.curveTo(15.15f, 2.39f, 14.13f, 2.0f, 13.0f, 2.0f);
        pathBuilder.curveToRelative(-1.47f, 0.0f, -5.44f, 0.0f, -5.5f, 0.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.verticalLineToRelative(2.11f);
        pathBuilder.curveTo(7.22f, 6.48f, 5.8f, 7.79f, 5.25f, 9.5f);
        pathBuilder.horizontalLineToRelative(2.16f);
        pathBuilder.curveTo(7.94f, 8.61f, 8.89f, 8.0f, 10.0f, 8.0f);
        pathBuilder.curveToRelative(1.62f, 0.0f, 2.94f, 1.29f, 2.99f, 2.9f);
        pathBuilder.lineTo(15.0f, 11.65f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.curveTo(15.0f, 8.58f, 13.28f, 6.56f, 11.0f, 6.1f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 19.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.lineToRelative(-8.0f, 2.5f);
        pathBuilder.lineToRelative(-7.0f, -1.94f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineToRelative(7.97f);
        pathBuilder.lineToRelative(6.16f, 2.3f);
        pathBuilder.curveTo(16.25f, 13.72f, 17.0f, 14.8f, 17.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveTo(20.66f, 16.0f, 22.0f, 17.34f, 22.0f, 19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 20.0f);
        pathBuilder.verticalLineToRelative(-7.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.9f, 18.57f);
        pathBuilder.curveToRelative(-0.16f, -0.33f, -0.51f, -0.56f, -0.9f, -0.56f);
        pathBuilder.horizontalLineToRelative(-5.35f);
        pathBuilder.curveToRelative(-0.54f, 0.0f, -1.07f, -0.09f, -1.58f, -0.26f);
        pathBuilder.lineToRelative(-2.38f, -0.79f);
        pathBuilder.lineToRelative(0.63f, -1.9f);
        pathBuilder.lineToRelative(2.38f, 0.79f);
        pathBuilder.curveTo(13.01f, 15.95f, 15.0f, 16.0f, 15.0f, 16.0f);
        pathBuilder.curveToRelative(0.0f, -0.37f, -0.23f, -0.7f, -0.57f, -0.83f);
        pathBuilder.lineTo(8.61f, 13.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(5.48f);
        pathBuilder.lineToRelative(6.97f, 1.93f);
        pathBuilder.lineTo(19.9f, 18.57f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cleanHands = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
