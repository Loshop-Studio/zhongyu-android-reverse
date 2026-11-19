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
public final class SettingsSuggestKt {
    private static ImageVector _settingsSuggest;

    public static final ImageVector getSettingsSuggest(Icons.Sharp sharp) {
        ImageVector imageVector = _settingsSuggest;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SettingsSuggest", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.41f, 6.59f);
        pathBuilder.lineTo(15.0f, 5.5f);
        pathBuilder.lineToRelative(2.41f, -1.09f);
        pathBuilder.lineTo(18.5f, 2.0f);
        pathBuilder.lineToRelative(1.09f, 2.41f);
        pathBuilder.lineTo(22.0f, 5.5f);
        pathBuilder.lineToRelative(-2.41f, 1.09f);
        pathBuilder.lineTo(18.5f, 9.0f);
        pathBuilder.lineTo(17.41f, 6.59f);
        pathBuilder.close();
        pathBuilder.moveTo(21.28f, 12.72f);
        pathBuilder.lineTo(20.5f, 11.0f);
        pathBuilder.lineToRelative(-0.78f, 1.72f);
        pathBuilder.lineTo(18.0f, 13.5f);
        pathBuilder.lineToRelative(1.72f, 0.78f);
        pathBuilder.lineTo(20.5f, 16.0f);
        pathBuilder.lineToRelative(0.78f, -1.72f);
        pathBuilder.lineTo(23.0f, 13.5f);
        pathBuilder.lineTo(21.28f, 12.72f);
        pathBuilder.close();
        pathBuilder.moveTo(16.24f, 14.37f);
        pathBuilder.lineToRelative(1.94f, 1.47f);
        pathBuilder.lineToRelative(-2.5f, 4.33f);
        pathBuilder.lineToRelative(-2.24f, -0.94f);
        pathBuilder.curveToRelative(-0.2f, 0.13f, -0.42f, 0.26f, -0.64f, 0.37f);
        pathBuilder.lineTo(12.5f, 22.0f);
        pathBuilder.horizontalLineToRelative(-5.0f);
        pathBuilder.lineToRelative(-0.3f, -2.41f);
        pathBuilder.curveToRelative(-0.22f, -0.11f, -0.43f, -0.23f, -0.64f, -0.37f);
        pathBuilder.lineToRelative(-2.24f, 0.94f);
        pathBuilder.lineToRelative(-2.5f, -4.33f);
        pathBuilder.lineToRelative(1.94f, -1.47f);
        pathBuilder.curveTo(3.75f, 14.25f, 3.75f, 14.12f, 3.75f, 14.0f);
        pathBuilder.reflectiveCurveToRelative(0.0f, -0.25f, 0.01f, -0.37f);
        pathBuilder.lineToRelative(-1.94f, -1.47f);
        pathBuilder.lineToRelative(2.5f, -4.33f);
        pathBuilder.lineToRelative(2.24f, 0.94f);
        pathBuilder.curveToRelative(0.2f, -0.13f, 0.42f, -0.26f, 0.64f, -0.37f);
        pathBuilder.lineTo(7.5f, 6.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.lineToRelative(0.3f, 2.41f);
        pathBuilder.curveToRelative(0.22f, 0.11f, 0.43f, 0.23f, 0.64f, 0.37f);
        pathBuilder.lineToRelative(2.24f, -0.94f);
        pathBuilder.lineToRelative(2.5f, 4.33f);
        pathBuilder.lineToRelative(-1.94f, 1.47f);
        pathBuilder.curveToRelative(0.01f, 0.12f, 0.01f, 0.24f, 0.01f, 0.37f);
        pathBuilder.reflectiveCurveTo(16.25f, 14.25f, 16.24f, 14.37f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 14.0f);
        pathBuilder.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(-3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveTo(13.0f, 15.66f, 13.0f, 14.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsSuggest = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
