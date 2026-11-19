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
public final class SettingsBrightnessKt {
    private static ImageVector _settingsBrightness;

    public static final ImageVector getSettingsBrightness(Icons.Rounded rounded) {
        ImageVector imageVector = _settingsBrightness;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SettingsBrightness", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 4.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.15f, 12.35f);
        pathBuilder.lineTo(16.0f, 13.5f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.lineToRelative(-1.15f, 1.15f);
        pathBuilder.curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0.0f);
        pathBuilder.lineTo(10.5f, 16.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveTo(8.22f, 16.0f, 8.0f, 15.78f, 8.0f, 15.5f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.lineToRelative(-1.15f, -1.15f);
        pathBuilder.curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0.0f, -0.71f);
        pathBuilder.lineTo(8.0f, 10.5f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveTo(8.0f, 8.22f, 8.22f, 8.0f, 8.5f, 8.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineToRelative(1.15f, -1.15f);
        pathBuilder.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        pathBuilder.lineTo(13.5f, 8.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveTo(15.78f, 8.0f, 16.0f, 8.22f, 16.0f, 8.5f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineToRelative(1.15f, 1.15f);
        pathBuilder.curveTo(17.34f, 11.84f, 17.34f, 12.16f, 17.15f, 12.35f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 9.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder.curveTo(15.0f, 10.34f, 13.66f, 9.0f, 12.0f, 9.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsBrightness = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
