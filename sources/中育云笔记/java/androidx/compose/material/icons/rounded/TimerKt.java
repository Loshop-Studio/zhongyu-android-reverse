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
public final class TimerKt {
    private static ImageVector _timer;

    public static final ImageVector getTimer(Icons.Rounded rounded) {
        ImageVector imageVector = _timer;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Timer", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.curveTo(9.45f, 1.0f, 9.0f, 1.45f, 9.0f, 2.0f);
        pathBuilder.curveTo(9.0f, 2.55f, 9.45f, 3.0f, 10.0f, 3.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(19.03f, 7.39f);
        pathBuilder2.lineToRelative(0.75f, -0.75f);
        pathBuilder2.curveToRelative(0.38f, -0.38f, 0.39f, -1.01f, 0.0f, -1.4f);
        pathBuilder2.curveToRelative(0.0f, 0.0f, -0.01f, -0.01f, -0.01f, -0.01f);
        pathBuilder2.curveToRelative(-0.39f, -0.39f, -1.01f, -0.38f, -1.4f, 0.0f);
        pathBuilder2.lineToRelative(-0.75f, 0.75f);
        pathBuilder2.curveTo(16.07f, 4.74f, 14.12f, 4.0f, 12.0f, 4.0f);
        pathBuilder2.curveToRelative(-4.8f, 0.0f, -8.88f, 3.96f, -9.0f, 8.76f);
        pathBuilder2.curveTo(2.87f, 17.84f, 6.94f, 22.0f, 12.0f, 22.0f);
        pathBuilder2.curveToRelative(4.98f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
        pathBuilder2.curveTo(21.0f, 10.88f, 20.26f, 8.93f, 19.03f, 7.39f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.0f, 13.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder2.verticalLineTo(9.0f);
        pathBuilder2.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder2.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder2.verticalLineTo(13.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _timer = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
