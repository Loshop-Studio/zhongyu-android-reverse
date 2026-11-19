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
public final class ModeNightKt {
    private static ImageVector _modeNight;

    public static final ImageVector getModeNight(Icons.Sharp sharp) {
        ImageVector imageVector = _modeNight;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ModeNight", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
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
