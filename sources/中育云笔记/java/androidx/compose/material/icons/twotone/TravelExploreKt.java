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
public final class TravelExploreKt {
    private static ImageVector _travelExplore;

    public static final ImageVector getTravelExplore(Icons.TwoTone twoTone) {
        ImageVector imageVector = _travelExplore;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.TravelExplore", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.3f, 16.9f);
        pathBuilder.curveToRelative(0.4f, -0.7f, 0.7f, -1.5f, 0.7f, -2.4f);
        pathBuilder.curveToRelative(0.0f, -2.5f, -2.0f, -4.5f, -4.5f, -4.5f);
        pathBuilder.reflectiveCurveTo(11.0f, 12.0f, 11.0f, 14.5f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 4.5f, 4.5f, 4.5f);
        pathBuilder.curveToRelative(0.9f, 0.0f, 1.7f, -0.3f, 2.4f, -0.7f);
        pathBuilder.lineToRelative(3.2f, 3.2f);
        pathBuilder.lineToRelative(1.4f, -1.4f);
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
