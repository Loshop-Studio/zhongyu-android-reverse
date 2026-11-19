package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.graphics.vector.PathBuilder;
import androidx.compose.p013ui.graphics.vector.VectorKt;
import androidx.compose.p013ui.unit.C3156Dp;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
public final class SoapKt {
    private static ImageVector _soap;

    public static final ImageVector getSoap(Icons.Sharp sharp) {
        ImageVector imageVector = _soap;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Soap", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.25f, 6.0f);
        pathBuilder.curveTo(14.66f, 6.0f, 15.0f, 6.34f, 15.0f, 6.75f);
        pathBuilder.reflectiveCurveTo(14.66f, 7.5f, 14.25f, 7.5f);
        pathBuilder.reflectiveCurveTo(13.5f, 7.16f, 13.5f, 6.75f);
        pathBuilder.reflectiveCurveTo(13.84f, 6.0f, 14.25f, 6.0f);
        pathBuilder.moveTo(14.25f, 4.5f);
        pathBuilder.curveTo(13.01f, 4.5f, 12.0f, 5.51f, 12.0f, 6.75f);
        pathBuilder.reflectiveCurveTo(13.01f, 9.0f, 14.25f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(2.25f, -1.01f, 2.25f, -2.25f);
        pathBuilder.reflectiveCurveTo(15.49f, 4.5f, 14.25f, 4.5f);
        pathBuilder.lineTo(14.25f, 4.5f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 5.5f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.reflectiveCurveTo(20.28f, 6.5f, 20.0f, 6.5f);
        pathBuilder.reflectiveCurveTo(19.5f, 6.28f, 19.5f, 6.0f);
        pathBuilder.reflectiveCurveTo(19.72f, 5.5f, 20.0f, 5.5f);
        pathBuilder.moveTo(20.0f, 4.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(21.1f, 4.0f, 20.0f, 4.0f);
        pathBuilder.lineTo(20.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 2.5f);
        pathBuilder.curveTo(18.0f, 3.33f, 17.33f, 4.0f, 16.5f, 4.0f);
        pathBuilder.curveTo(15.67f, 4.0f, 15.0f, 3.33f, 15.0f, 2.5f);
        pathBuilder.reflectiveCurveTo(15.67f, 1.0f, 16.5f, 1.0f);
        pathBuilder.curveTo(17.33f, 1.0f, 18.0f, 1.67f, 18.0f, 2.5f);
        pathBuilder.close();
        pathBuilder.moveTo(1.0f, 12.68f);
        pathBuilder.verticalLineTo(23.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.verticalLineToRelative(-2.5f);
        pathBuilder.horizontalLineToRelative(-7.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.horizontalLineToRelative(-9.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(-2.5f);
        pathBuilder.horizontalLineTo(12.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.horizontalLineTo(8.86f);
        pathBuilder.lineToRelative(1.88f, -3.3f);
        pathBuilder.lineTo(9.12f, 5.0f);
        pathBuilder.lineTo(1.0f, 12.68f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _soap = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
