package androidx.compose.material.icons.outlined;

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
public final class ExtensionOffKt {
    private static ImageVector _extensionOff;

    public static final ImageVector getExtensionOff(Icons.Outlined outlined) {
        ImageVector imageVector = _extensionOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ExtensionOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(1.39f, 4.22f);
        pathBuilder.lineToRelative(1.62f, 1.62f);
        pathBuilder.curveToRelative(0.0f, 0.05f, -0.01f, 0.1f, -0.01f, 0.16f);
        pathBuilder.verticalLineToRelative(3.8f);
        pathBuilder.curveTo(5.7f, 9.8f, 6.0f, 11.96f, 6.0f, 12.5f);
        pathBuilder.curveToRelative(0.0f, 0.54f, -0.29f, 2.7f, -3.0f, 2.7f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(3.8f);
        pathBuilder.curveToRelative(0.0f, -2.71f, 2.16f, -3.0f, 2.7f, -3.0f);
        pathBuilder.curveToRelative(0.54f, 0.0f, 2.7f, 0.29f, 2.7f, 3.0f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.curveToRelative(0.06f, 0.0f, 0.11f, 0.0f, 0.16f, -0.01f);
        pathBuilder.lineToRelative(1.61f, 1.61f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(2.81f, 2.81f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.close();
        pathBuilder.moveTo(11.5f, 16.0f);
        pathBuilder.curveToRelative(-1.5f, 0.0f, -3.57f, 0.83f, -4.37f, 3.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineToRelative(-2.13f);
        pathBuilder.curveToRelative(2.17f, -0.8f, 3.0f, -2.87f, 3.0f, -4.37f);
        pathBuilder.curveToRelative(0.0f, -0.69f, -0.18f, -1.5f, -0.58f, -2.25f);
        pathBuilder.lineToRelative(6.33f, 6.33f);
        pathBuilder.curveTo(13.0f, 16.18f, 12.19f, 16.0f, 11.5f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.83f, 6.0f);
        pathBuilder.lineToRelative(-2.0f, -2.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilder.reflectiveCurveTo(14.0f, 2.62f, 14.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilder.reflectiveCurveTo(21.38f, 15.0f, 20.0f, 15.0f);
        pathBuilder.verticalLineToRelative(2.17f);
        pathBuilder.lineToRelative(-2.0f, -2.0f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilder.reflectiveCurveTo(20.28f, 12.0f, 20.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder.reflectiveCurveTo(11.0f, 3.72f, 11.0f, 4.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(8.83f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _extensionOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
