package androidx.compose.material.icons.outlined;

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
public final class ParaglidingKt {
    private static ImageVector _paragliding;

    public static final ImageVector getParagliding(Icons.Outlined outlined) {
        ImageVector imageVector = _paragliding;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Paragliding", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 17.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.curveTo(14.0f, 16.1f, 13.1f, 17.0f, 12.0f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.48f, 17.94f);
        pathBuilder.curveTo(14.68f, 18.54f, 14.0f, 19.0f, 12.0f, 19.0f);
        pathBuilder.reflectiveCurveToRelative(-2.68f, -0.46f, -3.48f, -1.06f);
        pathBuilder.curveTo(8.04f, 17.55f, 7.0f, 16.76f, 7.0f, 14.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveToRelative(0.0f, 2.7f, 0.93f, 4.41f, 2.3f, 5.5f);
        pathBuilder.curveToRelative(0.5f, 0.4f, 1.1f, 0.7f, 1.7f, 0.9f);
        pathBuilder.verticalLineTo(24.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(-3.6f);
        pathBuilder.curveToRelative(0.6f, -0.2f, 1.2f, -0.5f, 1.7f, -0.9f);
        pathBuilder.curveToRelative(1.37f, -1.09f, 2.3f, -2.8f, 2.3f, -5.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveTo(17.0f, 16.76f, 15.96f, 17.55f, 15.48f, 17.94f);
        pathBuilder.close();
        pathBuilder.moveTo(23.0f, 4.25f);
        pathBuilder.verticalLineToRelative(3.49f);
        pathBuilder.curveToRelative(0.0f, 0.8f, -0.88f, 1.26f, -1.56f, 0.83f);
        pathBuilder.curveTo(21.3f, 8.48f, 21.16f, 8.39f, 21.0f, 8.31f);
        pathBuilder.lineTo(19.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.lineToRelative(-1.5f, -6.28f);
        pathBuilder.curveTo(14.4f, 6.58f, 13.22f, 6.5f, 12.0f, 6.5f);
        pathBuilder.reflectiveCurveTo(9.6f, 6.58f, 8.5f, 6.72f);
        pathBuilder.lineTo(7.0f, 13.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.lineTo(3.0f, 8.31f);
        pathBuilder.curveTo(2.84f, 8.39f, 2.7f, 8.48f, 2.56f, 8.57f);
        pathBuilder.curveTo(1.88f, 9.0f, 1.0f, 8.55f, 1.0f, 7.74f);
        pathBuilder.verticalLineTo(4.25f);
        pathBuilder.curveTo(1.0f, 1.9f, 5.92f, 0.0f, 12.0f, 0.0f);
        pathBuilder.reflectiveCurveTo(23.0f, 1.9f, 23.0f, 4.25f);
        pathBuilder.close();
        pathBuilder.moveTo(6.9f, 6.98f);
        pathBuilder.curveTo(5.97f, 7.17f, 5.12f, 7.41f, 4.37f, 7.69f);
        pathBuilder.lineToRelative(1.51f, 3.55f);
        pathBuilder.lineTo(6.9f, 6.98f);
        pathBuilder.close();
        pathBuilder.moveTo(19.63f, 7.69f);
        pathBuilder.curveToRelative(-0.75f, -0.28f, -1.6f, -0.52f, -2.53f, -0.71f);
        pathBuilder.lineToRelative(1.02f, 4.25f);
        pathBuilder.lineTo(19.63f, 7.69f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 4.31f);
        pathBuilder.curveTo(20.65f, 3.63f, 17.57f, 2.0f, 12.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(3.35f, 3.63f, 3.0f, 4.31f);
        pathBuilder.verticalLineToRelative(1.77f);
        pathBuilder.curveTo(5.34f, 5.07f, 8.56f, 4.5f, 12.0f, 4.5f);
        pathBuilder.reflectiveCurveToRelative(6.66f, 0.57f, 9.0f, 1.58f);
        pathBuilder.verticalLineTo(4.31f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _paragliding = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
