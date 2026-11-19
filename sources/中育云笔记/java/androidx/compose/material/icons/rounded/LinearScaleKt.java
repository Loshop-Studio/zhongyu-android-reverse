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
public final class LinearScaleKt {
    private static ImageVector _linearScale;

    public static final ImageVector getLinearScale(Icons.Rounded rounded) {
        ImageVector imageVector = _linearScale;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LinearScale", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 7.0f);
        pathBuilder.curveToRelative(-2.41f, 0.0f, -4.43f, 1.72f, -4.9f, 4.0f);
        pathBuilder.horizontalLineTo(6.79f);
        pathBuilder.curveTo(6.4f, 10.12f, 5.52f, 9.5f, 4.5f, 9.5f);
        pathBuilder.curveTo(3.12f, 9.5f, 2.0f, 10.62f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f);
        pathBuilder.curveToRelative(1.02f, 0.0f, 1.9f, -0.62f, 2.29f, -1.5f);
        pathBuilder.horizontalLineToRelative(5.31f);
        pathBuilder.curveToRelative(0.46f, 2.28f, 2.48f, 4.0f, 4.9f, 4.0f);
        pathBuilder.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilder.reflectiveCurveTo(19.76f, 7.0f, 17.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 15.0f);
        pathBuilder.curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(3.0f, 1.35f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveTo(18.65f, 15.0f, 17.0f, 15.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _linearScale = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
