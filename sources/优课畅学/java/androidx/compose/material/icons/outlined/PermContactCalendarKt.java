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
public final class PermContactCalendarKt {
    private static ImageVector _permContactCalendar;

    public static final ImageVector getPermContactCalendar(Icons.Outlined outlined) {
        ImageVector imageVector = _permContactCalendar;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PermContactCalendar", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.84f, 4.22f);
        pathBuilder.curveToRelative(-0.05f, -0.12f, -0.11f, -0.23f, -0.18f, -0.34f);
        pathBuilder.curveToRelative(-0.14f, -0.21f, -0.33f, -0.4f, -0.54f, -0.54f);
        pathBuilder.curveToRelative(-0.11f, -0.07f, -0.22f, -0.13f, -0.34f, -0.18f);
        pathBuilder.curveToRelative(-0.24f, -0.1f, -0.5f, -0.16f, -0.78f, -0.16f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.lineTo(18.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(8.0f, 3.0f);
        pathBuilder.lineTo(8.0f, 1.0f);
        pathBuilder.lineTo(6.0f, 1.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(5.0f, 3.0f);
        pathBuilder.curveToRelative(-0.42f, 0.0f, -0.8f, 0.13f, -1.12f, 0.34f);
        pathBuilder.curveToRelative(-0.21f, 0.14f, -0.4f, 0.33f, -0.54f, 0.54f);
        pathBuilder.curveToRelative(-0.07f, 0.11f, -0.13f, 0.22f, -0.18f, 0.34f);
        pathBuilder.curveToRelative(-0.1f, 0.24f, -0.16f, 0.5f, -0.16f, 0.78f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.54f, -0.06f, 0.78f, -0.16f);
        pathBuilder.curveToRelative(0.12f, -0.05f, 0.23f, -0.11f, 0.34f, -0.18f);
        pathBuilder.curveToRelative(0.21f, -0.14f, 0.4f, -0.33f, 0.54f, -0.54f);
        pathBuilder.curveToRelative(0.21f, -0.32f, 0.34f, -0.71f, 0.34f, -1.12f);
        pathBuilder.lineTo(21.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -0.28f, -0.06f, -0.54f, -0.16f, -0.78f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 19.0f);
        pathBuilder.lineTo(5.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.lineTo(5.0f, 19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 12.88f);
        pathBuilder.curveToRelative(-2.03f, 0.0f, -6.0f, 1.08f, -6.0f, 3.58f);
        pathBuilder.lineTo(6.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(-1.53f);
        pathBuilder.curveToRelative(0.0f, -2.51f, -3.97f, -3.59f, -6.0f, -3.59f);
        pathBuilder.close();
        pathBuilder.moveTo(8.31f, 16.0f);
        pathBuilder.curveToRelative(0.69f, -0.56f, 2.38f, -1.12f, 3.69f, -1.12f);
        pathBuilder.reflectiveCurveToRelative(3.01f, 0.56f, 3.69f, 1.12f);
        pathBuilder.lineTo(8.31f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 12.0f);
        pathBuilder.curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(-1.35f, -3.0f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(-3.0f, 1.35f, -3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 8.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _permContactCalendar = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
