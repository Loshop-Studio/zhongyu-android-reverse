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
public final class PersonOutlineKt {
    private static ImageVector _personOutline;

    public static final ImageVector getPersonOutline(Icons.TwoTone twoTone) {
        ImageVector imageVector = _personOutline;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PersonOutline", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 8.0f);
        pathBuilder.moveToRelative(-2.1f, 0.0f);
        pathBuilder.arcToRelative(2.1f, 2.1f, 0.0f, true, true, 4.2f, 0.0f);
        pathBuilder.arcToRelative(2.1f, 2.1f, 0.0f, true, true, -4.2f, 0.0f);
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 14.9f);
        pathBuilder2.curveToRelative(-2.97f, 0.0f, -6.1f, 1.46f, -6.1f, 2.1f);
        pathBuilder2.verticalLineToRelative(1.1f);
        pathBuilder2.horizontalLineToRelative(12.2f);
        pathBuilder2.verticalLineTo(17.0f);
        pathBuilder2.curveToRelative(0.0f, -0.64f, -3.13f, -2.1f, -6.1f, -2.1f);
        pathBuilder2.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw3 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk83 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.0f, 13.0f);
        pathBuilder3.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        pathBuilder3.verticalLineToRelative(3.0f);
        pathBuilder3.horizontalLineToRelative(16.0f);
        pathBuilder3.verticalLineToRelative(-3.0f);
        pathBuilder3.curveToRelative(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(18.1f, 18.1f);
        pathBuilder3.lineTo(5.9f, 18.1f);
        pathBuilder3.lineTo(5.9f, 17.0f);
        pathBuilder3.curveToRelative(0.0f, -0.64f, 3.13f, -2.1f, 6.1f, -2.1f);
        pathBuilder3.reflectiveCurveToRelative(6.1f, 1.46f, 6.1f, 2.1f);
        pathBuilder3.verticalLineToRelative(1.1f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.0f, 12.0f);
        pathBuilder3.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder3.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder3.reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder3.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(12.0f, 5.9f);
        pathBuilder3.curveToRelative(1.16f, 0.0f, 2.1f, 0.94f, 2.1f, 2.1f);
        pathBuilder3.curveToRelative(0.0f, 1.16f, -0.94f, 2.1f, -2.1f, 2.1f);
        pathBuilder3.reflectiveCurveTo(9.9f, 9.16f, 9.9f, 8.0f);
        pathBuilder3.curveToRelative(0.0f, -1.16f, 0.94f, -2.1f, 2.1f, -2.1f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw3, iM31241getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _personOutline = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
