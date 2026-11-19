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
public final class ModeFanOffKt {
    private static ImageVector _modeFanOff;

    public static final ImageVector getModeFanOff(Icons.Sharp sharp) {
        ImageVector imageVector = _modeFanOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ModeFanOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.34f, 8.36f);
        pathBuilder.lineToRelative(-2.29f, 0.82f);
        pathBuilder.curveToRelative(-0.18f, -0.13f, -0.38f, -0.25f, -0.58f, -0.34f);
        pathBuilder.curveToRelative(0.17f, -0.83f, 0.63f, -1.58f, 1.36f, -2.06f);
        pathBuilder.curveTo(16.85f, 5.44f, 16.18f, 2.0f, 13.39f, 2.0f);
        pathBuilder.curveToRelative(-3.08f, 0.0f, -4.9f, 1.47f, -5.3f, 3.26f);
        pathBuilder.lineTo(18.73f, 15.9f);
        pathBuilder.curveToRelative(1.5f, 0.39f, 3.27f, -0.51f, 3.27f, -2.51f);
        pathBuilder.curveTo(22.0f, 9.0f, 18.99f, 7.16f, 16.34f, 8.36f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(2.81f, 2.81f);
        pathBuilder2.lineTo(1.39f, 4.22f);
        pathBuilder2.lineTo(5.27f, 8.1f);
        pathBuilder2.curveTo(3.77f, 7.7f, 2.0f, 8.61f, 2.0f, 10.61f);
        pathBuilder2.curveToRelative(0.0f, 4.4f, 3.01f, 6.24f, 5.66f, 5.03f);
        pathBuilder2.lineToRelative(2.29f, -0.82f);
        pathBuilder2.curveToRelative(0.18f, 0.13f, 0.38f, 0.25f, 0.58f, 0.34f);
        pathBuilder2.curveToRelative(-0.17f, 0.83f, -0.63f, 1.58f, -1.36f, 2.06f);
        pathBuilder2.curveTo(7.15f, 18.56f, 7.82f, 22.0f, 10.61f, 22.0f);
        pathBuilder2.curveToRelative(3.08f, 0.0f, 4.9f, -1.47f, 5.3f, -3.26f);
        pathBuilder2.lineToRelative(3.87f, 3.87f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineTo(2.81f, 2.81f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _modeFanOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
