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
public final class SettingsBackupRestoreKt {
    private static ImageVector _settingsBackupRestore;

    public static final ImageVector getSettingsBackupRestore(Icons.Rounded rounded) {
        ImageVector imageVector = _settingsBackupRestore;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SettingsBackupRestore", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.77f, 3.0f);
        pathBuilder.curveToRelative(-2.65f, 0.07f, -5.0f, 1.28f, -6.6f, 3.16f);
        pathBuilder.lineTo(3.85f, 4.85f);
        pathBuilder.curveTo(3.54f, 4.54f, 3.0f, 4.76f, 3.0f, 5.21f);
        pathBuilder.verticalLineTo(9.5f);
        pathBuilder.curveTo(3.0f, 9.78f, 3.22f, 10.0f, 3.5f, 10.0f);
        pathBuilder.horizontalLineToRelative(4.29f);
        pathBuilder.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        pathBuilder.lineTo(6.59f, 7.59f);
        pathBuilder.curveTo(7.88f, 6.02f, 9.82f, 5.0f, 12.0f, 5.0f);
        pathBuilder.curveToRelative(4.32f, 0.0f, 7.74f, 3.94f, 6.86f, 8.41f);
        pathBuilder.curveToRelative(-0.54f, 2.77f, -2.81f, 4.98f, -5.58f, 5.47f);
        pathBuilder.curveToRelative(-3.8f, 0.68f, -7.18f, -1.74f, -8.05f, -5.16f);
        pathBuilder.curveTo(5.11f, 13.3f, 4.71f, 13.0f, 4.27f, 13.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.65f, 0.0f, -1.14f, 0.61f, -0.98f, 1.23f);
        pathBuilder.curveTo(4.28f, 18.12f, 7.8f, 21.0f, 12.0f, 21.0f);
        pathBuilder.curveToRelative(5.06f, 0.0f, 9.14f, -4.17f, 9.0f, -9.26f);
        pathBuilder.curveTo(20.86f, 6.86f, 16.65f, 2.88f, 11.77f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(14.0f, 13.1f, 14.0f, 12.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsBackupRestore = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
