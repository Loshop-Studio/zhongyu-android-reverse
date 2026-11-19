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
public final class PanToolKt {
    private static ImageVector _panTool;

    public static final ImageVector getPanTool(Icons.Rounded rounded) {
        ImageVector imageVector = _panTool;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PanTool", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.5f, 4.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilder.reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(16.0f, 1.67f, 16.0f, 2.5f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilder.reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.verticalLineToRelative(-9.0f);
        pathBuilder.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(12.0f, 0.67f, 12.0f, 1.5f);
        pathBuilder.verticalLineToRelative(8.99f);
        pathBuilder.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilder.reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.verticalLineTo(4.5f);
        pathBuilder.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(8.0f, 3.67f, 8.0f, 4.5f);
        pathBuilder.verticalLineToRelative(11.41f);
        pathBuilder.lineToRelative(-4.12f, -2.35f);
        pathBuilder.curveToRelative(-0.58f, -0.33f, -1.3f, -0.24f, -1.78f, 0.22f);
        pathBuilder.curveToRelative(-0.6f, 0.58f, -0.62f, 1.54f, -0.03f, 2.13f);
        pathBuilder.lineToRelative(6.78f, 6.89f);
        pathBuilder.curveToRelative(0.75f, 0.77f, 1.77f, 1.2f, 2.85f, 1.2f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder.verticalLineTo(5.5f);
        pathBuilder.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panTool = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
