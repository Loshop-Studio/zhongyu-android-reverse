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
public final class EarbudsKt {
    private static ImageVector _earbuds;

    public static final ImageVector getEarbuds(Icons.Filled filled) {
        ImageVector imageVector = _earbuds;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Earbuds", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.2f, 3.01f);
        pathBuilder.curveTo(4.44f, 2.89f, 3.0f, 4.42f, 3.0f, 6.19f);
        pathBuilder.lineTo(3.0f, 16.0f);
        pathBuilder.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.lineToRelative(-0.83f, 0.0f);
        pathBuilder.curveToRelative(-1.61f, 0.0f, -3.06f, 1.18f, -3.17f, 2.79f);
        pathBuilder.curveToRelative(-0.12f, 1.69f, 1.16f, 3.1f, 2.8f, 3.21f);
        pathBuilder.curveToRelative(1.76f, 0.12f, 3.2f, -1.42f, 3.2f, -3.18f);
        pathBuilder.lineTo(21.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.lineToRelative(0.83f, 0.0f);
        pathBuilder.curveTo(7.44f, 9.0f, 8.89f, 7.82f, 9.0f, 6.21f);
        pathBuilder.curveTo(9.11f, 4.53f, 7.83f, 3.11f, 6.2f, 3.01f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _earbuds = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
