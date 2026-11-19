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
public final class OfflineBoltKt {
    private static ImageVector _offlineBolt;

    public static final ImageVector getOfflineBolt(Icons.Rounded rounded) {
        ImageVector imageVector = _offlineBolt;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.OfflineBolt", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.02f);
        pathBuilder.curveToRelative(-5.51f, 0.0f, -9.98f, 4.47f, -9.98f, 9.98f);
        pathBuilder.reflectiveCurveToRelative(4.47f, 9.98f, 9.98f, 9.98f);
        pathBuilder.reflectiveCurveToRelative(9.98f, -4.47f, 9.98f, -9.98f);
        pathBuilder.reflectiveCurveTo(17.51f, 2.02f, 12.0f, 2.02f);
        pathBuilder.close();
        pathBuilder.moveTo(11.48f, 17.88f);
        pathBuilder.verticalLineToRelative(-4.14f);
        pathBuilder.lineTo(8.82f, 13.74f);
        pathBuilder.curveToRelative(-0.37f, 0.0f, -0.62f, -0.4f, -0.44f, -0.73f);
        pathBuilder.lineToRelative(3.68f, -7.17f);
        pathBuilder.curveToRelative(0.23f, -0.47f, 0.94f, -0.3f, 0.94f, 0.23f);
        pathBuilder.verticalLineToRelative(4.19f);
        pathBuilder.horizontalLineToRelative(2.54f);
        pathBuilder.curveToRelative(0.37f, 0.0f, 0.61f, 0.39f, 0.45f, 0.72f);
        pathBuilder.lineToRelative(-3.56f, 7.12f);
        pathBuilder.curveToRelative(-0.24f, 0.48f, -0.95f, 0.31f, -0.95f, -0.22f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _offlineBolt = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
