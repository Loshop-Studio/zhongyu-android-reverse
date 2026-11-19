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
public final class EuroKt {
    private static ImageVector _euro;

    public static final ImageVector getEuro(Icons.Rounded rounded) {
        ImageVector imageVector = _euro;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Euro", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.0f, 18.5f);
        pathBuilder.curveToRelative(-2.51f, 0.0f, -4.68f, -1.42f, -5.76f, -3.5f);
        pathBuilder.horizontalLineToRelative(5.14f);
        pathBuilder.curveToRelative(0.38f, 0.0f, 0.73f, -0.21f, 0.89f, -0.55f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.33f, -0.66f, -0.15f, -1.45f, -0.89f, -1.45f);
        pathBuilder.horizontalLineToRelative(-5.8f);
        pathBuilder.curveToRelative(-0.05f, -0.33f, -0.08f, -0.66f, -0.08f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.03f, -0.67f, 0.08f, -1.0f);
        pathBuilder.horizontalLineToRelative(5.8f);
        pathBuilder.curveToRelative(0.38f, 0.0f, 0.73f, -0.21f, 0.89f, -0.55f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(15.61f, 9.78f, 15.13f, 9.0f, 14.38f, 9.0f);
        pathBuilder.horizontalLineTo(9.24f);
        pathBuilder.curveTo(10.32f, 6.92f, 12.5f, 5.5f, 15.0f, 5.5f);
        pathBuilder.curveToRelative(1.25f, 0.0f, 2.42f, 0.36f, 3.42f, 0.97f);
        pathBuilder.curveToRelative(0.5f, 0.31f, 1.15f, 0.26f, 1.57f, -0.16f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.58f, -0.58f, 0.45f, -1.53f, -0.25f, -1.96f);
        pathBuilder.curveTo(18.36f, 3.5f, 16.73f, 3.0f, 15.0f, 3.0f);
        pathBuilder.curveToRelative(-3.92f, 0.0f, -7.24f, 2.51f, -8.48f, 6.0f);
        pathBuilder.horizontalLineToRelative(-2.9f);
        pathBuilder.curveTo(3.24f, 9.0f, 2.89f, 9.21f, 2.72f, 9.55f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(2.39f, 10.22f, 2.87f, 11.0f, 3.62f, 11.0f);
        pathBuilder.horizontalLineToRelative(2.44f);
        pathBuilder.curveTo(6.02f, 11.33f, 6.0f, 11.66f, 6.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(0.02f, 0.67f, 0.06f, 1.0f);
        pathBuilder.horizontalLineTo(3.62f);
        pathBuilder.curveToRelative(-0.38f, 0.0f, -0.73f, 0.21f, -0.89f, 0.55f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(2.39f, 14.22f, 2.87f, 15.0f, 3.62f, 15.0f);
        pathBuilder.horizontalLineToRelative(2.9f);
        pathBuilder.curveToRelative(1.24f, 3.49f, 4.56f, 6.0f, 8.48f, 6.0f);
        pathBuilder.curveToRelative(1.74f, 0.0f, 3.36f, -0.49f, 4.74f, -1.35f);
        pathBuilder.curveToRelative(0.69f, -0.43f, 0.82f, -1.39f, 0.24f, -1.97f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.42f, -0.42f, -1.07f, -0.47f, -1.57f, -0.15f);
        pathBuilder.curveTo(17.42f, 18.15f, 16.26f, 18.5f, 15.0f, 18.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _euro = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
