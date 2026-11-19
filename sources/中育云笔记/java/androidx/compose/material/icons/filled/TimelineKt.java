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
public final class TimelineKt {
    private static ImageVector _timeline;

    public static final ImageVector getTimeline(Icons.Filled filled) {
        ImageVector imageVector = _timeline;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Timeline", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(23.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.curveToRelative(-0.18f, 0.0f, -0.35f, -0.02f, -0.51f, -0.07f);
        pathBuilder.lineToRelative(-3.56f, 3.55f);
        pathBuilder.curveTo(16.98f, 13.64f, 17.0f, 13.82f, 17.0f, 14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -0.18f, 0.02f, -0.36f, 0.07f, -0.52f);
        pathBuilder.lineToRelative(-2.55f, -2.55f);
        pathBuilder.curveTo(10.36f, 10.98f, 10.18f, 11.0f, 10.0f, 11.0f);
        pathBuilder.reflectiveCurveToRelative(-0.36f, -0.02f, -0.52f, -0.07f);
        pathBuilder.lineToRelative(-4.55f, 4.56f);
        pathBuilder.curveTo(4.98f, 15.65f, 5.0f, 15.82f, 5.0f, 16.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.curveToRelative(0.18f, 0.0f, 0.35f, 0.02f, 0.51f, 0.07f);
        pathBuilder.lineToRelative(4.56f, -4.55f);
        pathBuilder.curveTo(8.02f, 9.36f, 8.0f, 9.18f, 8.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.curveToRelative(0.0f, 0.18f, -0.02f, 0.36f, -0.07f, 0.52f);
        pathBuilder.lineToRelative(2.55f, 2.55f);
        pathBuilder.curveTo(14.64f, 12.02f, 14.82f, 12.0f, 15.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(0.36f, 0.02f, 0.52f, 0.07f);
        pathBuilder.lineToRelative(3.55f, -3.56f);
        pathBuilder.curveTo(19.02f, 8.35f, 19.0f, 8.18f, 19.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(23.0f, 6.9f, 23.0f, 8.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _timeline = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
