package androidx.compose.material.icons.outlined;

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
public final class BathtubKt {
    private static ImageVector _bathtub;

    public static final ImageVector getBathtub(Icons.Outlined outlined) {
        ImageVector imageVector = _bathtub;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Bathtub", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.0f, 7.0f);
        pathBuilder.moveToRelative(-2.0f, 0.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.0f, 13.0f);
        pathBuilder2.verticalLineTo(4.83f);
        pathBuilder2.curveTo(20.0f, 3.27f, 18.73f, 2.0f, 17.17f, 2.0f);
        pathBuilder2.curveToRelative(-0.75f, 0.0f, -1.47f, 0.3f, -2.0f, 0.83f);
        pathBuilder2.lineToRelative(-1.25f, 1.25f);
        pathBuilder2.curveTo(13.76f, 4.03f, 13.59f, 4.0f, 13.41f, 4.0f);
        pathBuilder2.curveToRelative(-0.4f, 0.0f, -0.77f, 0.12f, -1.08f, 0.32f);
        pathBuilder2.lineToRelative(2.76f, 2.76f);
        pathBuilder2.curveToRelative(0.2f, -0.31f, 0.32f, -0.68f, 0.32f, -1.08f);
        pathBuilder2.curveToRelative(0.0f, -0.18f, -0.03f, -0.34f, -0.07f, -0.51f);
        pathBuilder2.lineToRelative(1.25f, -1.25f);
        pathBuilder2.curveTo(16.74f, 4.09f, 16.95f, 4.0f, 17.17f, 4.0f);
        pathBuilder2.curveTo(17.63f, 4.0f, 18.0f, 4.37f, 18.0f, 4.83f);
        pathBuilder2.verticalLineTo(13.0f);
        pathBuilder2.horizontalLineToRelative(-6.85f);
        pathBuilder2.curveToRelative(-0.3f, -0.21f, -0.57f, -0.45f, -0.82f, -0.72f);
        pathBuilder2.lineToRelative(-1.4f, -1.55f);
        pathBuilder2.curveToRelative(-0.19f, -0.21f, -0.43f, -0.38f, -0.69f, -0.5f);
        pathBuilder2.curveTo(7.93f, 10.08f, 7.59f, 10.0f, 7.24f, 10.0f);
        pathBuilder2.curveTo(6.0f, 10.01f, 5.0f, 11.01f, 5.0f, 12.25f);
        pathBuilder2.verticalLineTo(13.0f);
        pathBuilder2.horizontalLineTo(2.0f);
        pathBuilder2.verticalLineToRelative(6.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder2.horizontalLineToRelative(14.0f);
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.verticalLineToRelative(-6.0f);
        pathBuilder2.horizontalLineTo(20.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.0f, 19.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.verticalLineToRelative(-4.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.verticalLineTo(19.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bathtub = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
