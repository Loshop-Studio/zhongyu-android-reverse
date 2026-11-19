package androidx.compose.material.icons.outlined;

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
public final class JoinInnerKt {
    private static ImageVector _joinInner;

    public static final ImageVector getJoinInner(Icons.Outlined outlined) {
        ImageVector imageVector = _joinInner;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.JoinInner", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 12.0f);
        pathBuilder.arcToRelative(3.0f, 5.74f, 0.0f, true, false, 6.0f, 0.0f);
        pathBuilder.arcToRelative(3.0f, 5.74f, 0.0f, true, false, -6.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(9.04f, 16.87f);
        pathBuilder2.curveTo(8.71f, 16.95f, 8.36f, 17.0f, 8.0f, 17.0f);
        pathBuilder2.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilder2.reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f);
        pathBuilder2.curveToRelative(0.36f, 0.0f, 0.71f, 0.05f, 1.04f, 0.13f);
        pathBuilder2.curveToRelative(0.39f, -0.56f, 0.88f, -1.12f, 1.49f, -1.63f);
        pathBuilder2.curveTo(9.75f, 5.19f, 8.9f, 5.0f, 8.0f, 5.0f);
        pathBuilder2.curveToRelative(-3.86f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f);
        pathBuilder2.reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f);
        pathBuilder2.curveToRelative(0.9f, 0.0f, 1.75f, -0.19f, 2.53f, -0.5f);
        pathBuilder2.curveTo(9.92f, 17.99f, 9.43f, 17.43f, 9.04f, 16.87f);
        pathBuilder2.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw3 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk83 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(16.0f, 5.0f);
        pathBuilder3.curveToRelative(-0.9f, 0.0f, -1.75f, 0.19f, -2.53f, 0.5f);
        pathBuilder3.curveToRelative(0.61f, 0.51f, 1.1f, 1.07f, 1.49f, 1.63f);
        pathBuilder3.curveTo(15.29f, 7.05f, 15.64f, 7.0f, 16.0f, 7.0f);
        pathBuilder3.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder3.reflectiveCurveToRelative(-2.24f, 5.0f, -5.0f, 5.0f);
        pathBuilder3.curveToRelative(-0.36f, 0.0f, -0.71f, -0.05f, -1.04f, -0.13f);
        pathBuilder3.curveToRelative(-0.39f, 0.56f, -0.88f, 1.12f, -1.49f, 1.63f);
        pathBuilder3.curveTo(14.25f, 18.81f, 15.1f, 19.0f, 16.0f, 19.0f);
        pathBuilder3.curveToRelative(3.86f, 0.0f, 7.0f, -3.14f, 7.0f, -7.0f);
        pathBuilder3.reflectiveCurveTo(19.86f, 5.0f, 16.0f, 5.0f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw3, iM31241getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _joinInner = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
