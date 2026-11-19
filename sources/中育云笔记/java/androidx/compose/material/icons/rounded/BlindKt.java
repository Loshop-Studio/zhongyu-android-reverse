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
public final class BlindKt {
    private static ImageVector _blind;

    public static final ImageVector getBlind(Icons.Rounded rounded) {
        ImageVector imageVector = _blind;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Blind", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.41f, 3.5f);
        pathBuilder.moveToRelative(-2.0f, 0.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.04f, 7.12f);
        pathBuilder2.curveToRelative(-0.17f, -0.35f, -0.44f, -0.65f, -0.8f, -0.85f);
        pathBuilder2.curveTo(10.63f, 5.91f, 9.9f, 5.93f, 9.31f, 6.24f);
        pathBuilder2.lineToRelative(0.0f, -0.01f);
        pathBuilder2.lineTo(4.92f, 8.73f);
        pathBuilder2.curveTo(4.3f, 9.08f, 3.91f, 9.74f, 3.91f, 10.46f);
        pathBuilder2.verticalLineTo(13.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder2.verticalLineToRelative(-2.54f);
        pathBuilder2.lineToRelative(1.5f, -0.85f);
        pathBuilder2.curveToRelative(-0.32f, 1.1f, -0.5f, 2.24f, -0.5f, 3.39f);
        pathBuilder2.verticalLineToRelative(5.33f);
        pathBuilder2.lineToRelative(-2.0f, 2.67f);
        pathBuilder2.curveToRelative(-0.33f, 0.44f, -0.24f, 1.07f, 0.2f, 1.4f);
        pathBuilder2.lineToRelative(0.0f, 0.0f);
        pathBuilder2.curveToRelative(0.44f, 0.33f, 1.07f, 0.24f, 1.4f, -0.2f);
        pathBuilder2.lineToRelative(2.04f, -2.72f);
        pathBuilder2.curveToRelative(0.23f, -0.31f, 0.37f, -0.69f, 0.4f, -1.08f);
        pathBuilder2.lineToRelative(0.18f, -2.94f);
        pathBuilder2.lineTo(10.91f, 18.0f);
        pathBuilder2.verticalLineToRelative(4.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder2.verticalLineToRelative(-4.87f);
        pathBuilder2.curveToRelative(0.0f, -0.41f, -0.13f, -0.81f, -0.36f, -1.15f);
        pathBuilder2.lineToRelative(-1.6f, -2.29f);
        pathBuilder2.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.01f);
        pathBuilder2.curveToRelative(-0.11f, -1.16f, 0.07f, -2.32f, 0.46f, -3.4f);
        pathBuilder2.curveToRelative(0.75f, 1.14f, 1.88f, 1.98f, 3.2f, 2.41f);
        pathBuilder2.lineToRelative(5.7f, 9.87f);
        pathBuilder2.curveToRelative(0.14f, 0.24f, 0.44f, 0.32f, 0.68f, 0.18f);
        pathBuilder2.lineToRelative(0.0f, 0.0f);
        pathBuilder2.curveToRelative(0.24f, -0.14f, 0.32f, -0.44f, 0.18f, -0.68f);
        pathBuilder2.lineTo(15.92f, 13.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.54f, 0.0f, 0.98f, -0.44f, 0.98f, -0.98f);
        pathBuilder2.verticalLineToRelative(-0.05f);
        pathBuilder2.curveToRelative(0.0f, -0.5f, -0.37f, -0.94f, -0.87f, -0.99f);
        pathBuilder2.curveToRelative(-0.95f, -0.1f, -2.37f, -0.52f, -3.21f, -2.18f);
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _blind = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
