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
public final class CallEndKt {
    private static ImageVector _callEnd;

    public static final ImageVector getCallEnd(Icons.Filled filled) {
        ImageVector imageVector = _callEnd;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CallEnd", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 9.0f);
        pathBuilder.curveToRelative(-1.6f, 0.0f, -3.15f, 0.25f, -4.6f, 0.72f);
        pathBuilder.verticalLineToRelative(3.1f);
        pathBuilder.curveToRelative(0.0f, 0.39f, -0.23f, 0.74f, -0.56f, 0.9f);
        pathBuilder.curveToRelative(-0.98f, 0.49f, -1.87f, 1.12f, -2.66f, 1.85f);
        pathBuilder.curveToRelative(-0.18f, 0.18f, -0.43f, 0.28f, -0.7f, 0.28f);
        pathBuilder.curveToRelative(-0.28f, 0.0f, -0.53f, -0.11f, -0.71f, -0.29f);
        pathBuilder.lineTo(0.29f, 13.08f);
        pathBuilder.curveToRelative(-0.18f, -0.17f, -0.29f, -0.42f, -0.29f, -0.7f);
        pathBuilder.curveToRelative(0.0f, -0.28f, 0.11f, -0.53f, 0.29f, -0.71f);
        pathBuilder.curveTo(3.34f, 8.78f, 7.46f, 7.0f, 12.0f, 7.0f);
        pathBuilder.reflectiveCurveToRelative(8.66f, 1.78f, 11.71f, 4.67f);
        pathBuilder.curveToRelative(0.18f, 0.18f, 0.29f, 0.43f, 0.29f, 0.71f);
        pathBuilder.curveToRelative(0.0f, 0.28f, -0.11f, 0.53f, -0.29f, 0.71f);
        pathBuilder.lineToRelative(-2.48f, 2.48f);
        pathBuilder.curveToRelative(-0.18f, 0.18f, -0.43f, 0.29f, -0.71f, 0.29f);
        pathBuilder.curveToRelative(-0.27f, 0.0f, -0.52f, -0.11f, -0.7f, -0.28f);
        pathBuilder.curveToRelative(-0.79f, -0.74f, -1.69f, -1.36f, -2.67f, -1.85f);
        pathBuilder.curveToRelative(-0.33f, -0.16f, -0.56f, -0.5f, -0.56f, -0.9f);
        pathBuilder.verticalLineToRelative(-3.1f);
        pathBuilder.curveTo(15.15f, 9.25f, 13.6f, 9.0f, 12.0f, 9.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _callEnd = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
