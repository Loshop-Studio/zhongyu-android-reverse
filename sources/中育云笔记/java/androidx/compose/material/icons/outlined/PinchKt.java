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
public final class PinchKt {
    private static ImageVector _pinch;

    public static final ImageVector getPinch(Icons.Outlined outlined) {
        ImageVector imageVector = _pinch;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Pinch", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.0f, 2.5f);
        pathBuilder.verticalLineTo(1.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineTo(9.5f);
        pathBuilder.verticalLineTo(3.56f);
        pathBuilder.lineTo(3.56f, 9.5f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.verticalLineToRelative(2.44f);
        pathBuilder.lineTo(8.44f, 2.5f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.89f, 13.77f);
        pathBuilder.lineToRelative(-3.8f, -1.67f);
        pathBuilder.curveTo(17.96f, 12.04f, 17.81f, 12.0f, 17.65f, 12.0f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.verticalLineTo(7.5f);
        pathBuilder.curveTo(17.0f, 6.12f, 15.88f, 5.0f, 14.5f, 5.0f);
        pathBuilder.reflectiveCurveTo(12.0f, 6.12f, 12.0f, 7.5f);
        pathBuilder.verticalLineToRelative(8.15f);
        pathBuilder.lineToRelative(-1.87f, -0.4f);
        pathBuilder.curveToRelative(-0.19f, -0.03f, -1.02f, -0.15f, -1.73f, 0.56f);
        pathBuilder.lineTo(7.0f, 17.22f);
        pathBuilder.lineToRelative(5.12f, 5.19f);
        pathBuilder.curveTo(12.49f, 22.79f, 13.0f, 23.0f, 13.53f, 23.0f);
        pathBuilder.horizontalLineToRelative(6.55f);
        pathBuilder.curveToRelative(0.98f, 0.0f, 1.81f, -0.7f, 1.97f, -1.67f);
        pathBuilder.lineToRelative(0.92f, -5.44f);
        pathBuilder.curveTo(23.12f, 15.03f, 22.68f, 14.17f, 21.89f, 13.77f);
        pathBuilder.close();
        pathBuilder.moveTo(20.08f, 21.0f);
        pathBuilder.horizontalLineToRelative(-6.55f);
        pathBuilder.lineToRelative(-3.7f, -3.78f);
        pathBuilder.lineTo(14.0f, 18.11f);
        pathBuilder.verticalLineTo(7.5f);
        pathBuilder.curveTo(14.0f, 7.22f, 14.22f, 7.0f, 14.5f, 7.0f);
        pathBuilder.reflectiveCurveTo(15.0f, 7.22f, 15.0f, 7.5f);
        pathBuilder.verticalLineToRelative(6.18f);
        pathBuilder.horizontalLineToRelative(1.76f);
        pathBuilder.lineTo(21.0f, 15.56f);
        pathBuilder.lineTo(20.08f, 21.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pinch = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
