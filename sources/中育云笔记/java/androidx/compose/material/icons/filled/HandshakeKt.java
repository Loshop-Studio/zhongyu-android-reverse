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
public final class HandshakeKt {
    private static ImageVector _handshake;

    public static final ImageVector getHandshake(Icons.Filled filled) {
        ImageVector imageVector = _handshake;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Handshake", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.48f, 10.41f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -1.04f, 0.39f, -1.43f, 0.0f);
        pathBuilder.lineToRelative(-4.47f, -4.46f);
        pathBuilder.lineToRelative(-7.05f, 7.04f);
        pathBuilder.lineToRelative(-0.66f, -0.63f);
        pathBuilder.curveToRelative(-1.17f, -1.17f, -1.17f, -3.07f, 0.0f, -4.24f);
        pathBuilder.lineToRelative(4.24f, -4.24f);
        pathBuilder.curveToRelative(1.17f, -1.17f, 3.07f, -1.17f, 4.24f, 0.0f);
        pathBuilder.lineTo(16.48f, 9.0f);
        pathBuilder.curveTo(16.87f, 9.39f, 16.87f, 10.02f, 16.48f, 10.41f);
        pathBuilder.close();
        pathBuilder.moveTo(17.18f, 8.29f);
        pathBuilder.curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilder.curveToRelative(-1.27f, 1.27f, -2.61f, 0.22f, -2.83f, 0.0f);
        pathBuilder.lineToRelative(-3.76f, -3.76f);
        pathBuilder.lineToRelative(-5.57f, 5.57f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.42f, 0.0f);
        pathBuilder.lineToRelative(4.62f, -4.62f);
        pathBuilder.lineToRelative(0.71f, 0.71f);
        pathBuilder.lineToRelative(-4.62f, 4.62f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.42f, 0.0f);
        pathBuilder.lineToRelative(4.62f, -4.62f);
        pathBuilder.lineToRelative(0.71f, 0.71f);
        pathBuilder.lineToRelative(-4.62f, 4.62f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(4.62f, -4.62f);
        pathBuilder.lineToRelative(0.71f, 0.71f);
        pathBuilder.lineToRelative(-4.62f, 4.62f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(8.32f, -8.34f);
        pathBuilder.curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0.0f, -4.24f);
        pathBuilder.lineToRelative(-4.24f, -4.24f);
        pathBuilder.curveToRelative(-1.15f, -1.15f, -3.01f, -1.17f, -4.18f, -0.06f);
        pathBuilder.lineTo(17.18f, 8.29f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _handshake = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
