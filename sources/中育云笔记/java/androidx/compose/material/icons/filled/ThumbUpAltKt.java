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
public final class ThumbUpAltKt {
    private static ImageVector _thumbUpAlt;

    public static final ImageVector getThumbUpAlt(Icons.Filled filled) {
        ImageVector imageVector = _thumbUpAlt;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ThumbUpAlt", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-9.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.lineTo(2.0f, 9.0f);
        pathBuilder.verticalLineToRelative(11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.83f, 12.88f);
        pathBuilder.curveToRelative(0.11f, -0.25f, 0.17f, -0.52f, 0.17f, -0.8f);
        pathBuilder.lineTo(22.0f, 11.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(-5.5f);
        pathBuilder.lineToRelative(0.92f, -4.65f);
        pathBuilder.curveToRelative(0.05f, -0.22f, 0.02f, -0.46f, -0.08f, -0.66f);
        pathBuilder.curveToRelative(-0.23f, -0.45f, -0.52f, -0.86f, -0.88f, -1.22f);
        pathBuilder.lineTo(14.0f, 2.0f);
        pathBuilder.lineTo(7.59f, 8.41f);
        pathBuilder.curveTo(7.21f, 8.79f, 7.0f, 9.3f, 7.0f, 9.83f);
        pathBuilder.verticalLineToRelative(7.84f);
        pathBuilder.curveTo(7.0f, 18.95f, 8.05f, 20.0f, 9.34f, 20.0f);
        pathBuilder.horizontalLineToRelative(8.11f);
        pathBuilder.curveToRelative(0.7f, 0.0f, 1.36f, -0.37f, 1.72f, -0.97f);
        pathBuilder.lineToRelative(2.66f, -6.15f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thumbUpAlt = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
