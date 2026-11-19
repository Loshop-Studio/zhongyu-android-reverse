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
public final class CribKt {
    private static ImageVector _crib;

    public static final ImageVector getCrib(Icons.Filled filled) {
        ImageVector imageVector = _crib;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Crib", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.curveTo(5.79f, 4.0f, 4.0f, 5.79f, 4.0f, 8.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.93f);
        pathBuilder.curveToRelative(-0.61f, -0.35f, -1.16f, -0.78f, -1.65f, -1.27f);
        pathBuilder.lineToRelative(-1.42f, 1.42f);
        pathBuilder.curveTo(6.74f, 20.88f, 9.24f, 22.0f, 12.0f, 22.0f);
        pathBuilder.curveToRelative(2.76f, 0.0f, 5.26f, -1.12f, 7.07f, -2.93f);
        pathBuilder.lineToRelative(-1.42f, -1.42f);
        pathBuilder.curveToRelative(-0.49f, 0.49f, -1.05f, 0.92f, -1.65f, 1.27f);
        pathBuilder.verticalLineTo(16.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveTo(20.0f, 9.9f, 19.1f, 9.0f, 18.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 19.75f);
        pathBuilder.curveTo(13.36f, 19.91f, 12.69f, 20.0f, 12.0f, 20.0f);
        pathBuilder.curveToRelative(-0.69f, 0.0f, -1.36f, -0.09f, -2.0f, -0.25f);
        pathBuilder.verticalLineTo(16.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineTo(19.75f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _crib = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
