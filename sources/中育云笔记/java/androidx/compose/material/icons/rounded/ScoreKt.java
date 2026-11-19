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
public final class ScoreKt {
    private static ImageVector _score;

    public static final ImageVector getScore(Icons.Rounded rounded) {
        ImageVector imageVector = _score;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Score", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 3.0f);
        pathBuilder.lineTo(5.0f, 3.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineTo(21.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 5.75f);
        pathBuilder.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilder.reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder.lineTo(13.5f, 8.0f);
        pathBuilder.lineToRelative(1.79f, -2.69f);
        pathBuilder.curveToRelative(0.13f, -0.19f, 0.35f, -0.31f, 0.59f, -0.31f);
        pathBuilder.curveToRelative(0.56f, 0.0f, 0.9f, 0.63f, 0.59f, 1.1f);
        pathBuilder.lineTo(15.2f, 8.0f);
        pathBuilder.lineToRelative(1.27f, 1.9f);
        pathBuilder.curveToRelative(0.31f, 0.47f, -0.02f, 1.1f, -0.59f, 1.1f);
        pathBuilder.curveToRelative(-0.24f, 0.0f, -0.46f, -0.12f, -0.59f, -0.31f);
        pathBuilder.lineTo(13.5f, 8.0f);
        pathBuilder.verticalLineToRelative(2.25f);
        pathBuilder.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilder.reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilder.verticalLineToRelative(-4.5f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 8.25f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.lineTo(9.5f, 6.5f);
        pathBuilder.lineTo(7.75f, 6.5f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilder.reflectiveCurveTo(7.34f, 5.0f, 7.75f, 5.0f);
        pathBuilder.lineTo(10.0f, 5.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(1.75f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.lineTo(8.5f, 8.75f);
        pathBuilder.verticalLineToRelative(0.75f);
        pathBuilder.horizontalLineToRelative(1.75f);
        pathBuilder.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder.reflectiveCurveToRelative(-0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilder.lineTo(8.0f, 11.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.lineTo(7.0f, 8.25f);
        pathBuilder.close();
        pathBuilder.moveTo(18.74f, 13.26f);
        pathBuilder.lineToRelative(-5.03f, 5.03f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilder.lineTo(9.0f, 15.0f);
        pathBuilder.lineToRelative(-2.49f, 2.49f);
        pathBuilder.curveToRelative(-0.56f, 0.56f, -1.51f, 0.16f, -1.51f, -0.62f);
        pathBuilder.curveToRelative(0.0f, -0.23f, 0.09f, -0.46f, 0.26f, -0.62f);
        pathBuilder.lineToRelative(3.03f, -3.03f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilder.lineTo(13.0f, 16.5f);
        pathBuilder.lineToRelative(4.49f, -4.49f);
        pathBuilder.curveToRelative(0.56f, -0.56f, 1.51f, -0.16f, 1.51f, 0.62f);
        pathBuilder.curveToRelative(0.0f, 0.24f, -0.09f, 0.46f, -0.26f, 0.63f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _score = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
