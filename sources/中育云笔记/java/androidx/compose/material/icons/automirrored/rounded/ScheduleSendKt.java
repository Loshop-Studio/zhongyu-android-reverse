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
public final class ScheduleSendKt {
    private static ImageVector _scheduleSend;

    public static final ImageVector getScheduleSend(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _scheduleSend;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.ScheduleSend", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.0f, 10.0f);
        pathBuilder.curveToRelative(0.1f, 0.0f, 0.19f, 0.01f, 0.28f, 0.01f);
        pathBuilder.lineTo(4.39f, 4.58f);
        pathBuilder.curveTo(3.73f, 4.31f, 3.0f, 4.79f, 3.0f, 5.51f);
        pathBuilder.verticalLineToRelative(3.71f);
        pathBuilder.curveToRelative(0.0f, 0.46f, 0.31f, 0.86f, 0.76f, 0.97f);
        pathBuilder.lineTo(11.0f, 12.0f);
        pathBuilder.lineToRelative(-7.24f, 1.81f);
        pathBuilder.curveTo(3.31f, 13.92f, 3.0f, 14.32f, 3.0f, 14.78f);
        pathBuilder.verticalLineToRelative(3.71f);
        pathBuilder.curveToRelative(0.0f, 0.72f, 0.73f, 1.2f, 1.39f, 0.92f);
        pathBuilder.lineTo(10.0f, 17.05f);
        pathBuilder.curveToRelative(0.0f, -0.02f, 0.0f, -0.03f, 0.0f, -0.05f);
        pathBuilder.curveTo(10.0f, 13.14f, 13.14f, 10.0f, 17.0f, 10.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.0f, 12.0f);
        pathBuilder2.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder2.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder2.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilder2.reflectiveCurveTo(19.76f, 12.0f, 17.0f, 12.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(18.29f, 19.0f);
        pathBuilder2.lineToRelative(-1.65f, -1.65f);
        pathBuilder2.curveToRelative(-0.09f, -0.09f, -0.15f, -0.22f, -0.15f, -0.35f);
        pathBuilder2.verticalLineToRelative(-2.5f);
        pathBuilder2.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilder2.verticalLineToRelative(2.29f);
        pathBuilder2.lineToRelative(1.5f, 1.5f);
        pathBuilder2.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder2.lineToRelative(0.0f, 0.0f);
        pathBuilder2.curveTo(18.8f, 19.2f, 18.49f, 19.2f, 18.29f, 19.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _scheduleSend = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
