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
public final class _123Kt {
    private static ImageVector __123;

    public static final ImageVector get_123(Icons.Rounded rounded) {
        ImageVector imageVector = __123;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded._123", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.75f, 10.5f);
        pathBuilder.curveTo(4.34f, 10.5f, 4.0f, 10.16f, 4.0f, 9.75f);
        pathBuilder.reflectiveCurveTo(4.34f, 9.0f, 4.75f, 9.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(4.25f);
        pathBuilder.curveTo(7.0f, 14.66f, 6.66f, 15.0f, 6.25f, 15.0f);
        pathBuilder.reflectiveCurveTo(5.5f, 14.66f, 5.5f, 14.25f);
        pathBuilder.verticalLineTo(10.5f);
        pathBuilder.horizontalLineTo(4.75f);
        pathBuilder.close();
        pathBuilder.moveTo(9.75f, 9.0f);
        pathBuilder.curveTo(9.34f, 9.0f, 9.0f, 9.34f, 9.0f, 9.75f);
        pathBuilder.reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilder.horizontalLineTo(12.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineTo(14.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(2.75f);
        pathBuilder.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilder.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilder.horizontalLineTo(10.5f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(9.75f);
        pathBuilder.close();
        pathBuilder.moveTo(18.5f, 15.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(-2.75f);
        pathBuilder.curveTo(15.34f, 9.0f, 15.0f, 9.34f, 15.0f, 9.75f);
        pathBuilder.reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilder.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(-2.25f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        pathBuilder.reflectiveCurveTo(15.34f, 15.0f, 15.75f, 15.0f);
        pathBuilder.horizontalLineTo(18.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __123 = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
