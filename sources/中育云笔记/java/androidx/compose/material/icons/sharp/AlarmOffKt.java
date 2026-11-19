package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.SolidColor;
import androidx.compose.p014ui.graphics.StrokeCap;
import androidx.compose.p014ui.graphics.StrokeJoin;
import androidx.compose.p014ui.graphics.vector.ImageVector;
import androidx.compose.p014ui.graphics.vector.PathBuilder;
import androidx.compose.p014ui.graphics.vector.VectorKt;
import androidx.compose.p014ui.unit.C3186Dp;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class AlarmOffKt {
    private static ImageVector _alarmOff;

    public static final ImageVector getAlarmOff(Icons.Sharp sharp) {
        ImageVector imageVector = _alarmOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AlarmOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.04f, 6.29f);
        pathBuilder.curveTo(10.66f, 6.11f, 11.32f, 6.0f, 12.0f, 6.0f);
        pathBuilder.curveToRelative(3.86f, 0.0f, 7.0f, 3.14f, 7.0f, 7.0f);
        pathBuilder.curveToRelative(0.0f, 0.68f, -0.11f, 1.34f, -0.29f, 1.96f);
        pathBuilder.lineToRelative(1.56f, 1.56f);
        pathBuilder.curveToRelative(0.47f, -1.08f, 0.73f, -2.27f, 0.73f, -3.52f);
        pathBuilder.curveToRelative(0.0f, -4.97f, -4.03f, -9.0f, -9.0f, -9.0f);
        pathBuilder.curveToRelative(-1.25f, 0.0f, -2.44f, 0.26f, -3.53f, 0.72f);
        pathBuilder.lineToRelative(1.57f, 1.57f);
        pathBuilder.close();
        pathBuilder.moveTo(17.337f, 1.81f);
        pathBuilder.lineToRelative(4.607f, 3.845f);
        pathBuilder.lineToRelative(-1.28f, 1.535f);
        pathBuilder.lineToRelative(-4.61f, -3.843f);
        pathBuilder.close();
        pathBuilder.moveTo(3.02f, 2.1f);
        pathBuilder.lineTo(1.61f, 3.51f);
        pathBuilder.lineToRelative(1.37f, 1.37f);
        pathBuilder.lineToRelative(-0.92f, 0.77f);
        pathBuilder.lineToRelative(1.28f, 1.54f);
        pathBuilder.lineToRelative(1.06f, -0.88f);
        pathBuilder.lineToRelative(0.8f, 0.8f);
        pathBuilder.curveTo(3.83f, 8.69f, 3.0f, 10.75f, 3.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, 4.97f, 4.03f, 9.0f, 9.0f, 9.0f);
        pathBuilder.curveToRelative(2.25f, 0.0f, 4.31f, -0.83f, 5.89f, -2.2f);
        pathBuilder.lineToRelative(2.1f, 2.1f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(3.02f, 2.1f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f);
        pathBuilder.curveToRelative(0.0f, -1.7f, 0.61f, -3.26f, 1.62f, -4.47f);
        pathBuilder.lineToRelative(9.85f, 9.85f);
        pathBuilder.curveTo(15.26f, 19.39f, 13.7f, 20.0f, 12.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.48f, 3.73f);
        pathBuilder.lineToRelative(0.46f, -0.38f);
        pathBuilder.lineToRelative(-1.28f, -1.54f);
        pathBuilder.lineToRelative(-0.6f, 0.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _alarmOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
