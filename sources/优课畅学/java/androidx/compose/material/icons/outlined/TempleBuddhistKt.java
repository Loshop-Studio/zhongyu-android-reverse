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
public final class TempleBuddhistKt {
    private static ImageVector _templeBuddhist;

    public static final ImageVector getTempleBuddhist(Icons.Outlined outlined) {
        ImageVector imageVector = _templeBuddhist;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.TempleBuddhist", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 9.02f);
        pathBuilder.curveToRelative(0.0f, 1.09f, -0.89f, 1.98f, -1.98f, 1.98f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.verticalLineTo(8.86f);
        pathBuilder.curveToRelative(1.72f, -0.44f, 3.0f, -1.99f, 3.0f, -3.84f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.lineToRelative(-2.0f, 0.02f);
        pathBuilder.curveTo(19.0f, 6.11f, 18.11f, 7.0f, 17.02f, 7.0f);
        pathBuilder.horizontalLineTo(16.5f);
        pathBuilder.lineTo(12.0f, 1.0f);
        pathBuilder.lineTo(7.5f, 7.0f);
        pathBuilder.horizontalLineTo(6.98f);
        pathBuilder.curveTo(5.89f, 7.0f, 5.0f, 6.11f, 5.0f, 5.02f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.curveToRelative(0.0f, 1.86f, 1.28f, 3.4f, 3.0f, 3.84f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineTo(4.98f);
        pathBuilder.curveTo(3.89f, 11.0f, 3.0f, 10.11f, 3.0f, 9.02f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.curveToRelative(0.0f, 1.86f, 1.28f, 3.4f, 3.0f, 3.84f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.horizontalLineToRelative(7.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(7.0f);
        pathBuilder.verticalLineToRelative(-9.14f);
        pathBuilder.curveToRelative(1.72f, -0.44f, 3.0f, -1.99f, 3.0f, -3.84f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.lineTo(21.0f, 9.02f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 4.33f);
        pathBuilder.lineTo(14.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.lineTo(12.0f, 4.33f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f);
        pathBuilder.curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineToRelative(-7.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _templeBuddhist = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
