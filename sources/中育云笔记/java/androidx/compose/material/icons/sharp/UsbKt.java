package androidx.compose.material.icons.sharp;

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
public final class UsbKt {
    private static ImageVector _usb;

    public static final ImageVector getUsb(Icons.Sharp sharp) {
        ImageVector imageVector = _usb;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Usb", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.0f, 7.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineToRelative(-3.0f, -4.0f);
        pathBuilder.lineToRelative(-3.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineToRelative(-2.07f);
        pathBuilder.curveToRelative(0.7f, -0.37f, 1.2f, -1.08f, 1.2f, -1.93f);
        pathBuilder.curveToRelative(0.0f, -1.21f, -0.99f, -2.2f, -2.2f, -2.2f);
        pathBuilder.reflectiveCurveTo(4.8f, 7.79f, 4.8f, 9.0f);
        pathBuilder.curveToRelative(0.0f, 0.85f, 0.5f, 1.56f, 1.2f, 1.93f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(3.05f);
        pathBuilder.curveToRelative(-0.71f, 0.37f, -1.2f, 1.1f, -1.2f, 1.95f);
        pathBuilder.curveToRelative(0.0f, 1.22f, 0.99f, 2.2f, 2.2f, 2.2f);
        pathBuilder.reflectiveCurveToRelative(2.2f, -0.98f, 2.2f, -2.2f);
        pathBuilder.curveToRelative(0.0f, -0.85f, -0.49f, -1.58f, -1.2f, -1.95f);
        pathBuilder.verticalLineTo(15.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _usb = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
