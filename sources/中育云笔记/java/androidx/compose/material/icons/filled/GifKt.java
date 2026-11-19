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
public final class GifKt {
    private static ImageVector _gif;

    public static final ImageVector getGif(Icons.Filled filled) {
        ImageVector imageVector = _gif;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Gif", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.5f, 9.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(9.0f, 9.0f);
        pathBuilder2.horizontalLineTo(6.0f);
        pathBuilder2.curveToRelative(-0.6f, 0.0f, -1.0f, 0.5f, -1.0f, 1.0f);
        pathBuilder2.verticalLineToRelative(4.0f);
        pathBuilder2.curveToRelative(0.0f, 0.5f, 0.4f, 1.0f, 1.0f, 1.0f);
        pathBuilder2.horizontalLineToRelative(3.0f);
        pathBuilder2.curveToRelative(0.6f, 0.0f, 1.0f, -0.5f, 1.0f, -1.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.horizontalLineTo(8.5f);
        pathBuilder2.verticalLineToRelative(1.5f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.verticalLineToRelative(-3.0f);
        pathBuilder2.horizontalLineTo(10.0f);
        pathBuilder2.verticalLineTo(10.0f);
        pathBuilder2.curveTo(10.0f, 9.5f, 9.6f, 9.0f, 9.0f, 9.0f);
        pathBuilder2.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw3 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk83 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(19.0f, 10.5f);
        pathBuilder3.lineToRelative(0.0f, -1.5f);
        pathBuilder3.lineToRelative(-4.5f, 0.0f);
        pathBuilder3.lineToRelative(0.0f, 6.0f);
        pathBuilder3.lineToRelative(1.5f, 0.0f);
        pathBuilder3.lineToRelative(0.0f, -2.0f);
        pathBuilder3.lineToRelative(2.0f, 0.0f);
        pathBuilder3.lineToRelative(0.0f, -1.5f);
        pathBuilder3.lineToRelative(-2.0f, 0.0f);
        pathBuilder3.lineToRelative(0.0f, -1.0f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw3, iM31241getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gif = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
