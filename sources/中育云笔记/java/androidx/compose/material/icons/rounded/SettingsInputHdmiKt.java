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
public final class SettingsInputHdmiKt {
    private static ImageVector _settingsInputHdmi;

    public static final ImageVector getSettingsInputHdmi(Icons.Rounded rounded) {
        ImageVector imageVector = _settingsInputHdmi;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SettingsInputHdmi", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 7.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.curveTo(6.9f, 2.0f, 6.0f, 2.9f, 6.0f, 4.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.curveTo(5.45f, 7.0f, 5.0f, 7.45f, 5.0f, 8.0f);
        pathBuilder.verticalLineToRelative(4.7f);
        pathBuilder.curveToRelative(0.0f, 0.2f, 0.06f, 0.39f, 0.17f, 0.55f);
        pathBuilder.lineTo(8.0f, 19.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.lineToRelative(2.83f, -5.75f);
        pathBuilder.curveTo(18.94f, 13.09f, 19.0f, 12.89f, 19.0f, 12.7f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.curveTo(19.0f, 7.45f, 18.55f, 7.0f, 18.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(5.5f);
        pathBuilder.curveTo(14.0f, 5.22f, 13.78f, 5.0f, 13.5f, 5.0f);
        pathBuilder.reflectiveCurveTo(13.0f, 5.22f, 13.0f, 5.5f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(5.5f);
        pathBuilder.curveTo(11.0f, 5.22f, 10.78f, 5.0f, 10.5f, 5.0f);
        pathBuilder.reflectiveCurveTo(10.0f, 5.22f, 10.0f, 5.5f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsInputHdmi = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
