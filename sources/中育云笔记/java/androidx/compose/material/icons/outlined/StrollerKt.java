package androidx.compose.material.icons.outlined;

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
public final class StrollerKt {
    private static ImageVector _stroller;

    public static final ImageVector getStroller(Icons.Outlined outlined) {
        ImageVector imageVector = _stroller;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Stroller", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 20.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(18.0f, 18.9f, 18.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 18.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(7.1f, 18.0f, 6.0f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 8.66f);
        pathBuilder.lineTo(9.6f, 15.0f);
        pathBuilder.horizontalLineTo(15.0f);
        pathBuilder.verticalLineTo(8.66f);
        pathBuilder.moveTo(18.65f, 3.0f);
        pathBuilder.curveTo(20.52f, 3.0f, 22.0f, 4.56f, 22.0f, 6.48f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(6.48f);
        pathBuilder.curveTo(20.0f, 5.66f, 19.42f, 5.0f, 18.65f, 5.0f);
        pathBuilder.curveTo(17.97f, 5.0f, 17.58f, 5.59f, 17.0f, 6.27f);
        pathBuilder.verticalLineTo(15.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.horizontalLineTo(7.43f);
        pathBuilder.curveToRelative(-0.85f, 0.0f, -1.31f, -1.0f, -0.76f, -1.65f);
        pathBuilder.lineToRelative(8.8f, -10.32f);
        pathBuilder.curveTo(16.11f, 4.27f, 16.99f, 3.0f, 18.65f, 3.0f);
        pathBuilder.lineTo(18.65f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 5.0f);
        pathBuilder.curveTo(9.35f, 5.0f, 8.71f, 5.09f, 8.09f, 5.27f);
        pathBuilder.lineToRelative(1.4f, 1.4f);
        pathBuilder.lineToRelative(1.37f, -1.61f);
        pathBuilder.curveTo(10.58f, 5.02f, 10.29f, 5.0f, 10.0f, 5.0f);
        pathBuilder.moveTo(10.0f, 3.0f);
        pathBuilder.curveToRelative(1.56f, 0.0f, 3.03f, 0.4f, 4.3f, 1.1f);
        pathBuilder.lineToRelative(-4.7f, 5.51f);
        pathBuilder.lineTo(4.72f, 4.72f);
        pathBuilder.curveTo(6.21f, 3.64f, 8.03f, 3.0f, 10.0f, 3.0f);
        pathBuilder.lineTo(10.0f, 3.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stroller = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
