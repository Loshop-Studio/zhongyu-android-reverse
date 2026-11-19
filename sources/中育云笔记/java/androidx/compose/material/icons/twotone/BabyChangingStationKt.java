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
public final class BabyChangingStationKt {
    private static ImageVector _babyChangingStation;

    public static final ImageVector getBabyChangingStation(Icons.TwoTone twoTone) {
        ImageVector imageVector = _babyChangingStation;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.BabyChangingStation", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 8.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.lineTo(8.31f, 8.82f);
        pathBuilder.lineTo(7.0f, 12.75f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.lineToRelative(1.58f, -4.63f);
        pathBuilder.curveTo(4.96f, 6.25f, 6.22f, 5.69f, 7.3f, 6.18f);
        pathBuilder.lineToRelative(4.15f, 1.83f);
        pathBuilder.lineTo(14.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 1.0f);
        pathBuilder.curveTo(6.9f, 1.0f, 6.0f, 1.9f, 6.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(9.1f, 1.0f, 8.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.5f, 16.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(18.0f, 13.67f, 18.0f, 14.5f);
        pathBuilder.curveTo(18.0f, 15.33f, 18.67f, 16.0f, 19.5f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _babyChangingStation = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
