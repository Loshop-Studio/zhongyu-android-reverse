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
public final class BluetoothConnectedKt {
    private static ImageVector _bluetoothConnected;

    public static final ImageVector getBluetoothConnected(Icons.Rounded rounded) {
        ImageVector imageVector = _bluetoothConnected;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BluetoothConnected", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.0f, 13.0f);
        pathBuilder.curveToRelative(0.55f, -0.55f, 0.55f, -1.44f, 0.0f, -1.99f);
        pathBuilder.lineTo(6.0f, 11.0f);
        pathBuilder.curveToRelative(-0.55f, -0.55f, -1.45f, -0.55f, -2.0f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(-0.55f, 1.45f, 0.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(1.45f, 0.55f, 2.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 11.0f);
        pathBuilder.curveToRelative(-0.56f, -0.56f, -1.45f, -0.56f, -2.0f, -0.01f);
        pathBuilder.lineTo(18.0f, 11.0f);
        pathBuilder.curveToRelative(-0.55f, 0.55f, -0.55f, 1.44f, 0.0f, 1.99f);
        pathBuilder.lineTo(18.0f, 13.0f);
        pathBuilder.curveToRelative(0.55f, 0.55f, 1.44f, 0.55f, 1.99f, 0.0f);
        pathBuilder.lineTo(20.0f, 13.0f);
        pathBuilder.curveToRelative(0.55f, -0.55f, 0.55f, -1.45f, 0.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 7.0f);
        pathBuilder.lineToRelative(-4.29f, -4.29f);
        pathBuilder.curveToRelative(-0.63f, -0.63f, -1.71f, -0.19f, -1.71f, 0.7f);
        pathBuilder.verticalLineToRelative(6.18f);
        pathBuilder.lineTo(7.11f, 5.7f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineTo(10.59f, 12.0f);
        pathBuilder.lineTo(5.7f, 16.89f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineTo(11.0f, 14.41f);
        pathBuilder.verticalLineToRelative(6.18f);
        pathBuilder.curveToRelative(0.0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f);
        pathBuilder.lineTo(17.0f, 17.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.42f);
        pathBuilder.lineTo(13.41f, 12.0f);
        pathBuilder.lineTo(17.0f, 8.42f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f);
        pathBuilder.close();
        pathBuilder.moveTo(14.88f, 16.29f);
        pathBuilder.lineTo(13.0f, 18.17f);
        pathBuilder.verticalLineToRelative(-3.76f);
        pathBuilder.lineToRelative(1.88f, 1.88f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 9.59f);
        pathBuilder.lineTo(13.0f, 5.83f);
        pathBuilder.lineToRelative(1.88f, 1.88f);
        pathBuilder.lineTo(13.0f, 9.59f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bluetoothConnected = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
