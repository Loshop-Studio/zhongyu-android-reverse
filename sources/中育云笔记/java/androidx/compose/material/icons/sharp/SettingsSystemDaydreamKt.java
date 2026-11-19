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
public final class SettingsSystemDaydreamKt {
    private static ImageVector _settingsSystemDaydream;

    public static final ImageVector getSettingsSystemDaydream(Icons.Sharp sharp) {
        ImageVector imageVector = _settingsSystemDaydream;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SettingsSystemDaydream", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(6.5f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilder.reflectiveCurveTo(16.88f, 11.0f, 15.5f, 11.0f);
        pathBuilder.horizontalLineToRelative(-0.05f);
        pathBuilder.curveToRelative(-0.24f, -1.69f, -1.69f, -3.0f, -3.45f, -3.0f);
        pathBuilder.curveToRelative(-1.4f, 0.0f, -2.6f, 0.83f, -3.16f, 2.02f);
        pathBuilder.horizontalLineToRelative(-0.16f);
        pathBuilder.curveTo(7.17f, 10.18f, 6.0f, 11.45f, 6.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(23.0f, 3.0f);
        pathBuilder.lineTo(1.0f, 3.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.horizontalLineToRelative(22.0f);
        pathBuilder.lineTo(23.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 19.01f);
        pathBuilder.lineTo(3.0f, 19.01f);
        pathBuilder.lineTo(3.0f, 4.99f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.verticalLineToRelative(14.02f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsSystemDaydream = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
