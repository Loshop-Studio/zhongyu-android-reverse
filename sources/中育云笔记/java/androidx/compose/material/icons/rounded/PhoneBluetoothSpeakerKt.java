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
public final class PhoneBluetoothSpeakerKt {
    private static ImageVector _phoneBluetoothSpeaker;

    public static final ImageVector getPhoneBluetoothSpeaker(Icons.Rounded rounded) {
        ImageVector imageVector = _phoneBluetoothSpeaker;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PhoneBluetoothSpeaker", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.23f, 15.26f);
        pathBuilder.lineToRelative(-2.54f, -0.29f);
        pathBuilder.curveToRelative(-0.61f, -0.07f, -1.21f, 0.14f, -1.64f, 0.57f);
        pathBuilder.lineToRelative(-1.84f, 1.84f);
        pathBuilder.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        pathBuilder.lineToRelative(1.85f, -1.85f);
        pathBuilder.curveToRelative(0.43f, -0.43f, 0.64f, -1.03f, 0.57f, -1.64f);
        pathBuilder.lineToRelative(-0.29f, -2.52f);
        pathBuilder.curveToRelative(-0.12f, -1.01f, -0.97f, -1.77f, -1.99f, -1.77f);
        pathBuilder.lineTo(5.03f, 3.01f);
        pathBuilder.curveToRelative(-1.13f, 0.0f, -2.07f, 0.94f, -2.0f, 2.07f);
        pathBuilder.curveToRelative(0.53f, 8.54f, 7.36f, 15.36f, 15.89f, 15.89f);
        pathBuilder.curveToRelative(1.13f, 0.07f, 2.07f, -0.87f, 2.07f, -2.0f);
        pathBuilder.verticalLineToRelative(-1.73f);
        pathBuilder.curveToRelative(0.01f, -1.01f, -0.75f, -1.86f, -1.76f, -1.98f);
        pathBuilder.close();
        pathBuilder.moveTo(16.79f, 6.01f);
        pathBuilder.lineToRelative(-2.45f, 2.45f);
        pathBuilder.curveToRelative(-0.2f, 0.2f, -0.2f, 0.52f, 0.0f, 0.71f);
        pathBuilder.curveToRelative(0.2f, 0.2f, 0.52f, 0.2f, 0.71f, 0.0f);
        pathBuilder.lineTo(17.0f, 7.23f);
        pathBuilder.verticalLineToRelative(3.15f);
        pathBuilder.curveToRelative(0.0f, 0.2f, 0.12f, 0.39f, 0.31f, 0.47f);
        pathBuilder.curveToRelative(0.06f, 0.03f, 0.13f, 0.04f, 0.19f, 0.04f);
        pathBuilder.curveToRelative(0.13f, 0.0f, 0.26f, -0.05f, 0.36f, -0.15f);
        pathBuilder.lineToRelative(2.18f, -2.18f);
        pathBuilder.curveToRelative(0.2f, -0.2f, 0.2f, -0.52f, 0.0f, -0.71f);
        pathBuilder.lineToRelative(-1.83f, -1.83f);
        pathBuilder.lineToRelative(1.83f, -1.83f);
        pathBuilder.curveToRelative(0.09f, -0.09f, 0.15f, -0.22f, 0.15f, -0.36f);
        pathBuilder.reflectiveCurveToRelative(-0.05f, -0.26f, -0.15f, -0.36f);
        pathBuilder.lineToRelative(-2.18f, -2.18f);
        pathBuilder.curveToRelative(-0.14f, -0.14f, -0.36f, -0.19f, -0.55f, -0.11f);
        pathBuilder.curveToRelative(-0.19f, 0.08f, -0.31f, 0.26f, -0.31f, 0.46f);
        pathBuilder.verticalLineToRelative(3.15f);
        pathBuilder.lineToRelative(-1.95f, -1.95f);
        pathBuilder.curveToRelative(-0.2f, -0.2f, -0.52f, -0.2f, -0.71f, 0.0f);
        pathBuilder.curveToRelative(-0.2f, 0.2f, -0.2f, 0.52f, 0.0f, 0.71f);
        pathBuilder.lineToRelative(2.45f, 2.46f);
        pathBuilder.close();
        pathBuilder.moveTo(18.01f, 2.86f);
        pathBuilder.lineToRelative(0.96f, 0.96f);
        pathBuilder.lineToRelative(-0.96f, 0.96f);
        pathBuilder.lineTo(18.01f, 2.86f);
        pathBuilder.close();
        pathBuilder.moveTo(18.01f, 7.23f);
        pathBuilder.lineToRelative(0.96f, 0.96f);
        pathBuilder.lineToRelative(-0.96f, 0.96f);
        pathBuilder.lineTo(18.01f, 7.23f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneBluetoothSpeaker = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
