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
public final class LocalPizzaKt {
    private static ImageVector _localPizza;

    public static final ImageVector getLocalPizza(Icons.TwoTone twoTone) {
        ImageVector imageVector = _localPizza;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.LocalPizza", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.51f, 6.36f);
        pathBuilder.lineTo(12.0f, 17.92f);
        pathBuilder.lineToRelative(6.49f, -11.55f);
        pathBuilder.curveTo(16.68f, 4.85f, 14.38f, 4.0f, 12.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(-4.68f, 0.85f, -6.49f, 2.36f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 8.5f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(8.17f, 5.5f, 9.0f, 5.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(9.82f, 8.5f, 9.0f, 8.5f);
        pathBuilder.close();
        pathBuilder.moveTo(13.5f, 13.0f);
        pathBuilder.curveToRelative(0.0f, 0.83f, -0.68f, 1.5f, -1.5f, 1.5f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 2.0f);
        pathBuilder2.curveTo(8.43f, 2.0f, 5.23f, 3.54f, 3.01f, 6.0f);
        pathBuilder2.lineTo(12.0f, 22.0f);
        pathBuilder2.lineToRelative(8.99f, -16.0f);
        pathBuilder2.curveTo(18.78f, 3.55f, 15.57f, 2.0f, 12.0f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 17.92f);
        pathBuilder2.lineTo(5.51f, 6.36f);
        pathBuilder2.curveTo(7.32f, 4.85f, 9.62f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.reflectiveCurveToRelative(4.68f, 0.85f, 6.49f, 2.36f);
        pathBuilder2.lineTo(12.0f, 17.92f);
        pathBuilder2.close();
        pathBuilder2.moveTo(9.0f, 5.5f);
        pathBuilder2.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilder2.reflectiveCurveTo(8.17f, 8.5f, 9.0f, 8.5f);
        pathBuilder2.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder2.reflectiveCurveTo(9.82f, 5.5f, 9.0f, 5.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(10.5f, 13.0f);
        pathBuilder2.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder2.curveToRelative(0.82f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder2.reflectiveCurveToRelative(-0.68f, -1.5f, -1.5f, -1.5f);
        pathBuilder2.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localPizza = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
