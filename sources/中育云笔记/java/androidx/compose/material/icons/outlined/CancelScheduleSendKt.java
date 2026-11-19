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
public final class CancelScheduleSendKt {
    private static ImageVector _cancelScheduleSend;

    public static final ImageVector getCancelScheduleSend(Icons.Outlined outlined) {
        ImageVector imageVector = _cancelScheduleSend;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.CancelScheduleSend", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.5f, 9.0f);
        pathBuilder.curveToRelative(-0.42f, 0.0f, -0.83f, 0.04f, -1.24f, 0.11f);
        pathBuilder.lineTo(1.01f, 3.0f);
        pathBuilder.lineTo(1.0f, 10.0f);
        pathBuilder.lineToRelative(10.06f, 1.34f);
        pathBuilder.curveToRelative(-0.42f, 0.44f, -0.78f, 0.93f, -1.09f, 1.46f);
        pathBuilder.lineTo(1.0f, 14.0f);
        pathBuilder.lineToRelative(0.01f, 7.0f);
        pathBuilder.lineToRelative(8.07f, -3.46f);
        pathBuilder.curveTo(9.59f, 21.19f, 12.71f, 24.0f, 16.5f, 24.0f);
        pathBuilder.curveToRelative(4.14f, 0.0f, 7.5f, -3.36f, 7.5f, -7.5f);
        pathBuilder.reflectiveCurveTo(20.64f, 9.0f, 16.5f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 8.25f);
        pathBuilder.lineToRelative(0.01f, -2.22f);
        pathBuilder.lineToRelative(7.51f, 3.22f);
        pathBuilder.lineTo(3.0f, 8.25f);
        pathBuilder.close();
        pathBuilder.moveTo(9.1f, 15.36f);
        pathBuilder.lineTo(3.0f, 17.97f);
        pathBuilder.verticalLineToRelative(-2.22f);
        pathBuilder.lineToRelative(6.17f, -0.82f);
        pathBuilder.curveTo(9.14f, 15.07f, 9.12f, 15.21f, 9.1f, 15.36f);
        pathBuilder.close();
        pathBuilder.moveTo(16.5f, 22.0f);
        pathBuilder.curveToRelative(-3.03f, 0.0f, -5.5f, -2.47f, -5.5f, -5.5f);
        pathBuilder.reflectiveCurveToRelative(2.47f, -5.5f, 5.5f, -5.5f);
        pathBuilder.reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f);
        pathBuilder.reflectiveCurveTo(19.53f, 22.0f, 16.5f, 22.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(18.27f, 14.03f);
        pathBuilder2.lineToRelative(-1.77f, 1.76f);
        pathBuilder2.lineToRelative(-1.77f, -1.76f);
        pathBuilder2.lineToRelative(-0.7f, 0.7f);
        pathBuilder2.lineToRelative(1.76f, 1.77f);
        pathBuilder2.lineToRelative(-1.76f, 1.77f);
        pathBuilder2.lineToRelative(0.7f, 0.7f);
        pathBuilder2.lineToRelative(1.77f, -1.76f);
        pathBuilder2.lineToRelative(1.77f, 1.76f);
        pathBuilder2.lineToRelative(0.7f, -0.7f);
        pathBuilder2.lineToRelative(-1.76f, -1.77f);
        pathBuilder2.lineToRelative(1.76f, -1.77f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cancelScheduleSend = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
