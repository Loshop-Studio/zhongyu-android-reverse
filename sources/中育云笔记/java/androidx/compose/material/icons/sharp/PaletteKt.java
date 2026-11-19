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
public final class PaletteKt {
    private static ImageVector _palette;

    public static final ImageVector getPalette(Icons.Sharp sharp) {
        ImageVector imageVector = _palette;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Palette", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.49f, 2.0f, 2.0f, 6.49f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.49f, 10.0f, 10.0f, 10.0f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilder.curveToRelative(0.0f, -0.61f, -0.23f, -1.2f, -0.64f, -1.67f);
        pathBuilder.curveToRelative(-0.08f, -0.1f, -0.13f, -0.21f, -0.13f, -0.33f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.curveToRelative(3.31f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f);
        pathBuilder.curveTo(22.0f, 6.04f, 17.51f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.5f, 13.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.curveTo(19.0f, 12.33f, 18.33f, 13.0f, 17.5f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.5f, 9.0f);
        pathBuilder.curveTo(13.67f, 9.0f, 13.0f, 8.33f, 13.0f, 7.5f);
        pathBuilder.curveTo(13.0f, 6.67f, 13.67f, 6.0f, 14.5f, 6.0f);
        pathBuilder.reflectiveCurveTo(16.0f, 6.67f, 16.0f, 7.5f);
        pathBuilder.curveTo(16.0f, 8.33f, 15.33f, 9.0f, 14.5f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 11.5f);
        pathBuilder.curveTo(5.0f, 10.67f, 5.67f, 10.0f, 6.5f, 10.0f);
        pathBuilder.reflectiveCurveTo(8.0f, 10.67f, 8.0f, 11.5f);
        pathBuilder.curveTo(8.0f, 12.33f, 7.33f, 13.0f, 6.5f, 13.0f);
        pathBuilder.reflectiveCurveTo(5.0f, 12.33f, 5.0f, 11.5f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 7.5f);
        pathBuilder.curveTo(11.0f, 8.33f, 10.33f, 9.0f, 9.5f, 9.0f);
        pathBuilder.reflectiveCurveTo(8.0f, 8.33f, 8.0f, 7.5f);
        pathBuilder.curveTo(8.0f, 6.67f, 8.67f, 6.0f, 9.5f, 6.0f);
        pathBuilder.reflectiveCurveTo(11.0f, 6.67f, 11.0f, 7.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _palette = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
