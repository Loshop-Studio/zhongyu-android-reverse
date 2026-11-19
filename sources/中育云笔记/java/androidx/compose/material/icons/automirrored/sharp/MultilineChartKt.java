package androidx.compose.material.icons.automirrored.sharp;

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
public final class MultilineChartKt {
    private static ImageVector _multilineChart;

    public static final ImageVector getMultilineChart(Icons.AutoMirrored.Sharp sharp) {
        ImageVector imageVector = _multilineChart;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Sharp.MultilineChart", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 6.92f);
        pathBuilder.lineToRelative(-1.41f, -1.41f);
        pathBuilder.lineToRelative(-2.85f, 3.21f);
        pathBuilder.curveTo(15.68f, 6.4f, 12.83f, 5.0f, 9.61f, 5.0f);
        pathBuilder.curveTo(6.72f, 5.0f, 4.07f, 6.16f, 2.0f, 8.0f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder.curveTo(5.12f, 7.93f, 7.27f, 7.0f, 9.61f, 7.0f);
        pathBuilder.curveToRelative(2.74f, 0.0f, 5.09f, 1.26f, 6.77f, 3.24f);
        pathBuilder.lineToRelative(-2.88f, 3.24f);
        pathBuilder.lineToRelative(-4.0f, -4.0f);
        pathBuilder.lineTo(2.0f, 16.99f);
        pathBuilder.lineToRelative(1.5f, 1.5f);
        pathBuilder.lineToRelative(6.0f, -6.01f);
        pathBuilder.lineToRelative(4.0f, 4.0f);
        pathBuilder.lineToRelative(4.05f, -4.55f);
        pathBuilder.curveToRelative(0.75f, 1.35f, 1.25f, 2.9f, 1.44f, 4.55f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.curveToRelative(-0.22f, -2.3f, -0.95f, -4.39f, -2.04f, -6.14f);
        pathBuilder.lineTo(22.0f, 6.92f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _multilineChart = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
