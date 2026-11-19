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
public final class ExtensionKt {
    private static ImageVector _extension;

    public static final ImageVector getExtension(Icons.Outlined outlined) {
        ImageVector imageVector = _extension;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Extension", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.5f, 4.5f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(-2.12f);
        pathBuilder.curveToRelative(-0.68f, -1.75f, -2.39f, -3.0f, -4.38f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(-3.7f, 1.25f, -4.38f, 3.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(-2.12f);
        pathBuilder.curveToRelative(1.75f, -0.68f, 3.0f, -2.39f, 3.0f, -4.38f);
        pathBuilder.curveToRelative(0.0f, -1.99f, -1.24f, -3.7f, -2.99f, -4.38f);
        pathBuilder.lineTo(4.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.moveToRelative(0.0f, -2.0f);
        pathBuilder.curveTo(9.12f, 2.5f, 8.0f, 3.62f, 8.0f, 5.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilder.verticalLineToRelative(3.8f);
        pathBuilder.horizontalLineToRelative(0.29f);
        pathBuilder.curveToRelative(1.49f, 0.0f, 2.7f, 1.21f, 2.7f, 2.7f);
        pathBuilder.reflectiveCurveToRelative(-1.21f, 2.7f, -2.7f, 2.7f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(3.8f);
        pathBuilder.verticalLineToRelative(-0.3f);
        pathBuilder.curveToRelative(0.0f, -1.49f, 1.21f, -2.7f, 2.7f, -2.7f);
        pathBuilder.reflectiveCurveToRelative(2.7f, 1.21f, 2.7f, 2.7f);
        pathBuilder.verticalLineToRelative(0.3f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilder.reflectiveCurveTo(20.38f, 11.0f, 19.0f, 11.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _extension = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
