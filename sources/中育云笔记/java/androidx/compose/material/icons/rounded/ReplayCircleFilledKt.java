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
public final class ReplayCircleFilledKt {
    private static ImageVector _replayCircleFilled;

    public static final ImageVector getReplayCircleFilled(Icons.Rounded rounded) {
        ImageVector imageVector = _replayCircleFilled;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ReplayCircleFilled", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 12.74f);
        pathBuilder.curveToRelative(-0.12f, 3.09f, -2.67f, 5.64f, -5.76f, 5.76f);
        pathBuilder.curveToRelative(-3.01f, 0.12f, -5.56f, -1.99f, -6.12f, -4.82f);
        pathBuilder.curveTo(5.99f, 13.07f, 6.48f, 12.5f, 7.1f, 12.5f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.47f, 0.0f, 0.88f, 0.33f, 0.98f, 0.8f);
        pathBuilder.curveToRelative(0.42f, 2.07f, 2.44f, 3.57f, 4.72f, 3.12f);
        pathBuilder.curveToRelative(1.56f, -0.3f, 2.82f, -1.56f, 3.12f, -3.12f);
        pathBuilder.curveToRelative(0.5f, -2.56f, -1.45f, -4.8f, -3.92f, -4.8f);
        pathBuilder.verticalLineToRelative(1.79f);
        pathBuilder.curveToRelative(0.0f, 0.45f, -0.54f, 0.67f, -0.85f, 0.35f);
        pathBuilder.lineTo(8.35f, 7.85f);
        pathBuilder.curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0.0f, -0.71f);
        pathBuilder.lineToRelative(2.79f, -2.79f);
        pathBuilder.curveTo(11.46f, 4.04f, 12.0f, 4.26f, 12.0f, 4.71f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.curveTo(15.39f, 6.5f, 18.13f, 9.32f, 18.0f, 12.74f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _replayCircleFilled = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
