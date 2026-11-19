package androidx.compose.material.icons.filled;

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

    public static final ImageVector getVoiceOverOff(Icons.Filled filled) {
        ImageVector imageVector = _voiceOverOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.VoiceOverOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.99f, 9.18f);
        pathBuilder.curveToRelative(0.0f, -0.06f, 0.01f, -0.12f, 0.01f, -0.18f);
        pathBuilder.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder.curveToRelative(-0.06f, 0.0f, -0.12f, 0.01f, -0.18f, 0.01f);
        pathBuilder.lineToRelative(4.17f, 4.17f);
        pathBuilder.close();
        pathBuilder.moveTo(6.89f, 5.62f);
        pathBuilder.lineTo(4.27f, 3.0f);
        pathBuilder.lineTo(3.0f, 4.27f);
        pathBuilder.lineToRelative(2.62f, 2.62f);
        pathBuilder.curveTo(5.23f, 7.5f, 5.0f, 8.22f, 5.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder.curveToRelative(0.78f, 0.0f, 1.5f, -0.23f, 2.11f, -0.62f);
        pathBuilder.lineTo(19.73f, 21.0f);
        pathBuilder.lineTo(21.0f, 19.73f);
        pathBuilder.lineToRelative(-8.62f, -8.62f);
        pathBuilder.lineToRelative(-5.49f, -5.49f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 15.0f);
        pathBuilder.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.76f, 5.36f);
        pathBuilder.lineToRelative(-1.68f, 1.69f);
        pathBuilder.curveToRelative(0.84f, 1.18f, 0.84f, 2.71f, 0.0f, 3.89f);
        pathBuilder.lineToRelative(1.68f, 1.69f);
        pathBuilder.curveToRelative(2.02f, -2.02f, 2.02f, -5.07f, 0.0f, -7.27f);
        pathBuilder.close();
        pathBuilder.moveTo(20.07f, 2.0f);
        pathBuilder.lineToRelative(-1.63f, 1.63f);
        pathBuilder.curveToRelative(2.77f, 3.02f, 2.77f, 7.56f, 0.0f, 10.74f);
        pathBuilder.lineTo(20.07f, 16.0f);
        pathBuilder.curveToRelative(3.9f, -3.89f, 3.91f, -9.95f, 0.0f, -14.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _voiceOverOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
