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
public final class PestControlKt {
    private static ImageVector _pestControl;

    public static final ImageVector getPestControl(Icons.Filled filled) {
        ImageVector imageVector = _pestControl;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PestControl", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 15.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-3.07f);
        pathBuilder.curveToRelative(-0.05f, -0.39f, -0.12f, -0.77f, -0.22f, -1.14f);
        pathBuilder.lineToRelative(2.58f, -1.49f);
        pathBuilder.lineToRelative(-1.0f, -1.73f);
        pathBuilder.lineTo(16.92f, 10.0f);
        pathBuilder.curveToRelative(-0.28f, -0.48f, -0.62f, -0.91f, -0.99f, -1.29f);
        pathBuilder.curveTo(15.97f, 8.48f, 16.0f, 8.25f, 16.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, -0.8f, -0.24f, -1.55f, -0.65f, -2.18f);
        pathBuilder.lineTo(17.0f, 4.17f);
        pathBuilder.lineToRelative(-1.41f, -1.41f);
        pathBuilder.lineToRelative(-1.72f, 1.72f);
        pathBuilder.curveToRelative(-1.68f, -0.89f, -3.1f, -0.33f, -3.73f, 0.0f);
        pathBuilder.lineTo(8.41f, 2.76f);
        pathBuilder.lineTo(7.0f, 4.17f);
        pathBuilder.lineToRelative(1.65f, 1.65f);
        pathBuilder.curveTo(8.24f, 6.45f, 8.0f, 7.2f, 8.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, 0.25f, 0.03f, 0.48f, 0.07f, 0.72f);
        pathBuilder.curveTo(7.7f, 9.1f, 7.36f, 9.53f, 7.08f, 10.0f);
        pathBuilder.lineTo(4.71f, 8.63f);
        pathBuilder.lineToRelative(-1.0f, 1.73f);
        pathBuilder.lineToRelative(2.58f, 1.49f);
        pathBuilder.curveToRelative(-0.1f, 0.37f, -0.17f, 0.75f, -0.22f, 1.14f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(3.07f);
        pathBuilder.curveToRelative(0.05f, 0.39f, 0.12f, 0.77f, 0.22f, 1.14f);
        pathBuilder.lineToRelative(-2.58f, 1.49f);
        pathBuilder.lineToRelative(1.0f, 1.73f);
        pathBuilder.lineTo(7.08f, 18.0f);
        pathBuilder.curveToRelative(1.08f, 1.81f, 2.88f, 3.0f, 4.92f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(3.84f, -1.19f, 4.92f, -3.0f);
        pathBuilder.lineToRelative(2.37f, 1.37f);
        pathBuilder.lineToRelative(1.0f, -1.73f);
        pathBuilder.lineToRelative(-2.58f, -1.49f);
        pathBuilder.curveToRelative(0.1f, -0.37f, 0.17f, -0.75f, 0.22f, -1.14f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pestControl = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
