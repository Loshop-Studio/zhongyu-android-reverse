package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class RingVolumeKt {
    private static ImageVector _ringVolume;

    public static final ImageVector getRingVolume(Icons.TwoTone twoTone) {
        ImageVector imageVector = _ringVolume;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.RingVolume", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.6f, 17.22f);
        pathBuilder.curveToRelative(0.66f, 0.37f, 1.28f, 0.79f, 1.87f, 1.27f);
        pathBuilder.lineToRelative(1.07f, -1.07f);
        pathBuilder.curveToRelative(-0.91f, -0.75f, -1.9f, -1.38f, -2.94f, -1.9f);
        pathBuilder.verticalLineToRelative(1.7f);
        pathBuilder.close();
        pathBuilder.moveTo(3.53f, 18.5f);
        pathBuilder.curveToRelative(0.58f, -0.47f, 1.21f, -0.89f, 1.87f, -1.27f);
        pathBuilder.verticalLineToRelative(-1.71f);
        pathBuilder.curveToRelative(-1.05f, 0.51f, -2.03f, 1.15f, -2.95f, 1.9f);
        pathBuilder.lineToRelative(1.08f, 1.08f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 12.0f);
        pathBuilder2.curveTo(7.46f, 12.0f, 3.34f, 13.78f, 0.29f, 16.67f);
        pathBuilder2.curveToRelative(-0.18f, 0.18f, -0.29f, 0.43f, -0.29f, 0.71f);
        pathBuilder2.curveToRelative(0.0f, 0.28f, 0.11f, 0.53f, 0.29f, 0.71f);
        pathBuilder2.lineToRelative(2.48f, 2.48f);
        pathBuilder2.curveToRelative(0.18f, 0.18f, 0.43f, 0.29f, 0.71f, 0.29f);
        pathBuilder2.curveToRelative(0.27f, 0.0f, 0.52f, -0.11f, 0.7f, -0.28f);
        pathBuilder2.curveToRelative(0.79f, -0.74f, 1.69f, -1.36f, 2.66f, -1.85f);
        pathBuilder2.curveToRelative(0.33f, -0.16f, 0.56f, -0.5f, 0.56f, -0.9f);
        pathBuilder2.verticalLineToRelative(-3.1f);
        pathBuilder2.curveToRelative(1.45f, -0.48f, 3.0f, -0.73f, 4.6f, -0.73f);
        pathBuilder2.curveToRelative(1.6f, 0.0f, 3.15f, 0.25f, 4.6f, 0.72f);
        pathBuilder2.verticalLineToRelative(3.1f);
        pathBuilder2.curveToRelative(0.0f, 0.39f, 0.23f, 0.74f, 0.56f, 0.9f);
        pathBuilder2.curveToRelative(0.98f, 0.49f, 1.87f, 1.12f, 2.66f, 1.85f);
        pathBuilder2.curveToRelative(0.18f, 0.18f, 0.43f, 0.28f, 0.7f, 0.28f);
        pathBuilder2.curveToRelative(0.28f, 0.0f, 0.53f, -0.11f, 0.71f, -0.29f);
        pathBuilder2.lineToRelative(2.48f, -2.48f);
        pathBuilder2.curveToRelative(0.18f, -0.18f, 0.29f, -0.43f, 0.29f, -0.71f);
        pathBuilder2.curveToRelative(0.0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.7f);
        pathBuilder2.curveTo(20.66f, 13.78f, 16.54f, 12.0f, 12.0f, 12.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(5.4f, 17.23f);
        pathBuilder2.curveToRelative(-0.66f, 0.37f, -1.29f, 0.8f, -1.87f, 1.27f);
        pathBuilder2.lineToRelative(-1.07f, -1.07f);
        pathBuilder2.curveToRelative(0.91f, -0.75f, 1.9f, -1.39f, 2.95f, -1.9f);
        pathBuilder2.verticalLineToRelative(1.7f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.47f, 18.49f);
        pathBuilder2.curveToRelative(-0.59f, -0.48f, -1.21f, -0.9f, -1.87f, -1.27f);
        pathBuilder2.verticalLineToRelative(-1.7f);
        pathBuilder2.curveToRelative(1.04f, 0.51f, 2.03f, 1.15f, 2.94f, 1.9f);
        pathBuilder2.lineToRelative(-1.07f, 1.07f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.19f, 8.4f);
        pathBuilder2.lineToRelative(1.41f, 1.41f);
        pathBuilder2.reflectiveCurveToRelative(3.45f, -3.52f, 3.56f, -3.55f);
        pathBuilder2.lineToRelative(-1.41f, -1.41f);
        pathBuilder2.lineToRelative(-3.56f, 3.55f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(5.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.4f, 9.81f);
        pathBuilder2.lineTo(7.81f, 8.4f);
        pathBuilder2.lineTo(4.26f, 4.84f);
        pathBuilder2.lineTo(2.84f, 6.26f);
        pathBuilder2.curveToRelative(0.11f, 0.03f, 3.56f, 3.55f, 3.56f, 3.55f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _ringVolume = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
