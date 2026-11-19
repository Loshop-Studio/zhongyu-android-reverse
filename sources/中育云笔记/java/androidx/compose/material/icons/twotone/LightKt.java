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
public final class LightKt {
    private static ImageVector _light;

    public static final ImageVector getLight(Icons.TwoTone twoTone) {
        ImageVector imageVector = _light;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Light", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 17.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(10.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(13.0f, 6.06f);
        pathBuilder2.verticalLineTo(3.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.verticalLineToRelative(3.06f);
        pathBuilder2.curveToRelative(-4.5f, 0.5f, -8.0f, 4.31f, -8.0f, 8.93f);
        pathBuilder2.curveTo(3.0f, 16.1f, 3.9f, 17.0f, 5.01f, 17.0f);
        pathBuilder2.horizontalLineTo(8.0f);
        pathBuilder2.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder2.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder2.horizontalLineToRelative(2.99f);
        pathBuilder2.curveTo(20.1f, 17.0f, 21.0f, 16.1f, 21.0f, 14.99f);
        pathBuilder2.curveTo(21.0f, 10.37f, 17.5f, 6.56f, 13.0f, 6.06f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 19.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.curveTo(14.0f, 18.1f, 13.1f, 19.0f, 12.0f, 19.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 15.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.curveToRelative(0.0f, -3.86f, 3.14f, -7.0f, 7.0f, -7.0f);
        pathBuilder2.reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f);
        pathBuilder2.horizontalLineTo(12.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _light = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
