package androidx.compose.material.icons.filled;

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
public final class CarRepairKt {
    private static ImageVector _carRepair;

    public static final ImageVector getCarRepair(Icons.Filled filled) {
        ImageVector imageVector = _carRepair;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CarRepair", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.22f, 12.0f);
        pathBuilder.curveToRelative(0.68f, 0.0f, 1.22f, -0.54f, 1.22f, -1.22f);
        pathBuilder.curveToRelative(0.0f, -0.67f, -0.54f, -1.22f, -1.22f, -1.22f);
        pathBuilder.reflectiveCurveTo(15.0f, 10.11f, 15.0f, 10.78f);
        pathBuilder.curveTo(15.0f, 11.46f, 15.55f, 12.0f, 16.22f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.56f, 10.78f);
        pathBuilder.curveToRelative(0.0f, 0.67f, 0.54f, 1.22f, 1.22f, 1.22f);
        pathBuilder.reflectiveCurveTo(9.0f, 11.46f, 9.0f, 10.78f);
        pathBuilder.curveToRelative(0.0f, -0.67f, -0.54f, -1.22f, -1.22f, -1.22f);
        pathBuilder.reflectiveCurveTo(6.56f, 10.11f, 6.56f, 10.78f);
        pathBuilder.close();
        pathBuilder.moveTo(7.61f, 4.0f);
        pathBuilder.lineTo(6.28f, 8.0f);
        pathBuilder.horizontalLineToRelative(11.43f);
        pathBuilder.lineToRelative(-1.33f, -4.0f);
        pathBuilder.horizontalLineTo(7.61f);
        pathBuilder.close();
        pathBuilder.moveTo(16.28f, 3.0f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.54f, 0.01f, 0.92f, 0.54f);
        pathBuilder.curveToRelative(0.02f, 0.02f, 0.03f, 0.04f, 0.05f, 0.07f);
        pathBuilder.curveToRelative(0.07f, 0.11f, 0.14f, 0.24f, 0.19f, 0.4f);
        pathBuilder.curveTo(17.66f, 4.66f, 19.0f, 8.69f, 19.0f, 8.69f);
        pathBuilder.verticalLineToRelative(6.5f);
        pathBuilder.curveToRelative(0.0f, 0.45f, -0.35f, 0.81f, -0.78f, 0.81f);
        pathBuilder.horizontalLineToRelative(-0.44f);
        pathBuilder.curveTo(17.35f, 16.0f, 17.0f, 15.64f, 17.0f, 15.19f);
        pathBuilder.verticalLineTo(14.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(1.19f);
        pathBuilder.curveTo(7.0f, 15.64f, 6.65f, 16.0f, 6.22f, 16.0f);
        pathBuilder.horizontalLineTo(5.78f);
        pathBuilder.curveTo(5.35f, 16.0f, 5.0f, 15.64f, 5.0f, 15.19f);
        pathBuilder.verticalLineToRelative(-6.5f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 1.34f, -4.02f, 1.55f, -4.69f);
        pathBuilder.curveToRelative(0.05f, -0.16f, 0.12f, -0.28f, 0.19f, -0.4f);
        pathBuilder.curveTo(6.77f, 3.58f, 6.78f, 3.56f, 6.8f, 3.54f);
        pathBuilder.curveTo(7.18f, 3.01f, 7.72f, 3.0f, 7.72f, 3.0f);
        pathBuilder.horizontalLineTo(16.28f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 17.01f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineToRelative(-7.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineTo(17.01f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _carRepair = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
