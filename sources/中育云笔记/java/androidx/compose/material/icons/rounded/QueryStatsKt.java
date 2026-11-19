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
public final class QueryStatsKt {
    private static ImageVector _queryStats;

    public static final ImageVector getQueryStats(Icons.Rounded rounded) {
        ImageVector imageVector = _queryStats;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.QueryStats", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.88f, 18.47f);
        pathBuilder.curveToRelative(0.48f, -0.77f, 0.75f, -1.67f, 0.69f, -2.66f);
        pathBuilder.curveToRelative(-0.13f, -2.15f, -1.84f, -3.97f, -3.97f, -4.2f);
        pathBuilder.curveToRelative(-2.72f, -0.3f, -5.02f, 1.81f, -5.02f, 4.47f);
        pathBuilder.curveToRelative(0.0f, 2.49f, 2.01f, 4.5f, 4.49f, 4.5f);
        pathBuilder.curveToRelative(0.88f, 0.0f, 1.7f, -0.26f, 2.39f, -0.7f);
        pathBuilder.lineToRelative(2.41f, 2.41f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f);
        pathBuilder.lineTo(19.88f, 18.47f);
        pathBuilder.close();
        pathBuilder.moveTo(16.08f, 18.58f);
        pathBuilder.curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        pathBuilder.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilder.reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilder.curveTo(18.58f, 17.46f, 17.46f, 18.58f, 16.08f, 18.58f);
        pathBuilder.close();
        pathBuilder.moveTo(15.72f, 10.08f);
        pathBuilder.curveToRelative(-0.74f, 0.02f, -1.45f, 0.18f, -2.1f, 0.45f);
        pathBuilder.lineToRelative(-0.55f, -0.83f);
        pathBuilder.lineToRelative(-3.08f, 5.01f);
        pathBuilder.curveToRelative(-0.36f, 0.58f, -1.17f, 0.64f, -1.61f, 0.13f);
        pathBuilder.lineToRelative(-2.12f, -2.47f);
        pathBuilder.lineToRelative(-3.06f, 4.9f);
        pathBuilder.curveToRelative(-0.31f, 0.49f, -0.97f, 0.62f, -1.44f, 0.28f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.42f, -0.31f, -0.54f, -0.89f, -0.26f, -1.34f);
        pathBuilder.lineToRelative(3.78f, -6.05f);
        pathBuilder.curveToRelative(0.36f, -0.57f, 1.17f, -0.63f, 1.61f, -0.12f);
        pathBuilder.lineTo(9.0f, 12.5f);
        pathBuilder.lineToRelative(3.18f, -5.17f);
        pathBuilder.curveToRelative(0.38f, -0.62f, 1.28f, -0.64f, 1.68f, -0.03f);
        pathBuilder.lineTo(15.72f, 10.08f);
        pathBuilder.close();
        pathBuilder.moveTo(18.31f, 10.58f);
        pathBuilder.curveToRelative(-0.64f, -0.28f, -1.33f, -0.45f, -2.05f, -0.49f);
        pathBuilder.lineTo(20.8f, 2.9f);
        pathBuilder.curveToRelative(0.31f, -0.49f, 0.97f, -0.61f, 1.43f, -0.27f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.43f, 0.31f, 0.54f, 0.9f, 0.26f, 1.34f);
        pathBuilder.lineTo(18.31f, 10.58f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _queryStats = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
