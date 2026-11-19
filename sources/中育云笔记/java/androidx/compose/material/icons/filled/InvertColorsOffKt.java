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
public final class InvertColorsOffKt {
    private static ImageVector _invertColorsOff;

    public static final ImageVector getInvertColorsOff(Icons.Filled filled) {
        ImageVector imageVector = _invertColorsOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.InvertColorsOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.19f, 21.19f);
        pathBuilder.lineTo(2.81f, 2.81f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.lineToRelative(4.2f, 4.2f);
        pathBuilder.curveToRelative(-1.0f, 1.31f, -1.6f, 2.94f, -1.6f, 4.7f);
        pathBuilder.curveTo(4.0f, 17.48f, 7.58f, 21.0f, 12.0f, 21.0f);
        pathBuilder.curveToRelative(1.75f, 0.0f, 3.36f, -0.56f, 4.67f, -1.5f);
        pathBuilder.lineToRelative(3.1f, 3.1f);
        pathBuilder.lineTo(21.19f, 21.19f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 19.0f);
        pathBuilder.curveToRelative(-3.31f, 0.0f, -6.0f, -2.63f, -6.0f, -5.87f);
        pathBuilder.curveToRelative(0.0f, -1.19f, 0.36f, -2.32f, 1.02f, -3.28f);
        pathBuilder.lineTo(12.0f, 14.83f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.38f, 5.56f);
        pathBuilder.lineTo(12.0f, 2.0f);
        pathBuilder.lineToRelative(5.65f, 5.56f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(19.1f, 8.99f, 20.0f, 10.96f, 20.0f, 13.13f);
        pathBuilder.curveToRelative(0.0f, 1.18f, -0.27f, 2.29f, -0.74f, 3.3f);
        pathBuilder.lineTo(12.0f, 9.17f);
        pathBuilder.verticalLineTo(4.81f);
        pathBuilder.lineTo(9.8f, 6.97f);
        pathBuilder.lineTo(8.38f, 5.56f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _invertColorsOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
