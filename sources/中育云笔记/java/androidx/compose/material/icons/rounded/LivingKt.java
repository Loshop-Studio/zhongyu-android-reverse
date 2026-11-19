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
public final class LivingKt {
    private static ImageVector _living;

    public static final ImageVector getLiving(Icons.Rounded rounded) {
        ImageVector imageVector = _living;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Living", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.5f, 11.5f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-7.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineTo(16.0f);
        pathBuilder.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilder.verticalLineToRelative(-3.5f);
        pathBuilder.curveTo(17.5f, 11.95f, 17.05f, 11.5f, 16.5f, 11.5f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(10.0f, 12.5f);
        pathBuilder2.verticalLineTo(13.0f);
        pathBuilder2.horizontalLineToRelative(4.0f);
        pathBuilder2.verticalLineToRelative(-0.5f);
        pathBuilder2.curveToRelative(0.0f, -1.3f, 0.99f, -2.35f, 2.25f, -2.47f);
        pathBuilder2.verticalLineTo(9.0f);
        pathBuilder2.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder2.horizontalLineToRelative(-5.5f);
        pathBuilder2.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilder2.verticalLineToRelative(1.03f);
        pathBuilder2.curveTo(9.01f, 10.15f, 10.0f, 11.2f, 10.0f, 12.5f);
        pathBuilder2.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw3 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk83 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(20.0f, 2.0f);
        pathBuilder3.horizontalLineTo(4.0f);
        pathBuilder3.curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        pathBuilder3.verticalLineToRelative(16.0f);
        pathBuilder3.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder3.horizontalLineToRelative(16.0f);
        pathBuilder3.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder3.verticalLineTo(4.0f);
        pathBuilder3.curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(19.0f, 16.0f);
        pathBuilder3.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder3.horizontalLineTo(7.0f);
        pathBuilder3.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder3.verticalLineToRelative(-3.5f);
        pathBuilder3.curveToRelative(0.0f, -0.92f, 0.51f, -1.72f, 1.25f, -2.15f);
        pathBuilder3.verticalLineTo(9.0f);
        pathBuilder3.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder3.horizontalLineToRelative(5.5f);
        pathBuilder3.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder3.verticalLineToRelative(1.35f);
        pathBuilder3.curveTo(18.49f, 10.78f, 19.0f, 11.58f, 19.0f, 12.5f);
        pathBuilder3.verticalLineTo(16.0f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw3, iM31241getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _living = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
