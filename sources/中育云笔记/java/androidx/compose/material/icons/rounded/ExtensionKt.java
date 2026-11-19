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
public final class ExtensionKt {
    private static ImageVector _extension;

    public static final ImageVector getExtension(Icons.Rounded rounded) {
        ImageVector imageVector = _extension;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Extension", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.5f, 11.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineTo(3.5f);
        pathBuilder.curveTo(13.0f, 2.12f, 11.88f, 1.0f, 10.5f, 1.0f);
        pathBuilder.reflectiveCurveTo(8.0f, 2.12f, 8.0f, 3.5f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilder.verticalLineToRelative(3.8f);
        pathBuilder.horizontalLineTo(3.5f);
        pathBuilder.curveToRelative(1.49f, 0.0f, 2.7f, 1.21f, 2.7f, 2.7f);
        pathBuilder.reflectiveCurveToRelative(-1.21f, 2.7f, -2.7f, 2.7f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(3.8f);
        pathBuilder.verticalLineToRelative(-1.5f);
        pathBuilder.curveToRelative(0.0f, -1.49f, 1.21f, -2.7f, 2.7f, -2.7f);
        pathBuilder.reflectiveCurveToRelative(2.7f, 1.21f, 2.7f, 2.7f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilder.reflectiveCurveTo(21.88f, 11.0f, 20.5f, 11.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _extension = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
