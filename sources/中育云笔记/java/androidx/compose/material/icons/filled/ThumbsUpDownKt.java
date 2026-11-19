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
public final class ThumbsUpDownKt {
    private static ImageVector _thumbsUpDown;

    public static final ImageVector getThumbsUpDown(Icons.Filled filled) {
        ImageVector imageVector = _thumbsUpDown;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ThumbsUpDown", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 6.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.lineTo(5.82f, 5.0f);
        pathBuilder.lineToRelative(0.66f, -3.18f);
        pathBuilder.lineToRelative(0.02f, -0.23f);
        pathBuilder.curveToRelative(0.0f, -0.31f, -0.13f, -0.59f, -0.33f, -0.8f);
        pathBuilder.lineTo(5.38f, 0.0f);
        pathBuilder.lineTo(0.44f, 4.94f);
        pathBuilder.curveTo(0.17f, 5.21f, 0.0f, 5.59f, 0.0f, 6.0f);
        pathBuilder.verticalLineToRelative(6.5f);
        pathBuilder.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder.horizontalLineToRelative(6.75f);
        pathBuilder.curveToRelative(0.62f, 0.0f, 1.15f, -0.38f, 1.38f, -0.91f);
        pathBuilder.lineToRelative(2.26f, -5.29f);
        pathBuilder.curveToRelative(0.07f, -0.17f, 0.11f, -0.36f, 0.11f, -0.55f);
        pathBuilder.lineTo(12.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.5f, 10.0f);
        pathBuilder.horizontalLineToRelative(-6.75f);
        pathBuilder.curveToRelative(-0.62f, 0.0f, -1.15f, 0.38f, -1.38f, 0.91f);
        pathBuilder.lineToRelative(-2.26f, 5.29f);
        pathBuilder.curveToRelative(-0.07f, 0.17f, -0.11f, 0.36f, -0.11f, 0.55f);
        pathBuilder.lineTo(12.0f, 18.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(5.18f);
        pathBuilder.lineToRelative(-0.66f, 3.18f);
        pathBuilder.lineToRelative(-0.02f, 0.24f);
        pathBuilder.curveToRelative(0.0f, 0.31f, 0.13f, 0.59f, 0.33f, 0.8f);
        pathBuilder.lineToRelative(0.79f, 0.78f);
        pathBuilder.lineToRelative(4.94f, -4.94f);
        pathBuilder.curveToRelative(0.27f, -0.27f, 0.44f, -0.65f, 0.44f, -1.06f);
        pathBuilder.verticalLineToRelative(-6.5f);
        pathBuilder.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thumbsUpDown = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
