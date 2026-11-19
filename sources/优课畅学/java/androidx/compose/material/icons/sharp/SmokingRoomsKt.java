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
public final class SmokingRoomsKt {
    private static ImageVector _smokingRooms;

    public static final ImageVector getSmokingRooms(Icons.Sharp sharp) {
        ImageVector imageVector = _smokingRooms;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SmokingRooms", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(15.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.lineTo(2.0f, 19.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.5f, 16.0f);
        pathBuilder.lineTo(22.0f, 16.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.lineTo(18.0f, 19.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.85f, 7.73f);
        pathBuilder.curveToRelative(0.62f, -0.61f, 1.0f, -1.45f, 1.0f, -2.38f);
        pathBuilder.curveTo(19.85f, 3.5f, 18.35f, 2.0f, 16.5f, 2.0f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.curveToRelative(1.02f, 0.0f, 1.85f, 0.83f, 1.85f, 1.85f);
        pathBuilder.reflectiveCurveTo(17.52f, 7.2f, 16.5f, 7.2f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.curveToRelative(2.24f, 0.0f, 4.0f, 1.83f, 4.0f, 4.07f);
        pathBuilder.lineTo(20.5f, 15.0f);
        pathBuilder.lineTo(22.0f, 15.0f);
        pathBuilder.verticalLineToRelative(-2.24f);
        pathBuilder.curveToRelative(0.0f, -2.22f, -1.28f, -4.14f, -3.15f, -5.03f);
        pathBuilder.close();
        pathBuilder.moveTo(16.03f, 10.2f);
        pathBuilder.lineTo(14.5f, 10.2f);
        pathBuilder.curveToRelative(-1.02f, 0.0f, -1.85f, -0.98f, -1.85f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.83f, -1.75f, 1.85f, -1.75f);
        pathBuilder.verticalLineToRelative(-1.5f);
        pathBuilder.curveToRelative(-1.85f, 0.0f, -3.35f, 1.5f, -3.35f, 3.35f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 3.35f, 3.35f, 3.35f);
        pathBuilder.horizontalLineToRelative(1.53f);
        pathBuilder.curveToRelative(1.05f, 0.0f, 1.97f, 0.74f, 1.97f, 2.05f);
        pathBuilder.lineTo(18.0f, 15.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.verticalLineToRelative(-1.64f);
        pathBuilder.curveToRelative(0.0f, -1.81f, -1.6f, -3.16f, -3.47f, -3.16f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _smokingRooms = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
