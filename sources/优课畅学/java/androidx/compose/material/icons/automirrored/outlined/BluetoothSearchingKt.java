package androidx.compose.material.icons.automirrored.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.graphics.vector.PathBuilder;
import androidx.compose.p013ui.graphics.vector.VectorKt;
import androidx.compose.p013ui.unit.C3156Dp;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
public final class BluetoothSearchingKt {
    private static ImageVector _bluetoothSearching;

    public static final ImageVector getBluetoothSearching(Icons.AutoMirrored.Outlined outlined) {
        ImageVector imageVector = _bluetoothSearching;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Outlined.BluetoothSearching", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.24f, 12.01f);
        pathBuilder.lineToRelative(2.32f, 2.32f);
        pathBuilder.curveToRelative(0.28f, -0.72f, 0.44f, -1.51f, 0.44f, -2.33f);
        pathBuilder.reflectiveCurveToRelative(-0.16f, -1.59f, -0.43f, -2.31f);
        pathBuilder.lineToRelative(-2.33f, 2.32f);
        pathBuilder.close();
        pathBuilder.moveTo(19.53f, 6.71f);
        pathBuilder.lineToRelative(-1.26f, 1.26f);
        pathBuilder.curveToRelative(0.63f, 1.21f, 0.98f, 2.57f, 0.98f, 4.02f);
        pathBuilder.reflectiveCurveToRelative(-0.36f, 2.82f, -0.98f, 4.02f);
        pathBuilder.lineToRelative(1.2f, 1.2f);
        pathBuilder.curveToRelative(0.97f, -1.54f, 1.54f, -3.36f, 1.54f, -5.31f);
        pathBuilder.curveToRelative(-0.01f, -1.89f, -0.55f, -3.67f, -1.48f, -5.19f);
        pathBuilder.close();
        pathBuilder.moveTo(15.71f, 7.71f);
        pathBuilder.lineTo(10.0f, 2.0f);
        pathBuilder.lineTo(9.0f, 2.0f);
        pathBuilder.verticalLineToRelative(7.59f);
        pathBuilder.lineTo(4.41f, 5.0f);
        pathBuilder.lineTo(3.0f, 6.41f);
        pathBuilder.lineTo(8.59f, 12.0f);
        pathBuilder.lineTo(3.0f, 17.59f);
        pathBuilder.lineTo(4.41f, 19.0f);
        pathBuilder.lineTo(9.0f, 14.41f);
        pathBuilder.lineTo(9.0f, 22.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.lineToRelative(5.71f, -5.71f);
        pathBuilder.lineToRelative(-4.3f, -4.29f);
        pathBuilder.lineToRelative(4.3f, -4.29f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 5.83f);
        pathBuilder.lineToRelative(1.88f, 1.88f);
        pathBuilder.lineTo(11.0f, 9.59f);
        pathBuilder.lineTo(11.0f, 5.83f);
        pathBuilder.close();
        pathBuilder.moveTo(12.88f, 16.29f);
        pathBuilder.lineTo(11.0f, 18.17f);
        pathBuilder.verticalLineToRelative(-3.76f);
        pathBuilder.lineToRelative(1.88f, 1.88f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bluetoothSearching = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
