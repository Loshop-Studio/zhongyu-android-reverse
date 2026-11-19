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
public final class SpaKt {
    private static ImageVector _spa;

    public static final ImageVector getSpa(Icons.Rounded rounded) {
        ImageVector imageVector = _spa;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Spa", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.49f, 9.63f);
        pathBuilder.curveToRelative(-0.16f, -2.42f, -1.03f, -4.79f, -2.64f, -6.76f);
        pathBuilder.curveToRelative(-0.41f, -0.5f, -1.16f, -0.5f, -1.57f, 0.0f);
        pathBuilder.curveToRelative(-1.65f, 1.98f, -2.57f, 4.35f, -2.77f, 6.76f);
        pathBuilder.curveToRelative(1.28f, 0.68f, 2.46f, 1.56f, 3.49f, 2.63f);
        pathBuilder.curveToRelative(1.03f, -1.06f, 2.21f, -1.94f, 3.49f, -2.63f);
        pathBuilder.close();
        pathBuilder.moveTo(8.99f, 12.28f);
        pathBuilder.curveToRelative(-0.14f, -0.1f, -0.3f, -0.19f, -0.45f, -0.29f);
        pathBuilder.curveToRelative(0.15f, 0.11f, 0.31f, 0.19f, 0.45f, 0.29f);
        pathBuilder.close();
        pathBuilder.moveTo(15.41f, 12.03f);
        pathBuilder.curveToRelative(-0.13f, 0.09f, -0.27f, 0.16f, -0.4f, 0.26f);
        pathBuilder.curveToRelative(0.13f, -0.1f, 0.27f, -0.17f, 0.4f, -0.26f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 15.45f);
        pathBuilder.curveToRelative(-1.95f, -2.97f, -5.14f, -5.03f, -8.83f, -5.39f);
        pathBuilder.curveToRelative(-0.64f, -0.06f, -1.17f, 0.47f, -1.11f, 1.11f);
        pathBuilder.curveToRelative(0.45f, 4.8f, 3.65f, 8.78f, 7.98f, 10.33f);
        pathBuilder.curveToRelative(0.63f, 0.23f, 1.29f, 0.4f, 1.97f, 0.51f);
        pathBuilder.curveToRelative(0.68f, -0.12f, 1.33f, -0.29f, 1.97f, -0.51f);
        pathBuilder.curveToRelative(4.33f, -1.55f, 7.53f, -5.52f, 7.98f, -10.33f);
        pathBuilder.curveToRelative(0.06f, -0.64f, -0.48f, -1.17f, -1.11f, -1.11f);
        pathBuilder.curveToRelative(-3.71f, 0.36f, -6.9f, 2.42f, -8.85f, 5.39f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _spa = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
