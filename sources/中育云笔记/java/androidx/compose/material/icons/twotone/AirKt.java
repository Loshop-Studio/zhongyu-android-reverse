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
public final class AirKt {
    private static ImageVector _air;

    public static final ImageVector getAir(Icons.TwoTone twoTone) {
        ImageVector imageVector = _air;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Air", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.5f, 17.0f);
        pathBuilder.curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(9.5f);
        pathBuilder.curveTo(13.15f, 14.0f, 14.5f, 15.35f, 14.5f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 6.5f);
        pathBuilder.curveTo(19.0f, 4.57f, 17.43f, 3.0f, 15.5f, 3.0f);
        pathBuilder.reflectiveCurveTo(12.0f, 4.57f, 12.0f, 6.5f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveTo(14.0f, 5.67f, 14.67f, 5.0f, 15.5f, 5.0f);
        pathBuilder.reflectiveCurveTo(17.0f, 5.67f, 17.0f, 6.5f);
        pathBuilder.reflectiveCurveTo(16.33f, 8.0f, 15.5f, 8.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(13.5f);
        pathBuilder.curveTo(17.43f, 10.0f, 19.0f, 8.43f, 19.0f, 6.5f);
        pathBuilder.close();
        pathBuilder.moveTo(18.5f, 11.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(16.5f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(19.33f, 16.0f, 18.5f, 16.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder.reflectiveCurveTo(20.43f, 11.0f, 18.5f, 11.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _air = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
