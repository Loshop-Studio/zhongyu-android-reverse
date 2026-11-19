package androidx.compose.material.icons.rounded;

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
public final class StadiumKt {
    private static ImageVector _stadium;

    public static final ImageVector getStadium(Icons.Rounded rounded) {
        ImageVector imageVector = _stadium;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Stadium", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.11f, 5.45f);
        pathBuilder.lineTo(3.72f, 6.64f);
        pathBuilder.curveTo(3.39f, 6.8f, 3.0f, 6.56f, 3.0f, 6.19f);
        pathBuilder.verticalLineTo(3.81f);
        pathBuilder.curveTo(3.0f, 3.44f, 3.39f, 3.2f, 3.72f, 3.36f);
        pathBuilder.lineToRelative(2.38f, 1.19f);
        pathBuilder.curveTo(6.47f, 4.74f, 6.47f, 5.26f, 6.11f, 5.45f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 3.81f);
        pathBuilder.verticalLineToRelative(2.38f);
        pathBuilder.curveToRelative(0.0f, 0.37f, 0.39f, 0.61f, 0.72f, 0.45f);
        pathBuilder.lineToRelative(2.38f, -1.19f);
        pathBuilder.curveToRelative(0.37f, -0.18f, 0.37f, -0.71f, 0.0f, -0.89f);
        pathBuilder.lineToRelative(-2.38f, -1.19f);
        pathBuilder.curveTo(18.39f, 3.2f, 18.0f, 3.44f, 18.0f, 3.81f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 2.81f);
        pathBuilder.verticalLineToRelative(2.38f);
        pathBuilder.curveToRelative(0.0f, 0.37f, 0.39f, 0.61f, 0.72f, 0.45f);
        pathBuilder.lineToRelative(2.38f, -1.19f);
        pathBuilder.curveToRelative(0.37f, -0.18f, 0.37f, -0.71f, 0.0f, -0.89f);
        pathBuilder.lineToRelative(-2.38f, -1.19f);
        pathBuilder.curveTo(11.39f, 2.2f, 11.0f, 2.44f, 11.0f, 2.81f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 10.04f);
        pathBuilder.curveTo(6.38f, 10.53f, 8.77f, 11.0f, 12.0f, 11.0f);
        pathBuilder.reflectiveCurveToRelative(5.62f, -0.47f, 7.0f, -0.96f);
        pathBuilder.curveTo(19.0f, 9.86f, 16.22f, 9.0f, 12.0f, 9.0f);
        pathBuilder.reflectiveCurveTo(5.0f, 9.86f, 5.0f, 10.04f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.lineToRelative(0.0f, 3.88f);
        pathBuilder.curveTo(4.94f, 21.49f, 2.0f, 20.34f, 2.0f, 19.0f);
        pathBuilder.verticalLineToRelative(-9.0f);
        pathBuilder.curveToRelative(0.0f, -1.66f, 4.48f, -3.0f, 10.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, 1.34f, 10.0f, 3.0f);
        pathBuilder.verticalLineToRelative(9.0f);
        pathBuilder.curveToRelative(0.0f, 1.34f, -2.94f, 2.48f, -7.0f, 2.87f);
        pathBuilder.lineTo(15.0f, 18.0f);
        pathBuilder.curveTo(15.0f, 17.45f, 14.55f, 17.0f, 14.0f, 17.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stadium = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
