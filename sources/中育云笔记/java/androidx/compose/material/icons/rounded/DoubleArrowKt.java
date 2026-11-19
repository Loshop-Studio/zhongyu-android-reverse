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
public final class DoubleArrowKt {
    private static ImageVector _doubleArrow;

    public static final ImageVector getDoubleArrow(Icons.Rounded rounded) {
        ImageVector imageVector = _doubleArrow;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DoubleArrow", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.08f, 11.42f);
        pathBuilder.lineToRelative(-4.04f, -5.65f);
        pathBuilder.curveTo(15.7f, 5.29f, 15.15f, 5.0f, 14.56f, 5.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-1.49f, 0.0f, -2.35f, 1.68f, -1.49f, 2.89f);
        pathBuilder.lineTo(16.0f, 12.0f);
        pathBuilder.lineToRelative(-2.93f, 4.11f);
        pathBuilder.curveToRelative(-0.87f, 1.21f, 0.0f, 2.89f, 1.49f, 2.89f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.59f, 0.0f, 1.15f, -0.29f, 1.49f, -0.77f);
        pathBuilder.lineToRelative(4.04f, -5.65f);
        pathBuilder.curveTo(20.33f, 12.23f, 20.33f, 11.77f, 20.08f, 11.42f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(13.08f, 11.42f);
        pathBuilder2.lineTo(9.05f, 5.77f);
        pathBuilder2.curveTo(8.7f, 5.29f, 8.15f, 5.0f, 7.56f, 5.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveTo(6.07f, 5.0f, 5.2f, 6.68f, 6.07f, 7.89f);
        pathBuilder2.lineTo(9.0f, 12.0f);
        pathBuilder2.lineToRelative(-2.93f, 4.11f);
        pathBuilder2.curveTo(5.2f, 17.32f, 6.07f, 19.0f, 7.56f, 19.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.59f, 0.0f, 1.15f, -0.29f, 1.49f, -0.77f);
        pathBuilder2.lineToRelative(4.04f, -5.65f);
        pathBuilder2.curveTo(13.33f, 12.23f, 13.33f, 11.77f, 13.08f, 11.42f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doubleArrow = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
