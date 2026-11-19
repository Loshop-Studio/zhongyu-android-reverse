package androidx.compose.material.icons.sharp;

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
public final class PhoneBluetoothSpeakerKt {
    private static ImageVector _phoneBluetoothSpeaker;

    public static final ImageVector getPhoneBluetoothSpeaker(Icons.Sharp sharp) {
        ImageVector imageVector = _phoneBluetoothSpeaker;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PhoneBluetoothSpeaker", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.71f, 9.5f);
        pathBuilder.lineTo(17.0f, 7.21f);
        pathBuilder.lineTo(17.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(0.5f);
        pathBuilder.lineToRelative(2.85f, -2.85f);
        pathBuilder.lineTo(18.21f, 6.0f);
        pathBuilder.lineToRelative(2.15f, -2.15f);
        pathBuilder.lineTo(17.5f, 1.0f);
        pathBuilder.lineTo(17.0f, 1.0f);
        pathBuilder.verticalLineToRelative(3.79f);
        pathBuilder.lineTo(14.71f, 2.5f);
        pathBuilder.lineToRelative(-0.71f, 0.71f);
        pathBuilder.lineTo(16.79f, 6.0f);
        pathBuilder.lineTo(14.0f, 8.79f);
        pathBuilder.lineToRelative(0.71f, 0.71f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 2.91f);
        pathBuilder.lineToRelative(0.94f, 0.94f);
        pathBuilder.lineToRelative(-0.94f, 0.94f);
        pathBuilder.lineTo(18.0f, 2.91f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 7.21f);
        pathBuilder.lineToRelative(0.94f, 0.94f);
        pathBuilder.lineToRelative(-0.94f, 0.94f);
        pathBuilder.lineTo(18.0f, 7.21f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 15.46f);
        pathBuilder.lineToRelative(-5.27f, -0.61f);
        pathBuilder.lineToRelative(-2.52f, 2.52f);
        pathBuilder.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        pathBuilder.lineToRelative(2.53f, -2.53f);
        pathBuilder.lineTo(8.54f, 3.0f);
        pathBuilder.lineTo(3.03f, 3.0f);
        pathBuilder.curveTo(2.45f, 13.18f, 10.82f, 21.55f, 21.0f, 20.97f);
        pathBuilder.verticalLineToRelative(-5.51f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneBluetoothSpeaker = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
