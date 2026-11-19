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
public final class OpacityKt {
    private static ImageVector _opacity;

    public static final ImageVector getOpacity(Icons.Sharp sharp) {
        ImageVector imageVector = _opacity;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Opacity", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.66f, 8.0f);
        pathBuilder.lineTo(12.0f, 2.35f);
        pathBuilder.lineTo(6.34f, 8.0f);
        pathBuilder.curveTo(4.78f, 9.56f, 4.0f, 11.64f, 4.0f, 13.64f);
        pathBuilder.reflectiveCurveToRelative(0.78f, 4.11f, 2.34f, 5.67f);
        pathBuilder.reflectiveCurveToRelative(3.61f, 2.35f, 5.66f, 2.35f);
        pathBuilder.reflectiveCurveToRelative(4.1f, -0.79f, 5.66f, -2.35f);
        pathBuilder.reflectiveCurveTo(20.0f, 15.64f, 20.0f, 13.64f);
        pathBuilder.reflectiveCurveTo(19.22f, 9.56f, 17.66f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 14.0f);
        pathBuilder.curveToRelative(0.01f, -2.0f, 0.62f, -3.27f, 1.76f, -4.4f);
        pathBuilder.lineTo(12.0f, 5.27f);
        pathBuilder.lineToRelative(4.24f, 4.38f);
        pathBuilder.curveTo(17.38f, 10.77f, 17.99f, 12.0f, 18.0f, 14.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _opacity = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
