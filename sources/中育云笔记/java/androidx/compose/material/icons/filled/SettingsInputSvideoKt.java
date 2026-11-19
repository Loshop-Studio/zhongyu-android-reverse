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
public final class SettingsInputSvideoKt {
    private static ImageVector _settingsInputSvideo;

    public static final ImageVector getSettingsInputSvideo(Icons.Filled filled) {
        ImageVector imageVector = _settingsInputSvideo;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SettingsInputSvideo", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.0f, 11.5f);
        pathBuilder.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(5.0f, 10.67f, 5.0f, 11.5f);
        pathBuilder.reflectiveCurveTo(5.67f, 13.0f, 6.5f, 13.0f);
        pathBuilder.reflectiveCurveTo(8.0f, 12.33f, 8.0f, 11.5f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 6.5f);
        pathBuilder.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.curveTo(9.67f, 5.0f, 9.0f, 5.67f, 9.0f, 6.5f);
        pathBuilder.reflectiveCurveTo(9.67f, 8.0f, 10.5f, 8.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.close();
        pathBuilder.moveTo(8.5f, 15.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(7.67f, 18.0f, 8.5f, 18.0f);
        pathBuilder.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(9.33f, 15.0f, 8.5f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 1.0f);
        pathBuilder.curveTo(5.93f, 1.0f, 1.0f, 5.93f, 1.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.93f, 11.0f, 11.0f, 11.0f);
        pathBuilder.reflectiveCurveToRelative(11.0f, -4.93f, 11.0f, -11.0f);
        pathBuilder.reflectiveCurveTo(18.07f, 1.0f, 12.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 21.0f);
        pathBuilder.curveToRelative(-4.96f, 0.0f, -9.0f, -4.04f, -9.0f, -9.0f);
        pathBuilder.reflectiveCurveToRelative(4.04f, -9.0f, 9.0f, -9.0f);
        pathBuilder.reflectiveCurveToRelative(9.0f, 4.04f, 9.0f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(-4.04f, 9.0f, -9.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.5f, 10.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.close();
        pathBuilder.moveTo(15.5f, 15.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsInputSvideo = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
