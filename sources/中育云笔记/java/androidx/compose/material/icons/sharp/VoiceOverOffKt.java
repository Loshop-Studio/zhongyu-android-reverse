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
public final class VoiceOverOffKt {
    private static ImageVector _voiceOverOff;

    public static final ImageVector getVoiceOverOff(Icons.Sharp sharp) {
        ImageVector imageVector = _voiceOverOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.VoiceOverOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.76f, 5.36f);
        pathBuilder.lineToRelative(-1.68f, 1.69f);
        pathBuilder.curveToRelative(0.8f, 1.13f, 0.83f, 2.58f, 0.09f, 3.74f);
        pathBuilder.lineToRelative(1.7f, 1.7f);
        pathBuilder.curveToRelative(1.9f, -2.02f, 1.87f, -4.98f, -0.11f, -7.13f);
        pathBuilder.close();
        pathBuilder.moveTo(20.07f, 2.0f);
        pathBuilder.lineToRelative(-1.63f, 1.63f);
        pathBuilder.curveToRelative(2.72f, 2.97f, 2.76f, 7.39f, 0.14f, 10.56f);
        pathBuilder.lineToRelative(1.64f, 1.64f);
        pathBuilder.curveToRelative(3.74f, -3.89f, 3.71f, -9.84f, -0.15f, -13.83f);
        pathBuilder.close();
        pathBuilder.moveTo(9.43f, 5.04f);
        pathBuilder.lineToRelative(3.53f, 3.53f);
        pathBuilder.curveToRelative(-0.2f, -1.86f, -1.67f, -3.33f, -3.53f, -3.53f);
        pathBuilder.close();
        pathBuilder.moveTo(4.41f, 2.86f);
        pathBuilder.lineTo(3.0f, 4.27f);
        pathBuilder.lineToRelative(2.62f, 2.62f);
        pathBuilder.curveTo(5.23f, 7.5f, 5.0f, 8.22f, 5.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder.curveToRelative(0.78f, 0.0f, 1.5f, -0.23f, 2.11f, -0.62f);
        pathBuilder.lineToRelative(4.4f, 4.4f);
        pathBuilder.curveTo(13.74f, 15.6f, 10.78f, 15.0f, 9.0f, 15.0f);
        pathBuilder.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, -0.37f, -0.11f, -0.7f, -0.29f, -1.02f);
        pathBuilder.lineTo(19.73f, 21.0f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(4.41f, 2.86f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _voiceOverOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
