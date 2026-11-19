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
public final class WhatshotKt {
    private static ImageVector _whatshot;

    public static final ImageVector getWhatshot(Icons.Rounded rounded) {
        ImageVector imageVector = _whatshot;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Whatshot", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.09f, 4.56f);
        pathBuilder.curveToRelative(-0.7f, -1.03f, -1.5f, -1.99f, -2.4f, -2.85f);
        pathBuilder.curveToRelative(-0.35f, -0.34f, -0.94f, -0.02f, -0.84f, 0.46f);
        pathBuilder.curveToRelative(0.19f, 0.94f, 0.39f, 2.18f, 0.39f, 3.29f);
        pathBuilder.curveToRelative(0.0f, 2.06f, -1.35f, 3.73f, -3.41f, 3.73f);
        pathBuilder.curveToRelative(-1.54f, 0.0f, -2.8f, -0.93f, -3.35f, -2.26f);
        pathBuilder.curveToRelative(-0.1f, -0.2f, -0.14f, -0.32f, -0.2f, -0.54f);
        pathBuilder.curveToRelative(-0.11f, -0.42f, -0.66f, -0.55f, -0.9f, -0.18f);
        pathBuilder.curveToRelative(-0.18f, 0.27f, -0.35f, 0.54f, -0.51f, 0.83f);
        pathBuilder.curveTo(4.68f, 9.08f, 4.0f, 11.46f, 4.0f, 14.0f);
        pathBuilder.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        pathBuilder.curveToRelative(0.0f, -3.49f, -1.08f, -6.73f, -2.91f, -9.44f);
        pathBuilder.close();
        pathBuilder.moveTo(11.71f, 19.0f);
        pathBuilder.curveToRelative(-1.78f, 0.0f, -3.22f, -1.4f, -3.22f, -3.14f);
        pathBuilder.curveToRelative(0.0f, -1.62f, 1.05f, -2.76f, 2.81f, -3.12f);
        pathBuilder.curveToRelative(1.47f, -0.3f, 2.98f, -0.93f, 4.03f, -1.92f);
        pathBuilder.curveToRelative(0.28f, -0.26f, 0.74f, -0.14f, 0.82f, 0.23f);
        pathBuilder.curveToRelative(0.23f, 1.02f, 0.35f, 2.08f, 0.35f, 3.15f);
        pathBuilder.curveToRelative(0.01f, 2.65f, -2.14f, 4.8f, -4.79f, 4.8f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _whatshot = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
