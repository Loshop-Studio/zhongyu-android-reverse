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
public final class HdrAutoKt {
    private static ImageVector _hdrAuto;

    public static final ImageVector getHdrAuto(Icons.Rounded rounded) {
        ImageVector imageVector = _hdrAuto;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HdrAuto", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.04f, 8.04f);
        pathBuilder.lineToRelative(-0.09f, 0.0f);
        pathBuilder.lineToRelative(-1.6f, 4.55f);
        pathBuilder.lineToRelative(3.29f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 2.0f);
        pathBuilder2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder2.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder2.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.0f, 16.41f);
        pathBuilder2.lineToRelative(-0.78f, -2.22f);
        pathBuilder2.horizontalLineTo(9.78f);
        pathBuilder2.lineToRelative(-0.79f, 2.22f);
        pathBuilder2.curveTo(8.87f, 16.76f, 8.53f, 17.0f, 8.16f, 17.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(-0.62f, 0.0f, -1.05f, -0.62f, -0.83f, -1.2f);
        pathBuilder2.lineToRelative(3.34f, -8.88f);
        pathBuilder2.curveTo(10.88f, 6.37f, 11.4f, 6.0f, 12.0f, 6.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.59f, 0.0f, 1.12f, 0.37f, 1.33f, 0.92f);
        pathBuilder2.lineToRelative(3.34f, 8.88f);
        pathBuilder2.curveToRelative(0.22f, 0.58f, -0.21f, 1.2f, -0.83f, 1.2f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveTo(15.46f, 17.0f, 15.12f, 16.76f, 15.0f, 16.41f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hdrAuto = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
