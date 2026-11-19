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
public final class EscalatorKt {
    private static ImageVector _escalator;

    public static final ImageVector getEscalator(Icons.TwoTone twoTone) {
        ImageVector imageVector = _escalator;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Escalator", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 5.0f);
        pathBuilder.lineTo(19.0f, 5.0f);
        pathBuilder.lineToRelative(0.0f, 14.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.moveTo(17.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(-3.3f);
        pathBuilder.lineToRelative(-5.0f, 9.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(6.17f, 18.0f, 7.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(3.3f);
        pathBuilder.lineToRelative(5.0f, -9.0f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(17.83f, 6.0f, 17.0f, 6.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(19.0f, 5.0f);
        pathBuilder2.lineTo(19.0f, 5.0f);
        pathBuilder2.lineToRelative(0.0f, 14.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.verticalLineTo(5.0f);
        pathBuilder2.horizontalLineTo(19.0f);
        pathBuilder2.moveTo(19.0f, 3.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilder2.verticalLineToRelative(14.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(14.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.lineToRelative(0.0f, -14.0f);
        pathBuilder2.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        pathBuilder2.lineTo(19.0f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.0f, 6.0f);
        pathBuilder2.horizontalLineToRelative(-3.3f);
        pathBuilder2.lineToRelative(-5.0f, 9.0f);
        pathBuilder2.horizontalLineTo(7.0f);
        pathBuilder2.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilder2.reflectiveCurveTo(6.17f, 18.0f, 7.0f, 18.0f);
        pathBuilder2.horizontalLineToRelative(3.3f);
        pathBuilder2.lineToRelative(5.0f, -9.0f);
        pathBuilder2.horizontalLineTo(17.0f);
        pathBuilder2.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder2.reflectiveCurveTo(17.83f, 6.0f, 17.0f, 6.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _escalator = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
