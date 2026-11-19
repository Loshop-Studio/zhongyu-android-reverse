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
public final class SmokeFreeKt {
    private static ImageVector _smokeFree;

    public static final ImageVector getSmokeFree(Icons.Filled filled) {
        ImageVector imageVector = _smokeFree;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SmokeFree", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.0f, 6.0f);
        pathBuilder.lineToRelative(6.99f, 7.0f);
        pathBuilder.lineTo(2.0f, 13.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(9.99f);
        pathBuilder.lineToRelative(7.0f, 7.0f);
        pathBuilder.lineToRelative(1.26f, -1.25f);
        pathBuilder.lineToRelative(-17.0f, -17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.5f, 13.0f);
        pathBuilder.lineTo(22.0f, 13.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.lineTo(18.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.85f, 4.88f);
        pathBuilder.curveToRelative(0.62f, -0.61f, 1.0f, -1.45f, 1.0f, -2.38f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.curveToRelative(0.0f, 1.02f, -0.83f, 1.85f, -1.85f, 1.85f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.curveToRelative(2.24f, 0.0f, 4.0f, 1.83f, 4.0f, 4.07f);
        pathBuilder.lineTo(20.5f, 12.0f);
        pathBuilder.lineTo(22.0f, 12.0f);
        pathBuilder.lineTo(22.0f, 9.92f);
        pathBuilder.curveToRelative(0.0f, -2.23f, -1.28f, -4.15f, -3.15f, -5.04f);
        pathBuilder.close();
        pathBuilder.moveTo(14.5f, 8.7f);
        pathBuilder.horizontalLineToRelative(1.53f);
        pathBuilder.curveToRelative(1.05f, 0.0f, 1.97f, 0.74f, 1.97f, 2.05f);
        pathBuilder.lineTo(18.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.verticalLineToRelative(-1.59f);
        pathBuilder.curveToRelative(0.0f, -1.8f, -1.6f, -3.16f, -3.47f, -3.16f);
        pathBuilder.lineTo(14.5f, 7.25f);
        pathBuilder.curveToRelative(-1.02f, 0.0f, -1.85f, -0.98f, -1.85f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.83f, -1.75f, 1.85f, -1.75f);
        pathBuilder.lineTo(14.5f, 2.0f);
        pathBuilder.curveToRelative(-1.85f, 0.0f, -3.35f, 1.5f, -3.35f, 3.35f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 3.35f, 3.35f, 3.35f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 15.93f);
        pathBuilder.lineTo(17.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(-2.93f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _smokeFree = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
