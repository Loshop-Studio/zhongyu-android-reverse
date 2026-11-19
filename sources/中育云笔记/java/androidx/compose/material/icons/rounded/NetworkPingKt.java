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
public final class NetworkPingKt {
    private static ImageVector _networkPing;

    public static final ImageVector getNetworkPing(Icons.Rounded rounded) {
        ImageVector imageVector = _networkPing;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NetworkPing", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.71f, 6.79f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineTo(10.5f, 16.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(-5.5f);
        pathBuilder.lineToRelative(5.15f, -5.15f);
        pathBuilder.curveTo(18.91f, 10.95f, 19.2f, 11.0f, 19.5f, 11.0f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilder.reflectiveCurveTo(20.88f, 6.0f, 19.5f, 6.0f);
        pathBuilder.reflectiveCurveTo(17.0f, 7.12f, 17.0f, 8.5f);
        pathBuilder.curveToRelative(0.0f, 0.35f, 0.07f, 0.67f, 0.2f, 0.97f);
        pathBuilder.lineToRelative(-5.2f, 5.2f);
        pathBuilder.lineTo(4.12f, 6.79f);
        pathBuilder.curveTo(3.73f, 6.4f, 3.1f, 6.4f, 2.71f, 6.79f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _networkPing = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
