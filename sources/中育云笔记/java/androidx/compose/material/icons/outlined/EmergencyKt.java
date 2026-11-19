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
public final class EmergencyKt {
    private static ImageVector _emergency;

    public static final ImageVector getEmergency(Icons.Outlined outlined) {
        ImageVector imageVector = _emergency;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Emergency", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.29f, 13.9f);
        pathBuilder.lineTo(18.0f, 12.0f);
        pathBuilder.lineToRelative(3.29f, -1.9f);
        pathBuilder.curveToRelative(0.48f, -0.28f, 0.64f, -0.89f, 0.37f, -1.37f);
        pathBuilder.lineToRelative(-2.0f, -3.46f);
        pathBuilder.curveToRelative(-0.28f, -0.48f, -0.89f, -0.64f, -1.37f, -0.37f);
        pathBuilder.lineTo(15.0f, 6.8f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.curveTo(9.45f, 2.0f, 9.0f, 2.45f, 9.0f, 3.0f);
        pathBuilder.verticalLineToRelative(3.8f);
        pathBuilder.lineTo(5.71f, 4.9f);
        pathBuilder.curveTo(5.23f, 4.63f, 4.62f, 4.79f, 4.34f, 5.27f);
        pathBuilder.lineToRelative(-2.0f, 3.46f);
        pathBuilder.curveTo(2.06f, 9.21f, 2.23f, 9.82f, 2.71f, 10.1f);
        pathBuilder.lineTo(6.0f, 12.0f);
        pathBuilder.lineToRelative(-3.29f, 1.9f);
        pathBuilder.curveToRelative(-0.48f, 0.28f, -0.64f, 0.89f, -0.37f, 1.37f);
        pathBuilder.lineToRelative(2.0f, 3.46f);
        pathBuilder.curveToRelative(0.28f, 0.48f, 0.89f, 0.64f, 1.37f, 0.37f);
        pathBuilder.lineTo(9.0f, 17.2f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-3.8f);
        pathBuilder.lineToRelative(3.29f, 1.9f);
        pathBuilder.curveToRelative(0.48f, 0.28f, 1.09f, 0.11f, 1.37f, -0.37f);
        pathBuilder.lineToRelative(2.0f, -3.46f);
        pathBuilder.curveTo(21.94f, 14.79f, 21.77f, 14.18f, 21.29f, 13.9f);
        pathBuilder.close();
        pathBuilder.moveTo(18.43f, 16.87f);
        pathBuilder.lineToRelative(-4.68f, -2.7f);
        pathBuilder.curveTo(13.42f, 13.97f, 13.0f, 14.21f, 13.0f, 14.6f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-5.4f);
        pathBuilder.curveToRelative(0.0f, -0.38f, -0.42f, -0.63f, -0.75f, -0.43f);
        pathBuilder.lineToRelative(-4.68f, 2.7f);
        pathBuilder.lineToRelative(-1.0f, -1.73f);
        pathBuilder.lineToRelative(4.68f, -2.7f);
        pathBuilder.curveToRelative(0.33f, -0.19f, 0.33f, -0.67f, 0.0f, -0.87f);
        pathBuilder.lineToRelative(-4.68f, -2.7f);
        pathBuilder.lineToRelative(1.0f, -1.73f);
        pathBuilder.lineToRelative(4.68f, 2.7f);
        pathBuilder.curveTo(10.58f, 10.03f, 11.0f, 9.79f, 11.0f, 9.4f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(5.4f);
        pathBuilder.curveToRelative(0.0f, 0.38f, 0.42f, 0.63f, 0.75f, 0.43f);
        pathBuilder.lineToRelative(4.68f, -2.7f);
        pathBuilder.lineToRelative(1.0f, 1.73f);
        pathBuilder.lineToRelative(-4.68f, 2.7f);
        pathBuilder.curveToRelative(-0.33f, 0.19f, -0.33f, 0.67f, 0.0f, 0.87f);
        pathBuilder.lineToRelative(4.68f, 2.7f);
        pathBuilder.lineTo(18.43f, 16.87f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emergency = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
