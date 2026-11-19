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
public final class CachedKt {
    private static ImageVector _cached;

    public static final ImageVector getCached(Icons.Rounded rounded) {
        ImageVector imageVector = _cached;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Cached", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.65f, 8.35f);
        pathBuilder.lineToRelative(-2.79f, 2.79f);
        pathBuilder.curveToRelative(-0.32f, 0.32f, -0.1f, 0.86f, 0.35f, 0.86f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilder.curveToRelative(-0.79f, 0.0f, -1.56f, -0.15f, -2.25f, -0.44f);
        pathBuilder.curveToRelative(-0.36f, -0.15f, -0.77f, -0.04f, -1.04f, 0.23f);
        pathBuilder.curveToRelative(-0.51f, 0.51f, -0.33f, 1.37f, 0.34f, 1.64f);
        pathBuilder.curveToRelative(0.91f, 0.37f, 1.91f, 0.57f, 2.95f, 0.57f);
        pathBuilder.curveToRelative(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(1.79f);
        pathBuilder.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        pathBuilder.lineToRelative(-2.79f, -2.79f);
        pathBuilder.curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.7f, -0.01f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilder.curveToRelative(0.79f, 0.0f, 1.56f, 0.15f, 2.25f, 0.44f);
        pathBuilder.curveToRelative(0.36f, 0.15f, 0.77f, 0.04f, 1.04f, -0.23f);
        pathBuilder.curveToRelative(0.51f, -0.51f, 0.33f, -1.37f, -0.34f, -1.64f);
        pathBuilder.curveTo(14.04f, 4.2f, 13.04f, 4.0f, 12.0f, 4.0f);
        pathBuilder.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        pathBuilder.horizontalLineTo(2.21f);
        pathBuilder.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        pathBuilder.lineToRelative(2.79f, 2.79f);
        pathBuilder.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilder.lineToRelative(2.79f, -2.79f);
        pathBuilder.curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.36f, -0.85f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cached = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
