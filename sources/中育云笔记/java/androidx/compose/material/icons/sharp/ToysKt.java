package androidx.compose.material.icons.sharp;

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
public final class ToysKt {
    private static ImageVector _toys;

    public static final ImageVector getToys(Icons.Sharp sharp) {
        ImageVector imageVector = _toys;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Toys", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.72f, 10.0f);
        pathBuilder.lineToRelative(-2.0f, -6.0f);
        pathBuilder.horizontalLineTo(7.28f);
        pathBuilder.lineTo(5.81f, 8.4f);
        pathBuilder.lineTo(4.41f, 7.0f);
        pathBuilder.lineToRelative(1.0f, -1.0f);
        pathBuilder.lineTo(4.0f, 4.59f);
        pathBuilder.lineTo(0.59f, 8.0f);
        pathBuilder.lineTo(2.0f, 9.41f);
        pathBuilder.lineToRelative(1.0f, -1.0f);
        pathBuilder.lineTo(4.59f, 10.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineToRelative(2.18f);
        pathBuilder.curveTo(4.59f, 19.16f, 5.7f, 20.0f, 7.0f, 20.0f);
        pathBuilder.curveToRelative(1.3f, 0.0f, 2.4f, -0.84f, 2.82f, -2.0f);
        pathBuilder.horizontalLineToRelative(4.37f);
        pathBuilder.curveToRelative(0.41f, 1.16f, 1.51f, 2.0f, 2.82f, 2.0f);
        pathBuilder.curveToRelative(1.3f, 0.0f, 2.41f, -0.84f, 2.82f, -2.0f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.horizontalLineTo(18.72f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 18.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(7.55f, 18.0f, 7.0f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 10.0f);
        pathBuilder.horizontalLineTo(7.41f);
        pathBuilder.lineTo(7.39f, 9.98f);
        pathBuilder.lineTo(8.72f, 6.0f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 10.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineToRelative(2.28f);
        pathBuilder.lineToRelative(1.33f, 4.0f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 18.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(17.55f, 18.0f, 17.0f, 18.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _toys = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
