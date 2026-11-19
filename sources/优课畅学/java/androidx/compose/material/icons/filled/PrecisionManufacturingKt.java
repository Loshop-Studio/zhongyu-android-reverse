package androidx.compose.material.icons.filled;

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
public final class PrecisionManufacturingKt {
    private static ImageVector _precisionManufacturing;

    public static final ImageVector getPrecisionManufacturing(Icons.Filled filled) {
        ImageVector imageVector = _precisionManufacturing;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PrecisionManufacturing", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.93f, 8.21f);
        pathBuilder.lineToRelative(-3.6f, 1.68f);
        pathBuilder.lineTo(14.0f, 7.7f);
        pathBuilder.verticalLineTo(6.3f);
        pathBuilder.lineToRelative(2.33f, -2.19f);
        pathBuilder.lineToRelative(3.6f, 1.68f);
        pathBuilder.curveToRelative(0.38f, 0.18f, 0.82f, 0.01f, 1.0f, -0.36f);
        pathBuilder.curveToRelative(0.18f, -0.38f, 0.01f, -0.82f, -0.36f, -1.0f);
        pathBuilder.lineTo(16.65f, 2.6f);
        pathBuilder.curveToRelative(-0.38f, -0.18f, -0.83f, -0.1f, -1.13f, 0.2f);
        pathBuilder.lineToRelative(-1.74f, 1.6f);
        pathBuilder.curveTo(13.6f, 4.16f, 13.32f, 4.0f, 13.0f, 4.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineTo(8.82f);
        pathBuilder.curveTo(8.34f, 4.65f, 6.98f, 3.73f, 5.4f, 4.07f);
        pathBuilder.curveTo(4.24f, 4.32f, 3.25f, 5.32f, 3.04f, 6.5f);
        pathBuilder.curveTo(2.82f, 7.82f, 3.5f, 8.97f, 4.52f, 9.58f);
        pathBuilder.lineTo(7.08f, 18.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(13.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(-3.62f);
        pathBuilder.lineTo(8.41f, 8.77f);
        pathBuilder.curveTo(8.58f, 8.53f, 8.72f, 8.28f, 8.82f, 8.0f);
        pathBuilder.horizontalLineTo(12.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.curveToRelative(0.32f, 0.0f, 0.6f, -0.16f, 0.78f, -0.4f);
        pathBuilder.lineToRelative(1.74f, 1.6f);
        pathBuilder.curveToRelative(0.3f, 0.3f, 0.75f, 0.38f, 1.13f, 0.2f);
        pathBuilder.lineToRelative(3.92f, -1.83f);
        pathBuilder.curveToRelative(0.38f, -0.18f, 0.54f, -0.62f, 0.36f, -1.0f);
        pathBuilder.curveTo(20.75f, 8.2f, 20.31f, 8.03f, 19.93f, 8.21f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 8.0f);
        pathBuilder.curveTo(5.45f, 8.0f, 5.0f, 7.55f, 5.0f, 7.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(6.55f, 8.0f, 6.0f, 8.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _precisionManufacturing = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
