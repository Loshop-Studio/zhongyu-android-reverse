package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class SnoozeKt {
    private static ImageVector _snooze;

    public static final ImageVector getSnooze(Icons.TwoTone twoTone) {
        ImageVector imageVector = _snooze;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Snooze", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(3.63f);
        pathBuilder.lineTo(9.0f, 15.2f);
        pathBuilder.lineTo(9.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-3.63f);
        pathBuilder.lineTo(15.0f, 10.8f);
        pathBuilder.lineTo(15.0f, 9.0f);
        pathBuilder.lineTo(9.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.337f, 1.81f);
        pathBuilder.lineToRelative(4.607f, 3.845f);
        pathBuilder.lineToRelative(-1.28f, 1.535f);
        pathBuilder.lineToRelative(-4.61f, -3.843f);
        pathBuilder.close();
        pathBuilder.moveTo(6.663f, 1.81f);
        pathBuilder.lineToRelative(1.282f, 1.536f);
        pathBuilder.lineTo(3.337f, 7.19f);
        pathBuilder.lineToRelative(-1.28f, -1.536f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(4.03f, 9.0f, 9.0f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(9.0f, -4.03f, 9.0f, -9.0f);
        pathBuilder.reflectiveCurveToRelative(-4.03f, -9.0f, -9.0f, -9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f);
        pathBuilder.reflectiveCurveToRelative(3.14f, -7.0f, 7.0f, -7.0f);
        pathBuilder.reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f);
        pathBuilder.reflectiveCurveToRelative(-3.14f, 7.0f, -7.0f, 7.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _snooze = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
