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
public final class WatchKt {
    private static ImageVector _watch;

    public static final ImageVector getWatch(Icons.Outlined outlined) {
        ImageVector imageVector = _watch;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Watch", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.31f, 2.0f);
        pathBuilder.lineToRelative(0.41f, 2.48f);
        pathBuilder.curveTo(13.87f, 4.17f, 12.96f, 4.0f, 12.0f, 4.0f);
        pathBuilder.curveToRelative(-0.95f, 0.0f, -1.87f, 0.17f, -2.71f, 0.47f);
        pathBuilder.lineTo(9.7f, 2.0f);
        pathBuilder.horizontalLineToRelative(4.61f);
        pathBuilder.moveToRelative(0.41f, 17.52f);
        pathBuilder.lineTo(14.31f, 22.0f);
        pathBuilder.lineTo(9.7f, 22.0f);
        pathBuilder.lineToRelative(-0.41f, -2.47f);
        pathBuilder.curveToRelative(0.84f, 0.3f, 1.76f, 0.47f, 2.71f, 0.47f);
        pathBuilder.curveToRelative(0.96f, 0.0f, 1.87f, -0.17f, 2.72f, -0.48f);
        pathBuilder.moveTo(16.0f, 0.0f);
        pathBuilder.lineTo(8.0f, 0.0f);
        pathBuilder.lineToRelative(-0.95f, 5.73f);
        pathBuilder.curveTo(5.19f, 7.19f, 4.0f, 9.45f, 4.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(1.19f, 4.81f, 3.05f, 6.27f);
        pathBuilder.lineTo(8.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.lineToRelative(0.96f, -5.73f);
        pathBuilder.curveTo(18.81f, 16.81f, 20.0f, 14.54f, 20.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(-1.19f, -4.81f, -3.04f, -6.27f);
        pathBuilder.lineTo(16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 18.0f);
        pathBuilder.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilder.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilder.reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _watch = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
