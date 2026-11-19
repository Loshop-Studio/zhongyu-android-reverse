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
public final class DryKt {
    private static ImageVector _dry;

    public static final ImageVector getDry(Icons.Filled filled) {
        ImageVector imageVector = _dry;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Dry", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.65f, 4.86f);
        pathBuilder.lineToRelative(-0.07f, -0.07f);
        pathBuilder.curveToRelative(-0.57f, -0.62f, -0.82f, -1.41f, -0.67f, -2.2f);
        pathBuilder.lineTo(15.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(-1.89f);
        pathBuilder.lineToRelative(-0.06f, 0.43f);
        pathBuilder.curveToRelative(-0.2f, 1.36f, 0.27f, 2.71f, 1.3f, 3.72f);
        pathBuilder.lineToRelative(0.07f, 0.06f);
        pathBuilder.curveToRelative(0.57f, 0.62f, 0.82f, 1.41f, 0.67f, 2.2f);
        pathBuilder.lineTo(14.98f, 9.0f);
        pathBuilder.horizontalLineToRelative(1.91f);
        pathBuilder.lineToRelative(0.06f, -0.43f);
        pathBuilder.curveTo(17.16f, 7.21f, 16.68f, 5.86f, 15.65f, 4.86f);
        pathBuilder.close();
        pathBuilder.moveTo(19.65f, 4.86f);
        pathBuilder.lineToRelative(-0.07f, -0.07f);
        pathBuilder.curveToRelative(-0.57f, -0.62f, -0.82f, -1.41f, -0.67f, -2.2f);
        pathBuilder.lineTo(19.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(-1.89f);
        pathBuilder.lineToRelative(-0.06f, 0.43f);
        pathBuilder.curveToRelative(-0.2f, 1.36f, 0.27f, 2.71f, 1.3f, 3.72f);
        pathBuilder.lineToRelative(0.07f, 0.06f);
        pathBuilder.curveToRelative(0.57f, 0.62f, 0.82f, 1.41f, 0.67f, 2.2f);
        pathBuilder.lineTo(18.98f, 9.0f);
        pathBuilder.horizontalLineToRelative(1.91f);
        pathBuilder.lineToRelative(0.06f, -0.43f);
        pathBuilder.curveTo(21.16f, 7.21f, 20.68f, 5.86f, 19.65f, 4.86f);
        pathBuilder.close();
        pathBuilder.moveTo(9.12f, 5.0f);
        pathBuilder.lineToRelative(-7.18f, 6.79f);
        pathBuilder.curveTo(1.34f, 12.35f, 1.0f, 13.14f, 1.0f, 13.97f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(6.25f);
        pathBuilder.horizontalLineTo(12.0f);
        pathBuilder.horizontalLineToRelative(5.75f);
        pathBuilder.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilder.reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f);
        pathBuilder.horizontalLineTo(12.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(7.75f);
        pathBuilder.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilder.reflectiveCurveTo(20.44f, 17.0f, 19.75f, 17.0f);
        pathBuilder.horizontalLineTo(12.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(8.75f);
        pathBuilder.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilder.reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f);
        pathBuilder.horizontalLineTo(12.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(6.75f);
        pathBuilder.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilder.reflectiveCurveTo(19.44f, 10.0f, 18.75f, 10.0f);
        pathBuilder.horizontalLineTo(8.86f);
        pathBuilder.curveToRelative(0.64f, -1.11f, 1.48f, -2.58f, 1.49f, -2.61f);
        pathBuilder.curveToRelative(0.09f, -0.16f, 0.14f, -0.33f, 0.14f, -0.53f);
        pathBuilder.curveToRelative(0.0f, -0.26f, -0.09f, -0.5f, -0.26f, -0.7f);
        pathBuilder.curveTo(10.22f, 6.12f, 9.12f, 5.0f, 9.12f, 5.0f);
        pathBuilder.lineTo(9.12f, 5.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dry = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
