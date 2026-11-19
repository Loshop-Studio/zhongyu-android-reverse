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
public final class CallKt {
    private static ImageVector _call;

    public static final ImageVector getCall(Icons.Filled filled) {
        ImageVector imageVector = _call;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Call", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.01f, 15.38f);
        pathBuilder.curveToRelative(-1.23f, 0.0f, -2.42f, -0.2f, -3.53f, -0.56f);
        pathBuilder.curveToRelative(-0.35f, -0.12f, -0.74f, -0.03f, -1.01f, 0.24f);
        pathBuilder.lineToRelative(-1.57f, 1.97f);
        pathBuilder.curveToRelative(-2.83f, -1.35f, -5.48f, -3.9f, -6.89f, -6.83f);
        pathBuilder.lineToRelative(1.95f, -1.66f);
        pathBuilder.curveToRelative(0.27f, -0.28f, 0.35f, -0.67f, 0.24f, -1.02f);
        pathBuilder.curveToRelative(-0.37f, -1.11f, -0.56f, -2.3f, -0.56f, -3.53f);
        pathBuilder.curveToRelative(0.0f, -0.54f, -0.45f, -0.99f, -0.99f, -0.99f);
        pathBuilder.horizontalLineTo(4.19f);
        pathBuilder.curveTo(3.65f, 3.0f, 3.0f, 3.24f, 3.0f, 3.99f);
        pathBuilder.curveTo(3.0f, 13.28f, 10.73f, 21.0f, 20.01f, 21.0f);
        pathBuilder.curveToRelative(0.71f, 0.0f, 0.99f, -0.63f, 0.99f, -1.18f);
        pathBuilder.verticalLineToRelative(-3.45f);
        pathBuilder.curveToRelative(0.0f, -0.54f, -0.45f, -0.99f, -0.99f, -0.99f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _call = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
