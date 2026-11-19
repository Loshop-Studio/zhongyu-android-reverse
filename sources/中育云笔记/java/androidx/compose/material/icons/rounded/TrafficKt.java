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
public final class TrafficKt {
    private static ImageVector _traffic;

    public static final ImageVector getTraffic(Icons.Rounded rounded) {
        ImageVector imageVector = _traffic;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Traffic", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.96f, 10.59f);
        pathBuilder.curveToRelative(0.04f, -0.31f, -0.19f, -0.59f, -0.5f, -0.59f);
        pathBuilder.lineTo(17.0f, 10.0f);
        pathBuilder.lineTo(17.0f, 8.86f);
        pathBuilder.curveToRelative(1.54f, -0.4f, 2.72f, -1.68f, 2.96f, -3.27f);
        pathBuilder.curveToRelative(0.04f, -0.31f, -0.19f, -0.59f, -0.5f, -0.59f);
        pathBuilder.lineTo(17.0f, 5.0f);
        pathBuilder.lineTo(17.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.lineTo(8.0f, 3.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.lineTo(4.54f, 5.0f);
        pathBuilder.curveToRelative(-0.31f, 0.0f, -0.54f, 0.28f, -0.5f, 0.59f);
        pathBuilder.curveTo(4.28f, 7.18f, 5.46f, 8.46f, 7.0f, 8.86f);
        pathBuilder.lineTo(7.0f, 10.0f);
        pathBuilder.lineTo(4.54f, 10.0f);
        pathBuilder.curveToRelative(-0.31f, 0.0f, -0.54f, 0.28f, -0.5f, 0.59f);
        pathBuilder.curveToRelative(0.24f, 1.59f, 1.42f, 2.87f, 2.96f, 3.27f);
        pathBuilder.lineTo(7.0f, 15.0f);
        pathBuilder.lineTo(4.54f, 15.0f);
        pathBuilder.curveToRelative(-0.31f, 0.0f, -0.54f, 0.28f, -0.5f, 0.59f);
        pathBuilder.curveToRelative(0.24f, 1.59f, 1.42f, 2.87f, 2.96f, 3.27f);
        pathBuilder.lineTo(7.0f, 20.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-1.14f);
        pathBuilder.curveToRelative(1.54f, -0.4f, 2.72f, -1.68f, 2.96f, -3.27f);
        pathBuilder.curveToRelative(0.04f, -0.31f, -0.19f, -0.59f, -0.5f, -0.59f);
        pathBuilder.lineTo(17.0f, 15.0f);
        pathBuilder.verticalLineToRelative(-1.14f);
        pathBuilder.curveToRelative(1.54f, -0.4f, 2.72f, -1.68f, 2.96f, -3.27f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 19.0f);
        pathBuilder.curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.89f, -2.0f, 2.0f, -2.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 14.0f);
        pathBuilder.curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.89f, -2.0f, 2.0f, -2.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 9.0f);
        pathBuilder.curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -1.11f, 0.89f, -2.0f, 2.0f, -2.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.89f, 2.0f, -2.0f, 2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _traffic = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
