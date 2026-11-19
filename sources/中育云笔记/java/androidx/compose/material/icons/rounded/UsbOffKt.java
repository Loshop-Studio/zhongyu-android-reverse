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
public final class UsbOffKt {
    private static ImageVector _usbOff;

    public static final ImageVector getUsbOff(Icons.Rounded rounded) {
        ImageVector imageVector = _usbOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.UsbOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.6f, 5.2f);
        pathBuilder.lineToRelative(2.0f, -2.67f);
        pathBuilder.curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0.0f);
        pathBuilder.lineToRelative(2.0f, 2.67f);
        pathBuilder.curveTo(14.65f, 5.53f, 14.41f, 6.0f, 14.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineToRelative(4.17f);
        pathBuilder.lineToRelative(-2.0f, -2.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.curveTo(9.59f, 6.0f, 9.35f, 5.53f, 9.6f, 5.2f);
        pathBuilder.close();
        pathBuilder.moveTo(15.5f, 12.0f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.verticalLineToRelative(1.17f);
        pathBuilder.lineToRelative(1.77f, 1.77f);
        pathBuilder.curveTo(17.91f, 14.66f, 18.0f, 14.34f, 18.0f, 14.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(0.5f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveTo(19.0f, 8.22f, 18.78f, 8.0f, 18.5f, 8.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.curveTo(15.22f, 8.0f, 15.0f, 8.22f, 15.0f, 8.5f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.curveTo(15.0f, 11.78f, 15.22f, 12.0f, 15.5f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.49f, 21.9f);
        pathBuilder.lineTo(20.49f, 21.9f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(-5.9f, -5.9f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.verticalLineToRelative(2.28f);
        pathBuilder.curveToRelative(0.6f, 0.34f, 1.0f, 0.98f, 1.0f, 1.72f);
        pathBuilder.curveToRelative(0.0f, 1.2f, -1.07f, 2.16f, -2.31f, 1.98f);
        pathBuilder.curveToRelative(-0.88f, -0.13f, -1.59f, -0.88f, -1.68f, -1.77f);
        pathBuilder.curveToRelative(-0.08f, -0.83f, 0.33f, -1.55f, 0.99f, -1.93f);
        pathBuilder.verticalLineTo(16.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-2.28f);
        pathBuilder.curveTo(5.4f, 11.38f, 5.0f, 10.74f, 5.0f, 10.0f);
        pathBuilder.curveToRelative(0.0f, -0.59f, 0.26f, -1.13f, 0.68f, -1.5f);
        pathBuilder.lineTo(2.1f, 4.93f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(16.97f, 16.97f);
        pathBuilder.curveTo(20.88f, 20.88f, 20.88f, 21.51f, 20.49f, 21.9f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 13.83f);
        pathBuilder.lineToRelative(-2.51f, -2.51f);
        pathBuilder.curveToRelative(-0.14f, 0.16f, -0.31f, 0.29f, -0.49f, 0.4f);
        pathBuilder.verticalLineTo(14.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineTo(13.83f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _usbOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
