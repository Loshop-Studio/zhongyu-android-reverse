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
public final class PercentKt {
    private static ImageVector _percent;

    public static final ImageVector getPercent(Icons.Filled filled) {
        ImageVector imageVector = _percent;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Percent", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.5f, 11.0f);
        pathBuilder.curveTo(9.43f, 11.0f, 11.0f, 9.43f, 11.0f, 7.5f);
        pathBuilder.reflectiveCurveTo(9.43f, 4.0f, 7.5f, 4.0f);
        pathBuilder.reflectiveCurveTo(4.0f, 5.57f, 4.0f, 7.5f);
        pathBuilder.reflectiveCurveTo(5.57f, 11.0f, 7.5f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.5f, 6.0f);
        pathBuilder.curveTo(8.33f, 6.0f, 9.0f, 6.67f, 9.0f, 7.5f);
        pathBuilder.reflectiveCurveTo(8.33f, 9.0f, 7.5f, 9.0f);
        pathBuilder.reflectiveCurveTo(6.0f, 8.33f, 6.0f, 7.5f);
        pathBuilder.reflectiveCurveTo(6.67f, 6.0f, 7.5f, 6.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(4.002f, 18.583f);
        pathBuilder2.lineToRelative(14.587f, -14.587f);
        pathBuilder2.lineToRelative(1.414f, 1.414f);
        pathBuilder2.lineToRelative(-14.587f, 14.587f);
        pathBuilder2.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw3 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk83 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(16.5f, 13.0f);
        pathBuilder3.curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f);
        pathBuilder3.reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f);
        pathBuilder3.reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder3.reflectiveCurveTo(18.43f, 13.0f, 16.5f, 13.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(16.5f, 18.0f);
        pathBuilder3.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder3.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder3.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder3.reflectiveCurveTo(17.33f, 18.0f, 16.5f, 18.0f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw3, iM31241getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _percent = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
