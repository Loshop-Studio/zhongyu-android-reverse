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
public final class NetworkCheckKt {
    private static ImageVector _networkCheck;

    public static final ImageVector getNetworkCheck(Icons.Rounded rounded) {
        ImageVector imageVector = _networkCheck;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NetworkCheck", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.9f, 5.0f);
        pathBuilder.curveToRelative(-0.17f, 0.0f, -0.32f, 0.09f, -0.41f, 0.23f);
        pathBuilder.lineToRelative(-0.07f, 0.15f);
        pathBuilder.lineToRelative(-5.18f, 11.65f);
        pathBuilder.curveToRelative(-0.16f, 0.29f, -0.26f, 0.61f, -0.26f, 0.96f);
        pathBuilder.curveToRelative(0.0f, 1.11f, 0.9f, 2.01f, 2.01f, 2.01f);
        pathBuilder.curveToRelative(0.96f, 0.0f, 1.77f, -0.68f, 1.96f, -1.59f);
        pathBuilder.lineToRelative(0.01f, -0.03f);
        pathBuilder.lineTo(16.4f, 5.5f);
        pathBuilder.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder.close();
        pathBuilder.moveTo(2.06f, 10.06f);
        pathBuilder.curveToRelative(0.51f, 0.51f, 1.33f, 0.55f, 1.89f, 0.09f);
        pathBuilder.curveToRelative(2.76f, -2.26f, 6.24f, -3.18f, 9.58f, -2.76f);
        pathBuilder.lineToRelative(1.19f, -2.68f);
        pathBuilder.curveToRelative(-4.35f, -0.78f, -8.96f, 0.3f, -12.57f, 3.25f);
        pathBuilder.curveToRelative(-0.64f, 0.53f, -0.68f, 1.51f, -0.09f, 2.1f);
        pathBuilder.close();
        pathBuilder.moveTo(21.94f, 10.06f);
        pathBuilder.curveToRelative(0.59f, -0.59f, 0.55f, -1.57f, -0.1f, -2.1f);
        pathBuilder.curveToRelative(-1.36f, -1.11f, -2.86f, -1.95f, -4.44f, -2.53f);
        pathBuilder.lineToRelative(-0.53f, 2.82f);
        pathBuilder.curveToRelative(1.13f, 0.47f, 2.19f, 1.09f, 3.17f, 1.89f);
        pathBuilder.curveToRelative(0.58f, 0.46f, 1.39f, 0.43f, 1.9f, -0.08f);
        pathBuilder.close();
        pathBuilder.moveTo(17.91f, 14.09f);
        pathBuilder.curveToRelative(0.6f, -0.6f, 0.56f, -1.63f, -0.14f, -2.12f);
        pathBuilder.curveToRelative(-0.46f, -0.33f, -0.94f, -0.61f, -1.44f, -0.86f);
        pathBuilder.lineToRelative(-0.55f, 2.92f);
        pathBuilder.curveToRelative(0.11f, 0.07f, 0.22f, 0.14f, 0.32f, 0.22f);
        pathBuilder.curveToRelative(0.57f, 0.4f, 1.33f, 0.32f, 1.81f, -0.16f);
        pathBuilder.close();
        pathBuilder.moveTo(6.08f, 14.08f);
        pathBuilder.curveToRelative(0.5f, 0.5f, 1.27f, 0.54f, 1.85f, 0.13f);
        pathBuilder.curveToRelative(0.94f, -0.66f, 2.01f, -1.06f, 3.1f, -1.22f);
        pathBuilder.lineToRelative(1.28f, -2.88f);
        pathBuilder.curveToRelative(-2.13f, -0.06f, -4.28f, 0.54f, -6.09f, 1.84f);
        pathBuilder.curveToRelative(-0.69f, 0.51f, -0.74f, 1.53f, -0.14f, 2.13f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _networkCheck = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
