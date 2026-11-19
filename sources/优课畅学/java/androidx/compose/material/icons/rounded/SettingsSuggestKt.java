package androidx.compose.material.icons.rounded;

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
public final class SettingsSuggestKt {
    private static ImageVector _settingsSuggest;

    public static final ImageVector getSettingsSuggest(Icons.Rounded rounded) {
        ImageVector imageVector = _settingsSuggest;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SettingsSuggest", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.04f, 7.99f);
        pathBuilder.lineToRelative(-0.63f, -1.4f);
        pathBuilder.lineToRelative(-1.4f, -0.63f);
        pathBuilder.curveToRelative(-0.39f, -0.18f, -0.39f, -0.73f, 0.0f, -0.91f);
        pathBuilder.lineToRelative(1.4f, -0.63f);
        pathBuilder.lineToRelative(0.63f, -1.4f);
        pathBuilder.curveToRelative(0.18f, -0.39f, 0.73f, -0.39f, 0.91f, 0.0f);
        pathBuilder.lineToRelative(0.63f, 1.4f);
        pathBuilder.lineToRelative(1.4f, 0.63f);
        pathBuilder.curveToRelative(0.39f, 0.18f, 0.39f, 0.73f, 0.0f, 0.91f);
        pathBuilder.lineToRelative(-1.4f, 0.63f);
        pathBuilder.lineToRelative(-0.63f, 1.4f);
        pathBuilder.curveTo(18.78f, 8.38f, 18.22f, 8.38f, 18.04f, 7.99f);
        pathBuilder.close();
        pathBuilder.moveTo(21.28f, 12.72f);
        pathBuilder.lineTo(20.96f, 12.0f);
        pathBuilder.curveToRelative(-0.18f, -0.39f, -0.73f, -0.39f, -0.91f, 0.0f);
        pathBuilder.lineToRelative(-0.32f, 0.72f);
        pathBuilder.lineTo(19.0f, 13.04f);
        pathBuilder.curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        pathBuilder.lineToRelative(0.72f, 0.32f);
        pathBuilder.lineTo(20.04f, 15.0f);
        pathBuilder.curveToRelative(0.18f, 0.39f, 0.73f, 0.39f, 0.91f, 0.0f);
        pathBuilder.lineToRelative(0.32f, -0.72f);
        pathBuilder.lineTo(22.0f, 13.96f);
        pathBuilder.curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        pathBuilder.lineTo(21.28f, 12.72f);
        pathBuilder.close();
        pathBuilder.moveTo(16.24f, 14.37f);
        pathBuilder.lineToRelative(1.23f, 0.93f);
        pathBuilder.curveToRelative(0.4f, 0.3f, 0.51f, 0.86f, 0.26f, 1.3f);
        pathBuilder.lineToRelative(-1.62f, 2.8f);
        pathBuilder.curveToRelative(-0.25f, 0.44f, -0.79f, 0.62f, -1.25f, 0.42f);
        pathBuilder.lineToRelative(-1.43f, -0.6f);
        pathBuilder.curveToRelative(-0.2f, 0.13f, -0.42f, 0.26f, -0.64f, 0.37f);
        pathBuilder.lineToRelative(-0.19f, 1.54f);
        pathBuilder.curveToRelative(-0.06f, 0.5f, -0.49f, 0.88f, -0.99f, 0.88f);
        pathBuilder.horizontalLineTo(8.38f);
        pathBuilder.curveToRelative(-0.5f, 0.0f, -0.93f, -0.38f, -0.99f, -0.88f);
        pathBuilder.lineTo(7.2f, 19.59f);
        pathBuilder.curveToRelative(-0.22f, -0.11f, -0.43f, -0.23f, -0.64f, -0.37f);
        pathBuilder.lineToRelative(-1.43f, 0.6f);
        pathBuilder.curveToRelative(-0.46f, 0.2f, -1.0f, 0.02f, -1.25f, -0.42f);
        pathBuilder.lineToRelative(-1.62f, -2.8f);
        pathBuilder.curveToRelative(-0.25f, -0.44f, -0.14f, -0.99f, 0.26f, -1.3f);
        pathBuilder.lineToRelative(1.23f, -0.93f);
        pathBuilder.curveTo(3.75f, 14.25f, 3.75f, 14.12f, 3.75f, 14.0f);
        pathBuilder.reflectiveCurveToRelative(0.0f, -0.25f, 0.01f, -0.37f);
        pathBuilder.lineTo(2.53f, 12.7f);
        pathBuilder.curveToRelative(-0.4f, -0.3f, -0.51f, -0.86f, -0.26f, -1.3f);
        pathBuilder.lineToRelative(1.62f, -2.8f);
        pathBuilder.curveToRelative(0.25f, -0.44f, 0.79f, -0.62f, 1.25f, -0.42f);
        pathBuilder.lineToRelative(1.43f, 0.6f);
        pathBuilder.curveToRelative(0.2f, -0.13f, 0.42f, -0.26f, 0.64f, -0.37f);
        pathBuilder.lineToRelative(0.19f, -1.54f);
        pathBuilder.curveTo(7.45f, 6.38f, 7.88f, 6.0f, 8.38f, 6.0f);
        pathBuilder.horizontalLineToRelative(3.23f);
        pathBuilder.curveToRelative(0.5f, 0.0f, 0.93f, 0.38f, 0.99f, 0.88f);
        pathBuilder.lineToRelative(0.19f, 1.54f);
        pathBuilder.curveToRelative(0.22f, 0.11f, 0.43f, 0.23f, 0.64f, 0.37f);
        pathBuilder.lineToRelative(1.43f, -0.6f);
        pathBuilder.curveToRelative(0.46f, -0.2f, 1.0f, -0.02f, 1.25f, 0.42f);
        pathBuilder.lineToRelative(1.62f, 2.8f);
        pathBuilder.curveToRelative(0.25f, 0.44f, 0.14f, 0.99f, -0.26f, 1.3f);
        pathBuilder.lineToRelative(-1.23f, 0.93f);
        pathBuilder.curveToRelative(0.01f, 0.12f, 0.01f, 0.24f, 0.01f, 0.37f);
        pathBuilder.reflectiveCurveTo(16.25f, 14.25f, 16.24f, 14.37f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 14.0f);
        pathBuilder.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(-3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveTo(13.0f, 15.66f, 13.0f, 14.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsSuggest = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
