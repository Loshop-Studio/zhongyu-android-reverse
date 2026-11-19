package androidx.compose.material.icons.outlined;

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
public final class YardKt {
    private static ImageVector _yard;

    public static final ImageVector getYard(Icons.Outlined outlined) {
        ImageVector imageVector = _yard;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Yard", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 13.0f);
        pathBuilder.curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
        pathBuilder.curveTo(15.31f, 19.0f, 18.0f, 16.31f, 18.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilder.curveTo(12.0f, 15.69f, 9.31f, 13.0f, 6.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 11.03f);
        pathBuilder.curveToRelative(0.0f, 0.86f, 0.7f, 1.56f, 1.56f, 1.56f);
        pathBuilder.curveToRelative(0.33f, 0.0f, 0.63f, -0.1f, 0.89f, -0.28f);
        pathBuilder.lineToRelative(-0.01f, 0.12f);
        pathBuilder.curveToRelative(0.0f, 0.86f, 0.7f, 1.56f, 1.56f, 1.56f);
        pathBuilder.reflectiveCurveToRelative(1.56f, -0.7f, 1.56f, -1.56f);
        pathBuilder.lineToRelative(-0.01f, -0.12f);
        pathBuilder.curveToRelative(0.25f, 0.17f, 0.56f, 0.28f, 0.89f, 0.28f);
        pathBuilder.curveToRelative(0.86f, 0.0f, 1.56f, -0.7f, 1.56f, -1.56f);
        pathBuilder.curveToRelative(0.0f, -0.62f, -0.37f, -1.16f, -0.89f, -1.41f);
        pathBuilder.curveTo(15.63f, 9.38f, 16.0f, 8.84f, 16.0f, 8.22f);
        pathBuilder.curveToRelative(0.0f, -0.86f, -0.7f, -1.56f, -1.56f, -1.56f);
        pathBuilder.curveToRelative(-0.33f, 0.0f, -0.63f, 0.1f, -0.89f, 0.28f);
        pathBuilder.lineToRelative(0.01f, -0.12f);
        pathBuilder.curveToRelative(0.0f, -0.86f, -0.7f, -1.56f, -1.56f, -1.56f);
        pathBuilder.reflectiveCurveToRelative(-1.56f, 0.7f, -1.56f, 1.56f);
        pathBuilder.lineToRelative(0.01f, 0.12f);
        pathBuilder.curveTo(10.2f, 6.76f, 9.89f, 6.66f, 9.56f, 6.66f);
        pathBuilder.curveTo(8.7f, 6.66f, 8.0f, 7.36f, 8.0f, 8.22f);
        pathBuilder.curveToRelative(0.0f, 0.62f, 0.37f, 1.16f, 0.89f, 1.41f);
        pathBuilder.curveTo(8.37f, 9.87f, 8.0f, 10.41f, 8.0f, 11.03f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 8.06f);
        pathBuilder.curveToRelative(0.86f, 0.0f, 1.56f, 0.7f, 1.56f, 1.56f);
        pathBuilder.reflectiveCurveToRelative(-0.7f, 1.56f, -1.56f, 1.56f);
        pathBuilder.reflectiveCurveToRelative(-1.56f, -0.7f, -1.56f, -1.56f);
        pathBuilder.reflectiveCurveTo(11.14f, 8.06f, 12.0f, 8.06f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 4.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.moveTo(20.0f, 2.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _yard = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
