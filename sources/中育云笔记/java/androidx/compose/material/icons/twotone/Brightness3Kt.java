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
public final class Brightness3Kt {
    private static ImageVector _brightness3;

    public static final ImageVector getBrightness3(Icons.TwoTone twoTone) {
        ImageVector imageVector = _brightness3;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Brightness3", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.7f, 4.91f);
        pathBuilder.curveToRelative(1.46f, 2.0f, 2.3f, 4.46f, 2.3f, 7.09f);
        pathBuilder.reflectiveCurveToRelative(-0.84f, 5.09f, -2.3f, 7.09f);
        pathBuilder.curveTo(15.25f, 17.76f, 17.0f, 15.08f, 17.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(-1.75f, -5.76f, -4.3f, -7.09f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(9.0f, 2.0f);
        pathBuilder2.curveToRelative(-1.05f, 0.0f, -2.05f, 0.16f, -3.0f, 0.46f);
        pathBuilder2.curveToRelative(4.06f, 1.27f, 7.0f, 5.06f, 7.0f, 9.54f);
        pathBuilder2.curveToRelative(0.0f, 4.48f, -2.94f, 8.27f, -7.0f, 9.54f);
        pathBuilder2.curveToRelative(0.95f, 0.3f, 1.95f, 0.46f, 3.0f, 0.46f);
        pathBuilder2.curveToRelative(5.52f, 0.0f, 10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder2.reflectiveCurveTo(14.52f, 2.0f, 9.0f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.7f, 19.09f);
        pathBuilder2.curveToRelative(1.46f, -2.0f, 2.3f, -4.46f, 2.3f, -7.09f);
        pathBuilder2.reflectiveCurveToRelative(-0.84f, -5.09f, -2.3f, -7.09f);
        pathBuilder2.curveTo(15.25f, 6.24f, 17.0f, 8.92f, 17.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.75f, 5.76f, -4.3f, 7.09f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brightness3 = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
