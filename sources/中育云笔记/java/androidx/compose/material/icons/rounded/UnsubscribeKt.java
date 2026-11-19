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
public final class UnsubscribeKt {
    private static ImageVector _unsubscribe;

    public static final ImageVector getUnsubscribe(Icons.Rounded rounded) {
        ImageVector imageVector = _unsubscribe;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Unsubscribe", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.5f, 11.5f);
        pathBuilder.curveToRelative(0.92f, 0.0f, 1.75f, 0.26f, 2.49f, 0.69f);
        pathBuilder.lineTo(20.99f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.89f, -2.0f, -1.99f, -2.0f);
        pathBuilder.lineTo(5.0f, 3.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(8.55f);
        pathBuilder.curveToRelative(-0.02f, -0.17f, -0.05f, -0.33f, -0.05f, -0.5f);
        pathBuilder.curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.89f, 10.05f);
        pathBuilder.curveToRelative(-0.56f, 0.28f, -1.23f, 0.28f, -1.79f, 0.0f);
        pathBuilder.lineToRelative(-5.61f, -2.8f);
        pathBuilder.curveToRelative(-0.3f, -0.15f, -0.49f, -0.46f, -0.49f, -0.8f);
        pathBuilder.curveToRelative(0.0f, -0.66f, 0.7f, -1.1f, 1.29f, -0.8f);
        pathBuilder.lineTo(12.0f, 8.5f);
        pathBuilder.lineToRelative(5.71f, -2.85f);
        pathBuilder.curveToRelative(0.59f, -0.3f, 1.29f, 0.13f, 1.29f, 0.8f);
        pathBuilder.curveToRelative(0.0f, 0.34f, -0.19f, 0.65f, -0.49f, 0.8f);
        pathBuilder.lineToRelative(-5.62f, 2.8f);
        pathBuilder.close();
        pathBuilder.moveTo(18.5f, 13.0f);
        pathBuilder.curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f);
        pathBuilder.reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f);
        pathBuilder.reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder.reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f);
        pathBuilder.close();
        pathBuilder.moveTo(20.5f, 16.5f);
        pathBuilder.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilder.reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _unsubscribe = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
