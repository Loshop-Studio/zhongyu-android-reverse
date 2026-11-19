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
public final class QuizKt {
    private static ImageVector _quiz;

    public static final ImageVector getQuiz(Icons.Rounded rounded) {
        ImageVector imageVector = _quiz;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Quiz", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 20.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveTo(2.0f, 6.45f, 2.0f, 7.0f);
        pathBuilder.verticalLineToRelative(13.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(13.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveTo(17.55f, 20.0f, 17.0f, 20.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.0f, 2.0f);
        pathBuilder2.horizontalLineTo(8.0f);
        pathBuilder2.curveTo(6.9f, 2.0f, 6.0f, 2.9f, 6.0f, 4.0f);
        pathBuilder2.verticalLineToRelative(12.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(12.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.verticalLineTo(4.0f);
        pathBuilder2.curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.01f, 15.0f);
        pathBuilder2.curveToRelative(-0.59f, 0.0f, -1.05f, -0.47f, -1.05f, -1.05f);
        pathBuilder2.curveToRelative(0.0f, -0.59f, 0.47f, -1.04f, 1.05f, -1.04f);
        pathBuilder2.curveToRelative(0.59f, 0.0f, 1.04f, 0.45f, 1.04f, 1.04f);
        pathBuilder2.curveTo(15.04f, 14.53f, 14.6f, 15.0f, 14.01f, 15.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.51f, 8.83f);
        pathBuilder2.curveToRelative(-0.63f, 0.93f, -1.23f, 1.21f, -1.56f, 1.81f);
        pathBuilder2.curveToRelative(-0.08f, 0.14f, -0.13f, 0.26f, -0.16f, 0.49f);
        pathBuilder2.curveToRelative(-0.05f, 0.39f, -0.36f, 0.68f, -0.75f, 0.68f);
        pathBuilder2.horizontalLineToRelative(-0.03f);
        pathBuilder2.curveToRelative(-0.44f, 0.0f, -0.79f, -0.38f, -0.75f, -0.82f);
        pathBuilder2.curveToRelative(0.03f, -0.28f, 0.09f, -0.57f, 0.25f, -0.84f);
        pathBuilder2.curveToRelative(0.41f, -0.73f, 1.18f, -1.16f, 1.63f, -1.8f);
        pathBuilder2.curveToRelative(0.48f, -0.68f, 0.21f, -1.94f, -1.14f, -1.94f);
        pathBuilder2.curveToRelative(-0.61f, 0.0f, -1.01f, 0.32f, -1.26f, 0.7f);
        pathBuilder2.curveToRelative(-0.19f, 0.29f, -0.57f, 0.39f, -0.89f, 0.25f);
        pathBuilder2.lineToRelative(0.0f, 0.0f);
        pathBuilder2.curveToRelative(-0.42f, -0.18f, -0.6f, -0.7f, -0.34f, -1.07f);
        pathBuilder2.curveTo(12.02f, 5.55f, 12.87f, 5.0f, 13.99f, 5.0f);
        pathBuilder2.curveToRelative(1.23f, 0.0f, 2.08f, 0.56f, 2.51f, 1.26f);
        pathBuilder2.curveTo(16.87f, 6.87f, 17.08f, 7.99f, 16.51f, 8.83f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _quiz = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
