package androidx.compose.material.icons.outlined;

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
public final class SignalWifiConnectedNoInternet4Kt {
    private static ImageVector _signalWifiConnectedNoInternet4;

    public static final ImageVector getSignalWifiConnectedNoInternet4(Icons.Outlined outlined) {
        ImageVector imageVector = _signalWifiConnectedNoInternet4;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SignalWifiConnectedNoInternet4", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
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
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signalWifiConnectedNoInternet4 = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
