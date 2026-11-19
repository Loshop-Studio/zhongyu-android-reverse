package androidx.compose.material.icons.automirrored.rounded;

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
public final class AirplaneTicketKt {
    private static ImageVector _airplaneTicket;

    public static final ImageVector getAirplaneTicket(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _airplaneTicket;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.AirplaneTicket", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.19f, 4.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveTo(2.9f, 4.0f, 2.01f, 4.9f, 2.01f, 6.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveTo(3.11f, 10.0f, 4.0f, 10.9f, 4.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.curveTo(22.0f, 4.9f, 21.19f, 4.0f, 20.19f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.73f, 13.3f);
        pathBuilder.lineToRelative(-8.49f, 2.26f);
        pathBuilder.curveToRelative(-0.22f, 0.06f, -0.45f, -0.04f, -0.56f, -0.23f);
        pathBuilder.lineToRelative(-1.12f, -1.95f);
        pathBuilder.curveToRelative(-0.18f, -0.3f, -0.01f, -0.69f, 0.32f, -0.78f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.16f, -0.04f, 0.34f, -0.01f, 0.47f, 0.1f);
        pathBuilder.lineToRelative(1.05f, 0.82f);
        pathBuilder.lineToRelative(2.39f, -0.64f);
        pathBuilder.lineTo(9.9f, 9.6f);
        pathBuilder.curveToRelative(-0.26f, -0.44f, -0.02f, -1.01f, 0.47f, -1.15f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.26f, -0.07f, 0.54f, 0.0f, 0.74f, 0.18f);
        pathBuilder.lineToRelative(3.69f, 3.44f);
        pathBuilder.lineToRelative(2.44f, -0.65f);
        pathBuilder.curveToRelative(0.51f, -0.14f, 1.04f, 0.17f, 1.18f, 0.68f);
        pathBuilder.curveTo(18.55f, 12.62f, 18.25f, 13.15f, 17.73f, 13.3f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airplaneTicket = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
