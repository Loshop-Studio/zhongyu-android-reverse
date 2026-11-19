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
public final class FunctionsKt {
    private static ImageVector _functions;

    public static final ImageVector getFunctions(Icons.Rounded rounded) {
        ImageVector imageVector = _functions;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Functions", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.5f, 4.0f);
        pathBuilder.horizontalLineTo(7.56f);
        pathBuilder.curveTo(6.7f, 4.0f, 6.0f, 4.7f, 6.0f, 5.56f);
        pathBuilder.curveToRelative(0.0f, 0.28f, 0.12f, 0.55f, 0.32f, 0.74f);
        pathBuilder.lineTo(12.5f, 12.0f);
        pathBuilder.lineToRelative(-6.18f, 5.7f);
        pathBuilder.curveToRelative(-0.2f, 0.19f, -0.32f, 0.46f, -0.32f, 0.74f);
        pathBuilder.curveTo(6.0f, 19.3f, 6.7f, 20.0f, 7.56f, 20.0f);
        pathBuilder.horizontalLineToRelative(8.94f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.lineToRelative(3.59f, -3.59f);
        pathBuilder.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        pathBuilder.lineTo(11.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(5.5f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(17.33f, 4.0f, 16.5f, 4.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _functions = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
