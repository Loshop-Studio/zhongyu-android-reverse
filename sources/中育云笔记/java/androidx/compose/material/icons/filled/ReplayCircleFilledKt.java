package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.PathFillType;
import androidx.compose.p014ui.graphics.SolidColor;
import androidx.compose.p014ui.graphics.StrokeCap;
import androidx.compose.p014ui.graphics.StrokeJoin;
import androidx.compose.p014ui.graphics.vector.ImageVector;
import androidx.compose.p014ui.graphics.vector.PathBuilder;
import androidx.compose.p014ui.unit.C3186Dp;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class ReplayCircleFilledKt {
    private static ImageVector _replayCircleFilled;

    public static final ImageVector getReplayCircleFilled(Icons.Filled filled) {
        ImageVector imageVector = _replayCircleFilled;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ReplayCircleFilled", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int iM31160getEvenOddRgk1Os = PathFillType.Companion.m31160getEvenOddRgk1Os();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.lineTo(8.0f, 7.0f);
        pathBuilder.lineToRelative(4.0f, -4.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), iM31160getEvenOddRgk1Os, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _replayCircleFilled = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
