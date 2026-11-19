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
public final class TonalityKt {
    private static ImageVector _tonality;

    public static final ImageVector getTonality(Icons.TwoTone twoTone) {
        ImageVector imageVector = _tonality;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Tonality", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 4.08f, 3.06f, 7.44f, 7.0f, 7.93f);
        pathBuilder.verticalLineTo(4.07f);
        pathBuilder.curveTo(7.05f, 4.56f, 4.0f, 7.92f, 4.0f, 12.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
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
        pathBuilder2.moveTo(11.0f, 19.93f);
        pathBuilder2.curveToRelative(-3.94f, -0.49f, -7.0f, -3.85f, -7.0f, -7.93f);
        pathBuilder2.reflectiveCurveToRelative(3.05f, -7.44f, 7.0f, -7.93f);
        pathBuilder2.verticalLineToRelative(15.86f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.0f, 4.07f);
        pathBuilder2.curveToRelative(1.03f, 0.13f, 2.0f, 0.45f, 2.87f, 0.93f);
        pathBuilder2.lineTo(13.0f, 5.0f);
        pathBuilder2.verticalLineToRelative(-0.93f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.0f, 7.0f);
        pathBuilder2.horizontalLineToRelative(5.24f);
        pathBuilder2.curveToRelative(0.25f, 0.31f, 0.48f, 0.65f, 0.68f, 1.0f);
        pathBuilder2.lineTo(13.0f, 8.0f);
        pathBuilder2.lineTo(13.0f, 7.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.0f, 10.0f);
        pathBuilder2.horizontalLineToRelative(6.74f);
        pathBuilder2.curveToRelative(0.08f, 0.33f, 0.15f, 0.66f, 0.19f, 1.0f);
        pathBuilder2.lineTo(13.0f, 11.0f);
        pathBuilder2.verticalLineToRelative(-1.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.0f, 19.93f);
        pathBuilder2.lineTo(13.0f, 19.0f);
        pathBuilder2.horizontalLineToRelative(2.87f);
        pathBuilder2.curveToRelative(-0.87f, 0.48f, -1.84f, 0.8f, -2.87f, 0.93f);
        pathBuilder2.close();
        pathBuilder2.moveTo(18.24f, 17.0f);
        pathBuilder2.lineTo(13.0f, 17.0f);
        pathBuilder2.verticalLineToRelative(-1.0f);
        pathBuilder2.horizontalLineToRelative(5.92f);
        pathBuilder2.curveToRelative(-0.2f, 0.35f, -0.43f, 0.69f, -0.68f, 1.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.74f, 14.0f);
        pathBuilder2.lineTo(13.0f, 14.0f);
        pathBuilder2.verticalLineToRelative(-1.0f);
        pathBuilder2.horizontalLineToRelative(6.93f);
        pathBuilder2.curveToRelative(-0.04f, 0.34f, -0.11f, 0.67f, -0.19f, 1.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tonality = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
