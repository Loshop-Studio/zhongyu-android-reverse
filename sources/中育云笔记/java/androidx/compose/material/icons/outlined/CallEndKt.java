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
public final class CallEndKt {
    private static ImageVector _callEnd;

    public static final ImageVector getCallEnd(Icons.Outlined outlined) {
        ImageVector imageVector = _callEnd;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.CallEnd", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.59f, 10.52f);
        pathBuilder.curveToRelative(1.05f, 0.51f, 2.04f, 1.15f, 2.96f, 1.91f);
        pathBuilder.lineToRelative(-1.07f, 1.07f);
        pathBuilder.curveToRelative(-0.58f, -0.47f, -1.21f, -0.89f, -1.88f, -1.27f);
        pathBuilder.verticalLineToRelative(-1.71f);
        pathBuilder.moveToRelative(-13.2f, 0.0f);
        pathBuilder.verticalLineToRelative(1.7f);
        pathBuilder.curveToRelative(-0.65f, 0.37f, -1.28f, 0.79f, -1.87f, 1.27f);
        pathBuilder.lineToRelative(-1.07f, -1.07f);
        pathBuilder.curveToRelative(0.91f, -0.75f, 1.9f, -1.38f, 2.94f, -1.9f);
        pathBuilder.moveTo(12.0f, 7.0f);
        pathBuilder.curveTo(7.46f, 7.0f, 3.34f, 8.78f, 0.29f, 11.67f);
        pathBuilder.curveToRelative(-0.18f, 0.18f, -0.29f, 0.43f, -0.29f, 0.71f);
        pathBuilder.reflectiveCurveToRelative(0.11f, 0.53f, 0.29f, 0.7f);
        pathBuilder.lineToRelative(2.48f, 2.48f);
        pathBuilder.curveToRelative(0.18f, 0.18f, 0.43f, 0.29f, 0.71f, 0.29f);
        pathBuilder.curveToRelative(0.27f, 0.0f, 0.52f, -0.1f, 0.7f, -0.28f);
        pathBuilder.curveToRelative(0.79f, -0.73f, 1.68f, -1.36f, 2.66f, -1.85f);
        pathBuilder.curveToRelative(0.33f, -0.16f, 0.56f, -0.51f, 0.56f, -0.9f);
        pathBuilder.verticalLineToRelative(-3.1f);
        pathBuilder.curveTo(8.85f, 9.25f, 10.4f, 9.0f, 12.0f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(3.15f, 0.25f, 4.59f, 0.73f);
        pathBuilder.verticalLineToRelative(3.1f);
        pathBuilder.curveToRelative(0.0f, 0.4f, 0.23f, 0.74f, 0.56f, 0.9f);
        pathBuilder.curveToRelative(0.98f, 0.49f, 1.88f, 1.11f, 2.67f, 1.85f);
        pathBuilder.curveToRelative(0.18f, 0.17f, 0.43f, 0.28f, 0.7f, 0.28f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.53f, -0.11f, 0.71f, -0.29f);
        pathBuilder.lineToRelative(2.48f, -2.48f);
        pathBuilder.curveToRelative(0.18f, -0.18f, 0.29f, -0.43f, 0.29f, -0.71f);
        pathBuilder.reflectiveCurveToRelative(-0.11f, -0.53f, -0.29f, -0.71f);
        pathBuilder.curveTo(20.66f, 8.78f, 16.54f, 7.0f, 12.0f, 7.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _callEnd = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
