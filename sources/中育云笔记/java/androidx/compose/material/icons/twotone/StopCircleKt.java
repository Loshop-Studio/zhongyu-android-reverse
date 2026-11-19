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
public final class StopCircleKt {
    private static ImageVector _stopCircle;

    public static final ImageVector getStopCircle(Icons.TwoTone twoTone) {
        ImageVector imageVector = _stopCircle;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.StopCircle", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        pathBuilder.reflectiveCurveTo(16.42f, 4.0f, 12.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 16.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineTo(16.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 2.0f);
        pathBuilder2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder2.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder2.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 20.0f);
        pathBuilder2.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        pathBuilder2.reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f);
        pathBuilder2.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        pathBuilder2.reflectiveCurveTo(16.42f, 20.0f, 12.0f, 20.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.0f, 16.0f);
        pathBuilder2.horizontalLineTo(8.0f);
        pathBuilder2.verticalLineTo(8.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.verticalLineTo(16.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stopCircle = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
