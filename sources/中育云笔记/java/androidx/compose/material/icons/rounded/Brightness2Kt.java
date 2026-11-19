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
public final class Brightness2Kt {
    private static ImageVector _brightness2;

    public static final ImageVector getBrightness2(Icons.Rounded rounded) {
        ImageVector imageVector = _brightness2;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Brightness2", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.43f, 2.3f);
        pathBuilder.curveToRelative(-2.38f, -0.59f, -4.68f, -0.27f, -6.63f, 0.64f);
        pathBuilder.curveToRelative(-0.35f, 0.16f, -0.41f, 0.64f, -0.1f, 0.86f);
        pathBuilder.curveTo(8.3f, 5.6f, 10.0f, 8.6f, 10.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 3.4f, -1.7f, 6.4f, -4.3f, 8.2f);
        pathBuilder.curveToRelative(-0.32f, 0.22f, -0.26f, 0.7f, 0.09f, 0.86f);
        pathBuilder.curveToRelative(1.28f, 0.6f, 2.71f, 0.94f, 4.21f, 0.94f);
        pathBuilder.curveToRelative(6.05f, 0.0f, 10.85f, -5.38f, 9.87f, -11.6f);
        pathBuilder.curveToRelative(-0.61f, -3.92f, -3.59f, -7.16f, -7.44f, -8.1f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brightness2 = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
