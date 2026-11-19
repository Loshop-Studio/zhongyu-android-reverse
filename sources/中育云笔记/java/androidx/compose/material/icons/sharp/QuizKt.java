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
public final class QuizKt {
    private static ImageVector _quiz;

    public static final ImageVector getQuiz(Icons.Sharp sharp) {
        ImageVector imageVector = _quiz;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Quiz", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.0f, 6.0f);
        pathBuilder.lineToRelative(-2.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 16.0f);
        pathBuilder.lineToRelative(16.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, -2.0f);
        pathBuilder.lineToRelative(-14.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(6.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(16.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.verticalLineTo(2.0f);
        pathBuilder2.horizontalLineTo(6.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.51f, 10.16f);
        pathBuilder2.curveToRelative(0.41f, -0.73f, 1.18f, -1.16f, 1.63f, -1.8f);
        pathBuilder2.curveToRelative(0.48f, -0.68f, 0.21f, -1.94f, -1.14f, -1.94f);
        pathBuilder2.curveToRelative(-0.88f, 0.0f, -1.32f, 0.67f, -1.5f, 1.23f);
        pathBuilder2.lineToRelative(-1.37f, -0.57f);
        pathBuilder2.curveTo(11.51f, 5.96f, 12.52f, 5.0f, 13.99f, 5.0f);
        pathBuilder2.curveToRelative(1.23f, 0.0f, 2.08f, 0.56f, 2.51f, 1.26f);
        pathBuilder2.curveToRelative(0.37f, 0.6f, 0.58f, 1.73f, 0.01f, 2.57f);
        pathBuilder2.curveToRelative(-0.63f, 0.93f, -1.23f, 1.21f, -1.56f, 1.81f);
        pathBuilder2.curveToRelative(-0.13f, 0.24f, -0.18f, 0.4f, -0.18f, 1.18f);
        pathBuilder2.horizontalLineToRelative(-1.52f);
        pathBuilder2.curveTo(13.26f, 11.41f, 13.19f, 10.74f, 13.51f, 10.16f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.95f, 13.95f);
        pathBuilder2.curveToRelative(0.0f, -0.59f, 0.47f, -1.04f, 1.05f, -1.04f);
        pathBuilder2.curveToRelative(0.59f, 0.0f, 1.04f, 0.45f, 1.04f, 1.04f);
        pathBuilder2.curveToRelative(0.0f, 0.58f, -0.44f, 1.05f, -1.04f, 1.05f);
        pathBuilder2.curveTo(13.42f, 15.0f, 12.95f, 14.53f, 12.95f, 13.95f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _quiz = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
