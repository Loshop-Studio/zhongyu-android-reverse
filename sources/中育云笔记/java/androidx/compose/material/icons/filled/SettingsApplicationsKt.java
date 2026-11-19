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
public final class SettingsApplicationsKt {
    private static ImageVector _settingsApplications;

    public static final ImageVector getSettingsApplications(Icons.Filled filled) {
        ImageVector imageVector = _settingsApplications;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SettingsApplications", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 10.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
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
        pathBuilder.moveTo(17.25f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 0.23f, -0.02f, 0.46f, -0.05f, 0.68f);
        pathBuilder.lineToRelative(1.48f, 1.16f);
        pathBuilder.curveToRelative(0.13f, 0.11f, 0.17f, 0.3f, 0.08f, 0.45f);
        pathBuilder.lineToRelative(-1.4f, 2.42f);
        pathBuilder.curveToRelative(-0.09f, 0.15f, -0.27f, 0.21f, -0.43f, 0.15f);
        pathBuilder.lineToRelative(-1.74f, -0.7f);
        pathBuilder.curveToRelative(-0.36f, 0.28f, -0.76f, 0.51f, -1.18f, 0.69f);
        pathBuilder.lineToRelative(-0.26f, 1.85f);
        pathBuilder.curveToRelative(-0.03f, 0.17f, -0.18f, 0.3f, -0.35f, 0.3f);
        pathBuilder.horizontalLineToRelative(-2.8f);
        pathBuilder.curveToRelative(-0.17f, 0.0f, -0.32f, -0.13f, -0.35f, -0.29f);
        pathBuilder.lineToRelative(-0.26f, -1.85f);
        pathBuilder.curveToRelative(-0.43f, -0.18f, -0.82f, -0.41f, -1.18f, -0.69f);
        pathBuilder.lineToRelative(-1.74f, 0.7f);
        pathBuilder.curveToRelative(-0.16f, 0.06f, -0.34f, 0.0f, -0.43f, -0.15f);
        pathBuilder.lineToRelative(-1.4f, -2.42f);
        pathBuilder.curveToRelative(-0.09f, -0.15f, -0.05f, -0.34f, 0.08f, -0.45f);
        pathBuilder.lineToRelative(1.48f, -1.16f);
        pathBuilder.curveToRelative(-0.03f, -0.23f, -0.05f, -0.46f, -0.05f, -0.69f);
        pathBuilder.curveToRelative(0.0f, -0.23f, 0.02f, -0.46f, 0.05f, -0.68f);
        pathBuilder.lineToRelative(-1.48f, -1.16f);
        pathBuilder.curveToRelative(-0.13f, -0.11f, -0.17f, -0.3f, -0.08f, -0.45f);
        pathBuilder.lineToRelative(1.4f, -2.42f);
        pathBuilder.curveToRelative(0.09f, -0.15f, 0.27f, -0.21f, 0.43f, -0.15f);
        pathBuilder.lineToRelative(1.74f, 0.7f);
        pathBuilder.curveToRelative(0.36f, -0.28f, 0.76f, -0.51f, 1.18f, -0.69f);
        pathBuilder.lineToRelative(0.26f, -1.85f);
        pathBuilder.curveToRelative(0.03f, -0.17f, 0.18f, -0.3f, 0.35f, -0.3f);
        pathBuilder.horizontalLineToRelative(2.8f);
        pathBuilder.curveToRelative(0.17f, 0.0f, 0.32f, 0.13f, 0.35f, 0.29f);
        pathBuilder.lineToRelative(0.26f, 1.85f);
        pathBuilder.curveToRelative(0.43f, 0.18f, 0.82f, 0.41f, 1.18f, 0.69f);
        pathBuilder.lineToRelative(1.74f, -0.7f);
        pathBuilder.curveToRelative(0.16f, -0.06f, 0.34f, 0.0f, 0.43f, 0.15f);
        pathBuilder.lineToRelative(1.4f, 2.42f);
        pathBuilder.curveToRelative(0.09f, 0.15f, 0.05f, 0.34f, -0.08f, 0.45f);
        pathBuilder.lineToRelative(-1.48f, 1.16f);
        pathBuilder.curveToRelative(0.03f, 0.23f, 0.05f, 0.46f, 0.05f, 0.69f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsApplications = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
