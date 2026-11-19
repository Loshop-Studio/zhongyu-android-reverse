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
public final class WifiKt {
    private static ImageVector _wifi;

    public static final ImageVector getWifi(Icons.Rounded rounded) {
        ImageVector imageVector = _wifi;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Wifi", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.06f, 10.06f);
        pathBuilder.curveToRelative(0.51f, 0.51f, 1.32f, 0.56f, 1.87f, 0.1f);
        pathBuilder.curveToRelative(4.67f, -3.84f, 11.45f, -3.84f, 16.13f, -0.01f);
        pathBuilder.curveToRelative(0.56f, 0.46f, 1.38f, 0.42f, 1.89f, -0.09f);
        pathBuilder.curveToRelative(0.59f, -0.59f, 0.55f, -1.57f, -0.1f, -2.1f);
        pathBuilder.curveToRelative(-5.71f, -4.67f, -13.97f, -4.67f, -19.69f, 0.0f);
        pathBuilder.curveToRelative(-0.65f, 0.52f, -0.7f, 1.5f, -0.1f, 2.1f);
        pathBuilder.close();
        pathBuilder.moveTo(9.82f, 17.82f);
        pathBuilder.lineToRelative(1.47f, 1.47f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(1.47f, -1.47f);
        pathBuilder.curveToRelative(0.47f, -0.47f, 0.37f, -1.28f, -0.23f, -1.59f);
        pathBuilder.curveToRelative(-1.22f, -0.63f, -2.68f, -0.63f, -3.91f, 0.0f);
        pathBuilder.curveToRelative(-0.57f, 0.31f, -0.68f, 1.12f, -0.21f, 1.59f);
        pathBuilder.close();
        pathBuilder.moveTo(6.09f, 14.09f);
        pathBuilder.curveToRelative(0.49f, 0.49f, 1.26f, 0.54f, 1.83f, 0.13f);
        pathBuilder.curveToRelative(2.44f, -1.73f, 5.72f, -1.73f, 8.16f, 0.0f);
        pathBuilder.curveToRelative(0.57f, 0.4f, 1.34f, 0.36f, 1.83f, -0.13f);
        pathBuilder.lineToRelative(0.01f, -0.01f);
        pathBuilder.curveToRelative(0.6f, -0.6f, 0.56f, -1.62f, -0.13f, -2.11f);
        pathBuilder.curveToRelative(-3.44f, -2.49f, -8.13f, -2.49f, -11.58f, 0.0f);
        pathBuilder.curveToRelative(-0.69f, 0.5f, -0.73f, 1.51f, -0.12f, 2.12f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifi = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
