package androidx.compose.material.icons.filled;

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
public final class PedalBikeKt {
    private static ImageVector _pedalBike;

    public static final ImageVector getPedalBike(Icons.Filled filled) {
        ImageVector imageVector = _pedalBike;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PedalBike", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.18f, 10.0f);
        pathBuilder.lineToRelative(-1.7f, -4.68f);
        pathBuilder.curveTo(16.19f, 4.53f, 15.44f, 4.0f, 14.6f, 4.0f);
        pathBuilder.horizontalLineTo(12.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.6f);
        pathBuilder.lineToRelative(1.46f, 4.0f);
        pathBuilder.horizontalLineToRelative(-4.81f);
        pathBuilder.lineToRelative(-0.36f, -1.0f);
        pathBuilder.horizontalLineTo(12.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(1.75f);
        pathBuilder.lineToRelative(1.82f, 5.0f);
        pathBuilder.horizontalLineTo(9.9f);
        pathBuilder.curveToRelative(-0.44f, -2.23f, -2.31f, -3.88f, -4.65f, -3.99f);
        pathBuilder.curveTo(2.45f, 9.87f, 0.0f, 12.2f, 0.0f, 15.0f);
        pathBuilder.curveToRelative(0.0f, 2.8f, 2.2f, 5.0f, 5.0f, 5.0f);
        pathBuilder.curveToRelative(2.46f, 0.0f, 4.45f, -1.69f, 4.9f, -4.0f);
        pathBuilder.horizontalLineToRelative(4.2f);
        pathBuilder.curveToRelative(0.44f, 2.23f, 2.31f, 3.88f, 4.65f, 3.99f);
        pathBuilder.curveToRelative(2.8f, 0.13f, 5.25f, -2.19f, 5.25f, -5.0f);
        pathBuilder.curveToRelative(0.0f, -2.8f, -2.2f, -5.0f, -5.0f, -5.0f);
        pathBuilder.horizontalLineTo(18.18f);
        pathBuilder.close();
        pathBuilder.moveTo(7.82f, 16.0f);
        pathBuilder.curveToRelative(-0.4f, 1.17f, -1.49f, 2.0f, -2.82f, 2.0f);
        pathBuilder.curveToRelative(-1.68f, 0.0f, -3.0f, -1.32f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(1.32f, -3.0f, 3.0f, -3.0f);
        pathBuilder.curveToRelative(1.33f, 0.0f, 2.42f, 0.83f, 2.82f, 2.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(7.82f);
        pathBuilder.close();
        pathBuilder.moveTo(14.1f, 14.0f);
        pathBuilder.horizontalLineToRelative(-1.4f);
        pathBuilder.lineToRelative(-0.73f, -2.0f);
        pathBuilder.horizontalLineTo(15.0f);
        pathBuilder.curveTo(14.56f, 12.58f, 14.24f, 13.25f, 14.1f, 14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 18.0f);
        pathBuilder.curveToRelative(-1.68f, 0.0f, -3.0f, -1.32f, -3.0f, -3.0f);
        pathBuilder.curveToRelative(0.0f, -0.93f, 0.41f, -1.73f, 1.05f, -2.28f);
        pathBuilder.lineToRelative(0.96f, 2.64f);
        pathBuilder.lineToRelative(1.88f, -0.68f);
        pathBuilder.lineToRelative(-0.97f, -2.67f);
        pathBuilder.curveToRelative(0.03f, 0.0f, 0.06f, -0.01f, 0.09f, -0.01f);
        pathBuilder.curveToRelative(1.68f, 0.0f, 3.0f, 1.32f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveTo(20.68f, 18.0f, 19.0f, 18.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pedalBike = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
