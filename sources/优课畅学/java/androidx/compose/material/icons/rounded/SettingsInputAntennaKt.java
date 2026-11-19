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
public final class SettingsInputAntennaKt {
    private static ImageVector _settingsInputAntenna;

    public static final ImageVector getSettingsInputAntenna(Icons.Rounded rounded) {
        ImageVector imageVector = _settingsInputAntenna;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SettingsInputAntenna", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 5.0f);
        pathBuilder.curveToRelative(-3.48f, 0.0f, -6.37f, 2.54f, -6.91f, 5.87f);
        pathBuilder.curveToRelative(-0.1f, 0.59f, 0.39f, 1.13f, 1.0f, 1.13f);
        pathBuilder.curveToRelative(0.49f, 0.0f, 0.9f, -0.36f, 0.98f, -0.85f);
        pathBuilder.curveTo(7.48f, 8.79f, 9.53f, 7.0f, 12.0f, 7.0f);
        pathBuilder.reflectiveCurveToRelative(4.52f, 1.79f, 4.93f, 4.15f);
        pathBuilder.curveToRelative(0.08f, 0.49f, 0.49f, 0.85f, 0.98f, 0.85f);
        pathBuilder.curveToRelative(0.61f, 0.0f, 1.09f, -0.54f, 0.99f, -1.13f);
        pathBuilder.curveTo(18.37f, 7.54f, 15.48f, 5.0f, 12.0f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 14.29f);
        pathBuilder.curveToRelative(1.07f, -0.48f, 1.76f, -1.66f, 1.41f, -2.99f);
        pathBuilder.curveToRelative(-0.22f, -0.81f, -0.87f, -1.47f, -1.68f, -1.7f);
        pathBuilder.curveTo(11.04f, 9.12f, 9.5f, 10.38f, 9.5f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.02f, 0.62f, 1.9f, 1.5f, 2.29f);
        pathBuilder.verticalLineToRelative(3.3f);
        pathBuilder.lineToRelative(-2.71f, 2.7f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(2.3f, -2.3f);
        pathBuilder.lineToRelative(2.3f, 2.3f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineTo(13.0f, 17.59f);
        pathBuilder.verticalLineTo(14.29f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 1.0f);
        pathBuilder.curveTo(6.3f, 1.0f, 1.61f, 5.34f, 1.05f, 10.9f);
        pathBuilder.curveTo(1.0f, 11.49f, 1.46f, 12.0f, 2.05f, 12.0f);
        pathBuilder.curveToRelative(0.51f, 0.0f, 0.94f, -0.38f, 0.99f, -0.88f);
        pathBuilder.curveTo(3.48f, 6.56f, 7.33f, 3.0f, 12.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(8.52f, 3.56f, 8.96f, 8.12f);
        pathBuilder.curveToRelative(0.05f, 0.5f, 0.48f, 0.88f, 0.99f, 0.88f);
        pathBuilder.curveToRelative(0.59f, 0.0f, 1.06f, -0.51f, 1.0f, -1.1f);
        pathBuilder.curveTo(22.39f, 5.34f, 17.7f, 1.0f, 12.0f, 1.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsInputAntenna = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
