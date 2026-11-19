package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class InvertColorsKt {
    private static ImageVector _invertColors;

    public static final ImageVector getInvertColors(Icons.TwoTone twoTone) {
        ImageVector imageVector = _invertColors;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.InvertColors", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.75f, 8.99f);
        pathBuilder.curveTo(6.62f, 10.1f, 6.0f, 11.57f, 6.0f, 13.13f);
        pathBuilder.curveTo(6.0f, 16.37f, 8.69f, 19.0f, 12.0f, 19.0f);
        pathBuilder.lineToRelative(0.0f, -14.19f);
        pathBuilder.lineTo(7.75f, 8.99f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.65f, 7.56f);
        pathBuilder2.lineTo(17.65f, 7.56f);
        pathBuilder2.lineTo(12.0f, 2.0f);
        pathBuilder2.lineTo(6.35f, 7.56f);
        pathBuilder2.lineToRelative(0.0f, 0.0f);
        pathBuilder2.curveTo(4.9f, 8.99f, 4.0f, 10.96f, 4.0f, 13.13f);
        pathBuilder2.curveTo(4.0f, 17.48f, 7.58f, 21.0f, 12.0f, 21.0f);
        pathBuilder2.curveToRelative(4.42f, 0.0f, 8.0f, -3.52f, 8.0f, -7.87f);
        pathBuilder2.curveTo(20.0f, 10.96f, 19.1f, 8.99f, 17.65f, 7.56f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.0f, 13.13f);
        pathBuilder2.curveToRelative(0.0f, -1.56f, 0.62f, -3.03f, 1.75f, -4.14f);
        pathBuilder2.lineTo(12.0f, 4.81f);
        pathBuilder2.lineTo(12.0f, 19.0f);
        pathBuilder2.curveTo(8.69f, 19.0f, 6.0f, 16.37f, 6.0f, 13.13f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _invertColors = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
