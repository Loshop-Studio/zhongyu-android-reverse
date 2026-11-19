package androidx.compose.material.icons.filled;

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
public final class DonutSmallKt {
    private static ImageVector _donutSmall;

    public static final ImageVector getDonutSmall(Icons.Filled filled) {
        ImageVector imageVector = _donutSmall;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DonutSmall", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 9.16f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.curveToRelative(-5.0f, 0.5f, -9.0f, 4.79f, -9.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(4.0f, 9.5f, 9.0f, 10.0f);
        pathBuilder.verticalLineToRelative(-7.16f);
        pathBuilder.curveToRelative(-1.0f, -0.41f, -2.0f, -1.52f, -2.0f, -2.84f);
        pathBuilder.reflectiveCurveToRelative(1.0f, -2.43f, 2.0f, -2.84f);
        pathBuilder.close();
        pathBuilder.moveTo(14.86f, 11.0f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.curveToRelative(-0.48f, -4.75f, -4.0f, -8.53f, -9.0f, -9.0f);
        pathBuilder.verticalLineToRelative(7.16f);
        pathBuilder.curveToRelative(1.0f, 0.3f, 1.52f, 0.98f, 1.86f, 1.84f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 14.84f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.curveToRelative(5.0f, -0.47f, 8.52f, -4.25f, 9.0f, -9.0f);
        pathBuilder.horizontalLineToRelative(-7.14f);
        pathBuilder.curveToRelative(-0.34f, 0.86f, -0.86f, 1.54f, -1.86f, 1.84f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _donutSmall = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
