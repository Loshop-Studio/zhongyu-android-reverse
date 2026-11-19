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
public final class SettingsApplicationsKt {
    private static ImageVector _settingsApplications;

    public static final ImageVector getSettingsApplications(Icons.Rounded rounded) {
        ImageVector imageVector = _settingsApplications;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SettingsApplications", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 12.0f);
        pathBuilder.moveToRelative(-2.0f, 0.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(19.0f, 3.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.curveTo(3.89f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilder2.verticalLineToRelative(14.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(14.0f);
        pathBuilder2.curveToRelative(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.verticalLineTo(5.0f);
        pathBuilder2.curveTo(21.0f, 3.9f, 20.11f, 3.0f, 19.0f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.75f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 0.22f, -0.03f, 0.42f, -0.06f, 0.63f);
        pathBuilder2.lineToRelative(0.84f, 0.73f);
        pathBuilder2.curveToRelative(0.18f, 0.16f, 0.22f, 0.42f, 0.1f, 0.63f);
        pathBuilder2.lineToRelative(-0.59f, 1.02f);
        pathBuilder2.curveToRelative(-0.12f, 0.21f, -0.37f, 0.3f, -0.59f, 0.22f);
        pathBuilder2.lineToRelative(-1.06f, -0.36f);
        pathBuilder2.curveToRelative(-0.32f, 0.27f, -0.68f, 0.48f, -1.08f, 0.63f);
        pathBuilder2.lineToRelative(-0.22f, 1.09f);
        pathBuilder2.curveToRelative(-0.05f, 0.23f, -0.25f, 0.4f, -0.49f, 0.4f);
        pathBuilder2.horizontalLineToRelative(-1.18f);
        pathBuilder2.curveToRelative(-0.24f, 0.0f, -0.44f, -0.17f, -0.49f, -0.4f);
        pathBuilder2.lineToRelative(-0.22f, -1.09f);
        pathBuilder2.curveToRelative(-0.4f, -0.15f, -0.76f, -0.36f, -1.08f, -0.63f);
        pathBuilder2.lineToRelative(-1.06f, 0.36f);
        pathBuilder2.curveToRelative(-0.23f, 0.08f, -0.47f, -0.02f, -0.59f, -0.22f);
        pathBuilder2.lineToRelative(-0.59f, -1.02f);
        pathBuilder2.curveToRelative(-0.12f, -0.21f, -0.08f, -0.47f, 0.1f, -0.63f);
        pathBuilder2.lineToRelative(0.84f, -0.73f);
        pathBuilder2.curveTo(8.28f, 12.42f, 8.25f, 12.22f, 8.25f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(0.03f, -0.42f, 0.06f, -0.63f);
        pathBuilder2.lineToRelative(-0.84f, -0.73f);
        pathBuilder2.curveToRelative(-0.18f, -0.16f, -0.22f, -0.42f, -0.1f, -0.63f);
        pathBuilder2.lineToRelative(0.59f, -1.02f);
        pathBuilder2.curveToRelative(0.12f, -0.21f, 0.37f, -0.3f, 0.59f, -0.22f);
        pathBuilder2.lineToRelative(1.06f, 0.36f);
        pathBuilder2.curveToRelative(0.32f, -0.27f, 0.68f, -0.48f, 1.08f, -0.63f);
        pathBuilder2.lineToRelative(0.22f, -1.09f);
        pathBuilder2.curveTo(10.97f, 7.17f, 11.17f, 7.0f, 11.41f, 7.0f);
        pathBuilder2.horizontalLineToRelative(1.18f);
        pathBuilder2.curveToRelative(0.24f, 0.0f, 0.44f, 0.17f, 0.49f, 0.4f);
        pathBuilder2.lineToRelative(0.22f, 1.09f);
        pathBuilder2.curveToRelative(0.4f, 0.15f, 0.76f, 0.36f, 1.08f, 0.63f);
        pathBuilder2.lineToRelative(1.06f, -0.36f);
        pathBuilder2.curveToRelative(0.23f, -0.08f, 0.47f, 0.02f, 0.59f, 0.22f);
        pathBuilder2.lineToRelative(0.59f, 1.02f);
        pathBuilder2.curveToRelative(0.12f, 0.21f, 0.08f, 0.47f, -0.1f, 0.63f);
        pathBuilder2.lineToRelative(-0.84f, 0.73f);
        pathBuilder2.curveTo(15.72f, 11.58f, 15.75f, 11.78f, 15.75f, 12.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsApplications = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
