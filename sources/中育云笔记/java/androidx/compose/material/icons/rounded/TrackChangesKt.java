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
public final class TrackChangesKt {
    private static ImageVector _trackChanges;

    public static final ImageVector getTrackChanges(Icons.Rounded rounded) {
        ImageVector imageVector = _trackChanges;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TrackChanges", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.32f, 5.68f);
        pathBuilder.curveToRelative(-0.36f, 0.36f, -0.39f, 0.92f, -0.07f, 1.32f);
        pathBuilder.curveToRelative(1.45f, 1.82f, 2.21f, 4.31f, 1.53f, 6.92f);
        pathBuilder.curveToRelative(-0.79f, 3.05f, -3.18f, 5.33f, -6.21f, 5.94f);
        pathBuilder.curveTo(8.47f, 20.87f, 4.0f, 16.93f, 4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -4.08f, 3.05f, -7.44f, 7.0f, -7.93f);
        pathBuilder.verticalLineToRelative(2.02f);
        pathBuilder.curveToRelative(-3.13f, 0.53f, -5.43f, 3.46f, -4.93f, 6.83f);
        pathBuilder.curveToRelative(0.39f, 2.61f, 2.56f, 4.71f, 5.18f, 5.03f);
        pathBuilder.curveTo(14.89f, 18.4f, 18.0f, 15.56f, 18.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.25f, -0.38f, -2.4f, -1.03f, -3.36f);
        pathBuilder.curveToRelative(-0.34f, -0.5f, -1.07f, -0.53f, -1.5f, -0.11f);
        pathBuilder.lineToRelative(-0.01f, 0.01f);
        pathBuilder.curveToRelative(-0.34f, 0.34f, -0.37f, 0.87f, -0.11f, 1.27f);
        pathBuilder.curveToRelative(0.6f, 0.92f, 0.84f, 2.1f, 0.49f, 3.32f);
        pathBuilder.curveToRelative(-0.39f, 1.37f, -1.54f, 2.46f, -2.94f, 2.77f);
        pathBuilder.curveToRelative(-2.6f, 0.57f, -4.9f, -1.39f, -4.9f, -3.9f);
        pathBuilder.curveToRelative(0.0f, -1.86f, 1.28f, -3.41f, 3.0f, -3.86f);
        pathBuilder.verticalLineToRelative(2.14f);
        pathBuilder.curveToRelative(-0.6f, 0.35f, -1.0f, 0.98f, -1.0f, 1.72f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -0.74f, -0.4f, -1.38f, -1.0f, -1.72f);
        pathBuilder.verticalLineTo(2.71f);
        pathBuilder.curveToRelative(0.0f, -0.39f, -0.32f, -0.71f, -0.71f, -0.71f);
        pathBuilder.curveToRelative(-5.36f, -0.2f, -9.98f, 4.06f, -10.27f, 9.4f);
        pathBuilder.curveToRelative(-0.36f, 6.55f, 5.41f, 11.82f, 12.01f, 10.4f);
        pathBuilder.curveToRelative(3.88f, -0.83f, 6.88f, -3.8f, 7.75f, -7.67f);
        pathBuilder.curveToRelative(0.71f, -3.16f, -0.2f, -6.16f, -1.97f, -8.37f);
        pathBuilder.curveToRelative(-0.37f, -0.47f, -1.07f, -0.5f, -1.49f, -0.08f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _trackChanges = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
