package androidx.compose.material.icons.automirrored.outlined;

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
public final class AltRouteKt {
    private static ImageVector _altRoute;

    public static final ImageVector getAltRoute(Icons.AutoMirrored.Outlined outlined) {
        ImageVector imageVector = _altRoute;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Outlined.AltRoute", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.78f, 11.16f);
        pathBuilder.lineToRelative(-1.42f, 1.42f);
        pathBuilder.curveToRelative(-0.68f, -0.69f, -1.34f, -1.58f, -1.79f, -2.94f);
        pathBuilder.lineToRelative(1.94f, -0.49f);
        pathBuilder.curveTo(8.83f, 10.04f, 9.28f, 10.65f, 9.78f, 11.16f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 6.0f);
        pathBuilder.lineTo(7.0f, 2.0f);
        pathBuilder.lineTo(3.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(3.02f);
        pathBuilder.curveTo(6.04f, 6.81f, 6.1f, 7.54f, 6.21f, 8.17f);
        pathBuilder.lineToRelative(1.94f, -0.49f);
        pathBuilder.curveTo(8.08f, 7.2f, 8.03f, 6.63f, 8.02f, 6.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 6.0f);
        pathBuilder.lineToRelative(-4.0f, -4.0f);
        pathBuilder.lineToRelative(-4.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(2.99f);
        pathBuilder.curveToRelative(-0.1f, 3.68f, -1.28f, 4.75f, -2.54f, 5.88f);
        pathBuilder.curveToRelative(-0.5f, 0.44f, -1.01f, 0.92f, -1.45f, 1.55f);
        pathBuilder.curveToRelative(-0.34f, -0.49f, -0.73f, -0.88f, -1.13f, -1.24f);
        pathBuilder.lineTo(9.46f, 13.6f);
        pathBuilder.curveTo(10.39f, 14.45f, 11.0f, 15.14f, 11.0f, 17.0f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-5.0f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -2.02f, 0.71f, -2.66f, 1.79f, -3.63f);
        pathBuilder.curveToRelative(1.38f, -1.24f, 3.08f, -2.78f, 3.2f, -7.37f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _altRoute = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
