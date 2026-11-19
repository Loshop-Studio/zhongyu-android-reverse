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
public final class InvertColorsKt {
    private static ImageVector _invertColors;

    public static final ImageVector getInvertColors(Icons.Outlined outlined) {
        ImageVector imageVector = _invertColors;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.InvertColors", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.81f);
        pathBuilder.lineTo(12.0f, 19.0f);
        pathBuilder.curveToRelative(-3.31f, 0.0f, -6.0f, -2.63f, -6.0f, -5.87f);
        pathBuilder.curveToRelative(0.0f, -1.56f, 0.62f, -3.03f, 1.75f, -4.14f);
        pathBuilder.lineTo(12.0f, 4.81f);
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.lineTo(6.35f, 7.56f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(4.9f, 8.99f, 4.0f, 10.96f, 4.0f, 13.13f);
        pathBuilder.curveTo(4.0f, 17.48f, 7.58f, 21.0f, 12.0f, 21.0f);
        pathBuilder.curveToRelative(4.42f, 0.0f, 8.0f, -3.52f, 8.0f, -7.87f);
        pathBuilder.curveToRelative(0.0f, -2.17f, -0.9f, -4.14f, -2.35f, -5.57f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.lineTo(12.0f, 2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _invertColors = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
