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
public final class PlagiarismKt {
    private static ImageVector _plagiarism;

    public static final ImageVector getPlagiarism(Icons.Rounded rounded) {
        ImageVector imageVector = _plagiarism;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Plagiarism", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.41f, 7.41f);
        pathBuilder.lineToRelative(-4.83f, -4.83f);
        pathBuilder.curveTo(14.21f, 2.21f, 13.7f, 2.0f, 13.17f, 2.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(8.83f);
        pathBuilder.curveTo(20.0f, 8.3f, 19.79f, 7.79f, 19.41f, 7.41f);
        pathBuilder.close();
        pathBuilder.moveTo(15.74f, 18.74f);
        pathBuilder.lineTo(15.74f, 18.74f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(-1.18f, -1.18f);
        pathBuilder.curveToRelative(-1.33f, 0.71f, -3.01f, 0.53f, -4.13f, -0.59f);
        pathBuilder.curveToRelative(-1.52f, -1.52f, -1.35f, -4.08f, 0.5f, -5.37f);
        pathBuilder.curveToRelative(1.16f, -0.81f, 2.78f, -0.81f, 3.95f, 0.0f);
        pathBuilder.curveToRelative(1.55f, 1.08f, 1.9f, 3.04f, 1.09f, 4.55f);
        pathBuilder.lineToRelative(1.18f, 1.18f);
        pathBuilder.curveTo(16.13f, 17.72f, 16.13f, 18.35f, 15.74f, 18.74f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 9.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineTo(3.5f);
        pathBuilder.lineTo(18.5f, 9.0f);
        pathBuilder.horizontalLineTo(14.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(11.5f, 14.5f);
        pathBuilder2.moveToRelative(-1.5f, 0.0f);
        pathBuilder2.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        pathBuilder2.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _plagiarism = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
