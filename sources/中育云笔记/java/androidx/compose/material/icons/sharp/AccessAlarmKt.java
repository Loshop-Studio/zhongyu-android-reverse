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
public final class AccessAlarmKt {
    private static ImageVector _accessAlarm;

    public static final ImageVector getAccessAlarm(Icons.Sharp sharp) {
        ImageVector imageVector = _accessAlarm;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AccessAlarm", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 5.72f);
        pathBuilder.lineToRelative(-4.6f, -3.86f);
        pathBuilder.lineToRelative(-1.29f, 1.53f);
        pathBuilder.lineToRelative(4.6f, 3.86f);
        pathBuilder.lineTo(22.0f, 5.72f);
        pathBuilder.close();
        pathBuilder.moveTo(7.88f, 3.39f);
        pathBuilder.lineTo(6.6f, 1.86f);
        pathBuilder.lineTo(2.0f, 5.71f);
        pathBuilder.lineToRelative(1.29f, 1.53f);
        pathBuilder.lineToRelative(4.59f, -3.85f);
        pathBuilder.close();
        pathBuilder.moveTo(12.5f, 8.0f);
        pathBuilder.lineTo(11.0f, 8.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.lineToRelative(4.75f, 2.85f);
        pathBuilder.lineToRelative(0.75f, -1.23f);
        pathBuilder.lineToRelative(-4.0f, -2.37f);
        pathBuilder.lineTo(12.5f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(4.02f, 9.0f, 9.0f, 9.0f);
        pathBuilder.curveToRelative(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
        pathBuilder.reflectiveCurveToRelative(-4.03f, -9.0f, -9.0f, -9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        pathBuilder.reflectiveCurveToRelative(3.13f, -7.0f, 7.0f, -7.0f);
        pathBuilder.reflectiveCurveToRelative(7.0f, 3.13f, 7.0f, 7.0f);
        pathBuilder.reflectiveCurveToRelative(-3.13f, 7.0f, -7.0f, 7.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _accessAlarm = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
