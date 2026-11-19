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
public final class BluetoothKt {
    private static ImageVector _bluetooth;

    public static final ImageVector getBluetooth(Icons.TwoTone twoTone) {
        ImageVector imageVector = _bluetooth;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Bluetooth", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.71f, 7.71f);
        pathBuilder.lineTo(12.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineToRelative(7.59f);
        pathBuilder.lineTo(6.41f, 5.0f);
        pathBuilder.lineTo(5.0f, 6.41f);
        pathBuilder.lineTo(10.59f, 12.0f);
        pathBuilder.lineTo(5.0f, 17.59f);
        pathBuilder.lineTo(6.41f, 19.0f);
        pathBuilder.lineTo(11.0f, 14.41f);
        pathBuilder.lineTo(11.0f, 22.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.lineToRelative(5.71f, -5.71f);
        pathBuilder.lineToRelative(-4.3f, -4.29f);
        pathBuilder.lineToRelative(4.3f, -4.29f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 5.83f);
        pathBuilder.lineToRelative(1.88f, 1.88f);
        pathBuilder.lineTo(13.0f, 9.59f);
        pathBuilder.lineTo(13.0f, 5.83f);
        pathBuilder.close();
        pathBuilder.moveTo(14.88f, 16.29f);
        pathBuilder.lineTo(13.0f, 18.17f);
        pathBuilder.verticalLineToRelative(-3.76f);
        pathBuilder.lineToRelative(1.88f, 1.88f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bluetooth = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
