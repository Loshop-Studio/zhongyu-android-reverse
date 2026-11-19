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
public final class DeviceUnknownKt {
    private static ImageVector _deviceUnknown;

    public static final ImageVector getDeviceUnknown(Icons.Rounded rounded) {
        ImageVector imageVector = _deviceUnknown;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DeviceUnknown", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 1.0f);
        pathBuilder.lineTo(7.0f, 1.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineTo(19.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 19.0f);
        pathBuilder.lineTo(7.0f, 19.0f);
        pathBuilder.lineTo(7.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.52f, 10.19f);
        pathBuilder.horizontalLineToRelative(0.13f);
        pathBuilder.curveToRelative(0.33f, 0.0f, 0.59f, -0.23f, 0.7f, -0.54f);
        pathBuilder.curveToRelative(0.24f, -0.69f, 0.91f, -1.21f, 1.66f, -1.21f);
        pathBuilder.curveToRelative(0.93f, 0.0f, 1.75f, 0.82f, 1.75f, 1.75f);
        pathBuilder.curveToRelative(0.0f, 1.32f, -1.49f, 1.55f, -2.23f, 2.82f);
        pathBuilder.horizontalLineToRelative(-0.01f);
        pathBuilder.curveToRelative(-0.08f, 0.14f, -0.14f, 0.29f, -0.2f, 0.45f);
        pathBuilder.curveToRelative(-0.01f, 0.02f, -0.02f, 0.03f, -0.02f, 0.05f);
        pathBuilder.curveToRelative(-0.01f, 0.02f, -0.01f, 0.04f, -0.01f, 0.05f);
        pathBuilder.curveToRelative(-0.1f, 0.31f, -0.16f, 0.66f, -0.16f, 1.08f);
        pathBuilder.horizontalLineToRelative(1.76f);
        pathBuilder.curveToRelative(0.0f, -0.25f, 0.04f, -0.47f, 0.12f, -0.67f);
        pathBuilder.curveToRelative(0.54f, -1.47f, 2.77f, -1.86f, 2.48f, -4.18f);
        pathBuilder.curveToRelative(-0.19f, -1.55f, -1.43f, -2.84f, -2.98f, -3.04f);
        pathBuilder.curveToRelative(-1.77f, -0.23f, -3.29f, 0.78f, -3.81f, 2.3f);
        pathBuilder.curveToRelative(-0.2f, 0.56f, 0.23f, 1.14f, 0.82f, 1.14f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _deviceUnknown = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
