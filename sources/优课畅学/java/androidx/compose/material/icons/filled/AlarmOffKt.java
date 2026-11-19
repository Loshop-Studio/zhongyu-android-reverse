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
public final class AlarmOffKt {
    private static ImageVector _alarmOff;

    public static final ImageVector getAlarmOff(Icons.Filled filled) {
        ImageVector imageVector = _alarmOff;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AlarmOff", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 6.0f);
        pathBuilder.curveToRelative(3.87f, 0.0f, 7.0f, 3.13f, 7.0f, 7.0f);
        pathBuilder.curveToRelative(0.0f, 0.84f, -0.16f, 1.65f, -0.43f, 2.4f);
        pathBuilder.lineToRelative(1.52f, 1.52f);
        pathBuilder.curveToRelative(0.58f, -1.19f, 0.91f, -2.51f, 0.91f, -3.92f);
        pathBuilder.curveToRelative(0.0f, -4.97f, -4.03f, -9.0f, -9.0f, -9.0f);
        pathBuilder.curveToRelative(-1.41f, 0.0f, -2.73f, 0.33f, -3.92f, 0.91f);
        pathBuilder.lineTo(9.6f, 6.43f);
        pathBuilder.curveTo(10.35f, 6.16f, 11.16f, 6.0f, 12.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 5.72f);
        pathBuilder.lineToRelative(-4.6f, -3.86f);
        pathBuilder.lineToRelative(-1.29f, 1.53f);
        pathBuilder.lineToRelative(4.6f, 3.86f);
        pathBuilder.lineTo(22.0f, 5.72f);
        pathBuilder.close();
        pathBuilder.moveTo(2.92f, 2.29f);
        pathBuilder.lineTo(1.65f, 3.57f);
        pathBuilder.lineTo(2.98f, 4.9f);
        pathBuilder.lineToRelative(-1.11f, 0.93f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder.lineToRelative(1.11f, -0.94f);
        pathBuilder.lineToRelative(0.8f, 0.8f);
        pathBuilder.curveTo(3.83f, 8.69f, 3.0f, 10.75f, 3.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, 4.97f, 4.02f, 9.0f, 9.0f, 9.0f);
        pathBuilder.curveToRelative(2.25f, 0.0f, 4.31f, -0.83f, 5.89f, -2.2f);
        pathBuilder.lineToRelative(2.2f, 2.2f);
        pathBuilder.lineToRelative(1.27f, -1.27f);
        pathBuilder.lineTo(3.89f, 3.27f);
        pathBuilder.lineToRelative(-0.97f, -0.98f);
        pathBuilder.close();
        pathBuilder.moveTo(16.47f, 18.39f);
        pathBuilder.curveTo(15.26f, 19.39f, 13.7f, 20.0f, 12.0f, 20.0f);
        pathBuilder.curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        pathBuilder.curveToRelative(0.0f, -1.7f, 0.61f, -3.26f, 1.61f, -4.47f);
        pathBuilder.lineToRelative(9.86f, 9.86f);
        pathBuilder.close();
        pathBuilder.moveTo(8.02f, 3.28f);
        pathBuilder.lineTo(6.6f, 1.86f);
        pathBuilder.lineToRelative(-0.86f, 0.71f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder.lineToRelative(0.86f, -0.71f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _alarmOff = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
