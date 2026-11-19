package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class LocalLibraryKt {
    private static ImageVector _localLibrary;

    public static final ImageVector getLocalLibrary(Icons.TwoTone twoTone) {
        ImageVector imageVector = _localLibrary;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.LocalLibrary", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 17.13f);
        pathBuilder.verticalLineToRelative(-6.95f);
        pathBuilder.curveToRelative(-2.1f, 0.38f, -4.05f, 1.35f, -5.64f, 2.83f);
        pathBuilder.lineTo(12.0f, 14.28f);
        pathBuilder.lineToRelative(-1.36f, -1.27f);
        pathBuilder.curveTo(9.05f, 11.53f, 7.1f, 10.56f, 5.0f, 10.18f);
        pathBuilder.verticalLineToRelative(6.95f);
        pathBuilder.curveToRelative(2.53f, 0.34f, 4.94f, 1.3f, 7.0f, 2.83f);
        pathBuilder.curveToRelative(2.07f, -1.52f, 4.47f, -2.49f, 7.0f, -2.83f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 5.0f);
        pathBuilder2.moveToRelative(-2.0f, 0.0f);
        pathBuilder2.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        pathBuilder2.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw3 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk83 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(16.0f, 5.0f);
        pathBuilder3.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder3.reflectiveCurveTo(8.0f, 2.79f, 8.0f, 5.0f);
        pathBuilder3.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder3.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(10.0f, 5.0f);
        pathBuilder3.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder3.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder3.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder3.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(3.0f, 19.0f);
        pathBuilder3.curveToRelative(3.48f, 0.0f, 6.64f, 1.35f, 9.0f, 3.55f);
        pathBuilder3.curveToRelative(2.36f, -2.19f, 5.52f, -3.55f, 9.0f, -3.55f);
        pathBuilder3.lineTo(21.0f, 8.0f);
        pathBuilder3.curveToRelative(-3.48f, 0.0f, -6.64f, 1.35f, -9.0f, 3.55f);
        pathBuilder3.curveTo(9.64f, 9.35f, 6.48f, 8.0f, 3.0f, 8.0f);
        pathBuilder3.verticalLineToRelative(11.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(5.0f, 10.18f);
        pathBuilder3.curveToRelative(2.1f, 0.38f, 4.05f, 1.35f, 5.64f, 2.83f);
        pathBuilder3.lineTo(12.0f, 14.28f);
        pathBuilder3.lineToRelative(1.36f, -1.27f);
        pathBuilder3.curveToRelative(1.59f, -1.48f, 3.54f, -2.45f, 5.64f, -2.83f);
        pathBuilder3.verticalLineToRelative(6.95f);
        pathBuilder3.curveToRelative(-2.53f, 0.34f, -4.93f, 1.3f, -7.0f, 2.82f);
        pathBuilder3.curveToRelative(-2.06f, -1.52f, -4.47f, -2.49f, -7.0f, -2.83f);
        pathBuilder3.verticalLineToRelative(-6.94f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw3, iM31241getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localLibrary = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
