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
public final class HeartBrokenKt {
    private static ImageVector _heartBroken;

    public static final ImageVector getHeartBroken(Icons.Rounded rounded) {
        ImageVector imageVector = _heartBroken;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HeartBroken", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.57f, 3.95f);
        pathBuilder.curveToRelative(-1.92f, -1.29f, -4.08f, -1.17f, -5.8f, -0.26f);
        pathBuilder.lineTo(12.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(1.66f);
        pathBuilder.curveToRelative(0.67f, 0.0f, 1.15f, 0.65f, 0.96f, 1.29f);
        pathBuilder.lineToRelative(-1.82f, 6.07f);
        pathBuilder.curveToRelative(-0.09f, 0.29f, -0.52f, 0.2f, -0.49f, -0.1f);
        pathBuilder.lineTo(13.0f, 10.0f);
        pathBuilder.horizontalLineToRelative(-1.67f);
        pathBuilder.curveToRelative(-0.66f, 0.0f, -1.14f, -0.64f, -0.96f, -1.27f);
        pathBuilder.lineToRelative(1.18f, -4.11f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder.curveTo(9.7f, 2.89f, 6.71f, 2.32f, 4.27f, 4.04f);
        pathBuilder.curveTo(2.82f, 5.07f, 2.0f, 6.7f, 2.0f, 8.49f);
        pathBuilder.curveToRelative(-0.01f, 3.81f, 3.53f, 6.71f, 8.66f, 11.3f);
        pathBuilder.curveToRelative(0.76f, 0.68f, 1.92f, 0.69f, 2.69f, 0.01f);
        pathBuilder.curveToRelative(4.98f, -4.42f, 8.87f, -7.58f, 8.64f, -11.62f);
        pathBuilder.curveTo(21.9f, 6.45f, 21.0f, 4.92f, 19.57f, 3.95f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _heartBroken = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
