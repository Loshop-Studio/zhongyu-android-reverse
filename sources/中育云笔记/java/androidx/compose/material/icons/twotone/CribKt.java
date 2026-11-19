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
public final class CribKt {
    private static ImageVector _crib;

    public static final ImageVector getCrib(Icons.TwoTone twoTone) {
        ImageVector imageVector = _crib;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Crib", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 14.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineTo(14.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(18.0f, 9.0f);
        pathBuilder2.horizontalLineToRelative(-6.0f);
        pathBuilder2.verticalLineTo(4.0f);
        pathBuilder2.horizontalLineTo(8.0f);
        pathBuilder2.curveTo(5.79f, 4.0f, 4.0f, 5.79f, 4.0f, 8.0f);
        pathBuilder2.verticalLineToRelative(6.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(2.93f);
        pathBuilder2.curveToRelative(-0.61f, -0.35f, -1.16f, -0.78f, -1.65f, -1.27f);
        pathBuilder2.lineToRelative(-1.42f, 1.42f);
        pathBuilder2.curveTo(6.74f, 20.88f, 9.24f, 22.0f, 12.0f, 22.0f);
        pathBuilder2.curveToRelative(2.76f, 0.0f, 5.26f, -1.12f, 7.07f, -2.93f);
        pathBuilder2.lineToRelative(-1.42f, -1.42f);
        pathBuilder2.curveToRelative(-0.49f, 0.49f, -1.05f, 0.92f, -1.65f, 1.27f);
        pathBuilder2.verticalLineTo(16.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.verticalLineToRelative(-3.0f);
        pathBuilder2.curveTo(20.0f, 9.9f, 19.1f, 9.0f, 18.0f, 9.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.0f, 19.75f);
        pathBuilder2.curveTo(13.36f, 19.91f, 12.69f, 20.0f, 12.0f, 20.0f);
        pathBuilder2.curveToRelative(-0.69f, 0.0f, -1.36f, -0.09f, -2.0f, -0.25f);
        pathBuilder2.verticalLineTo(16.0f);
        pathBuilder2.horizontalLineToRelative(4.0f);
        pathBuilder2.verticalLineTo(19.75f);
        pathBuilder2.close();
        pathBuilder2.moveTo(18.0f, 14.0f);
        pathBuilder2.horizontalLineTo(6.0f);
        pathBuilder2.verticalLineTo(8.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(5.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.verticalLineTo(14.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _crib = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
