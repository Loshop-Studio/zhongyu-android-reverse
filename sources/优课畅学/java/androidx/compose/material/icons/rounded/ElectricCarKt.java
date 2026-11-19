package androidx.compose.material.icons.rounded;

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
public final class ElectricCarKt {
    private static ImageVector _electricCar;

    public static final ImageVector getElectricCar(Icons.Rounded rounded) {
        ImageVector imageVector = _electricCar;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ElectricCar", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM24629getButtKaPHkGw = companion2.m24629getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM24639getBevelLxFBmk8 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.92f, 2.01f);
        pathBuilder.curveTo(18.72f, 1.42f, 18.16f, 1.0f, 17.5f, 1.0f);
        pathBuilder.horizontalLineToRelative(-11.0f);
        pathBuilder.curveTo(5.84f, 1.0f, 5.29f, 1.42f, 5.08f, 2.01f);
        pathBuilder.lineTo(3.11f, 7.68f);
        pathBuilder.curveTo(3.04f, 7.89f, 3.0f, 8.11f, 3.0f, 8.34f);
        pathBuilder.verticalLineToRelative(7.16f);
        pathBuilder.curveTo(3.0f, 16.33f, 3.67f, 17.0f, 4.5f, 17.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(5.33f, 17.0f, 6.0f, 16.33f, 6.0f, 15.5f);
        pathBuilder.verticalLineTo(15.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(0.5f);
        pathBuilder.curveToRelative(0.0f, 0.82f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.82f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.verticalLineTo(8.34f);
        pathBuilder.curveToRelative(0.0f, -0.22f, -0.04f, -0.45f, -0.11f, -0.66f);
        pathBuilder.lineTo(18.92f, 2.01f);
        pathBuilder.close();
        pathBuilder.moveTo(6.5f, 12.0f);
        pathBuilder.curveTo(5.67f, 12.0f, 5.0f, 11.33f, 5.0f, 10.5f);
        pathBuilder.reflectiveCurveTo(5.67f, 9.0f, 6.5f, 9.0f);
        pathBuilder.reflectiveCurveTo(8.0f, 9.67f, 8.0f, 10.5f);
        pathBuilder.reflectiveCurveTo(7.33f, 12.0f, 6.5f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.5f, 12.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(16.67f, 9.0f, 17.5f, 9.0f);
        pathBuilder.reflectiveCurveTo(19.0f, 9.67f, 19.0f, 10.5f);
        pathBuilder.reflectiveCurveTo(18.33f, 12.0f, 17.5f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 7.0f);
        pathBuilder.lineToRelative(1.27f, -3.82f);
        pathBuilder.curveTo(6.41f, 2.78f, 6.79f, 2.5f, 7.22f, 2.5f);
        pathBuilder.horizontalLineToRelative(9.56f);
        pathBuilder.curveToRelative(0.43f, 0.0f, 0.81f, 0.28f, 0.95f, 0.68f);
        pathBuilder.lineTo(19.0f, 7.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.close();
        ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw2 = companion2.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk82 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(7.0f, 20.0f);
        pathBuilder2.lineToRelative(4.0f, 0.0f);
        pathBuilder2.lineToRelative(0.0f, -2.0f);
        pathBuilder2.lineToRelative(6.0f, 3.0f);
        pathBuilder2.lineToRelative(-4.0f, 0.0f);
        pathBuilder2.lineToRelative(0.0f, 2.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw2, iM24639getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _electricCar = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
