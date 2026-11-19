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
public final class PlagiarismKt {
    private static ImageVector _plagiarism;

    public static final ImageVector getPlagiarism(Icons.Outlined outlined) {
        ImageVector imageVector = _plagiarism;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Plagiarism", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 2.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.lineTo(14.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 20.0f);
        pathBuilder.lineTo(6.0f, 20.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineToRelative(7.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(9.03f, 11.03f);
        pathBuilder2.curveToRelative(-1.37f, 1.37f, -1.37f, 3.58f, 0.0f, 4.95f);
        pathBuilder2.curveToRelative(1.12f, 1.12f, 2.8f, 1.31f, 4.13f, 0.59f);
        pathBuilder2.lineToRelative(1.88f, 1.88f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineToRelative(-1.88f, -1.88f);
        pathBuilder2.curveToRelative(0.71f, -1.33f, 0.53f, -3.01f, -0.59f, -4.13f);
        pathBuilder2.curveTo(12.61f, 9.66f, 10.39f, 9.66f, 9.03f, 11.03f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.56f, 14.56f);
        pathBuilder2.curveToRelative(-0.59f, 0.59f, -1.54f, 0.59f, -2.12f, 0.0f);
        pathBuilder2.curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0.0f, -2.12f);
        pathBuilder2.curveToRelative(0.59f, -0.59f, 1.54f, -0.59f, 2.12f, 0.0f);
        pathBuilder2.curveTo(13.15f, 13.03f, 13.15f, 13.97f, 12.56f, 14.56f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _plagiarism = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
