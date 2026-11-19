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
public final class DeviceUnknownKt {
    private static ImageVector _deviceUnknown;

    public static final ImageVector getDeviceUnknown(Icons.TwoTone twoTone) {
        ImageVector imageVector = _deviceUnknown;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.DeviceUnknown", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.lineTo(17.0f, 5.0f);
        pathBuilder.lineTo(7.0f, 5.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 6.72f);
        pathBuilder.curveToRelative(1.96f, 0.0f, 3.5f, 1.51f, 3.5f, 3.47f);
        pathBuilder.curveToRelative(0.0f, 2.26f, -2.62f, 2.49f, -2.62f, 4.45f);
        pathBuilder.horizontalLineToRelative(-1.76f);
        pathBuilder.curveToRelative(0.0f, -2.88f, 2.63f, -2.7f, 2.63f, -4.45f);
        pathBuilder.curveToRelative(0.0f, -0.93f, -0.82f, -1.75f, -1.75f, -1.75f);
        pathBuilder.reflectiveCurveToRelative(-1.75f, 0.82f, -1.75f, 1.75f);
        pathBuilder.lineTo(8.5f, 10.19f);
        pathBuilder.curveToRelative(0.0f, -1.95f, 1.54f, -3.47f, 3.5f, -3.47f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(11.0f, 16.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.0f, 1.0f);
        pathBuilder2.lineTo(7.0f, 1.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(18.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(10.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.lineTo(19.0f, 3.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.0f, 19.0f);
        pathBuilder2.lineTo(7.0f, 19.0f);
        pathBuilder2.lineTo(7.0f, 5.0f);
        pathBuilder2.horizontalLineToRelative(10.0f);
        pathBuilder2.verticalLineToRelative(14.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 8.44f);
        pathBuilder2.curveToRelative(0.93f, 0.0f, 1.75f, 0.82f, 1.75f, 1.75f);
        pathBuilder2.curveToRelative(0.0f, 1.75f, -2.63f, 1.57f, -2.63f, 4.45f);
        pathBuilder2.horizontalLineToRelative(1.76f);
        pathBuilder2.curveToRelative(0.0f, -1.96f, 2.62f, -2.19f, 2.62f, -4.45f);
        pathBuilder2.curveToRelative(0.0f, -1.96f, -1.54f, -3.47f, -3.5f, -3.47f);
        pathBuilder2.reflectiveCurveToRelative(-3.5f, 1.52f, -3.5f, 3.47f);
        pathBuilder2.horizontalLineToRelative(1.75f);
        pathBuilder2.curveToRelative(0.0f, -0.93f, 0.82f, -1.75f, 1.75f, -1.75f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _deviceUnknown = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
