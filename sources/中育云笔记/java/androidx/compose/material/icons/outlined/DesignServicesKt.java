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
public final class DesignServicesKt {
    private static ImageVector _designServices;

    public static final ImageVector getDesignServices(Icons.Outlined outlined) {
        ImageVector imageVector = _designServices;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DesignServices", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.97f, 7.27f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineToRelative(-2.83f, -2.83f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(-4.49f, 4.49f);
        pathBuilder.lineTo(8.35f, 3.63f);
        pathBuilder.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        pathBuilder.lineToRelative(-1.9f, 1.9f);
        pathBuilder.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilder.lineToRelative(3.89f, 3.89f);
        pathBuilder.lineTo(3.0f, 16.76f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.horizontalLineToRelative(4.24f);
        pathBuilder.lineToRelative(4.52f, -4.52f);
        pathBuilder.lineToRelative(3.89f, 3.89f);
        pathBuilder.curveToRelative(0.95f, 0.95f, 2.23f, 0.6f, 2.83f, 0.0f);
        pathBuilder.lineToRelative(1.9f, -1.9f);
        pathBuilder.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        pathBuilder.lineToRelative(-3.89f, -3.89f);
        pathBuilder.lineTo(20.97f, 7.27f);
        pathBuilder.close();
        pathBuilder.moveTo(5.04f, 6.94f);
        pathBuilder.lineToRelative(1.89f, -1.9f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder.lineToRelative(1.27f, 1.27f);
        pathBuilder.lineTo(7.02f, 7.5f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineToRelative(1.19f, -1.19f);
        pathBuilder.lineToRelative(1.2f, 1.2f);
        pathBuilder.lineToRelative(-1.9f, 1.9f);
        pathBuilder.lineTo(5.04f, 6.94f);
        pathBuilder.close();
        pathBuilder.moveTo(16.27f, 14.38f);
        pathBuilder.lineToRelative(-1.19f, 1.19f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineToRelative(1.19f, -1.19f);
        pathBuilder.lineToRelative(1.27f, 1.27f);
        pathBuilder.lineToRelative(-1.9f, 1.9f);
        pathBuilder.lineToRelative(-3.89f, -3.89f);
        pathBuilder.lineToRelative(1.9f, -1.9f);
        pathBuilder.lineTo(16.27f, 14.38f);
        pathBuilder.close();
        pathBuilder.moveTo(6.41f, 19.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineToRelative(-1.41f);
        pathBuilder.lineToRelative(9.61f, -9.61f);
        pathBuilder.lineToRelative(1.3f, 1.3f);
        pathBuilder.lineToRelative(0.11f, 0.11f);
        pathBuilder.lineTo(6.41f, 19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.02f, 6.56f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineTo(16.02f, 6.56f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _designServices = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
