package androidx.compose.material.icons.automirrored.sharp;

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
public final class AccessibleKt {
    private static ImageVector _accessible;

    public static final ImageVector getAccessible(Icons.AutoMirrored.Sharp sharp) {
        ImageVector imageVector = _accessible;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Sharp.Accessible", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.moveToRelative(-2.0f, 0.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(19.0f, 13.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.curveToRelative(-1.54f, 0.02f, -3.09f, -0.75f, -4.07f, -1.83f);
        pathBuilder2.lineToRelative(-1.29f, -1.43f);
        pathBuilder2.curveToRelative(-0.17f, -0.19f, -0.38f, -0.34f, -0.61f, -0.45f);
        pathBuilder2.curveToRelative(-0.01f, 0.0f, -0.01f, -0.01f, -0.02f, -0.01f);
        pathBuilder2.lineTo(13.0f, 7.28f);
        pathBuilder2.curveToRelative(-0.37f, -0.21f, -0.78f, -0.31f, -1.25f, -0.25f);
        pathBuilder2.curveTo(10.73f, 7.15f, 10.0f, 8.07f, 10.0f, 9.1f);
        pathBuilder2.lineTo(10.0f, 17.0f);
        pathBuilder2.horizontalLineToRelative(7.0f);
        pathBuilder2.verticalLineToRelative(5.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(-7.5f);
        pathBuilder2.horizontalLineToRelative(-5.0f);
        pathBuilder2.verticalLineToRelative(-3.45f);
        pathBuilder2.curveToRelative(1.29f, 1.07f, 3.25f, 1.94f, 5.0f, 1.95f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.83f, 18.0f);
        pathBuilder2.curveToRelative(-0.41f, 1.16f, -1.52f, 2.0f, -2.83f, 2.0f);
        pathBuilder2.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder2.curveToRelative(0.0f, -1.31f, 0.84f, -2.41f, 2.0f, -2.83f);
        pathBuilder2.lineTo(9.0f, 12.1f);
        pathBuilder2.curveToRelative(-2.28f, 0.46f, -4.0f, 2.48f, -4.0f, 4.9f);
        pathBuilder2.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder2.curveToRelative(2.42f, 0.0f, 4.44f, -1.72f, 4.9f, -4.0f);
        pathBuilder2.horizontalLineToRelative(-2.07f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _accessible = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
