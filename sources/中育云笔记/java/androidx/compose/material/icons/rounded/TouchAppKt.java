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
public final class TouchAppKt {
    private static ImageVector _touchApp;

    public static final ImageVector getTouchApp(Icons.Rounded rounded) {
        ImageVector imageVector = _touchApp;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TouchApp", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.79f, 9.24f);
        pathBuilder.verticalLineTo(5.5f);
        pathBuilder.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilder.reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilder.verticalLineToRelative(3.74f);
        pathBuilder.curveToRelative(1.21f, -0.81f, 2.0f, -2.18f, 2.0f, -3.74f);
        pathBuilder.curveToRelative(0.0f, -2.49f, -2.01f, -4.5f, -4.5f, -4.5f);
        pathBuilder.reflectiveCurveToRelative(-4.5f, 2.01f, -4.5f, 4.5f);
        pathBuilder.curveTo(6.79f, 7.06f, 7.58f, 8.43f, 8.79f, 9.24f);
        pathBuilder.close();
        pathBuilder.moveTo(14.29f, 11.71f);
        pathBuilder.curveToRelative(-0.28f, -0.14f, -0.58f, -0.21f, -0.89f, -0.21f);
        pathBuilder.horizontalLineToRelative(-0.61f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilder.verticalLineToRelative(10.74f);
        pathBuilder.lineToRelative(-3.44f, -0.72f);
        pathBuilder.curveToRelative(-0.37f, -0.08f, -0.76f, 0.04f, -1.03f, 0.31f);
        pathBuilder.curveToRelative(-0.43f, 0.44f, -0.43f, 1.14f, 0.0f, 1.58f);
        pathBuilder.lineToRelative(4.01f, 4.01f);
        pathBuilder.curveTo(9.71f, 21.79f, 10.22f, 22.0f, 10.75f, 22.0f);
        pathBuilder.horizontalLineToRelative(6.1f);
        pathBuilder.curveToRelative(1.0f, 0.0f, 1.84f, -0.73f, 1.98f, -1.72f);
        pathBuilder.lineToRelative(0.63f, -4.47f);
        pathBuilder.curveToRelative(0.12f, -0.85f, -0.32f, -1.69f, -1.09f, -2.07f);
        pathBuilder.lineTo(14.29f, 11.71f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _touchApp = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
