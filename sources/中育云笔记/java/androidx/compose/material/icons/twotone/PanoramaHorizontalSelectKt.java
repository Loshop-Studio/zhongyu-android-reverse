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
public final class PanoramaHorizontalSelectKt {
    private static ImageVector _panoramaHorizontalSelect;

    public static final ImageVector getPanoramaHorizontalSelect(Icons.TwoTone twoTone) {
        ImageVector imageVector = _panoramaHorizontalSelect;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PanoramaHorizontalSelect", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.0f, 6.38f);
        pathBuilder.verticalLineToRelative(11.25f);
        pathBuilder.curveToRelative(2.01f, -0.59f, 4.61f, -1.13f, 8.0f, -1.13f);
        pathBuilder.curveToRelative(3.38f, 0.0f, 5.99f, 0.54f, 8.0f, 1.13f);
        pathBuilder.verticalLineTo(6.37f);
        pathBuilder.curveToRelative(-2.01f, 0.59f, -4.62f, 1.13f, -8.0f, 1.13f);
        pathBuilder.curveTo(9.32f, 7.5f, 6.58f, 7.11f, 4.0f, 6.38f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(21.01f, 4.0f);
        pathBuilder2.curveTo(20.45f, 4.0f, 17.4f, 5.5f, 12.0f, 5.5f);
        pathBuilder2.curveToRelative(-5.31f, 0.0f, -8.49f, -1.49f, -9.01f, -1.49f);
        pathBuilder2.curveTo(2.46f, 4.01f, 2.0f, 4.45f, 2.0f, 5.02f);
        pathBuilder2.verticalLineTo(19.0f);
        pathBuilder2.curveToRelative(0.0f, 0.57f, 0.46f, 1.0f, 0.99f, 1.0f);
        pathBuilder2.curveToRelative(0.57f, 0.0f, 3.55f, -1.5f, 9.01f, -1.5f);
        pathBuilder2.curveToRelative(5.42f, 0.0f, 8.44f, 1.5f, 9.01f, 1.5f);
        pathBuilder2.curveToRelative(0.53f, 0.0f, 0.99f, -0.43f, 0.99f, -1.0f);
        pathBuilder2.verticalLineTo(5.0f);
        pathBuilder2.curveTo(22.0f, 4.43f, 21.54f, 4.0f, 21.01f, 4.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.0f, 17.63f);
        pathBuilder2.curveToRelative(-2.01f, -0.59f, -4.62f, -1.13f, -8.0f, -1.13f);
        pathBuilder2.curveToRelative(-3.39f, 0.0f, -5.99f, 0.54f, -8.0f, 1.13f);
        pathBuilder2.verticalLineTo(6.38f);
        pathBuilder2.curveTo(6.58f, 7.11f, 9.32f, 7.5f, 12.0f, 7.5f);
        pathBuilder2.curveToRelative(3.38f, 0.0f, 5.99f, -0.54f, 8.0f, -1.13f);
        pathBuilder2.verticalLineTo(17.63f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panoramaHorizontalSelect = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
