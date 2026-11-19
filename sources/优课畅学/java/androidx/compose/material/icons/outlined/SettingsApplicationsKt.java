package androidx.compose.material.icons.outlined;

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
public final class SettingsApplicationsKt {
    private static ImageVector _settingsApplications;

    public static final ImageVector getSettingsApplications(Icons.Outlined outlined) {
        ImageVector imageVector = _settingsApplications;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SettingsApplications", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.21f, 13.97f);
        pathBuilder.lineToRelative(1.2f, 2.07f);
        pathBuilder.curveToRelative(0.08f, 0.13f, 0.23f, 0.18f, 0.37f, 0.13f);
        pathBuilder.lineToRelative(1.49f, -0.6f);
        pathBuilder.curveToRelative(0.31f, 0.24f, 0.64f, 0.44f, 1.01f, 0.59f);
        pathBuilder.lineToRelative(0.22f, 1.59f);
        pathBuilder.curveToRelative(0.03f, 0.14f, 0.15f, 0.25f, 0.3f, 0.25f);
        pathBuilder.horizontalLineToRelative(2.4f);
        pathBuilder.curveToRelative(0.15f, 0.0f, 0.27f, -0.11f, 0.3f, -0.26f);
        pathBuilder.lineToRelative(0.22f, -1.59f);
        pathBuilder.curveToRelative(0.36f, -0.15f, 0.7f, -0.35f, 1.01f, -0.59f);
        pathBuilder.lineToRelative(1.49f, 0.6f);
        pathBuilder.curveToRelative(0.14f, 0.05f, 0.29f, 0.0f, 0.37f, -0.13f);
        pathBuilder.lineToRelative(1.2f, -2.07f);
        pathBuilder.curveToRelative(0.08f, -0.13f, 0.04f, -0.29f, -0.07f, -0.39f);
        pathBuilder.lineToRelative(-1.27f, -0.99f);
        pathBuilder.curveToRelative(0.03f, -0.19f, 0.04f, -0.39f, 0.04f, -0.58f);
        pathBuilder.curveToRelative(0.0f, -0.2f, -0.02f, -0.39f, -0.04f, -0.59f);
        pathBuilder.lineToRelative(1.27f, -0.99f);
        pathBuilder.curveToRelative(0.11f, -0.09f, 0.15f, -0.26f, 0.07f, -0.39f);
        pathBuilder.lineToRelative(-1.2f, -2.07f);
        pathBuilder.curveToRelative(-0.08f, -0.13f, -0.23f, -0.18f, -0.37f, -0.13f);
        pathBuilder.lineToRelative(-1.49f, 0.6f);
        pathBuilder.curveToRelative(-0.31f, -0.24f, -0.64f, -0.44f, -1.01f, -0.59f);
        pathBuilder.lineToRelative(-0.22f, -1.59f);
        pathBuilder.curveToRelative(-0.03f, -0.14f, -0.15f, -0.25f, -0.3f, -0.25f);
        pathBuilder.horizontalLineToRelative(-2.4f);
        pathBuilder.curveToRelative(-0.15f, 0.0f, -0.27f, 0.11f, -0.3f, 0.26f);
        pathBuilder.lineToRelative(-0.22f, 1.59f);
        pathBuilder.curveToRelative(-0.36f, 0.15f, -0.71f, 0.34f, -1.01f, 0.58f);
        pathBuilder.lineToRelative(-1.49f, -0.6f);
        pathBuilder.curveToRelative(-0.14f, -0.05f, -0.29f, 0.0f, -0.37f, 0.13f);
        pathBuilder.lineToRelative(-1.2f, 2.07f);
        pathBuilder.curveToRelative(-0.08f, 0.13f, -0.04f, 0.29f, 0.07f, 0.39f);
        pathBuilder.lineToRelative(1.27f, 0.99f);
        pathBuilder.curveToRelative(-0.03f, 0.2f, -0.05f, 0.39f, -0.05f, 0.59f);
        pathBuilder.curveToRelative(0.0f, 0.2f, 0.02f, 0.39f, 0.04f, 0.59f);
        pathBuilder.lineToRelative(-1.27f, 0.99f);
        pathBuilder.curveToRelative(-0.11f, 0.1f, -0.14f, 0.26f, -0.06f, 0.39f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 10.29f);
        pathBuilder.curveToRelative(0.94f, 0.0f, 1.71f, 0.77f, 1.71f, 1.71f);
        pathBuilder.reflectiveCurveToRelative(-0.77f, 1.71f, -1.71f, 1.71f);
        pathBuilder.reflectiveCurveToRelative(-1.71f, -0.77f, -1.71f, -1.71f);
        pathBuilder.reflectiveCurveToRelative(0.77f, -1.71f, 1.71f, -1.71f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 3.0f);
        pathBuilder.lineTo(5.0f, 3.0f);
        pathBuilder.curveToRelative(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineTo(21.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 19.0f);
        pathBuilder.lineTo(5.0f, 19.0f);
        pathBuilder.lineTo(5.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsApplications = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
