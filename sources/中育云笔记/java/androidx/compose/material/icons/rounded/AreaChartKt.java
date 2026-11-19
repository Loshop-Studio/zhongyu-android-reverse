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
public final class AreaChartKt {
    private static ImageVector _areaChart;

    public static final ImageVector getAreaChart(Icons.Rounded rounded) {
        ImageVector imageVector = _areaChart;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AreaChart", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.0f, 17.0f);
        pathBuilder.lineToRelative(3.39f, -4.66f);
        pathBuilder.curveToRelative(0.33f, -0.46f, 0.98f, -0.55f, 1.42f, -0.2f);
        pathBuilder.lineTo(21.0f, 18.5f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.lineToRelative(0.0f, -5.72f);
        pathBuilder.curveToRelative(0.22f, 0.0f, 0.44f, 0.07f, 0.62f, 0.22f);
        pathBuilder.lineTo(8.0f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 11.0f);
        pathBuilder.curveToRelative(0.44f, 0.0f, 0.88f, 0.15f, 1.25f, 0.44f);
        pathBuilder.lineToRelative(3.37f, 2.69f);
        pathBuilder.lineToRelative(2.77f, -3.81f);
        pathBuilder.curveToRelative(0.66f, -0.91f, 1.95f, -1.1f, 2.85f, -0.4f);
        pathBuilder.lineTo(21.0f, 15.97f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.lineToRelative(-4.18f, -3.34f);
        pathBuilder.curveToRelative(-0.45f, -0.36f, -1.1f, -0.27f, -1.44f, 0.2f);
        pathBuilder.lineTo(7.0f, 10.0f);
        pathBuilder.lineTo(3.6f, 7.45f);
        pathBuilder.curveTo(3.42f, 7.32f, 3.21f, 7.25f, 3.0f, 7.25f);
        pathBuilder.lineTo(3.0f, 11.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _areaChart = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
