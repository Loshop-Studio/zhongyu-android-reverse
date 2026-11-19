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
public final class Person4Kt {
    private static ImageVector _person4;

    public static final ImageVector getPerson4(Icons.Filled filled) {
        ImageVector imageVector = _person4;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Person4", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.39f, 14.56f);
        pathBuilder.curveTo(16.71f, 13.7f, 14.53f, 13.0f, 12.0f, 13.0f);
        pathBuilder.curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f);
        pathBuilder.curveTo(4.61f, 15.07f, 4.0f, 16.1f, 4.0f, 17.22f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineToRelative(-2.78f);
        pathBuilder.curveTo(20.0f, 16.1f, 19.39f, 15.07f, 18.39f, 14.56f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 12.0f);
        pathBuilder2.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder2.curveToRelative(0.0f, -1.37f, 0.0f, -3.5f, 0.0f, -3.5f);
        pathBuilder2.curveTo(16.0f, 3.67f, 15.33f, 3.0f, 14.5f, 3.0f);
        pathBuilder2.curveToRelative(-0.52f, 0.0f, -0.98f, 0.27f, -1.25f, 0.67f);
        pathBuilder2.curveTo(12.98f, 3.27f, 12.52f, 3.0f, 12.0f, 3.0f);
        pathBuilder2.reflectiveCurveToRelative(-0.98f, 0.27f, -1.25f, 0.67f);
        pathBuilder2.curveTo(10.48f, 3.27f, 10.02f, 3.0f, 9.5f, 3.0f);
        pathBuilder2.curveTo(8.67f, 3.0f, 8.0f, 3.67f, 8.0f, 4.5f);
        pathBuilder2.curveToRelative(0.0f, 0.0f, 0.0f, 2.12f, 0.0f, 3.5f);
        pathBuilder2.curveTo(8.0f, 10.21f, 9.79f, 12.0f, 12.0f, 12.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _person4 = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
