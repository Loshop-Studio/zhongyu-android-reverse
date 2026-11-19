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
public final class ExtensionOffKt {
    private static ImageVector _extensionOff;

    public static final ImageVector getExtensionOff(Icons.Sharp sharp) {
        ImageVector imageVector = _extensionOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ExtensionOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.78f, 22.61f);
        pathBuilder.lineToRelative(-1.63f, -1.63f);
        pathBuilder.curveTo(18.1f, 20.98f, 18.05f, 21.0f, 18.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(-3.8f);
        pathBuilder.curveToRelative(0.0f, -2.71f, -2.16f, -3.0f, -2.7f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(-2.7f, 0.29f, -2.7f, 3.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(-5.8f);
        pathBuilder.curveToRelative(2.71f, 0.0f, 3.0f, -2.16f, 3.0f, -2.7f);
        pathBuilder.curveToRelative(0.0f, -0.54f, -0.3f, -2.7f, -2.99f, -2.7f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.curveToRelative(0.0f, -0.05f, 0.02f, -0.09f, 0.02f, -0.14f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineToRelative(18.38f, 18.38f);
        pathBuilder.lineTo(19.78f, 22.61f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 17.17f);
        pathBuilder.verticalLineTo(15.0f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilder.reflectiveCurveTo(21.38f, 10.0f, 20.0f, 10.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        pathBuilder.reflectiveCurveTo(9.0f, 2.62f, 9.0f, 4.0f);
        pathBuilder.horizontalLineTo(6.83f);
        pathBuilder.lineTo(20.0f, 17.17f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _extensionOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
