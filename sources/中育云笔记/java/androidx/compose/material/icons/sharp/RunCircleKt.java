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
public final class RunCircleKt {
    private static ImageVector _runCircle;

    public static final ImageVector getRunCircle(Icons.Sharp sharp) {
        ImageVector imageVector = _runCircle;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.RunCircle", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.5f, 6.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.curveTo(12.5f, 6.45f, 12.95f, 6.0f, 13.5f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 12.0f);
        pathBuilder.curveToRelative(-0.7f, 0.0f, -2.01f, -0.54f, -2.91f, -1.76f);
        pathBuilder.lineToRelative(-0.41f, 2.35f);
        pathBuilder.lineTo(14.0f, 14.03f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineToRelative(-3.58f);
        pathBuilder.lineToRelative(-1.11f, -1.21f);
        pathBuilder.lineToRelative(-0.52f, 2.64f);
        pathBuilder.lineTo(7.6f, 15.08f);
        pathBuilder.lineToRelative(0.2f, -0.98f);
        pathBuilder.lineToRelative(2.78f, 0.57f);
        pathBuilder.lineToRelative(0.96f, -4.89f);
        pathBuilder.lineTo(10.0f, 10.35f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.verticalLineTo(9.65f);
        pathBuilder.lineToRelative(3.28f, -1.21f);
        pathBuilder.curveToRelative(0.49f, -0.18f, 1.03f, 0.06f, 1.26f, 0.53f);
        pathBuilder.curveTo(14.37f, 10.67f, 15.59f, 11.0f, 16.0f, 11.0f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _runCircle = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
