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
public final class PercentKt {
    private static ImageVector _percent;

    public static final ImageVector getPercent(Icons.TwoTone twoTone) {
        ImageVector imageVector = _percent;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Percent", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.5f, 4.0f);
        pathBuilder.curveTo(5.57f, 4.0f, 4.0f, 5.57f, 4.0f, 7.5f);
        pathBuilder.reflectiveCurveTo(5.57f, 11.0f, 7.5f, 11.0f);
        pathBuilder.reflectiveCurveTo(11.0f, 9.43f, 11.0f, 7.5f);
        pathBuilder.reflectiveCurveTo(9.43f, 4.0f, 7.5f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.5f, 9.0f);
        pathBuilder.curveTo(6.67f, 9.0f, 6.0f, 8.33f, 6.0f, 7.5f);
        pathBuilder.reflectiveCurveTo(6.67f, 6.0f, 7.5f, 6.0f);
        pathBuilder.reflectiveCurveTo(9.0f, 6.67f, 9.0f, 7.5f);
        pathBuilder.reflectiveCurveTo(8.33f, 9.0f, 7.5f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.5f, 13.0f);
        pathBuilder.curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f);
        pathBuilder.reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f);
        pathBuilder.reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder.reflectiveCurveTo(18.43f, 13.0f, 16.5f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.5f, 18.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(17.33f, 18.0f, 16.5f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.41f, 20.0f);
        pathBuilder.lineTo(4.0f, 18.59f);
        pathBuilder.lineTo(18.59f, 4.0f);
        pathBuilder.lineTo(20.0f, 5.41f);
        pathBuilder.lineTo(5.41f, 20.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _percent = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
