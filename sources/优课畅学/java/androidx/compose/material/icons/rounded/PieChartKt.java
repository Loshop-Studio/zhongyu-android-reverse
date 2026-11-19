package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.graphics.vector.PathBuilder;
import androidx.compose.p013ui.graphics.vector.VectorKt;
import androidx.compose.p013ui.unit.C3156Dp;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
public final class PieChartKt {
    private static ImageVector _pieChart;

    public static final ImageVector getPieChart(Icons.Rounded rounded) {
        ImageVector imageVector = _pieChart;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PieChart", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 3.18f);
        pathBuilder.verticalLineToRelative(17.64f);
        pathBuilder.curveToRelative(0.0f, 0.64f, -0.59f, 1.12f, -1.21f, 0.98f);
        pathBuilder.curveTo(5.32f, 20.8f, 2.0f, 16.79f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(3.32f, -8.8f, 7.79f, -9.8f);
        pathBuilder.curveToRelative(0.62f, -0.14f, 1.21f, 0.34f, 1.21f, 0.98f);
        pathBuilder.close();
        pathBuilder.moveTo(13.03f, 3.18f);
        pathBuilder.verticalLineToRelative(6.81f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(6.79f);
        pathBuilder.curveToRelative(0.64f, 0.0f, 1.12f, -0.59f, 0.98f, -1.22f);
        pathBuilder.curveToRelative(-0.85f, -3.76f, -3.8f, -6.72f, -7.55f, -7.57f);
        pathBuilder.curveToRelative(-0.63f, -0.14f, -1.22f, 0.34f, -1.22f, 0.98f);
        pathBuilder.close();
        pathBuilder.moveTo(13.03f, 14.01f);
        pathBuilder.verticalLineToRelative(6.81f);
        pathBuilder.curveToRelative(0.0f, 0.64f, 0.59f, 1.12f, 1.22f, 0.98f);
        pathBuilder.curveToRelative(3.76f, -0.85f, 6.71f, -3.82f, 7.56f, -7.58f);
        pathBuilder.curveToRelative(0.14f, -0.62f, -0.35f, -1.22f, -0.98f, -1.22f);
        pathBuilder.horizontalLineToRelative(-6.79f);
        pathBuilder.curveToRelative(-0.56f, 0.01f, -1.01f, 0.46f, -1.01f, 1.01f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pieChart = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
