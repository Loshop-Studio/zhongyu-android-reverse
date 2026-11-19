package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.PathFillType;
import androidx.compose.p014ui.graphics.SolidColor;
import androidx.compose.p014ui.graphics.StrokeCap;
import androidx.compose.p014ui.graphics.StrokeJoin;
import androidx.compose.p014ui.graphics.vector.ImageVector;
import androidx.compose.p014ui.graphics.vector.PathBuilder;
import androidx.compose.p014ui.unit.C3186Dp;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class FlakyKt {
    private static ImageVector _flaky;

    public static final ImageVector getFlaky(Icons.Rounded rounded) {
        ImageVector imageVector = _flaky;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Flaky", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int iM31160getEvenOddRgk1Os = PathFillType.Companion.m31160getEvenOddRgk1Os();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.16f, 15.72f);
        pathBuilder.curveToRelative(-0.29f, -0.29f, -0.29f, -0.77f, 0.0f, -1.06f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.29f, -0.29f, 0.77f, -0.29f, 1.06f, 0.0f);
        pathBuilder.lineToRelative(0.82f, 0.82f);
        pathBuilder.lineToRelative(1.96f, -1.96f);
        pathBuilder.curveToRelative(0.29f, -0.29f, 0.77f, -0.29f, 1.06f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0.0f, 1.06f);
        pathBuilder.lineToRelative(-2.65f, 2.65f);
        pathBuilder.curveToRelative(-0.19f, 0.19f, -0.51f, 0.2f, -0.7f, 0.0f);
        pathBuilder.lineTo(12.16f, 15.72f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.5f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.5f, 10.0f, -10.0f);
        pathBuilder.reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.87f, 6.81f);
        pathBuilder.lineToRelative(0.88f, 0.88f);
        pathBuilder.lineToRelative(0.88f, -0.88f);
        pathBuilder.curveToRelative(0.29f, -0.29f, 0.77f, -0.29f, 1.06f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0.0f, 1.06f);
        pathBuilder.lineTo(9.81f, 8.75f);
        pathBuilder.lineToRelative(0.88f, 0.88f);
        pathBuilder.curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0.0f, 1.06f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.29f, 0.29f, -0.77f, 0.29f, -1.06f, 0.0f);
        pathBuilder.lineTo(8.75f, 9.81f);
        pathBuilder.lineToRelative(-0.88f, 0.88f);
        pathBuilder.curveToRelative(-0.29f, 0.29f, -0.77f, 0.29f, -1.06f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.29f, -0.29f, -0.29f, -0.77f, 0.0f, -1.06f);
        pathBuilder.lineToRelative(0.88f, -0.88f);
        pathBuilder.lineTo(6.81f, 7.87f);
        pathBuilder.curveToRelative(-0.29f, -0.29f, -0.29f, -0.77f, 0.0f, -1.06f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(7.1f, 6.51f, 7.57f, 6.51f, 7.87f, 6.81f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.curveToRelative(-2.2f, 0.0f, -4.2f, -0.9f, -5.7f, -2.3f);
        pathBuilder.lineTo(17.7f, 6.3f);
        pathBuilder.curveTo(19.1f, 7.8f, 20.0f, 9.8f, 20.0f, 12.0f);
        pathBuilder.curveTo(20.0f, 16.4f, 16.4f, 20.0f, 12.0f, 20.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), iM31160getEvenOddRgk1Os, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flaky = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
