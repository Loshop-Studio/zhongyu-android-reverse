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
public final class SsidChartKt {
    private static ImageVector _ssidChart;

    public static final ImageVector getSsidChart(Icons.Rounded rounded) {
        ImageVector imageVector = _ssidChart;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SsidChart", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 9.03f);
        pathBuilder.curveToRelative(0.0f, -0.32f, 0.15f, -0.62f, 0.41f, -0.81f);
        pathBuilder.lineTo(7.14f, 5.5f);
        pathBuilder.curveToRelative(0.4f, -0.29f, 0.95f, -0.25f, 1.3f, 0.1f);
        pathBuilder.lineToRelative(3.78f, 3.78f);
        pathBuilder.lineToRelative(7.2f, -5.23f);
        pathBuilder.curveTo(20.07f, 3.67f, 21.0f, 4.14f, 21.0f, 4.96f);
        pathBuilder.curveToRelative(0.0f, 0.32f, -0.15f, 0.62f, -0.41f, 0.81f);
        pathBuilder.lineToRelative(-7.9f, 5.73f);
        pathBuilder.curveToRelative(-0.4f, 0.29f, -0.95f, 0.25f, -1.29f, -0.1f);
        pathBuilder.lineTo(7.62f, 7.62f);
        pathBuilder.lineTo(4.59f, 9.84f);
        pathBuilder.curveTo(3.93f, 10.32f, 3.0f, 9.85f, 3.0f, 9.03f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 16.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(-3.35f);
        pathBuilder.curveToRelative(-0.23f, 0.0f, -0.45f, 0.08f, -0.62f, 0.22f);
        pathBuilder.lineToRelative(-3.9f, 3.12f);
        pathBuilder.lineTo(6.6f, 12.99f);
        pathBuilder.curveToRelative(-0.35f, -0.34f, -0.88f, -0.38f, -1.27f, -0.1f);
        pathBuilder.lineToRelative(-1.9f, 1.35f);
        pathBuilder.curveTo(3.16f, 14.43f, 3.0f, 14.74f, 3.0f, 15.06f);
        pathBuilder.curveToRelative(0.0f, 0.81f, 0.92f, 1.29f, 1.58f, 0.81f);
        pathBuilder.lineTo(5.8f, 15.0f);
        pathBuilder.lineToRelative(5.57f, 5.39f);
        pathBuilder.curveToRelative(0.36f, 0.35f, 0.93f, 0.38f, 1.32f, 0.06f);
        pathBuilder.lineTo(17.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveTo(20.55f, 17.0f, 21.0f, 16.55f, 21.0f, 16.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _ssidChart = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
