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
public final class HeatPumpKt {
    private static ImageVector _heatPump;

    public static final ImageVector getHeatPump(Icons.Sharp sharp) {
        ImageVector imageVector = _heatPump;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.HeatPump", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 3.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.75f, 7.08f);
        pathBuilder.curveToRelative(0.82f, 0.12f, 1.57f, 0.44f, 2.2f, 0.91f);
        pathBuilder.lineToRelative(-2.2f, 2.2f);
        pathBuilder.verticalLineTo(7.08f);
        pathBuilder.close();
        pathBuilder.moveTo(11.25f, 7.08f);
        pathBuilder.verticalLineToRelative(3.11f);
        pathBuilder.lineToRelative(-2.2f, -2.2f);
        pathBuilder.curveTo(9.68f, 7.52f, 10.43f, 7.2f, 11.25f, 7.08f);
        pathBuilder.close();
        pathBuilder.moveTo(7.99f, 9.05f);
        pathBuilder.lineToRelative(2.2f, 2.2f);
        pathBuilder.horizontalLineTo(7.08f);
        pathBuilder.curveTo(7.2f, 10.43f, 7.52f, 9.68f, 7.99f, 9.05f);
        pathBuilder.close();
        pathBuilder.moveTo(7.08f, 12.75f);
        pathBuilder.horizontalLineToRelative(3.11f);
        pathBuilder.lineToRelative(-2.2f, 2.2f);
        pathBuilder.curveTo(7.52f, 14.32f, 7.2f, 13.57f, 7.08f, 12.75f);
        pathBuilder.close();
        pathBuilder.moveTo(11.25f, 16.92f);
        pathBuilder.curveToRelative(-0.82f, -0.12f, -1.57f, -0.44f, -2.2f, -0.91f);
        pathBuilder.lineToRelative(2.2f, -2.2f);
        pathBuilder.verticalLineTo(16.92f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 13.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.curveTo(13.0f, 12.55f, 12.55f, 13.0f, 12.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.75f, 16.92f);
        pathBuilder.verticalLineToRelative(-3.11f);
        pathBuilder.lineToRelative(2.2f, 2.2f);
        pathBuilder.curveTo(14.32f, 16.48f, 13.57f, 16.8f, 12.75f, 16.92f);
        pathBuilder.close();
        pathBuilder.moveTo(16.01f, 14.95f);
        pathBuilder.lineToRelative(-2.2f, -2.2f);
        pathBuilder.horizontalLineToRelative(3.11f);
        pathBuilder.curveTo(16.8f, 13.57f, 16.48f, 14.32f, 16.01f, 14.95f);
        pathBuilder.close();
        pathBuilder.moveTo(13.81f, 11.25f);
        pathBuilder.lineToRelative(2.2f, -2.2f);
        pathBuilder.curveToRelative(0.47f, 0.64f, 0.79f, 1.39f, 0.91f, 2.2f);
        pathBuilder.horizontalLineTo(13.81f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _heatPump = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
