package androidx.compose.material.icons.sharp;

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
public final class PrecisionManufacturingKt {
    private static ImageVector _precisionManufacturing;

    public static final ImageVector getPrecisionManufacturing(Icons.Sharp sharp) {
        ImageVector imageVector = _precisionManufacturing;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PrecisionManufacturing", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 10.0f);
        pathBuilder.verticalLineTo(9.82f);
        pathBuilder.lineToRelative(2.01f, 2.01f);
        pathBuilder.lineToRelative(5.23f, -2.44f);
        pathBuilder.lineToRelative(-0.63f, -1.36f);
        pathBuilder.lineToRelative(-4.28f, 2.0f);
        pathBuilder.lineTo(14.0f, 7.7f);
        pathBuilder.verticalLineTo(6.3f);
        pathBuilder.lineToRelative(2.33f, -2.33f);
        pathBuilder.lineToRelative(4.28f, 2.0f);
        pathBuilder.lineToRelative(0.63f, -1.36f);
        pathBuilder.lineToRelative(-5.23f, -2.44f);
        pathBuilder.lineTo(14.0f, 4.18f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(8.82f);
        pathBuilder.curveTo(8.4f, 4.84f, 7.3f, 4.0f, 6.0f, 4.0f);
        pathBuilder.curveTo(4.34f, 4.0f, 3.0f, 5.34f, 3.0f, 7.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.6f, 2.05f, 1.48f, 2.58f);
        pathBuilder.lineTo(7.08f, 18.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(13.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(-3.62f);
        pathBuilder.lineTo(8.41f, 8.76f);
        pathBuilder.curveTo(8.58f, 8.53f, 8.72f, 8.28f, 8.82f, 8.0f);
        pathBuilder.horizontalLineTo(12.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 8.0f);
        pathBuilder.curveTo(5.45f, 8.0f, 5.0f, 7.55f, 5.0f, 7.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.curveTo(7.0f, 7.55f, 6.55f, 8.0f, 6.0f, 8.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _precisionManufacturing = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
