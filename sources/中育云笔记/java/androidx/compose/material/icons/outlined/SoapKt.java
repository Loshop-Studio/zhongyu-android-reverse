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
public final class SoapKt {
    private static ImageVector _soap;

    public static final ImageVector getSoap(Icons.Outlined outlined) {
        ImageVector imageVector = _soap;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Soap", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
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
        pathBuilder.moveTo(16.5f, 1.0f);
        pathBuilder.curveTo(15.67f, 1.0f, 15.0f, 1.67f, 15.0f, 2.5f);
        pathBuilder.reflectiveCurveTo(15.67f, 4.0f, 16.5f, 4.0f);
        pathBuilder.curveTo(17.33f, 4.0f, 18.0f, 3.33f, 18.0f, 2.5f);
        pathBuilder.reflectiveCurveTo(17.33f, 1.0f, 16.5f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.75f, 16.0f);
        pathBuilder.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilder.reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f);
        pathBuilder.horizontalLineTo(12.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(6.75f);
        pathBuilder.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilder.curveToRelative(0.0f, -0.67f, -0.53f, -1.2f, -1.18f, -1.24f);
        pathBuilder.lineTo(8.87f, 10.0f);
        pathBuilder.lineToRelative(1.48f, -2.6f);
        pathBuilder.curveToRelative(0.09f, -0.17f, 0.14f, -0.34f, 0.14f, -0.54f);
        pathBuilder.curveToRelative(0.0f, -0.26f, -0.09f, -0.5f, -0.26f, -0.7f);
        pathBuilder.lineTo(9.12f, 5.0f);
        pathBuilder.lineToRelative(-7.18f, 6.8f);
        pathBuilder.curveTo(1.34f, 12.36f, 1.0f, 13.15f, 1.0f, 13.97f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(13.75f);
        pathBuilder.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilder.reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f);
        pathBuilder.horizontalLineTo(12.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(7.75f);
        pathBuilder.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilder.reflectiveCurveTo(20.44f, 17.0f, 19.75f, 17.0f);
        pathBuilder.horizontalLineTo(12.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineTo(20.75f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 21.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.curveToRelative(0.0f, -0.39f, 0.23f, -0.64f, 0.36f, -0.75f);
        pathBuilder.lineTo(7.0f, 9.87f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.lineToRelative(3.0f, 0.0f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _soap = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
