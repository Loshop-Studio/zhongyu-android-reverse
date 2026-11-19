package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.graphics.vector.PathBuilder;
import androidx.compose.p013ui.graphics.vector.VectorKt;
import androidx.compose.p013ui.unit.C3156Dp;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
public final class PodcastsKt {
    private static ImageVector _podcasts;

    public static final ImageVector getPodcasts(Icons.Filled filled) {
        ImageVector imageVector = _podcasts;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Podcasts", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 0.74f, -0.4f, 1.38f, -1.0f, 1.72f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-8.28f);
        pathBuilder.curveToRelative(-0.6f, -0.35f, -1.0f, -0.98f, -1.0f, -1.72f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(14.0f, 10.9f, 14.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 6.0f);
        pathBuilder.curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
        pathBuilder.curveToRelative(0.0f, 1.74f, 0.75f, 3.31f, 1.94f, 4.4f);
        pathBuilder.lineToRelative(1.42f, -1.42f);
        pathBuilder.curveTo(8.53f, 14.25f, 8.0f, 13.19f, 8.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, 1.19f, -0.53f, 2.25f, -1.36f, 2.98f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder.curveTo(17.25f, 15.31f, 18.0f, 13.74f, 18.0f, 12.0f);
        pathBuilder.curveTo(18.0f, 8.69f, 15.31f, 6.0f, 12.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 2.85f, 1.2f, 5.41f, 3.11f, 7.24f);
        pathBuilder.lineToRelative(1.42f, -1.42f);
        pathBuilder.curveTo(4.98f, 16.36f, 4.0f, 14.29f, 4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -4.41f, 3.59f, -8.0f, 8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, 2.29f, -0.98f, 4.36f, -2.53f, 5.82f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder.curveTo(20.8f, 17.41f, 22.0f, 14.85f, 22.0f, 12.0f);
        pathBuilder.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _podcasts = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
