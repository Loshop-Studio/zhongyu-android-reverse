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
public final class PanToolKt {
    private static ImageVector _panTool;

    public static final ImageVector getPanTool(Icons.Filled filled) {
        ImageVector imageVector = _panTool;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PanTool", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(23.0f, 5.5f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.curveToRelative(0.0f, 2.2f, -1.8f, 4.0f, -4.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(-7.3f);
        pathBuilder.curveToRelative(-1.08f, 0.0f, -2.1f, -0.43f, -2.85f, -1.19f);
        pathBuilder.lineTo(1.0f, 14.83f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 1.26f, -1.23f, 1.3f, -1.25f);
        pathBuilder.curveToRelative(0.22f, -0.19f, 0.49f, -0.29f, 0.79f, -0.29f);
        pathBuilder.curveToRelative(0.22f, 0.0f, 0.42f, 0.06f, 0.6f, 0.16f);
        pathBuilder.curveTo(3.73f, 13.46f, 8.0f, 15.91f, 8.0f, 15.91f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(11.0f, 3.17f, 11.0f, 4.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(1.5f);
        pathBuilder.curveTo(12.0f, 0.67f, 12.67f, 0.0f, 13.5f, 0.0f);
        pathBuilder.reflectiveCurveTo(15.0f, 0.67f, 15.0f, 1.5f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(2.5f);
        pathBuilder.curveTo(16.0f, 1.67f, 16.67f, 1.0f, 17.5f, 1.0f);
        pathBuilder.reflectiveCurveTo(19.0f, 1.67f, 19.0f, 2.5f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(5.5f);
        pathBuilder.curveTo(20.0f, 4.67f, 20.67f, 4.0f, 21.5f, 4.0f);
        pathBuilder.reflectiveCurveTo(23.0f, 4.67f, 23.0f, 5.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panTool = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
