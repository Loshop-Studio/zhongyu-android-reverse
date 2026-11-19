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
public final class FrontHandKt {
    private static ImageVector _frontHand;

    public static final ImageVector getFrontHand(Icons.Rounded rounded) {
        ImageVector imageVector = _frontHand;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FrontHand", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.5f, 14.5f);
        pathBuilder.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-1.51f, 0.0f, -2.77f, 1.12f, -2.97f, 2.58f);
        pathBuilder.curveTo(15.0f, 17.82f, 14.78f, 18.0f, 14.54f, 18.0f);
        pathBuilder.curveToRelative(-0.3f, 0.0f, -0.54f, -0.27f, -0.5f, -0.57f);
        pathBuilder.curveToRelative(0.26f, -1.77f, 1.68f, -3.17f, 3.46f, -3.4f);
        pathBuilder.lineToRelative(0.0f, -10.78f);
        pathBuilder.curveTo(17.5f, 2.56f, 16.94f, 2.0f, 16.25f, 2.0f);
        pathBuilder.curveTo(15.56f, 2.0f, 15.0f, 2.56f, 15.0f, 3.25f);
        pathBuilder.verticalLineToRelative(7.25f);
        pathBuilder.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilder.reflectiveCurveTo(14.0f, 10.78f, 14.0f, 10.5f);
        pathBuilder.verticalLineTo(1.25f);
        pathBuilder.curveTo(14.0f, 0.56f, 13.44f, 0.0f, 12.75f, 0.0f);
        pathBuilder.reflectiveCurveTo(11.5f, 0.56f, 11.5f, 1.25f);
        pathBuilder.verticalLineToRelative(9.25f);
        pathBuilder.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilder.reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.verticalLineTo(2.75f);
        pathBuilder.curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f);
        pathBuilder.reflectiveCurveTo(8.0f, 2.06f, 8.0f, 2.75f);
        pathBuilder.verticalLineToRelative(8.75f);
        pathBuilder.curveTo(8.0f, 11.78f, 7.78f, 12.0f, 7.5f, 12.0f);
        pathBuilder.reflectiveCurveTo(7.0f, 11.78f, 7.0f, 11.5f);
        pathBuilder.verticalLineTo(5.75f);
        pathBuilder.curveTo(7.0f, 5.06f, 6.44f, 4.5f, 5.75f, 4.5f);
        pathBuilder.reflectiveCurveTo(4.5f, 5.06f, 4.5f, 5.75f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.curveToRelative(0.0f, 4.56f, 3.69f, 8.25f, 8.25f, 8.25f);
        pathBuilder.reflectiveCurveTo(21.0f, 20.31f, 21.0f, 15.75f);
        pathBuilder.verticalLineToRelative(-6.5f);
        pathBuilder.curveTo(21.0f, 8.56f, 20.44f, 8.0f, 19.75f, 8.0f);
        pathBuilder.reflectiveCurveTo(18.5f, 8.56f, 18.5f, 9.25f);
        pathBuilder.verticalLineTo(14.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _frontHand = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
