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
public final class TourKt {
    private static ImageVector _tour;

    public static final ImageVector getTour(Icons.Rounded rounded) {
        ImageVector imageVector = _tour;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Tour", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.45f, 5.37f);
        pathBuilder.curveTo(20.71f, 4.71f, 20.23f, 4.0f, 19.52f, 4.0f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(5.45f, 2.0f, 5.0f, 2.45f, 5.0f, 3.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(7.52f);
        pathBuilder.curveToRelative(0.71f, 0.0f, 1.19f, -0.71f, 0.93f, -1.37f);
        pathBuilder.lineTo(19.0f, 9.0f);
        pathBuilder.lineTo(20.45f, 5.37f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(15.0f, 7.9f, 15.0f, 9.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tour = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
