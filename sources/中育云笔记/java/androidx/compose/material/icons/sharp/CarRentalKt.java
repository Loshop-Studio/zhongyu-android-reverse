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
public final class CarRentalKt {
    private static ImageVector _carRental;

    public static final ImageVector getCarRental(Icons.Sharp sharp) {
        ImageVector imageVector = _carRental;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.CarRental", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.83f, 3.0f);
        pathBuilder.curveTo(10.41f, 1.83f, 9.3f, 1.0f, 8.0f, 1.0f);
        pathBuilder.curveTo(6.34f, 1.0f, 5.0f, 2.34f, 5.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, 1.65f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.curveToRelative(1.3f, 0.0f, 2.41f, -0.84f, 2.83f, -2.0f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.horizontalLineTo(10.83f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 5.0f);
        pathBuilder.curveTo(7.45f, 5.0f, 7.0f, 4.55f, 7.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(8.55f, 5.0f, 8.0f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.11f, 9.0f);
        pathBuilder.horizontalLineTo(6.89f);
        pathBuilder.lineTo(5.0f, 14.69f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-7.31f);
        pathBuilder.lineTo(17.11f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 17.5f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(9.55f, 17.5f, 9.0f, 17.5f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 17.5f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(15.55f, 17.5f, 15.0f, 17.5f);
        pathBuilder.close();
        pathBuilder.moveTo(7.67f, 13.0f);
        pathBuilder.lineToRelative(0.66f, -2.0f);
        pathBuilder.horizontalLineToRelative(7.34f);
        pathBuilder.lineToRelative(0.66f, 2.0f);
        pathBuilder.horizontalLineTo(7.67f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _carRental = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
