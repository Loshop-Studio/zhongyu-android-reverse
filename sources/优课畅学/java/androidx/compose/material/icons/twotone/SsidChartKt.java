package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class SsidChartKt {
    private static ImageVector _ssidChart;

    public static final ImageVector getSsidChart(Icons.TwoTone twoTone) {
        ImageVector imageVector = _ssidChart;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SsidChart", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 5.47f);
        pathBuilder.lineTo(12.0f, 12.0f);
        pathBuilder.lineTo(7.62f, 7.62f);
        pathBuilder.lineTo(3.0f, 11.0f);
        pathBuilder.verticalLineTo(8.52f);
        pathBuilder.lineTo(7.83f, 5.0f);
        pathBuilder.lineToRelative(4.38f, 4.38f);
        pathBuilder.lineTo(21.0f, 3.0f);
        pathBuilder.lineTo(21.0f, 5.47f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 15.0f);
        pathBuilder.horizontalLineToRelative(-4.7f);
        pathBuilder.lineToRelative(-4.17f, 3.34f);
        pathBuilder.lineTo(6.0f, 12.41f);
        pathBuilder.lineToRelative(-3.0f, 2.13f);
        pathBuilder.lineTo(3.0f, 17.0f);
        pathBuilder.lineToRelative(2.8f, -2.0f);
        pathBuilder.lineToRelative(6.2f, 6.0f);
        pathBuilder.lineToRelative(5.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineTo(15.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _ssidChart = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
