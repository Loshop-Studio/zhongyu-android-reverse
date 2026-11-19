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
public final class TravelExploreKt {
    private static ImageVector _travelExplore;

    public static final ImageVector getTravelExplore(Icons.Rounded rounded) {
        ImageVector imageVector = _travelExplore;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TravelExplore", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.3f, 16.9f);
        pathBuilder.curveToRelative(0.58f, -1.01f, 0.95f, -2.23f, 0.51f, -3.65f);
        pathBuilder.curveToRelative(-0.53f, -1.72f, -2.04f, -3.05f, -3.84f, -3.22f);
        pathBuilder.curveToRelative(-2.87f, -0.28f, -5.23f, 2.07f, -4.95f, 4.95f);
        pathBuilder.curveToRelative(0.18f, 1.79f, 1.5f, 3.31f, 3.22f, 3.84f);
        pathBuilder.curveToRelative(1.43f, 0.44f, 2.64f, 0.07f, 3.65f, -0.51f);
        pathBuilder.lineToRelative(2.5f, 2.5f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.01f, 0.39f, 1.4f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.01f, 0.0f, -1.4f);
        pathBuilder.lineTo(19.3f, 16.9f);
        pathBuilder.close();
        pathBuilder.moveTo(15.5f, 17.0f);
        pathBuilder.curveToRelative(-1.4f, 0.0f, -2.5f, -1.1f, -2.5f, -2.5f);
        pathBuilder.reflectiveCurveToRelative(1.1f, -2.5f, 2.5f, -2.5f);
        pathBuilder.reflectiveCurveToRelative(2.5f, 1.1f, 2.5f, 2.5f);
        pathBuilder.reflectiveCurveTo(16.9f, 17.0f, 15.5f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f);
        pathBuilder.curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f);
        pathBuilder.curveToRelative(4.84f, 0.0f, 8.87f, 3.44f, 9.8f, 8.0f);
        pathBuilder.horizontalLineToRelative(-2.07f);
        pathBuilder.curveToRelative(-0.64f, -2.46f, -2.4f, -4.47f, -4.73f, -5.41f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.lineToRelative(-4.79f, -4.79f);
        pathBuilder.curveTo(4.08f, 10.79f, 4.0f, 11.38f, 4.0f, 12.0f);
        pathBuilder.curveTo(4.0f, 16.41f, 7.59f, 20.0f, 12.0f, 20.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _travelExplore = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
