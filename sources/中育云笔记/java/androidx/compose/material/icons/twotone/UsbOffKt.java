package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class UsbOffKt {
    private static ImageVector _usbOff;

    public static final ImageVector getUsbOff(Icons.TwoTone twoTone) {
        ImageVector imageVector = _usbOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.UsbOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, 0.34f, -0.08f, 0.66f, -0.23f, 0.94f);
        pathBuilder.lineTo(16.0f, 13.17f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 8.17f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineToRelative(-3.0f, -4.0f);
        pathBuilder.lineTo(9.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(8.17f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 16.0f);
        pathBuilder.verticalLineToRelative(2.28f);
        pathBuilder.curveToRelative(0.6f, 0.34f, 1.0f, 0.98f, 1.0f, 1.72f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -0.74f, 0.4f, -1.37f, 1.0f, -1.72f);
        pathBuilder.verticalLineTo(16.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.curveToRelative(-1.11f, 0.0f, -2.0f, -0.89f, -2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-2.28f);
        pathBuilder.curveTo(5.4f, 11.38f, 5.0f, 10.74f, 5.0f, 10.0f);
        pathBuilder.curveToRelative(0.0f, -0.59f, 0.26f, -1.13f, 0.68f, -1.49f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineToRelative(18.38f, 18.38f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineTo(13.17f, 16.0f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 14.0f);
        pathBuilder.verticalLineToRelative(-0.17f);
        pathBuilder.lineToRelative(-2.51f, -2.51f);
        pathBuilder.curveToRelative(-0.14f, 0.16f, -0.31f, 0.29f, -0.49f, 0.4f);
        pathBuilder.verticalLineTo(14.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _usbOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
