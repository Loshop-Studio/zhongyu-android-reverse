package androidx.compose.material.icons.filled;

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
public final class QuestionMarkKt {
    private static ImageVector _questionMark;

    public static final ImageVector getQuestionMark(Icons.Filled filled) {
        ImageVector imageVector = _questionMark;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.QuestionMark", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.07f, 12.85f);
        pathBuilder.curveToRelative(0.77f, -1.39f, 2.25f, -2.21f, 3.11f, -3.44f);
        pathBuilder.curveToRelative(0.91f, -1.29f, 0.4f, -3.7f, -2.18f, -3.7f);
        pathBuilder.curveToRelative(-1.69f, 0.0f, -2.52f, 1.28f, -2.87f, 2.34f);
        pathBuilder.lineTo(6.54f, 6.96f);
        pathBuilder.curveTo(7.25f, 4.83f, 9.18f, 3.0f, 11.99f, 3.0f);
        pathBuilder.curveToRelative(2.35f, 0.0f, 3.96f, 1.07f, 4.78f, 2.41f);
        pathBuilder.curveToRelative(0.7f, 1.15f, 1.11f, 3.3f, 0.03f, 4.9f);
        pathBuilder.curveToRelative(-1.2f, 1.77f, -2.35f, 2.31f, -2.97f, 3.45f);
        pathBuilder.curveToRelative(-0.25f, 0.46f, -0.35f, 0.76f, -0.35f, 2.24f);
        pathBuilder.horizontalLineToRelative(-2.89f);
        pathBuilder.curveTo(10.58f, 15.22f, 10.46f, 13.95f, 11.07f, 12.85f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 20.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(14.0f, 18.9f, 14.0f, 20.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _questionMark = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
