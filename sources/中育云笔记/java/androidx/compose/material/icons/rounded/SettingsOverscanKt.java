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
public final class SettingsOverscanKt {
    private static ImageVector _settingsOverscan;

    public static final ImageVector getSettingsOverscan(Icons.Rounded rounded) {
        ImageVector imageVector = _settingsOverscan;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SettingsOverscan", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.01f, 7.0f);
        pathBuilder.lineTo(10.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.lineTo(12.01f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 10.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.lineToRelative(2.0f, -1.99f);
        pathBuilder.lineTo(17.0f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 10.0f);
        pathBuilder.lineToRelative(-2.0f, 2.01f);
        pathBuilder.lineTo(7.0f, 14.0f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 15.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.lineToRelative(2.01f, 2.0f);
        pathBuilder.lineTo(14.0f, 15.0f);
        pathBuilder.close();
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
        pathBuilder.moveTo(20.0f, 18.01f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineTo(5.99f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineTo(18.01f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsOverscan = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
