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
public final class SignalWifiConnectedNoInternet4Kt {
    private static ImageVector _signalWifiConnectedNoInternet4;

    public static final ImageVector getSignalWifiConnectedNoInternet4(Icons.TwoTone twoTone) {
        ImageVector imageVector = _signalWifiConnectedNoInternet4;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SignalWifiConnectedNoInternet4", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(24.0f, 8.98f);
        pathBuilder.curveTo(20.93f, 5.9f, 16.69f, 4.0f, 12.0f, 4.0f);
        pathBuilder.curveTo(7.31f, 4.0f, 3.07f, 5.9f, 0.0f, 8.98f);
        pathBuilder.lineTo(12.0f, 21.0f);
        pathBuilder.verticalLineToRelative(-9.0f);
        pathBuilder.horizontalLineToRelative(8.99f);
        pathBuilder.lineTo(24.0f, 8.98f);
        pathBuilder.close();
        pathBuilder.moveTo(19.59f, 14.0f);
        pathBuilder.lineToRelative(-2.09f, 2.09f);
        pathBuilder.lineToRelative(-0.3f, -0.3f);
        pathBuilder.lineTo(15.41f, 14.0f);
        pathBuilder.lineTo(14.0f, 15.41f);
        pathBuilder.lineToRelative(1.79f, 1.79f);
        pathBuilder.lineToRelative(0.3f, 0.3f);
        pathBuilder.lineTo(14.0f, 19.59f);
        pathBuilder.lineTo(15.41f, 21.0f);
        pathBuilder.lineToRelative(2.09f, -2.08f);
        pathBuilder.lineTo(19.59f, 21.0f);
        pathBuilder.lineTo(21.0f, 19.59f);
        pathBuilder.lineToRelative(-2.08f, -2.09f);
        pathBuilder.lineTo(21.0f, 15.41f);
        pathBuilder.lineTo(19.59f, 14.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signalWifiConnectedNoInternet4 = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
