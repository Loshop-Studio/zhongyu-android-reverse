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
public final class AllInclusiveKt {
    private static ImageVector _allInclusive;

    public static final ImageVector getAllInclusive(Icons.Rounded rounded) {
        ImageVector imageVector = _allInclusive;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AllInclusive", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.22f, 6.86f);
        pathBuilder.curveToRelative(-2.0f, -0.6f, -4.06f, -0.04f, -5.39f, 1.29f);
        pathBuilder.lineTo(12.0f, 10.66f);
        pathBuilder.lineTo(10.48f, 12.0f);
        pathBuilder.horizontalLineToRelative(0.01f);
        pathBuilder.lineTo(7.8f, 14.39f);
        pathBuilder.curveToRelative(-0.81f, 0.81f, -1.95f, 1.15f, -3.12f, 0.92f);
        pathBuilder.curveToRelative(-1.25f, -0.25f, -2.28f, -1.25f, -2.57f, -2.49f);
        pathBuilder.curveToRelative(-0.52f, -2.23f, 1.16f, -4.2f, 3.29f, -4.2f);
        pathBuilder.curveToRelative(0.91f, 0.0f, 1.76f, 0.35f, 2.44f, 1.03f);
        pathBuilder.lineToRelative(0.47f, 0.41f);
        pathBuilder.curveToRelative(0.38f, 0.34f, 0.95f, 0.34f, 1.33f, 0.0f);
        pathBuilder.curveToRelative(0.45f, -0.4f, 0.45f, -1.1f, 0.0f, -1.5f);
        pathBuilder.lineToRelative(-0.42f, -0.36f);
        pathBuilder.curveTo(8.2f, 7.18f, 6.84f, 6.62f, 5.4f, 6.62f);
        pathBuilder.curveTo(2.42f, 6.62f, 0.0f, 9.04f, 0.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(2.42f, 5.38f, 5.4f, 5.38f);
        pathBuilder.curveToRelative(1.44f, 0.0f, 2.8f, -0.56f, 3.77f, -1.53f);
        pathBuilder.lineToRelative(2.83f, -2.5f);
        pathBuilder.lineToRelative(0.01f, 0.01f);
        pathBuilder.lineTo(13.52f, 12.0f);
        pathBuilder.horizontalLineToRelative(-0.01f);
        pathBuilder.lineToRelative(2.69f, -2.39f);
        pathBuilder.curveToRelative(0.81f, -0.81f, 1.95f, -1.15f, 3.12f, -0.92f);
        pathBuilder.curveToRelative(1.25f, 0.25f, 2.28f, 1.25f, 2.57f, 2.49f);
        pathBuilder.curveToRelative(0.52f, 2.23f, -1.16f, 4.2f, -3.29f, 4.2f);
        pathBuilder.curveToRelative(-0.9f, 0.0f, -1.76f, -0.35f, -2.44f, -1.03f);
        pathBuilder.lineToRelative(-0.48f, -0.42f);
        pathBuilder.curveToRelative(-0.38f, -0.34f, -0.95f, -0.34f, -1.33f, 0.0f);
        pathBuilder.curveToRelative(-0.45f, 0.4f, -0.45f, 1.1f, 0.0f, 1.5f);
        pathBuilder.lineToRelative(0.42f, 0.37f);
        pathBuilder.curveToRelative(1.02f, 1.01f, 2.37f, 1.57f, 3.82f, 1.57f);
        pathBuilder.curveToRelative(3.27f, 0.0f, 5.86f, -2.9f, 5.33f, -6.25f);
        pathBuilder.curveToRelative(-0.3f, -1.99f, -1.77f, -3.69f, -3.7f, -4.26f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _allInclusive = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
