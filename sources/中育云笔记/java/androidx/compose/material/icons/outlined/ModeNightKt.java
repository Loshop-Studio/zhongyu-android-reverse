package androidx.compose.material.icons.outlined;

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
public final class ModeNightKt {
    private static ImageVector _modeNight;

    public static final ImageVector getModeNight(Icons.Outlined outlined) {
        ImageVector imageVector = _modeNight;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ModeNight", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.5f, 4.0f);
        pathBuilder.curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        pathBuilder.curveToRelative(-0.34f, 0.0f, -0.68f, -0.02f, -1.01f, -0.07f);
        pathBuilder.curveToRelative(1.91f, -2.16f, 3.01f, -4.98f, 3.01f, -7.93f);
        pathBuilder.reflectiveCurveToRelative(-1.1f, -5.77f, -3.01f, -7.93f);
        pathBuilder.curveTo(8.82f, 4.02f, 9.16f, 4.0f, 9.5f, 4.0f);
        pathBuilder.moveTo(9.5f, 2.0f);
        pathBuilder.curveToRelative(-1.82f, 0.0f, -3.53f, 0.5f, -5.0f, 1.35f);
        pathBuilder.curveToRelative(2.99f, 1.73f, 5.0f, 4.95f, 5.0f, 8.65f);
        pathBuilder.reflectiveCurveToRelative(-2.01f, 6.92f, -5.0f, 8.65f);
        pathBuilder.curveTo(5.97f, 21.5f, 7.68f, 22.0f, 9.5f, 22.0f);
        pathBuilder.curveToRelative(5.52f, 0.0f, 10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.reflectiveCurveTo(15.02f, 2.0f, 9.5f, 2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _modeNight = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
